package X;

/* JADX INFO: renamed from: X.0EDA, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EDA {
    public final /* synthetic */ C0EDF LIZ;

    public C0EDA(C0EDF c0edf) {
        this.LIZ = c0edf;
    }

    public final void LIZ(C0EDQ c0edq, int i) {
        C0EDF c0edf;
        C0EDC c0edc;
        C0ED8 c0ed8 = this.LIZ.LLIZ;
        int i2 = 0;
        if (c0ed8 != null && c0ed8.LJIJJ > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C0EDF c0edf2 = this.LIZ;
            long j = jCurrentTimeMillis - c0edf2.LLJILLL;
            C0ED8 c0ed82 = c0edf2.LLIZ;
            if (c0ed82 != null) {
                i2 = c0ed82.LJIJJ;
            }
            if (j < i2) {
                return;
            }
        }
        this.LIZ.LLJILLL = System.currentTimeMillis();
        if (c0edq != null && (c0edc = (c0edf = this.LIZ).LLJI) != null) {
            c0edc.LIZ(c0edq.LIZ, i, c0edq.LJ, new C0E14(c0edf, c0edq, i, c0edq));
        }
    }
}
