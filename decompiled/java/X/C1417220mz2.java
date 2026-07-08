package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0mz2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1417220mz2 {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_autocut_switch_pop_clear_tools", true) == 1;
    }

    public static boolean LIZJ() {
        return C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_autocut_switch_pop_preview", true) == 1;
    }

    public static boolean LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel != null && C1417210mz1.LIZJ(videoPublishEditModel)) {
            return C1417210mz1.LIZIZ(videoPublishEditModel);
        }
        if (C0C64.LJIILLIIL().LJIJ(31744, 0, "studio_autocut_switch_pop", true) != 1) {
            return false;
        }
        return true;
    }
}
