package X;

import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestWatermarkReportConfigSetting;

/* JADX INFO: renamed from: X.0eB7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078750eB7 {
    public long LIZ;
    public long LIZIZ;
    public boolean LIZJ;
    public final long LIZLLL;
    public final long LJ;
    public final boolean LJFF;

    public C1078750eB7() {
        MultiGuestWatermarkReportConfigSetting multiGuestWatermarkReportConfigSetting = MultiGuestWatermarkReportConfigSetting.INSTANCE;
        this.LIZLLL = multiGuestWatermarkReportConfigSetting.getSettingValue().thresholdOfTimes;
        this.LJ = multiGuestWatermarkReportConfigSetting.getSettingValue().thresholdOfDiffInMS;
        this.LJFF = multiGuestWatermarkReportConfigSetting.getSettingValue().enabled;
    }
}
