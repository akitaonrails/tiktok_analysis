package X;

import X.AbstractC1677260tkS;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1686020tya<V extends AbstractC1677260tkS> {
    public final V LIZ;
    public final InterfaceC1686200tys LIZIZ;
    public final int LIZJ;

    public C1686020tya() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1686020tya)) {
            return false;
        }
        C1686020tya c1686020tya = (C1686020tya) obj;
        return Intrinsics.LJFF(this.LIZ, c1686020tya.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1686020tya.LIZIZ) && this.LIZJ == c1686020tya.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VectorizedKeyframeSpecElementInfo(vectorValue=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", easing=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", arcMode=");
        int i = this.LIZJ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("ArcMode(value=");
        sbLIZ2.append(i);
        sbLIZ2.append(')');
        sbLIZ.append((Object) C2188811AlT.LIZIZ(sbLIZ2));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1686020tya(AbstractC1677260tkS abstractC1677260tkS, InterfaceC1686200tys interfaceC1686200tys, int i) {
        this.LIZ = abstractC1677260tkS;
        this.LIZIZ = interfaceC1686200tys;
        this.LIZJ = i;
    }
}
