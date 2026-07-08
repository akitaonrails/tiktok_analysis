package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Uwn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788710Uwn implements InterfaceC788740Uwq {
    public final List<C009D> LIZ;
    public final int LIZIZ = 35;
    public final int LIZJ = 35;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788710Uwn)) {
            return false;
        }
        C788710Uwn c788710Uwn = (C788710Uwn) obj;
        return Intrinsics.LJFF(this.LIZ, c788710Uwn.LIZ) && this.LIZIZ == c788710Uwn.LIZIZ && this.LIZJ == c788710Uwn.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AlgoPicLoadConfig(algoKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", picDisplayCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", picLoadPageCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC788740Uwq
    public final int LIZ() {
        return this instanceof C788720Uwo ? ((C788720Uwo) this).LIZ : this.LIZIZ;
    }

    public C788710Uwn(List list) {
        this.LIZ = list;
    }
}
