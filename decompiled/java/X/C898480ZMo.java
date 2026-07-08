package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZMo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C898480ZMo implements InterfaceC0148002o {
    public final C898490ZMp LL;
    public final C898510ZMr LLILLJJLI;

    public C898480ZMo() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C898480ZMo)) {
            return false;
        }
        C898480ZMo c898480ZMo = (C898480ZMo) obj;
        return Intrinsics.LJFF(this.LL, c898480ZMo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c898480ZMo.LLILLJJLI);
    }

    public final int hashCode() {
        C898490ZMp c898490ZMp = this.LL;
        int iHashCode = (c898490ZMp == null ? 0 : c898490ZMp.hashCode()) * 31;
        C898510ZMr c898510ZMr = this.LLILLJJLI;
        return iHashCode + (c898510ZMr != null ? c898510ZMr.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InteractionCardState(fortuneCookieInlineState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", fortuneCookieResources=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C898480ZMo(C898490ZMp c898490ZMp, C898510ZMr c898510ZMr) {
        this.LL = c898490ZMp;
        this.LLILLJJLI = c898510ZMr;
    }

    public static C898480ZMo LIZ(C898480ZMo c898480ZMo, C898490ZMp c898490ZMp, C898510ZMr c898510ZMr, int i) {
        if ((i & 1) != 0) {
            c898490ZMp = c898480ZMo.LL;
        }
        if ((i & 2) != 0) {
            c898510ZMr = c898480ZMo.LLILLJJLI;
        }
        c898480ZMo.getClass();
        return new C898480ZMo(c898490ZMp, c898510ZMr);
    }
}
