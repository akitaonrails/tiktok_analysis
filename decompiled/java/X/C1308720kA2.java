package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kA2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1308720kA2 {
    public final AbstractC1308700kA0<Object> LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Object LIZLLL;

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + (this.LIZIZ ? 1 : 0)) * 31) + (this.LIZJ ? 1 : 0)) * 31;
        Object obj = this.LIZLLL;
        return iHashCode + (obj != null ? obj.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(C1308720kA2.class.getSimpleName());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" Type: ");
        sbLIZ.append(this.LIZ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(" Nullable: ");
        sbLIZ2.append(this.LIZIZ);
        sb.append(C2188811AlT.LIZIZ(sbLIZ2));
        if (this.LIZJ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(" DefaultValue: ");
            sbLIZ3.append(this.LIZLLL);
            sb.append(C2188811AlT.LIZIZ(sbLIZ3));
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !Intrinsics.LJFF(C1308720kA2.class, obj.getClass())) {
            return false;
        }
        C1308720kA2 c1308720kA2 = (C1308720kA2) obj;
        if (this.LIZIZ != c1308720kA2.LIZIZ || this.LIZJ != c1308720kA2.LIZJ || !Intrinsics.LJFF(this.LIZ, c1308720kA2.LIZ)) {
            return false;
        }
        Object obj2 = this.LIZLLL;
        if (obj2 != null) {
            return Intrinsics.LJFF(obj2, c1308720kA2.LIZLLL);
        }
        if (c1308720kA2.LIZLLL == null) {
            return true;
        }
        return false;
    }

    public C1308720kA2(AbstractC1308700kA0<Object> abstractC1308700kA0, boolean z, Object obj, boolean z2) {
        if (!abstractC1308700kA0.LIZ) {
            if (z) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(abstractC1308700kA0.LIZIZ());
                sbLIZ.append(" does not allow nullable values");
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                strLIZIZ.toString();
                throw new IllegalArgumentException(strLIZIZ);
            }
        } else {
            if (!z) {
            }
            this.LIZ = abstractC1308700kA0;
            this.LIZIZ = z;
            this.LIZLLL = obj;
            this.LIZJ = z2;
        }
        if (z2 && obj == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Argument with type ");
            sbLIZ2.append(abstractC1308700kA0.LIZIZ());
            sbLIZ2.append(" has null value but is not nullable.");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            strLIZIZ2.toString();
            throw new IllegalArgumentException(strLIZIZ2);
        }
        this.LIZ = abstractC1308700kA0;
        this.LIZIZ = z;
        this.LIZLLL = obj;
        this.LIZJ = z2;
    }
}
