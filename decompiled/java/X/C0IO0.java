package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IO0, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IO0 {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return (int) this.LIZIZ;
    }

    public final String toString() {
        return String.valueOf(this.LIZIZ);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (Intrinsics.LJFF(C0IO0.class, cls) && this.LIZ == ((C0IO0) obj).LIZ) {
            return true;
        }
        return false;
    }

    public C0IO0(long j, long j2, String str) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
    }
}
