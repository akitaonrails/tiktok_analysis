package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A1m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172721A1m implements InterfaceC0148002o {
    public final boolean LL;
    public final boolean LLILLJJLI;
    public final InterfaceC2172841A1y LLILLL;

    public C2172721A1m() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2172721A1m)) {
            return false;
        }
        C2172721A1m c2172721A1m = (C2172721A1m) obj;
        return this.LL == c2172721A1m.LL && this.LLILLJJLI == c2172721A1m.LLILLJJLI && Intrinsics.LJFF(this.LLILLL, c2172721A1m.LLILLL);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LL) * 31) + C786410Ut5.Z2(this.LLILLJJLI)) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SwitchActionState(enable=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", isChecked=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2172721A1m(int i) {
        this(true, false, new C2172711A1l(C1696106kZ.LIZ, 0, 0));
    }

    public C2172721A1m(boolean z, boolean z2, InterfaceC2172841A1y interfaceC2172841A1y) {
        this.LL = z;
        this.LLILLJJLI = z2;
        this.LLILLL = interfaceC2172841A1y;
    }

    public static C2172721A1m LIZ(C2172721A1m c2172721A1m, boolean z, boolean z2, InterfaceC2172841A1y interfaceC2172841A1y, int i) {
        if ((i & 1) != 0) {
            z = c2172721A1m.LL;
        }
        if ((i & 2) != 0) {
            z2 = c2172721A1m.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            interfaceC2172841A1y = c2172721A1m.LLILLL;
        }
        c2172721A1m.getClass();
        return new C2172721A1m(z, z2, interfaceC2172841A1y);
    }
}
