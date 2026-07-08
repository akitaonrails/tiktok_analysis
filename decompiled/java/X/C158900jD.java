package X;

import kotlin.Pair;

/* JADX INFO: renamed from: X.00jD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C158900jD extends AbstractC1493005su {
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C158900jD) && this.LIZLLL == ((C158900jD) obj).LIZLLL;
    }

    public final int hashCode() {
        return C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CommonShareFirstDrawEventBody(drawTimeMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C158900jD(long j) {
        super(null, C2097908Jt.LIZJ(new Pair("draw_time", Long.valueOf(j))), null, 5);
        this.LIZLLL = j;
    }
}
