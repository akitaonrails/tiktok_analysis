package X;

import com.ss.ttlivestreamer.livestreamv2.videoquality.strategycenter.model.BitrateConfig;
import java.util.Map;

/* JADX INFO: renamed from: X.1D44, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D44 {
    public static C1D47 LIZ(Map<String, BitrateConfig> map, int i, EnumC1283150jUn enumC1283150jUn) {
        BitrateConfig bitrateConfig;
        C1D47 c1d47;
        if (map == null || (bitrateConfig = map.get(String.valueOf(i))) == null) {
            c1d47 = new C1D47(i, enumC1283150jUn);
        } else {
            c1d47 = new C1D47(bitrateConfig.maxBitrate, bitrateConfig.minBitrate, bitrateConfig.defaultBitrate, i, enumC1283150jUn);
            int i2 = bitrateConfig.width;
            int i3 = bitrateConfig.height;
            c1d47.LJIJ = i2;
            c1d47.LJIJI = i3;
            c1d47.LJIJJ = bitrateConfig.fps;
            c1d47.LJIJJLI = bitrateConfig.desc;
            c1d47.LJIL = bitrateConfig.name;
            if (bitrateConfig.LIZ != null) {
                C1D46 c1d46 = new C1D46();
                c1d46.LIZLLL = bitrateConfig.LIZ;
                c1d47.LJJ = c1d46;
            }
        }
        c1d47.LIZLLL();
        return c1d47;
    }
}
