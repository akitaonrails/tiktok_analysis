package X;

import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O2V, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O2V implements InterfaceC0148002o {
    public final C291001Au<List<String>> LL;
    public final C291001Au<Typeface> LLILLJJLI;

    public C0O2V() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O2V)) {
            return false;
        }
        C0O2V c0o2v = (C0O2V) obj;
        return Intrinsics.LJFF(this.LL, c0o2v.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0o2v.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FullyCustomizedBoardEditFontState(currentFont=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onFontSelected=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0O2V(int i) {
        this(new C291001Au(new ArrayList()), new C291001Au(null));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0O2V(C291001Au<? extends List<String>> c291001Au, C291001Au<? extends Typeface> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }
}
