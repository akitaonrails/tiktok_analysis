package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UyA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C789560UyA extends AbstractC789580UyC {
    public final InterfaceC1626470sQX LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C789560UyA) && Intrinsics.LJFF(this.LIZ, ((C789560UyA) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreloadEffect(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C789560UyA(InterfaceC1626470sQX interfaceC1626470sQX) {
        this.LIZ = interfaceC1626470sQX;
    }
}
