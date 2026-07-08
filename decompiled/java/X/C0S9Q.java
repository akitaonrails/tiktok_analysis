package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0S9Q, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0S9Q implements InterfaceC0148002o {
    public final int LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final boolean LLILZIL;
    public final C291001Au<Unit> LLILZLL;
    public final C291001Au<Unit> LLIZ;

    public C0S9Q() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0S9Q)) {
            return false;
        }
        C0S9Q c0s9q = (C0S9Q) obj;
        return this.LL == c0s9q.LL && this.LLILLJJLI == c0s9q.LLILLJJLI && this.LLILLL == c0s9q.LLILLL && this.LLILZ == c0s9q.LLILZ && this.LLILZIL == c0s9q.LLILZIL && Intrinsics.LJFF(this.LLILZLL, c0s9q.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c0s9q.LLIZ);
    }

    public final int hashCode() {
        int iZ2 = ((((((((this.LL * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL)) * 31;
        C291001Au<Unit> c291001Au = this.LLILZLL;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLIZ;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PhotoStateV2(currentPhotoIndex=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isAutoScrollEnabled=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isPinching=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isDragging=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", isVisible=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", photosPlayFinished=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", videoPlayFinishedFirstTime=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0S9Q(int i) {
        this(0, true, false, false, false, null, null);
    }

    public C0S9Q(int i, boolean z, boolean z2, boolean z3, boolean z4, C291001Au<Unit> c291001Au, C291001Au<Unit> c291001Au2) {
        this.LL = i;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
        this.LLILZ = z3;
        this.LLILZIL = z4;
        this.LLILZLL = c291001Au;
        this.LLIZ = c291001Au2;
    }

    public static C0S9Q LIZ(C0S9Q c0s9q, int i, boolean z, boolean z2, boolean z3, C291001Au c291001Au, C291001Au c291001Au2, int i2) {
        boolean z4;
        C291001Au c291001Au3 = c291001Au2;
        C291001Au c291001Au4 = c291001Au;
        boolean z5 = z3;
        boolean z6 = z2;
        boolean z7 = z;
        int i3 = i;
        if ((i2 & 1) != 0) {
            i3 = c0s9q.LL;
        }
        if ((i2 & 2) != 0) {
            z4 = c0s9q.LLILLJJLI;
        } else {
            z4 = false;
        }
        if ((i2 & 4) != 0) {
            z7 = c0s9q.LLILLL;
        }
        if ((i2 & 8) != 0) {
            z6 = c0s9q.LLILZ;
        }
        if ((i2 & 16) != 0) {
            z5 = c0s9q.LLILZIL;
        }
        if ((i2 & 32) != 0) {
            c291001Au4 = c0s9q.LLILZLL;
        }
        if ((i2 & 64) != 0) {
            c291001Au3 = c0s9q.LLIZ;
        }
        c0s9q.getClass();
        return new C0S9Q(i3, z4, z7, z6, z5, c291001Au4, c291001Au3);
    }
}
