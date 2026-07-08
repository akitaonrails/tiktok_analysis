package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sy1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C738510Sy1 extends C723430SZh {
    public final Object LIZJ;
    public final EnumC738160SxS LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C738510Sy1)) {
            return false;
        }
        C738510Sy1 c738510Sy1 = (C738510Sy1) obj;
        return Intrinsics.LJFF(this.LIZJ, c738510Sy1.LIZJ) && this.LIZLLL == c738510Sy1.LIZLLL;
    }

    public final int hashCode() {
        return (this.LIZJ.hashCode() * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssemLifecyclePerformanceParams(host=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", lifecycleStage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C738510Sy1(Object obj, EnumC738160SxS enumC738160SxS) {
        this.LIZJ = obj;
        this.LIZLLL = enumC738160SxS;
    }
}
