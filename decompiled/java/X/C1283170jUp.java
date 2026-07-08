package X;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0jUp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283170jUp extends C09AY implements Function0<String> {
    public C1283170jUp() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        boolean z;
        boolean z2;
        try {
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            if (Build.VERSION.SDK_INT >= 29) {
                C089E c089e = new C089E(codecInfos);
                while (c089e.hasNext()) {
                    MediaCodecInfo mediaCodecInfo = (MediaCodecInfo) c089e.next();
                    if (mediaCodecInfo.isEncoder() && mediaCodecInfo.isHardwareAccelerated()) {
                        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                        int length = supportedTypes.length;
                        int i = 0;
                        while (true) {
                            if (i >= length) {
                                z2 = true;
                                break;
                            }
                            if (u.LJIJI(supportedTypes[i], "audio/mp4a-latm", true)) {
                                z2 = false;
                                break;
                            }
                            i++;
                        }
                        if (!z2) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("BulletinAacEncoderCapability: vendor(hw)=");
                            sbLIZ.append(mediaCodecInfo.getName());
                            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ));
                            return mediaCodecInfo.getName();
                        }
                    }
                }
            }
            C089E c089e2 = new C089E(codecInfos);
            while (c089e2.hasNext()) {
                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) c089e2.next();
                if (mediaCodecInfo2.isEncoder()) {
                    String[] supportedTypes2 = mediaCodecInfo2.getSupportedTypes();
                    int length2 = supportedTypes2.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length2) {
                            z = true;
                            break;
                        }
                        if (u.LJIJI(supportedTypes2[i2], "audio/mp4a-latm", true)) {
                            z = false;
                            break;
                        }
                        i2++;
                    }
                    if (z) {
                        continue;
                    } else {
                        String name = mediaCodecInfo2.getName();
                        if (!u.LJJIIJZLJL(name, "OMX.google.", true) && !u.LJJIIJZLJL(name, "c2.android.", true)) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("BulletinAacEncoderCapability: vendor(name)=");
                            sbLIZ2.append(name);
                            C0OPX.LJII(C2188811AlT.LIZIZ(sbLIZ2));
                            return name;
                        }
                    }
                }
            }
            C0OPX.LJII("BulletinAacEncoderCapability: no vendor encoder, will fall back to sw");
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("BulletinAacEncoderCapability.probe failed: ");
            sbLIZ3.append(e.getMessage());
            C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ3));
            return null;
        }
    }
}
