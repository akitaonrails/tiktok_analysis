package X;

import android.view.WindowInsetsAnimation;

/* JADX INFO: renamed from: X.14JR, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14JR {
    public final C20244814Ji LIZ;
    public final C20244814Ji LIZIZ;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Bounds{lower=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(" upper=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("}");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C14JR(WindowInsetsAnimation.Bounds bounds) {
        this.LIZ = C20244814Ji.LIZLLL(bounds.getLowerBound());
        this.LIZIZ = C20244814Ji.LIZLLL(bounds.getUpperBound());
    }

    public C14JR(C20244814Ji c20244814Ji, C20244814Ji c20244814Ji2) {
        this.LIZ = c20244814Ji;
        this.LIZIZ = c20244814Ji2;
    }
}
