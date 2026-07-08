package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01BP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01BP implements InterfaceC1891350zJl {
    public final String LL = null;
    public final Integer LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C01BP)) {
            return false;
        }
        C01BP c01bp = (C01BP) obj;
        return Intrinsics.LJFF(this.LL, c01bp.LL) && Intrinsics.LJFF(this.LLILLJJLI, c01bp.LLILLJJLI);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinSettingLabelItem(name=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", nameResId=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C01BP(Integer num) {
        this.LLILLJJLI = num;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
