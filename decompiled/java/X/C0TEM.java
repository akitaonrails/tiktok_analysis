package X;

import com.byted.cast.common.api.MirrorInfo;
import com.byted.cast.common.source.ServiceInfo;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveGameDualDeviceSourceSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0TEM, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TEM {
    public static final void LIZIZ(Function0 function0) {
        try {
            function0.invoke();
        } catch (NoClassDefFoundError e) {
            TryCatchGuardChecker.doCheck(e);
            int i = C0TEO.LIZLLL;
            int i2 = C0TEO.LIZLLL;
            C20441214yg.LJFF("ByteCastSourceWrapper", "NoClassDefFoundError the df_live_plugin is not ready", e);
        }
    }

    public static final MirrorInfo LIZ(ServiceInfo serviceInfo, int i, int i2, Integer num, C0TEO c0teo) {
        MirrorInfo mirrorInfo = new MirrorInfo();
        mirrorInfo.enableEncodeSizeToScreen(true);
        mirrorInfo.setVirtualDisplayFlag(2);
        mirrorInfo.setVirtualDisplayName("xxx-v-display");
        if (num != null) {
            mirrorInfo.setFps(num.intValue());
        } else {
            mirrorInfo.setFps(LiveGameDualDeviceSourceSetting.INSTANCE.getFPS());
        }
        mirrorInfo.setServiceInfo(serviceInfo);
        mirrorInfo.setAudioEnable(false);
        if (c0teo != null) {
            c0teo.LIZ(10017, Boolean.FALSE);
        }
        mirrorInfo.setAutoBitrate(true);
        int fps = (int) ((((double) ((i * i2) * mirrorInfo.getFps())) * 0.2d) / ((double) LSPassThroughRecordSizeConfig.DEFAULT));
        if (2000 >= fps) {
            fps = 2000;
        }
        mirrorInfo.setBitrate(fps);
        mirrorInfo.setVideoSrc(2);
        mirrorInfo.setCameraId(0);
        mirrorInfo.setServerMode(1);
        mirrorInfo.setEncodeWidth(i);
        mirrorInfo.setEncodeHeight(i2);
        mirrorInfo.setVirtualDisplayWidth(i);
        mirrorInfo.setVirtualDisplayHeight(i2);
        return mirrorInfo;
    }
}
