package X;

/* JADX INFO: renamed from: X.11PM, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11PM<T> {
    public final Object[] LIZ;
    public Object[] LIZIZ;
    public int LIZJ;

    public C11PM() {
        Object[] objArr = new Object[5];
        this.LIZ = objArr;
        this.LIZIZ = objArr;
    }

    public final <U> boolean LIZ(C11M9<? super U> c11m9) {
        Object[] objArr;
        Object[] objArr2 = this.LIZ;
        while (true) {
            if (objArr2 == null) {
                return false;
            }
            for (int i = 0; i < 4 && (objArr = objArr2[i]) != null; i++) {
                if (C11PO.acceptFull(objArr, c11m9)) {
                    return true;
                }
            }
            objArr2 = objArr2[4];
        }
    }

    public final void LIZIZ(T t) {
        int i = this.LIZJ;
        if (i == 4) {
            Object[] objArr = new Object[5];
            this.LIZIZ[4] = objArr;
            this.LIZIZ = objArr;
            i = 0;
        }
        this.LIZIZ[i] = t;
        this.LIZJ = i + 1;
    }

    public final void LIZJ(C11PT<? super T> c11pt) {
        Object obj;
        for (Object[] objArr = this.LIZ; objArr != null; objArr = (Object[]) objArr[4]) {
            for (int i = 0; i < 4 && (obj = objArr[i]) != null; i++) {
                if (c11pt.test(obj)) {
                    return;
                }
            }
        }
    }
}
