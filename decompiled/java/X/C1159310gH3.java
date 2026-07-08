package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gH3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159310gH3 implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<Boolean> LLILZ;

    public C1159310gH3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159310gH3)) {
            return false;
        }
        C1159310gH3 c1159310gH3 = (C1159310gH3) obj;
        return Intrinsics.LJFF(this.LL, c1159310gH3.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159310gH3.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1159310gH3.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1159310gH3.LLILZ);
    }

    public final int hashCode() {
        return (((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoRelationBtnState(relationBtnShowEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", followEventAnimation=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", followExtendInteraction=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", addANoteButtonShowEvent=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1159310gH3(int i) {
        Boolean bool = Boolean.FALSE;
        this(new C291001Au(bool), new C291001Au(bool), new C291001Au(bool), new C291001Au(bool));
    }

    public C1159310gH3(C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<Boolean> c291001Au4) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
    }

    public static C1159310gH3 LIZ(C1159310gH3 c1159310gH3, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1159310gH3.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1159310gH3.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c1159310gH3.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au4 = c1159310gH3.LLILZ;
        }
        c1159310gH3.getClass();
        return new C1159310gH3(c291001Au, c291001Au2, c291001Au3, c291001Au4);
    }
}
