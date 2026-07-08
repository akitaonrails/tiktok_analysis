package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jXG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1284680jXG {
    public static MediaCodecInfo LIZ(InterfaceC1284570jX5... interfaceC1284570jX5Arr) {
        try {
            int codecCount = MediaCodecList.getCodecCount();
            for (int i = 0; i < codecCount; i++) {
                MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                if (codecInfoAt != null) {
                    codecInfoAt.getName();
                    codecInfoAt.getSupportedTypes();
                    boolean zLIZ = true;
                    for (InterfaceC1284570jX5 interfaceC1284570jX5 : interfaceC1284570jX5Arr) {
                        zLIZ = interfaceC1284570jX5.LIZ(codecInfoAt);
                        if (!zLIZ) {
                            break;
                        }
                    }
                    if (zLIZ) {
                        return codecInfoAt;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1481110oe5.LJ("selectCodec", th);
            return null;
        }
    }
}
