package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A3K, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1A3K implements InterfaceC0148002o {
    public final C1A3J LL;
    public final float LLILLJJLI;
    public final int LLILLL;

    public C1A3K() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1A3K)) {
            return false;
        }
        C1A3K c1a3k = (C1A3K) obj;
        return Intrinsics.LJFF(this.LL, c1a3k.LL) && Float.compare(this.LLILLJJLI, c1a3k.LLILLJJLI) == 0 && this.LLILLL == c1a3k.LLILLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("State(preview=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", bottomReservedDp=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dismissSignal=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        C1A3J c1a3j = this.LL;
        return ((((c1a3j == null ? 0 : c1a3j.hashCode()) * 31) + Float.floatToIntBits(this.LLILLJJLI)) * 31) + this.LLILLL;
    }

    public /* synthetic */ C1A3K(int i) {
        this(null, 0.0f, 0);
    }

    public C1A3K(C1A3J c1a3j, float f, int i) {
        this.LL = c1a3j;
        this.LLILLJJLI = f;
        this.LLILLL = i;
    }

    public static C1A3K LIZ(C1A3K c1a3k, float f, int i, int i2) {
        C1A3J c1a3j;
        if ((i2 & 1) != 0) {
            c1a3j = c1a3k.LL;
        } else {
            c1a3j = null;
        }
        if ((i2 & 2) != 0) {
            f = c1a3k.LLILLJJLI;
        }
        if ((i2 & 4) != 0) {
            i = c1a3k.LLILLL;
        }
        c1a3k.getClass();
        return new C1A3K(c1a3j, f, i);
    }
}
