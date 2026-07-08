package X;

import com.bytedance.ies.foundation.fragment.BaseFragment;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.19DG, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public abstract class C19DG extends C19DE {
    public WeakReference<BaseFragment> LLILLJJLI;

    @Override // X.C19DE, X.C1EKA
    public final void LJI() {
        this.LLILLJJLI = null;
    }

    @Override // X.C19DE, X.C1EKA
    public final void LJIIIIZZ(BaseFragment baseFragment) {
        if (baseFragment != null) {
            this.LLILLJJLI = new WeakReference<>(baseFragment);
        }
    }
}
