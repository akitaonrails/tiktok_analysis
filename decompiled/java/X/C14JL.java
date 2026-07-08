package X;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: X.14JL, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14JL {
    public final C20244914Jj LIZ;
    public final C20244914Jj LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Bounds{lower=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" upper=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C14JL(WindowInsetsAnimation.Bounds bounds) {
        this.LIZ = C20244914Jj.LIZJ(bounds.getLowerBound());
        this.LIZIZ = C20244914Jj.LIZJ(bounds.getUpperBound());
    }

    public C14JL(C20244914Jj c20244914Jj, C20244914Jj c20244914Jj2) {
        this.LIZ = c20244914Jj;
        this.LIZIZ = c20244914Jj2;
    }
}
