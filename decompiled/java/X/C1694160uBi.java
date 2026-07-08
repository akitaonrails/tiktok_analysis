package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0uBi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1694160uBi {
    public final C05P0 LIZ;

    public C1694160uBi() {
        this(0);
    }

    public final int hashCode() {
        return ((C13FE) this.LIZ).getValue().hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ContextMenuState(status=");
        sbLIZ.append(((C13FE) this.LIZ).getValue());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1694160uBi(int i) {
        this.LIZ = C20028913Yh.LJI(C1694170uBj.LIZ);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1694160uBi)) {
            return false;
        }
        return Intrinsics.LJFF(((C13FE) ((C1694160uBi) obj).LIZ).getValue(), ((C13FE) this.LIZ).getValue());
    }
}
