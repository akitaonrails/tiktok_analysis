package X;

/* JADX INFO: renamed from: X.1AcK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2183141AcK<T> {
    public T LIZ;
    public T LIZIZ;

    public final T LIZ(boolean z) {
        if (z) {
            return this.LIZ;
        }
        return this.LIZIZ;
    }

    public C2183141AcK(T t, T t2) {
        this.LIZ = t;
        this.LIZIZ = t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZIZ(Object obj, boolean z) {
        if (z) {
            this.LIZ = obj;
        } else {
            this.LIZIZ = obj;
        }
    }
}
