package X;

import android.media.MediaCodec;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1283160jUo {
    public static final C1283160jUo LIZ = new C1283160jUo();

    public static MediaCodec LIZ() {
        String str = (String) C2185908hN.LIZ.getValue();
        if (str != null) {
            try {
                return MediaCodec.createByCodecName(str);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BulletinAacEncoder: hw encoder ");
                sbLIZ.append(str);
                sbLIZ.append(" createByCodecName failed: ");
                sbLIZ.append(e.getMessage());
                C0OPX.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return MediaCodec.createEncoderByType("audio/mp4a-latm");
    }
}
