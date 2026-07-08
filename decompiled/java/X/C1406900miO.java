package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0miO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1406900miO extends AbstractC1406870miL {
    public final String LIZ;
    public final List<InterfaceC1406920miQ> LIZIZ;
    public final EnumC1064704Ej LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1406900miO)) {
            return false;
        }
        C1406900miO c1406900miO = (C1406900miO) obj;
        return Intrinsics.LJFF(this.LIZ, c1406900miO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1406900miO.LIZIZ) && this.LIZJ == c1406900miO.LIZJ && this.LIZLLL == c1406900miO.LIZLLL && this.LJ == c1406900miO.LJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkuScroll(pageName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", preloadInfos=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", scrollDirection=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", index=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", visibleItemCount=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1406900miO(String str, List<? extends InterfaceC1406920miQ> list, EnumC1064704Ej enumC1064704Ej, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = enumC1064704Ej;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
