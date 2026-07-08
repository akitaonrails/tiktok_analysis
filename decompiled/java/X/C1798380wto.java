package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0wto, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1798380wto {
    public final C1798390wtp LIZ;
    public final String LIZIZ;

    public C1798380wto(C1798390wtp c1798390wtp) {
        CharSequence charSequenceSubSequence;
        this.LIZ = c1798390wtp;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        c1798390wtp.getClass();
        sbLIZ.append("/tiktok");
        sbLIZ.append("/location/consent/record/upload/");
        String strLJJIFFI = u.LJJIFFI(C2188811AlT.LIZIZ(sbLIZ), "//", "/", false);
        int length = strLJJIFFI.length();
        int i = 0;
        while (true) {
            if (i < length) {
                if (strLJJIFFI.charAt(i) == '/') {
                    i++;
                } else {
                    charSequenceSubSequence = strLJJIFFI.subSequence(i, strLJJIFFI.length());
                    break;
                }
            } else {
                charSequenceSubSequence = "";
                break;
            }
        }
        this.LIZIZ = charSequenceSubSequence.toString();
    }

    public final String LIZ(String str, String str2, JSONObject jSONObject, Map<String, String> map) {
        Object obj;
        String str3;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C1798620wuC c1798620wuC = C1798620wuC.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("postJson: ");
        sbLIZ.append(str);
        sbLIZ.append(' ');
        sbLIZ.append(str2);
        C1798620wuC.LIZIZ("NetworkManager", C2188811AlT.LIZIZ(sbLIZ));
        int i = 0;
        while (true) {
            String strLIZ = null;
            if (i < 3) {
                C1798620wuC c1798620wuC2 = C1798620wuC.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("postJson: ");
                sbLIZ2.append(jSONObject);
                C1798620wuC.LIZIZ("NetworkManager", C2188811AlT.LIZIZ(sbLIZ2));
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("postJson retry ");
                sbLIZ3.append(i);
                sbLIZ3.append(" times");
                C1798620wuC.LIZLLL("NetworkManager", C2188811AlT.LIZIZ(sbLIZ3));
                try {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("NetworkRequest postJson ");
                    sbLIZ4.append(this.LIZ.LIZIZ);
                    sbLIZ4.append(' ');
                    sbLIZ4.append(str);
                    sbLIZ4.append(' ');
                    sbLIZ4.append(str2);
                    C1798620wuC.LIZLLL("NetworkManager", C2188811AlT.LIZIZ(sbLIZ4));
                    StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                    sbLIZ5.append("NetworkRequest postJson body=");
                    sbLIZ5.append(jSONObject);
                    sbLIZ5.append(" queries=");
                    sbLIZ5.append(map);
                    C1798620wuC.LIZIZ("NetworkManager", C2188811AlT.LIZIZ(sbLIZ5));
                    strLIZ = this.LIZ.LIZIZ.LIZ(str, str2, map, jSONObject);
                    str3 = strLIZ;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C098200Yq c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                    Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                    if (thM5exceptionOrNullimpl == null) {
                        obj = c098200Yq;
                    } else {
                        C1798620wuC c1798620wuC3 = C1798620wuC.LIZ;
                        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                        sbLIZ6.append("postJson: exception: ");
                        sbLIZ6.append(thM5exceptionOrNullimpl.getClass().getSimpleName());
                        C1798620wuC.LIZJ("NetworkManager", C2188811AlT.LIZIZ(sbLIZ6), thM5exceptionOrNullimpl);
                        C185100nR c185100nR = C185100nR.LIZ;
                        C185100nR.LJIIJJI(str2, thM5exceptionOrNullimpl.getClass().getSimpleName());
                        obj = strLIZ;
                    }
                    str3 = (String) obj;
                }
                C1798620wuC c1798620wuC4 = C1798620wuC.LIZ;
                StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                sbLIZ7.append("NetworkRequest response: ");
                sbLIZ7.append(str3);
                C1798620wuC.LIZIZ("NetworkManager", C2188811AlT.LIZIZ(sbLIZ7));
                if (str3 != null) {
                    return str3;
                }
                i++;
            } else {
                C185100nR c185100nR2 = C185100nR.LIZ;
                C185100nR.LJIIL(i, System.currentTimeMillis() - jCurrentTimeMillis, -10000, str2, "Reached max retry times");
                return null;
            }
        }
    }
}
