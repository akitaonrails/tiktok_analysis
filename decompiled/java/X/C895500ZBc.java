package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZBc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895500ZBc implements InterfaceC1891350zJl, InterfaceC1890700zIi {
    public final String LL;
    public final Function0<Unit> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C895500ZBc)) {
            return false;
        }
        C895500ZBc c895500ZBc = (C895500ZBc) obj;
        return Intrinsics.LJFF(this.LL, c895500ZBc.LL) && Intrinsics.LJFF(this.LLILLJJLI, c895500ZBc.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return "notice_collapse";
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationCollapseItem(collapseText=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", onExpand=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final C0ZB9 biz() {
        return C0ZBC.LIZIZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        C895500ZBc c895500ZBc;
        String str = this.LL;
        String str2 = null;
        if ((interfaceC1891350zJl instanceof C895500ZBc) && (c895500ZBc = (C895500ZBc) interfaceC1891350zJl) != null) {
            str2 = c895500ZBc.LL;
        }
        return Intrinsics.LJFF(str, str2);
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C1600110rk1.LIZJ();
    }

    public C895500ZBc(String str, Function0<Unit> function0) {
        this.LL = str;
        this.LLILLJJLI = function0;
    }
}
