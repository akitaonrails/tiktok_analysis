package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A1n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172731A1n implements InterfaceC0148002o {
    public final boolean LL;
    public final InterfaceC2172841A1y LLILLJJLI;

    public C2172731A1n() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2172731A1n)) {
            return false;
        }
        C2172731A1n c2172731A1n = (C2172731A1n) obj;
        return this.LL == c2172731A1n.LL && Intrinsics.LJFF(this.LLILLJJLI, c2172731A1n.LLILLJJLI);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LL) * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IconActionState(enable=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", uiConfig=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2172731A1n(int i) {
        this(true, new C894370Z6t(C1696106kZ.LIZ, 0, 0));
    }

    public C2172731A1n(boolean z, InterfaceC2172841A1y interfaceC2172841A1y) {
        this.LL = z;
        this.LLILLJJLI = interfaceC2172841A1y;
    }
}
