package X;

import com.ss.android.ugc.aweme.texttoimage.Text2ImageApiResp;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Mci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572420Mci {
    public final String LIZ;
    public final AnonymousClass0957<Text2ImageApiResp> LIZIZ;
    public final long LIZJ;
    public final AtomicLong LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C572420Mci)) {
            return false;
        }
        C572420Mci c572420Mci = (C572420Mci) obj;
        return Intrinsics.LJFF(this.LIZ, c572420Mci.LIZ) && Intrinsics.LJFF(this.LIZIZ, c572420Mci.LIZIZ) && this.LIZJ == c572420Mci.LIZJ && Intrinsics.LJFF(this.LIZLLL, c572420Mci.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entry(textKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", deferred=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", requestStartTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", requestEndTime=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C572420Mci(String str, C099G c099g, long j, AtomicLong atomicLong) {
        this.LIZ = str;
        this.LIZIZ = c099g;
        this.LIZJ = j;
        this.LIZLLL = atomicLong;
    }
}
