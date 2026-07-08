package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZKp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897970ZKp implements InterfaceC1891350zJl, InterfaceC1890700zIi {
    public final int LL;
    public final int LLILLJJLI;
    public final Integer LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C897970ZKp)) {
            return false;
        }
        C897970ZKp c897970ZKp = (C897970ZKp) obj;
        return this.LL == c897970ZKp.LL && this.LLILLJJLI == c897970ZKp.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c897970ZKp.LLILLL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int i = ((this.LL * 31) + this.LLILLJJLI) * 31;
        Integer num = this.LLILLL;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NotificationEmptyStatusItem(titleId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", descId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", placeHolderId=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1890700zIi
    public final String itemUniqueId() {
        return String.valueOf(this.LL);
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
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1890700zIi
    public final C1600120rk2 isItemChanged(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (!(interfaceC1891350zJl instanceof C897970ZKp)) {
            return C1600110rk1.LIZ("unknown");
        }
        C897970ZKp c897970ZKp = (C897970ZKp) interfaceC1891350zJl;
        if (c897970ZKp.LLILLJJLI != this.LLILLJJLI) {
            return C1600110rk1.LIZ("unknown");
        }
        if (!Intrinsics.LJFF(c897970ZKp.LLILLL, this.LLILLL)) {
            return C1600110rk1.LIZ("unknown");
        }
        return C1600110rk1.LIZJ();
    }

    public C897970ZKp(int i, int i2, Integer num) {
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = num;
    }
}
