package X;

import android.app.Activity;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.mediachoose.helper.MediaModel;
import com.ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import java.util.Arrays;
import java.util.Locale;

/* JADX INFO: renamed from: X.12VL, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12VL {
    public static final long LIZ;
    public static final int LIZIZ;
    public static final int LIZJ;
    public static final int LIZLLL;
    public static final int LJ;

    static {
        SettingsManager.LIZLLL().getClass();
        LIZ = ((long) SettingsManager.LJ("ttk_upload_video_selectable_max_seconds", 3600)) * 1000;
        LIZIZ = C366700EZg.LIZ(56.0d);
        LIZJ = C366700EZg.LIZ(60.0d);
        LIZLLL = C366700EZg.LIZ(30.0d);
        LJ = C366700EZg.LIZ(35.0d);
    }

    public static final long LIZJ() {
        if (C523660KgG.LIZ()) {
            return Math.min(C530010KqV.LIZ(), LIZ);
        }
        if (C1446440nkA.LIZ() || C0CHQ.LIZ().getBridgeService().LJII()) {
            return C578000Mli.LIZ();
        }
        return 15000L;
    }

    public static final MediaModel LIZ(String str, CutMultiVideoViewModel cutMultiVideoViewModel) {
        if (cutMultiVideoViewModel.LLJILJIL) {
            MediaModel mediaModel = new MediaModel(-1L);
            mediaModel.LJIILL(str);
            mediaModel.width = 720;
            mediaModel.height = 1280;
            mediaModel.duration = cutMultiVideoViewModel.LLJILJILJ;
            return mediaModel;
        }
        return C574480Mg2.LIZ(str);
    }

    public static String LIZIZ(Activity activity, float f, boolean z) {
        if (!z && C523660KgG.LIZ() && f > 60.0f) {
            int i = (int) f;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i / 60)}, 1)));
            sbLIZ.append(':');
            sbLIZ.append(C786410Ut5.k4(Locale.getDefault(), "%02d", Arrays.copyOf(new Object[]{Integer.valueOf(i % 60)}, 1)));
            return activity.getString(2131836893, C2188811AlT.LIZIZ(sbLIZ));
        }
        return activity.getResources().getString(2131837618, C786410Ut5.k4(Locale.getDefault(), "%.1f", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1)));
    }
}
