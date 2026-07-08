package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00Fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C048300Fl implements InterfaceC1891350zJl {
    public final String LL;

    public C048300Fl() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C048300Fl) && Intrinsics.LJFF(this.LL, ((C048300Fl) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesCenterDividerItem(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C048300Fl(int i) {
        this.LL = "";
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C048300Fl) && Intrinsics.LJFF(((C048300Fl) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C048300Fl) && Intrinsics.LJFF(((C048300Fl) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }
}
