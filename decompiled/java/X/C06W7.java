package X;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProviders;

/* JADX INFO: renamed from: X.06W7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06W7 {
    public static final boolean LIZIZ(Context context) {
        if (context == null) {
            return false;
        }
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null && (activityLIZ.isDestroyed() || activityLIZ.isFinishing())) {
            return false;
        }
        return true;
    }

    public static final ViewModel LIZ(C19EG c19eg, Class cls) {
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(c19eg);
        if (c19egLIZIZ != null) {
            return ViewModelProviders.of(c19egLIZIZ).get(cls);
        }
        return null;
    }
}
