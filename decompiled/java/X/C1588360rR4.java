package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.ShopMallMixViewModel;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS241S0000000_10;

/* JADX INFO: renamed from: X.0rR4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1588360rR4 implements C0WHU {
    public static final C1588360rR4 LIZ = new C1588360rR4();
    public static final C1604710rrR LIZIZ = new C1604710rrR("shop", 3, 3);
    public static InterfaceC1587510rPh LIZJ;
    public static WeakReference<Fragment> LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;

    public static boolean LIZIZ(ShopMallMixViewModel shopMallMixViewModel) {
        C1604710rrR c1604710rrR = LIZIZ;
        if (c1604710rrR.LIZ() || !c1604710rrR.LJI()) {
            return false;
        }
        AssemViewModel.asyncSubscribe$default(shopMallMixViewModel, new C2217381BqS() { // from class: X.0qzp
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((C1571460qzo) obj).LLILZLL;
            }
        }, null, null, null, AFwS241S0000000_10.get$arr$(492), 14, null);
        return true;
    }

    @Override // X.C0WHU
    public final void LIZ(C0WHR c0whr) {
        Fragment fragment;
        LIZJ = c0whr;
        WeakReference<Fragment> weakReference = LIZLLL;
        if (weakReference != null && (fragment = weakReference.get()) != null) {
            LJFF = true;
            final AnonymousClass0956 anonymousClass0956LIZLLL = C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(fragment), null, null, new C0NKR(fragment, null), 3);
            fragment.getLifecycle().addObserver(new LifecycleEventObserver() { // from class: com.ss.android.ugc.aweme.ecommerce.mall.shortcut.ShopMallShortcutGuideTrigger$showShortcutGuide$1$1
                @Override // androidx.lifecycle.LifecycleEventObserver
                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                    if (event == Lifecycle.Event.ON_PAUSE) {
                        anonymousClass0956LIZLLL.LIZIZ(null);
                    }
                }
            });
            final C19EG activity = fragment.getActivity();
            if (activity != null) {
                C446900Hfk c446900Hfk = Hox.LLJILJIL;
                final String strPz = c446900Hfk.LIZ(activity).pz(fragment);
                if (strPz == null) {
                    return;
                }
                c446900Hfk.LIZ(activity).wQ2(strPz, new InterfaceC1055110dYz() { // from class: X.0NPr
                    @Override // X.InterfaceC1583780rJg
                    public final String getHoxNodeTag() {
                        return "";
                    }

                    @Override // X.InterfaceC1055110dYz
                    public final void onNodeShow(Bundle bundle) {
                    }

                    @Override // X.InterfaceC1055110dYz
                    public final void onNodeHide(Bundle bundle) {
                        Hox.LLJILJIL.LIZ(activity).PQ2(strPz, this);
                        anonymousClass0956LIZLLL.LIZIZ(null);
                    }
                });
            }
        }
    }
}
