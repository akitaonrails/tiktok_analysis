package X;

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.als.ApiCenter;
import com.bytedance.als.FeatureAlsLogicContainer;
import com.bytedance.als.dsl.AlsVMContainer;
import com.bytedance.als.dsl.OCAdapterViewModel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AwS62S0010000_25;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import yd.a;

/* JADX INFO: renamed from: X.0tQ2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1664600tQ2 {
    public static final C0LEK LIZLLL(C19EG c19eg) {
        C0LEK c0lekLJI = LJI(c19eg);
        if (c0lekLJI != null) {
            return c0lekLJI;
        }
        throw new RuntimeException("AlsLogicContainer not found");
    }

    public static final synchronized C0LEK LJ(C19A3 c19a3) {
        return LJFF(c19a3);
    }

    public static final synchronized C0LEK LJFF(C19A3 c19a3) {
        boolean z;
        FeatureAlsLogicContainer featureAlsLogicContainer;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19a3);
        sbLIZ.append(" findAlsContainer");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        AlsVMContainer alsVMContainer = (AlsVMContainer) C1659680tI6.LIZ.LIZ(c19a3, AlsVMContainer.class);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c19a3);
        sbLIZ2.append(" Scene findAlsContainer find AlsVMContainer ");
        sbLIZ2.append(alsVMContainer);
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        if (alsVMContainer.LLILLJJLI != null) {
            z = true;
        } else {
            z = false;
        }
        alsVMContainer.vQ2(c19a3);
        featureAlsLogicContainer = alsVMContainer.LLILLJJLI;
        if (featureAlsLogicContainer != null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(c19a3);
            sbLIZ3.append(" return AlsLogicContainer ");
            sbLIZ3.append(featureAlsLogicContainer);
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        } else {
            C0LFH.LIZ(new AwS62S0010000_25(z, 2));
            if (z) {
                throw new C1664650tQ7("AlsLogicContainer not found because it was cleaned");
            }
            throw new C1664650tQ7("AlsLogicContainer not found");
        }
        return featureAlsLogicContainer;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final synchronized C0LEK LJI(C19EG c19eg) {
        FeatureAlsLogicContainer featureAlsLogicContainer;
        ViewModel viewModel;
        AlsVMContainer alsVMContainer;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg);
        sbLIZ.append(" findAlsContainerSafely");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        featureAlsLogicContainer = null;
        if (C1664630tQ5.LJ) {
            alsVMContainer = (AlsVMContainer) C1664610tQ3.LIZ(c19eg, AlsVMContainer.class);
        } else {
            if (c19eg instanceof InterfaceC1664670tQ9) {
                ((InterfaceC1664670tQ9) c19eg).LLLLJI();
            }
            Application application = c19eg.getApplication();
            if (application != null) {
                viewModel = new ViewModelProvider(c19eg.getViewModelStore(), ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application), C903300Zc8.LIZJ).get((Class<ViewModel>) AlsVMContainer.class);
            } else {
                viewModel = null;
            }
            if (c19eg instanceof InterfaceC1664670tQ9) {
                ((InterfaceC1664670tQ9) c19eg).LJJIL();
            }
            alsVMContainer = (AlsVMContainer) viewModel;
        }
        if (alsVMContainer != null) {
            alsVMContainer.wQ2(c19eg);
            featureAlsLogicContainer = alsVMContainer.LLILLJJLI;
        }
        return featureAlsLogicContainer;
    }

    public static final synchronized C0LEK LJII(C19A3 c19a3) {
        AlsVMContainer alsVMContainer;
        FeatureAlsLogicContainer featureAlsLogicContainer;
        if (C1664630tQ5.LJ) {
            alsVMContainer = (AlsVMContainer) C1659680tI6.LIZ.LIZ(c19a3, AlsVMContainer.class);
        } else {
            alsVMContainer = (AlsVMContainer) C1659680tI6.LIZ.LIZIZ(c19a3, AlsVMContainer.class);
        }
        if (alsVMContainer != null) {
            featureAlsLogicContainer = alsVMContainer.LLILLJJLI;
        } else {
            featureAlsLogicContainer = null;
        }
        return featureAlsLogicContainer;
    }

    public static final C1DRG LJIIIIZZ(AbstractC1664710tQD<?> abstractC1664710tQD) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC1664710tQD);
        sbLIZ.append(" findAlsContainer");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        FeatureAlsLogicContainer featureAlsLogicContainer = ((AlsVMContainer) C1664620tQ4.LIZ(abstractC1664710tQD).get(AlsVMContainer.class)).LLILLJJLI;
        if (featureAlsLogicContainer != null) {
            return featureAlsLogicContainer.LLJJI;
        }
        throw new RuntimeException("AlsLogicContainer not found");
    }

    public static final synchronized C1DRG LJIIIZ(C19A3 c19a3) {
        C1DRG c1drgLJFF;
        C0LEK c0lekLJII = LJII(c19a3);
        if (c0lekLJII != null) {
            c1drgLJFF = c0lekLJII.LJFF();
        } else {
            c1drgLJFF = null;
        }
        return c1drgLJFF;
    }

    public static final boolean LJIIJ(C19EG c19eg) {
        C19EG c19eg2;
        AlsVMContainer alsVMContainer = (AlsVMContainer) C1664610tQ3.LIZ(c19eg, AlsVMContainer.class);
        if (alsVMContainer.LLILLJJLI != null) {
            WeakReference<C19EG> weakReference = alsVMContainer.LLILZ;
            if (weakReference != null) {
                c19eg2 = weakReference.get();
            } else {
                c19eg2 = null;
            }
            if (Intrinsics.LJFF(c19eg2, c19eg)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final boolean LJIIJJI(C19A3 c19a3) {
        if (((AlsVMContainer) C1659680tI6.LIZ.LIZ(c19a3, AlsVMContainer.class)).LLILLJJLI != null) {
            return true;
        }
        return false;
    }

    public static final void LIZIZ(C19EG c19eg, Function1 function1) {
        a aVar;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19eg);
        sbLIZ.append(" FragmentActivity attach{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c19eg);
        sbLIZ2.append(" findAlsContainer");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        AlsVMContainer alsVMContainer = (AlsVMContainer) C1664610tQ3.LIZ(c19eg, AlsVMContainer.class);
        alsVMContainer.wQ2(c19eg);
        if (alsVMContainer.LLILLJJLI == null) {
            ApiCenter apiCenterLIZ = C1309570kBP.LIZ(c19eg);
            C1DRG c1drgWQ2 = C1664590tQ1.LJ(c19eg, null).wQ2();
            if (c1drgWQ2 == null) {
                C0LFH.LIZ(AFwS214S0000000_25.get$arr$(593));
            }
            FragmentManager fragmentManager = c19eg.getFragmentManager();
            Fragment fragmentFindFragmentByTag = fragmentManager.findFragmentByTag("ALS.ActivityLifecycleFragment");
            if (!(fragmentFindFragmentByTag instanceof a) || (aVar = (a) fragmentFindFragmentByTag) == null) {
                aVar = new a();
                fragmentManager.beginTransaction().add(aVar, "ALS.ActivityLifecycleFragment").commitAllowingStateLoss();
                fragmentManager.executePendingTransactions();
            }
            LifecycleRegistry lifecycleRegistry = aVar.LL;
            String strLJI = C13LE.LIZ(c19eg.getClass()).LJI();
            if (strLJI == null) {
                strLJI = "";
            }
            alsVMContainer.LLILLJJLI = new FeatureAlsLogicContainer(strLJI, lifecycleRegistry, apiCenterLIZ, c1drgWQ2, alsVMContainer.LL, null);
        }
        C539960LFq c539960LFq = new C539960LFq(alsVMContainer.LLILLJJLI);
        function1.invoke(c539960LFq);
        c539960LFq.LIZIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(c19eg);
        sbLIZ3.append(" FragmentActivity attach{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static final void LIZJ(AbstractC1664710tQD abstractC1664710tQD, Function1 function1) {
        C19EG c19eg;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(abstractC1664710tQD);
        sbLIZ.append(" GroupLogicComponent attach{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(abstractC1664710tQD);
        sbLIZ2.append(" findAlsContainer");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        AlsVMContainer alsVMContainer = (AlsVMContainer) C1664620tQ4.LIZ(abstractC1664710tQD).get(AlsVMContainer.class);
        if (alsVMContainer.LLILLJJLI == null) {
            Object objLJII = abstractC1664710tQD.LL.LJII(Activity.class, null);
            if ((objLJII instanceof C19EG) && (c19eg = (C19EG) objLJII) != null) {
                ApiCenter apiCenterLIZ = C1309570kBP.LIZ(c19eg);
                C1DRG c1drgWQ2 = C1664590tQ1.LJFF(abstractC1664710tQD, null).wQ2();
                if (c1drgWQ2 == null) {
                    C0LFH.LIZ(AFwS214S0000000_25.get$arr$(595));
                }
                String strLJI = C13LE.LIZ(abstractC1664710tQD.getClass()).LJI();
                if (strLJI == null) {
                    strLJI = "";
                }
                alsVMContainer.LLILLJJLI = new FeatureAlsLogicContainer(strLJI, abstractC1664710tQD.getLifecycle(), apiCenterLIZ, c1drgWQ2, alsVMContainer.LL, null);
            } else {
                throw new IllegalStateException("a fragmentActivity instance is required in component.");
            }
        }
        C539960LFq c539960LFq = new C539960LFq(alsVMContainer.LLILLJJLI);
        function1.invoke(c539960LFq);
        c539960LFq.LIZIZ();
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(abstractC1664710tQD);
        sbLIZ3.append(" GroupLogicComponent attach{} end");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
    }

    public static final C539960LFq LIZ(C19A3 c19a3, String str, Function1<? super C539960LFq, Unit> function1) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c19a3);
        sbLIZ.append(" GroupScene attach{} start");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        C539960LFq c539960LFq = new C539960LFq(LJIIL(str, c19a3, null));
        function1.invoke(c539960LFq);
        c539960LFq.LIZIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(c19a3);
        sbLIZ2.append(" GroupScene attach{} end");
        C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        return c539960LFq;
    }

    public static final synchronized C0LEK LJIIL(String str, C19A3 c19a3, StackTraceElement[] stackTraceElementArr) {
        FeatureAlsLogicContainer featureAlsLogicContainer;
        C1DRG c1drgWQ2;
        String strLJI = str;
        synchronized (C1664600tQ2.class) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c19a3);
            sbLIZ.append(" requireAlsContainer");
            C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ));
            AlsVMContainer alsVMContainer = (AlsVMContainer) C1659680tI6.LIZ.LIZ(c19a3, AlsVMContainer.class);
            alsVMContainer.vQ2(c19a3);
            if (alsVMContainer.LLILLJJLI == null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(c19a3);
                sbLIZ2.append(" create new AlsContainer");
                C1659700tI8.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
                ApiCenter apiCenterLIZ = C1309570kBP.LIZ((C19EG) c19a3.requireActivity());
                OCAdapterViewModel oCAdapterViewModel = alsVMContainer.LLILLL;
                if (oCAdapterViewModel != null) {
                    c1drgWQ2 = oCAdapterViewModel.wQ2();
                } else {
                    c1drgWQ2 = null;
                }
                if (c1drgWQ2 == null) {
                    C0LFH.LIZ(AFwS214S0000000_25.get$arr$(594));
                }
                if (strLJI == null || a0.LJJJIL(strLJI)) {
                    strLJI = C13LE.LIZ(c19a3.getClass()).LJI();
                }
                if (strLJI == null) {
                    strLJI = "";
                }
                alsVMContainer.LLILLJJLI = new FeatureAlsLogicContainer(strLJI, c19a3.getLifecycle(), apiCenterLIZ, c1drgWQ2, alsVMContainer.LL, stackTraceElementArr);
                alsVMContainer.xQ2(c19a3);
            }
            featureAlsLogicContainer = alsVMContainer.LLILLJJLI;
        }
        return featureAlsLogicContainer;
    }
}
