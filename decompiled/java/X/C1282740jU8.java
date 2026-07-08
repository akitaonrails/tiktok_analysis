package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.animax.util.AnimaXLog;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0jU8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1282740jU8 {
    public static C1282740jU8 LIZJ;
    public final Map<String, Boolean> LIZ = new ConcurrentHashMap();
    public volatile MediaCodecInfo[] LIZIZ;

    public final boolean LIZ(String str, boolean z) {
        String str2;
        MediaCodecInfo[] mediaCodecInfoArr;
        boolean z2 = false;
        if (!str.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str.toLowerCase());
            if (z) {
                str2 = "_HW";
            } else {
                str2 = "_SW";
            }
            sbLIZ.append(str2);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (((ConcurrentHashMap) this.LIZ).containsKey(strLIZIZ)) {
                return ((Boolean) ((ConcurrentHashMap) this.LIZ).get(strLIZIZ)).booleanValue();
            }
            if (!str.isEmpty()) {
                try {
                    if (this.LIZIZ != null) {
                        mediaCodecInfoArr = this.LIZIZ;
                    } else {
                        synchronized (this) {
                            try {
                                if (this.LIZIZ == null) {
                                    int codecCount = MediaCodecList.getCodecCount();
                                    MediaCodecInfo[] mediaCodecInfoArr2 = new MediaCodecInfo[codecCount];
                                    for (int i = 0; i < codecCount; i++) {
                                        mediaCodecInfoArr2[i] = MediaCodecList.getCodecInfoAt(i);
                                    }
                                    this.LIZIZ = mediaCodecInfoArr2;
                                }
                                mediaCodecInfoArr = this.LIZIZ;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                    }
                    int length = mediaCodecInfoArr.length;
                    int i2 = 0;
                    loop0: while (true) {
                        if (i2 >= length) {
                            break;
                        }
                        MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i2];
                        if (!mediaCodecInfo.isEncoder() && (!z || Build.VERSION.SDK_INT < 29 || mediaCodecInfo.isHardwareAccelerated())) {
                            for (String str3 : mediaCodecInfo.getSupportedTypes()) {
                                if (str3.equalsIgnoreCase(str)) {
                                    z2 = true;
                                    break loop0;
                                }
                            }
                        }
                        i2++;
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("checkCodecSupport failed, mimeType: ");
                    sbLIZ2.append(str);
                    sbLIZ2.append(", message: ");
                    sbLIZ2.append(e.getMessage());
                    AnimaXLog.LIZ("CodecDecodeCapability", C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            ((ConcurrentHashMap) this.LIZ).put(strLIZIZ, Boolean.valueOf(z2));
        }
        return z2;
    }
}
