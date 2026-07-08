package X;

import android.app.Application;
import android.content.Context;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.page.SeaPdpPageComponentManager;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0veR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750410veR extends AbstractC813200VvC {
    public WeakReference<SeaPdpFragment> LLILLJJLI;
    public WeakReference<SeaPdpViewModel> LLILLL;
    public C1750420veS LLILZIL;
    public Application LLILZLL;
    public final LinkedList<WeakReference<Fragment>> LL = new LinkedList<>();
    public final List<WeakReference<FragmentManager>> LLILZ = new ArrayList();

    public final void release() {
        IECommerceHostService iECommerceHostService;
        Unit unit;
        Unit unit2;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            Iterator it2 = ((ArrayList) this.LLILZ).iterator();
            while (it2.hasNext()) {
                FragmentManager fragmentManager = (FragmentManager) ((Reference) it2.next()).get();
                if (fragmentManager != null) {
                    fragmentManager.LLIILZL(this);
                }
            }
            Application application = this.LLILZLL;
            if (application != null) {
                application.unregisterActivityLifecycleCallbacks(this.LLILZIL);
                unit2 = Unit.LIZ;
            } else {
                unit2 = null;
            }
            C189200o6.m2constructorimpl(unit2);
        } else {
            try {
                Iterator it3 = ((ArrayList) this.LLILZ).iterator();
                while (it3.hasNext()) {
                    FragmentManager fragmentManager2 = (FragmentManager) ((WeakReference) it3.next()).get();
                    if (fragmentManager2 != null) {
                        fragmentManager2.LLIILZL(this);
                    }
                }
                Application application2 = this.LLILZLL;
                if (application2 != null) {
                    application2.unregisterActivityLifecycleCallbacks(this.LLILZIL);
                    unit = Unit.LIZ;
                } else {
                    unit = null;
                }
                C189200o6.m2constructorimpl(unit);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        ((ArrayList) this.LLILZ).clear();
        this.LLILLJJLI = null;
        this.LLILLL = null;
        this.LLILZLL = null;
        this.LLILZIL = null;
        this.LL.clear();
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentDetached(FragmentManager fragmentManager, Fragment fragment) {
        SeaPdpViewModel seaPdpViewModel;
        SeaPdpPageComponentManager seaPdpPageComponentManager;
        C1755820vnA c1755820vnA;
        Reference reference;
        WeakReference<SeaPdpFragment> weakReference = this.LLILLJJLI;
        if (weakReference != null && weakReference.get() != null) {
            C19719612Di.LJJIIJ(this.LL, AFwS264S0000000_24.get$arr$(685), true);
            LinkedList<WeakReference<Fragment>> linkedList = this.LL;
            ListIterator<WeakReference<Fragment>> listIterator = linkedList.listIterator(linkedList.size());
            while (listIterator.hasPrevious()) {
                WeakReference<Fragment> weakReferencePrevious = listIterator.previous();
                if (Intrinsics.LJFF(weakReferencePrevious.get(), fragment)) {
                    if (weakReferencePrevious != null) {
                        boolean zLJFF = Intrinsics.LJFF(weakReferencePrevious, C13LP.LJJLIIIJL(this.LL));
                        this.LL.remove(weakReferencePrevious);
                        if (zLJFF) {
                            boolean zIsEmpty = this.LL.isEmpty();
                            WeakReference<SeaPdpViewModel> weakReference2 = this.LLILLL;
                            if (weakReference2 != null && (seaPdpViewModel = weakReference2.get()) != null && (seaPdpPageComponentManager = seaPdpViewModel.LLLLJI) != null && (c1755820vnA = seaPdpPageComponentManager.LLILLJJLI) != null) {
                                if (!zIsEmpty && (reference = (Reference) C13LP.LJJLIIIJL(this.LL)) != null) {
                                    reference.get();
                                }
                                C1755820vnA.LIZIZ(c1755820vnA, zIsEmpty);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    return;
                }
            }
            return;
        }
        release();
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        SeaPdpViewModel seaPdpViewModel;
        SeaPdpPageComponentManager seaPdpPageComponentManager;
        C1755820vnA c1755820vnA;
        WeakReference<SeaPdpFragment> weakReference = this.LLILLJJLI;
        if (weakReference != null && weakReference.get() != null) {
            this.LL.add(new WeakReference<>(fragment));
            WeakReference<SeaPdpViewModel> weakReference2 = this.LLILLL;
            if (weakReference2 != null && (seaPdpViewModel = weakReference2.get()) != null && (seaPdpPageComponentManager = seaPdpViewModel.LLLLJI) != null && (c1755820vnA = seaPdpPageComponentManager.LLILLJJLI) != null) {
                C1755820vnA.LIZIZ(c1755820vnA, false);
                return;
            }
            return;
        }
        release();
    }
}
