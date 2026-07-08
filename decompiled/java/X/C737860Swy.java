package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Swy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737860Swy extends C723430SZh {
    public final Class<?> LIZJ;
    public final EnumC737850Swx LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C737860Swy)) {
            return false;
        }
        C737860Swy c737860Swy = (C737860Swy) obj;
        return Intrinsics.LJFF(this.LIZJ, c737860Swy.LIZJ) && this.LIZLLL == c737860Swy.LIZLLL;
    }

    public final int hashCode() {
        Class<?> cls = this.LIZJ;
        return ((cls == null ? 0 : cls.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AssemViewModelCreatePerformanceParams(host=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", type=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C737860Swy(Class<?> cls, EnumC737850Swx enumC737850Swx) {
        this.LIZJ = cls;
        this.LIZLLL = enumC737850Swx;
    }
}
