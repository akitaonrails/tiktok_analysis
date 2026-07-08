package X;

import com.ss.android.ugc.aweme.image.experiment.ImageMonitorByAppLogConfig;

/* JADX INFO: renamed from: X.0kjW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1330720kjW {
    public static final C01GW LIZ;
    public static final C01GW LIZIZ;
    public static final C01GW LIZJ;
    public static final ImageMonitorByAppLogConfig LIZLLL;

    static {
        ImageMonitorByAppLogConfig imageMonitorByAppLogConfig = new ImageMonitorByAppLogConfig(false, false, 1.0f, false, 1.0f, false, 1.0f, false, 1.0f, false);
        LIZ = C452501pT.LIZIZ(new C1330710kjV());
        LIZIZ = C452501pT.LIZIZ(new C1330730kjX());
        LIZJ = C452501pT.LIZIZ(new C1330740kjY());
        ImageMonitorByAppLogConfig imageMonitorByAppLogConfig2 = (ImageMonitorByAppLogConfig) C0C64.LJIILLIIL().LJJII(ImageMonitorByAppLogConfig.class, imageMonitorByAppLogConfig, "image_monitor_by_applog_exp", true);
        if (imageMonitorByAppLogConfig2 != null) {
            imageMonitorByAppLogConfig = imageMonitorByAppLogConfig2;
        }
        LIZLLL = imageMonitorByAppLogConfig;
    }

    public static final boolean LIZ() {
        return ((Boolean) LIZ.getValue()).booleanValue();
    }

    public static final boolean LIZIZ() {
        return ((Boolean) LIZIZ.getValue()).booleanValue();
    }
}
