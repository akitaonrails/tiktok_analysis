package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.impl.utils.StreakLocalExtHelper;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS119S1200000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06BM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06BM implements InterfaceC1566906Bn {
    @Override // X.InterfaceC884050YmB
    public final String LIZ() {
        return "streak_unlock_anim_trigger";
    }

    @Override // X.InterfaceC1566906Bn
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1566906Bn, X.InterfaceC884050YmB
    public final void LIZJ(InterfaceC884020Ym8 interfaceC884020Ym8, List<? extends InterfaceC884440Ymo> list, boolean z, String str) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void LIZLLL(String str, StreakData streakData, StreakData streakData2) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void LJI(EnumC1578206Fw enumC1578206Fw, String str, StreakData streakData, EnumC1578706Gb enumC1578706Gb) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void LLLIILIL(C1574906Ep c1574906Ep) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void LLLJIL(String str) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void d5(List<C869590Y9l> list, int i, C0Y7P c0y7p) {
    }

    @Override // X.InterfaceC1566906Bn
    public final void g(String str) {
    }

    public static void LJII(String str) {
        if (!C06FS.LIZ().enableUnlockAnim) {
            return;
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1565406Ay(str, null), 3);
    }

    @Override // X.InterfaceC1566906Bn
    public final void LJFF(String str) {
        LJII(str);
    }

    public static boolean LJIIIIZZ(String str, String str2, StreakData streakData, StreakData streakData2) {
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        EnumC1579606Gk enumC1579606GkLJIIIIZZ2;
        String str3 = null;
        if (!C06FS.LIZ().enableUnlockAnim) {
            if (streakData2 != null) {
                str3 = streakData2.serverMsgId;
            }
            C06BS.LIZ(str3, "enableUnlockAnim=false");
            return false;
        }
        if (streakData != null) {
            enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData, true);
        } else {
            enumC1579606GkLJIIIIZZ = null;
        }
        if (streakData2 != null) {
            enumC1579606GkLJIIIIZZ2 = C1567806Bw.LJIIIIZZ(streakData2, true);
        } else {
            enumC1579606GkLJIIIIZZ2 = null;
        }
        EnumC1579606Gk enumC1579606Gk = EnumC1579606Gk.ACTIVE;
        if (enumC1579606GkLJIIIIZZ != enumC1579606Gk && enumC1579606GkLJIIIIZZ2 == enumC1579606Gk) {
            if (Intrinsics.LJFF(str2, "streak_restore")) {
                C06BS.LIZ(streakData2.serverMsgId, "scene is MSG_SCENE_STREAK_RESTORE");
                return false;
            }
            if (C13LP.LJJJJ(str2, C1697810uHb.LJIIJJI("streak_group_recover", "streak_group_end_with_restore")) && C1567806Bw.LIZIZ(str) == AbstractC1711506n3.LIZIZ) {
                C1590906Kt.LIZ("StreakTriggers: triggerUnlockAnim: don't play unlock anim in group chat when restoring streak");
                C06BS.LIZ(streakData2.serverMsgId, "don't play unlock anim in group chat when restoring streak");
                return false;
            }
            boolean z = C1590906Kt.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("StreakTriggers: triggerUnlockAnim: convId=");
            sbLIZ.append(str);
            C1590906Kt.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            StreakLocalExtHelper.LIZ.getClass();
            StreakLocalExtHelper.LIZ(new AwS119S1200000_2(streakData2, (Integer) null, str, 3));
            C06BS.LIZ(streakData2.serverMsgId, "triggerUnlockAnim success");
            return true;
        }
        boolean z2 = C1590906Kt.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("StreakTriggers: triggerUnlockAnim: streak status is not expected, oldStreakStatus=");
        sbLIZ2.append(enumC1579606GkLJIIIIZZ);
        sbLIZ2.append(" newStreakStatus=");
        sbLIZ2.append(enumC1579606GkLJIIIIZZ2);
        C1590906Kt.LIZIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (streakData2 != null) {
            str3 = streakData2.serverMsgId;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("streak status is not expected, oldStreakStatus=");
        sbLIZ3.append(enumC1579606GkLJIIIIZZ);
        sbLIZ3.append(" newStreakStatus=");
        sbLIZ3.append(enumC1579606GkLJIIIIZZ2);
        C06BS.LIZ(str3, C2188811AlT.LIZIZ(sbLIZ3));
        return false;
    }

    @Override // X.InterfaceC1566906Bn
    public final void LJ(C06BD c06bd, EnumC1567006Bo enumC1567006Bo, String str, StreakData streakData, StreakData streakData2, Map<String, String> map) {
        String strLIZ = C1566206Bg.LIZ(streakData2);
        if (c06bd == C06BD.StreakCmdStart) {
            C06B8 c06b8 = C06B8.LIZIZ;
            C06BK c06bk = new C06BK(strLIZ, C06BT.FULL_ANIMATION, streakData2);
            C06BO c06bo = new C06BO(streakData2, c06bd, enumC1567006Bo, this, strLIZ, str, streakData, null);
            c06b8.getClass();
            C06B8.LIZ(c06bk, c06bo);
            return;
        }
        if (c06bd == C06BD.StreakCmdUpdate) {
            if (enumC1567006Bo == EnumC1567006Bo.LightMilestoneStreak) {
                C06B8 c06b82 = C06B8.LIZIZ;
                C06BK c06bk2 = new C06BK(strLIZ, C06BT.FULL_ANIMATION, streakData2);
                C06BP c06bp = new C06BP(streakData2, c06bd, enumC1567006Bo, this, strLIZ, str, streakData, null);
                c06b82.getClass();
                C06B8.LIZ(c06bk2, c06bp);
                return;
            }
            C06B8 c06b83 = C06B8.LIZIZ;
            C06BK c06bk3 = new C06BK(strLIZ, C06BT.FULL_ANIMATION, streakData2);
            C06BN c06bn = new C06BN(streakData2, c06bd, enumC1567006Bo, this, strLIZ, streakData, null);
            c06b83.getClass();
            C06B8.LIZ(c06bk3, c06bn);
            return;
        }
        if (c06bd != C06BD.StreakCmdEnd) {
            return;
        }
        String str2 = streakData2.convId;
        if (str2 == null) {
            str2 = "";
        }
        LJII(str2);
    }
}
