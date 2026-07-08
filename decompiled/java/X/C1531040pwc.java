package X;

import android.app.Application;
import com.bytedance.forest.chain.fetchers.BuiltinFetcher;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0pwc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531040pwc {
    public static String LIZJ(C1533510q0b c1533510q0b) {
        c1533510q0b.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c1533510q0b.LIZIZ);
        sbLIZ.append('/');
        sbLIZ.append(a0.LJJJJZ("/", c1533510q0b.LIZJ));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (u.LJJIIJZLJL(strLIZIZ, "/", false)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("offline");
            sbLIZ2.append(strLIZIZ);
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("offline/");
        sbLIZ3.append(strLIZIZ);
        return C2188811AlT.LIZIZ(sbLIZ3);
    }

    public static boolean LIZ(Application application, String str) {
        Object c098200Yq;
        if (BuiltinFetcher.dirList == null) {
            synchronized ("offline") {
                try {
                    if (BuiltinFetcher.dirList == null) {
                        try {
                            c098200Yq = application.getAssets().list("offline");
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        }
                        String[] strArr = new String[0];
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = strArr;
                        }
                        BuiltinFetcher.dirList = (String[]) c098200Yq;
                    }
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        String[] strArr2 = BuiltinFetcher.dirList;
        if (strArr2 == null || C13LQ.LJJIJIIJI(str, strArr2) < 0) {
            return false;
        }
        return true;
    }

    public static boolean LIZIZ(Application application, String str) {
        Object c098200Yq;
        int iLJJJJ = a0.LJJJJ(str, '/', 0, 6);
        if (iLJJJJ == -1) {
            return false;
        }
        String strSubstring = str.substring(0, iLJJJJ);
        String strSubstring2 = str.substring(iLJJJJ + 1);
        try {
            c098200Yq = application.getAssets().list(strSubstring);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        Object[] objArr = (Object[]) c098200Yq;
        if (objArr == null || C13LQ.LJJIJIIJI(strSubstring2, objArr) < 0) {
            return false;
        }
        return true;
    }
}
