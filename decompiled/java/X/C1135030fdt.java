package X;

import Y.AComparatorS36S0000000_17;
import Y.ALAdapterS12S0200000_17;
import android.animation.ObjectAnimator;
import android.os.Message;
import android.util.Property;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeDebuffChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleSmokeLastTargetChannel;
import com.bytedance.android.livesdk.model.Gift;
import com.bytedance.android.livesdk.model.message.GiftMessage;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.handler.WeakHandler;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import com.ss.android.ugc.effectmanager.common.ConcurrentHashSet;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS561S0100000_17;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fdt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1135030fdt implements InterfaceC465240IMg {
    public final DataChannel LL;
    public final long LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final Function0<Boolean> LLILZIL;
    public final Function0<Boolean> LLILZLL;
    public final long LLIZ;
    public final boolean LLIZLLLIL;
    public ConstraintLayout LLJ;
    public C1324720kZq LLJI;
    public C16F5 LLJIJIL;
    public ObjectAnimator LLJILJIL;
    public ObjectAnimator LLJILJILJ;
    public int LLJJIII;
    public int LLJJIJI;
    public int LLJJIJIIJIL;
    public int LLJJIJIL;
    public C1135810ff9 LLJJJIL;
    public EnumC1135050fdv LLJILLL = EnumC1135050fdv.HIDE;
    public int LLJJ = -1;
    public final LinkedList<C1135810ff9> LLJJI = new LinkedList<>();
    public float LLJJJ = 1.0f;
    public final C01GW LLJJJJ = C452501pT.LIZIZ(new AwS561S0100000_17(this, 468));

    public final void LIZJ() {
        this.LLJJIJIIJIL = 0;
        this.LLJJIJIL = 0;
        this.LLJJJIL = null;
        this.LLJJI.clear();
    }

    public final void LIZ() {
        ConstraintLayout constraintLayout = this.LLJ;
        if (constraintLayout == null) {
            return;
        }
        ObjectAnimator objectAnimator = this.LLJILJILJ;
        if ((objectAnimator == null || !objectAnimator.isStarted()) && constraintLayout.getAlpha() != this.LLJJJ) {
            constraintLayout.animate().alpha(this.LLJJJ).setDuration(300L).start();
        }
    }

    public final WeakHandler LJ() {
        return (WeakHandler) this.LLJJJJ.getValue();
    }

    public final void LJI() {
        ConstraintLayout constraintLayout;
        ConstraintLayout constraintLayout2 = this.LLJ;
        if (constraintLayout2 != null) {
            C786410Ut5.LJLLLLLL(8, constraintLayout2);
        }
        ConstraintLayout constraintLayout3 = this.LLJ;
        ViewParent parent = constraintLayout3 != null ? constraintLayout3.getParent() : null;
        if ((parent instanceof ConstraintLayout) && (constraintLayout = (ConstraintLayout) parent) != null) {
            C786410Ut5.LJJLI(this.LLJ, constraintLayout);
        }
        this.LLJJ = -1;
        LIZJ();
    }

    public final void LJIIJ() {
        if (this.LLIZ <= 0) {
            return;
        }
        LJ().sendEmptyMessageDelayed(100, this.LLIZ);
    }

    public final void LJIIJJI() {
        EnumC1135050fdv enumC1135050fdv = this.LLJILLL;
        if (enumC1135050fdv == EnumC1135050fdv.HIDE || enumC1135050fdv == EnumC1135050fdv.HIDING) {
            return;
        }
        LJ().removeMessages(100);
        LJ().removeMessages(200);
        ConstraintLayout constraintLayout = this.LLJ;
        if (constraintLayout != null) {
            this.LLJILJILJ = ObjectAnimator.ofFloat(constraintLayout, (Property<ConstraintLayout, Float>) View.ALPHA, constraintLayout.getAlpha(), 0.0f);
            ObjectAnimator objectAnimator = this.LLJILJILJ;
            if (objectAnimator != null) {
                objectAnimator.setDuration(300L);
                objectAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
                objectAnimator.addListener(new ALAdapterS12S0200000_17(this, constraintLayout, 27));
                C786410Ut5.Pd(objectAnimator);
            }
        }
    }

    public final void LJIIL() {
        C1135810ff9 c1135810ff9 = this.LLJJJIL;
        if (c1135810ff9 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateShownCombo; processing; it.repeatCount = ");
            sbLIZ.append(c1135810ff9.LJJLIIIJILLIZJL);
            sbLIZ.append("; tray repeatCount = ");
            sbLIZ.append(this.LLJJIII);
            C20441214yg.LIZIZ("GiftMatchTray", C2188811AlT.LIZIZ(sbLIZ));
            int i = this.LLJJIII;
            if (i >= c1135810ff9.LJJLIIIJILLIZJL) {
                return;
            }
            this.LLJJIII = i + 1;
            C16F5 c16f5 = this.LLJIJIL;
            if (c16f5 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append('x');
                sbLIZ2.append(this.LLJJIII);
                sbLIZ2.append(' ');
                c16f5.setText(C2188811AlT.LIZIZ(sbLIZ2));
            }
            c1135810ff9.LJJLIIIJJIZ = c1135810ff9.LJJLIIIJILLIZJL - this.LLJJIII;
            LJIIIZ(1);
            LJ().removeMessages(200);
            LJ().removeMessages(100);
            LJIIJ();
            if (this.LLJJIII < c1135810ff9.LJJLIIIJILLIZJL) {
                LJ().sendEmptyMessageDelayed(200, 400L);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("updateShownCombo; after: tray repeatCount ");
            sbLIZ3.append(this.LLJJIII);
            sbLIZ3.append("; pkEndRemainCount = ");
            sbLIZ3.append(c1135810ff9.LJJLIIIJJIZ);
            C20441214yg.LIZIZ("GiftMatchTray", C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    public final void LIZIZ(ConstraintLayout constraintLayout) {
        ViewParent parent;
        ConstraintLayout constraintLayout2;
        ConstraintLayout constraintLayout3 = this.LLJ;
        if (constraintLayout3 != null && Intrinsics.LJFF(constraintLayout3.getParent(), constraintLayout)) {
            C20441214yg.LIZIZ("GiftMatchTray", "attachViewWithAnchor; already attached to container, no-op");
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("attachViewWithAnchor; anchorViewId=");
        sbLIZ.append(0);
        sbLIZ.append(", topToBottom=");
        sbLIZ.append(false);
        sbLIZ.append(", marginDp=");
        sbLIZ.append(4);
        sbLIZ.append(", goneMarginDp=");
        sbLIZ.append(0);
        sbLIZ.append(", goneStartMarginDp=");
        sbLIZ.append(0);
        sbLIZ.append(", horizontalAnchorViewId=");
        sbLIZ.append(0);
        sbLIZ.append(", horizontalFallbackMarginStartDp=");
        sbLIZ.append(0);
        sbLIZ.append("; currentView=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", container=");
        sbLIZ.append(constraintLayout);
        sbLIZ.append(", currentParent=");
        ConstraintLayout constraintLayout4 = this.LLJ;
        ViewParent parent2 = null;
        if (constraintLayout4 != null) {
            parent = constraintLayout4.getParent();
        } else {
            parent = null;
        }
        sbLIZ.append(parent);
        C20441214yg.LIZIZ("GiftMatchTray", C2188811AlT.LIZIZ(sbLIZ));
        ConstraintLayout constraintLayout5 = this.LLJ;
        if (constraintLayout5 != null) {
            parent2 = constraintLayout5.getParent();
        }
        if ((parent2 instanceof ConstraintLayout) && (constraintLayout2 = (ConstraintLayout) parent2) != null) {
            C786410Ut5.LJJLI(this.LLJ, constraintLayout2);
        }
        LIZLLL(constraintLayout);
        ConstraintLayout constraintLayout6 = this.LLJ;
        if (constraintLayout6 == null) {
            return;
        }
        constraintLayout.addView(constraintLayout6);
        int iLIZ = C439101nJ.LIZ(4);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("attachViewWithAnchor legacy-path: requested anchorViewId=");
        sbLIZ2.append(0);
        sbLIZ2.append(" not in container (container=");
        sbLIZ2.append(constraintLayout);
        sbLIZ2.append(") → falling back to layout_profile / fl_anchor_info anchor");
        C20441214yg.LJIIIZ("GiftMatchTray", C2188811AlT.LIZIZ(sbLIZ2));
        int i = R.id.mdp;
        if (constraintLayout.findViewById(R.id.mdp) == null) {
            i = R.id.i2t;
        }
        C19MB c19mb = new C19MB();
        c19mb.LJII(constraintLayout);
        c19mb.LJIIIIZZ(constraintLayout6.getId(), 7, i, 7);
        c19mb.LJIIIZ(constraintLayout6.getId(), 4, i, 3, iLIZ);
        c19mb.LIZIZ(constraintLayout);
    }

    public final void LIZLLL(ConstraintLayout constraintLayout) {
        int i;
        if (this.LLJ != null) {
            return;
        }
        if (this.LLIZLLLIL) {
            if (this.LLILZ) {
                i = R.layout.huh;
            } else {
                i = R.layout.hug;
            }
        } else if (this.LLILZ) {
            i = R.layout.huf;
        } else {
            i = R.layout.hue;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) C786410Ut5.Td(C786410Ut5.ne(constraintLayout.getContext()), i, constraintLayout, false);
        this.LLJ = constraintLayout2;
        this.LLJI = (C1324720kZq) constraintLayout2.findViewById(R.id.qjp);
        this.LLJIJIL = (C16F5) constraintLayout2.findViewById(R.id.qjq);
        C16F5 c16f5 = this.LLJIJIL;
        if (c16f5 != null) {
            c16f5.setTypeface(C1119920fFW.LIZJ(c16f5.getTextSize(), OppoPermissionPopupMaskDelayExp.DEFAULT, c16f5.getContext()), 2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.Iterable, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v3, types: [X.13BV] */
    public final void LJII(C1135810ff9 c1135810ff9) {
        Object objGg0;
        List<C976480bWA> value;
        ?? arrayList;
        MutableLiveData<List<C976480bWA>> mutableLiveDataLJJJJIZL;
        DataChannel dataChannel = this.LL;
        Long l = null;
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(BattleSmokeDebuffChannel.class);
        } else {
            objGg0 = null;
        }
        if (objGg0 == EnumC919030a1V.EFFECTING) {
            DataChannel dataChannel2 = this.LL;
            if (dataChannel2 != null) {
                l = (Long) dataChannel2.gg0(BattleSmokeLastTargetChannel.class);
            }
            long j = this.LLILLJJLI;
            if (l == null || l.longValue() != j) {
                InterfaceC973730bRj interfaceC973730bRjYf2 = C1128450fTH.LIZJ.yf2(false);
                if (interfaceC973730bRjYf2 == null || (mutableLiveDataLJJJJIZL = interfaceC973730bRjYf2.LJJJJIZL()) == null || (value = mutableLiveDataLJJJJIZL.getValue()) == null) {
                    value = C13BV.INSTANCE;
                }
                if (!(value instanceof Collection) || !value.isEmpty()) {
                    Iterator<C976480bWA> it2 = value.iterator();
                    while (it2.hasNext()) {
                        List<C976800bWg> list = it2.next().LJFF;
                        if (list == null) {
                            arrayList = C13BV.INSTANCE;
                        } else {
                            arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
                            Iterator it3 = ((ArrayList) list).iterator();
                            while (it3.hasNext()) {
                                arrayList.add(Long.valueOf(((C976800bWg) it3.next()).LIZ));
                            }
                        }
                        if (!C13LP.LJJJJ(l, arrayList) || !arrayList.contains(Long.valueOf(this.LLILLJJLI))) {
                        }
                    }
                }
            }
            C20441214yg.LIZIZ("GiftMatchTray", "onMessage; return by smoke power-up");
            return;
        }
        LJIIIIZZ(c1135810ff9);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(X.C1135810ff9 r13) {
        /*
            Method dump skipped, instruction units count: 763
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1135030fdt.LJIIIIZZ(X.0ff9):void");
    }

    public final void LJIIIZ(int i) {
        Float fValueOf;
        Object obj;
        Object obj2;
        boolean z;
        Object obj3;
        Long lValueOf;
        Long lValueOf2;
        Object obj4;
        int i2;
        int i3;
        Integer numValueOf;
        Long lValueOf3;
        Long lValueOf4;
        CommonMessageData commonMessageData;
        Gift gift;
        CommonMessageData commonMessageData2;
        User user;
        C1135810ff9 c1135810ff9 = this.LLJJJIL;
        if (c1135810ff9 != null) {
            this.LLJJIJIIJIL += i;
            ConstraintLayout constraintLayout = this.LLJ;
            Long lValueOf5 = null;
            if (constraintLayout != null) {
                fValueOf = Float.valueOf(constraintLayout.getAlpha());
            } else {
                fValueOf = null;
            }
            int i4 = !Intrinsics.LIZLLL(fValueOf, 1.0f) ? 1 : 0;
            if (i4 != 0) {
                this.LLJJIJIL += i;
            }
            if (c1135810ff9.LJJJJZ != 9223372036854775806L) {
                int i5 = this.LLJJ;
                long jLIZ = C158B.LIZ();
                String desc = C1128450fTH.LJIIJ().getDesc();
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_opposite_gift_tray_show");
                String strValueOf = String.valueOf(UserService.getInstance().user().getCurrentUserId());
                DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
                Map map = (Map) dataChannelGlobal.gg0(C1148040fys.class);
                if (map != null) {
                    obj = map.get("anchor_id");
                } else {
                    obj = null;
                }
                c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(strValueOf, obj) ? 1 : 0), "is_anchor");
                Map map2 = (Map) dataChannelGlobal.gg0(C1148040fys.class);
                if (map2 == null || (obj2 = map2.get("anchor_id")) == null) {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(obj2, "anchor_id");
                GiftMessage giftMessage = c1135810ff9.LIZ;
                if (giftMessage != null && (user = giftMessage.fromUser) != null && user.getId() == UserService.getInstance().user().getCurrentUserId()) {
                    z = true;
                } else {
                    z = false;
                }
                String str = "1";
                if (z) {
                    obj3 = "1";
                } else {
                    obj3 = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(obj3, "is_own_send");
                GiftMessage giftMessage2 = c1135810ff9.LIZ;
                if (giftMessage2 != null && (commonMessageData2 = giftMessage2.baseMessage) != null) {
                    lValueOf = Long.valueOf(commonMessageData2.createTime);
                } else {
                    lValueOf = null;
                }
                c474500IjALIZ.LJJII(lValueOf, "create_ms");
                c474500IjALIZ.LJJII(Integer.valueOf(c1135810ff9.LJIILIIL + c1135810ff9.LJIILJJIL), "queue_size");
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "send_gift_tray_show_ms");
                c474500IjALIZ.LJJII(Long.valueOf(c1135810ff9.LJJIII), "send_gift_receive_message_ms");
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ - c1135810ff9.LJJIII), "receive_show_dur");
                c474500IjALIZ.LJJII(Long.valueOf(c1135810ff9.LJJIII - C1135800ff8.LJIJ(c1135810ff9.LIZ)), "send_receive_dur");
                GiftMessage giftMessage3 = c1135810ff9.LIZ;
                if (giftMessage3 != null) {
                    lValueOf2 = Long.valueOf(giftMessage3.timestamp);
                } else {
                    lValueOf2 = null;
                }
                c474500IjALIZ.LJJII(lValueOf2, "send_gift_pull_message_ms");
                c474500IjALIZ.LJJII(Long.valueOf(c1135810ff9.LJJIIJZLJL - c1135810ff9.LJJIII), "before_queue_dur");
                c474500IjALIZ.LJJII(Long.valueOf(c1135810ff9.LJJIIZ - c1135810ff9.LJJIIJZLJL), "in_queue_dur");
                c474500IjALIZ.LJJII(Long.valueOf(jLIZ - c1135810ff9.LJJIIZ), "out_queue_dur");
                c474500IjALIZ.LJJII(Long.valueOf((jLIZ - c1135810ff9.LJJIII) - (c1135810ff9.LJJIIZ - c1135810ff9.LJJIIJZLJL)), "receive_show_without_queue_dur");
                c474500IjALIZ.LJJII(0L, "old_find_dur");
                c474500IjALIZ.LJJII(0L, "old_sort_dur");
                c474500IjALIZ.LJJII(Long.valueOf(c1135810ff9.LJJIJIIJI - c1135810ff9.LJJIJ), "new_delete_dur");
                c474500IjALIZ.LJJII(Long.valueOf(c1135810ff9.LJJIJIIJIL - c1135810ff9.LJJIJIIJI), "new_insert_dur");
                c474500IjALIZ.LJJII(Integer.valueOf(c1135810ff9.LJIILIIL), "others_queue_size");
                c474500IjALIZ.LJJII(Integer.valueOf(c1135810ff9.LJIILJJIL), "self_queue_size");
                if (c1135810ff9.LJIJI) {
                    obj4 = "1";
                } else {
                    obj4 = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(obj4, "is_first_send");
                if (!c1135810ff9.LJJJLIIL) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                c474500IjALIZ.LJJII(str, "is_local");
                ConcurrentHashSet concurrentHashSet = c1135810ff9.LJJJJ;
                if ((concurrentHashSet instanceof Collection) && concurrentHashSet.isEmpty()) {
                    i2 = 0;
                } else {
                    Iterator it2 = concurrentHashSet.iterator();
                    i2 = 0;
                    while (it2.hasNext()) {
                        if ((!((C1136650fgV) it2.next()).LIZJ) && (i2 = i2 + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                c474500IjALIZ.LJJII(Integer.valueOf(i2), "msg_show");
                ConcurrentHashSet concurrentHashSet2 = c1135810ff9.LJJJJ;
                if ((concurrentHashSet2 instanceof Collection) && concurrentHashSet2.isEmpty()) {
                    i3 = 0;
                } else {
                    Iterator it3 = concurrentHashSet2.iterator();
                    i3 = 0;
                    while (it3.hasNext()) {
                        if ((!((C1136650fgV) it3.next()).LIZJ) && (i3 = i3 + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                c474500IjALIZ.LJJII(Integer.valueOf(i3), "msg_total");
                GiftMessage giftMessage4 = c1135810ff9.LIZ;
                if (giftMessage4 != null && (gift = giftMessage4.mGift) != null) {
                    numValueOf = Integer.valueOf(gift.type);
                } else {
                    numValueOf = null;
                }
                c474500IjALIZ.LJJII(numValueOf, "gift_type");
                c474500IjALIZ.LJJII(Long.valueOf(c1135810ff9.LJJJJZ), "gift_id");
                c474500IjALIZ.LJJII(Integer.valueOf(c1135810ff9.LJFF), "gift_price");
                c474500IjALIZ.LJJII(Integer.valueOf(i), "combo_count");
                User user2 = c1135810ff9.LJJJJZI;
                if (user2 != null) {
                    lValueOf3 = Long.valueOf(user2.getId());
                } else {
                    lValueOf3 = null;
                }
                c474500IjALIZ.LJJII(lValueOf3, "from_user_id");
                User user3 = c1135810ff9.LJJL;
                if (user3 != null) {
                    lValueOf4 = Long.valueOf(user3.getId());
                } else {
                    lValueOf4 = null;
                }
                c474500IjALIZ.LJJII(lValueOf4, "to_user_id");
                GiftMessage giftMessage5 = c1135810ff9.LIZ;
                if (giftMessage5 != null && (commonMessageData = giftMessage5.baseMessage) != null) {
                    lValueOf5 = Long.valueOf(commonMessageData.messageId);
                }
                c474500IjALIZ.LJJII(lValueOf5, "msg_id");
                c474500IjALIZ.LJJII(c1135810ff9.LJIIZILJ, "log_id");
                c474500IjALIZ.LJJII(c1135810ff9.LJIJ.getDesc(), "downgrade_method");
                c474500IjALIZ.LJJII(0, "preload_video");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(desc, "send_gift_scene");
                if (Intrinsics.LJFF(desc, "video_anchor_pk")) {
                    c474500IjALIZ.LJJII(1, "is_opposite_host_gift");
                    c474500IjALIZ.LJJII(Long.valueOf(c1135810ff9.LJJLI), "from_user_id");
                    c474500IjALIZ.LJJII(Long.valueOf(c1135810ff9.LJJLIIIIJ), "to_anchor_id");
                    c474500IjALIZ.LJJII(Long.valueOf(C1128450fTH.LJIIJJI()), "channel_id");
                    c474500IjALIZ.LJJII(Long.valueOf(C1128450fTH.LIZJ()), "pk_id");
                    c474500IjALIZ.LJJII(C1128450fTH.LJIIZILJ(), "sub_match_type");
                    c474500IjALIZ.LJJII(C1128450fTH.LJIJ(), "team_member_cnts");
                    c474500IjALIZ.LJJII(Integer.valueOf(i5), "show_cohost_screen_index");
                    c474500IjALIZ.LJJII(Integer.valueOf(i4), "is_conflict");
                    c474500IjALIZ.LJJII(Long.valueOf(jLIZ - c1135810ff9.LJJLIIIJLJLI), "latency_ms");
                }
                c474500IjALIZ.LIZ();
            }
        }
    }

    @Override // X.InterfaceC465240IMg
    public final void handleMsg(Message message) {
        if (message == null) {
            return;
        }
        int i = message.what;
        if (i != 100) {
            if (i == 200) {
                LJIIL();
                return;
            }
            return;
        }
        LJIIJJI();
    }

    public final void LJFF(C1135810ff9 c1135810ff9, boolean z) {
        if (!z) {
            this.LLJJI.offer(c1135810ff9);
        } else {
            this.LLJJI.offerFirst(c1135810ff9);
        }
        LinkedList<C1135810ff9> linkedList = this.LLJJI;
        if (linkedList.size() > 1) {
            C08XD.LJJ(linkedList, new AComparatorS36S0000000_17(22));
        }
        LinkedList<C1135810ff9> linkedList2 = this.LLJJI;
        if (this.LLILLL > 0) {
            int size = linkedList2.size();
            int i = this.LLILLL;
            if (size > i) {
                linkedList2.subList(i, linkedList2.size()).clear();
            }
        }
    }

    public C1135030fdt(DataChannel dataChannel, long j, int i, boolean z, Function0<Boolean> function0, Function0<Boolean> function02, long j2, boolean z2) {
        this.LL = dataChannel;
        this.LLILLJJLI = j;
        this.LLILLL = i;
        this.LLILZ = z;
        this.LLILZIL = function0;
        this.LLILZLL = function02;
        this.LLIZ = j2;
        this.LLIZLLLIL = z2;
    }
}
