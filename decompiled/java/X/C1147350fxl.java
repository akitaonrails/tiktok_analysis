package X;

import com.bytedance.android.live.base.model.ImageModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fxl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1147350fxl {
    public final long LIZ;
    public final long LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;
    public final C1147410fxr LJ;
    public final C1147070fxJ LJFF;
    public final ImageModel LJI;
    public final ImageModel LJII;
    public final ImageModel LJIIIIZZ;
    public final boolean LJIIIZ;
    public final ImageModel LJIIJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1147350fxl)) {
            return false;
        }
        C1147350fxl c1147350fxl = (C1147350fxl) obj;
        return this.LIZ == c1147350fxl.LIZ && this.LIZIZ == c1147350fxl.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1147350fxl.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1147350fxl.LIZLLL) && Intrinsics.LJFF(this.LJ, c1147350fxl.LJ) && Intrinsics.LJFF(this.LJFF, c1147350fxl.LJFF) && Intrinsics.LJFF(this.LJI, c1147350fxl.LJI) && Intrinsics.LJFF(this.LJII, c1147350fxl.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c1147350fxl.LJIIIIZZ) && this.LJIIIZ == c1147350fxl.LJIIIZ && Intrinsics.LJFF(this.LJIIJ, c1147350fxl.LJIIJ);
    }

    public final int hashCode() {
        int iY2 = ((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        C1147410fxr c1147410fxr = this.LJ;
        int iHashCode = (iY2 + (c1147410fxr == null ? 0 : c1147410fxr.hashCode())) * 31;
        C1147070fxJ c1147070fxJ = this.LJFF;
        int iHashCode2 = (iHashCode + (c1147070fxJ == null ? 0 : c1147070fxJ.hashCode())) * 31;
        ImageModel imageModel = this.LJI;
        int iHashCode3 = (iHashCode2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        ImageModel imageModel2 = this.LJII;
        int iHashCode4 = (iHashCode3 + (imageModel2 == null ? 0 : imageModel2.hashCode())) * 31;
        ImageModel imageModel3 = this.LJIIIIZZ;
        int iHashCode5 = (((iHashCode4 + (imageModel3 == null ? 0 : imageModel3.hashCode())) * 31) + C786410Ut5.Z2(this.LJIIIZ)) * 31;
        ImageModel imageModel4 = this.LJIIJ;
        return iHashCode5 + (imageModel4 != null ? imageModel4.hashCode() : 0);
    }

    public final String toString() {
        return "MusicGiftDetailItemModel(giftId=" + this.LIZ + ", giftPrice=" + this.LIZIZ + ", songName=" + this.LIZJ + ", lyricsText=" + this.LIZLLL + ", artist=" + this.LJ + ", audioResource=" + this.LJFF + ", albumCover=" + this.LJI + ", outerDisc=" + this.LJII + ", coverImage=" + this.LJIIIIZZ + ", isPinned=" + this.LJIIIZ + ", topLeftLabelIcon=" + this.LJIIJ + ')';
    }

    public static C1147350fxl LIZ(C1147350fxl c1147350fxl, C1147070fxJ c1147070fxJ, boolean z, int i) {
        long j;
        String str;
        String str2;
        C1147410fxr c1147410fxr;
        ImageModel imageModel;
        ImageModel imageModel2;
        ImageModel imageModel3;
        boolean z2 = z;
        C1147070fxJ c1147070fxJ2 = c1147070fxJ;
        long j2 = 0;
        if ((i & 1) != 0) {
            j = c1147350fxl.LIZ;
        } else {
            j = 0;
        }
        if ((i & 2) != 0) {
            j2 = c1147350fxl.LIZIZ;
        }
        ImageModel imageModel4 = null;
        if ((i & 4) != 0) {
            str = c1147350fxl.LIZJ;
        } else {
            str = null;
        }
        if ((i & 8) != 0) {
            str2 = c1147350fxl.LIZLLL;
        } else {
            str2 = null;
        }
        if ((i & 16) != 0) {
            c1147410fxr = c1147350fxl.LJ;
        } else {
            c1147410fxr = null;
        }
        if ((i & 32) != 0) {
            c1147070fxJ2 = c1147350fxl.LJFF;
        }
        if ((i & 64) != 0) {
            imageModel = c1147350fxl.LJI;
        } else {
            imageModel = null;
        }
        if ((i & 128) != 0) {
            imageModel2 = c1147350fxl.LJII;
        } else {
            imageModel2 = null;
        }
        if ((i & 256) != 0) {
            imageModel3 = c1147350fxl.LJIIIIZZ;
        } else {
            imageModel3 = null;
        }
        if ((i & 512) != 0) {
            z2 = c1147350fxl.LJIIIZ;
        }
        if ((i & 1024) != 0) {
            imageModel4 = c1147350fxl.LJIIJ;
        }
        return new C1147350fxl(j, j2, str, str2, c1147410fxr, c1147070fxJ2, imageModel, imageModel2, imageModel3, z2, imageModel4);
    }

    public /* synthetic */ C1147350fxl(long j, long j2, String str, C1147410fxr c1147410fxr, C1147070fxJ c1147070fxJ, ImageModel imageModel, ImageModel imageModel2, boolean z) {
        this(j, j2, str, "", c1147410fxr, c1147070fxJ, imageModel, null, imageModel2, z, null);
    }

    public C1147350fxl(long j, long j2, String str, String str2, C1147410fxr c1147410fxr, C1147070fxJ c1147070fxJ, ImageModel imageModel, ImageModel imageModel2, ImageModel imageModel3, boolean z, ImageModel imageModel4) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = str;
        this.LIZLLL = str2;
        this.LJ = c1147410fxr;
        this.LJFF = c1147070fxJ;
        this.LJI = imageModel;
        this.LJII = imageModel2;
        this.LJIIIIZZ = imageModel3;
        this.LJIIIZ = z;
        this.LJIIJ = imageModel4;
    }
}
