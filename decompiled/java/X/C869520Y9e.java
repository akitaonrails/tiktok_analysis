package X;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Y9e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C869520Y9e {
    public final long LIZ;
    public final byte[] LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final String LJFF;
    public final long LJI;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PendingMessageBody(messageId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", messageBody=");
        sbLIZ.append(Arrays.toString(this.LIZIZ));
        sbLIZ.append(", region=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", msgSource=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", inboxType=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", receivedFrom=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", receivedTimestamp=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + Arrays.hashCode(this.LIZIZ)) * 31) + this.LIZJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!Intrinsics.LJFF(C869520Y9e.class, cls)) {
            return false;
        }
        C869520Y9e c869520Y9e = (C869520Y9e) obj;
        if (this.LIZ == c869520Y9e.LIZ && this.LIZLLL == c869520Y9e.LIZLLL && this.LJ == c869520Y9e.LJ && this.LJI == c869520Y9e.LJI && Arrays.equals(this.LIZIZ, c869520Y9e.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c869520Y9e.LIZJ) && Intrinsics.LJFF(this.LJFF, c869520Y9e.LJFF)) {
            return true;
        }
        return false;
    }

    public C869520Y9e(long j, byte[] bArr, String str, int i, int i2, String str2, long j2) {
        this.LIZ = j;
        this.LIZIZ = bArr;
        this.LIZJ = str;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = str2;
        this.LJI = j2;
    }
}
