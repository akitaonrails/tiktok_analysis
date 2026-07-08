package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yIa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852180yIa implements InterfaceC0148002o {
    public final AbstractC1852190yIb LL;
    public final boolean LLILLJJLI;

    public C1852180yIa() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1852180yIa)) {
            return false;
        }
        C1852180yIa c1852180yIa = (C1852180yIa) obj;
        return Intrinsics.LJFF(this.LL, c1852180yIa.LL) && this.LLILLJJLI == c1852180yIa.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoPhotoPickerPanelViewState(pickerState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isPhotoPickerPanelShowing=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1852180yIa(int i) {
        this(C1852200yIc.LIZ, false);
    }

    public C1852180yIa(AbstractC1852190yIb abstractC1852190yIb, boolean z) {
        this.LL = abstractC1852190yIb;
        this.LLILLJJLI = z;
    }
}
