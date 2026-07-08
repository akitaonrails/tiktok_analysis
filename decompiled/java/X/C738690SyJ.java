package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelStore;

/* JADX INFO: renamed from: X.0SyJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public class C738690SyJ extends AbstractC813200VvC {
    public final int $t;
    public Object l0;

    @Override // X.AbstractC813200VvC
    public final void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        switch (this.$t) {
            case 0:
                onFragmentDestroyed$0(this, fragmentManager, fragment);
                break;
            case 1:
                onFragmentDestroyed$1(this, fragmentManager, fragment);
                break;
            case 2:
                onFragmentDestroyed$2(this, fragmentManager, fragment);
                break;
            default:
                super.onFragmentDestroyed(fragmentManager, fragment);
                break;
        }
    }

    public C738690SyJ(ViewModelStore viewModelStore, int i) {
        this.$t = i;
        this.l0 = viewModelStore;
    }

    public static final void onFragmentDestroyed$0(C738690SyJ c738690SyJ, FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDestroyed(fragmentManager, fragment);
        ((ViewModelStore) c738690SyJ.l0).clear();
    }

    public static final void onFragmentDestroyed$1(C738690SyJ c738690SyJ, FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDestroyed(fragmentManager, fragment);
        ((ViewModelStore) c738690SyJ.l0).clear();
    }

    public static final void onFragmentDestroyed$2(C738690SyJ c738690SyJ, FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentDestroyed(fragmentManager, fragment);
        ((ViewModelStore) c738690SyJ.l0).clear();
    }
}
