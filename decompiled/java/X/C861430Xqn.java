package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Xqn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C861430Xqn {
    public final Class<?> LIZ;
    public final Class<?> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C861430Xqn)) {
            return false;
        }
        C861430Xqn c861430Xqn = (C861430Xqn) obj;
        return Intrinsics.LJFF(this.LIZ, c861430Xqn.LIZ) && Intrinsics.LJFF(this.LIZIZ, c861430Xqn.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public C861430Xqn(Class<?> cls, Class<?> cls2) {
        this.LIZ = cls;
        this.LIZIZ = cls2;
    }
}
