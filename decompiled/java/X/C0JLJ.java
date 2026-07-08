package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JLJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JLJ implements InterfaceC0148002o {
    public final C0JLF LL;

    public C0JLJ() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0JLJ) && Intrinsics.LJFF(this.LL, ((C0JLJ) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsServiceBioModeratorVMState(pageState=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0JLJ(int i) {
        this(new C0JLF() { // from class: X.0JLL
        });
    }

    public C0JLJ(C0JLF c0jlf) {
        this.LL = c0jlf;
    }
}
