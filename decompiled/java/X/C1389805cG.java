package X;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.05cG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1389805cG {
    public static String LIZ;
    public static final Map<String, C09AE> LIZIZ = new LinkedHashMap();
    public static final C054G LIZJ;

    static {
        C1DFH c1dfh = C0PEM.LIZ;
        LIZJ = C2296808zG.LIZ(C2107308Nj.LIZ);
    }

    public static void LIZ() {
        for (C09AE c09ae : ((LinkedHashMap) LIZIZ).values()) {
            if (c09ae.isActive()) {
                c09ae.LIZIZ(null);
            }
        }
        ((LinkedHashMap) LIZIZ).clear();
    }
}
