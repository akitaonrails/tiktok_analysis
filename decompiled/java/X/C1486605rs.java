package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05rs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1486605rs {
    public final Aweme LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1486605rs)) {
            return false;
        }
        C1486605rs c1486605rs = (C1486605rs) obj;
        return Intrinsics.LJFF(this.LIZ, c1486605rs.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1486605rs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1486605rs.LIZJ) && this.LIZLLL == c1486605rs.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ClickBackTimeRecord(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", refer=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", tag=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", clickTimeMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1486605rs(long j, Aweme aweme, String str, String str2) {
        this.LIZ = aweme;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = j;
    }
}
