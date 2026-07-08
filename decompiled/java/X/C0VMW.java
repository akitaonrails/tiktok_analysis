package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0VMW, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VMW {
    public final List<C0VML> LIZ;
    public final List<C0VMR> LIZIZ;
    public final List<C0VMI> LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0VMW)) {
            return false;
        }
        C0VMW c0vmw = (C0VMW) obj;
        return Intrinsics.LJFF(this.LIZ, c0vmw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0vmw.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0vmw.LIZJ) && this.LIZLLL == c0vmw.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Result(sceneList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", strategyList=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", packageList=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sceneType=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0VMW(List<C0VML> list, List<C0VMR> list2, List<C0VMI> list3, int i) {
        this.LIZ = list;
        this.LIZIZ = list2;
        this.LIZJ = list3;
        this.LIZLLL = i;
    }
}
