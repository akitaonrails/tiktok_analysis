package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00us, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C231200us implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C231200us) && Intrinsics.LJFF(this.LL, ((C231200us) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NavBarSettingState(showRedDot=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C231200us(C291001Au<Boolean> c291001Au) {
        this.LL = c291001Au;
    }
}
