package X;

import android.os.SystemClock;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OhP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626290OhP {
    public final long LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C626290OhP)) {
            return false;
        }
        C626290OhP c626290OhP = (C626290OhP) obj;
        return this.LIZ == c626290OhP.LIZ && Intrinsics.LJFF(this.LIZIZ, c626290OhP.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c626290OhP.LIZJ) && this.LIZLLL == c626290OhP.LIZLLL && this.LJ == c626290OhP.LJ && this.LJFF == c626290OhP.LJFF && this.LJI == c626290OhP.LJI;
    }

    public final int hashCode() {
        return (((((((((((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL) * 31) + this.LJ) * 31) + this.LJFF) * 31) + this.LJI;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ArchivePageDataRequestData(duration=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", pullType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", statusCode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", errorCode=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", retryCount=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", responseCount=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("duration", String.valueOf(this.LIZ));
        linkedHashMap.put("result", this.LIZIZ);
        linkedHashMap.put("pull_type", this.LIZJ);
        linkedHashMap.put("status_code", String.valueOf(this.LIZLLL));
        linkedHashMap.put("error_code", String.valueOf(this.LJ));
        linkedHashMap.put("retry_count", String.valueOf(this.LJFF));
        linkedHashMap.put("response_count", String.valueOf(this.LJI));
        C626310OhR c626310OhR = C626310OhR.LIZ;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        c626310OhR.getClass();
        C626310OhR.LIZLLL = jElapsedRealtime;
        C20684815ws.LJIILLIIL("friends3_text_post_archive_page_data_request", linkedHashMap);
    }

    public C626290OhP(int i, String str, String str2, int i2, long j, int i3, int i4) {
        this.LIZ = j;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = i3;
        this.LJI = i4;
    }
}
