package X;

/* JADX INFO: renamed from: X.0uDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1695430uDl {
    public final C05P1<Object> LIZ;
    public final C1695430uDl LIZIZ;
    public final Object LIZJ;

    public final boolean LIZ() {
        if (this.LIZ.getValue() != this.LIZJ) {
            return true;
        }
        C1695430uDl c1695430uDl = this.LIZIZ;
        return c1695430uDl != null && c1695430uDl.LIZ();
    }

    public C1695430uDl(C05P1<? extends Object> c05p1, C1695430uDl c1695430uDl) {
        this.LIZ = c05p1;
        this.LIZIZ = c1695430uDl;
        this.LIZJ = c05p1.getValue();
    }
}
