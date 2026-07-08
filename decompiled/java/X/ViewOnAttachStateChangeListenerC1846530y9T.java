package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.nxet.vtree.v2.VTreeBuildManager;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y9T, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class ViewOnAttachStateChangeListenerC1846530y9T implements View.OnAttachStateChangeListener {
    public static boolean LLILLJJLI;
    public static final ViewOnAttachStateChangeListenerC1846530y9T LL = new ViewOnAttachStateChangeListenerC1846530y9T();
    public static final LinkedList<WeakReference<View>> LLILLL = new LinkedList<>();
    public static final C1809310xBR LLILZ = new AbstractC1585810rMx() { // from class: X.0xBR
        @Override // X.AbstractC1585810rMx
        public final void LJJIIJ(RecyclerView recyclerView, int i) {
            if (i == 0) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(recyclerView);
            }
        }

        @Override // X.AbstractC1585810rMx
        public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
            if (Math.abs(i) > 10 || Math.abs(i2) > 10) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(recyclerView);
            }
        }
    };

    public static boolean LIZ() {
        LinkedList<WeakReference<View>> linkedList = LLILLL;
        if (linkedList.isEmpty()) {
            return false;
        }
        try {
            Iterator<WeakReference<View>> it2 = linkedList.iterator();
            while (it2.hasNext()) {
                View view = it2.next().get();
                if (view != null) {
                    C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view);
                    String str = c1847740yBQLIZIZ != null ? c1847740yBQLIZIZ.LIZIZ : null;
                    if (str != null && str.length() != 0) {
                        LIZLLL();
                        return true;
                    }
                    LLILLJJLI = false;
                    LIZIZ(view);
                    if (LLILLJJLI) {
                        LIZLLL();
                        return true;
                    }
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        LIZLLL();
        return false;
    }

    public static void LIZLLL() {
        try {
            LLILLL.clear();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZIZ(View view) {
        String str;
        if (LLILLJJLI || !(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getChildCount() <= 0) {
            return;
        }
        Iterator<View> it2 = new C09RD(viewGroup).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (c09re.hasNext()) {
                View view2 = (View) c09re.next();
                C1847740yBQ c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view2);
                if (c1847740yBQLIZIZ != null && (str = c1847740yBQLIZIZ.LIZIZ) != null && str.length() != 0) {
                    LLILLJJLI = true;
                    return;
                }
                LIZIZ(view2);
            } else {
                return;
            }
        }
    }

    public static void LIZJ(Object obj) {
        InterfaceC1846560y9W interfaceC1846560y9WLIZ;
        View view;
        if (C1848410yCV.LIZ && (interfaceC1846560y9WLIZ = C1847660yBI.LIZ()) != null && interfaceC1846560y9WLIZ.LJFF()) {
            InterfaceC1846560y9W interfaceC1846560y9WLIZ2 = C1847660yBI.LIZ();
            if (interfaceC1846560y9WLIZ2 != null && interfaceC1846560y9WLIZ2.LIZIZ()) {
                VTreeBuildManager.LJIIL(false);
                return;
            }
            if (VTreeBuildManager.LJIIJ > 0) {
                if (VTreeBuildManager.LJ == 1) {
                    LIZLLL();
                    return;
                }
                LinkedList<WeakReference<View>> linkedList = LLILLL;
                if (linkedList.size() > 50 || !(obj instanceof View) || (view = (View) obj) == null || !view.isAttachedToWindow()) {
                    return;
                }
                try {
                    Iterator<WeakReference<View>> it2 = linkedList.iterator();
                    while (it2.hasNext()) {
                        if (Intrinsics.LJFF(it2.next().get(), view)) {
                            return;
                        }
                    }
                    LLILLL.add(new WeakReference<>(view));
                    if (C787070Uu9.LIZ()) {
                        VTreeBuildManager.LJII.LIZIZ(1);
                    } else {
                        C786410Ut5.LJJZZIII(C787070Uu9.LIZ, new Runnable() { // from class: X.0opB
                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("VTreeBuildManager@cf12.checkTreeBuild$1");
                                try {
                                    VTreeBuildManager.LJII.LIZIZ(1);
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("VTreeBuildManager@cf12.checkTreeBuild$1");
                            }
                        });
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewAttachedToWindow:");
        sbLIZ.append(view);
        C2188811AlT.LIZIZ(sbLIZ);
        VTreeBuildManager.LJIIL(true);
        LIZLLL();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onViewDetachedFromWindow:");
        sbLIZ.append(view);
        C2188811AlT.LIZIZ(sbLIZ);
        VTreeBuildManager.LJIIL(true);
        LIZLLL();
        view.removeOnAttachStateChangeListener(this);
        if (view instanceof RecyclerView) {
            ((RecyclerView) view).removeOnScrollListener(LLILZ);
        }
    }
}
