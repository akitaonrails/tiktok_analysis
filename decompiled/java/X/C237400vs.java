package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00vs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C237400vs implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<Unit> LLILLJJLI;
    public final C291001Au<C660140Puu> LLILLL;
    public final C291001Au<Boolean> LLILZ;

    public C237400vs() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C237400vs)) {
            return false;
        }
        C237400vs c237400vs = (C237400vs) obj;
        return Intrinsics.LJFF(this.LL, c237400vs.LL) && Intrinsics.LJFF(this.LLILLJJLI, c237400vs.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c237400vs.LLILLL) && Intrinsics.LJFF(this.LLILZ, c237400vs.LLILZ);
    }

    public final int hashCode() {
        C291001Au<Unit> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        C291001Au<C660140Puu> c291001Au3 = this.LLILLL;
        return ((iHashCode2 + (c291001Au3 != null ? c291001Au3.hashCode() : 0)) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchPhotoState(onPlayMediaEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onPauseMediaEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", onLikeEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onPlayStatus=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C237400vs(int i) {
        this(null, null, null, new C291001Au(Boolean.FALSE));
    }

    public C237400vs(C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<C660140Puu> c291001Au3, C291001Au<Boolean> c291001Au4) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
        this.LLILZ = c291001Au4;
    }

    public static C237400vs LIZ(C237400vs c237400vs, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        C291001Au<Unit> c291001Au3;
        C291001Au<Unit> c291001Au4 = null;
        if ((i & 1) != 0) {
            c291001Au3 = c237400vs.LL;
        } else {
            c291001Au3 = null;
        }
        if ((i & 2) != 0) {
            c291001Au4 = c237400vs.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            c291001Au = c237400vs.LLILLL;
        }
        if ((i & 8) != 0) {
            c291001Au2 = c237400vs.LLILZ;
        }
        c237400vs.getClass();
        return new C237400vs(c291001Au3, c291001Au4, c291001Au, c291001Au2);
    }
}
