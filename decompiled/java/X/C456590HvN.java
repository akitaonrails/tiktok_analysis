package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C456590HvN implements InterfaceC456610HvP {
    public final InterfaceC460300I3g LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C456590HvN) && Intrinsics.LJFF(this.LIZ, ((C456590HvN) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Anim(textState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC456610HvP
    public final InterfaceC460300I3g LIZ() {
        return this.LIZ;
    }

    public C456590HvN(C1258904wF c1258904wF) {
        this.LIZ = c1258904wF;
    }
}
