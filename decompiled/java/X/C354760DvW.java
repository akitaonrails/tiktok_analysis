package X;

import android.util.Size;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C354760DvW {
    public final NLETrackSlot LIZ;
    public final Size LIZIZ;
    public final EnumC356150Dxl LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;

    public C354760DvW() {
        this(null, new Size(0, 0), EnumC356150Dxl.NORMAL, "", "", "");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C354760DvW)) {
            return false;
        }
        C354760DvW c354760DvW = (C354760DvW) obj;
        return Intrinsics.LJFF(this.LIZ, c354760DvW.LIZ) && Intrinsics.LJFF(this.LIZIZ, c354760DvW.LIZIZ) && this.LIZJ == c354760DvW.LIZJ && Intrinsics.LJFF(this.LIZLLL, c354760DvW.LIZLLL) && Intrinsics.LJFF(this.LJ, c354760DvW.LJ) && Intrinsics.LJFF(this.LJFF, c354760DvW.LJFF);
    }

    public final int hashCode() {
        NLETrackSlot nLETrackSlot = this.LIZ;
        return ((((((((((nLETrackSlot == null ? 0 : nLETrackSlot.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CutoutBrushInitialParam(cutoutMainSlot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", canvasSize=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", brushType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", brushCachePath=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", brushResPath=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", brushCircleResPath=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C354760DvW(NLETrackSlot nLETrackSlot, Size size, EnumC356150Dxl enumC356150Dxl, String str, String str2, String str3) {
        this.LIZ = nLETrackSlot;
        this.LIZIZ = size;
        this.LIZJ = enumC356150Dxl;
        this.LIZLLL = str;
        this.LJ = str2;
        this.LJFF = str3;
    }
}
