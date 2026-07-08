package X;

import com.bytedance.android.live.base.model.ImageModel;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.TPText;

/* JADX INFO: renamed from: X.0ePY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1087700ePY {
    public final String LIZ;
    public final TPText LIZIZ;
    public final long LIZJ;
    public final ImageModel LIZLLL;
    public final C1087670ePV LJ;
    public final String LJFF;
    public final Boolean LJI;
    public final long LJII;
    public final long LJIIIIZZ;
    public final int LJIIIZ;
    public final boolean LJIIJ;

    public C1087700ePY() {
        this(null, null, Mp4ScreenVideoLoadTimeout.CONTROL, null, null, null, null, 0L, 0L, 0, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1087700ePY)) {
            return false;
        }
        C1087700ePY c1087700ePY = (C1087700ePY) obj;
        return Intrinsics.LJFF(this.LIZ, c1087700ePY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1087700ePY.LIZIZ) && this.LIZJ == c1087700ePY.LIZJ && Intrinsics.LJFF(this.LIZLLL, c1087700ePY.LIZLLL) && Intrinsics.LJFF(this.LJ, c1087700ePY.LJ) && Intrinsics.LJFF(this.LJFF, c1087700ePY.LJFF) && Intrinsics.LJFF(this.LJI, c1087700ePY.LJI) && this.LJII == c1087700ePY.LJII && this.LJIIIIZZ == c1087700ePY.LJIIIIZZ && this.LJIIIZ == c1087700ePY.LJIIIZ && this.LJIIJ == c1087700ePY.LJIIJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        TPText tPText = this.LIZIZ;
        int iHashCode2 = (((iHashCode + (tPText == null ? 0 : tPText.hashCode())) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31;
        ImageModel imageModel = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (imageModel == null ? 0 : imageModel.hashCode())) * 31;
        C1087670ePV c1087670ePV = this.LJ;
        int iHashCode4 = (iHashCode3 + (c1087670ePV == null ? 0 : c1087670ePV.hashCode())) * 31;
        String str2 = this.LJFF;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool = this.LJI;
        return ((((((((iHashCode5 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Y2(this.LJII)) * 31) + C786410Ut5.Y2(this.LJIIIIZZ)) * 31) + this.LJIIIZ) * 31) + C786410Ut5.Z2(this.LJIIJ);
    }

    public final String toString() {
        return "TpBubbleConfig(backgroundColor=" + this.LIZ + ", tpBubbleText=" + this.LIZIZ + ", duration=" + this.LIZJ + ", icon=" + this.LIZLLL + ", bubbleDecoration=" + this.LJ + ", onclickSchema=" + this.LJFF + ", animated=" + this.LJI + ", preselectedGiftId=" + this.LJII + ", preselectedMatchItemId=" + this.LJIIIIZZ + ", tapDismissArea=" + this.LJIIIZ + ", hasArrow=" + this.LJIIJ + ')';
    }

    public C1087700ePY(String str, TPText tPText, long j, ImageModel imageModel, C1087670ePV c1087670ePV, String str2, Boolean bool, long j2, long j3, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = tPText;
        this.LIZJ = j;
        this.LIZLLL = imageModel;
        this.LJ = c1087670ePV;
        this.LJFF = str2;
        this.LJI = bool;
        this.LJII = j2;
        this.LJIIIIZZ = j3;
        this.LJIIIZ = i;
        this.LJIIJ = z;
    }
}
