package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0g4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1151330g4B implements InterfaceC0148002o {
    public final boolean LL;
    public final C1151400g4I LLILLJJLI;
    public final boolean LLILLL;

    public C1151330g4B() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1151330g4B)) {
            return false;
        }
        C1151330g4B c1151330g4B = (C1151330g4B) obj;
        return this.LL == c1151330g4B.LL && Intrinsics.LJFF(this.LLILLJJLI, c1151330g4B.LLILLJJLI) && this.LLILLL == c1151330g4B.LLILLL;
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C1151400g4I c1151400g4I = this.LLILLJJLI;
        return ((iZ2 + (c1151400g4I == null ? 0 : c1151400g4I.hashCode())) * 31) + C786410Ut5.Z2(this.LLILLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RechargeBtnState(isPayProcessing=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", rechargedItem=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", rechargeSuccessBeforeRetry=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1151330g4B(int i) {
        this(false, null, false);
    }

    public C1151330g4B(boolean z, C1151400g4I c1151400g4I, boolean z2) {
        this.LL = z;
        this.LLILLJJLI = c1151400g4I;
        this.LLILLL = z2;
    }

    public static C1151330g4B LIZ(C1151330g4B c1151330g4B, boolean z, C1151400g4I c1151400g4I, int i) {
        boolean z2;
        if ((i & 1) != 0) {
            z = c1151330g4B.LL;
        }
        if ((i & 2) != 0) {
            c1151400g4I = c1151330g4B.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            z2 = c1151330g4B.LLILLL;
        } else {
            z2 = false;
        }
        c1151330g4B.getClass();
        return new C1151330g4B(z, c1151400g4I, z2);
    }
}
