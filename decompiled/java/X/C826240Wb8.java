package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Wb8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826240Wb8 {
    public final String LIZ;
    public final EnumC826230Wb7 LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C826240Wb8)) {
            return false;
        }
        C826240Wb8 c826240Wb8 = (C826240Wb8) obj;
        return Intrinsics.LJFF(this.LIZ, c826240Wb8.LIZ) && this.LIZIZ == c826240Wb8.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DomainEntry(suffix=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C826240Wb8(String str, EnumC826230Wb7 enumC826230Wb7) {
        this.LIZ = str;
        this.LIZIZ = enumC826230Wb7;
    }
}
