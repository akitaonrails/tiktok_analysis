package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06df, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1653306df implements InterfaceC0148002o {
    public static final /* synthetic */ int LLILZ = 0;
    public final boolean LL;
    public final C291001Au<Integer> LLILLJJLI;
    public final C291001Au<Unit> LLILLL;

    public C1653306df() {
        this(7, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1653306df)) {
            return false;
        }
        C1653306df c1653306df = (C1653306df) obj;
        return this.LL == c1653306df.LL && Intrinsics.LJFF(this.LLILLJJLI, c1653306df.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1653306df.LLILLL);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C291001Au<Integer> c291001Au = this.LLILLJJLI;
        int iHashCode = (iZ2 + (c291001Au == null ? 0 : c291001Au.hashCode())) * 31;
        C291001Au<Unit> c291001Au2 = this.LLILLL;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickChatState(isSheetExpanded=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", expandToFullScreen=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dismissSheet=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1653306df(int i, boolean z) {
        this(null, null, (i & 1) != 0 ? false : z);
    }

    public C1653306df(C291001Au c291001Au, C291001Au c291001Au2, boolean z) {
        this.LL = z;
        this.LLILLJJLI = c291001Au;
        this.LLILLL = c291001Au2;
    }
}
