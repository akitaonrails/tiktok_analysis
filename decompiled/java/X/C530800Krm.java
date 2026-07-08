package X;

import android.app.Activity;
import android.view.View;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;

/* JADX INFO: renamed from: X.0Krm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C530800Krm {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZ(boolean z) {
        String str;
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("use_max_include_time", false)) {
            return false;
        }
        Keva repo = Keva.getRepo("repo_cur_video_page_i18n");
        if (z) {
            str = "multi_video_drag_showed";
        } else {
            str = "single_video_drag_showed";
        }
        return !repo.getBoolean(str, false);
    }

    public static void LIZIZ(Activity activity, View view, boolean z) {
        String str;
        if (z) {
            str = "multi_video_drag_showed";
        } else {
            str = "single_video_drag_showed";
        }
        Keva.getRepo("repo_cur_video_page_i18n").storeBoolean(str, true);
        C450720Hlu c450720Hlu = new C450720Hlu(activity);
        c450720Hlu.LLILZ = activity.getString(2131836892, Long.valueOf(C530010KqV.LIZ() / 60000));
        C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
        c1391600mJi.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
        c1391600mJi.LIZIZ = view;
        c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
        c450720Hlu.LIZIZ().show();
    }
}
