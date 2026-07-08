package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0FNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C389230FNx {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final EnumC366550EYr LIZJ;
    public final VideoPublishEditModel LIZLLL;
    public final C375830EoP<Unit> LJ;
    public final C375830EoP<Unit> LJFF;
    public final C375830EoP<EnumC366550EYr> LJI;

    public C389230FNx() {
        this(false, null, 127);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C389230FNx)) {
            return false;
        }
        C389230FNx c389230FNx = (C389230FNx) obj;
        return this.LIZ == c389230FNx.LIZ && this.LIZIZ == c389230FNx.LIZIZ && this.LIZJ == c389230FNx.LIZJ && Intrinsics.LJFF(this.LIZLLL, c389230FNx.LIZLLL) && Intrinsics.LJFF(this.LJ, c389230FNx.LJ) && Intrinsics.LJFF(this.LJFF, c389230FNx.LJFF) && Intrinsics.LJFF(this.LJI, c389230FNx.LJI);
    }

    public final int hashCode() {
        int iZ2 = ((((((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        C375830EoP<Unit> c375830EoP = this.LJ;
        int iHashCode = (iZ2 + (c375830EoP == null ? 0 : c375830EoP.hashCode())) * 31;
        C375830EoP<Unit> c375830EoP2 = this.LJFF;
        int iHashCode2 = (iHashCode + (c375830EoP2 == null ? 0 : c375830EoP2.hashCode())) * 31;
        C375830EoP<EnumC366550EYr> c375830EoP3 = this.LJI;
        return iHashCode2 + (c375830EoP3 != null ? c375830EoP3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EditLyricStickerEffectState(isMultiMusic=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", visibleState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", enterSource=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", editModel=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showEvent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", hideEvent=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", panelShowEvent=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C389230FNx(boolean z, VideoPublishEditModel videoPublishEditModel, int i) {
        EnumC366550EYr enumC366550EYr;
        VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
        boolean z2 = (i & 1) != 0 ? false : z;
        if ((i & 4) != 0) {
            enumC366550EYr = EnumC366550EYr.UNKNOWN;
        } else {
            enumC366550EYr = null;
        }
        this(z2, false, enumC366550EYr, (i & 8) != 0 ? new VideoPublishEditModel() : videoPublishEditModel2, null, null, null);
    }

    public static C389230FNx LIZ(C389230FNx c389230FNx, EnumC366550EYr enumC366550EYr, C375830EoP c375830EoP, C375830EoP c375830EoP2, C375830EoP c375830EoP3, int i) {
        boolean z;
        VideoPublishEditModel videoPublishEditModel;
        C375830EoP c375830EoP4 = c375830EoP3;
        C375830EoP c375830EoP5 = c375830EoP2;
        C375830EoP c375830EoP6 = c375830EoP;
        EnumC366550EYr enumC366550EYr2 = enumC366550EYr;
        boolean z2 = false;
        if ((i & 1) != 0) {
            z = c389230FNx.LIZ;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            z2 = c389230FNx.LIZIZ;
        }
        if ((i & 4) != 0) {
            enumC366550EYr2 = c389230FNx.LIZJ;
        }
        if ((i & 8) != 0) {
            videoPublishEditModel = c389230FNx.LIZLLL;
        } else {
            videoPublishEditModel = null;
        }
        if ((i & 16) != 0) {
            c375830EoP6 = c389230FNx.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP5 = c389230FNx.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP4 = c389230FNx.LJI;
        }
        c389230FNx.getClass();
        return new C389230FNx(z, z2, enumC366550EYr2, videoPublishEditModel, c375830EoP6, c375830EoP5, c375830EoP4);
    }

    public C389230FNx(boolean z, boolean z2, EnumC366550EYr enumC366550EYr, VideoPublishEditModel videoPublishEditModel, C375830EoP<Unit> c375830EoP, C375830EoP<Unit> c375830EoP2, C375830EoP<EnumC366550EYr> c375830EoP3) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = enumC366550EYr;
        this.LIZLLL = videoPublishEditModel;
        this.LJ = c375830EoP;
        this.LJFF = c375830EoP2;
        this.LJI = c375830EoP3;
    }
}
