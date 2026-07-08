package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01p3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C449901p3 implements InterfaceC0148002o {
    public final C291001Au<AbstractC1145470fuj> LL;

    public C449901p3() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C449901p3) && Intrinsics.LJFF(this.LL, ((C449901p3) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AudienceBoardState(status=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C449901p3(int i) {
        this((C291001Au<? extends AbstractC1145470fuj>) new C291001Au(C1145390fub.LIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C449901p3(C291001Au<? extends AbstractC1145470fuj> c291001Au) {
        this.LL = c291001Au;
    }
}
