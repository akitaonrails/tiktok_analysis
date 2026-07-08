package X;

import com.ss.android.ugc.aweme.experiment.consumption.PerformanceParamsWithRequestConfig;

/* JADX INFO: renamed from: X.1DCY, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DCY {
    public static final PerformanceParamsWithRequestConfig LIZ = new PerformanceParamsWithRequestConfig(true, true, true, true, true, true, true, true, false, true, true, false, true, true, true, true, true, true, true);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C2251951DCf());
    public static final boolean LIZJ = LIZ().enable_stream_music_volume;
    public static final boolean LIZLLL = LIZ().enable_battery_pct;
    public static final boolean LJ = LIZ().enable_is_charge;
    public static final boolean LJFF = LIZ().enable_data_save_mode;
    public static final boolean LJI = LIZ().enable_low_power_mode;
    public static final boolean LJII = LIZ().enable_net_connect_type;
    public static final boolean LJIIIIZZ = LIZ().enable_mem_avail;
    public static final boolean LJIIIZ = LIZ().enable_cpu_usage;
    public static final boolean LJIIJ;
    public static final boolean LJIIJJI;
    public static final boolean LJIIL;
    public static final boolean LJIILIIL;
    public static final boolean LJIILJJIL;
    public static final boolean LJIILL;
    public static final boolean LJIILLIIL;
    public static final boolean LJIIZILJ;
    public static final boolean LJIJ;

    static {
        LIZ();
        LJIIJ = LIZ().enable_battery_temperature;
        LJIIJJI = LIZ().enable_har_predict;
        LIZ();
        LJIIL = LIZ().enable_start_playing_timestamp;
        LJIILIIL = LIZ().enable_first_frame_duration;
        LJIILJJIL = LIZ().enable_block_count;
        LJIILL = LIZ().enable_block_duration;
        LJIILLIIL = LIZ().enable_video_bitrate;
        LJIIZILJ = LIZ().enable_video_resolution;
        LJIJ = LIZ().enable_is_bytevc1;
    }

    public static PerformanceParamsWithRequestConfig LIZ() {
        return (PerformanceParamsWithRequestConfig) LIZIZ.getValue();
    }
}
