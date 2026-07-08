package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ZRO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZRO implements InterfaceC0148002o {
    public final C291001Au<String> LL;
    public final C291001Au<String> LLILLJJLI;

    public C0ZRO() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ZRO)) {
            return false;
        }
        C0ZRO c0zro = (C0ZRO) obj;
        return Intrinsics.LJFF(this.LL, c0zro.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0zro.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IMMessageListTranslationState(startTranslateMessageUuid=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hideTranslateMessageUuid=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0ZRO(int i) {
        this(new C291001Au(null), new C291001Au(null));
    }

    public C0ZRO(C291001Au<String> c291001Au, C291001Au<String> c291001Au2) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
    }

    public static C0ZRO LIZ(C0ZRO c0zro, C291001Au c291001Au, C291001Au c291001Au2, int i) {
        if ((i & 1) != 0) {
            c291001Au = c0zro.LL;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c0zro.LLILLJJLI;
        }
        c0zro.getClass();
        return new C0ZRO(c291001Au, c291001Au2);
    }
}
