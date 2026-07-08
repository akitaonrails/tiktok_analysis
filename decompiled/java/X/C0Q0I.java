package X;

import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q0I, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0Q0I implements InterfaceC645880PVa, InterfaceC1891350zJl {
    public final C0Q0J LL;
    public final C650430PfF LLILLJJLI = new C650430PfF(new AwS589S0100000_10(this, 177));
    public final boolean LLILLL = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Q0I) && Intrinsics.LJFF(this.LL, ((C0Q0I) obj).LL);
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
        sbLIZ.append("TakoSugCardRenderDataImpl(sugItem=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC645880PVa
    public final C650430PfF LLIZLLLIL() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC645880PVa
    public final boolean LLJJJIL() {
        return this.LLILLL;
    }

    public C0Q0I(C0Q0J c0q0j) {
        this.LL = c0q0j;
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
