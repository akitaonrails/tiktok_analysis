package X;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.14ER, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14ER extends WeakReference {
    public final int LIZ;
    public final Class<?> LIZIZ;

    public final int hashCode() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C14ER.class == obj.getClass()) {
            C14ER c14er = (C14ER) obj;
            T t = get();
            T t2 = c14er.get();
            if (t != 0 && t2 != 0 && this.LIZ == c14er.LIZ) {
                return true;
            }
            return false;
        }
        return false;
    }

    public C14ER(Object obj, ReferenceQueue referenceQueue) {
        int iIdentityHashCode;
        super(obj, referenceQueue);
        if (obj != null) {
            iIdentityHashCode = System.identityHashCode(obj);
        } else {
            iIdentityHashCode = 0;
        }
        this.LIZ = iIdentityHashCode;
        this.LIZIZ = obj.getClass();
    }
}
