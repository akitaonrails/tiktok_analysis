package X;

import Y.ARunnableS112S0100000_12;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.uikit.base.AbsFragment;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0T0w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC739960T0w extends AbstractC739950T0v {
    public boolean mUserVisibleHint;

    public abstract void initPanel();

    public boolean isRegisterEventBus() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onViewCreated$0() {
        C1C7U.LIZ("FragmentPanel@8fc4.onViewCreated$1L");
        if (isRegisterEventBus()) {
            EventBus.LIZLLL().LJIJJ(this);
        }
        C1C7U.LIZIZ("FragmentPanel@8fc4.onViewCreated$1L");
    }

    public Bundle getArguments() {
        Fragment fragment = getFragment();
        if (fragment == null) {
            return null;
        }
        return fragment.getArguments();
    }

    public FragmentManager getChildFragmentManager() {
        Fragment fragment = getFragment();
        if (fragment == null) {
            return null;
        }
        return fragment.getChildFragmentManager();
    }

    public boolean isActive() {
        AbsFragment absFragment = (AbsFragment) getFragment();
        return absFragment != null && absFragment.isActive();
    }

    public boolean isResumed() {
        Fragment fragment = getFragment();
        return fragment != null && fragment.isResumed();
    }

    public boolean isViewValid() {
        AbsFragment absFragment = (AbsFragment) getFragment();
        return absFragment != null && absFragment.isViewValid();
    }

    @Override // X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public void onDestroyView() {
        super.onDestroyView();
        if (isRegisterEventBus()) {
            EventBus.LIZLLL().LJJI(this);
        }
    }

    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Override // X.AbstractC739950T0v
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void setUserVisibleHint(boolean z) {
        this.mUserVisibleHint = z;
    }

    @Override // X.AbstractC739950T0v, X.InterfaceC1581960rGk
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        long j = C739650Szr.LIZ;
        if (j != -1 && C739650Szr.LIZIZ) {
            C0CN5.LIZJ(Long.valueOf(j), new ARunnableS112S0100000_12(this, 341), false);
        } else {
            if (!isRegisterEventBus()) {
                return;
            }
            EventBus.LIZLLL().LJIJJ(this);
        }
    }
}
