package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.utils.AVLog;
import java.lang.ref.WeakReference;
import java.util.UUID;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0jNo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1278820jNo {
    public final LiveSdkSetting LIZ;
    public final C1278910jNx LIZIZ;
    public final C1278800jNm LIZJ;
    public String[] LIZLLL = new String[0];
    public int LJ;
    public long LJFF;
    public final String LJI;
    public long LJII;
    public String LJIIIIZZ;

    public final String LIZIZ() {
        if (this.LIZLLL.length != 0) {
            String str = null;
            if (!false) {
                while (true) {
                    int i = this.LJ;
                    String[] strArr = this.LIZLLL;
                    if (i >= strArr.length) {
                        break;
                    }
                    str = strArr[i];
                    if (!TextUtils.isEmpty(str)) {
                        break;
                    }
                    this.LJ++;
                }
                if (str != null) {
                    return str;
                }
            }
        }
        return "";
    }

    public final String LIZLLL() {
        if (TextUtils.isEmpty(this.LJI)) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LJI);
        sbLIZ.append('.');
        sbLIZ.append(this.LJFF);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LJ() {
        C1278800jNm c1278800jNm = this.LIZJ;
        String strLIZIZ = LIZIZ();
        c1278800jNm.getClass();
        if (TextUtils.isEmpty(strLIZIZ)) {
            return;
        }
        c1278800jNm.LJIIJJI = false;
        c1278800jNm.LJIIL = "";
        if (!c1278800jNm.LJ) {
            AVLog.ioi("VeLiveNodeOptimize", "StrategyDns is disabled");
            c1278800jNm.LJIIJ = false;
        }
        if (c1278800jNm.LJIIJ && "INVALID_OPT_URL".equals(c1278800jNm.LJFF.get(strLIZIZ))) {
            c1278800jNm.LJIIJ = false;
        }
        if (c1278800jNm.LJIIJ) {
            try {
                String[] strArrLIZIZ = c1278800jNm.LIZIZ(strLIZIZ);
                if (TextUtils.isEmpty(strArrLIZIZ[0])) {
                    return;
                }
                c1278800jNm.LJFF.put(strLIZIZ, strArrLIZIZ[0]);
                c1278800jNm.LJIIJJI = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Dns optimize hit: optimized url ");
                sbLIZ.append(strArrLIZIZ[0]);
                sbLIZ.append(", evaluate symbol ");
                sbLIZ.append(strArrLIZIZ[1]);
                sbLIZ.append("mDnsOptOpen: ");
                sbLIZ.append(c1278800jNm.LJIIJ);
                sbLIZ.append("mDnsOptHit: true");
                AVLog.ioi("VeLiveNodeOptimize", C2188811AlT.LIZIZ(sbLIZ));
                String str = strArrLIZIZ[1];
                c1278800jNm.LJIIL = str;
                if (TextUtils.isEmpty(str)) {
                    c1278800jNm.LJIIL = "sdk_previous_dns";
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ() {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1278820jNo.LIZ():java.lang.String");
    }

    public final String LIZJ() {
        String strLIZIZ = LIZIZ();
        this.LIZJ.getClass();
        if (!(TextUtils.isEmpty(strLIZIZ) ? false : !strLIZIZ.equals(r1.LIZJ(strLIZIZ)))) {
            return null;
        }
        try {
            return strLIZIZ.substring(0, a0.LJJJJ(strLIZIZ, '/', 0, 6) + 1);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }

    public C1278820jNo(LiveSdkSetting liveSdkSetting, C1278910jNx c1278910jNx) {
        this.LIZ = liveSdkSetting;
        this.LIZIZ = c1278910jNx;
        this.LIZJ = new C1278800jNm(this.LIZ, this.LIZIZ);
        c1278910jNx.getClass();
        c1278910jNx.LJIIL = new WeakReference<>(this);
        String str = liveSdkSetting.commonParams.sessionId;
        this.LJI = TextUtils.isEmpty(str) ? u.LJJIFFI(UUID.randomUUID().toString(), "-", "", false) : str;
    }

    public static String LJFF(int i, String str, String str2) {
        String strSubstring;
        int iLJJJ = a0.LJJJ(str2, "://", 0, false, 6);
        if (iLJJJ > 0) {
            str2 = str2.substring(iLJJJ + 3);
        }
        int iLJJJ2 = a0.LJJJ(str2, "/", 0, false, 4);
        int iLJJJ3 = a0.LJJJ(str2, ":", 0, false, 4);
        if (iLJJJ2 > 0) {
            if (iLJJJ3 <= 0) {
                iLJJJ3 = iLJJJ2;
            }
            String strSubstring2 = str2.substring(0, iLJJJ3);
            strSubstring = str2.substring(iLJJJ2);
            str2 = strSubstring2;
        } else {
            strSubstring = "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(str2);
        sbLIZ.append(':');
        sbLIZ.append(i);
        sbLIZ.append(strSubstring);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
