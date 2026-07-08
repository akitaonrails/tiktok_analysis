package X;

import android.util.Size;
import android.view.MotionEvent;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354750DvV {
    public final C354790DvZ LIZ;
    public final NLETrackSlot LIZIZ;
    public final NLETrackSlot LIZJ;
    public final NLETrackSlot LIZLLL;
    public final MotionEvent LJ;
    public final Size LJFF;
    public final float LJI;
    public final float LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C354750DvV)) {
            return false;
        }
        C354750DvV c354750DvV = (C354750DvV) obj;
        return Intrinsics.LJFF(this.LIZ, c354750DvV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c354750DvV.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c354750DvV.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c354750DvV.LIZLLL) && Intrinsics.LJFF(this.LJ, c354750DvV.LJ) && Intrinsics.LJFF(this.LJFF, c354750DvV.LJFF) && Float.compare(this.LJI, c354750DvV.LJI) == 0 && Float.compare(this.LJII, c354750DvV.LJII) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutBrushMotionParam(magnifyParam=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cutoutMainSlot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", operatedBrushStickerSlot=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", operatedBrushCircleSlot=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", fingerMotionEvent=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", previewPanelSize=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", surfaceViewRatio=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", canvasRatio=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        C354790DvZ c354790DvZ = this.LIZ;
        int iHashCode = (c354790DvZ == null ? 0 : c354790DvZ.hashCode()) * 31;
        NLETrackSlot nLETrackSlot = this.LIZIZ;
        int iHashCode2 = (iHashCode + (nLETrackSlot == null ? 0 : nLETrackSlot.hashCode())) * 31;
        NLETrackSlot nLETrackSlot2 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (nLETrackSlot2 == null ? 0 : nLETrackSlot2.hashCode())) * 31;
        NLETrackSlot nLETrackSlot3 = this.LIZLLL;
        return ((((((((iHashCode3 + (nLETrackSlot3 != null ? nLETrackSlot3.hashCode() : 0)) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode()) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII);
    }

    public C354750DvV(C354790DvZ c354790DvZ, NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, NLETrackSlot nLETrackSlot3, MotionEvent motionEvent, Size size, float f, float f2) {
        this.LIZ = c354790DvZ;
        this.LIZIZ = nLETrackSlot;
        this.LIZJ = nLETrackSlot2;
        this.LIZLLL = nLETrackSlot3;
        this.LJ = motionEvent;
        this.LJFF = size;
        this.LJI = f;
        this.LJII = f2;
    }
}
