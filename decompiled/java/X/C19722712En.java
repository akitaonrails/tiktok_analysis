package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.12En, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19722712En {
    public final String LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final Aweme LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19722712En)) {
            return false;
        }
        C19722712En c19722712En = (C19722712En) obj;
        return Intrinsics.LJFF(this.LIZ, c19722712En.LIZ) && this.LIZIZ == c19722712En.LIZIZ && this.LIZJ == c19722712En.LIZJ && this.LIZLLL == c19722712En.LIZLLL && Intrinsics.LJFF(this.LJ, c19722712En.LJ) && Intrinsics.LJFF(this.LJFF, c19722712En.LJFF) && Intrinsics.LJFF(this.LJI, c19722712En.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31;
        String str = this.LJ;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.LJFF;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Aweme aweme = this.LJI;
        return iHashCode3 + (aweme != null ? aweme.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExtractVideoInfo(videoUrl=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", videoDuration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", videoWidth=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", videoHeight=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", coverUrl=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", videoLocalPath=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", videoAweme=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C19722712En(String str, long j, int i, int i2, String str2, String str3, Aweme aweme) {
        this.LIZ = str;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = str2;
        this.LJFF = str3;
        this.LJI = aweme;
    }
}
