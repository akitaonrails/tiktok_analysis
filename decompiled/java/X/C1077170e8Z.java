package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ss.android.ugc.aweme.inbox.InboxShellFragment;

/* JADX INFO: renamed from: X.0e8Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1077170e8Z extends AbstractC813200VvC {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC813200VvC
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        if (1 - this.$t != 0) {
            super.onFragmentResumed(fragmentManager, fragment);
        } else {
            onFragmentResumed$0(this, fragmentManager, fragment);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        if (this.$t != 0) {
            super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        } else {
            onFragmentViewCreated$0(this, fragmentManager, fragment, view, bundle);
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        if (this.$t != 0) {
            super.onFragmentViewDestroyed(fragmentManager, fragment);
        } else {
            onFragmentViewDestroyed$0(this, fragmentManager, fragment);
        }
    }

    public C1077170e8Z(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onFragmentResumed$0(C1077170e8Z c1077170e8Z, FragmentManager fragmentManager, Fragment fragment) {
        ((InboxShellFragment) c1077170e8Z.l0).getChildFragmentManager().LLIILZL(c1077170e8Z);
        ((InboxShellFragment) c1077170e8Z.l0).MR();
    }

    public static final void onFragmentViewDestroyed$0(C1077170e8Z c1077170e8Z, FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        ((InterfaceC856250XiR) c1077170e8Z.l0).LIZJ();
    }

    public static final void onFragmentViewCreated$0(C1077170e8Z c1077170e8Z, FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        super.onFragmentViewCreated(fragmentManager, fragment, view, bundle);
        ((InterfaceC856250XiR) c1077170e8Z.l0).onViewCreated(view, bundle);
    }
}
