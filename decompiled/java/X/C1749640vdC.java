package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0vdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1749640vdC extends AbstractC1749630vdB {
    public final String LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1749640vdC)) {
            return false;
        }
        C1749640vdC c1749640vdC = (C1749640vdC) obj;
        return Intrinsics.LJFF(this.LIZ, c1749640vdC.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1749640vdC.LIZIZ) && this.LIZJ == c1749640vdC.LIZJ && this.LIZLLL == c1749640vdC.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMCacheSpaceImageDownloadTask(cacheSpace=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", url=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", priority=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", createdTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1749630vdB
    public final long LIZ() {
        return this.LIZLLL;
    }

    @Override // X.AbstractC1749630vdB
    public final long LIZIZ() {
        return this.LIZJ;
    }

    @Override // X.AbstractC1749630vdB
    public final String LIZJ() {
        return this.LIZIZ;
    }

    public C1749640vdC(String str, String str2, long j, long j2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
