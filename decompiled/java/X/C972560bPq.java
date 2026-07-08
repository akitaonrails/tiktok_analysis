package X;

import java.util.UUID;

/* JADX INFO: renamed from: X.0bPq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C972560bPq {
    public final EnumC2231831CWv LIZ;
    public final long LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimerKey(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", timerId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C972560bPq(EnumC2231831CWv enumC2231831CWv, long j) {
        String string = UUID.randomUUID().toString();
        this.LIZ = enumC2231831CWv;
        this.LIZIZ = j;
        this.LIZJ = string;
    }
}
