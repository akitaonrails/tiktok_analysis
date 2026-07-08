package X;

import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'LLIZ' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: renamed from: X.0omx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1486610omx {
    public static final EnumC1486610omx LLILZLL;
    public static final EnumC1486610omx LLIZ;
    public static final /* synthetic */ EnumC1486610omx[] LLIZLLLIL;
    public final String LL;
    public final EnumC1486620omy LLILLJJLI;
    public final int LLILLL;
    public final boolean LLILZ;
    public final String LLILZIL;

    static {
        EnumC1486610omx enumC1486610omx = new EnumC1486610omx("abr", 0, "live_stream_strategy_abr_predict_bitrate", EnumC1486620omy.InPlaying, LSPassThroughRecordSizeConfig.DEFAULT, true, "{\n  \"Enable\": 1, \n  \"EnableLocalStrategyModel\": 1, \n  \"EnableSmartStrategyConfig\": 0,\n  \"InputFeatureList\": [\n    \"PLAY-IoBitrate\",\n    \"PLAY-BitrateList\",\n    \"PLAY-StartTs\",\n    \"PLAY-FirstFrameDownloadSpeed\",\n    \"PLAY-FirstFrame\",\n    \"PLAY-Bitrate\",\n    \"PLAY-VideoBuffer\",\n    \"PLAY-DownloadSpeed\",\n    \"PLAY-StallState\",\n    \"PLAY-IsPreview\",\n    \"PLAY-NeptuneName\",\n    \"PLAY-FastOpenDuration\",\n    \"PLAY-CCTKCongestionInfo\",\n    \"PLAY-StallStartSeries\",\n    \"PLAY-StallDurationSeries\",\n    \"PLAY-VideoTotalBuffer\",\n    \"PLAY-VrtBitrateList\"\n  ],\n  \"InputSettingsParam\": {\n    \"begin_quick_switch_time_ms\": 20000,\n    \"begin_switch_up_counter_threshold\": 2,\n    \"buffer_slope_threshold\": -0.5,\n    \"degrade_to_upgrade_interval_threshold\": 20000,\n    \"enable_bandwidth_allocation\": 1,\n    \"enable_buffer_slope\": 1,\n    \"enable_check_stall_series\": 1,\n    \"enable_downgrade_check_network\": 1,\n    \"enable_downgrade_for_low_buffer\": 1,\n    \"enable_new_calibrate_bitrate\": 1,\n    \"enable_only_check_latest_stall\": 1,\n    \"enable_upgrade_check_network\": 1,\n    \"enable_use_total_buffer\": 1,\n    \"flv_bw_multiplier\": 1,\n    \"min_down_buffer_length\": 0,\n    \"min_up_buffer_length\": 0.5,\n    \"pid_bw_multiplier\": 0.75,\n    \"reduce_buffer_threshold\": 2,\n    \"switch_down_counter_threshold\": 3,\n    \"switch_down_to_up_max_penalty_time_ms\": 60000,\n    \"switch_down_to_up_penalty_time_ms\": 20000,\n    \"switch_up_counter_threshold\": 6\n  }\n}");
        LLILZLL = enumC1486610omx;
        EnumC1486620omy enumC1486620omy = EnumC1486620omy.InStartup;
        EnumC1486610omx enumC1486610omx2 = new EnumC1486610omx("startup", 1, "live_stream_strategy_startup_bitrate_predict", enumC1486620omy, 0, false, "{\n  \"Enable\": 1,\n  \"EnableSmartStrategyConfig\": 0,\n  \"InputFeatureList\": [\n    \"PLAY-BitrateList\",\n    \"NETWORK-RecommendBitrate\",\n    \"PLAY-ResolutionMap\",\n    \"PLAY-IsPreview\",\n    \"PLAY-PushResolution\",\n    \"PLAY-NeptuneName\",\n    \"PLAY-ProbeStartupBandwidth\",\n    \"DEVICE-PhoneLevel\",\n    \"NETWORK-NetworkLevel\"\n  ],\n  \"InputSettingsParam\": {\n    \"EnableUsePRDStrategy\": 1,\n    \"PRDSettings\": {\n      \"BaselineParams\": {\n        \"DefaultResolution\": \"hd\"\n      },\n      \"BweToBitrateParams\": {\n        \"BottomLineParams\": {\n          \"Default\": {\n            \"hd\": 1100000,\n            \"sd\": 980000,\n            \"ld\": 480000,\n            \"uhd\": 12500000\n          },\n          \"SourceCCTK-NoPreview\": {\n            \"default\": {\n              \"hd\": 1100000,\n              \"sd\": 980000,\n              \"ld\": 480000,\n              \"uhd\": 12500000\n            }\n          },\n          \"SourceCCTK-Preview\": {\n            \"default\": {\n              \"hd\": 1100000,\n              \"sd\": 980000,\n              \"ld\": 480000,\n              \"uhd\": 11000000\n            }\n          },\n          \"SourceVoD-NoPreview\": {\n            \"default\": {\n              \"hd\": 500000,\n              \"sd\": 400000,\n              \"ld\": 300000,\n              \"uhd\": 2530000\n            }\n          },\n          \"SourceVoD-Preview\": {\n            \"default\": {\n              \"hd\": 500000,\n              \"sd\": 400000,\n              \"ld\": 300000,\n              \"uhd\": 2530000\n            }\n          }\n        },\n        \"Mode\": \"bottomline\"\n      },\n      \"JudgePipeline\": {\n        \"NoPreview\": [\n          \"High-Bwe\"\n        ],\n        \"Preview\": [\n          \"High-Bwe\"\n        ]\n      }\n    }\n  }\n}");
        LLIZ = enumC1486610omx2;
        LLIZLLLIL = new EnumC1486610omx[]{enumC1486610omx, enumC1486610omx2, new EnumC1486610omx("bandwidth", 2, "live_stream_strategy_bandwidth_estimator", enumC1486620omy, 0, false, "{\n  \"Enable\": 1,\n  \"EnableSmartStrategyConfig\": 0,\n  \"InputFeatureList\": [\n    \"PLAY-CCTKCongestionInfo\",\n    \"NETWORK-RecommendBitrate\",\n    \"PLAY-Bitrate\"\n  ],\n  \"InputSettingsParam\": {\n    \"CalculateEWMAFactor\": 0.5,\n    \"CalculateFunc\": 2,\n    \"CalculateSize\": 10,\n    \"LiveProtectedDuration\": 0,\n    \"MaxBandwidthSampleDuration\": 60,\n    \"MaxBwSampleSize\": 10,\n    \"MaxSessionSize\": 10,\n    \"MinBwEstimatorBitrate\": 0,\n    \"MinPlayedDurationThresh\": 0,\n    \"NetworkMatchMode\": 1,\n    \"OverallStrategy\": 1,\n    \"PriorityMap\": {\n      \"cctkBw\": 10000,\n      \"vodBitrate\": 100\n    },\n    \"RemoveSampleTimer\": 1,\n    \"UseWithAttributionImpl\": 1\n  }\n}")};
    }

    public static EnumC1486610omx[] values() {
        return (EnumC1486610omx[]) LLIZLLLIL.clone();
    }

    public static EnumC1486610omx valueOf(String str) {
        return (EnumC1486610omx) C08FF.LIZ(EnumC1486610omx.class, str);
    }

    public EnumC1486610omx(String str, int i, String str2, EnumC1486620omy enumC1486620omy, int i2, boolean z, String str3) {
        this.LL = str2;
        this.LLILLJJLI = enumC1486620omy;
        this.LLILLL = i2;
        this.LLILZ = z;
        this.LLILZIL = str3;
    }
}
