package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.ies.uikit.base.AbsFragment;
import com.ss.android.ugc.aweme.IDetailFeedSafService;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rBN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1578630rBN {
    public static final RootPanelComponent LIZ(Fragment fragment) {
        RootPanelComponent rootPanelComponent;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        if (fragment.getActivity() != null) {
            AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(fragment);
            if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                    if (abstractC738140SxQ instanceof RootPanelComponent) {
                        arrayList.add(abstractC738140SxQ);
                    }
                }
                rootPanelComponent = (RootPanelComponent) C13LP.LJJJLL(arrayList);
            } else {
                rootPanelComponent = null;
            }
            if (rootPanelComponent instanceof InterfaceC735760Sta) {
                return rootPanelComponent;
            }
        }
        return null;
    }

    public static final C0RJN LIZIZ(Fragment fragment) {
        RootPanelComponent rootPanelComponentLIZJ = LIZJ(fragment);
        if (rootPanelComponentLIZJ != null) {
            return rootPanelComponentLIZJ.getPanelContext();
        }
        return null;
    }

    public static final RootPanelComponent LIZJ(Fragment fragment) {
        RootPanelComponent rootPanelComponent;
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        if (fragment.getActivity() != null) {
            AssemSupervisor assemSupervisorLIZJ = C724240Sb0.LIZJ(fragment);
            if (assemSupervisorLIZJ != null && (copyOnWriteArrayList = assemSupervisorLIZJ.LLJILLL) != null) {
                ArrayList arrayList = new ArrayList();
                for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                    if (abstractC738140SxQ instanceof RootPanelComponent) {
                        arrayList.add(abstractC738140SxQ);
                    }
                }
                rootPanelComponent = (RootPanelComponent) C13LP.LJJJLL(arrayList);
            } else {
                rootPanelComponent = null;
            }
            if (rootPanelComponent instanceof RootPanelComponent) {
                return rootPanelComponent;
            }
        }
        return null;
    }

    public static final C0SU7 LIZLLL(Fragment fragment) {
        C128Y c128yLIZLLL;
        Boolean boolValueOf;
        boolean zIsDestroyed;
        C0RTY c0rtyZQ2;
        InterfaceC214902198i interfaceC214902198i;
        if (fragment == null) {
            return null;
        }
        if (C294990BhJ.LIZ()) {
            return (C0SU7) new C1559260qg8(new AwS127S1200000_11(fragment, (Fragment) C0SU7.class, (Class<Object>) null, (String) 14), true).getValue();
        }
        IDetailFeedSafService iDetailFeedSafService = (IDetailFeedSafService) PluggableExtentionKt.pluggableSpi$default(IDetailFeedSafService.class, false, false, false, 14, null);
        if (iDetailFeedSafService != null) {
            c128yLIZLLL = iDetailFeedSafService.LIZLLL(fragment);
        } else {
            c128yLIZLLL = null;
        }
        if ((c128yLIZLLL instanceof InterfaceC214902198i) && (interfaceC214902198i = (InterfaceC214902198i) c128yLIZLLL) != null) {
            zIsDestroyed = SAFExtensionKt.LJIIZILJ(interfaceC214902198i);
        } else {
            C19EG activity = fragment.getActivity();
            if (activity != null) {
                zIsDestroyed = activity.isDestroyed();
            } else {
                boolValueOf = null;
                if (!fragment.isDetached() || fragment.getActivity() == null || Intrinsics.LJFF(boolValueOf, Boolean.TRUE) || (c0rtyZQ2 = C0RPA.LIZ(fragment.requireActivity()).zQ2(fragment)) == null) {
                    return null;
                }
                return (C0SU7) c0rtyZQ2.LIZJ(C0SU7.class, null);
            }
        }
        boolValueOf = Boolean.valueOf(zIsDestroyed);
        return !fragment.isDetached() ? null : null;
    }

    public static final InterfaceC665370Q7z LJ(Fragment fragment) {
        RootPanelComponent rootPanelComponentLIZJ;
        if (fragment.getActivity() == null || (rootPanelComponentLIZJ = LIZJ(fragment)) == null) {
            return null;
        }
        return C1558520qew.LJIIL(rootPanelComponentLIZJ);
    }

    public static final void LJII(Fragment fragment) {
        if (fragment.getActivity() == null) {
            return;
        }
        C723850SaN.LIZ(fragment, true, null, new C1566000qr0(fragment), 2);
        C1558360qeg.LIZIZ(fragment, null);
        C723850SaN.LIZ(fragment, true, null, new C0TMW(fragment), 2);
    }

    public static final boolean LJIIIZ(AbstractC738140SxQ abstractC738140SxQ) {
        if (abstractC738140SxQ.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            return true;
        }
        return false;
    }

    public static final boolean LJIIJ(AbstractC738140SxQ abstractC738140SxQ) {
        if (abstractC738140SxQ.getLifecycle().getCurrentState().compareTo(Lifecycle.State.RESUMED) >= 0) {
            return true;
        }
        return false;
    }

    public static final void LJFF(int i, AbsFragment absFragment) {
        RootPanelComponent rootPanelComponentLIZJ = LIZJ(absFragment);
        if (rootPanelComponentLIZJ != null) {
            rootPanelComponentLIZJ.onPagePause(i);
        }
        BtmSDK.INSTANCE.onPageHide(absFragment, Boolean.TRUE);
    }

    public static final void LJI(int i, Fragment fragment) {
        RootPanelComponent rootPanelComponentLIZJ = LIZJ(fragment);
        if (rootPanelComponentLIZJ != null) {
            rootPanelComponentLIZJ.onPageResume(i);
        }
        BtmSDK btmSDK = BtmSDK.INSTANCE;
        Boolean bool = Boolean.TRUE;
        C0PSL c0psl = new C0PSL();
        c0psl.LIZ = true;
        btmSDK.onPageShow(fragment, bool, c0psl);
    }

    public static final void LJIIIIZZ(Bundle bundle, String str) {
        C786410Ut5.LJJJI("com.ss.android.ugc.aweme.intent.extra.FEED_PANEL_SCENE", str, bundle);
    }

    public static final void LJIIJJI(AbstractC738140SxQ abstractC738140SxQ, Function2<? super InterfaceC497601wk, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2) {
        LifecycleOwnerKt.getLifecycleScope(abstractC738140SxQ).launchWhenStarted(new C459560I0k(abstractC738140SxQ, function2, null));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.09AY, kotlin.jvm.functions.Function1] */
    public static final void LJIIL(Fragment fragment, C13IQ<? extends InterfaceC1565950qqv> c13iq) {
        C1333305Jr<InterfaceC1565950qqv, C2189821An6> c1333305Jr;
        AbstractC1333605Ju<? extends InterfaceC1565950qqv, C2189821An6> abstractC1333605Ju;
        RootPanelComponent rootPanelComponentLIZJ = LIZJ(fragment);
        if (rootPanelComponentLIZJ != null && (c1333305Jr = rootPanelComponentLIZJ.LLJJIJIIJIL) != null && (abstractC1333605Ju = c1333305Jr.LIZJ.get(c13iq)) != null) {
            C1333805Jw<InterfaceC1565950qqv, C2189821An6> c1333805Jw = c1333305Jr.LIZLLL;
            c1333805Jw.getClass();
            ?? r1 = abstractC1333605Ju.LIZ;
            if (r1 != 0 && ((Boolean) r1.invoke(c1333805Jw.LIZJ)).booleanValue()) {
                c1333805Jw.LIZ(abstractC1333605Ju);
            }
        }
    }

    public static final void LJIILIIL(Fragment fragment, C2189821An6 c2189821An6) {
        C0SU7 c0su7LIZLLL;
        if (fragment != null && c2189821An6 != null && (c0su7LIZLLL = LIZLLL(fragment)) != null) {
            c0su7LIZLLL.LL.LIZJ = c2189821An6;
        }
    }
}
