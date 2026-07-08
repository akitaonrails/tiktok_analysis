package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sas, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724160Sas extends C723430SZh {
    public final Object LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C724160Sas) && Intrinsics.LJFF(this.LIZJ, ((C724160Sas) obj).LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssemOnHostAttachedPerformanceParams(host=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C724160Sas(ReusedAssem reusedAssem) {
        this.LIZJ = reusedAssem;
    }
}
