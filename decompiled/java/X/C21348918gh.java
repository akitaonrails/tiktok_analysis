package X;

import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21348918gh {
    public final MediaModel LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final boolean LJII;
    public final String LJIIIIZZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C21348918gh() {
        boolean z = false;
        this(z, z, null, 511);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21348918gh)) {
            return false;
        }
        C21348918gh c21348918gh = (C21348918gh) obj;
        return Intrinsics.LJFF(this.LIZ, c21348918gh.LIZ) && this.LIZIZ == c21348918gh.LIZIZ && this.LIZJ == c21348918gh.LIZJ && this.LIZLLL == c21348918gh.LIZLLL && this.LJ == c21348918gh.LJ && this.LJFF == c21348918gh.LJFF && this.LJI == c21348918gh.LJI && this.LJII == c21348918gh.LJII && Intrinsics.LJFF(this.LJIIIIZZ, c21348918gh.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = ((((((((((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL)) * 31) + C786410Ut5.Z2(this.LJ)) * 31) + C786410Ut5.Z2(this.LJFF)) * 31) + C786410Ut5.Z2(this.LJI)) * 31) + C786410Ut5.Z2(this.LJII)) * 31;
        String str = this.LJIIIIZZ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VoiceToolbarStates(mediaModel=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isNextButtonEnable=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isShow=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", isMicRecordingHandoffMode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", showMicButton=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", showNextButton=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", showMentionButton=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isToolbarDisabled=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", ctaText=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C21348918gh(boolean z, boolean z2, String str, int i) {
        MediaModel mediaModel;
        boolean z3;
        boolean z4 = z2;
        boolean z5 = z;
        if ((i & 1) != 0) {
            mediaModel = new MediaModel(-1L);
            mediaModel.LJIILL("");
        } else {
            mediaModel = null;
        }
        if ((i & 4) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        this(mediaModel, false, z3, false, (i & 16) != 0 ? true : z5, false, (i & 64) != 0 ? true : z4, false, (i & 256) == 0 ? str : null);
    }

    public C21348918gh(MediaModel mediaModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, String str) {
        this.LIZ = mediaModel;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = z3;
        this.LJ = z4;
        this.LJFF = z5;
        this.LJI = z6;
        this.LJII = z7;
        this.LJIIIIZZ = str;
    }

    public static C21348918gh LIZ(C21348918gh c21348918gh, MediaModel mediaModel, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, int i) {
        String str;
        boolean z8 = z7;
        boolean z9 = z6;
        boolean z10 = z5;
        boolean z11 = z4;
        boolean z12 = z3;
        boolean z13 = z2;
        boolean z14 = z;
        MediaModel mediaModel2 = mediaModel;
        if ((i & 1) != 0) {
            mediaModel2 = c21348918gh.LIZ;
        }
        if ((i & 2) != 0) {
            z14 = c21348918gh.LIZIZ;
        }
        if ((i & 4) != 0) {
            z13 = c21348918gh.LIZJ;
        }
        if ((i & 8) != 0) {
            z12 = c21348918gh.LIZLLL;
        }
        if ((i & 16) != 0) {
            z11 = c21348918gh.LJ;
        }
        if ((i & 32) != 0) {
            z10 = c21348918gh.LJFF;
        }
        if ((i & 64) != 0) {
            z9 = c21348918gh.LJI;
        }
        if ((i & 128) != 0) {
            z8 = c21348918gh.LJII;
        }
        if ((i & 256) != 0) {
            str = c21348918gh.LJIIIIZZ;
        } else {
            str = null;
        }
        c21348918gh.getClass();
        return new C21348918gh(mediaModel2, z14, z13, z12, z11, z10, z9, z8, str);
    }
}
