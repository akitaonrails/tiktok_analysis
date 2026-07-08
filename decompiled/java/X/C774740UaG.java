package X;

import com.bytedance.android.livesdk.model.message.common.Text;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Map;

/* JADX INFO: renamed from: X.0UaG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C774740UaG {
    public final String LIZ;
    public final Text LIZIZ;
    public final int LIZJ;
    public final Map<Integer, Integer> LIZLLL;
    public final Map<Integer, Integer> LJ;
    public final long LJFF;

    public C774740UaG() {
        this(null, 0, null, null, 0L, 63);
    }

    public C774740UaG(String str, int i, Map map, Map map2, long j, int i2) {
        str = (i2 & 1) != 0 ? null : str;
        i = (i2 & 4) != 0 ? 0 : i;
        map = (i2 & 8) != 0 ? null : map;
        map2 = (i2 & 16) != 0 ? null : map2;
        j = (i2 & 32) != 0 ? Mp4ScreenVideoLoadTimeout.CONTROL : j;
        this.LIZ = str;
        this.LIZIZ = null;
        this.LIZJ = i;
        this.LIZLLL = map;
        this.LJ = map2;
        this.LJFF = j;
    }
}
