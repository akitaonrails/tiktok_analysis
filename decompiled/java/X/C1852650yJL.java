package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.AIGCStyleConfig;
import com.ss.android.ugc.aweme.tako.ccl.model.api.ConvertStyle;
import com.ss.android.ugc.aweme.tako.ccl.model.api.CreativeTemplate;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import java.util.List;

/* JADX INFO: renamed from: X.0yJL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1852650yJL {
    public final int LIZ;
    public final String LIZIZ;
    public final ConvertStyle LIZJ;
    public final TakoSug LIZLLL;
    public final String LJ;
    public final List<CreativeTemplate> LJFF;
    public final String LJI;
    public final long LJII;
    public final boolean LJIIIIZZ;
    public final String LJIIIZ;
    public final AIGCStyleConfig LJIIJ;

    public C1852650yJL(int i, String str, ConvertStyle convertStyle, TakoSug takoSug, String str2, List list, String str3, boolean z, String str4, AIGCStyleConfig aIGCStyleConfig, int i2) {
        long jCurrentTimeMillis;
        convertStyle = (i2 & 4) != 0 ? null : convertStyle;
        takoSug = (i2 & 8) != 0 ? null : takoSug;
        str2 = (i2 & 16) != 0 ? null : str2;
        list = (i2 & 32) != 0 ? null : list;
        str3 = (i2 & 64) != 0 ? "action_bar" : str3;
        if ((i2 & 128) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        z = (i2 & 256) != 0 ? false : z;
        str4 = (i2 & 512) != 0 ? null : str4;
        aIGCStyleConfig = (i2 & 1024) != 0 ? null : aIGCStyleConfig;
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = convertStyle;
        this.LIZLLL = takoSug;
        this.LJ = str2;
        this.LJFF = list;
        this.LJI = str3;
        this.LJII = jCurrentTimeMillis;
        this.LJIIIIZZ = z;
        this.LJIIIZ = str4;
        this.LJIIJ = aIGCStyleConfig;
    }
}
