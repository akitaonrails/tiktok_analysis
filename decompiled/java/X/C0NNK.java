package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NNK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NNK implements InterfaceC0148002o {
    public final C0NNI LL;

    public C0NNK() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0NNK) && Intrinsics.LJFF(this.LL, ((C0NNK) obj).LL);
    }

    public final int hashCode() {
        C0NNI c0nni = this.LL;
        if (c0nni == null) {
            return 0;
        }
        return c0nni.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AddYoursEntranceState(entranceStrategy=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NNK(C0NNI c0nni) {
        this.LL = c0nni;
    }
}
