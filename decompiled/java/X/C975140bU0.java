package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.DisabledMatchTypesParams;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchBeanInviteCapsuleNoEduSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchPermissionSetting;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bU0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C975140bU0 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LJFF() {
        return C915980Zwa.LIZIZ().Dn0().isCatchBean() && C915980Zwa.LIZIZ().JV1(false).isInProcess();
    }

    public static boolean LJI() {
        return C915980Zwa.LJFF().mz1();
    }

    public static boolean LJII() {
        return C915980Zwa.LIZIZ().Dn0().isTakeTheStage() && C915980Zwa.LIZIZ().JV1(false).isInProcess();
    }

    public static boolean LIZ(EnumC962960bAM enumC962960bAM, String str) {
        int i = C962980bAO.LIZ[enumC962960bAM.ordinal()];
        if (i == 1 ? !(Intrinsics.LJFF(str, "pk_icon") || Intrinsics.LJFF(str, "pk_guide") || (LiveMatchBeanInviteCapsuleNoEduSetting.INSTANCE.isEnable() && Intrinsics.LJFF(str, "catch_bean_capsule_guide"))) : !(i == 2 ? Intrinsics.LJFF(str, "pk_icon") || Intrinsics.LJFF(str, "pk_guide") || Intrinsics.LJFF(str, "catch_bean_capsule_guide") : (i == 3 || i == 4 || i == 5) && (Intrinsics.LJFF(str, "plaza_icon") || Intrinsics.LJFF(str, "catch_bean_capsule_guide")))) {
            if (!LJ(enumC962960bAM, null)) {
                return false;
            }
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isHitEntryControl: bizType ");
        sbLIZ.append(enumC962960bAM);
        sbLIZ.append(", clickFrom ");
        sbLIZ.append(str);
        C20441214yg.LJIIIZ("CompetitionAvailableHelper", C2188811AlT.LIZIZ(sbLIZ));
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0064  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZIZ(X.EnumC919170a1j r7, kotlin.jvm.functions.Function1 r8) {
        /*
            X.0bAL r0 = X.EnumC962960bAM.Companion
            r0.getClass()
            X.0bAM r1 = X.C962950bAL.LIZLLL(r7)
            boolean r0 = r1.isMatch()
            r5 = 0
            r3 = 1
            if (r0 == 0) goto L2b
            boolean r0 = LJII()
            if (r0 == 0) goto L22
            X.0bU1 r0 = X.EnumC975150bU1.NO_MATCH_WHEN_IN_TAKE_STAGE
        L19:
            if (r8 == 0) goto L1e
            r8.invoke(r0)
        L1e:
            r6 = 0
            if (r0 == 0) goto L66
            return r3
        L22:
            boolean r0 = LJFF()
            if (r0 == 0) goto L64
            X.0bU1 r0 = X.EnumC975150bU1.NO_MATCH_WHEN_IN_CATCH_BEAN
            goto L19
        L2b:
            boolean r0 = r1.isTakeTheStage()
            if (r0 == 0) goto L3a
            boolean r0 = LJI()
            if (r0 == 0) goto L3a
            X.0bU1 r0 = X.EnumC975150bU1.NO_TAKE_STAGE_WHEN_IN_MATCH
            goto L19
        L3a:
            boolean r0 = r1.isCatchBean()
            if (r0 == 0) goto L64
            boolean r0 = LJI()
            if (r0 == 0) goto L49
            X.0bU1 r0 = X.EnumC975150bU1.NO_CATCH_BEAN_WHEN_IN_MATCH
            goto L19
        L49:
            boolean r0 = LJII()
            if (r0 == 0) goto L52
            X.0bU1 r0 = X.EnumC975150bU1.NO_CATCH_BEAN_WHEN_IN_TAKE_STAGE
            goto L19
        L52:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r0 = r0.LLILZLL(r3)
            int r1 = r0.size()
            r0 = 2
            if (r1 == r0) goto L64
            X.0bU1 r0 = X.EnumC975150bU1.NO_CATCH_BEAN_WHEN_IN_WRONG_COHOST_NUM
            goto L19
        L64:
            r0 = r5
            goto L19
        L66:
            X.0bAM r0 = X.C962950bAL.LIZLLL(r7)
            boolean r0 = LJ(r0, r8)
            if (r0 == 0) goto L71
            return r3
        L71:
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r4 = r0.LJIJJ()
            com.bytedance.android.live.liveinteract.multihost.core.service.IMultiHostService r0 = X.C915980Zwa.LJII()
            java.util.List r2 = r0.LLILZLL(r3)
            boolean r0 = r4.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lc0
            boolean r0 = r2.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto Lc0
            int r1 = r2.size()
            int r0 = r4.size()
            if (r1 == r0) goto Lc0
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "someone inviting/applying, linkingUsers = "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r0 = " , linkedList = "
            r1.append(r0)
            r1.append(r2)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.String r0 = "CompetitionAvailableHelper"
            X.C20441214yg.LJ(r0, r1)
            if (r8 == 0) goto Lbf
            X.0bU1 r0 = X.EnumC975150bU1.IN_COHOST_INVITING_OR_APPLYING
            r8.invoke(r0)
        Lbf:
            return r3
        Lc0:
            if (r8 == 0) goto Lc5
            r8.invoke(r5)
        Lc5:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C975140bU0.LIZIZ(X.0a1j, kotlin.jvm.functions.Function1):boolean");
    }

    public static boolean LIZJ(EnumC962960bAM enumC962960bAM, String str) {
        if (!Intrinsics.LJFF(str, "pk_icon") && !Intrinsics.LJFF(str, "pk_guide") && !Intrinsics.LJFF(str, "1v1v1_guide") && !Intrinsics.LJFF(str, "lynx_fallback") && !Intrinsics.LJFF(str, "playbook_match")) {
            if ((Intrinsics.LJFF(str, EnumC975850bV9.CANCEL_AFTER_INVITE.getSource()) || Intrinsics.LJFF(str, EnumC975850bV9.INVITE_REQUEST_FAILED.getSource())) && enumC962960bAM == EnumC962960bAM.MATCH_INDIVIDUAL) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(EnumC962960bAM enumC962960bAM, String str) {
        if (!Intrinsics.LJFF(str, "plaza_icon") && !Intrinsics.LJFF(str, "take_stage_guide") && !Intrinsics.LJFF(str, "catch_bean_guide")) {
            if (Intrinsics.LJFF(str, EnumC975850bV9.CANCEL_AFTER_INVITE.getSource()) || Intrinsics.LJFF(str, EnumC975850bV9.INVITER_TIMEOUT.getSource()) || Intrinsics.LJFF(str, EnumC975850bV9.INVITEE_REJECT_BUTTON_CLICK.getSource()) || Intrinsics.LJFF(str, EnumC975850bV9.INVITEE_TIMEOUT.getSource())) {
                if (enumC962960bAM == EnumC962960bAM.CATCH_BEANS || enumC962960bAM == EnumC962960bAM.TAKE_THE_STAGE) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static boolean LJ(EnumC962960bAM enumC962960bAM, Function1 function1) {
        HashMap<Integer, ArrayList<Integer>> map;
        ArrayList<Integer> arrayList;
        EnumC975150bU1 enumC975150bU1;
        EnumC975150bU1 enumC975150bU12;
        if (!C948770anT.LJ()) {
            if (function1 != null) {
                function1.invoke(null);
            }
            return false;
        }
        int iUh = C915980Zwa.LJII().Uh();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("isHitPermissionControl: bizType: ");
        sbLIZ.append(enumC962960bAM);
        sbLIZ.append(", currentLinkerMode: ");
        sbLIZ.append(iUh);
        C20441214yg.LJIIIZ("CompetitionAvailableHelper", C2188811AlT.LIZIZ(sbLIZ));
        DisabledMatchTypesParams value = LiveMatchPermissionSetting.INSTANCE.getValue();
        if (value != null && (map = value.disabledMatchTypesForLinkerMode) != null && (arrayList = map.get(Integer.valueOf(iUh))) != null) {
            Iterator<Integer> it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (enumC962960bAM.getType() == it2.next().intValue()) {
                    C20441214yg.LJIIIZ("CompetitionAvailableHelper", "isHitPermissionControl: from client setting");
                    int i = C962980bAO.LIZ[enumC962960bAM.ordinal()];
                    if (i != 1) {
                        if (i != 2) {
                            if (function1 != null) {
                                function1.invoke(EnumC975150bU1.NO_PERMISSION_BY_SETTING);
                            }
                        } else if (function1 != null) {
                            if (iUh == 3) {
                                enumC975150bU12 = EnumC975150bU1.NO_TAKE_STAGE_WHEN_IN_MG_AND_COHOST;
                            } else {
                                enumC975150bU12 = EnumC975150bU1.NO_PERMISSION_BY_SETTING;
                            }
                            function1.invoke(enumC975150bU12);
                            return true;
                        }
                    } else if (function1 != null) {
                        if (iUh == 3) {
                            enumC975150bU1 = EnumC975150bU1.NO_CATCH_BEAN_WHEN_IN_MG_AND_COHOST;
                        } else {
                            enumC975150bU1 = EnumC975150bU1.NO_PERMISSION_BY_SETTING;
                        }
                        function1.invoke(enumC975150bU1);
                        return true;
                    }
                    return true;
                }
            }
        }
        if (function1 != null) {
            function1.invoke(null);
        }
        return false;
    }
}
