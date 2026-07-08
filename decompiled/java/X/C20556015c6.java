package X;

import com.ss.android.ugc.aweme.experiment.VideoSmartCroppingSettingsConfig;

/* JADX INFO: renamed from: X.15c6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20556015c6 {
    public static final C20556015c6 LIZ = new C20556015c6();
    public static final VideoSmartCroppingSettingsConfig LIZIZ = new VideoSmartCroppingSettingsConfig(false, 0.3f, true, false);
    public static final C01GW LIZJ;
    public static final boolean LIZLLL;
    public static final float LJ;
    public static final boolean LJFF;
    public static final boolean LJI;

    static {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new C20556115c7());
        LIZJ = c01gwLIZIZ;
        LIZLLL = ((VideoSmartCroppingSettingsConfig) c01gwLIZIZ.getValue()).show_area;
        LJ = ((VideoSmartCroppingSettingsConfig) c01gwLIZIZ.getValue()).sticker_percentage;
        LJFF = ((VideoSmartCroppingSettingsConfig) c01gwLIZIZ.getValue()).adapt_inline_caption;
        LJI = ((VideoSmartCroppingSettingsConfig) c01gwLIZIZ.getValue()).area_adjust;
    }
}
