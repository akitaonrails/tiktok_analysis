package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PQI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PQI implements InterfaceC594520NTm, InterfaceC655050Pmh {
    public final C0PQX LL;
    public final int LLILLJJLI = C321460Ciu.LIZ();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0PQI) && Intrinsics.LJFF(this.LL, ((C0PQI) obj).LL);
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
        sbLIZ.append("EcSearchCSCardRenderData(clickSearchData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC594520NTm
    public final int retrieveIncrementalId() {
        return this.LLILLJJLI;
    }

    public C0PQI(C0PQX c0pqx) {
        this.LL = c0pqx;
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
