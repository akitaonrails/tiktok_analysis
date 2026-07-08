package X;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04ij, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1175104ij implements InterfaceC1173304iR {
    public final String LIZ;
    public final Pair<List<C0EQL>, C05WK> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1175104ij)) {
            return false;
        }
        C1175104ij c1175104ij = (C1175104ij) obj;
        return Intrinsics.LJFF(this.LIZ, c1175104ij.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1175104ij.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(musicId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resource=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1175104ij(String str, Pair<? extends List<C0EQL>, C05WK> pair) {
        this.LIZ = str;
        this.LIZIZ = pair;
    }
}
