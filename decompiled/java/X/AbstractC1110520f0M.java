package X;

import X.AbstractC1136060ffY;
import Y.AObjectS392S0100000_17;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.chatroom.event.ISendCommentEvent;
import com.bytedance.android.livesdk.dataChannel.LowDevicePerfScalableChannel;
import com.bytedance.android.livesdk.livesetting.level.FansClubBadgeShowEnableSetting;
import com.bytedance.android.livesdk.livesetting.level.UserLevelBadgeShowEnableSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import com.bytedance.android.livesdk.model.message.PinMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS383S0200000_17;
import kotlin.jvm.internal.AwS561S0100000_17;

/* JADX INFO: renamed from: X.0f0M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public abstract class AbstractC1110520f0M<MESSAGE extends AbstractC1136060ffY> extends AbstractC1110800f0o<MESSAGE> implements InterfaceC1112320f3G {
    public static final /* synthetic */ int LJJIIZI = 0;
    public CharSequence LJJI;
    public C520950Kbt LJJIFFI;
    public C520950Kbt LJJII;
    public boolean LJJIII;
    public final C01GW LJJIIJ;
    public boolean LJJIIJZLJL;
    public final AObjectS392S0100000_17 LJJIIZ;

    public User LJIL() {
        return null;
    }

    @Override // X.InterfaceC1112320f3G
    public final ImageModel LJJI() {
        return null;
    }

    public User LJJIJL() {
        return null;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJLIIIJL() {
        return true;
    }

    @Override // X.InterfaceC1112320f3G
    public final Drawable LJJLIIIJLLLLLLLZ() {
        return null;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLJJIJIIJIL() {
        return true;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n
    public boolean LLJJIJIL() {
        return this instanceof C1110490f0J;
    }

    public String LLJLLIL() {
        return "report_message";
    }

    public abstract String LLJLLL();

    public void LLLF(boolean z) {
    }

    public void LLLFF() {
    }

    public long getCreateTime() {
        return 0L;
    }

    public C1110330f03 LJJJIL() {
        return new C1110330f03();
    }

    public final Collection<AbstractC498530Jgp<? extends AbstractC521080Kc6>> LLJLILLLLZIIL() {
        List<AbstractC498530Jgp<? extends AbstractC521080Kc6>> list;
        C520950Kbt c520950Kbt = this.LJJIFFI;
        return (c520950Kbt == null || (list = c520950Kbt.LJ) == null) ? new ArrayList() : list;
    }

    public final CharSequence LLJLL() {
        if (TextUtils.isEmpty(this.LJJI)) {
            String strLIZ = C0KVU.LIZ(getUser());
            this.LJJI = strLIZ;
            if (TextUtils.isEmpty(strLIZ)) {
                Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
                HashMap map = new HashMap();
                CommonMessageData commonMessageData = this.LJIL.baseMessage;
                map.put("message_id", commonMessageData == null ? "" : String.valueOf(commonMessageData.messageId));
                if (getUser() == null) {
                    map.put("reason", "User is null.");
                } else if (room == null) {
                    map.put("reason", "Room is null.");
                } else {
                    User user = getUser();
                    if (user != null && room.getOwnerUserId() == user.getId() && TextUtils.isEmpty(C0KVU.LJ(getUser()))) {
                        map.put("reason", "User is anchor, but displayId is empty.");
                    } else if (room.getNameMode() == 1 && TextUtils.isEmpty(C0KVU.LIZLLL(getUser()))) {
                        map.put("reason", "User is audience and display nickname, but nickname is empty.");
                    } else if (TextUtils.isEmpty(C0KVU.LJ(getUser()))) {
                        map.put("reason", "User is audience, but displayId is empty.");
                    }
                }
                C1143300frE.LJIIJJI().LIZIZ("ttlive_text_message_not_display_name", map);
            }
        }
        return this.LJJI;
    }

    public List<EmoteWithIndex> LLJZ() {
        return new ArrayList();
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1111840f2U
    public void LJJIJIIJIL() {
        super.LJJIJIIJIL();
        if (LLLI()) {
            if ((!LLIIIILZ().LJFF || this.LIZJ) && !this.LJJIIJZLJL) {
                this.LJJIIJZLJL = true;
                LLJZIJLIL(LLJLIL(), LLIIIILZ(), LLIIIILZ().LJJ ? 3 : 1);
            }
        }
        this.LJJIII = false;
    }

    @Override // X.AbstractC1110790f0n
    public final boolean LLILLJJLI() {
        C1077790e9Z c1077790e9Z;
        if (!LLIILII()) {
            return false;
        }
        DataChannel dataChannel = LLIIIILZ().LJIIIZ;
        return !ScalableDowngradeSetting.disablePublicScreenAvatarPreload() || dataChannel == null || (c1077790e9Z = (C1077790e9Z) dataChannel.gg0(LowDevicePerfScalableChannel.class)) == null || c1077790e9Z.LIZIZ.compareTo(EnumC1087640ePS.LEVEL_SERIOUS) > 0;
    }

    public final List<BadgeStruct> LLJLIL() {
        User user;
        List<BadgeStruct> badgeList;
        C1142400fpm c1142400fpmLLFFF = LLFFF();
        if ((c1142400fpmLLFFF == null || (badgeList = c1142400fpmLLFFF.LJII(getUser(), this.LJI)) == null) && ((user = getUser()) == null || (badgeList = user.getBadgeList()) == null || !(!badgeList.isEmpty()))) {
            return null;
        }
        return badgeList;
    }

    public final boolean LLL() {
        ImageModel imageModelLJLLLLLL = LJLLLLLL();
        if (imageModelLJLLLLLL == null) {
            return true;
        }
        if (C497740JfY.LJII() == null || C0IKQ.LIZ(imageModelLJLLLLLL.getUrls())) {
            return false;
        }
        String str = (String) ListProtector.get(imageModelLJLLLLLL.getUrls(), 0);
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1328130kfL.LJIILIIL().LJIIL().LJIIJJI(UriProtector.parse(str));
    }

    public void LLLFFI() {
        if (!LLIIIILZ().LJI) {
            LLLFZ();
            return;
        }
        C1111350f1h c1111350f1h = new C1111350f1h();
        c1111350f1h.LJFF = "comment";
        c1111350f1h.LIZ = LLJLLIL();
        c1111350f1h.LIZIZ = "click";
        LLIIIILZ().LJII(this, c1111350f1h);
    }

    public void LLLFZ() {
        CharSequence charSequenceLLJLL = LLJLL();
        if (getUser() != null && !TextUtils.isEmpty(charSequenceLLJLL)) {
            C1110530f0N c1110530f0N = new C1110530f0N(1, String.valueOf(charSequenceLLJLL), "positive_reply", LLJLLL(), LLJZ());
            c1110530f0N.LJIIIZ = "message";
            HashMap map = new HashMap();
            C1109640eyw c1109640eyw = this.LJIIZILJ;
            if (c1109640eyw.LIZIZ && c1109640eyw.LIZJ != null) {
                map.put("reply_method", "pin");
                PinMessage pinMessage = this.LJIIZILJ.LIZJ.LJI;
                if (pinMessage != null) {
                    map.put("pin_msg_id", String.valueOf(pinMessage.getMessageId()));
                    map.put("pin_id", String.valueOf(pinMessage.pinId));
                }
            } else if (LLIILZL()) {
                map.put("reply_method", "anchor");
            } else {
                map.put("reply_method", "viewer");
            }
            map.put("reply_event_page", "click_msg");
            ISendCommentEvent.Sender sender = ISendCommentEvent.Sender.REPLY;
            sender.setLogArgs(map);
            c1110530f0N.LJIIJ = sender;
            c1110530f0N.LIZLLL = getUser();
            c1110530f0N.LJIIL = getMessageId();
            c1110530f0N.LJIILIIL = this.LJIJ.LIZ;
            C784440Upu.LIZ().LIZIZ(c1110530f0N);
            if (!LLIIIILZ().LJI) {
                LLLFF();
            }
        }
        C499230Jhx.LIZIZ(this.LJIL);
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public void dispose() {
        super.dispose();
        C520950Kbt c520950Kbt = this.LJJIFFI;
        if (c520950Kbt != null) {
            c520950Kbt.LIZLLL();
        }
        this.LJJIFFI = null;
        C520950Kbt c520950Kbt2 = this.LJJII;
        if (c520950Kbt2 != null) {
            c520950Kbt2.LIZLLL();
        }
        this.LJJII = null;
    }

    public boolean LLLI() {
        return this.LIZLLL;
    }

    public AbstractC1110520f0M(MESSAGE message) {
        super(message);
        this.LJJIIJ = C292401Bi.LIZ(new AwS561S0100000_17(this, 449));
        this.LJJIIZ = new AObjectS392S0100000_17(this, 38);
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public void LJJJJZ(C1109770ez9 c1109770ez9) {
        super.LJJJJZ(c1109770ez9);
        this.LJJI = null;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1109650eyx
    public void LJLI(C1109770ez9 c1109770ez9) {
        this.LJ = false;
        this.LJJIIJZLJL = false;
    }

    public final void LLJZIJLIL(List<BadgeStruct> list, C1109770ez9 c1109770ez9, int i) {
        boolean z;
        boolean z2;
        boolean z3 = false;
        if (this.LJJIFFI == null) {
            C520950Kbt c520950Kbt = new C520950Kbt(this.LJIJJ, null, false, c1109770ez9.LIZJ);
            c520950Kbt.LJII = new AwS383S0200000_17(c1109770ez9, (C1109770ez9) this, 84);
            this.LJJIFFI = c520950Kbt;
        }
        if (this.LJJII == null) {
            C520950Kbt c520950Kbt2 = new C520950Kbt(this.LJIJJ, null, false, c1109770ez9.LIZJ);
            c520950Kbt2.LJII = new AwS383S0200000_17(c1109770ez9, (C1109770ez9) this, 85);
            this.LJJII = c520950Kbt2;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (list != null) {
            Iterator<BadgeStruct> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                BadgeStruct next = it2.next();
                BadgeStruct badgeStruct = next;
                if (badgeStruct != null && badgeStruct.badgeScene == 14) {
                    if (next != null) {
                        z = true;
                    }
                }
            }
            z = false;
            if (list != null) {
                z3 = false;
                for (BadgeStruct badgeStruct2 : list) {
                    if (LLIIZ(badgeStruct2, getUser()) && (!z || (badgeStruct2 != null && badgeStruct2.badgeScene == 14))) {
                        if (badgeStruct2 != null) {
                            if (badgeStruct2.badgeScene != 8 || !UserLevelBadgeShowEnableSetting.INSTANCE.getValue()) {
                                if (badgeStruct2 != null) {
                                    if (badgeStruct2.badgeScene != 4) {
                                        if (badgeStruct2 != null) {
                                            if (badgeStruct2.badgeScene == 10) {
                                                if (FansClubBadgeShowEnableSetting.INSTANCE.getValue()) {
                                                    arrayList2.add(badgeStruct2);
                                                    z3 = true;
                                                } else if (badgeStruct2 != null) {
                                                }
                                            }
                                            if (badgeStruct2.badgeScene == 14) {
                                                arrayList2.add(badgeStruct2);
                                            } else if (badgeStruct2.badgeScene == 16) {
                                                arrayList.add(badgeStruct2);
                                            } else {
                                                if (badgeStruct2.badgeScene == 8) {
                                                    z2 = true;
                                                } else {
                                                    z2 = false;
                                                }
                                                if (z2 || (badgeStruct2 != null && (badgeStruct2.badgeScene == 10 || badgeStruct2.badgeScene == 4 || badgeStruct2.badgeScene == 6 || badgeStruct2.badgeScene == 15))) {
                                                    int i2 = badgeStruct2.badgeScene;
                                                    if (i2 == 6 || i2 == 15) {
                                                        arrayList.add(badgeStruct2);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            arrayList2.add(badgeStruct2);
                        }
                        arrayList.add(badgeStruct2);
                    }
                }
            }
        }
        if (z3) {
            C520950Kbt c520950Kbt3 = this.LJJII;
            if (c520950Kbt3 != null) {
                c520950Kbt3.LJIIIZ = 3;
            }
        } else {
            C520950Kbt c520950Kbt4 = this.LJJII;
            if (c520950Kbt4 != null) {
                c520950Kbt4.LJIIIZ = 2;
            }
        }
        C520950Kbt c520950Kbt5 = this.LJJIFFI;
        if (c520950Kbt5 != null) {
            c520950Kbt5.LJIIIZ = 3;
            c520950Kbt5.LJIIIZ(c1109770ez9.LJI, c1109770ez9.LIZ, arrayList, null, new AwS383S0200000_17(c1109770ez9, (C1109770ez9) this, 86), i, getUser(), null, false);
        }
        C520950Kbt c520950Kbt6 = this.LJJII;
        if (c520950Kbt6 != null) {
            c520950Kbt6.LJIIIZ(c1109770ez9.LJI, c1109770ez9.LIZ, arrayList2, null, new AwS383S0200000_17(c1109770ez9, (C1109770ez9) this, 87), i, getUser(), null, false);
        }
    }
}
