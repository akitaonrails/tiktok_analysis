package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0W9D, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W9D<A, B> {
    public static final /* synthetic */ int LIZJ = 0;
    public final A LIZ;
    public final B LIZIZ;

    public C0W9D() {
        throw null;
    }

    public final int hashCode() {
        A a = this.LIZ;
        int iHashCode = ((a == null ? 0 : a.hashCode()) + 31) * 31;
        B b = this.LIZIZ;
        return iHashCode + (b != null ? b.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(C0W9D.class, obj.getClass())) {
            return false;
        }
        C0W9D c0w9d = (C0W9D) obj;
        A a = this.LIZ;
        if (a == null) {
            if (c0w9d.LIZ != null) {
                return false;
            }
        } else if (!Intrinsics.LJFF(a, c0w9d.LIZ)) {
            return false;
        }
        B b = this.LIZIZ;
        if (b == null) {
            if (c0w9d.LIZIZ != null) {
                return false;
            }
        } else if (!Intrinsics.LJFF(b, c0w9d.LIZIZ)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0W9D(Object obj, Object obj2) {
        this.LIZ = obj;
        this.LIZIZ = obj2;
    }
}
