package X;

import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DvY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354780DvY {
    public final NLETrackSlot LIZ;
    public final NLETrackSlot LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C354780DvY)) {
            return false;
        }
        C354780DvY c354780DvY = (C354780DvY) obj;
        return Intrinsics.LJFF(this.LIZ, c354780DvY.LIZ) && Intrinsics.LJFF(this.LIZIZ, c354780DvY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c354780DvY.LIZJ) && this.LIZLLL == c354780DvY.LIZLLL;
    }

    public final int hashCode() {
        NLETrackSlot nLETrackSlot = this.LIZ;
        int iHashCode = (nLETrackSlot == null ? 0 : nLETrackSlot.hashCode()) * 31;
        NLETrackSlot nLETrackSlot2 = this.LIZIZ;
        return ((((iHashCode + (nLETrackSlot2 != null ? nLETrackSlot2.hashCode() : 0)) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomCutoutParam(cutoutMainSlot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", curOperatedBrushSlot=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", blendResPath=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", maskColor=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C354780DvY(NLETrackSlot nLETrackSlot, NLETrackSlot nLETrackSlot2, String str, int i) {
        this.LIZ = nLETrackSlot;
        this.LIZIZ = nLETrackSlot2;
        this.LIZJ = str;
        this.LIZLLL = i;
    }
}
