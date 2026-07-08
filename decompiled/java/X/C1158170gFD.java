package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gFD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158170gFD {
    public final List<InterfaceC1785530wZ5> LIZ;
    public final boolean LIZIZ;

    public C1158170gFD() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1158170gFD)) {
            return false;
        }
        C1158170gFD c1158170gFD = (C1158170gFD) obj;
        return Intrinsics.LJFF(this.LIZ, c1158170gFD.LIZ) && this.LIZIZ == c1158170gFD.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AutoScrollEffectResult(effects=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", consumedTargetCreatorId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1158170gFD(int i) {
        this(C13BV.INSTANCE, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1158170gFD(List<? extends InterfaceC1785530wZ5> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
