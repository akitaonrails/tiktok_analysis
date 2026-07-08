package X;

import com.ss.android.ugc.aweme.task.resaltas.WindowConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.10qd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19372110qd {
    public final WindowConfig LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19372110qd)) {
            return false;
        }
        C19372110qd c19372110qd = (C19372110qd) obj;
        return Intrinsics.LJFF(this.LIZ, c19372110qd.LIZ) && this.LIZIZ == c19372110qd.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActiveWindowState(config=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", startTimeMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19372110qd(WindowConfig windowConfig, long j) {
        this.LIZ = windowConfig;
        this.LIZIZ = j;
    }
}
