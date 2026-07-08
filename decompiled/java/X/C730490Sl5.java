package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sl5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C730490Sl5 implements InterfaceC0148002o {
    public final boolean LL;
    public final C731910SnN LLILLJJLI;
    public final C291001Au<Boolean> LLILLL;
    public final C291001Au<Boolean> LLILZ;
    public final C291001Au<Boolean> LLILZIL;
    public final C291001Au<Boolean> LLILZLL;

    public C730490Sl5() {
        this(false, null, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C730490Sl5)) {
            return false;
        }
        C730490Sl5 c730490Sl5 = (C730490Sl5) obj;
        return this.LL == c730490Sl5.LL && Intrinsics.LJFF(this.LLILLJJLI, c730490Sl5.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c730490Sl5.LLILLL) && Intrinsics.LJFF(this.LLILZ, c730490Sl5.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c730490Sl5.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c730490Sl5.LLILZLL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C731910SnN c731910SnN = this.LLILLJJLI;
        int iHashCode = (iZ2 + (c731910SnN == null ? 0 : c731910SnN.hashCode())) * 31;
        C291001Au<Boolean> c291001Au = this.LLILLL;
        int iHashCode2 = (iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILZ;
        int iHashCode3 = (iHashCode2 + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<Boolean> c291001Au3 = this.LLILZIL;
        int iHashCode4 = (iHashCode3 + (c291001Au3 == null ? 0 : c291001Au3.hashCode())) * 31;
        C291001Au<Boolean> c291001Au4 = this.LLILZLL;
        return iHashCode4 + (c291001Au4 != null ? c291001Au4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoDiggState(showFestival=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", displayState=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showClickAnim=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", showDislikeAnim=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", resizeOver=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", clickEvent=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C730490Sl5(boolean z, C731910SnN c731910SnN, int i) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : c731910SnN, null, null, null, null);
    }

    public C730490Sl5(boolean z, C731910SnN c731910SnN, C291001Au<Boolean> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Boolean> c291001Au3, C291001Au<Boolean> c291001Au4) {
        this.LL = z;
        this.LLILLJJLI = c731910SnN;
        this.LLILLL = c291001Au;
        this.LLILZ = c291001Au2;
        this.LLILZIL = c291001Au3;
        this.LLILZLL = c291001Au4;
    }

    public static C730490Sl5 LIZ(C730490Sl5 c730490Sl5, C731910SnN c731910SnN, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, C291001Au c291001Au4, int i) {
        boolean z;
        C291001Au c291001Au5 = c291001Au4;
        C291001Au c291001Au6 = c291001Au3;
        C291001Au c291001Au7 = c291001Au2;
        C291001Au c291001Au8 = c291001Au;
        C731910SnN c731910SnN2 = c731910SnN;
        if ((i & 1) != 0) {
            z = c730490Sl5.LL;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            c731910SnN2 = c730490Sl5.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au8 = c730490Sl5.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au7 = c730490Sl5.LLILZ;
        }
        if ((i & 16) != 0) {
            c291001Au6 = c730490Sl5.LLILZIL;
        }
        if ((i & 32) != 0) {
            c291001Au5 = c730490Sl5.LLILZLL;
        }
        c730490Sl5.getClass();
        return new C730490Sl5(z, c731910SnN2, c291001Au8, c291001Au7, c291001Au6, c291001Au5);
    }
}
