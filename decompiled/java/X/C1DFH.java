package X;

/* JADX INFO: renamed from: X.1DFH, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DFH extends C1DFL {
    public static final C1DFH LLILLJJLI = new C1DFH();

    @Override // X.AbstractC2252651DEx
    public final String toString() {
        return "Dispatchers.Default";
    }

    public C1DFH() {
        super(C1DFC.LIZJ, C1DFC.LIZLLL, C1DFC.LJ, C1DFC.LIZ);
    }

    @Override // X.C1DFT, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // X.AbstractC2252651DEx
    public final AbstractC2252651DEx limitedParallelism(int i) {
        C1917207f8.LIZ(i);
        if (i >= C1DFC.LIZJ) {
            return this;
        }
        return super.limitedParallelism(i);
    }
}
