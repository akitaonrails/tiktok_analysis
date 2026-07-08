package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.deviceregister.DeviceRegisterManager;
import com.ss.android.ugc.aweme.image.experiment.ImageMonitorByAppLogConfig;
import java.math.BigInteger;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0kjY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330740kjY extends C09AY implements Function0<Boolean> {
    public C1330740kjY() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        if (!C1330720kjW.LIZIZ()) {
            return Boolean.FALSE;
        }
        ImageMonitorByAppLogConfig imageMonitorByAppLogConfig = C1330720kjW.LIZLLL;
        float f = imageMonitorByAppLogConfig.imageMonitorAppLogSampleRate;
        if (f <= 0.0f) {
            return Boolean.FALSE;
        }
        if (f >= 1.0f) {
            return Boolean.TRUE;
        }
        if (imageMonitorByAppLogConfig.imageMonitorSampleRateByDid) {
            try {
                return Boolean.valueOf(((float) new BigInteger(DeviceRegisterManager.com_ss_android_deviceregister_DeviceRegisterManager_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getDeviceId()).remainder(new BigInteger("10000")).intValue()) < imageMonitorByAppLogConfig.imageMonitorAppLogSampleRate * ((float) 10000));
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return Boolean.valueOf(Math.random() <= ((double) C1330720kjW.LIZLLL.imageMonitorAppLogSampleRate));
    }
}
