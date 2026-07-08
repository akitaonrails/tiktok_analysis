package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pia.core.setting.Config;
import com.bytedance.pia.core.utils.DefaultResourceLoader;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;

/* JADX INFO: renamed from: X.1BNu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public class C2204001BNu {
    public String LIZ;
    public String LIZIZ;
    public Object LIZJ;
    public boolean LIZLLL;
    public Config LJ;
    public String LJFF;
    public Uri LJI;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v1, types: [X.1BNy] */
    /* JADX WARN: Type inference failed for: r11v10 */
    /* JADX WARN: Type inference failed for: r11v2 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9 */
    /* JADX WARN: Type inference failed for: r1v19, types: [X.0q3o] */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v40 */
    public final C2204041BNy LIZ() {
        C1BOI c1boi;
        ?? LIZ;
        InterfaceC1503700pEW interfaceC1503700pEWLIZ;
        String strLIZ;
        Object obj = this.LIZJ;
        ?? LIZ2 = 0;
        LIZ2 = 0;
        LIZ2 = 0;
        if (!(obj instanceof InterfaceC1530160pvC) || (c1boi = (C1BOI) ((InterfaceC1530160pvC) obj).LIZIZ(C1BOI.class)) == null) {
            c1boi = C1BOI.LIZ;
        }
        c1boi.LIZJ(System.currentTimeMillis(), "initialize.start");
        if (!C2203961BNq.LIZ().isPiaEnabled) {
            return null;
        }
        LIZIZ();
        String str = this.LJFF;
        if (str == null || str.isEmpty()) {
            return null;
        }
        C2203991BNt c2203991BNt = C2203991BNt.LIZ;
        Uri uri = this.LJI;
        c2203991BNt.getClass();
        if (!C2203991BNt.LIZLLL(uri)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[Runtime]: url is not support. Url: ");
            sbLIZ.append(this.LIZIZ);
            C1BPP.LJII(6, C2188811AlT.LIZIZ(sbLIZ), null);
            return null;
        }
        boolean z = false;
        boolean booleanQueryParameter = this.LJI.getBooleanQueryParameter("_pia_", false);
        if (!booleanQueryParameter && this.LJI.getBooleanQueryParameter("__pia_manifest__", false)) {
            z = true;
        }
        if (C2203961BNq.LIZ().isPiaQueryDisable) {
            Config configLIZ = Config.LIZ(this.LJI);
            this.LJ = configLIZ;
            if (configLIZ == null && booleanQueryParameter) {
                LIZ2 = 0;
                this.LJ = new Config(Collections.singleton("prefetch"), null, null, false, 14, null);
            }
        }
        if (this.LJ == null && booleanQueryParameter) {
            this.LJ = Config.LIZ(this.LJI);
        }
        if (this.LJ == null && z) {
            this.LJ = Config.LIZIZ;
        }
        if (this.LJ == null) {
            return LIZ2;
        }
        C1542480qF4 c1542480qF4LIZIZ = C1BOL.LIZ.LIZIZ(this.LIZ);
        InterfaceC1537230q6b<InterfaceC1535500q3o> interfaceC1537230q6b = c1542480qF4LIZIZ.LIZJ;
        if (interfaceC1537230q6b == null) {
            interfaceC1537230q6b = C1542560qFC.LJ;
        }
        if (interfaceC1537230q6b != null) {
            try {
                LIZ = interfaceC1537230q6b.LIZ(this.LIZJ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1BPP.LIZJ(4, "[Runtime] create ResourceLoader error:", th);
                LIZ = LIZ2;
            }
        } else {
            LIZ = LIZ2;
        }
        DefaultResourceLoader defaultResourceLoader = new DefaultResourceLoader(LIZ);
        InterfaceC1537230q6b<InterfaceC1503700pEW> interfaceC1537230q6b2 = c1542480qF4LIZIZ.LJ;
        if (interfaceC1537230q6b2 == null && (interfaceC1537230q6b2 = C1542560qFC.LJFF) == null) {
            interfaceC1503700pEWLIZ = new InterfaceC1503700pEW() { // from class: X.1BOS
                @Override // X.InterfaceC1503700pEW
                public final Object LIZ(Class cls, String str2) {
                    return C1515120pWw.LJIIIZ(cls, str2);
                }
            };
        } else {
            try {
                interfaceC1503700pEWLIZ = interfaceC1537230q6b2.LIZ(this.LIZJ);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                C1BPP.LIZJ(4, "[Runtime] create Retrofit error:", th2);
            }
            if (interfaceC1503700pEWLIZ == null) {
                interfaceC1503700pEWLIZ = new InterfaceC1503700pEW() { // from class: X.1BOS
                    @Override // X.InterfaceC1503700pEW
                    public final Object LIZ(Class cls, String str2) {
                        return C1515120pWw.LJIIIZ(cls, str2);
                    }
                };
            }
        }
        InterfaceC1537230q6b<String> interfaceC1537230q6b3 = c1542480qF4LIZIZ.LIZIZ;
        if (interfaceC1537230q6b3 == null && (interfaceC1537230q6b3 = C1542560qFC.LIZLLL) == null) {
            strLIZ = "";
        } else {
            try {
                strLIZ = interfaceC1537230q6b3.LIZ(this.LIZJ);
            } catch (Throwable th3) {
                TryCatchGuardChecker.doCheck(th3);
                C1BPP.LIZJ(4, "[Runtime] create custom UserAgent error:", th3);
            }
            if (strLIZ == null) {
                strLIZ = "";
            }
        }
        C1542440qF0 c1542440qF0 = c1542480qF4LIZIZ.LJI;
        ?? r11 = LIZ2;
        if (c1542440qF0 != null) {
            try {
                LIZ2 = c1542440qF0.LIZ(this.LIZJ);
                r11 = LIZ2;
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                C1BPP.LIZJ(4, "[Runtime] create globalProps error:", th4);
                r11 = LIZ2;
            }
        }
        return new C2204041BNy(this.LJI, this.LJFF, this.LIZ, this.LIZJ, this.LIZLLL, defaultResourceLoader, interfaceC1503700pEWLIZ, strLIZ, this.LJ, r11, c1boi);
    }

    public final String LIZIZ() {
        if (TextUtils.isEmpty(this.LIZIZ)) {
            return null;
        }
        if (!C2203961BNq.LIZ().isPiaQueryDisable && !this.LIZIZ.contains("__pia_manifest__") && !this.LIZIZ.contains("_pia_")) {
            return null;
        }
        String str = this.LJFF;
        if (str != null) {
            return str;
        }
        Uri uri = UriProtector.parse(this.LIZIZ);
        this.LJI = uri;
        String strLIZJ = C1953107kv.LIZJ(uri, null);
        this.LJFF = strLIZJ;
        return strLIZJ;
    }
}
