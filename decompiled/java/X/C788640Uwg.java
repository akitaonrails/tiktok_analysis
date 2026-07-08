package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uwg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788640Uwg extends AbstractC788650Uwh {
    public final List<InterfaceC1880507Yd> LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public C788640Uwg() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788640Uwg)) {
            return false;
        }
        C788640Uwg c788640Uwg = (C788640Uwg) obj;
        return Intrinsics.LJFF(this.LIZ, c788640Uwg.LIZ) && this.LIZIZ == c788640Uwg.LIZIZ && this.LIZJ == c788640Uwg.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectList(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", defaultPosition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", fromCache=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C788640Uwg(List list) {
        this.LIZ = list;
        this.LIZIZ = 0;
        this.LIZJ = false;
    }
}
