package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13aA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20034413aA {
    public final Object LIZ;
    public final Object LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20034413aA)) {
            return false;
        }
        C20034413aA c20034413aA = (C20034413aA) obj;
        return Intrinsics.LJFF(this.LIZ, c20034413aA.LIZ) && Intrinsics.LJFF(this.LIZIZ, c20034413aA.LIZIZ);
    }

    public final int hashCode() {
        Object obj = this.LIZ;
        int iHashCode = 0;
        int iOrdinal = (obj instanceof Enum ? ((Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        Object obj2 = this.LIZIZ;
        if (obj2 instanceof Enum) {
            iHashCode = ((Enum) obj2).ordinal();
        } else if (obj2 != null) {
            iHashCode = obj2.hashCode();
        }
        return iOrdinal + iHashCode;
    }

    public C20034413aA(Object obj, Object obj2) {
        this.LIZ = obj;
        this.LIZIZ = obj2;
    }
}
