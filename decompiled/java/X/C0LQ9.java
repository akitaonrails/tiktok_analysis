package X;

import com.ss.android.ugc.aweme.creative.model.CreativeModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0LQ9, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQ9 {
    public static final C0LQ9 LIZ = new C0LQ9();

    public final void LJ(CreativeModel creativeModel) {
        LIZJ(this, creativeModel, C0LQ8.CHECK_VALIDITY_PASS, 1, 0, null, null, 120);
    }

    public final void LJI(CreativeModel creativeModel) {
        LIZJ(this, creativeModel, C0LQ8.DB_SAVE_PASS, 1, 0, null, null, 120);
    }

    public final void LJIIIZ(CreativeModel creativeModel) {
        LIZJ(this, creativeModel, C0LQ8.SAVE_FILE_PASS, 1, 0, null, null, 120);
    }

    public final void LJIIJJI(CreativeModel creativeModel) {
        LIZJ(this, creativeModel, C0LQ8.PRE_PROCESS_PASS, 1, 0, null, null, 120);
    }

    public static void LIZIZ(String str, CreativeModel creativeModel) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("landing_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map mapLIZJ = C2097908Jt.LIZJ(new Pair("landing_page", str));
        Map mapLJ = C2097608Jq.LJ();
        C547410LdT c547410LdT = C547410LdT.LIZ;
        EnumC543480LTe enumC543480LTe = EnumC543480LTe.RESTORE;
        c547410LdT.getClass();
        C547410LdT.LIZJ(creativeModel, enumC543480LTe, strLIZIZ, 1, 0, "", mapLIZJ, mapLJ);
    }

    public final void LIZLLL(CreativeModel creativeModel, int i) {
        LIZJ(this, creativeModel, C0LQ8.CHECK_VALIDITY_FAIL, 0, i, null, null, 112);
    }

    public final void LJFF(CreativeModel creativeModel, int i) {
        LIZJ(this, creativeModel, C0LQ8.DB_SAVE_FAIL, 0, i, null, null, 112);
    }

    public final void LJII(String str, CreativeModel creativeModel) {
        LIZJ(this, creativeModel, C0LQ8.SAVE_EXCEPTION, 0, 0, str, null, 104);
    }

    public final void LJIIIIZZ(CreativeModel creativeModel, int i) {
        LIZJ(this, creativeModel, C0LQ8.SAVE_FILE_FAIL, 0, i, null, null, 112);
    }

    public final void LJIIJ(CreativeModel creativeModel, int i) {
        LIZJ(this, creativeModel, C0LQ8.PRE_PROCESS_FAIL, 0, i, null, null, 112);
    }

    public static void LIZ(C0LQ9 c0lq9, CreativeModel creativeModel, C0LQ3 c0lq3, int i, int i2, String str, Map map, int i3) {
        Map mapLJ;
        Map mapLJ2 = map;
        String str2 = str;
        int i4 = i2;
        if ((i3 & 8) != 0) {
            i4 = 0;
        }
        if ((i3 & 16) != 0) {
            str2 = "";
        }
        if ((i3 & 32) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        if ((i3 & 64) != 0) {
            mapLJ2 = C2097608Jq.LJ();
        }
        c0lq9.getClass();
        String branchName = c0lq3.getBranchName();
        C547410LdT c547410LdT = C547410LdT.LIZ;
        EnumC543480LTe enumC543480LTe = EnumC543480LTe.RESTORE;
        c547410LdT.getClass();
        C547410LdT.LIZJ(creativeModel, enumC543480LTe, branchName, i, i4, str2, mapLJ, mapLJ2);
    }

    public static void LIZJ(C0LQ9 c0lq9, CreativeModel creativeModel, C0LQ8 c0lq8, int i, int i2, String str, Map map, int i3) {
        Map mapLJ;
        Map mapLJ2 = map;
        String str2 = str;
        int i4 = i2;
        if ((i3 & 8) != 0) {
            i4 = 0;
        }
        if ((i3 & 16) != 0) {
            str2 = "";
        }
        if ((i3 & 32) != 0) {
            mapLJ = C2097608Jq.LJ();
        } else {
            mapLJ = null;
        }
        if ((i3 & 64) != 0) {
            mapLJ2 = C2097608Jq.LJ();
        }
        c0lq9.getClass();
        C547410LdT c547410LdT = C547410LdT.LIZ;
        EnumC543480LTe enumC543480LTe = EnumC543480LTe.SAVE;
        String branchName = c0lq8.getBranchName();
        c547410LdT.getClass();
        C547410LdT.LIZJ(creativeModel, enumC543480LTe, branchName, i, i4, str2, mapLJ, mapLJ2);
    }
}
