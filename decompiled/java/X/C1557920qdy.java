package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qdy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1557920qdy implements InterfaceC1609270ryn {
    public final int LIZ;
    public final Function1<C1608740rxw, C1609310ryr> LIZIZ;
    public final boolean LIZJ;

    public C1557920qdy() {
        this(0, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1557920qdy)) {
            return false;
        }
        C1557920qdy c1557920qdy = (C1557920qdy) obj;
        return this.LIZ == c1557920qdy.LIZ && Intrinsics.LJFF(this.LIZIZ, c1557920qdy.LIZIZ) && this.LIZJ == c1557920qdy.LIZJ;
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        Function1<C1608740rxw, C1609310ryr> function1 = this.LIZIZ;
        return ((i + (function1 == null ? 0 : function1.hashCode())) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomizePosition(gravity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", margin=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", referToAvatar=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1609270ryn
    public final Function1<C1608740rxw, C1609310ryr> LJIJJ() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1609270ryn
    public final boolean LJIJJLI() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1609270ryn
    public final int LJIL() {
        return this.LIZ;
    }

    public C1557920qdy(int i, Function1 function1, int i2) {
        boolean z;
        i = (i2 & 1) != 0 ? 8388693 : i;
        function1 = (i2 & 2) != 0 ? null : function1;
        if ((i2 & 4) != 0) {
            z = true;
        } else {
            z = false;
        }
        this.LIZ = i;
        this.LIZIZ = function1;
        this.LIZJ = z;
    }
}
