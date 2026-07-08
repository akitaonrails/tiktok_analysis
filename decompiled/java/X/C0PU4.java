package X;

import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PU4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PU4 implements InterfaceC594520NTm, InterfaceC655050Pmh {
    public final C0PQX LL;
    public final C653660PkS LLILLJJLI;
    public final boolean LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL = C321460Ciu.LIZ();
    public final C01GW LLILZLL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1321));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PU4)) {
            return false;
        }
        C0PU4 c0pu4 = (C0PU4) obj;
        return Intrinsics.LJFF(this.LL, c0pu4.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0pu4.LLILLJJLI) && this.LLILLL == c0pu4.LLILLL && this.LLILZ == c0pu4.LLILZ;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C653660PkS c653660PkS = this.LLILLJJLI;
        return ((((iHashCode + (c653660PkS == null ? 0 : c653660PkS.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL)) * 31) + C786410Ut5.Z2(this.LLILZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCSCardRenderData(clickSearchData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", itemMobParam=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", needShowCardCaret=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", isAwemeNextLine=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC594520NTm
    public final int retrieveIncrementalId() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    public C0PU4(C0PQX c0pqx, C653660PkS c653660PkS, boolean z, boolean z2) {
        this.LL = c0pqx;
        this.LLILLJJLI = c653660PkS;
        this.LLILLL = z;
        this.LLILZ = z2;
    }
}
