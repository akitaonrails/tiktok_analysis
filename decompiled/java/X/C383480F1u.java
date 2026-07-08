package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0F1u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383480F1u extends C0F26 {
    public final List<Integer> LIZ;
    public final int LIZIZ;
    public final EnumC383510F1x LIZJ = EnumC383510F1x.COLOR;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C383480F1u)) {
            return false;
        }
        C383480F1u c383480F1u = (C383480F1u) obj;
        return Intrinsics.LJFF(this.LIZ, c383480F1u.LIZ) && this.LIZIZ == c383480F1u.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ColorList(availableColors=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", selectedColor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0F26
    public final EnumC383510F1x LIZ() {
        return this.LIZJ;
    }

    public C383480F1u(List<Integer> list, int i) {
        this.LIZ = list;
        this.LIZIZ = i;
    }
}
