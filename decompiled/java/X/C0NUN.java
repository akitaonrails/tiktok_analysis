package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NUN, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NUN {
    public final AbstractC1696400uFK LIZ;
    public final C1680190tpB LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Object LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NUN)) {
            return false;
        }
        C0NUN c0nun = (C0NUN) obj;
        return Intrinsics.LJFF(this.LIZ, c0nun.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0nun.LIZIZ) && this.LIZJ == c0nun.LIZJ && this.LIZLLL == c0nun.LIZLLL && Intrinsics.LJFF(this.LJ, c0nun.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TypefaceRequest(fontFamily=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fontWeight=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fontStyle=");
        sbLIZ.append((Object) C1693240uAE.LIZ(this.LIZJ));
        sbLIZ.append(", fontSynthesis=");
        sbLIZ.append((Object) C1695610uE3.LIZ(this.LIZLLL));
        sbLIZ.append(", resourceLoaderCacheKey=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        AbstractC1696400uFK abstractC1696400uFK = this.LIZ;
        int iHashCode = (((((((abstractC1696400uFK == null ? 0 : abstractC1696400uFK.hashCode()) * 31) + this.LIZIZ.LL) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        Object obj = this.LJ;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public C0NUN(AbstractC1696400uFK abstractC1696400uFK, C1680190tpB c1680190tpB, int i, int i2, Object obj) {
        this.LIZ = abstractC1696400uFK;
        this.LIZIZ = c1680190tpB;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = obj;
    }
}
