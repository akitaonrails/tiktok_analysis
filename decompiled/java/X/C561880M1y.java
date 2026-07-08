package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0M1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561880M1y extends C0M24 {
    public final List<C0M2A> LIZ;
    public final EnumC561670M1d LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C561880M1y)) {
            return false;
        }
        C561880M1y c561880M1y = (C561880M1y) obj;
        return Intrinsics.LJFF(this.LIZ, c561880M1y.LIZ) && this.LIZIZ == c561880M1y.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Manage(sections=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C561880M1y(List<C0M2A> list, EnumC561670M1d enumC561670M1d) {
        this.LIZ = list;
        this.LIZIZ = enumC561670M1d;
    }
}
