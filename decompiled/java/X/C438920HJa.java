package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HJa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438920HJa {
    public final int LIZ;
    public final List<String> LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final C438960HJe LJI;
    public final Integer LJII;

    public C438920HJa() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C438920HJa)) {
            return false;
        }
        C438920HJa c438920HJa = (C438920HJa) obj;
        return this.LIZ == c438920HJa.LIZ && Intrinsics.LJFF(this.LIZIZ, c438920HJa.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c438920HJa.LIZJ) && this.LIZLLL == c438920HJa.LIZLLL && Intrinsics.LJFF(this.LJ, c438920HJa.LJ) && Intrinsics.LJFF(this.LJFF, c438920HJa.LJFF) && Intrinsics.LJFF(this.LJI, c438920HJa.LJI) && Intrinsics.LJFF(this.LJII, c438920HJa.LJII);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SocialAvatarStatusResponse(state=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", thumbnailUrl=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isAISelfSideTask=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", socialAvatarPreviewUrl=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", aiSelfPreviewUrl=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", uploadInfo=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", generationScene=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C438920HJa(int i, List list, Integer num, boolean z, String str, String str2, C438960HJe c438960HJe, Integer num2, int i2) {
        list = (i2 & 2) != 0 ? null : list;
        num = (i2 & 4) != 0 ? null : num;
        z = (i2 & 8) != 0 ? false : z;
        str = (i2 & 16) != 0 ? null : str;
        str2 = (i2 & 32) != 0 ? null : str2;
        c438960HJe = (i2 & 64) != 0 ? null : c438960HJe;
        num2 = (i2 & 128) != 0 ? null : num2;
        this.LIZ = i;
        this.LIZIZ = list;
        this.LIZJ = num;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = str2;
        this.LJI = c438960HJe;
        this.LJII = num2;
    }
}
