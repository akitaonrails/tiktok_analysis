package X;

import android.content.Context;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.function.IRoomFunctionService;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent;
import com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveCapsuleStyleItemConfig;
import com.bytedance.android.livesdk.model.message.CapsuleBizParams;
import com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost;
import com.bytedance.android.livesdk.model.message.CapsuleMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.message.CommonMessageData;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0aok, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C949560aok implements InterfaceC1112400f3O {
    @Override // X.InterfaceC1112400f3O
    public final boolean LIZ() {
        return true;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LIZIZ(CapsuleMessage capsuleMessage, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIILLIIL() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJIIZILJ() {
        return 0;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJIJ(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIFFI(C1112330f3H c1112330f3H, Map<String, String> map) {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIIZI(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIJIIJI() {
    }

    @Override // X.InterfaceC1112400f3O
    public final int LJJIJL(CapsuleMessage capsuleMessage) {
        return -1;
    }

    @Override // X.InterfaceC1112400f3O
    public final LiveCapsuleStyleItemConfig LJI() {
        return C952230at3.LIZ();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String LIZLLL(C1112330f3H c1112330f3H) {
        String str;
        CapsuleBizParamsCohost capsuleBizParamsCohost;
        CapsuleMessage capsuleMessage = (CapsuleMessage) c1112330f3H.LJIL;
        CapsuleBizParams capsuleBizParams = capsuleMessage.bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsCohost = capsuleBizParams.cohost) != null) {
            str = capsuleBizParamsCohost.type;
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(capsuleMessage.scene, "friend-guide") && !Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "friend-guide-no-frequency-control")) {
            if (Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "cohost_user_suggestion_guide")) {
                return "suggest_creator_capsule";
            }
            if (Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "linkmic-guide") && Intrinsics.LJFF(str, "nr_finish")) {
                return str;
            }
            return "anchor_host_notice";
        }
        if (str == null) {
            return "online_friend_capsule";
        }
        switch (str.hashCode()) {
            case -439086733:
                if (str.equals("nr_mywaste")) {
                    return str;
                }
                return "online_friend_capsule";
            case 989204668:
                if (!str.equals("recommend")) {
                    return "online_friend_capsule";
                }
                return "recommend_capsule";
            case 1485928660:
                if (!str.equals("available_friend")) {
                    return "online_friend_capsule";
                }
                return "available_friend_capsule";
            case 1491394060:
                if (str.equals("nr_yourwaste")) {
                    return str;
                }
                return "online_friend_capsule";
            default:
                return "online_friend_capsule";
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static C955540ayO LJ(C1112330f3H c1112330f3H) {
        CapsuleBizParamsCohost capsuleBizParamsCohost;
        String str;
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsCohost = capsuleBizParams.cohost) != null && (str = capsuleBizParamsCohost.type) != null) {
            switch (str.hashCode()) {
                case -439086733:
                    if (str.equals("nr_mywaste")) {
                        return C955540ayO.LJIILIIL;
                    }
                    break;
                case 989204668:
                    if (str.equals("recommend")) {
                        return C955540ayO.LJJJJJL;
                    }
                    break;
                case 1485928660:
                    if (str.equals("available_friend")) {
                        return C955540ayO.LJJJJJ;
                    }
                    break;
                case 1491394060:
                    if (str.equals("nr_yourwaste")) {
                        return C955540ayO.LJIILJJIL;
                    }
                    break;
            }
        }
        return C955540ayO.LJIIL;
    }

    public static String LJIILJJIL(C1112330f3H c1112330f3H) {
        CapsuleBizParams capsuleBizParams;
        CapsuleBizParamsCohost capsuleBizParamsCohost;
        if (!Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "friend-guide") || (capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams) == null || (capsuleBizParamsCohost = capsuleBizParams.cohost) == null) {
            return null;
        }
        return capsuleBizParamsCohost.subType;
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIIIZZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZJ();
    }

    /* JADX WARN: Removed duplicated region for block: B:144:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01c0 A[PHI: r11
      0x01c0: PHI (r11v6 java.lang.String) = (r11v2 java.lang.String), (r11v7 java.lang.String) binds: [B:69:0x01be, B:67:0x01ba] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01c4 A[PHI: r11
      0x01c4: PHI (r11v5 java.lang.String) = (r11v2 java.lang.String), (r11v6 java.lang.String) binds: [B:69:0x01be, B:71:0x01c2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.InterfaceC1112400f3O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIZ(X.C1112330f3H r21) {
        /*
            Method dump skipped, instruction units count: 1351
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C949560aok.LJIIIZ(X.0f3H):boolean");
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJIIJJI(C1112330f3H c1112330f3H) {
        User user;
        long id;
        CapsuleBizParamsCohost capsuleBizParamsCohost;
        if (!Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "friend-guide") && !Intrinsics.LJFF(((CapsuleMessage) c1112330f3H.LJIL).scene, "friend-guide-no-frequency-control")) {
            return false;
        }
        C1109770ez9 c1109770ez9LLIIIILZ = c1112330f3H.LLIIIILZ();
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        String idStr = null;
        if (capsuleBizParams != null && (capsuleBizParamsCohost = capsuleBizParams.cohost) != null) {
            user = capsuleBizParamsCohost.inviteeUserInfo;
        } else {
            user = null;
        }
        String strLIZLLL = LIZLLL(c1112330f3H);
        String strLJIILJJIL = LJIILJJIL(c1112330f3H);
        InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
        if (user != null) {
            idStr = user.getIdStr();
        }
        interfaceC955420ayCLIZ.LJJJLIIL(idStr);
        interfaceC955420ayCLIZ.LJLJLJ(strLJIILJJIL);
        C955400ayA.LLIFFJFJJ("during_connection", new C943870afZ(strLIZLLL), null, null, "capsule", 12);
        DataChannel dataChannel = c1109770ez9LLIIIILZ.LJIIIZ;
        if (dataChannel != null) {
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            dataChannel.SX0(C956740b0K.class, new C945060ahU(true, id, true));
            dataChannel.LC0(OpenCoHostEvent.class, strLIZLLL);
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0105 A[PHI: r2 r8
      0x0105: PHI (r2v4 com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost) = 
      (r2v2 com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost)
      (r2v5 com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost)
     binds: [B:55:0x0103, B:53:0x0100] A[DONT_GENERATE, DONT_INLINE]
      0x0105: PHI (r8v3 java.lang.String) = (r8v1 java.lang.String), (r8v4 java.lang.String) binds: [B:55:0x0103, B:53:0x0100] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0161  */
    @Override // X.InterfaceC1112400f3O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIL(X.C1112330f3H r13) {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C949560aok.LJIL(X.0f3H):void");
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJJIIJ(C1112330f3H c1112330f3H) {
        String str;
        CapsuleBizParamsCohost capsuleBizParamsCohost;
        CapsuleBizParamsCohost capsuleBizParamsCohost2;
        User user;
        String strLIZLLL = LIZLLL(c1112330f3H);
        CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams != null && (capsuleBizParamsCohost2 = capsuleBizParams.cohost) != null && (user = capsuleBizParamsCohost2.inviteeUserInfo) != null) {
            user.getId();
        }
        C925600aC6.LJIIIIZZ(strLIZLLL);
        if (Intrinsics.LJFF(strLIZLLL, "online_friend_capsule")) {
            C955440ayE c955440ayE = new C955440ayE();
            c955440ayE.LJJ((CapsuleMessage) c1112330f3H.LJIL);
            c955440ayE.LJIJJLI("capsule_message_show");
        }
        CapsuleBizParams capsuleBizParams2 = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
        if (capsuleBizParams2 != null && (capsuleBizParamsCohost = capsuleBizParams2.cohost) != null) {
            str = capsuleBizParamsCohost.type;
        } else {
            str = null;
        }
        if (Intrinsics.LJFF(str, "recommend")) {
            C20337914i1<Integer> c20337914i1 = InterfaceC960800b6s.LLLLLJLJLL;
            if (c20337914i1.LIZIZ().intValue() >= 0) {
                c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
            }
        }
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIIZ(C1112330f3H c1112330f3H) {
        return C952230at3.LIZIZ(c1112330f3H);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011 A[PHI: r1
      0x0011: PHI (r1v5 java.lang.String) = (r1v0 java.lang.String), (r1v6 java.lang.String) binds: [B:9:0x000f, B:7:0x000c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIILIIL(com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost r3, X.C1112330f3H r4) {
        /*
            java.lang.String r2 = ""
            if (r3 == 0) goto Le
            com.bytedance.android.live.base.model.user.User r0 = r3.inviteeUserInfo
            if (r0 == 0) goto Le
            java.lang.String r1 = r0.getDisplayId()
            if (r1 != 0) goto L11
        Le:
            r1 = r2
            if (r3 == 0) goto L1c
        L11:
            com.bytedance.android.live.base.model.user.User r0 = r3.inviteeUserInfo
            if (r0 == 0) goto L1c
            java.lang.String r0 = r0.getNickName()
            if (r0 == 0) goto L1c
            r2 = r0
        L1c:
            java.lang.String r2 = X.C0KVU.LIZIZ(r1, r2)
            r0 = 1
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r0 = 0
            r1[r0] = r2
            r0 = 2131841138(0x7f115072, float:1.9315576E38)
            java.lang.String r0 = X.C497740JfY.LJIJJ(r0, r1)
            X.C766270U4b.LJIIJJI(r0)
            X.0ayA r0 = X.C955400ayA.LIZ
            java.lang.String r0 = "online_friend_unable_invite"
            X.C955400ayA.LJLLLL(r0)
            com.bytedance.android.livesdk.livesetting.linkmic.cohost.PopupCohostListForOnlineFriendCapsuleSetting r0 = com.bytedance.android.livesdk.livesetting.linkmic.cohost.PopupCohostListForOnlineFriendCapsuleSetting.INSTANCE
            boolean r0 = r0.isEnable()
            if (r0 == 0) goto L5e
            X.0afZ r1 = new X.0afZ
            java.lang.String r2 = "online_friend_uninvitable"
            r1.<init>(r2)
            X.0at4 r0 = X.C915980Zwa.LJI()
            X.0ayC r0 = r0.LIZ()
            r0.LJIIJ(r1)
            X.0ez9 r0 = r4.LLIIIILZ()
            com.bytedance.ies.sdk.datachannel.DataChannel r1 = r0.LJIIIZ
            if (r1 == 0) goto L5e
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent> r0 = com.bytedance.android.livesdk.dataChannel.OpenCoHostEvent.class
            r1.LC0(r0, r2)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C949560aok.LJIILIIL(com.bytedance.android.livesdk.model.message.CapsuleBizParamsCohost, X.0f3H):void");
    }

    @Override // X.InterfaceC1112400f3O
    public final void LJII(C1112330f3H c1112330f3H, Map<String, String> map) {
        String str;
        Text text = ((CapsuleMessage) c1112330f3H.LJIL).desc;
        if (text != null) {
            str = text.key;
        } else {
            str = null;
        }
        map.put("starling_key", String.valueOf(str));
    }

    public final void LJIIL(final CapsuleBizParamsCohost capsuleBizParamsCohost, final C1112330f3H c1112330f3H) {
        String str;
        long id;
        User user;
        long j;
        long j2;
        User user2;
        User user3;
        C955540ayO c955540ayOLJ = LJ(c1112330f3H);
        CommonMessageData commonMessageData = c1112330f3H.LJIL.baseMessage;
        Object objLJIIZILJ = "";
        if (commonMessageData == null || (str = commonMessageData.logId) == null) {
            str = "";
        }
        if (capsuleBizParamsCohost != null && (user3 = capsuleBizParamsCohost.inviteeUserInfo) != null) {
            id = user3.getId();
        } else {
            id = 0;
        }
        HashMap map = new HashMap();
        map.put("vendor", 12);
        map.put("invite_type", Integer.valueOf(c955540ayOLJ.LIZ));
        if (capsuleBizParamsCohost != null && (user2 = capsuleBizParamsCohost.inviteeUserInfo) != null) {
            objLJIIZILJ = C950220apo.LJIIZILJ(user2);
        }
        map.put("user_info", objLJIIZILJ);
        map.put("need_withdraw", Boolean.FALSE);
        map.put("click_source", C955410ayB.LIZJ(c955540ayOLJ));
        map.put("click_timestamp", Long.valueOf(C158B.LIZ()));
        map.put("request_id", str);
        String strLJIILJJIL = LJIILJJIL(c1112330f3H);
        InterfaceC955420ayC interfaceC955420ayCLIZ = C915980Zwa.LJI().LIZ();
        interfaceC955420ayCLIZ.LLJJI(c955540ayOLJ);
        interfaceC955420ayCLIZ.LJLJLJ(strLJIILJJIL);
        final Room room = new Room();
        if (capsuleBizParamsCohost != null) {
            user = capsuleBizParamsCohost.inviteeUserInfo;
        } else {
            user = null;
        }
        room.setOwner(user);
        room.setOwnerUserId(id);
        C955400ayA c955400ayA = C955400ayA.LIZ;
        C955400ayA.LL(room, "invite", null, str, null, null, null, null, null, C2097608Jq.LJIIJ(new Pair("is_successful", "1")), false, 1524);
        if (capsuleBizParamsCohost != null) {
            j = capsuleBizParamsCohost.inviteeRoomId;
            j2 = capsuleBizParamsCohost.inviteeInnerChannelId;
        } else {
            j = 0;
            j2 = 0;
        }
        long channelId = C915980Zwa.LJII().getChannelId();
        long value = MtCoHostInviteTimeOutSetting.INSTANCE.getValue();
        ArrayList arrayList = new ArrayList();
        arrayList.add("invite");
        final long j3 = id;
        final String str2 = str;
        C915980Zwa.LJII().LJLJLJ(new C950000apS(0, j, id, j2, channelId, value, null, map, "invite_linkmic_capsule", arrayList, 64), new InterfaceC950010apT<C920620a44>() { // from class: X.0aol
            @Override // X.InterfaceC950010apT
            public final void LIZ(C920640a46 c920640a46) {
                C766270U4b.LIZLLL(2131853111);
                C915980Zwa.LJI().LIZ().LLILZ(j3, str2);
                C955400ayA c955400ayA2 = C955400ayA.LIZ;
                C955400ayA.LLF(room, "invite", null, null, null, null, null, false, null, 508);
                C955400ayA.LJLLLL("online_friend_invitation_send");
            }

            @Override // X.InterfaceC950010apT
            public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                C949560aok c949560aok = this;
                CapsuleBizParamsCohost capsuleBizParamsCohost2 = capsuleBizParamsCohost;
                C1112330f3H c1112330f3H2 = c1112330f3H;
                c949560aok.getClass();
                C949560aok.LJIILIIL(capsuleBizParamsCohost2, c1112330f3H2);
            }
        }, C915260ZvQ.LIZ);
    }

    @Override // X.InterfaceC1112400f3O
    public final boolean LJJIJIL(C1109770ez9 c1109770ez9, CapsuleMessage capsuleMessage) {
        Integer num;
        DataChannel dataChannel;
        Long l;
        DataChannel dataChannel2 = c1109770ez9.LJIIIZ;
        if (dataChannel2 != null) {
            num = (Integer) dataChannel2.gg0(C750040TbW.class);
        } else {
            num = null;
        }
        if (num == null || (num.intValue() != 1 && num.intValue() != 3)) {
            return true;
        }
        num.intValue();
        if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).t42()) {
            return true;
        }
        if ((Intrinsics.LJFF(capsuleMessage.scene, "friend-guide") || Intrinsics.LJFF(capsuleMessage.scene, "friend-guide-no-frequency-control")) && ((dataChannel = c1109770ez9.LJIIIZ) == null || (l = (Long) dataChannel.gg0(C956930b0d.class)) == null || !l.equals(Long.valueOf(capsuleMessage.getMessageId())))) {
            return true;
        }
        return false;
    }

    public static final void LIZJ(C949560aok c949560aok, C1112330f3H c1112330f3H, CapsuleBizParamsCohost capsuleBizParamsCohost) {
        LifecycleOwner lifecycleOwner;
        Context context = c1112330f3H.LLIIIILZ().LIZ;
        Object obj = c1112330f3H.LLIIIILZ().LIZ;
        if (obj instanceof LifecycleOwner) {
            lifecycleOwner = (LifecycleOwner) obj;
        } else {
            lifecycleOwner = null;
        }
        C947390alF.LIZ(context, lifecycleOwner, c1112330f3H.LLIIIILZ().LJIIIZ, C949460aoa.LIZ, AFwS193S0000000_7.get$arr$(224), new AwS259S0300000_15(c949560aok, c1112330f3H, capsuleBizParamsCohost, 38));
    }

    public static final void LJFF(C949560aok c949560aok, C1109770ez9 c1109770ez9, C1112330f3H c1112330f3H) {
        String str;
        CapsuleBizParamsCohost capsuleBizParamsCohost;
        if ((!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).o1() || C917860Zzc.LIZIZ()) && (!((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).vH0() || ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J12())) {
            DataChannel dataChannel = c1109770ez9.LJIIIZ;
            c949560aok.getClass();
            if ((dataChannel == null || !((IRoomFunctionService) C1161920gLG.LIZJ(IRoomFunctionService.class)).o52(dataChannel)) && !((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).t42() && !C915980Zwa.LJIIIZ().Jf()) {
                int i = C945040ahS.LIZ[EnumC944990ahN.AVAILABLE.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            DataChannel dataChannel2 = c1109770ez9.LJIIIZ;
                            if (dataChannel2 != null) {
                                dataChannel2.LC0(OpenCoHostEvent.class, LIZLLL(c1112330f3H));
                            }
                        } else {
                            throw new C1954807lC();
                        }
                    } else {
                        new AwS259S0300000_15(c949560aok, c1109770ez9, c1112330f3H, 35).invoke();
                    }
                } else {
                    DataChannel dataChannel3 = c1109770ez9.LJIIIZ;
                    if (dataChannel3 != null) {
                        dataChannel3.LC0(OpenCoHostEvent.class, LIZLLL(c1112330f3H));
                    }
                }
                CapsuleBizParams capsuleBizParams = ((CapsuleMessage) c1112330f3H.LJIL).bizParams;
                if (capsuleBizParams == null || (capsuleBizParamsCohost = capsuleBizParams.cohost) == null || (str = capsuleBizParamsCohost.type) == null) {
                    str = "";
                }
                C943870afZ c943870afZ = new C943870afZ(LIZLLL(c1112330f3H));
                c943870afZ.LJFF = str;
                C915980Zwa.LJI().LIZ().LJIIJ(c943870afZ);
                List<Long> listB70 = ((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).b70();
                if (((IInteractService) C1161920gLG.LIZJ(IInteractService.class)).J12() && listB70 != null && listB70.size() >= 2) {
                    C955400ayA.LLIFFJFJJ("during_connection", c943870afZ, null, null, null, 28);
                } else {
                    C955400ayA.LLIFFJFJJ("connection_invite", null, null, null, null, 30);
                }
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_host_notice");
                c474500IjALIZ.LJIJJLI(c1109770ez9.LJIIIZ);
                c474500IjALIZ.LJJII("click", "event_type");
                c474500IjALIZ.LIZ();
                return;
            }
        }
        C766270U4b.LIZLLL(2131841103);
    }

    public static final void LJIIJ(C1109770ez9 c1109770ez9, User user, String str) {
        long id;
        DataChannel dataChannel = c1109770ez9.LJIIIZ;
        if (dataChannel != null) {
            if (user != null) {
                id = user.getId();
            } else {
                id = 0;
            }
            dataChannel.SX0(C956740b0K.class, new C945060ahU(id, false, true, true));
            dataChannel.LC0(OpenCoHostEvent.class, str);
        }
    }
}
