package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0LDa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539280LDa {
    public final String LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;
    public final int LJI;
    public final int LJII;
    public final int LJIIIIZZ;
    public final String LJIIIZ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C539280LDa() {
        String str = null;
        int i = 0;
        this(i, i, i, i, i, i, 1023, str, str);
    }

    public static C539280LDa LIZ(C539280LDa c539280LDa, int i, int i2) {
        return new C539280LDa(i, i2, 0, c539280LDa.LJ, c539280LDa.LJFF, c539280LDa.LJI, c539280LDa.LJII, c539280LDa.LJIIIIZZ, c539280LDa.LIZ, c539280LDa.LJIIIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C539280LDa(int i, int i2, int i3, int i4, int i5, int i6, int i7, String str, String str2) {
        int i8 = i6;
        String str3 = str2;
        int i9 = i5;
        int i10 = i4;
        int i11 = i3;
        int i12 = i2;
        int i13 = i;
        this((i7 & 2) != 0 ? 0 : i13, (i7 & 4) != 0 ? 0 : i12, (i7 & 8) != 0 ? 0 : i11, (i7 & 16) != 0 ? 4000 : i10, (i7 & 32) != 0 ? 0 : i9, (i7 & 64) != 0 ? 0 : i8, 0, 0, (i7 & 1) != 0 ? "" : str, (i7 & 512) != 0 ? "unknown" : str3);
    }

    public C539280LDa(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
        this.LJFF = i5;
        this.LJI = i6;
        this.LJII = i7;
        this.LJIIIIZZ = i8;
        this.LJIIIZ = str2;
        HashMap map = new HashMap();
        map.put("path", str);
        map.put("width", Integer.valueOf(i));
        map.put("height", Integer.valueOf(i2));
        map.put("rotation", Integer.valueOf(i3));
        map.put("duration", Integer.valueOf(i4));
        map.put("bitrate", Integer.valueOf(i5 * LSPassThroughRecordSizeConfig.DEFAULT));
        map.put("fps", Integer.valueOf(i6));
        map.put("codec", Integer.valueOf(i7));
        map.put("video_duration", Integer.valueOf(i8));
        map.put("codec_info", str2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(i);
        sbLIZ.append('x');
        sbLIZ.append(i2);
        map.put("video_size", C2188811AlT.LIZIZ(sbLIZ));
    }
}
