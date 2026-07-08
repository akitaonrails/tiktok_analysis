package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qCw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1541160qCw<T> {
    public final Object[] LIZ;
    public final int LIZIZ;
    public volatile int LIZJ;
    public volatile int LIZLLL;

    public C1541160qCw(int i) {
        Object[] objArr = new Object[i < 1 ? 1 : i];
        this.LIZ = objArr;
        this.LIZIZ = objArr.length;
    }

    public final synchronized boolean LIZ(T t) {
        int i = this.LIZLLL;
        if (i >= this.LIZIZ) {
            return false;
        }
        this.LIZ[(this.LIZJ + i) % this.LIZIZ] = t;
        this.LIZLLL = i + 1;
        return true;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [T, java.lang.Object] */
    public final T LIZIZ(Function1<? super T, Boolean> function1) {
        int i = this.LIZLLL;
        int i2 = this.LIZJ;
        for (int i3 = 0; i3 < i; i3++) {
            ?? r1 = (Object) this.LIZ[(i2 + i3) % this.LIZIZ];
            if (r1 != 0 && function1.invoke(r1).booleanValue()) {
                return r1;
            }
        }
        return null;
    }

    public final void LIZJ(Function1<? super T, Unit> function1) {
        int i = this.LIZLLL;
        int i2 = this.LIZJ;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = this.LIZ[(i2 + i3) % this.LIZIZ];
            if (obj != null) {
                function1.invoke(obj);
            }
        }
    }

    public final synchronized boolean LIZLLL(Object obj, AbstractC1541140qCu abstractC1541140qCu) {
        int i = this.LIZLLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LIZJ;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = i2 + i3;
            int i5 = this.LIZIZ;
            Object[] objArr = this.LIZ;
            Object obj2 = objArr[i4 % i5];
            if (obj2 == obj || obj2 == abstractC1541140qCu) {
                int i6 = i4 % i5;
                if (i6 != i2) {
                    objArr[i6] = objArr[i2];
                }
                objArr[i2] = null;
                this.LIZJ = (i2 + 1) % i5;
                this.LIZLLL = i - 1;
                return true;
            }
        }
        return false;
    }

    public final synchronized boolean LJ(C1541080qCo c1541080qCo, C1541180qCy c1541180qCy) {
        int i = this.LIZLLL;
        if (i == 0) {
            return false;
        }
        int i2 = this.LIZJ;
        for (int i3 = 0; i3 < i; i3++) {
            int i4 = (i2 + i3) % this.LIZIZ;
            Object[] objArr = this.LIZ;
            if (objArr[i4] == c1541080qCo) {
                objArr[i4] = c1541180qCy;
                return true;
            }
        }
        return false;
    }
}
