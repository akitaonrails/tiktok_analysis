package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zPn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1895090zPn implements InterfaceC0148002o {
    public final boolean LL;
    public final C1895120zPq LLILLJJLI;

    public C1895090zPn() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1895090zPn)) {
            return false;
        }
        C1895090zPn c1895090zPn = (C1895090zPn) obj;
        return this.LL == c1895090zPn.LL && Intrinsics.LJFF(this.LLILLJJLI, c1895090zPn.LLILLJJLI);
    }

    public final int hashCode() {
        int iZ2 = C786410Ut5.Z2(this.LL) * 31;
        C1895120zPq c1895120zPq = this.LLILLJJLI;
        return iZ2 + (c1895120zPq == null ? 0 : c1895120zPq.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PopupDataState(dismissed=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loginModel=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1895090zPn(int i) {
        C1895120zPq c1895120zPq = new C1895120zPq(System.currentTimeMillis(), EnumC1895270zQ5.TYPE_INIT);
        this.LL = false;
        this.LLILLJJLI = c1895120zPq;
    }
}
