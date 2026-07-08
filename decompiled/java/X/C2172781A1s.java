package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A1s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172781A1s implements InterfaceC0148002o {
    public final boolean LL;
    public final InterfaceC2172841A1y LLILLJJLI;

    public C2172781A1s() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2172781A1s)) {
            return false;
        }
        C2172781A1s c2172781A1s = (C2172781A1s) obj;
        return this.LL == c2172781A1s.LL && Intrinsics.LJFF(this.LLILLJJLI, c2172781A1s.LLILLJJLI);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TextActionState(enable=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2172781A1s(int i) {
        this(true, new C2172771A1r(C1696106kZ.LIZ, 0, 0, null, null, false, null, 2040));
    }

    public C2172781A1s(boolean z, InterfaceC2172841A1y interfaceC2172841A1y) {
        this.LL = z;
        this.LLILLJJLI = interfaceC2172841A1y;
    }

    public static C2172781A1s LIZ(C2172781A1s c2172781A1s, boolean z, InterfaceC2172841A1y interfaceC2172841A1y, int i) {
        if ((i & 1) != 0) {
            z = c2172781A1s.LL;
        }
        if ((i & 2) != 0) {
            interfaceC2172841A1y = c2172781A1s.LLILLJJLI;
        }
        c2172781A1s.getClass();
        return new C2172781A1s(z, interfaceC2172841A1y);
    }
}
