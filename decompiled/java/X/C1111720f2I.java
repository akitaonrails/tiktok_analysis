package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.gift.GiftService;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.zhiliaoapp.musically.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0f2I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1111720f2I extends AbstractC21673619ry<AbstractC1111750f2L<? extends InterfaceC1112060f2q>> {
    public final List<InterfaceC1112060f2q> LL;

    @Override // X.AbstractC21673619ry
    public final int getItemCount() {
        return this.LL.size();
    }

    public C1111720f2I(List list) {
        this.LL = list;
    }

    @Override // X.AbstractC21673619ry
    public final int getItemViewType(int i) {
        Object obj = ListProtector.get(this.LL, i);
        if (obj instanceof C1110170ezn) {
            return 3;
        }
        if (obj instanceof C1111000f18) {
            return 4;
        }
        if (!(obj instanceof C234500vP) && !(obj instanceof C180400mg) && !(obj instanceof C239500wD) && !(obj instanceof C245000x6) && !(obj instanceof C239700wF) && !(obj instanceof C176500m3)) {
            return 2;
        }
        return 1;
    }

    @Override // X.AbstractC21673619ry
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        int i2;
        StringBuilder sbLIZ;
        String strLIZIZ;
        String str;
        String strValueOf;
        AbstractC1111750f2L abstractC1111750f2L = (AbstractC1111750f2L) viewHolder;
        InterfaceC1112060f2q interfaceC1112060f2q = (InterfaceC1112060f2q) ListProtector.get(this.LL, i);
        if (abstractC1111750f2L instanceof C1111760f2M) {
            C1111760f2M c1111760f2M = (C1111760f2M) abstractC1111750f2L;
            AbstractC1110520f0M abstractC1110520f0M = (AbstractC1110520f0M) interfaceC1112060f2q;
            c1111760f2M.LLILLJJLI.setText(abstractC1110520f0M.LLJLL());
            TextView textView = c1111760f2M.LL;
            CharSequence content = abstractC1110520f0M.getContent();
            if (content != null) {
                C786410Ut5.LLIL(textView, 0);
                textView.setText(content);
            } else {
                C786410Ut5.LLIL(textView, 8);
            }
            Collection<AbstractC498530Jgp<? extends AbstractC521080Kc6>> collectionLLJLILLLLZIIL = abstractC1110520f0M.LLJLILLLLZIIL();
            if (collectionLLJLILLLLZIIL.isEmpty()) {
                C786410Ut5.LLJZ(c1111760f2M.LLILLL, 8);
                return;
            } else {
                c1111760f2M.LLILLL.setBadges(C19719512Dh.LIZIZ(collectionLLJLILLLLZIIL));
                C786410Ut5.LLJZ(c1111760f2M.LLILLL, 0);
                return;
            }
        }
        if (abstractC1111750f2L instanceof C1111730f2J) {
            ((C1111730f2J) abstractC1111750f2L).I5(interfaceC1112060f2q);
            return;
        }
        if (abstractC1111750f2L instanceof C1111740f2K) {
            C1111740f2K c1111740f2K = (C1111740f2K) abstractC1111750f2L;
            C1111770f2N c1111770f2N = (C1111770f2N) interfaceC1112060f2q;
            c1111740f2K.getClass();
            GiftMessage giftMessage = (GiftMessage) c1111770f2N.LJIL;
            Gift giftFindGiftById = GiftService.LLILLJJLI.findGiftById(giftMessage.giftId);
            if (giftFindGiftById == null) {
                giftFindGiftById = giftMessage.mGift;
            }
            Gift gift = giftMessage.mGift;
            if (gift != null) {
                i2 = gift.diamondCount;
            } else {
                i2 = 0;
            }
            int i3 = i2 * giftMessage.comboCount;
            TextView textView2 = c1111740f2K.LL;
            String str2 = "";
            if (TextUtils.isEmpty(c1111770f2N.LJJIFFI)) {
                String strLIZ = C0KVU.LIZ(c1111770f2N.getUser());
                c1111770f2N.LJJIFFI = strLIZ;
                if (TextUtils.isEmpty(strLIZ)) {
                    Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                    HashMap map = new HashMap();
                    CommonMessageData commonMessageData = c1111770f2N.LJIL.baseMessage;
                    if (commonMessageData == null) {
                        strValueOf = "";
                    } else {
                        strValueOf = String.valueOf(commonMessageData.messageId);
                    }
                    map.put("message_id", strValueOf);
                    if (c1111770f2N.getUser() == null) {
                        map.put("reason", "User is null.");
                    } else if (room == null) {
                        map.put("reason", "Room is null.");
                    } else {
                        User user = c1111770f2N.getUser();
                        if (user != null && room.getOwnerUserId() == user.getId() && TextUtils.isEmpty(C0KVU.LJ(c1111770f2N.getUser()))) {
                            map.put("reason", "User is anchor, but displayId is empty.");
                        } else if (room.getNameMode() == 1 && TextUtils.isEmpty(C0KVU.LIZLLL(c1111770f2N.getUser()))) {
                            map.put("reason", "User is audience and display nickname, but nickname is empty.");
                        } else if (TextUtils.isEmpty(C0KVU.LJ(c1111770f2N.getUser()))) {
                            map.put("reason", "User is audience, but displayId is empty.");
                        }
                    }
                    C1143300frE.LJIIJJI().LIZIZ("ttlive_text_message_not_display_name", map);
                }
            }
            textView2.setText(c1111770f2N.LJJIFFI);
            TextView textView3 = c1111740f2K.LLILLJJLI;
            ImageModel imageModel = null;
            if (giftFindGiftById != null && (str = giftFindGiftById.describe) != null) {
                str2 = str;
            }
            textView3.setText(str2);
            boolean z = giftMessage.isFirstSendGift;
            if (z) {
                C12ES.LJIILL(0, c1111740f2K.LLILZIL);
                c1111740f2K.LLILZIL.setBackground(C783480UoM.LIZJ(i3, C497740JfY.LJII()));
            } else {
                C439101nJ.LJI(c1111740f2K.LLILZIL);
            }
            if (C497740JfY.LJJ()) {
                C786410Ut5.Ob(c1111740f2K.LLIZ, -1.0f);
            }
            c1111740f2K.LLIZ.setBackground(C783480UoM.LIZ(i3, 8, C497740JfY.LJII(), z));
            String strValueOf2 = String.valueOf(giftMessage.comboCount);
            if (C497740JfY.LJJ()) {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(' ');
                sbLIZ.append(strValueOf2);
            } else {
                sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strValueOf2);
                sbLIZ.append(' ');
            }
            c1111740f2K.LLILZ.setText(C2188811AlT.LIZIZ(sbLIZ));
            c1111740f2K.LLILZ.setTypeface(C1119920fFW.LIZJ(c1111740f2K.LLILZ.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c1111740f2K.itemView.getContext()), 2);
            String strLJIJI = C497740JfY.LJIJI(2131841686);
            TextView textView4 = c1111740f2K.LLILZIL;
            if (C497740JfY.LJJ()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(' ');
                sbLIZ2.append(strLJIJI);
                sbLIZ2.append(' ');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            } else {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLJIJI);
                sbLIZ3.append(' ');
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
            }
            textView4.setText(strLIZIZ);
            c1111740f2K.LLILZIL.setTypeface(C1119920fFW.LIZJ(c1111740f2K.LLILZIL.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c1111740f2K.itemView.getContext()), 2);
            String strLJIJI2 = C497740JfY.LJIJI(2131844583);
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLJIJI2);
            sbLIZ4.append(' ');
            c1111740f2K.LLILZLL.setText(C2188811AlT.LIZIZ(sbLIZ4));
            c1111740f2K.LLILZLL.setTypeface(C1119920fFW.LIZJ(c1111740f2K.LLILZLL.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c1111740f2K.itemView.getContext()), 2);
            C0JBN c0jbnLIZ = C1819620xS4.LIZ();
            if (giftFindGiftById != null) {
                imageModel = giftFindGiftById.image;
            }
            C1324610kZf c1324610kZfLJIIIZ = c0jbnLIZ.LJIIIZ(imageModel);
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJJI(c1111740f2K.LLILLL);
            c1111740f2K.LLILLJJLI.requestLayout();
            c1111740f2K.LLILLJJLI.invalidate();
            return;
        }
        abstractC1111750f2L.getClass();
    }

    @Override // X.AbstractC21673619ry
    public final RecyclerView.ViewHolder onCreateViewHolder(final ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder c1111730f2J;
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    c1111730f2J = new AbstractC1111750f2L<InterfaceC1112060f2q>(viewGroup) { // from class: X.0f2O
                    };
                } else {
                    c1111730f2J = new C1111740f2K(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqz, viewGroup, false));
                }
            } else {
                c1111730f2J = new C1111760f2M(viewGroup);
            }
        } else {
            c1111730f2J = new C1111730f2J(C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.gqx, viewGroup, false));
        }
        try {
            View view = c1111730f2J.itemView;
            if (view != null) {
                view.setTag(R.id.en4, C946803n0.LIZ(viewGroup));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        c1111730f2J.itemView.setTag(R.id.yh8, Integer.valueOf(viewGroup.hashCode()));
        try {
            if (c1111730f2J.itemView.getParent() != null) {
                try {
                    SettingsManager.LIZLLL().getClass();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                if (SettingsManager.LIZ("catch_onCreateViewHolder_crash", true)) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(c1111730f2J.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C1AF0.LIZJ(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) c1111730f2J.itemView.getParent();
                    if (viewGroup2 != null) {
                        C786410Ut5.LJJJLZIJ(c1111730f2J.itemView, viewGroup2);
                    }
                }
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2081408Dk.LIZ(e2);
            C2344809Gs.LIZ(e2);
        }
        C20612085q.LIZ = c1111730f2J.getClass().getName();
        return c1111730f2J;
    }
}
