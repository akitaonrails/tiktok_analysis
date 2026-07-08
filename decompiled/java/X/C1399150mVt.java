package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;

/* JADX INFO: renamed from: X.0mVt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399150mVt {
    public static void LIZ(Context context, ProgressDialogC1399760mWs progressDialogC1399760mWs) {
        progressDialogC1399760mWs.setCancelable(false);
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && C1893760zNe.LIZ(activityLIZ, true) && !activityLIZ.isFinishing()) {
            C1391850mK7.LIZIZ(progressDialogC1399760mWs, "music_loading_dialog");
            progressDialogC1399760mWs.show();
            C785410UrT.LIZIZ(progressDialogC1399760mWs);
            PopupMonitorServiceImpl.LIZ.getClass();
            PopupMonitorServiceImpl.LJJJ(progressDialogC1399760mWs);
            C816490W1f.LIZ(progressDialogC1399760mWs);
        }
    }

    public static ProgressDialogC1399760mWs LIZIZ(Context context, EnumC1399740mWq enumC1399740mWq, InterfaceC1399770mWt interfaceC1399770mWt) {
        ProgressDialogC1399760mWs progressDialogC1399760mWs = new ProgressDialogC1399760mWs(context, enumC1399740mWq, 0);
        progressDialogC1399760mWs.LLIZLLLIL = interfaceC1399770mWt;
        LIZ(context, progressDialogC1399760mWs);
        return progressDialogC1399760mWs;
    }
}
