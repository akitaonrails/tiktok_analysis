package X;

import com.ss.android.ugc.aweme.experiment.FeedAdaptionRefactorSettingsConfig;

/* JADX INFO: renamed from: X.15d9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20562515d9 {
    public static final FeedAdaptionRefactorSettingsConfig LIZ = new FeedAdaptionRefactorSettingsConfig(false, false, 0.2f, false, false, false, false, false, false, false, false);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C20562415d8());
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;
    public static final boolean LJFF;
    public static final boolean LJI;

    static {
        LIZ();
        LIZJ = LIZ().enable_move_up_listener_out;
        LIZLLL = LIZ().enable_trace_cover_view;
        LJ = LIZ().enable_container_offset_set_trans;
        LIZ();
        LJFF = LIZ().enable_log_string_opt;
        LJI = LIZ().enable_first_cell_init_adaption;
    }

    public static FeedAdaptionRefactorSettingsConfig LIZ() {
        return (FeedAdaptionRefactorSettingsConfig) LIZIZ.getValue();
    }
}
