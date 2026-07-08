package X;

import com.bytedance.android.livesdk.model.message.PopupStateChangeContent;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS30S0000100_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: renamed from: X.0awb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C954430awb {
    public static final /* synthetic */ int LJ = 0;
    public boolean LIZJ;
    public EnumC311330CIh LIZ = EnumC311330CIh.NONE;
    public final C13E8<C954570awp> LIZIZ = new C13E8<>(2);
    public final C956610b07 LIZLLL = new AbstractC962030b8r() { // from class: X.0b07
        @Override // X.AbstractC962030b8r
        public final boolean LJIJJ() {
            return true;
        }
    };

    public final void LIZIZ(String str) {
        Iterator<C954570awp> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            C954570awp next = it2.next();
            next.getClass();
            if (System.currentTimeMillis() - next.LIZIZ > 20000) {
                it2.remove();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("checkIllegalRecordInConflictQueue");
                sbLIZ.append(" remove expired record ");
                sbLIZ.append(next);
                C20441214yg.LJIIIZ("MultiHostConflictManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        LJIIIZ(str);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("checkIllegalRecordInConflictQueue");
        sbLIZ2.append(" conflict queue size = ");
        sbLIZ2.append(this.LIZIZ.size());
        sbLIZ2.append(", source = ");
        sbLIZ2.append(str);
        C20441214yg.LJIIIZ("MultiHostConflictManager", C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void LJIIIZ(String str) {
        EnumC311330CIh enumC311330CIh;
        if (this.LIZIZ.size() != 0) {
            enumC311330CIh = EnumC311330CIh.CONFLICT;
        } else {
            enumC311330CIh = EnumC311330CIh.NONE;
        }
        this.LIZ = enumC311330CIh;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateConflictManagerState");
        sbLIZ.append(" current state = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", source = ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("MultiHostConflictManager", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[PHI: r8
      0x007e: PHI (r8v1 long) = (r8v0 long), (r8v4 long) binds: [B:33:0x007b, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage r21, final X.C954570awp r22) {
        /*
            r20 = this;
            java.lang.String r1 = "autoReplyMutualInvite"
            java.lang.String r0 = "MultiHostConflictManager"
            X.C20441214yg.LJIIIZ(r0, r1)
            r3 = r21
            tikcast.linkmic.common.GroupPlayer r4 = r3.joinUser
            r0 = 0
            if (r4 == 0) goto L79
            com.bytedance.android.livesdk.model.message.linkcore.Player r2 = r4.user
            if (r2 == 0) goto L79
            long r8 = r2.uid
        L15:
            com.bytedance.android.livesdk.model.message.linkcore.Player r2 = r4.user
            if (r2 == 0) goto L7e
            long r6 = r2.roomId
        L1b:
            long r10 = r4.channelId
        L1d:
            com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r2 = r3.linkLayerMessage
            if (r2 == 0) goto L76
            webcast.im.JoinGroupContent r2 = r2.joinGroupContent
            if (r2 == 0) goto L76
            tikcast.linkmic.common.GroupChannelAllUser r2 = r2.groupUser
            if (r2 == 0) goto L76
            long r12 = r2.groupChannelId
        L2b:
            com.bytedance.android.livesdk.chatroom.model.multiguestv3.BusinessContent r2 = r3.businessContent
            if (r2 == 0) goto L74
            webcast.im.CohostContent r2 = r2.cohostContent
            if (r2 == 0) goto L74
            webcast.im.JoinGroupBizContent r4 = r2.joinGroupBizContent
        L35:
            com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent r2 = new com.bytedance.android.live.liveinteract.multihost.core.model.MHJoinReplyBizContent
            r14 = 0
            r5 = 0
            java.lang.String r3 = ""
            r2.<init>(r5, r3, r5)
            if (r4 == 0) goto L46
            webcast.im.JoinGroupMessageExtra r3 = r4.joinGroupMsgExtra
            if (r3 == 0) goto L46
            long r0 = r3.sourceType
        L46:
            int r3 = (int) r0
            r2.sourceType = r3
            r15 = 1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r0 = "auto_reply_mutual_invite"
            r1.add(r0)
            r19 = 416(0x1a0, float:5.83E-43)
            X.0ahj r4 = new X.0ahj
            r16 = r14
            r17 = r2
            r18 = r1
            r4.<init>(r5, r6, r8, r10, r12, r14, r15, r16, r17, r18, r19)
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r2 = X.C915980Zwa.LJII()
            X.0awq r1 = new X.0awq
            r0 = r22
            r3 = r20
            r1.<init>()
            X.0ZvQ r0 = X.C915260ZvQ.LIZ
            r2.LLILZIL(r4, r1, r0)
            return
        L74:
            r4 = 0
            goto L35
        L76:
            r12 = 0
            goto L2b
        L79:
            r8 = 0
            if (r4 == 0) goto L7e
            goto L15
        L7e:
            r6 = 0
            if (r4 != 0) goto L1b
            r10 = 0
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C954430awb.LIZ(com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage, X.0awp):void");
    }

    public final C954570awp LIZJ(long j, long j2) {
        C954570awp next;
        Iterator<C954570awp> it2 = this.LIZIZ.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                C954570awp c954570awp = next;
                int i = C954860axI.LIZ[c954570awp.LIZ.ordinal()];
                if (i != 1 && i != 2) {
                    if (i == 3 && c954570awp.LIZLLL.contains(Long.valueOf(j)) && c954570awp.LIZJ == j2) {
                        break;
                    }
                } else if (c954570awp.LIZLLL.contains(Long.valueOf(j))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        C954570awp c954570awp2 = next;
        if (c954570awp2 == null) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("existMutualInviteRecord");
        sbLIZ.append(", exist mutual invite, conflictRecordType = ");
        sbLIZ.append(c954570awp2.LIZ);
        sbLIZ.append(" fromUserId = ");
        sbLIZ.append(j);
        sbLIZ.append(", toUserId = ");
        sbLIZ.append(j2);
        sbLIZ.append(", conflict record = ");
        sbLIZ.append(c954570awp2);
        C20441214yg.LJIIIZ("MultiHostConflictManager", C2188811AlT.LIZIZ(sbLIZ));
        return c954570awp2;
    }

    public final void LJ(long j, String str, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleInviteApplyConflictRecord");
        sbLIZ.append(" source = ");
        sbLIZ.append(str);
        sbLIZ.append(", isAgree = ");
        sbLIZ.append(z);
        C20441214yg.LIZIZ("MultiHostConflictManager", C2188811AlT.LIZIZ(sbLIZ));
        Iterator<C954570awp> it2 = this.LIZIZ.iterator();
        while (it2.hasNext()) {
            C954570awp next = it2.next();
            EnumC954840axG enumC954840axG = next.LIZ;
            if (enumC954840axG == EnumC954840axG.INVITE_REQUEST || enumC954840axG == EnumC954840axG.APPLY_REQUEST) {
                next.LIZLLL.remove(Long.valueOf(j));
                if (next.LIZLLL.isEmpty()) {
                    it2.remove();
                }
                PopupStateChangeContent popupStateChangeContent = next.LJI;
                if (popupStateChangeContent != null && z) {
                    if (popupStateChangeContent.otherUsers.size() >= 1) {
                        C915980Zwa.LJI().LIZ().LJLJL(EnumC955660aya.APPLY, true);
                    } else {
                        C915980Zwa.LJI().LIZ().LJLJL(EnumC955660aya.INVITER, true);
                    }
                }
            }
        }
        LJIIIZ("handleInviteApplyConflictRecord");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0151  */
    /* JADX WARN: Type inference failed for: r5v2, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.util.ArrayList] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.InterfaceC954180awC r8, X.C954570awp r9, kotlin.jvm.functions.Function1<? super X.C954570awp, kotlin.Unit> r10) {
        /*
            Method dump skipped, instruction units count: 475
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C954430awb.LJI(X.0awC, X.0awp, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005a A[PHI: r7
      0x005a: PHI (r7v1 long) = (r7v0 long), (r7v4 long) binds: [B:21:0x0057, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJII(X.InterfaceC954180awC r14, com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage r15, java.lang.String r16, int r17) {
        /*
            java.lang.String r13 = "tryRefuseApplyByMultiHostConflict"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r13)
            java.lang.String r0 = ", source = "
            r1.append(r0)
            r0 = r16
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MultiHostConflictManager"
            X.C20441214yg.LJIIIZ(r0, r1)
            if (r14 == 0) goto L52
            if (r15 == 0) goto L52
            tikcast.linkmic.common.GroupPlayer r1 = r15.joinUser
            if (r1 == 0) goto L55
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r1.user
            if (r0 == 0) goto L55
            long r7 = r0.uid
        L2a:
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r1.user
            if (r0 == 0) goto L5a
            long r5 = r0.roomId
        L30:
            long r9 = r1.channelId
        L32:
            r2 = 1
            r3 = r17
            if (r3 != r2) goto L53
            r11 = 1
        L38:
            webcast.data.cohost_biz.BizPermitJoinGroupParams r12 = new webcast.data.cohost_biz.BizPermitJoinGroupParams
            r12.<init>()
            r12.replyStatus = r3
            X.0awt r4 = new X.0awt
            r1 = r4
            r4.<init>(r5, r7, r9, r11, r12, r13)
            com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r0 = r15.linkLayerMessage
            X.C955430ayD.LJ(r2, r3, r7, r0)
            X.0ax2 r0 = new X.0ax2
            r0.<init>()
            r14.LJJJJL(r1, r0)
        L52:
            return
        L53:
            r11 = 2
            goto L38
        L55:
            r7 = 0
            if (r1 == 0) goto L5a
            goto L2a
        L5a:
            r5 = 0
            if (r1 != 0) goto L30
            r9 = 0
            goto L32
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C954430awb.LJII(X.0awC, com.bytedance.android.livesdk.comp.api.linkcore.model.ApplyGroupMessage, java.lang.String, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0056 A[PHI: r5
      0x0056: PHI (r5v1 long) = (r5v0 long), (r5v4 long) binds: [B:20:0x0053, B:11:0x002c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJIIIIZZ(X.InterfaceC954180awC r12, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage r13, java.lang.String r14, int r15) {
        /*
            java.lang.String r11 = "tryRefuseInviteByMultiHostConflict"
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            r1.append(r11)
            java.lang.String r0 = ", source = "
            r1.append(r0)
            r1.append(r14)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "MultiHostCrossRefuseManager"
            X.C20441214yg.LJIIIZ(r0, r1)
            if (r12 == 0) goto L50
            if (r13 == 0) goto L50
            tikcast.linkmic.common.GroupPlayer r1 = r13.joinUser
            r7 = 0
            if (r1 == 0) goto L51
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r1.user
            if (r0 == 0) goto L51
            long r5 = r0.uid
        L2a:
            com.bytedance.android.livesdk.model.message.linkcore.Player r0 = r1.user
            if (r0 == 0) goto L56
            long r3 = r0.roomId
        L30:
            long r7 = r1.channelId
        L32:
            r9 = 1
            if (r15 == r9) goto L36
            r9 = 2
        L36:
            webcast.data.cohost_biz.BizPermitJoinGroupParams r10 = new webcast.data.cohost_biz.BizPermitJoinGroupParams
            r10.<init>()
            r10.replyStatus = r15
            X.0awu r2 = new X.0awu
            r2.<init>(r3, r5, r7, r9, r10, r11)
            r1 = 0
            com.bytedance.android.livesdk.model.message.linkcore.LinkLayerMessage r0 = r13.linkLayerMessage
            X.C955430ayD.LJ(r1, r15, r5, r0)
            X.0ax3 r0 = new X.0ax3
            r0.<init>()
            r12.LLF(r2, r0)
        L50:
            return
        L51:
            r5 = 0
            if (r1 == 0) goto L56
            goto L2a
        L56:
            r3 = 0
            if (r1 == 0) goto L32
            goto L30
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C954430awb.LJIIIIZZ(X.0awC, com.bytedance.android.livesdk.comp.api.linkcore.model.InviteGroupMessage, java.lang.String, int):void");
    }

    public static void LIZLLL(C954430awb c954430awb, long j, InterfaceC954900axM interfaceC954900axM, String str, AwS259S0300000_15 awS259S0300000_15, Function1 function1, int i) {
        if ((i & 8) != 0) {
            str = "";
        }
        if ((i & 16) != 0) {
            awS259S0300000_15 = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        c954430awb.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleApplyIMConflictRecrod");
        sbLIZ.append(" source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiHostConflictManager", C2188811AlT.LIZIZ(sbLIZ));
        Pair pairLJI = C500260Jjc.LJI(c954430awb.LIZIZ, new AwS30S0000100_15(j, 14));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleApplyIMConflictRecrod");
        sbLIZ2.append(" handled userId: ");
        sbLIZ2.append(j);
        sbLIZ2.append(", conflict record = ");
        sbLIZ2.append(pairLJI.getFirst());
        sbLIZ2.append(", index = ");
        sbLIZ2.append(((Number) pairLJI.getSecond()).intValue());
        sbLIZ2.append(" conflict queue = ");
        sbLIZ2.append(C954690ax1.LIZ(c954430awb.LIZIZ));
        sbLIZ2.append(", source = ");
        sbLIZ2.append(str);
        C20441214yg.LJIIIZ("MultiHostConflictManager", C2188811AlT.LIZIZ(sbLIZ2));
        if (pairLJI.getFirst() != null) {
            C19719512Dh.LIZ(c954430awb.LIZIZ).remove(pairLJI.getFirst());
            if (((Number) pairLJI.getSecond()).intValue() == 0) {
                if (awS259S0300000_15 != null) {
                    awS259S0300000_15.invoke();
                }
                c954430awb.LJI(interfaceC954900axM, null, new AwS594S0100000_15(function1, (Function1<? super PosIdentity, Unit>) 1077));
            }
            c954430awb.LJIIIZ("handleApplyIMConflictRecrod");
        }
    }

    public static void LJFF(C954430awb c954430awb, long j, InterfaceC954180awC interfaceC954180awC, boolean z, String str, AwS259S0300000_15 awS259S0300000_15, Function1 function1, int i) {
        if ((i & 4) != 0) {
            z = false;
        }
        if ((i & 8) != 0) {
            str = "";
        }
        C954570awp c954570awp = null;
        if ((i & 16) != 0) {
            awS259S0300000_15 = null;
        }
        if ((i & 32) != 0) {
            function1 = null;
        }
        c954430awb.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handleInviteIMConflictRecord");
        sbLIZ.append(" source = ");
        sbLIZ.append(str);
        C20441214yg.LIZIZ("MultiHostConflictManager", C2188811AlT.LIZIZ(sbLIZ));
        Pair pairLJI = C500260Jjc.LJI(c954430awb.LIZIZ, new AwS30S0000100_15(j, 15));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handleInviteIMConflictRecord");
        sbLIZ2.append(" handled userId: ");
        sbLIZ2.append(j);
        sbLIZ2.append(", conflict record = ");
        sbLIZ2.append(pairLJI.getFirst());
        sbLIZ2.append(", index = ");
        sbLIZ2.append(((Number) pairLJI.getSecond()).intValue());
        sbLIZ2.append(" conflict queue = ");
        sbLIZ2.append(C954690ax1.LIZ(c954430awb.LIZIZ));
        sbLIZ2.append(", source = ");
        sbLIZ2.append(str);
        C20441214yg.LJIIIZ("MultiHostConflictManager", C2188811AlT.LIZIZ(sbLIZ2));
        if (pairLJI.getFirst() != null) {
            C19719512Dh.LIZ(c954430awb.LIZIZ).remove(pairLJI.getFirst());
            if (((Number) pairLJI.getSecond()).intValue() == 0) {
                if (awS259S0300000_15 != null) {
                    awS259S0300000_15.invoke();
                }
                if (z) {
                    c954570awp = (C954570awp) pairLJI.getFirst();
                }
                c954430awb.LJI(interfaceC954180awC, c954570awp, new AwS594S0100000_15(function1, (Function1<? super PosIdentity, Unit>) 1078));
            }
            c954430awb.LJIIIZ("handleInviteIMConflictRecord");
        }
    }
}
