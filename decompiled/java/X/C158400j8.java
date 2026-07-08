package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.00j8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C158400j8 extends AbstractC1493005su {
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C158400j8) && this.LIZLLL == ((C158400j8) obj).LIZLLL;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("QuickSharePanelLoadContactEventBody(success=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C158400j8(boolean z) {
        super(null, C2097908Jt.LIZJ(new Pair("success", Boolean.valueOf(z))), null, 5);
        this.LIZLLL = z;
    }
}
