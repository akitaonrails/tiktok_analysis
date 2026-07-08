package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicUploadConfig;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

/* JADX INFO: renamed from: X.0gNm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1163480gNm {
    public static Long LIZ = null;
    public static volatile boolean LIZIZ = true;

    public static final long LIZIZ() {
        Long l = LIZ;
        if (l != null) {
            return l.longValue();
        }
        String serverDeviceId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getServerDeviceId();
        Long lLJIILIIL = serverDeviceId != null ? C2095008Iq.LJIILIIL(serverDeviceId) : null;
        LIZ = lLJIILIIL;
        if (lLJIILIIL != null) {
            return lLJIILIIL.longValue();
        }
        return 0L;
    }

    public static final boolean LIZ(int i) {
        if (LIZIZ() == 0) {
            if (LIZIZ) {
                String serverDeviceId = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getServerDeviceId();
                Throwable th = new Throwable();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("DEVICE_ID == null + ");
                sbLIZ.append(serverDeviceId);
                sbLIZ.append(' ');
                sbLIZ.append(C2095008Iq.LJIILIIL(serverDeviceId));
                C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), th);
                LIZIZ = false;
            }
            return false;
        }
        if (LIZIZ() % ((long) 100) >= i) {
            return false;
        }
        return true;
    }

    public static final int LIZJ(LinkMicUploadConfig linkMicUploadConfig, int i) {
        int[] iArr;
        if (linkMicUploadConfig == null || linkMicUploadConfig.enable == 0 || ((iArr = linkMicUploadConfig.sample0ExceptionType) != null && C13LQ.LJJIJ(i, iArr) >= 0)) {
            return 0;
        }
        int[] iArr2 = linkMicUploadConfig.sample1ExceptionType;
        if (iArr2 != null && C13LQ.LJJIJ(i, iArr2) >= 0) {
            return 1;
        }
        int[] iArr3 = linkMicUploadConfig.sample10ExceptionType;
        if (iArr3 != null && C13LQ.LJJIJ(i, iArr3) >= 0) {
            return 10;
        }
        int[] iArr4 = linkMicUploadConfig.sample50ExceptionType;
        if (iArr4 != null && C13LQ.LJJIJ(i, iArr4) >= 0) {
            return 50;
        }
        int[] iArr5 = linkMicUploadConfig.sample100ExceptionType;
        if (iArr5 != null && C13LQ.LJJIJ(i, iArr5) >= 0) {
            return 100;
        }
        if (linkMicUploadConfig.enable == 1) {
            return linkMicUploadConfig.defaultSample;
        }
        return 0;
    }
}
