package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.adaptation.saa.fragment.TikTokSAARootFragmentGroupScene;

/* JADX INFO: renamed from: X.198U, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C198U extends C198W<TikTokSAARootFragmentGroupScene> implements ViewModelStoreOwner, InterfaceC1671500tbA {
    public final /* synthetic */ TikTokSAARootFragmentGroupScene LLILZIL;

    @Override // X.AnonymousClass1996, X.C19F6
    public final boolean LIZJ() {
        Window window;
        Activity activity = this.LL;
        return (activity == null || (window = activity.getWindow()) == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // X.AnonymousClass1996
    public final LayoutInflater LJIIIIZZ() {
        return this.LLILZIL.requireActivity().getLayoutInflater().cloneInContext(this.LLILZIL.requireActivity());
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL.LLJJIJIL;
    }

    @Override // X.InterfaceC1671500tbA
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.LLILZIL.LLJJJJ;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LLILZIL.getViewModelStore();
    }

    @Override // X.AnonymousClass1996
    public final /* bridge */ /* synthetic */ Object LJII() {
        return this.LLILZIL;
    }

    @Override // X.AnonymousClass1996, X.C19F6
    public final View LIZIZ(int i) {
        View view = this.LLILZIL.mView;
        if (view != null) {
            return view.findViewById(i);
        }
        return null;
    }

    @Override // X.AnonymousClass1996
    public final boolean LJIIJ(String str) {
        return C0VE9.LJIIJ(this.LLILZIL.requireActivity(), str);
    }

    @Override // X.AnonymousClass1996
    public final void LJIIIZ(final Fragment fragment, final String[] strArr, final int i) {
        C19EG c19eg = (C19EG) this.LLILZIL.requireActivity();
        final TikTokSAARootFragmentGroupScene tikTokSAARootFragmentGroupScene = this.LLILZIL;
        C12WM.LIZJ(c19eg, this, strArr, i, new C12WO() { // from class: X.198V
            @Override // X.C12WO
            public final void LIZ(int[] iArr) {
                tikTokSAARootFragmentGroupScene.LLLLJI().LIZJ();
                Fragment fragment2 = fragment;
                int i2 = i;
                String[] strArr2 = strArr;
                if (iArr == null) {
                    iArr = new int[0];
                }
                fragment2.onRequestPermissionsResult(i2, strArr2, iArr);
            }
        });
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198U(TikTokSAARootFragmentGroupScene tikTokSAARootFragmentGroupScene, Activity activity, Context context, BPEAHandler bPEAHandler) {
        super(activity, context, bPEAHandler);
        this.LLILZIL = tikTokSAARootFragmentGroupScene;
    }

    @Override // X.AnonymousClass1996
    public final void LJIIJJI(final Fragment fragment, Intent intent, final int i, Bundle bundle) {
        C19EG c19eg = (C19EG) this.LLILZIL.requireActivity();
        final TikTokSAARootFragmentGroupScene tikTokSAARootFragmentGroupScene = this.LLILZIL;
        C12WM.LIZLLL(c19eg, this, intent, i, bundle, new C12WN() { // from class: X.198T
            @Override // X.C12WN
            public final void onResult(int i2, Intent intent2) {
                tikTokSAARootFragmentGroupScene.LLLLJI().LIZJ();
                fragment.onActivityResult(i, i2, intent2);
            }
        });
    }
}
