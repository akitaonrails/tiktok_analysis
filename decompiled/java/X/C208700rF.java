package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00rF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C208700rF {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C208700rF)) {
            return false;
        }
        C208700rF c208700rF = (C208700rF) obj;
        return Intrinsics.LJFF(this.LIZ, c208700rF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c208700rF.LIZIZ) && this.LIZJ == c208700rF.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Entry(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", producerKey=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", writeTimeMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C208700rF(long j, String str, Aweme aweme) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = j;
    }
}
