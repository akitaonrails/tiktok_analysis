package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEvent;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventConfig;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventParams;
import com.ss.android.ugc.aweme.ecommerce.mixmall.parse.dto.track.ECMixMallTrackEventRuntimeParams;
import java.util.Map;

/* JADX INFO: renamed from: X.0wI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1774950wI1 {
    public final String LIZ;
    public final Map<String, Object> LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final Map<String, String> LJ;
    public final Map<String, String> LJFF;

    public final ECMixMallTrackEvent LIZ() {
        return new ECMixMallTrackEvent(new ECMixMallTrackEventConfig(0, 0, null), this.LIZ, new ECMixMallTrackEventParams(this.LIZJ, this.LIZLLL, C2097608Jq.LJIIZILJ(this.LIZIZ), this.LJ, this.LJFF, null, null), new ECMixMallTrackEventRuntimeParams(0));
    }

    public C1774950wI1(String str, Map map, int i, int i2, Map map2, int i3) {
        i = (i3 & 8) != 0 ? 0 : i;
        i2 = (i3 & 16) != 0 ? 0 : i2;
        map2 = (i3 & 32) != 0 ? null : map2;
        this.LIZ = str;
        this.LIZIZ = map;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = map2;
        this.LJFF = null;
    }
}
