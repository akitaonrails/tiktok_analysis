package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iX3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1246110iX3 {
    public final List<Object> LIZ;
    public final int LIZIZ;

    public C1246110iX3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1246110iX3)) {
            return false;
        }
        C1246110iX3 c1246110iX3 = (C1246110iX3) obj;
        return Intrinsics.LJFF(this.LIZ, c1246110iX3.LIZ) && this.LIZIZ == c1246110iX3.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AvatarUnionMeta(srcList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", total=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1246110iX3(int i) {
        this(C13BV.INSTANCE, 0);
    }

    public C1246110iX3(List<? extends Object> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }
}
