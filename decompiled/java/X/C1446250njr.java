package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import java.util.List;

/* JADX INFO: renamed from: X.0njr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446250njr {
    public static final C1446250njr LIZ = new C1446250njr();
    public static long LIZIZ;

    public static void LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (videoPublishEditModel == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModel.getCreationId());
        c2344009Gk.LJIIIIZZ("shoot_way", videoPublishEditModel.mShootWay);
        c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
        c2344009Gk.LJIIIIZZ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("change_background_color", c2344009Gk.LIZ);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        if (videoPublishEditModel == null || !C1428470nHB.LLIIIJ(videoPublishEditModel)) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModel.getCreationId());
        c2344009Gk.LJIIIIZZ("shoot_way", videoPublishEditModel.mShootWay);
        c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
        c2344009Gk.LJIIIIZZ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c2344009Gk.LIZJ(!TextUtils.isEmpty(str) ? 1 : 0, "is_text_added");
        c2344009Gk.LIZJ(str.length(), "input_text_length");
        c2344009Gk.LIZLLL(SystemClock.elapsedRealtime() - LIZIZ, "page_stay_time");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("leave_text_mode_input_page", c2344009Gk.LIZ);
    }

    public static void LIZJ(VideoPublishEditModel videoPublishEditModel, boolean z, String str, int i) {
        if (videoPublishEditModel == null) {
            return;
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("creation_id", videoPublishEditModel.getCreationId());
        c2344009Gk.LJIIIIZZ("shoot_way", videoPublishEditModel.mShootWay);
        c2344009Gk.LJIIIIZZ("enter_method", str);
        c2344009Gk.LJIIIIZZ("text_mode_enter_method", str);
        c2344009Gk.LJIIIIZZ("enter_from", "video_edit_page");
        c2344009Gk.LJIIIIZZ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        c2344009Gk.LIZJ(z ? 1 : 0, "is_text_added");
        c2344009Gk.LIZJ(i, "input_text_length");
        List<InterfaceC2342209Fs> list = C2341909Fp.LIZ;
        C2341909Fp.LIZ("text_mode_input_complete", c2344009Gk.LIZ);
    }
}
