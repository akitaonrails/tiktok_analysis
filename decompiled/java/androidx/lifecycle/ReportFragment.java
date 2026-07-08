package androidx.lifecycle;

import X.C1565730qqZ;
import X.EnumC682280QpW;
import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Build;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes33.dex */
public class ReportFragment extends Fragment {
    public static final Companion Companion = new Companion();
    public static final String _pnsPageId = "KSsoOyA6LD1iJSY1LSY1KiHELIOSM2ZhcpOSAhPAM+KCg+LSs4";
    public ActivityInitializationListener processListener;

    public interface ActivityInitializationListener {
        void onCreate();

        void onResume();

        void onStart();
    }

    public static final ReportFragment get(Activity activity) {
        return Companion.get(activity);
    }

    public static final void injectIfNeededIn(Activity activity) {
        Companion.injectIfNeededIn(activity);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        dispatch(Lifecycle.Event.ON_DESTROY);
        this.processListener = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
        dispatch(Lifecycle.Event.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        dispatchResume(this.processListener);
        dispatch(Lifecycle.Event.ON_RESUME);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        dispatchStart(this.processListener);
        dispatch(Lifecycle.Event.ON_START);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
        dispatch(Lifecycle.Event.ON_STOP);
    }

    public static final class LifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public static final Companion Companion = new Companion();

        public static final void registerIn(Activity activity) {
            Companion.registerIn(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(Activity activity) {
        }

        public static final class Companion {
            public final void registerIn(Activity activity) {
                activity.registerActivityLifecycleCallbacks(new LifecycleCallbacks());
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostResumed(Activity activity) {
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_RESUME);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostStarted(Activity activity) {
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_START);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreDestroyed(Activity activity) {
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_DESTROY);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPrePaused(Activity activity) {
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_PAUSE);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreStopped(Activity activity) {
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_STOP);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPostCreated(Activity activity, Bundle bundle) {
            ReportFragment.Companion.dispatch$lifecycle_runtime_release(activity, Lifecycle.Event.ON_CREATE);
        }
    }

    public static final class Companion {
        public static /* synthetic */ void get$annotations(Activity activity) {
        }

        public final void dispatch$lifecycle_runtime_release(Activity activity, Lifecycle.Event event) {
            androidx_lifecycle_ReportFragment$Companion_com_ss_android_ugc_aweme_main_lancet_KtSafLancet_hookReportFragmentDispatch(this, activity, event);
        }

        public final ReportFragment get(Activity activity) {
            return (ReportFragment) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag");
        }

        public final void injectIfNeededIn(Activity activity) {
            if (Build.VERSION.SDK_INT >= 29) {
                LifecycleCallbacks.Companion.registerIn(activity);
            }
            FragmentManager fragmentManager = activity.getFragmentManager();
            if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
                fragmentManager.beginTransaction().add(new ReportFragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
                fragmentManager.executePendingTransactions();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final void androidx_lifecycle_ReportFragment$Companion__dispatch$lifecycle_runtime_release$___twin___(Activity activity, Lifecycle.Event event) {
            if (activity instanceof LifecycleRegistryOwner) {
                ((LifecycleRegistryOwner) activity).getLifecycle().handleLifecycleEvent(event);
            } else if (activity instanceof LifecycleOwner) {
                Lifecycle lifecycle = ((LifecycleOwner) activity).getLifecycle();
                if (lifecycle instanceof LifecycleRegistry) {
                    ((LifecycleRegistry) lifecycle).handleLifecycleEvent(event);
                }
            }
        }

        public static void androidx_lifecycle_ReportFragment$Companion_com_ss_android_ugc_aweme_main_lancet_KtSafLancet_hookReportFragmentDispatch(Companion companion, Activity activity, Lifecycle.Event event) {
            Integer numLIZ = C1565730qqZ.LIZ(EnumC682280QpW.MAIN.getValue(), activity);
            companion.androidx_lifecycle_ReportFragment$Companion__dispatch$lifecycle_runtime_release$___twin___(activity, event);
            if (numLIZ != null) {
                C1565730qqZ.LIZIZ(numLIZ.intValue(), activity);
            }
        }
    }

    private final void dispatch(Lifecycle.Event event) {
        if (Build.VERSION.SDK_INT < 29) {
            Companion.dispatch$lifecycle_runtime_release(getActivity(), event);
        }
    }

    private final void dispatchCreate(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onCreate();
        }
    }

    private final void dispatchResume(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onResume();
        }
    }

    private final void dispatchStart(ActivityInitializationListener activityInitializationListener) {
        if (activityInitializationListener != null) {
            activityInitializationListener.onStart();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        dispatchCreate(this.processListener);
        dispatch(Lifecycle.Event.ON_CREATE);
    }

    public final void setProcessListener(ActivityInitializationListener activityInitializationListener) {
        this.processListener = activityInitializationListener;
    }
}
