package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HR5, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HR5 implements InterfaceC0148002o {
    public final InterfaceC440230HOb<?> LL;
    public final InterfaceC440090HNn LLILLJJLI;
    public final int LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HR5)) {
            return false;
        }
        C0HR5 c0hr5 = (C0HR5) obj;
        return Intrinsics.LJFF(this.LL, c0hr5.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0hr5.LLILLJJLI) && this.LLILLL == c0hr5.LLILLL;
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MixStudioGeneratingPageState(generatingId=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", generatingElement=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", timeRemaining=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HR5(InterfaceC440230HOb<?> interfaceC440230HOb, InterfaceC440090HNn interfaceC440090HNn, int i) {
        this.LL = interfaceC440230HOb;
        this.LLILLJJLI = interfaceC440090HNn;
        this.LLILLL = i;
    }

    public static C0HR5 LIZ(C0HR5 c0hr5, InterfaceC440230HOb interfaceC440230HOb, InterfaceC440090HNn interfaceC440090HNn, int i, int i2) {
        if ((i2 & 1) != 0) {
            interfaceC440230HOb = c0hr5.LL;
        }
        if ((i2 & 2) != 0) {
            interfaceC440090HNn = c0hr5.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i = c0hr5.LLILLL;
        }
        c0hr5.getClass();
        return new C0HR5(interfaceC440230HOb, interfaceC440090HNn, i);
    }
}
