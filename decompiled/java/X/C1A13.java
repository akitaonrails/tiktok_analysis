package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A13, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A13 implements InterfaceC0148002o {
    public final C1A14 LL;
    public final C1A12 LLILLJJLI;
    public final boolean LLILLL;

    public C1A13() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A13)) {
            return false;
        }
        C1A13 c1a13 = (C1A13) obj;
        return this.LL == c1a13.LL && Intrinsics.LJFF(this.LLILLJJLI, c1a13.LLILLJJLI) && this.LLILLL == c1a13.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LegalState(foldState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", textModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", showRechargeDisclaimer=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1A13(int i) {
        this(C1A14.INIT, new C1A12(0), true);
    }

    public C1A13(C1A14 c1a14, C1A12 c1a12, boolean z) {
        this.LL = c1a14;
        this.LLILLJJLI = c1a12;
        this.LLILLL = z;
    }
}
