package X;

import com.ss.android.ugc.aweme.im.streak.api.StreakData;
import com.ss.android.ugc.aweme.im.streak.api.pet.StreakPetData;

/* JADX INFO: renamed from: X.06Fg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1576606Fg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ(String str, C06G9 c06g9, String str2, C1576706Fh c1576706Fh) {
        String strLIZIZ;
        String strLIZIZ2 = null;
        if (c06g9 != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("panelEntrance = ");
            sbLIZ.append(c06g9);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = null;
        }
        if (c1576706Fh != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("panelData = ");
            sbLIZ2.append(c1576706Fh);
            strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        }
        boolean z = C1590806Ks.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("StreakPanelRouter msg=");
        sbLIZ3.append(str);
        sbLIZ3.append(" convId=");
        sbLIZ3.append(str2);
        sbLIZ3.append(" entranceInfo=");
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(" dataInfo=");
        sbLIZ3.append(strLIZIZ2);
        C1590806Ks.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static C066X LIZLLL(String str, StreakData streakData, StreakPetData streakPetData, C1576706Fh c1576706Fh) {
        if (C1567806Bw.LJ(streakData)) {
            return LIZ(c1576706Fh, streakData, C06ET.LIZIZ, streakPetData, str);
        }
        if (C1567806Bw.LIZLLL(streakData) && streakPetData != null && streakPetData.status == EnumC1578506Fz.StreakPetStatus_Active.getValue()) {
            return LIZIZ(c1576706Fh, streakData, C06ET.LJI, streakPetData, str);
        }
        return null;
    }

    public static C066X LJ(String str, StreakData streakData, StreakPetData streakPetData, C1576706Fh c1576706Fh) {
        if (C1567806Bw.LJ(streakData)) {
            return LIZ(c1576706Fh, streakData, C06ET.LIZIZ, streakPetData, str);
        }
        if (C1567806Bw.LIZLLL(streakData) && streakPetData != null && streakPetData.status == EnumC1578506Fz.StreakPetStatus_Active.getValue()) {
            return LIZIZ(c1576706Fh, streakData, C06ET.LJFF, streakPetData, str);
        }
        return null;
    }

    public static C1576906Fj LIZ(C1576706Fh c1576706Fh, StreakData streakData, C06ET c06et, StreakPetData streakPetData, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("panel router result=");
        sbLIZ.append(c06et.LIZ);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), null, str, c1576706Fh);
        return new C1576906Fj(c06et, str, streakData, streakPetData, c1576706Fh.LIZIZ, c1576706Fh.LIZJ, c1576706Fh.LJI, c1576706Fh.LJ);
    }

    public static C06EK LIZIZ(C1576706Fh c1576706Fh, StreakData streakData, C06ET c06et, StreakPetData streakPetData, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("panel router result=");
        sbLIZ.append(c06et.LIZ);
        LIZJ(C2188811AlT.LIZIZ(sbLIZ), null, str, c1576706Fh);
        C06C6.LIZIZ.getClass();
        C06C7<C1569306Cl> c06c7 = C06C6.LJFF;
        synchronized (c06c7) {
            c06c7.LIZIZ.LIZJ(str);
        }
        return new C06EK(c06et, str, streakData, streakPetData, c1576706Fh.LIZLLL, c1576706Fh.LIZIZ, c1576706Fh.LJ, c1576706Fh.LJFF, c1576706Fh.LJIIIIZZ, c1576706Fh.LJIIIZ);
    }
}
