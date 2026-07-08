package X;

/* JADX INFO: renamed from: X.0Icu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C470620Icu {
    public int LIZ = -1;
    public int LIZIZ = -1;
    public int LIZJ = -1;
    public boolean LIZLLL = true;

    public final C476690Imh LIZ() {
        int i = this.LIZ;
        if (i < 1) {
            throw new IllegalArgumentException("Page size must be a positive number");
        }
        if (this.LIZIZ < 0) {
            this.LIZIZ = i;
        }
        if (this.LIZJ < 0) {
            this.LIZJ = i * 3;
        }
        boolean z = this.LIZLLL;
        if (z || this.LIZIZ != 0) {
            return new C476690Imh(i, this.LIZIZ, z, this.LIZJ);
        }
        throw new IllegalArgumentException("Placeholders and prefetch are the only ways to trigger loading of more data in the PagedList, so either placeholders must be enabled, or prefetch distance must be > 0.");
    }
}
