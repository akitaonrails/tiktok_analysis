package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.LinkMessage;
import com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0b39, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C958490b39 extends AbstractC959270b4P implements InterfaceC959960b5W {
    @Override // X.InterfaceC959960b5W
    public final void LJII(LinkMessage linkMessage, Function0<Unit> function0, Function0<Unit> function02) {
    }

    @Override // X.InterfaceC960070b5h
    public final Set LJIIIZ() {
        return C13LQ.LJLIIL(new EnumC958900b3o[]{EnumC958900b3o.NONE, EnumC958900b3o.WAITED, EnumC958900b3o.PREPARED});
    }

    public C958490b39(InterfaceC959730b59 interfaceC959730b59) {
        super(interfaceC959730b59);
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [X.0aha] */
    @Override // X.InterfaceC959960b5W
    public final void LIZ(LinkMessage linkMessage) {
        boolean z;
        LinkerRandomMatchContent linkerRandomMatchContent;
        long j;
        long j2;
        LinkerRandomMatchContent linkerRandomMatchContent2;
        int i = linkMessage.messageType;
        long id = 0;
        if (i == 201 && (linkerRandomMatchContent2 = linkMessage.randomMatchContent) != null && linkerRandomMatchContent2.sourceType == 57) {
            z = true;
        } else {
            z = false;
        }
        User user = null;
        if (z) {
            C20441214yg.LIZIZ("TeamPairInvitedCoordinator", "Dispatch team pair match message to step 1 strategy");
            C915980Zwa.LJI().LIZ().LLJJI(C955540ayO.LJJJJLI);
            LinkerRandomMatchContent linkerRandomMatchContent3 = linkMessage.randomMatchContent;
            if (linkerRandomMatchContent3 != null) {
                j2 = linkerRandomMatchContent3.roomId;
                user = linkerRandomMatchContent3.user;
            } else {
                j2 = 0;
            }
            Room room = new Room();
            room.setId(j2);
            room.setOwner(user);
            if (user != null) {
                id = user.getId();
            }
            room.setOwnerUserId(id);
            C955400ayA c955400ayA = C955400ayA.LIZ;
            C955400ayA.LL(room, EnumC920540a3w.QUICK_LINKMIC.getValue(), null, null, null, null, null, null, null, null, false, 2044);
            final C958640b3O c958640b3O = new C958640b3O(new C945130ahb(), C915980Zwa.LJII());
            String sessionId = this.LIZ.getSessionId();
            final AwS559S0100000_15 awS559S0100000_15 = new AwS559S0100000_15(room, 653);
            c958640b3O.LIZ.getClass();
            final C950000apS c950000apSLIZ = AbstractC945110ahZ.LIZ(linkMessage, sessionId);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Send Co-Host join group request. param=");
            sbLIZ.append(c950000apSLIZ);
            C20441214yg.LIZIZ("Step1AutoSendStrategy", C2188811AlT.LIZIZ(sbLIZ));
            c958640b3O.LIZIZ.LJJII(c950000apSLIZ, new InterfaceC950010apT<C920620a44>() { // from class: X.0b3F
                @Override // X.InterfaceC950010apT
                public final void LIZ(C920640a46 c920640a46) {
                    Function0<Unit> function0 = awS559S0100000_15;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // X.InterfaceC950010apT
                public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                    c958640b3O.getClass();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("join group fail, param = ");
                    sbLIZ2.append(c950000apSLIZ);
                    sbLIZ2.append(", error = ");
                    sbLIZ2.append(c952350atF);
                    sbLIZ2.append(", throwable = ");
                    sbLIZ2.append(th);
                    C20441214yg.LJ("Step1AutoSendStrategy", C2188811AlT.LIZIZ(sbLIZ2));
                }
            });
            return;
        }
        if (i == 201 && (linkerRandomMatchContent = linkMessage.randomMatchContent) != null && linkerRandomMatchContent.sourceType == 59) {
            C20441214yg.LIZIZ("TeamPairInvitedCoordinator", "Dispatch team pair match message to step 3 strategy.");
            C915980Zwa.LJI().LIZ().LLJJI(C955540ayO.LJJJJZ);
            LinkerRandomMatchContent linkerRandomMatchContent4 = linkMessage.randomMatchContent;
            if (linkerRandomMatchContent4 != null) {
                j = linkerRandomMatchContent4.roomId;
                user = linkerRandomMatchContent4.user;
            } else {
                j = 0;
            }
            Room room2 = new Room();
            room2.setId(j);
            room2.setOwner(user);
            if (user != null) {
                id = user.getId();
            }
            room2.setOwnerUserId(id);
            C955400ayA c955400ayA2 = C955400ayA.LIZ;
            C955400ayA.LL(room2, EnumC920540a3w.QUICK_LINKMIC.getValue(), null, null, null, null, null, null, null, null, false, 2044);
            final C958630b3N c958630b3N = new C958630b3N(new InterfaceC945550aiH() { // from class: X.0aha
                /* JADX WARN: Removed duplicated region for block: B:12:0x001c  */
                /* JADX WARN: Removed duplicated region for block: B:20:0x0087  */
                @Override // X.InterfaceC945550aiH
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final X.C950000apS LIZ(com.bytedance.android.livesdk.model.message.LinkMessage r22, java.lang.String r23) {
                    /*
                        r21 = this;
                        r2 = r22
                        com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent r1 = r2.randomMatchContent
                        r10 = 0
                        if (r1 == 0) goto L8c
                        long r6 = r1.roomId
                        com.bytedance.android.live.base.model.user.User r0 = r1.user
                        if (r0 == 0) goto L8e
                        long r8 = r0.getId()
                    L12:
                        long r10 = r1.innerChannelId
                    L14:
                        java.lang.String r5 = ""
                        if (r1 == 0) goto L1c
                        java.lang.String r3 = r1.matchId
                        if (r3 != 0) goto L1d
                    L1c:
                        r3 = r5
                    L1d:
                        com.bytedance.android.livesdk.model.message.linker.random_linkmic_message.LinkerRandomMatchContent r0 = r2.randomMatchContent
                        if (r0 == 0) goto L87
                        long r0 = r0.sourceType
                        int r2 = (int) r0
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                        if (r0 == 0) goto L87
                        X.0ayO r0 = X.C915200ZvK.LIZ(r0)
                        int r4 = r0.LIZ
                    L30:
                        java.util.HashMap r0 = new java.util.HashMap
                        r0.<init>()
                        r1 = 12
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                        java.lang.String r1 = "vendor"
                        r0.put(r1, r2)
                        java.lang.String r1 = "sec_to_user_id"
                        r0.put(r1, r5)
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r4)
                        java.lang.String r1 = "invite_type"
                        r0.put(r1, r2)
                        r1 = 1
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
                        java.lang.String r1 = "match_type"
                        r0.put(r1, r2)
                        java.lang.String r1 = "algo_request_id"
                        r0.put(r1, r3)
                        java.lang.String r1 = "session_id"
                        r2 = r23
                        r0.put(r1, r2)
                        java.lang.String r1 = "match_id"
                        r0.put(r1, r3)
                        X.0apS r4 = new X.0apS
                        r5 = 0
                        r12 = 0
                        com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting r1 = com.bytedance.android.livesdk.livesetting.linkmic.MtCoHostInviteTimeOutSetting.INSTANCE
                        int r1 = r1.getValue()
                        long r14 = (long) r1
                        r16 = 0
                        java.lang.String r18 = "invite_team_pair"
                        java.lang.String r1 = "invite_team_pair"
                        java.util.List r19 = java.util.Collections.singletonList(r1)
                        r20 = 64
                        r17 = r0
                        r4.<init>(r5, r6, r8, r10, r12, r14, r16, r17, r18, r19, r20)
                        return r4
                    L87:
                        X.0ayO r0 = X.C955540ayO.LIZIZ
                        int r4 = r0.LIZ
                        goto L30
                    L8c:
                        r6 = 0
                    L8e:
                        r8 = 0
                        if (r1 == 0) goto L14
                        goto L12
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C945120aha.LIZ(com.bytedance.android.livesdk.model.message.LinkMessage, java.lang.String):X.0apS");
                }
            }, C915980Zwa.LJII());
            String sessionId2 = this.LIZ.getSessionId();
            final AwS559S0100000_15 awS559S0100000_152 = new AwS559S0100000_15(room2, 654);
            C950000apS c950000apSLIZ2 = c958630b3N.LIZ.LIZ(linkMessage, sessionId2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Send Co-Host invitation. param=");
            sbLIZ2.append(c950000apSLIZ2);
            C20441214yg.LIZIZ("Step3AutoSendStrategy", C2188811AlT.LIZIZ(sbLIZ2));
            c958630b3N.LIZIZ.LJLJLJ(c950000apSLIZ2, new InterfaceC950010apT<C920620a44>() { // from class: X.0b3G
                @Override // X.InterfaceC950010apT
                public final void LIZ(C920640a46 c920640a46) {
                    c958630b3N.getClass();
                    C20441214yg.LIZIZ("Step3AutoSendStrategy", "invitation success");
                    Function0<Unit> function0 = awS559S0100000_152;
                    if (function0 != null) {
                        function0.invoke();
                    }
                }

                @Override // X.InterfaceC950010apT
                public final void LIZIZ(C952350atF c952350atF, Throwable th) {
                    c958630b3N.getClass();
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("invitation fail, error = ");
                    sbLIZ3.append(c952350atF);
                    sbLIZ3.append(", throwable = ");
                    sbLIZ3.append(th);
                    C20441214yg.LJ("Step3AutoSendStrategy", C2188811AlT.LIZIZ(sbLIZ3));
                }
            }, C915260ZvQ.LIZ);
            return;
        }
        C20441214yg.LJ("TeamPairInvitedCoordinator", "onReceiveTeamPairMatchMessage, unknown message");
    }

    @Override // X.InterfaceC959960b5W
    public final void LIZIZ(C954630awv c954630awv, Function0<Unit> function0, Function0<Unit> function02) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onReceiveReplyMessage. msg=");
        sbLIZ.append(c954630awv);
        C20441214yg.LIZIZ("TeamPairInvitedCoordinator", C2188811AlT.LIZIZ(sbLIZ));
        if (function0 != null) {
            function0.invoke();
        }
    }
}
