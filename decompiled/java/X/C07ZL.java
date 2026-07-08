package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07ZL, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07ZL implements InterfaceC2753014t {
    public final int LL;
    public final int LLILLJJLI;
    public final String LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;

    public C07ZL() {
        this(31);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07ZL)) {
            return false;
        }
        C07ZL c07zl = (C07ZL) obj;
        return this.LL == c07zl.LL && this.LLILLJJLI == c07zl.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c07zl.LLILLL) && this.LLILZ == c07zl.LLILZ && this.LLILZIL == c07zl.LLILZIL;
    }

    public final int hashCode() {
        return (((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL.hashCode()) * 31) + C786410Ut5.Z2(this.LLILZ)) * 31) + C786410Ut5.Z2(this.LLILZIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OverlayParams(overlayHeight=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", parentHeight=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", sourceId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", hideOverlayWhenSlide=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", showMaskWhenFullPage=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07ZL(int i) {
        String str;
        if ((i & 4) != 0) {
            str = "flexible_overlay_params";
        } else {
            str = null;
        }
        this.LL = 0;
        this.LLILLJJLI = 0;
        this.LLILLL = str;
        this.LLILZ = false;
        this.LLILZIL = false;
    }
}
