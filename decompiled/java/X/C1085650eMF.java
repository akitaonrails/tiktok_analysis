package X;

/* JADX INFO: renamed from: X.0eMF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1085650eMF<T> implements InterfaceC20015613Te<T> {
    public final Object[] LIZ;
    public int LIZIZ;

    @Override // X.InterfaceC20015613Te
    public T LIZIZ() {
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

    public C1085650eMF(int i) {
        if (i > 0) {
            this.LIZ = new Object[i];
        } else {
            "The max pool size must be > 0".toString();
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
    }

    @Override // X.InterfaceC20015613Te
    public boolean LIZ(T t) {
        int i = this.LIZIZ;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.LIZ[i2] == t) {
                "Already in the pool!".toString();
                throw new IllegalStateException("Already in the pool!");
            }
        }
        int i3 = this.LIZIZ;
        Object[] objArr = this.LIZ;
        if (i3 >= objArr.length) {
            return false;
        }
        objArr[i3] = t;
        this.LIZIZ = i3 + 1;
        return true;
    }
}
