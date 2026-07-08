package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.foundation.fragment.BaseFragment;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS324S0000000_35;
import kotlin.jvm.internal.AwS649S0100000_35;

/* JADX INFO: renamed from: X.1EK9, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1EK9 extends AbstractC813200VvC {
    public final CopyOnWriteArrayList<C1EKA> LL = new CopyOnWriteArrayList<>();

    @Override // X.AbstractC813200VvC
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        LIZ(fragment, true, new AwS324S0000000_35(fragmentManager, 18));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        LIZ(fragment, true, new AwS324S0000000_35(fragmentManager, 19));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        LIZ(fragment, true, new AwS324S0000000_35(fragmentManager, 20));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        LIZ(fragment, true, new AwS324S0000000_35(fragmentManager, 23));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        LIZ(fragment, true, new AwS324S0000000_35(fragmentManager, 25));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        LIZ(fragment, true, new AwS324S0000000_35(fragmentManager, 26));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        LIZ(fragment, true, new AwS324S0000000_35(fragmentManager, 27));
    }

    public final void LIZ(Fragment fragment, boolean z, Function2<? super C1EKA, ? super BaseFragment, Unit> function2) {
        BaseFragment baseFragment;
        if ((fragment instanceof BaseFragment) && (baseFragment = (BaseFragment) fragment) != null) {
            Iterator<C1EKA> it2 = this.LL.iterator();
            while (it2.hasNext()) {
                function2.invoke(it2.next(), baseFragment);
            }
            if (z) {
                Iterator it3 = ((List) baseFragment.PR().vQ2().LIZ.getValue()).iterator();
                while (it3.hasNext()) {
                    function2.invoke(it3.next(), baseFragment);
                }
            }
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentActivityCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        LIZ(fragment, true, new AwS324S0000000_35(bundle, fragmentManager, 15));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        LIZ(fragment, true, new AwS324S0000000_35(context, fragmentManager, 16));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        LIZ(fragment, true, new AwS324S0000000_35(bundle, fragmentManager, 17));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentPreAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        LIZ(fragment, false, new AwS324S0000000_35(context, fragmentManager, 21));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentPreCreated(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        LIZ(fragment, true, new AwS324S0000000_35(bundle, fragmentManager, 22));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentSaveInstanceState(FragmentManager fragmentManager, Fragment fragment, Bundle bundle) {
        LIZ(fragment, true, new AwS324S0000000_35(bundle, fragmentManager, 24));
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        LIZ(fragment, true, new AwS649S0100000_35(bundle, view, fragmentManager, 22));
    }
}
