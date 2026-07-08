package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wR7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1780590wR7 implements InterfaceC1780600wR8 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final List<C1780620wRA> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1780590wR7)) {
            return false;
        }
        C1780590wR7 c1780590wR7 = (C1780590wR7) obj;
        return Intrinsics.LJFF(this.LIZ, c1780590wR7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1780590wR7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1780590wR7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1780590wR7.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Subscription(productId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", offers=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1780600wR8
    public final String getProductId() {
        return this.LIZ;
    }

    public C1780590wR7(String str, String str2, String str3, List<C1780620wRA> list) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
        this.LIZLLL = list;
    }
}
