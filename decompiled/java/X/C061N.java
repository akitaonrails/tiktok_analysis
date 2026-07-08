package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.061N, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C061N implements InterfaceC111300bX {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C061N) && Intrinsics.LJFF(this.LL, ((C061N) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InternalShareEditTextConfig(vmKey=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C061N(String str) {
        this.LL = str;
    }
}
