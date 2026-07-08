package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0H89, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H89 implements InterfaceC0148002o {
    public final C291001Au<View> LL;
    public final C291001Au<Integer> LLILLJJLI;

    public C0H89() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0H89)) {
            return false;
        }
        C0H89 c0h89 = (C0H89) obj;
        return Intrinsics.LJFF(this.LL, c0h89.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0h89.LLILLJJLI);
    }

    public final int hashCode() {
        C291001Au<View> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Integer> c291001Au2 = this.LLILLJJLI;
        return iHashCode + (c291001Au2 != null ? c291001Au2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchVideoViewState(clickEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", playStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0H89(C291001Au<? extends View> c291001Au, C291001Au<Integer> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
