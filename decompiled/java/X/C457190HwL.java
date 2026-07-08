package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HwL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C457190HwL implements InterfaceC457220HwO {
    public final AbstractC457230HwP LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C457190HwL) && Intrinsics.LJFF(this.LIZIZ, ((C457190HwL) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Show(target=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C457190HwL(AbstractC457230HwP abstractC457230HwP) {
        this.LIZIZ = abstractC457230HwP;
    }
}
