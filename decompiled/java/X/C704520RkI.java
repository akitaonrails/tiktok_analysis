package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RkI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C704520RkI implements InterfaceC0148002o {
    public final C291001Au<String> LL;
    public final C291001Au<Integer> LLILLJJLI;
    public final Integer LLILLL;

    public C704520RkI() {
        this(null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C704520RkI)) {
            return false;
        }
        C704520RkI c704520RkI = (C704520RkI) obj;
        return Intrinsics.LJFF(this.LL, c704520RkI.LL) && Intrinsics.LJFF(this.LLILLJJLI, c704520RkI.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c704520RkI.LLILLL);
    }

    public final int hashCode() {
        C291001Au<String> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Integer> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        Integer num = this.LLILLL;
        return iHashCode2 + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoFeedMultiTagState(awemeId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onPageSelectedEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", currentIndex=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C704520RkI(C291001Au c291001Au, int i) {
        this((i & 1) != 0 ? null : c291001Au, null, null);
    }

    public C704520RkI(C291001Au<String> c291001Au, C291001Au<Integer> c291001Au2, Integer num) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = num;
    }

    public static C704520RkI LIZ(C704520RkI c704520RkI, C291001Au c291001Au, C291001Au c291001Au2, Integer num, int i) {
        if ((i & 1) != 0) {
            c291001Au = c704520RkI.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c704520RkI.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            num = c704520RkI.LLILLL;
        }
        c704520RkI.getClass();
        return new C704520RkI(c291001Au, c291001Au2, num);
    }
}
