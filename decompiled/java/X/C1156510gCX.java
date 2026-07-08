package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gCX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1156510gCX implements InterfaceC0148002o {
    public final AbstractC521460Kci LL;

    public C1156510gCX() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1156510gCX) && Intrinsics.LJFF(this.LL, ((C1156510gCX) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceBioVMStateV2(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean LIZ() {
        AbstractC521460Kci abstractC521460Kci = this.LL;
        return (abstractC521460Kci instanceof C1156490gCV) && ((Boolean) ((C1156490gCV) abstractC521460Kci).LIZJ.getValue()).booleanValue();
    }

    public /* synthetic */ C1156510gCX(int i) {
        this(new AbstractC521460Kci() { // from class: X.0Kck
        });
    }

    public C1156510gCX(AbstractC521460Kci abstractC521460Kci) {
        this.LL = abstractC521460Kci;
    }
}
