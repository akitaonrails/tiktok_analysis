package X;

import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03HG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03HG implements InterfaceC1891350zJl {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public final int LLILZIL;
    public final int LLILZLL;

    public C03HG() {
        this(0, 0, 0, 63);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03HG)) {
            return false;
        }
        C03HG c03hg = (C03HG) obj;
        return this.LL == c03hg.LL && this.LLILLJJLI == c03hg.LLILLJJLI && this.LLILLL == c03hg.LLILLL && this.LLILZ == c03hg.LLILZ && this.LLILZIL == c03hg.LLILZIL && this.LLILZLL == c03hg.LLILZLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ) * 31) + this.LLILZIL) * 31) + this.LLILZLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DividerItem(height=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bgColorRes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", marginLeft=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", marginTop=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", marginRight=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", marginBottom=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C03HG(int i, int i2, int i3, int i4) {
        i = (i4 & 1) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(0.5d))) : i;
        i2 = (i4 & 2) != 0 ? R.attr.na : i2;
        i3 = (i4 & 8) != 0 ? 0 : i3;
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = 0;
        this.LLILZ = i3;
        this.LLILZIL = 0;
        this.LLILZLL = 0;
    }
}
