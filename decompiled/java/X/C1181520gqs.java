package X;

import java.lang.ref.SoftReference;

/* JADX INFO: renamed from: X.0gqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1181520gqs {
    public static final C1181520gqs LIZ = new C1181520gqs();
    public static final C603820NmG<String, SoftReference<C1164210gOx>> LIZIZ = new C603820NmG<>(20);

    public final synchronized C1164210gOx LIZ(String str) {
        C603820NmG<String, SoftReference<C1164210gOx>> c603820NmG = LIZIZ;
        SoftReference<C1164210gOx> softReferenceLIZJ = c603820NmG.LIZJ(str);
        C1164210gOx c1164210gOx = null;
        if (softReferenceLIZJ == null) {
            return null;
        }
        C1164210gOx c1164210gOx2 = softReferenceLIZJ.get();
        if (c1164210gOx2 == null) {
            c603820NmG.LJ(str);
        } else {
            c1164210gOx = c1164210gOx2;
        }
        return c1164210gOx;
    }
}
