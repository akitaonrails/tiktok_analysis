package X;

import android.app.Activity;
import android.content.Context;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mX3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1399870mX3 {
    public static ProgressDialogC1399830mWz LIZ(C1399880mX4 c1399880mX4) {
        ProgressDialogC1399830mWz progressDialogC1399830mWz;
        String str = c1399880mX4.LIZLLL;
        if (Intrinsics.LJFF(str, "no_cancel")) {
            Context context = c1399880mX4.LIZ;
            progressDialogC1399830mWz = new ProgressDialogC1399830mWz(c1399880mX4.LIZ, R.style.f943aa3, EnumC1399900mX6.GONE);
            progressDialogC1399830mWz.setCancelable(false);
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (!activity.isFinishing() && !activity.isDestroyed()) {
                    progressDialogC1399830mWz.show();
                    C785410UrT.LIZIZ(progressDialogC1399830mWz);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(progressDialogC1399830mWz);
                    C816490W1f.LIZ(progressDialogC1399830mWz);
                }
            }
        } else if (Intrinsics.LJFF(str, "has_cancel") && c1399880mX4.LIZJ != null) {
            Context context2 = c1399880mX4.LIZ;
            progressDialogC1399830mWz = new ProgressDialogC1399830mWz(c1399880mX4.LIZ, R.style.f943aa3, c1399880mX4.LIZIZ);
            progressDialogC1399830mWz.LLIZLLLIL = c1399880mX4.LIZJ;
            progressDialogC1399830mWz.setCancelable(false);
            if (context2 instanceof Activity) {
                Activity activity2 = (Activity) context2;
                if (C1893760zNe.LIZ(activity2, false) && !activity2.isFinishing()) {
                    progressDialogC1399830mWz.show();
                    C785410UrT.LIZIZ(progressDialogC1399830mWz);
                    PopupMonitorServiceImpl.LIZ.getClass();
                    PopupMonitorServiceImpl.LJJJ(progressDialogC1399830mWz);
                    C816490W1f.LIZ(progressDialogC1399830mWz);
                    return progressDialogC1399830mWz;
                }
            }
        } else {
            return null;
        }
        return progressDialogC1399830mWz;
    }
}
