package X;

import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lWD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360910lWD {
    public static final C1360910lWD LIZJ = new C1360910lWD(C08CX.INSTANCE, new InterfaceC1360930lWF() { // from class: X.0lWE
        @Override // X.InterfaceC1360930lWF
        public final void LIZ(EnumC1355300lNA enumC1355300lNA, Set set) {
        }
    });
    public final Set<EnumC1355300lNA> LIZ;
    public final InterfaceC1360930lWF LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1360910lWD)) {
            return false;
        }
        C1360910lWD c1360910lWD = (C1360910lWD) obj;
        return Intrinsics.LJFF(this.LIZ, c1360910lWD.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1360910lWD.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PreemptionPolicy(preemptableBy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", onPreempted=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1360910lWD(Set<? extends EnumC1355300lNA> set, InterfaceC1360930lWF interfaceC1360930lWF) {
        this.LIZ = set;
        this.LIZIZ = interfaceC1360930lWF;
    }
}
