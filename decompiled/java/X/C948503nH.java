package X;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03nH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C948503nH {
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[PHI: r1
      0x0021: PHI (r1v6 androidx.lifecycle.LifecycleOwner) = (r1v5 androidx.lifecycle.LifecycleOwner), (r1v9 androidx.lifecycle.LifecycleOwner) binds: [B:5:0x000f, B:9:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final androidx.lifecycle.LifecycleOwner LIZ(android.view.View r3) {
        /*
            r2 = 2131368321(0x7f0a1981, float:1.8356589E38)
            java.lang.Object r1 = r3.getTag(r2)
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            if (r1 != 0) goto L24
            androidx.fragment.app.Fragment r1 = X.C946803n0.LIZ(r3)
            if (r1 != 0) goto L21
            android.content.Context r0 = r3.getContext()
            android.app.Activity r1 = X.C1388190mED.LIZ(r0)
            boolean r0 = r1 instanceof androidx.lifecycle.LifecycleOwner
            if (r0 == 0) goto L2f
            androidx.lifecycle.LifecycleOwner r1 = (androidx.lifecycle.LifecycleOwner) r1
            if (r1 == 0) goto L24
        L21:
            r3.setTag(r2, r1)
        L24:
            boolean r0 = r1 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L2e
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.lifecycle.LifecycleOwner r1 = LIZIZ(r1)
        L2e:
            return r1
        L2f:
            r1 = 0
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C948503nH.LIZ(android.view.View):androidx.lifecycle.LifecycleOwner");
    }

    public static final LifecycleOwner LIZIZ(Fragment fragment) {
        if (fragment.getView() != null) {
            return fragment.getViewLifecycleOwner();
        }
        return fragment;
    }

    public static final boolean LIZJ(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner.getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0) {
            return true;
        }
        return false;
    }

    public static final <T> MutableLiveData<T> LJIIL(T t) {
        MutableLiveData<T> mutableLiveData = new MutableLiveData<>();
        mutableLiveData.setValue(t);
        return mutableLiveData;
    }

    public static AnonymousClass0956 LJII(View view, Function2 function2) {
        C1DFH c1dfh = C0PEM.LIZ;
        return LIZLLL(view, C2107308Nj.LIZ.LLIILII(), function2);
    }

    public static AnonymousClass0956 LJIIIIZZ(Fragment fragment, Function2 function2) {
        return LJ(LIZIZ(fragment), C23271099x.INSTANCE, function2);
    }

    public static final AnonymousClass0956 LIZLLL(View view, CoroutineContext coroutineContext, Function2 function2) {
        InterfaceC497601wk lifecycleScope;
        LifecycleOwner lifecycleOwnerLIZ = LIZ(view);
        if (lifecycleOwnerLIZ == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwnerLIZ)) == null) {
            lifecycleScope = C817503Hh.LL;
        }
        return C23250099c.LIZLLL(lifecycleScope, coroutineContext, null, function2, 2);
    }

    public static final AnonymousClass0956 LJ(LifecycleOwner lifecycleOwner, CoroutineContext coroutineContext, Function2 function2) {
        return C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(lifecycleOwner), coroutineContext, null, function2, 2);
    }

    public static final AnonymousClass0956 LJFF(ViewModel viewModel, CoroutineContext coroutineContext, Function2 function2) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(viewModel), coroutineContext, null, function2, 2);
    }

    public static final AnonymousClass0956 LJI(AssemViewModel assemViewModel, CoroutineContext coroutineContext, Function2 function2) {
        return C23250099c.LIZLLL(ViewModelKt.getViewModelScope(assemViewModel), coroutineContext, null, function2, 2);
    }

    public static void LJIILIIL(final View view, final LifecycleOwner lifecycleOwner, final InterfaceC1631620sYq interfaceC1631620sYq, int i) {
        final int i2;
        if ((i & 1) != 0) {
            lifecycleOwner = LIZ(view);
        }
        if ((i & 2) != 0) {
            i2 = OppoPermissionPopupMaskDelayExp.DEFAULT;
        } else {
            i2 = 0;
        }
        C786410Ut5.I7(new View.OnClickListener() { // from class: X.01Tn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                InterfaceC497601wk lifecycleScope;
                view.setEnabled(false);
                LifecycleOwner lifecycleOwner2 = lifecycleOwner;
                if (lifecycleOwner2 == null || (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner2)) == null) {
                    lifecycleScope = C817503Hh.LL;
                }
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(lifecycleScope, C2107308Nj.LIZ.LLIILII(), null, new C339601Tm(i2, view, interfaceC1631620sYq, view2, null), 2);
            }
        }, view);
    }
}
