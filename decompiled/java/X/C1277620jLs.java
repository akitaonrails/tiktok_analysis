package X;

import com.ss.pusher.core.params.LiveSdkSetting;
import com.ss.pusher.core.params.ProbeSpeedGear;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0jLs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277620jLs {
    public static final ProbeSpeedGear LIZ(LiveSdkSetting liveSdkSetting, int i, int i2, int i3) {
        ProbeSpeedGear probeSpeedGear;
        ProbeSpeedGear next;
        Iterator<ProbeSpeedGear> it2 = liveSdkSetting.probeSpeedResolutions.iterator();
        while (true) {
            probeSpeedGear = null;
            if (it2.hasNext()) {
                next = it2.next();
                ProbeSpeedGear probeSpeedGear2 = next;
                if (probeSpeedGear2.width == i && probeSpeedGear2.height == i2 && probeSpeedGear2.fps == i3) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        ProbeSpeedGear probeSpeedGear3 = next;
        if (probeSpeedGear3 == null) {
            Iterator<ProbeSpeedGear> it3 = liveSdkSetting.probeSpeedResolutions.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                ProbeSpeedGear next2 = it3.next();
                ProbeSpeedGear probeSpeedGear4 = next2;
                probeSpeedGear4.getClass();
                Pair pair = new Pair(Integer.valueOf(probeSpeedGear4.width), Integer.valueOf(probeSpeedGear4.height));
                if (((Number) pair.getFirst()).intValue() != 480 || ((Number) pair.getSecond()).intValue() != 864) {
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    int iIntValue2 = ((Number) pair.getSecond()).intValue();
                    int iLIZ = C1279360jOg.LIZ(iIntValue, iIntValue2);
                    if (!Intrinsics.LJFF(new Pair(Integer.valueOf(iIntValue / iLIZ), Integer.valueOf(iIntValue2 / iLIZ)), new Pair(9, 16)) && probeSpeedGear4.height == i2 && probeSpeedGear4.fps == i3) {
                        probeSpeedGear = next2;
                        break;
                    }
                }
            }
            return probeSpeedGear;
        }
        return probeSpeedGear3;
    }
}
