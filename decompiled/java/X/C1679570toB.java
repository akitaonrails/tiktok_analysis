package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0toB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1679570toB implements InterfaceC0148002o {
    public final String LL;
    public final EnumC1679580toC LLILLJJLI;

    public C1679570toB() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1679570toB)) {
            return false;
        }
        C1679570toB c1679570toB = (C1679570toB) obj;
        return Intrinsics.LJFF(this.LL, c1679570toB.LL) && this.LLILLJJLI == c1679570toB.LLILLJJLI;
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("State(hint=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", inputMode=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1679570toB(String str, int i) {
        EnumC1679580toC enumC1679580toC;
        str = (i & 1) != 0 ? "" : str;
        if ((i & 2) != 0) {
            enumC1679580toC = EnumC1679580toC.LOADING;
        } else {
            enumC1679580toC = null;
        }
        this(str, enumC1679580toC);
    }

    public static C1679570toB LIZ(C1679570toB c1679570toB, EnumC1679580toC enumC1679580toC) {
        String str = c1679570toB.LL;
        c1679570toB.getClass();
        return new C1679570toB(str, enumC1679580toC);
    }

    public C1679570toB(String str, EnumC1679580toC enumC1679580toC) {
        this.LL = str;
        this.LLILLJJLI = enumC1679580toC;
    }
}
