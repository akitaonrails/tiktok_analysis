package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VJ6 extends AbstractC789580UyC {
    public final InterfaceC1626470sQX LIZ;
    public final int LIZIZ;
    public final EnumC1641450soh LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VJ6)) {
            return false;
        }
        C0VJ6 c0vj6 = (C0VJ6) obj;
        return Intrinsics.LJFF(this.LIZ, c0vj6.LIZ) && this.LIZIZ == c0vj6.LIZIZ && this.LIZJ == c0vj6.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ApplyEffect(effect=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", applyMethod=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VJ6(InterfaceC1626470sQX interfaceC1626470sQX, int i, EnumC1641450soh enumC1641450soh) {
        this.LIZ = interfaceC1626470sQX;
        this.LIZIZ = i;
        this.LIZJ = enumC1641450soh;
    }
}
