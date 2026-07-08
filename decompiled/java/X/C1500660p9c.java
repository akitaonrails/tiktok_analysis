package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.LinkedHashMap;

/* JADX INFO: renamed from: X.0p9c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1500660p9c {
    public EnumC1500730p9j LIZIZ;
    public String LIZJ;
    public C1500670p9d LJI;
    public C1506300pIi LJII;
    public String LIZ = "";
    public final LinkedHashMap<String, String> LIZLLL = new LinkedHashMap<>();
    public final LinkedHashMap<String, String> LJ = new LinkedHashMap<>();
    public final LinkedHashMap<String, String> LJFF = new LinkedHashMap<>();

    public final String LIZJ(String str) {
        String str2 = this.LIZ;
        if (str2 != null && (str2.startsWith("http://") || this.LIZ.startsWith("https://"))) {
            return this.LIZ;
        }
        return UriProtector.parse(str).buildUpon().encodedPath(this.LIZ).build().toString();
    }

    public final void LIZ(String str, String str2, boolean z) {
        if (str != null) {
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unable to convert query parameter \"");
                    sbLIZ.append(str);
                    sbLIZ.append("\" value to UTF-8: ");
                    sbLIZ.append(str2);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                }
            }
            if (str2 != null && !str2.isEmpty()) {
                this.LJFF.put(str, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("field param name must not be null.");
    }

    public final void LIZIZ(String str, String str2, boolean z) {
        if (str != null) {
            if (z) {
                try {
                    str = URLEncoder.encode(str, "UTF-8");
                    str2 = URLEncoder.encode(str2, "UTF-8");
                } catch (UnsupportedEncodingException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Unable to convert query parameter \"");
                    sbLIZ.append(str);
                    sbLIZ.append("\" value to UTF-8: ");
                    sbLIZ.append(str2);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                }
            }
            if (str2 != null && !str2.isEmpty()) {
                this.LJ.put(str, str2);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Query param name must not be null.");
    }
}
