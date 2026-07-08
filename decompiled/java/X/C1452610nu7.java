package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0nu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1452610nu7 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1452610nu7() {
        String str = null;
        int i = 0;
        this(str, i, i, i, i, i, i, str, 2047);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1452610nu7(String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, int i7) {
        int i8;
        int i9 = i6;
        int i10 = i5;
        String str3 = str2;
        int i11 = i4;
        int i12 = i3;
        int i13 = i2;
        int i14 = i;
        String str4 = (i7 & 1) != 0 ? "" : str;
        i14 = (i7 & 2) != 0 ? 0 : i14;
        i13 = (i7 & 4) != 0 ? 0 : i13;
        i12 = (i7 & 8) != 0 ? 0 : i12;
        i11 = (i7 & 16) != 0 ? 4000 : i11;
        i10 = (i7 & 32) != 0 ? 0 : i10;
        i9 = (i7 & 64) != 0 ? 0 : i9;
        str3 = (i7 & 512) != 0 ? "unknown" : str3;
        if ((i7 & 1024) != 0) {
            i8 = Integer.MAX_VALUE;
        } else {
            i8 = 0;
        }
        this(str4, i14, i13, i12, i11, i10, i9, 0, 0, str3, i8);
    }

    public C1452610nu7(String str, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, String str2, int i9) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i4;
        this.LIZLLL = i6;
        this.LJ = i9;
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
        map.put("key_frame_count", Integer.valueOf(i9));
    }
}
