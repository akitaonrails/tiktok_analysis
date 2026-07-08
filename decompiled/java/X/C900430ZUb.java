package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZUb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C900430ZUb implements C0ZV4 {
    public final C900480ZUg LL;
    public final C462620ICe LLILLJJLI;
    public final C0IB0 LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C900430ZUb)) {
            return false;
        }
        C900430ZUb c900430ZUb = (C900430ZUb) obj;
        return Intrinsics.LJFF(this.LL, c900430ZUb.LL) && Intrinsics.LJFF(this.LLILLJJLI, c900430ZUb.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c900430ZUb.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UnifiedShareMultipleSendSkeletonLayoutPowerItem(content=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", backgroundConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", skeletonLayoutData=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C0ZV4
    public final C462620ICe LIZJ() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC461380I7k
    public final C0IB0 LLILII() {
        return this.LLILLL;
    }

    @Override // X.C0ZV4
    public final C900480ZUg getContent() {
        return this.LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C461450I7r.LIZ(this, interfaceC1891350zJl);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return C0ZV3.LIZ(this, interfaceC1891350zJl);
    }

    public C900430ZUb(C900480ZUg c900480ZUg, C462620ICe c462620ICe, C0IB0 c0ib0) {
        this.LL = c900480ZUg;
        this.LLILLJJLI = c462620ICe;
        this.LLILLL = c0ib0;
    }
}
