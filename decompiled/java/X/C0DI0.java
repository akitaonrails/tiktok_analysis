package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DI0, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DI0 implements InterfaceC0148002o {
    public final C291001Au<Unit> LL;
    public final C291001Au<Boolean> LLILLJJLI;
    public final C291001Au<Integer> LLILLL;

    public C0DI0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DI0)) {
            return false;
        }
        C0DI0 c0di0 = (C0DI0) obj;
        return Intrinsics.LJFF(this.LL, c0di0.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0di0.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0di0.LLILLL);
    }

    public final int hashCode() {
        return (((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommerceAgentFragmentState(backPressedEvent=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", updateWaitingForFirstSugEvent=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", navigationBarColorEvent=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0DI0(int i) {
        this(new C291001Au(null), new C291001Au(null), new C291001Au(null));
    }

    public C0DI0(C291001Au<Unit> c291001Au, C291001Au<Boolean> c291001Au2, C291001Au<Integer> c291001Au3) {
        this.LL = c291001Au;
        this.LLILLJJLI = c291001Au2;
        this.LLILLL = c291001Au3;
    }
}
