package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.04wZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1260904wZ extends AbstractC1262404wo {
    public final List<String> LIZIZ;
    public final boolean LIZJ = true;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1260904wZ) && Intrinsics.LJFF(this.LIZIZ, ((C1260904wZ) obj).LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InValues(values=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1262404wo
    public final boolean LIZ() {
        return this.LIZJ;
    }

    public C1260904wZ(List<String> list) {
        this.LIZIZ = list;
    }
}
