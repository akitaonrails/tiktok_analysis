package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00EV, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EV implements InterfaceC1891350zJl, InterfaceC1015900cXk {
    public final String LL;
    public final boolean LLILLJJLI;
    public final boolean LLILLL;
    public Float LLILZ;
    public Float LLILZIL;

    @Override // X.InterfaceC1015900cXk
    public final Float LIZ(int i) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00EV)) {
            return false;
        }
        C00EV c00ev = (C00EV) obj;
        return Intrinsics.LJFF(this.LL, c00ev.LL) && this.LLILLJJLI == c00ev.LLILLJJLI && this.LLILLL == c00ev.LLILLL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchNimbleTakoButtonItem(text=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", needShowIcon=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", isVisualStreamCard=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIIIIZZ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1015900cXk
    public final Float LJIILIIL() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LIZIZ(Float f) {
        this.LLILZIL = f;
    }

    @Override // X.InterfaceC1015900cXk
    public final void LJI(Float f) {
        this.LLILZ = f;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C00EV(String str, boolean z, boolean z2) {
        this.LL = str;
        this.LLILLJJLI = z;
        this.LLILLL = z2;
    }
}
