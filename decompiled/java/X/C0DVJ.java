package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.0DVJ, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DVJ extends C0DVK<Unit> {
    public final boolean LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0DVJ)) {
            return false;
        }
        C0DVJ c0dvj = (C0DVJ) obj;
        return this.LIZIZ == c0dvj.LIZIZ && this.LIZJ == c0dvj.LIZJ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZIZ) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DelayLoading(enableDelay=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", delayMillis=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0DVJ(long j) {
        super(Unit.LIZ);
        this.LIZIZ = true;
        this.LIZJ = j;
    }
}
