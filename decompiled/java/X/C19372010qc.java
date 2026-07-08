package X;

import com.ss.android.ugc.aweme.task.resaltas.WindowConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10qc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19372010qc {
    public final WindowConfig LIZ;
    public final String LIZIZ;
    public final long LIZJ;
    public int LIZLLL = 0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19372010qc)) {
            return false;
        }
        C19372010qc c19372010qc = (C19372010qc) obj;
        return Intrinsics.LJFF(this.LIZ, c19372010qc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c19372010qc.LIZIZ) && this.LIZJ == c19372010qc.LIZJ && this.LIZLLL == c19372010qc.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActiveWindowState(config=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", startTimeMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", tickCount=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19372010qc(WindowConfig windowConfig, String str, long j) {
        this.LIZ = windowConfig;
        this.LIZIZ = str;
        this.LIZJ = j;
    }
}
