package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.00jB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C158700jB extends AbstractC1493005su {
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C158700jB) && this.LIZLLL == ((C158700jB) obj).LIZLLL;
    }

    public final int hashCode() {
        return this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SharePanelLoadContactEventBody(numberOfContacts=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C158700jB(int i) {
        super(null, C2097908Jt.LIZJ(new Pair("number_of_contacts", Integer.valueOf(i))), null, 5);
        this.LIZLLL = i;
    }
}
