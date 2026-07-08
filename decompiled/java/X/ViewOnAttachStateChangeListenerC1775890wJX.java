package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.probe.IProbeService;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0wJX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewOnAttachStateChangeListenerC1775890wJX implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewAttachedToWindow$0(ViewOnAttachStateChangeListenerC1775890wJX viewOnAttachStateChangeListenerC1775890wJX, View view) {
    }

    public static final void onViewAttachedToWindow$1(ViewOnAttachStateChangeListenerC1775890wJX viewOnAttachStateChangeListenerC1775890wJX, View view) {
    }

    public static final void onViewAttachedToWindow$2(ViewOnAttachStateChangeListenerC1775890wJX viewOnAttachStateChangeListenerC1775890wJX, View view) {
    }

    public static final void onViewAttachedToWindow$3(ViewOnAttachStateChangeListenerC1775890wJX viewOnAttachStateChangeListenerC1775890wJX, View view) {
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
        }
    }

    public static final void onViewDetachedFromWindow$0(ViewOnAttachStateChangeListenerC1775890wJX viewOnAttachStateChangeListenerC1775890wJX, View view) {
        C1709570uaZ c1709570uaZ;
        C1709430uaL c1709430uaL = (C1709430uaL) viewOnAttachStateChangeListenerC1775890wJX.l0;
        C995290c0V c995290c0V = (C995290c0V) viewOnAttachStateChangeListenerC1775890wJX.l1;
        try {
            IProbeService iProbeService = (IProbeService) PluggableExtentionKt.pluggableSpi$default(IProbeService.class, false, false, false, 14, null);
            if (iProbeService != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(c1709430uaL.LLJJI.LJ);
                sbLIZ.append("_cashier");
                iProbeService.LJIIJJI(new C1504130pFD(C2188811AlT.LIZIZ(sbLIZ)));
            }
            if (c1709430uaL.LLJJI.LJIIZILJ && (c1709570uaZ = c1709430uaL.LLILLL) != null) {
                c1709570uaZ.LJIILJJIL.remove(c1709430uaL);
            }
            c995290c0V.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1775890wJX);
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public static final void onViewDetachedFromWindow$1(ViewOnAttachStateChangeListenerC1775890wJX viewOnAttachStateChangeListenerC1775890wJX, View view) {
        C786410Ut5.C3(((View) viewOnAttachStateChangeListenerC1775890wJX.l0).getViewTreeObserver(), (ViewTreeObserver.OnGlobalLayoutListener) viewOnAttachStateChangeListenerC1775890wJX.l1);
    }

    public static final void onViewDetachedFromWindow$2(ViewOnAttachStateChangeListenerC1775890wJX viewOnAttachStateChangeListenerC1775890wJX, View view) {
        ((View) viewOnAttachStateChangeListenerC1775890wJX.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1775890wJX);
        C1753590vjZ c1753590vjZ = (C1753590vjZ) viewOnAttachStateChangeListenerC1775890wJX.l1;
        C1754560vl8 c1754560vl8 = c1753590vjZ.LIZLLL;
        if (c1754560vl8 != null) {
            c1754560vl8.LJJII(c1753590vjZ.LJIILL);
        }
        C1753590vjZ c1753590vjZ2 = (C1753590vjZ) viewOnAttachStateChangeListenerC1775890wJX.l1;
        BPEAHandler bPEAHandler = c1753590vjZ2.LIZJ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(c1753590vjZ2.LJIILJJIL);
        }
        ((C1753590vjZ) viewOnAttachStateChangeListenerC1775890wJX.l1).LIZ(false);
    }

    public static final void onViewDetachedFromWindow$3(ViewOnAttachStateChangeListenerC1775890wJX viewOnAttachStateChangeListenerC1775890wJX, View view) {
        ((View) viewOnAttachStateChangeListenerC1775890wJX.l0).removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC1775890wJX);
        C1754070vkL c1754070vkL = (C1754070vkL) viewOnAttachStateChangeListenerC1775890wJX.l1;
        C1754560vl8 c1754560vl8 = c1754070vkL.LIZLLL;
        if (c1754560vl8 != null) {
            c1754560vl8.LJJII(c1754070vkL.LJIILLIIL);
        }
        C1754070vkL c1754070vkL2 = (C1754070vkL) viewOnAttachStateChangeListenerC1775890wJX.l1;
        BPEAHandler bPEAHandler = c1754070vkL2.LIZJ;
        if (bPEAHandler != null) {
            bPEAHandler.removeCallbacks(c1754070vkL2.LJIILL);
        }
        ((C1754070vkL) viewOnAttachStateChangeListenerC1775890wJX.l1).LIZ();
    }

    public ViewOnAttachStateChangeListenerC1775890wJX(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
