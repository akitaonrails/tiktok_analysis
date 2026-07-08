package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.043o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10366043o {
    public final EnumC10360043i LIZ;
    public final String LIZIZ;

    public C10366043o() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10366043o)) {
            return false;
        }
        C10366043o c10366043o = (C10366043o) obj;
        return this.LIZ == c10366043o.LIZ && Intrinsics.LJFF(this.LIZIZ, c10366043o.LIZIZ);
    }

    public final int hashCode() {
        EnumC10360043i enumC10360043i = this.LIZ;
        int iHashCode = (enumC10360043i == null ? 0 : enumC10360043i.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StockInfo(skuStockState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", noStockMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C10366043o(EnumC10360043i enumC10360043i, String str) {
        this.LIZ = enumC10360043i;
        this.LIZIZ = str;
    }
}
