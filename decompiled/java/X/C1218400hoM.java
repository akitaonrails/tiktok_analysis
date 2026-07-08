package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hoM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1218400hoM implements InterfaceC1891350zJl {
    public final int LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final Function0<Unit> LLILZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1218400hoM)) {
            return false;
        }
        C1218400hoM c1218400hoM = (C1218400hoM) obj;
        return this.LL == c1218400hoM.LL && this.LLILLJJLI == c1218400hoM.LLILLJJLI && this.LLILLL == c1218400hoM.LLILLL && Intrinsics.LJFF(this.LLILZ, c1218400hoM.LLILZ);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((((this.LL * 31) + this.LLILLJJLI) * 31) + this.LLILLL) * 31) + this.LLILZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RepostActionItem(iconRes=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", titleRes=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", colorRes=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", onClick=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1218400hoM() {
        this(0, 0, 0, AFwS207S0000000_19.get$arr$(332));
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C1218400hoM(int i, int i2, int i3, Function0<Unit> function0) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = i3;
        this.LLILZ = function0;
    }
}
