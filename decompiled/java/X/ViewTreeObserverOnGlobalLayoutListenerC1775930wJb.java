package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.bytedance.pipo.stellar.base.model.CompoundComponentDO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.us.core.page.PdpFragment;
import com.ss.android.ugc.aweme.ecommerce.event.monitor.IPageNodeMonitorService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0wJb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1775930wJb implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
            case 2:
                onGlobalLayout$2(this);
                break;
            case 3:
                onGlobalLayout$3(this);
                break;
            case 4:
                onGlobalLayout$4(this);
                break;
            case 5:
                onGlobalLayout$5(this);
                break;
            case 6:
                onGlobalLayout$6(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1775930wJb viewTreeObserverOnGlobalLayoutListenerC1775930wJb) {
        InterfaceC1740480vOQ interfaceC1740480vOQ = (InterfaceC1740480vOQ) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l0;
        if (((IPageNodeMonitorService) ServiceManager.get().getService(IPageNodeMonitorService.class)).LIZJ(interfaceC1740480vOQ.getPageName(), (Function0) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1)) {
            C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l2).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1775930wJb);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1775930wJb viewTreeObserverOnGlobalLayoutListenerC1775930wJb) {
        int height;
        ViewTreeObserver viewTreeObserver;
        View view = ((PdpFragment) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l0).LLLIILIL;
        if (view != null && (height = view.getHeight()) > 0) {
            ((ViewGroup.MarginLayoutParams) ((C16G1) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1)).bottomMargin = height;
            C786410Ut5.a6((FrameLayout) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l2, (C16G1) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1);
            View view2 = ((PdpFragment) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l0).LLLIILIL;
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775930wJb);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775930wJb, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1775930wJb viewTreeObserverOnGlobalLayoutListenerC1775930wJb) {
        int height;
        ViewTreeObserver viewTreeObserver;
        View view = ((PdpFragment) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l0).LLLIILIL;
        if (view != null && (height = view.getHeight()) > 0) {
            ((ViewGroup.MarginLayoutParams) ((C16G1) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1)).bottomMargin = height;
            C786410Ut5.a6((FrameLayout) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l2, (C16G1) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1);
            View view2 = ((PdpFragment) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l0).LLLIILIL;
            if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1775930wJb);
                C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1775930wJb, ViewTreeObserver.OnGlobalLayoutListener.class);
            }
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1775930wJb viewTreeObserverOnGlobalLayoutListenerC1775930wJb) {
        View view = ((C1756390vo5) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l0).LIZLLL;
        if (view != null) {
            view.getLocationInWindow((int[]) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1);
        }
        C786410Ut5.Ld((View) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l2, ((int[]) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1)[1] - r2.getHeight());
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC1775930wJb viewTreeObserverOnGlobalLayoutListenerC1775930wJb) {
        if (!((C1711910ueL) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l0).LLILZLL) {
            ((Function1) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1).invoke((View) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l2);
            ((C1711910ueL) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l0).LLILZLL = true;
        }
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC1775930wJb viewTreeObserverOnGlobalLayoutListenerC1775930wJb) {
        View view = ((C1756290vnv) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l0).LIZLLL;
        if (view != null) {
            view.getLocationInWindow((int[]) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1);
        }
        C786410Ut5.Ld((View) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l2, ((int[]) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1)[1] - r2.getHeight());
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC1775930wJb viewTreeObserverOnGlobalLayoutListenerC1775930wJb) {
        Function0<Map<String, Object>> function0;
        Map<String, Object> mapInvoke;
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1775930wJb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1721360uta c1721360uta = (C1721360uta) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l1;
        CompoundComponentDO compoundComponentDO = (CompoundComponentDO) viewTreeObserverOnGlobalLayoutListenerC1775930wJb.l2;
        C1720760usc c1720760usc = c1721360uta.LL;
        if (c1720760usc != null && (function0 = c1720760usc.LIZJ) != null && (mapInvoke = function0.invoke()) != null) {
            linkedHashMap.putAll(mapInvoke);
        }
        Map<String, Object> trackingParams = compoundComponentDO.getTrackingParams();
        if (trackingParams != null) {
            linkedHashMap.putAll(trackingParams);
        }
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL("pipo_button_show", linkedHashMap);
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1775930wJb(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj3;
        this.l2 = obj;
    }
}
