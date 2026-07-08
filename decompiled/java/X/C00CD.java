package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00CD, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CD<T> {
    public final String LIZ;
    public final Class<T> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00CD)) {
            return false;
        }
        C00CD c00cd = (C00CD) obj;
        return Intrinsics.LJFF(this.LIZ, c00cd.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00cd.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public C00CD(Class cls, String str) {
        this.LIZ = str;
        this.LIZIZ = cls;
    }
}
