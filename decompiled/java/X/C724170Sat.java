package X;

import com.bytedance.assem.arch.reused.ReusedAssem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sat, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724170Sat extends C723430SZh {
    public final Object LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C724170Sat) && Intrinsics.LJFF(this.LIZJ, ((C724170Sat) obj).LIZJ);
    }

    public final int hashCode() {
        return this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssemOnHostIterateBindPerformanceParams(host=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C724170Sat(ReusedAssem reusedAssem) {
        this.LIZJ = reusedAssem;
    }
}
