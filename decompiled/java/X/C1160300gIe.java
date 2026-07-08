package X;

import X.InterfaceC1891350zJl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gIe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160300gIe<T extends InterfaceC1891350zJl> implements InterfaceC1160280gIc<T> {
    public final String LIZ;
    public final EnumC1085440eLu LIZIZ;
    public final T LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160300gIe)) {
            return false;
        }
        C1160300gIe c1160300gIe = (C1160300gIe) obj;
        return Intrinsics.LJFF(this.LIZ, c1160300gIe.LIZ) && this.LIZIZ == c1160300gIe.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1160300gIe.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateOp(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", item=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1160300gIe(String str, EnumC1085440eLu enumC1085440eLu, T t) {
        this.LIZ = str;
        this.LIZIZ = enumC1085440eLu;
        this.LIZJ = t;
    }
}
