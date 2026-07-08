package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1340020kyW extends AbstractC1340120kyg {
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1340020kyW)) {
            return false;
        }
        C1340020kyW c1340020kyW = (C1340020kyW) obj;
        return this.LIZIZ == c1340020kyW.LIZIZ && this.LIZJ == c1340020kyW.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1340020kyW.LIZLLL);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return iZ2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Original(showUI=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromCancelledTranslation=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", awemeId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1340020kyW(boolean z, boolean z2, String str) {
        super(C0SKK.ORIGINAL);
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str;
    }
}
