package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.airemix.api.service.AIRemixLaunchParam;

/* JADX INFO: renamed from: X.0M6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C563130M6t {
    public static final AIRemixLaunchParam LIZ(Bundle bundle) {
        if (bundle != null) {
            return (AIRemixLaunchParam) bundle.getParcelable("key_launch_param");
        }
        return null;
    }

    public static final AIRemixLaunchParam LIZIZ(Fragment fragment) {
        Bundle arguments;
        if (fragment != null) {
            arguments = fragment.getArguments();
        } else {
            arguments = null;
        }
        return LIZ(arguments);
    }
}
