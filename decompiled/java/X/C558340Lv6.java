package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Lv6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C558340Lv6 {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;
    public final boolean LJIIJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C558340Lv6() {
        String str = null;
        int i = 0;
        this(str, i, i, i, 0L, i, i, str, 2047);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C558340Lv6)) {
            return false;
        }
        C558340Lv6 c558340Lv6 = (C558340Lv6) obj;
        return Intrinsics.LJFF(this.LIZ, c558340Lv6.LIZ) && this.LIZIZ == c558340Lv6.LIZIZ && this.LIZJ == c558340Lv6.LIZJ && this.LIZLLL == c558340Lv6.LIZLLL && this.LJ == c558340Lv6.LJ && this.LJFF == c558340Lv6.LJFF && this.LJI == c558340Lv6.LJI && this.LJII == c558340Lv6.LJII && this.LJIIIIZZ == c558340Lv6.LJIIIIZZ && Intrinsics.LJFF(this.LJIIIZ, c558340Lv6.LJIIIZ) && this.LJIIJ == c558340Lv6.LJIIJ;
    }

    public final int hashCode() {
        return (((((((((((((((((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + this.LJFF) * 31) + this.LJI) * 31) + this.LJII) * 31) + this.LJIIIIZZ) * 31) + this.LJIIIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LJIIJ);
    }

    public final String toString() {
        return "VideoMetaDataInfo(path=" + this.LIZ + ", width=" + this.LIZIZ + ", height=" + this.LIZJ + ", rotation=" + this.LIZLLL + ", duration=" + this.LJ + ", bitrate=" + this.LJFF + ", fps=" + this.LJI + ", codecId=" + this.LJII + ", videoDuration=" + this.LJIIIIZZ + ", codecInfo=" + this.LJIIIZ + ", isHDR=" + this.LJIIJ + ')';
    }

    public /* synthetic */ C558340Lv6(String str, int i, int i2, int i3, long j, int i4, int i5, String str2, int i6) {
        this((i6 & 1) != 0 ? "" : str, (i6 & 2) != 0 ? 0 : i, (i6 & 4) != 0 ? 0 : i2, (i6 & 8) != 0 ? 0 : i3, (i6 & 16) != 0 ? 4000L : j, (i6 & 32) != 0 ? 0 : i4, (i6 & 64) != 0 ? 0 : i5, 0, 0, (i6 & 512) != 0 ? "unknown" : str2, false);
    }

    public C558340Lv6(String str, int i, int i2, int i3, long j, int i4, int i5, int i6, int i7, String str2, boolean z) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = j;
        this.LJFF = i4;
        this.LJI = i5;
        this.LJII = i6;
        this.LJIIIIZZ = i7;
        this.LJIIIZ = str2;
        this.LJIIJ = z;
        HashMap map = new HashMap();
        map.put("path", str);
        map.put("width", Integer.valueOf(i));
        map.put("height", Integer.valueOf(i2));
        map.put("rotation", Integer.valueOf(i3));
        map.put("duration", Long.valueOf(j));
        map.put("bitrate", Integer.valueOf(i4 * LSPassThroughRecordSizeConfig.DEFAULT));
        map.put("fps", Integer.valueOf(i5));
        map.put("codec", Integer.valueOf(i6));
        map.put("video_duration", Integer.valueOf(i7));
        map.put("codec_info", str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('x');
        sbLIZ.append(i2);
        map.put("video_size", C2188811AlT.LIZIZ(sbLIZ));
        map.put("is_hdr", Boolean.valueOf(z));
    }
}
