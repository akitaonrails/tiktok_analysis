package X;

import android.content.res.AssetManager;
import com.bytedance.forest.chain.fetchers.GeckoXAdapter;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStreamReader;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS599S0100000_20;
import kotlin.jvm.internal.AwS82S1000000_32;
import kotlin.text.Charsets;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.18cQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21322418cQ {
    public static final /* synthetic */ int LIZ = 0;

    public static C1533510q0b LIZ(String str) {
        String prefixAsGeckoCDN;
        try {
            String path = UriProtector.parse(str).getPath();
            if (path != null && (prefixAsGeckoCDN = GeckoXAdapter.Companion.getPrefixAsGeckoCDN(path)) != null) {
                C1533510q0b c1533510q0bLIZIZ = C1956907lX.LIZIZ(str, prefixAsGeckoCDN);
                if (c1533510q0bLIZIZ == null) {
                    C1168400gVi.LIZIZ(new AwS82S1000000_32(str, 18));
                }
                return c1533510q0bLIZIZ;
            }
            C1168400gVi.LIZIZ(new AwS82S1000000_32(str, 17));
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1168400gVi.LIZIZ(new AwS82S1000000_32(str, th, 19));
            C1325860kbg.LJFF(th, th.getMessage());
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [X.18cU, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v4, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static C21323218cY LIZIZ(InterfaceC1540190qBN interfaceC1540190qBN, String str, C21321418cG c21321418cG) throws Throwable {
        C21323218cY c21323218cY;
        ?? r9;
        ?? Open;
        String str2;
        C1533510q0b c1533510q0bLIZ = LIZ(str);
        if (c1533510q0bLIZ == null) {
            return new C21323218cY(null, "parse url failed", null, "parse_url", null, false, 53);
        }
        ?? r92 = 0;
        try {
            r92 = 0;
        } catch (Throwable th) {
            th = th;
        }
        try {
            C21322818cU c21322818cULIZ = interfaceC1540190qBN.LIZ(str, new C1539490qAF(null, c1533510q0bLIZ.LIZIZ, c1533510q0bLIZ.LIZJ, new C1539500qAG(c21321418cG.LIZIZ, c21321418cG.LIZ, c21321418cG.LIZJ), null, 17));
            if (c21322818cULIZ == null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("request failed:");
                sbLIZ.append(str);
                c21323218cY = new C21323218cY(null, C2188811AlT.LIZIZ(sbLIZ), null, "null_response", null, false, 53);
            } else if (c21322818cULIZ.LIZIZ) {
                C1168400gVi.LIZ(new AwS146S1100000_32(c21322818cULIZ, str, 23));
                byte[] bArr = c21322818cULIZ.LIZLLL;
                if (bArr != null) {
                    str2 = new String(bArr, Charsets.UTF_8);
                    if (!a0.LJJJIL(str2)) {
                        c21323218cY = new C21323218cY(str2, null, null, null, c21322818cULIZ, false, 46);
                    }
                } else {
                    str2 = null;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("read content failed:");
                sbLIZ2.append(str);
                sbLIZ2.append(",jsonStr:");
                sbLIZ2.append(str2);
                c21323218cY = new C21323218cY(null, C2188811AlT.LIZIZ(sbLIZ2), null, "read_content", c21322818cULIZ, false, 37);
            } else {
                C1168400gVi.LIZIZ(new AwS146S1100000_32(c21322818cULIZ, str, 24));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("response failed:");
                sbLIZ3.append(str);
                c21323218cY = new C21323218cY(null, C2188811AlT.LIZIZ(sbLIZ3), null, "response_err", c21322818cULIZ, false, 37);
            }
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            C1168400gVi.LIZIZ(new AwS581S0100000_2(th, 693));
            C1325860kbg.LJFF(th, th.getMessage());
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append("request failed:");
            sbLIZ4.append(str);
            r92 = r92;
            c21323218cY = new C21323218cY(r92, C2188811AlT.LIZIZ(sbLIZ4), th, "request_unknown_err", r92, false, 49);
        }
        C21322818cU c21322818cU = c21323218cY.LJ;
        String str3 = c21323218cY.LIZ;
        if ((str3 == null || a0.LJJJIL(str3)) && !c21321418cG.LIZIZ) {
            try {
                String str4 = c1533510q0bLIZ.LIZIZ;
                String str5 = c1533510q0bLIZ.LIZJ;
                if (str4.length() != 0 && str5.length() != 0) {
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("offline/");
                    sbLIZ5.append(str4);
                    sbLIZ5.append('/');
                    sbLIZ5.append(str5);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ5);
                    AssetManager assetManagerLJIIJ = interfaceC1540190qBN.LJIIJ();
                    if (assetManagerLJIIJ != null) {
                        Open = assetManagerLJIIJ.open(strLIZIZ);
                    } else {
                        Open = r92;
                    }
                    InputStreamReader inputStreamReader = new InputStreamReader(Open);
                    try {
                        String strLIZJ = C08KC.LIZJ(inputStreamReader);
                        C2107108Nh.LIZ(inputStreamReader, r92);
                        r9 = strLIZJ;
                    } catch (Throwable th3) {
                        th = th3;
                        try {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                                th = r92;
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(inputStreamReader, th);
                                throw th;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                    }
                } else {
                    C1168400gVi.LIZIZ(new AwS599S0100000_20(c1533510q0bLIZ, 52));
                    r9 = r92;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1168400gVi.LIZIZ(new AwS581S0100000_2(e, 694));
                r9 = r92;
            }
            if (r9 != 0 && !a0.LJJJIL(r9)) {
                if (c21322818cU != null) {
                    c21322818cU.LIZ = "builtin";
                }
                return new C21323218cY(r9, null, null, null, c21322818cU, true, 14);
            }
            C21323218cY c21323218cY2 = new C21323218cY(c21323218cY.LIZ, c21323218cY.LIZIZ, c21323218cY.LIZJ, c21323218cY.LIZLLL, c21322818cU, true);
            C1168400gVi.LIZ(new AwS82S1000000_32(str, 20));
            return c21323218cY2;
        }
        return c21323218cY;
    }
}
