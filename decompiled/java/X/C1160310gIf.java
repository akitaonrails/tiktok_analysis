package X;

import X.InterfaceC1891350zJl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1160310gIf<T extends InterfaceC1891350zJl> implements InterfaceC1160280gIc<T> {
    public final String LIZ;
    public final T LIZIZ;
    public final String LIZJ;
    public final C0N2L LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1160310gIf)) {
            return false;
        }
        C1160310gIf c1160310gIf = (C1160310gIf) obj;
        return Intrinsics.LJFF(this.LIZ, c1160310gIf.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1160310gIf.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1160310gIf.LIZJ) && this.LIZLLL == c1160310gIf.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddOp(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", item=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", anchorId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", direction=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1160310gIf(String str, T t, String str2, C0N2L c0n2l) {
        this.LIZ = str;
        this.LIZIZ = t;
        this.LIZJ = str2;
        this.LIZLLL = c0n2l;
    }
}
