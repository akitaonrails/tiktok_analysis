package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r0N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571810r0N implements InterfaceC0148002o {
    public final EnumC20538815Yk LL;
    public final C291001Au<Boolean> LLILLJJLI;

    public C1571810r0N() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1571810r0N)) {
            return false;
        }
        C1571810r0N c1571810r0N = (C1571810r0N) obj;
        return this.LL == c1571810r0N.LL && Intrinsics.LJFF(this.LLILLJJLI, c1571810r0N.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        C291001Au<Boolean> c291001Au = this.LLILLJJLI;
        return iHashCode + (c291001Au == null ? 0 : c291001Au.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SleepHourComponentViewState(page=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showChange=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1571810r0N(int i) {
        this(EnumC20538815Yk.DISMISS, null);
    }

    public C1571810r0N(EnumC20538815Yk enumC20538815Yk, C291001Au<Boolean> c291001Au) {
        this.LL = enumC20538815Yk;
        this.LLILLJJLI = c291001Au;
    }

    public static C1571810r0N LIZ(C1571810r0N c1571810r0N, EnumC20538815Yk enumC20538815Yk, C291001Au c291001Au, int i) {
        if ((i & 1) != 0) {
            enumC20538815Yk = c1571810r0N.LL;
        }
        if ((i & 2) != 0) {
            c291001Au = c1571810r0N.LLILLJJLI;
        }
        c1571810r0N.getClass();
        return new C1571810r0N(enumC20538815Yk, c291001Au);
    }
}
