package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;

/* JADX INFO: renamed from: X.0pGA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1504720pGA {
    public static final C1504720pGA LIZ = new C1504720pGA();

    public static long LIZ() {
        String strLIZ = C2195221Avo.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("minis_3d_local_storage_");
        sbLIZ.append(strLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva kevaLIZIZ = LIZIZ();
        if (kevaLIZIZ == null) {
            int i = C2187451AjH.LIZ;
            return 0L;
        }
        long j = kevaLIZIZ.getLong(strLIZIZ, 0L);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getCurrentStorageSize, key:");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", value:");
        sbLIZ2.append(j);
        C2188811AlT.LIZIZ(sbLIZ2);
        return j;
    }

    public static Keva LIZIZ() {
        String strLIZJ = LIZJ();
        if (strLIZJ == null || strLIZJ.length() == 0) {
            int i = C2187451AjH.LIZ;
            return null;
        }
        Keva repoWithPath = KevaImpl.getRepoWithPath("minis_local_storage", strLIZJ, 1, true);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getKevaRepo, keva:");
        sbLIZ.append(repoWithPath);
        C2188811AlT.LIZIZ(sbLIZ);
        return repoWithPath;
    }

    public static String LIZJ() {
        AccountUserService accountUserServiceLJIIJ;
        String strLIZ = C2195221Avo.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("minis/");
        sbLIZ.append(strLIZ);
        sbLIZ.append("/data/");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        IAccountService iAccountService = (IAccountService) ServiceManager.get().getService(IAccountService.class);
        String curUserId = (iAccountService == null || (accountUserServiceLJIIJ = iAccountService.LJIIJ()) == null) ? null : accountUserServiceLJIIJ.getCurUserId();
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("getUserId, curUserId:");
        sbLIZ2.append(curUserId);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (curUserId == null || curUserId.length() == 0) {
            return null;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(strLIZIZ);
        sbLIZ3.append(curUserId);
        sbLIZ3.append('/');
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("getRelatiPath, relatiPath:");
        sbLIZ4.append(strLIZIZ2);
        C2188811AlT.LIZIZ(sbLIZ4);
        return strLIZIZ2;
    }

    public static void LIZLLL(String str) {
        int length;
        Integer numValueOf;
        long jLIZ = LIZ();
        if (str != null) {
            length = str.length();
        } else {
            length = 0;
        }
        long j = jLIZ - ((long) length);
        if (j <= 0) {
            int i = C2187451AjH.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("minusSize, encounter error, calculateSize:");
            sbLIZ.append(j);
            C2188811AlT.LIZIZ(sbLIZ);
            j = 0;
        }
        LJ(j);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("minusSize, value size:");
        if (str != null) {
            numValueOf = Integer.valueOf(str.length());
        } else {
            numValueOf = null;
        }
        sbLIZ2.append(numValueOf);
        sbLIZ2.append(", calculateSize:");
        sbLIZ2.append(j);
        C2188811AlT.LIZIZ(sbLIZ2);
    }

    public static void LJ(long j) {
        String strLIZ = C2195221Avo.LIZ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("minis_3d_local_storage_");
        sbLIZ.append(strLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Keva kevaLIZIZ = LIZIZ();
        if (kevaLIZIZ == null) {
            int i = C2187451AjH.LIZ;
            return;
        }
        kevaLIZIZ.storeLong(strLIZIZ, j);
        int i2 = C2187451AjH.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("setCurrentStorageSize, key:");
        sbLIZ2.append(strLIZIZ);
        sbLIZ2.append(", value:");
        sbLIZ2.append(j);
        C2188811AlT.LIZIZ(sbLIZ2);
    }
}
