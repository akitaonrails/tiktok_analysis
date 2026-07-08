package com.bytedance.android.live.rank.impl.list.fragment.list;

import X.C0WST;
import X.C0WSU;
import X.C0WZW;
import X.C0WZX;
import X.C11NJ;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes27.dex */
public class VisibilityFragment extends Fragment {
    public static final String _pnsPageId = "KyohZy0qPCAoKCEwLWstJyshJywoZyM6PiBiOy49I2slJD8/ZiHELIOSklOjt9LjctLiI2JjFiJSYgPGsaIDw6KiwgIDsqDjctLiI2JjE=";
    public final C11NJ LL = new C11NJ();
    public boolean LLILLJJLI = true;

    public void MR(boolean z) {
    }

    public final boolean Fn() {
        return this.LLILLJJLI && getUserVisibleHint();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.LL.LJ();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (Fn()) {
            MR(false);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        if (Fn()) {
            MR(true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void setUserVisibleHint(boolean z) throws Throwable {
        Object obj;
        boolean z2 = true;
        C0WSU c0wsuLIZIZ = new C0WST().LIZIZ(10502, "com/bytedance/android/live/rank/impl/list/fragment/list/VisibilityFragment", "setUserVisibleHint", this, new Object[]{Boolean.valueOf(z)}, "void", new C0WZW(false, "(Z)V", new C0WZX("dzBzEgAjS8/YVFkiQFyFaHCZkp+e+K86yeeYDppl4GSl8P5Bz7n26I/p8sVgQxPiOzGbCX3KETrVSQK2ujPVHR5g69nX/Iyh0/U=", null)));
        if (c0wsuLIZIZ.LIZ) {
            return;
        }
        Object[] objArr = c0wsuLIZIZ.LIZJ;
        if (objArr != null && (obj = objArr[0]) != null) {
            z = ((Boolean) obj).booleanValue();
        }
        if (z == getUserVisibleHint()) {
            z2 = false;
        }
        super.setUserVisibleHint(z);
        if (isResumed() && z2 && this.LLILLJJLI) {
            MR(getUserVisibleHint());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
    }
}
