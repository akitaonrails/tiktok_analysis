package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;
import kotlin.jvm.internal.AFwS229S0000000_2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.06DJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06DJ {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(String str, StreakPetData streakPetData, EnumC1579606Gk enumC1579606Gk, StreakData streakData) {
        boolean z;
        EnumC1579606Gk enumC1579606GkLJIIIIZZ;
        if (streakData != null && C1567806Bw.LJFF(streakData)) {
            z = true;
        } else {
            z = false;
        }
        if ((z && streakPetData.isHidden) || ((C1571306Df.LJI(streakPetData) && streakPetData.isEggHidden) || streakPetData.status == EnumC1578506Fz.StreakPetStatus_Inactive.getValue())) {
            return 3;
        }
        if (C1571306Df.LJIIIIZZ(streakPetData) && (streakData == null || !C1567806Bw.LJFF(streakData))) {
            return 3;
        }
        String str2 = streakPetData.streakPetAnimState;
        if (C1571306Df.LJI(streakPetData) && streakPetData.subStatus == EnumC1571406Dg.StreakPetSubStatus_Hatching2.getValue() && Intrinsics.LJFF(str2, "hatching_upgrade")) {
            C1569106Cj.LJ.getClass();
            C1569106Cj c1569106Cj = C1569106Cj.LJI;
            C23250099c.LIZLLL(c1569106Cj.LIZ, null, null, new C15526066a(c1569106Cj, str, AFwS229S0000000_2.get$arr$(553), null), 3);
            return 6;
        }
        if (Intrinsics.LJFF(str2, "enter")) {
            C1569106Cj.LJ.getClass();
            C1569106Cj c1569106Cj2 = C1569106Cj.LJI;
            C23250099c.LIZLLL(c1569106Cj2.LIZ, null, null, new C15526066a(c1569106Cj2, str, AFwS229S0000000_2.get$arr$(554), null), 3);
            return 5;
        }
        if (enumC1579606Gk == null) {
            enumC1579606Gk = EnumC1579606Gk.INVALID;
        }
        if (streakData != null) {
            enumC1579606GkLJIIIIZZ = C1567806Bw.LJIIIIZZ(streakData, false);
        } else {
            enumC1579606GkLJIIIIZZ = null;
        }
        if (u.LJJIIJZLJL(str2, "level__", false)) {
            if (enumC1579606GkLJIIIIZZ != EnumC1579606Gk.ACTIVE) {
                return 2;
            }
            C1569106Cj.LJ.getClass();
            C1569106Cj c1569106Cj3 = C1569106Cj.LJI;
            C23250099c.LIZLLL(c1569106Cj3.LIZ, null, null, new C15526066a(c1569106Cj3, str, AFwS229S0000000_2.get$arr$(555), null), 3);
            return 4;
        }
        EnumC1579606Gk enumC1579606Gk2 = EnumC1579606Gk.ACTIVE;
        if ((enumC1579606Gk != enumC1579606Gk2 || enumC1579606GkLJIIIIZZ == enumC1579606Gk2) && (enumC1579606Gk == enumC1579606Gk2 || enumC1579606GkLJIIIIZZ != enumC1579606Gk2)) {
            return 1;
        }
        return 2;
    }
}
