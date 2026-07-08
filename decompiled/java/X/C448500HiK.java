package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HiK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C448500HiK implements InterfaceC0148002o {
    public final C291001Au<C448490HiJ> LL;

    public C448500HiK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C448500HiK) && Intrinsics.LJFF(this.LL, ((C448500HiK) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIGroupShotRecallState(removeLoadingHUDState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C448500HiK(int i) {
        this((C291001Au<C448490HiJ>) new C291001Au(new C448490HiJ(false, (EnumC448480HiI) null, 7)));
    }

    public C448500HiK(C291001Au<C448490HiJ> c291001Au) {
        this.LL = c291001Au;
    }
}
