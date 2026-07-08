package X;

import com.ss.android.ugc.aweme.creative.compileconfig.CompileConfigResolution;
import com.ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;

/* JADX INFO: renamed from: X.0na6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1440200na6 {
    public final List<VideoSegment> LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final CompileConfigResolution LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final boolean LJI;
    public final VEVideoEncodeSettings.ENCODE_STANDARD LJII;
    public final int LJIIIIZZ;
    public final Integer LJIIIZ;
    public final String LJIIJ;

    public C1440200na6(List list, String str, String str2, CompileConfigResolution compileConfigResolution, int i, VEVideoEncodeSettings.ENCODE_STANDARD encode_standard, int i2, Integer num, String str3, int i3) {
        boolean z;
        i = (i3 & 16) != 0 ? 1 : i;
        if ((i3 & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = (i3 & 64) != 0;
        encode_standard = (i3 & 128) != 0 ? VEVideoEncodeSettings.ENCODE_STANDARD.ENCODE_STANDARD_H264 : encode_standard;
        i2 = (i3 & 256) != 0 ? 19 : i2;
        num = (i3 & 512) != 0 ? null : num;
        str3 = (i3 & 1024) != 0 ? null : str3;
        this.LIZ = list;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = compileConfigResolution;
        this.LJ = i;
        this.LJFF = z;
        this.LJI = z2;
        this.LJII = encode_standard;
        this.LJIIIIZZ = i2;
        this.LJIIIZ = num;
        this.LJIIJ = str3;
    }
}
