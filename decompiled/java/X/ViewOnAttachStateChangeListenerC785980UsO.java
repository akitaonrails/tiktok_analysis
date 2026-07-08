package X;

import Y.ARunnableS17S0100100_12;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.live.uikit.reddot.RedDotExtensionKt;
import com.bytedance.pipo.stellar.base.card.CarouselBannerCard;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UsO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class ViewOnAttachStateChangeListenerC785980UsO implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
    }

    public static final void onViewAttachedToWindow$4(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
    }

    public static final void onViewDetachedFromWindow$5(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
        }
    }

    public ViewOnAttachStateChangeListenerC785980UsO(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC785980UsO);
        ((Runnable) viewOnAttachStateChangeListenerC785980UsO.l0).run();
    }

    public static final void onViewAttachedToWindow$5(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
        if (((C0T6G) viewOnAttachStateChangeListenerC785980UsO.l0).LL.getViewTreeObserver().isAlive()) {
            C786410Ut5.w3(((C0T6G) viewOnAttachStateChangeListenerC785980UsO.l0).LL.getViewTreeObserver(), (C0T6G) viewOnAttachStateChangeListenerC785980UsO.l0);
        }
        ((C0T6G) viewOnAttachStateChangeListenerC785980UsO.l0).LL.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC785980UsO);
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
        C759450Tqh next;
        try {
            List<C759450Tqh> list = C759450Tqh.LJIIIZ;
            RecyclerView recyclerView = (RecyclerView) viewOnAttachStateChangeListenerC785980UsO.l0;
            Iterator<C759450Tqh> it2 = list.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LIZIZ, recyclerView)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C759450Tqh c759450Tqh = next;
            if (c759450Tqh != null) {
                ((ArrayList) C759450Tqh.LJIIIZ).remove(c759450Tqh);
                List<C759430Tqf> list2 = c759450Tqh.LIZLLL;
                ArrayList<C759430Tqf> arrayList = new ArrayList();
                for (C759430Tqf c759430Tqf : list2) {
                    C759430Tqf c759430Tqf2 = c759430Tqf;
                    if ((c759430Tqf2 instanceof C759410Tqd) && ((C759410Tqd) c759430Tqf2).LIZLLL != null) {
                        arrayList.add(c759430Tqf);
                    }
                }
                for (C759430Tqf c759430Tqf3 : arrayList) {
                    IPipoContainerService iPipoContainerService = (IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class);
                    String str = ((C759410Tqd) c759430Tqf3).LIZLLL;
                    if (str == null) {
                        str = "";
                    }
                    iPipoContainerService.LJIIJJI(str);
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
        C1102070emj.LJIILJJIL(C1102070emj.LIZ, C782710Un7.LJIIIZ(C782710Un7.LIZ), ((C0UX6) viewOnAttachStateChangeListenerC785980UsO.l0).getComponent(), ((C0UX6) viewOnAttachStateChangeListenerC785980UsO.l0).getComponentInstance(), C0KAJ.AUTO_TERMINATE, RedDotExtensionKt.LIZLLL((C0UX6) viewOnAttachStateChangeListenerC785980UsO.l0), null, 96);
        view.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC785980UsO);
        ((C0UX6) viewOnAttachStateChangeListenerC785980UsO.l0).setShowing(false);
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
        CarouselBannerCard carouselBannerCard = (CarouselBannerCard) viewOnAttachStateChangeListenerC785980UsO.l0;
        ARunnableS17S0100100_12 aRunnableS17S0100100_12 = carouselBannerCard.LLJI;
        if (aRunnableS17S0100100_12 != null) {
            carouselBannerCard.LLJ.removeCallbacks(aRunnableS17S0100100_12);
        }
    }

    public static final void onViewDetachedFromWindow$4(ViewOnAttachStateChangeListenerC785980UsO viewOnAttachStateChangeListenerC785980UsO, View view) {
        ((View) viewOnAttachStateChangeListenerC785980UsO.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC785980UsO);
        C782710Un7 c782710Un7 = C782710Un7.LIZ;
        C0UX6 c0ux6 = C0UX6.LIVE_PLAYBOOK_BROADCAST_SMB;
        c782710Un7.getClass();
        C782710Un7.LJIILJJIL.remove(c0ux6);
    }
}
