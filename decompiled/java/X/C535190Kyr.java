package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Kyr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535190Kyr {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final long LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C535190Kyr)) {
            return false;
        }
        C535190Kyr c535190Kyr = (C535190Kyr) obj;
        return Intrinsics.LJFF(this.LIZ, c535190Kyr.LIZ) && Intrinsics.LJFF(this.LIZIZ, c535190Kyr.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c535190Kyr.LIZJ) && this.LIZLLL == c535190Kyr.LIZLLL && this.LJ == c535190Kyr.LJ && this.LJFF == c535190Kyr.LJFF && this.LJI == c535190Kyr.LJI;
    }

    public final int hashCode() {
        return (((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + this.LJ) * 31) + this.LJFF) * 31) + C786410Ut5.Y2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AiPortraitAlbumItem(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", taskId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mediaUrl=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isVideo=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", createTimeMs=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C535190Kyr(int i, int i2, String str, String str2, String str3, boolean z, long j) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = z;
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = j;
    }
}
