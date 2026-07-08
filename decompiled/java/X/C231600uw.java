package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00uw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C231600uw implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;

    public C231600uw() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C231600uw) && Intrinsics.LJFF(this.LL, ((C231600uw) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakoWaitingState(changeCheckState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C231600uw(int i) {
        this((C291001Au<Boolean>) new C291001Au(Boolean.FALSE));
    }

    public C231600uw(C291001Au<Boolean> c291001Au) {
        this.LL = c291001Au;
    }
}
