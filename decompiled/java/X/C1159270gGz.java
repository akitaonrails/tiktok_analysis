package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gGz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1159270gGz implements InterfaceC0148002o {
    public final List<C1852560yJC> LL;
    public final C291001Au<C1852560yJC> LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;

    public C1159270gGz() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1159270gGz)) {
            return false;
        }
        C1159270gGz c1159270gGz = (C1159270gGz) obj;
        return Intrinsics.LJFF(this.LL, c1159270gGz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1159270gGz.LLILLJJLI) && this.LLILLL == c1159270gGz.LLILLL && this.LLILZ == c1159270gGz.LLILZ;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<C1852560yJC> c291001Au = this.LLILLJJLI;
        return ((((iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoCreateBottomInputState(selectedPhotos=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onPhotoRemoved=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", enablePhotoPick=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", keyboardVisible=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1159270gGz(int i) {
        this(C13BV.INSTANCE, null, true, false);
    }

    public C1159270gGz(List<C1852560yJC> list, C291001Au<C1852560yJC> c291001Au, boolean z, boolean z2) {
        this.LL = list;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = z;
        this.LLILZ = z2;
    }

    public static C1159270gGz LIZ(C1159270gGz c1159270gGz, List list, C291001Au c291001Au, boolean z, boolean z2, int i) {
        if ((i & 1) != 0) {
            list = c1159270gGz.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1159270gGz.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z = c1159270gGz.LLILLL;
        }
        if ((i & 8) != 0) {
            z2 = c1159270gGz.LLILZ;
        }
        c1159270gGz.getClass();
        return new C1159270gGz(list, c291001Au, z, z2);
    }
}
