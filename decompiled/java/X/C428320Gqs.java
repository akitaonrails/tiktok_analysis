package X;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Gqs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C428320Gqs extends AbstractC428280Gqo {
    public final View LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C428320Gqs)) {
            return false;
        }
        C428320Gqs c428320Gqs = (C428320Gqs) obj;
        return Intrinsics.LJFF(this.LIZ, c428320Gqs.LIZ) && this.LIZIZ == c428320Gqs.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(view=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", totalDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C428320Gqs(long j, View view) {
        this.LIZ = view;
        this.LIZIZ = j;
    }
}
