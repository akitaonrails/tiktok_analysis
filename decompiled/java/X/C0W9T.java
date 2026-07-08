package X;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: X.0W9T, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9T implements Serializable {
    public static int hitCacheSize;
    public final Object[] LL;
    public C0W9T LLILLJJLI;
    public static final C0W9V Companion = new Object() { // from class: X.0W9V
    };
    public static final AtomicReference<C0W9T> sPool = new AtomicReference<>();
    public static final AtomicInteger sPoolSize = new AtomicInteger(0);

    public final boolean isEmpty() {
        int length = this.LL.length;
        for (int i = 0; i < length; i++) {
            if (this.LL[i] != null) {
                return false;
            }
        }
        return true;
    }

    public final void recycle() {
        int length = this.LL.length;
        for (int i = 0; i < length; i++) {
            this.LL[i] = null;
        }
        while (sPoolSize.get() < 200) {
            AtomicReference<C0W9T> atomicReference = sPool;
            C0W9T c0w9t = atomicReference.get();
            this.LLILLJJLI = c0w9t;
            while (!atomicReference.compareAndSet(c0w9t, this)) {
                if (atomicReference.get() != c0w9t) {
                    break;
                }
            }
            sPoolSize.incrementAndGet();
            return;
        }
    }

    public C0W9T() {
        C838990Wvh.LIZ.getClass();
        this.LL = new Object[C838990Wvh.LIZIZ];
    }

    public final C0W9T copy() {
        C0W9T c0w9tLIZIZ = C0W9Q.LIZIZ();
        Object[] objArr = this.LL;
        System.arraycopy(objArr, 0, c0w9tLIZIZ.LL, 0, objArr.length);
        return c0w9tLIZIZ;
    }

    public final C0W9T getNext() {
        return this.LLILLJJLI;
    }

    public final Object getData(int i) {
        if (i >= 0) {
            Object[] objArr = this.LL;
            if (i < objArr.length) {
                return objArr[i];
            }
            return null;
        }
        return null;
    }

    public final void setNext(C0W9T c0w9t) {
        this.LLILLJJLI = c0w9t;
    }

    public final boolean setData(int i, Object obj) {
        if (i >= 0) {
            Object[] objArr = this.LL;
            if (i < objArr.length) {
                objArr[i] = obj;
                return true;
            }
            return false;
        }
        return false;
    }
}
