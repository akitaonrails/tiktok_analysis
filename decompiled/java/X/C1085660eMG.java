package X;

/* JADX INFO: renamed from: X.0eMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085660eMG<T> implements InterfaceC20015613Te<T> {
    public final Object[] LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC20015613Te
    public final T LIZIZ() {
        int i = this.LIZIZ;
        if (i <= 0) {
            return null;
        }
        int i2 = i - 1;
        Object[] objArr = this.LIZ;
        T t = (T) objArr[i2];
        objArr[i2] = null;
        this.LIZIZ = i - 1;
        return t;
    }

    public C1085660eMG(int i) {
        if (i > 0) {
            this.LIZ = new Object[i];
        } else {
            "The max pool size must be > 0".toString();
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    @Override // X.InterfaceC20015613Te
    public final boolean LIZ(T t) {
        int i = this.LIZIZ;
        if (i >= this.LIZ.length) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LIZ[i2] == t) {
                return false;
            }
        }
        Object[] objArr = this.LIZ;
        int i3 = this.LIZIZ;
        objArr[i3] = t;
        this.LIZIZ = i3 + 1;
        return true;
    }
}
