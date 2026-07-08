package X;

import android.os.Bundle;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0O2L, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O2L implements InterfaceC0148002o {
    public final C291001Au<Pair<Boolean, Bundle>> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final Pair<Boolean, C0N14> LLILLL;

    public C0O2L() {
        this(null, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0O2L)) {
            return false;
        }
        C0O2L c0o2l = (C0O2L) obj;
        return Intrinsics.LJFF(this.LL, c0o2l.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0o2l.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0o2l.LLILLL);
    }

    public final int hashCode() {
        C291001Au<Pair<Boolean, Bundle>> c291001Au = this.LL;
        int iHashCode = (c291001Au == null ? 0 : c291001Au.hashCode()) * 31;
        C291001Au<Boolean> c291001Au2 = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (c291001Au2 == null ? 0 : c291001Au2.hashCode())) * 31;
        Pair<Boolean, C0N14> pair = this.LLILLL;
        return iHashCode2 + (pair != null ? pair.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FriendsV3PageState(pageSelectState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", pageForegroundEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", navToDetail=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0O2L(C291001Au<Pair<Boolean, Bundle>> c291001Au, C291001Au<Boolean> c291001Au2, Pair<Boolean, ? extends C0N14> pair) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = pair;
    }

    public static C0O2L LIZ(C0O2L c0o2l, C291001Au c291001Au, C291001Au c291001Au2, Pair pair, int i) {
        if ((i & 1) != 0) {
            c291001Au = c0o2l.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c0o2l.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            pair = c0o2l.LLILLL;
        }
        c0o2l.getClass();
        return new C0O2L(c291001Au, c291001Au2, pair);
    }
}
