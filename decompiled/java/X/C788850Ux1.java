package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ux1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C788850Ux1 extends AbstractC788840Ux0 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C788850Ux1)) {
            return false;
        }
        C788850Ux1 c788850Ux1 = (C788850Ux1) obj;
        return Intrinsics.LJFF(this.LIZ, c788850Ux1.LIZ) && this.LIZIZ == c788850Ux1.LIZIZ && this.LIZJ == c788850Ux1.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Init(viewName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", pageLinkId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", instanceHashCode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC788840Ux0
    public final Integer LIZ() {
        return Integer.valueOf(this.LIZJ);
    }

    public C788850Ux1(String str, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
    }
}
