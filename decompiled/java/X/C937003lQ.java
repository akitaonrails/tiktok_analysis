package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03lQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C937003lQ {
    public final EnumC1012103xX LIZ;
    public final String LIZIZ;
    public final EnumC0304008o LIZJ;

    public C937003lQ() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C937003lQ)) {
            return false;
        }
        C937003lQ c937003lQ = (C937003lQ) obj;
        return this.LIZ == c937003lQ.LIZ && Intrinsics.LJFF(this.LIZIZ, c937003lQ.LIZIZ) && this.LIZJ == c937003lQ.LIZJ;
    }

    public final int hashCode() {
        EnumC1012103xX enumC1012103xX = this.LIZ;
        int iHashCode = (enumC1012103xX == null ? 0 : enumC1012103xX.hashCode()) * 31;
        String str = this.LIZIZ;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StockInfo(skuStockState=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", noStockMsg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", notifyMeStatus=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C937003lQ(EnumC1012103xX enumC1012103xX, String str, int i) {
        enumC1012103xX = (i & 1) != 0 ? null : enumC1012103xX;
        str = (i & 2) != 0 ? null : str;
        EnumC0304008o enumC0304008o = (i & 4) != 0 ? EnumC0304008o.UNKNOWN : null;
        this.LIZ = enumC1012103xX;
        this.LIZIZ = str;
        this.LIZJ = enumC0304008o;
    }
}
