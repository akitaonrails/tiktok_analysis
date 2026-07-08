package X;

import com.ss.android.ugc.gamora.editorpro.capabilities.video.adjust.logic.SelectSegmentInfo;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0E3X, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E3X {
    public final int LIZ;
    public final float LIZIZ;
    public final C358330E3b LIZJ;
    public final List<SelectSegmentInfo> LIZLLL;

    public C0E3X() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0E3X)) {
            return false;
        }
        C0E3X c0e3x = (C0E3X) obj;
        return this.LIZ == c0e3x.LIZ && Float.compare(this.LIZIZ, c0e3x.LIZIZ) == 0 && Intrinsics.LJFF(this.LIZJ, c0e3x.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0e3x.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoAdjustStates(indicatorIndex=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rangeCursor=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rangeData=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", indicatorData=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        int iFloatToIntBits = ((this.LIZ * 31) + Float.floatToIntBits(this.LIZIZ)) * 31;
        C358330E3b c358330E3b = this.LIZJ;
        return ((iFloatToIntBits + (c358330E3b == null ? 0 : c358330E3b.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public C0E3X(int i) {
        this(-1, -1.0f, null, C13BV.INSTANCE);
    }

    public C0E3X(int i, float f, C358330E3b c358330E3b, List<SelectSegmentInfo> list) {
        this.LIZ = i;
        this.LIZIZ = f;
        this.LIZJ = c358330E3b;
        this.LIZLLL = list;
    }

    public static C0E3X LIZ(C0E3X c0e3x, int i, float f, C358330E3b c358330E3b, List list, int i2) {
        if ((i2 & 1) != 0) {
            i = c0e3x.LIZ;
        }
        if ((i2 & 2) != 0) {
            f = c0e3x.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            c358330E3b = c0e3x.LIZJ;
        }
        if ((i2 & 8) != 0) {
            list = c0e3x.LIZLLL;
        }
        c0e3x.getClass();
        return new C0E3X(i, f, c358330E3b, list);
    }
}
