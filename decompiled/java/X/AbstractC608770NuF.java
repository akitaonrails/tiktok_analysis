package X;

import java.util.List;

/* JADX INFO: renamed from: X.0NuF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractC608770NuF {
    public static final List<Integer> LIZJ = C1697810uHb.LJIILJJIL(0, 1, 2);
    public AbstractC608770NuF LIZ;
    public C608820NuK LIZIZ;

    public abstract int LIZ();

    public abstract void LIZIZ(C608820NuK c608820NuK);

    public final void LIZJ(String str) {
        AbstractC608770NuF abstractC608770NuF;
        C608820NuK c608820NuK = this.LIZIZ;
        if (c608820NuK != null && (abstractC608770NuF = this.LIZ) != null) {
            abstractC608770NuF.LIZIZ = c608820NuK;
            abstractC608770NuF.LIZIZ(c608820NuK);
        }
    }
}
