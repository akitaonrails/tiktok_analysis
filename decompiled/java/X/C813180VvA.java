package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0VvA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C813180VvA {
    public static final C813170Vv9 LIZ = new AbstractC813150Vv7() { // from class: X.0Vv9
        @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            if (activity instanceof C19EG) {
                ((C19EG) activity).getSupportFragmentManager().LLIILZL(C813180VvA.LIZIZ);
            }
        }

        @Override // X.AbstractC813150Vv7, android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            if (activity instanceof C19EG) {
                ((C19EG) activity).getSupportFragmentManager().LJZL(C813180VvA.LIZIZ, true);
            }
        }
    };
    public static final C813190VvB LIZIZ = new AbstractC813200VvC() { // from class: X.0VvB
        @Override // X.AbstractC813200VvC
        public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentDestroyed(fragmentManager, fragment);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentDetached(fragmentManager, fragment);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentPaused(fragmentManager, fragment);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentResumed(fragmentManager, fragment);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentStarted(fragmentManager, fragment);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentStopped(fragmentManager, fragment);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentViewDestroyed(fragmentManager, fragment);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentActivityCreated(fragmentManager, fragment, bundle);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentAttached(fragmentManager, fragment, context);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentCreated(fragmentManager, fragment, bundle);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentPreAttached(fragmentManager, fragment, context);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentPreCreated(fragmentManager, fragment, bundle);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentSaveInstanceState(fragmentManager, fragment, bundle);
            }
        }

        @Override // X.AbstractC813200VvC
        public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
            Iterator<T> it2 = C813180VvA.LIZJ.iterator();
            while (it2.hasNext()) {
                ((AbstractC813200VvC) it2.next()).onFragmentViewCreated(fragmentManager, fragment, view, bundle);
            }
        }
    };
    public static final Set<AbstractC813200VvC> LIZJ = Collections.newSetFromMap(new ConcurrentHashMap());
}
