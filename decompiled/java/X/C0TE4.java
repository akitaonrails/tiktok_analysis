package X;

import com.bytedance.android.livesdk.game.multidevicesdk.dualdevice.CastLinkerWrapper;
import com.bytedance.android.livesdk.game.multidevicesdk.dualdevice.ICastSource$CastParams;
import com.bytedance.android.livesdk.game.multidevicesdk.dualdevice.ICastSource$CastSourceDetectParams;
import com.bytedance.android.livesdk.livesetting.broadcast.GamePhoneAsCameraEnableSetting;
import kotlin.jvm.internal.AwS29S1201000_12;

/* JADX INFO: renamed from: X.0TE4, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TE4 {
    public final /* synthetic */ C0TE2 LIZ;

    public C0TE4(C0TE2 c0te2) {
        this.LIZ = c0te2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String LIZ(ICastSource$CastSourceDetectParams iCastSource$CastSourceDetectParams) {
        CastLinkerWrapper castLinkerWrapper;
        if (!GamePhoneAsCameraEnableSetting.INSTANCE.enable()) {
            C0TEO c0teo = this.LIZ.LJ;
            if (c0teo != null) {
                String str = iCastSource$CastSourceDetectParams.ip;
                int i = iCastSource$CastSourceDetectParams.port;
                C013C c013c = new C013C();
                C0TEM.LIZIZ(new AwS29S1201000_12(str, c0teo, i, c013c, 2));
                String string = Boolean.valueOf(c013c.element).toString();
                if (string != null) {
                    return string;
                }
                return null;
            }
            return null;
        }
        C0TEO c0teo2 = this.LIZ.LJ;
        if (c0teo2 != null) {
            String str2 = iCastSource$CastSourceDetectParams.ip;
            int i2 = iCastSource$CastSourceDetectParams.port;
            C259800zU c259800zU = new C259800zU();
            c259800zU.element = "";
            C0TEM.LIZIZ(new AwS29S1201000_12(str2, (String) c0teo2, (C0TEO) i2, (int) c259800zU, (C259800zU<String>) 3));
            String str3 = (String) c259800zU.element;
            if (str3 != null) {
                C0TE2 c0te2 = this.LIZ;
                if (str3.length() > 0) {
                    ICastSource$CastParams iCastSource$CastParams = c0te2.LJIIJJI;
                    if (iCastSource$CastParams != null) {
                        iCastSource$CastParams.setIp(str3);
                    }
                    ICastSource$CastParams iCastSource$CastParams2 = c0te2.LJIIJJI;
                    if (iCastSource$CastParams2 != null && (castLinkerWrapper = c0te2.LJI) != null) {
                        castLinkerWrapper.LJII(iCastSource$CastParams2);
                    }
                }
                return str3;
            }
            return null;
        }
        return null;
    }
}
