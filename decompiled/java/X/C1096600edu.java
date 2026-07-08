package X;

import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostEnabledSetting;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveRepostProduceConfig;
import com.bytedance.android.livesdkapi.host.IHostSetting;

/* JADX INFO: renamed from: X.0edu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1096600edu {
    public static boolean LIZ() {
        return LiveRepostEnabledSetting.INSTANCE.getValue() && ((IHostSetting) C1161920gLG.LIZJ(IHostSetting.class)).hW();
    }

    public static boolean LIZIZ() {
        return LIZ() && LiveRepostProduceConfig.INSTANCE.config().repostProduceEnable;
    }
}
