package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0dIM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1044800dIM {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1044800dIM)) {
            return false;
        }
        C1044800dIM c1044800dIM = (C1044800dIM) obj;
        return Intrinsics.LJFF(this.LIZ, c1044800dIM.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1044800dIM.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShoppingTaskThirdEventRequest(label=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", awemeStruct=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1044800dIM(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
