package X;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.foundation.activity.BaseActivity;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.profile.business.profile.background.ProfileBgVideoListActivity;

/* JADX INFO: renamed from: X.0Hu7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C455810Hu7 {
    public static void LIZIZ(BaseActivity baseActivity) {
        Intent intent = new Intent(baseActivity, (Class<?>) ProfileBgVideoListActivity.class);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(baseActivity, intent, "Activity_startActivityForResult_2");
        C1701330uNH.LIZ(intent, baseActivity);
        C2204961BRm.LJIIZILJ(2002, baseActivity, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkBRrqLwSJLa+uAZs9Z/Y3ig7uX5mXjpWgHW0v6FOF7IbSj0PSV", null));
    }

    public static void LIZ(int i, Fragment fragment) {
        Context context = fragment.getContext();
        if (context == null) {
            return;
        }
        Intent intent = new Intent(context, (Class<?>) ProfileBgVideoListActivity.class);
        C1701330uNH.LIZ(intent, fragment);
        C2204961BRm.LLJL(fragment, intent, i, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF2grc2E6au/mYYrd1TyhAn5vpjsCmOQvxKkBRrqLwSJLa+uAZs9Z/Y3ig7uX5mXjpWgHW0v6FOF7IbSj0PSV", null));
    }
}
