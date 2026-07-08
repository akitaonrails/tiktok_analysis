package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594640NTy implements InterfaceC0148002o {
    public final C291001Au<Boolean> LL;

    public C594640NTy() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C594640NTy) && Intrinsics.LJFF(this.LL, ((C594640NTy) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchVideoImmersiveState(isImmersive=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C594640NTy(int i) {
        this((C291001Au<Boolean>) new C291001Au(Boolean.FALSE));
    }

    public C594640NTy(C291001Au<Boolean> c291001Au) {
        this.LL = c291001Au;
    }
}
