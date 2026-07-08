package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS285S0000000_2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Co, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1569606Co extends AbstractC1569806Cq {
    public final String LIZLLL;
    public final Function2<C1397510mTF, C1397650mTT, Unit> LJ;

    public C1569606Co() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1569606Co)) {
            return false;
        }
        C1569606Co c1569606Co = (C1569606Co) obj;
        return Intrinsics.LJFF(this.LIZLLL, c1569606Co.LIZLLL) && Intrinsics.LJFF(this.LJ, c1569606Co.LJ);
    }

    public final int hashCode() {
        String str = this.LIZLLL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Function2<C1397510mTF, C1397650mTT, Unit> function2 = this.LJ;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Expiration(conversationId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", onDialogButtonClick=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1569606Co(int i) {
        AFwS285S0000000_2 aFwS285S0000000_2 = AFwS285S0000000_2.get$arr$(42);
        C0I0B c0i0b = C0I0B.LJFF;
        c0i0b.LIZJ();
        String string = C894660Z7w.LIZ().getResources().getString(2131831745);
        c0i0b.LIZJ();
        String string2 = C894660Z7w.LIZ().getResources().getString(2131831743);
        c0i0b.LIZJ();
        super(string, string2, C894660Z7w.LIZ().getResources().getString(2131831744));
        this.LIZLLL = "";
        this.LJ = aFwS285S0000000_2;
    }
}
