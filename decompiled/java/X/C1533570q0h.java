package X;

import com.bytedance.forest.Forest;
import java.util.Map;

/* JADX INFO: renamed from: X.0q0h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1533570q0h {
    public static final C01GW<Map<String, C1533570q0h>> LJIIJ = C452501pT.LIZIZ(new C1533600q0k());
    public String LIZ;
    public String LIZIZ;
    public final Long LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public boolean LJI;
    public InterfaceC1504290pFT LJII;
    public C1551290qTH LJIIIIZZ;
    public String LJIIIZ;

    public C1533570q0h(String str, String str2, Long l, String str3, String str4, String str5, boolean z, int i) {
        if ((i & 4) != 0) {
            C1533650q0p globalConfig = Forest.Companion.getGlobalConfig();
            if (globalConfig != null) {
                l = Long.valueOf(globalConfig.LIZ);
            } else {
                l = null;
            }
        }
        if ((i & 8) != 0) {
            C1533650q0p globalConfig2 = Forest.Companion.getGlobalConfig();
            if (globalConfig2 != null) {
                str3 = globalConfig2.LIZIZ;
            } else {
                str3 = null;
            }
        }
        if ((i & 16) != 0) {
            C1533650q0p globalConfig3 = Forest.Companion.getGlobalConfig();
            if (globalConfig3 != null) {
                str4 = globalConfig3.LIZJ;
            } else {
                str4 = null;
            }
        }
        if ((i & 32) != 0) {
            C1533650q0p globalConfig4 = Forest.Companion.getGlobalConfig();
            if (globalConfig4 != null) {
                str5 = globalConfig4.LIZLLL;
            } else {
                str5 = null;
            }
        }
        z = (i & 64) != 0 ? true : z;
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = l;
        this.LIZLLL = str3;
        this.LJ = str4;
        this.LJFF = str5;
        this.LJI = z;
    }
}
