package X;

import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00GN, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00GN implements InterfaceC1891350zJl {
    public final Unit LL;
    public final int LLILLJJLI;

    public C00GN() {
        this(0, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00GN)) {
            return false;
        }
        C00GN c00gn = (C00GN) obj;
        return Intrinsics.LJFF(this.LL, c00gn.LL) && this.LLILLJJLI == c00gn.LLILLJJLI;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SkeletonItem(type=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", colorAttrRes=");
        sbLIZ.append(this.LLILLJJLI);
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

    public C00GN(int i, int i2) {
        Unit unit;
        if ((i2 & 1) != 0) {
            unit = Unit.LIZ;
        } else {
            unit = null;
        }
        i = (i2 & 2) != 0 ? R.attr.zj : i;
        this.LL = unit;
        this.LLILLJJLI = i;
    }
}
