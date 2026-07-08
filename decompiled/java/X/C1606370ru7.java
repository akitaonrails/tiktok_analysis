package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.detail.ui.saf.DetailSafRootFragment;
import com.ss.android.ugc.aweme.feed.param.DetailNavArgModel;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: X.0ru7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1606370ru7 {
    public static final C1606370ru7 LIZ = new C1606370ru7();

    public static FragmentManager LIZ(Fragment fragment) {
        if (C294700Bgq.LIZ()) {
            Object objLIZJ = C487580JAe.LIZJ(fragment);
            if ((objLIZJ instanceof DetailSafRootFragment) && LIZLLL((Fragment) objLIZJ)) {
                return ((Fragment) objLIZJ).getChildFragmentManager();
            }
            return null;
        }
        return null;
    }

    public static final Fragment LIZIZ(Fragment fragment) {
        if (C294700Bgq.LIZ()) {
            Object objLIZJ = C487580JAe.LIZJ(fragment);
            if (objLIZJ instanceof DetailSafRootFragment) {
                Fragment fragment2 = (Fragment) objLIZJ;
                LIZ.getClass();
                if (LIZLLL(fragment2)) {
                    return fragment2;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final boolean LIZJ(Activity activity) {
        Intent intent;
        if (!C294700Bgq.LIZ()) {
            return false;
        }
        LIZ.getClass();
        if (activity == null || (intent = activity.getIntent()) == null || intent.getIntExtra("use_saf", 0) < 1) {
            return false;
        }
        return true;
    }

    public static boolean LIZLLL(Fragment fragment) {
        Bundle arguments;
        if (fragment == null || (arguments = fragment.getArguments()) == null || arguments.getInt("use_saf") < 1) {
            return false;
        }
        return true;
    }

    public static final DetailNavArgModel LJ(Intent intent) {
        Bundle extras;
        Object obj = null;
        try {
            Method method = DetailNavArgModel.class.getMethod("__fromBundle", Bundle.class);
            Object[] objArr = new Object[1];
            try {
                extras = intent.getExtras();
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                extras = null;
            }
            objArr[0] = extras;
            Object objInvoke = method.invoke(null, objArr);
            if (!(objInvoke instanceof DetailNavArgModel)) {
                return null;
            }
            return (DetailNavArgModel) objInvoke;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj = c098200Yq;
            }
            return (DetailNavArgModel) obj;
        }
    }

    public static final Intent LJFF(Fragment fragment) {
        Intent intent;
        if (C294700Bgq.LIZ()) {
            Object objLIZJ = C487580JAe.LIZJ(fragment);
            if (objLIZJ instanceof DetailSafRootFragment) {
                LIZ.getClass();
                if (LIZLLL((Fragment) objLIZJ)) {
                    Intent intent2 = new Intent();
                    Bundle arguments = ((Fragment) objLIZJ).getArguments();
                    if (arguments != null) {
                        intent2.putExtras(arguments);
                    }
                    return intent2;
                }
            }
        }
        C19EG activity = fragment.getActivity();
        if (activity == null || (intent = activity.getIntent()) == null) {
            return new Intent();
        }
        return intent;
    }
}
