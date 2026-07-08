package X;

import Y.ARunnableS113S0100000_13;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.minis.page.MinisReportFeedbackActivity;
import com.ss.android.ugc.profile.business.drama.ProfileDramaBusiness;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.AFwS257S0000000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0j36, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1265980j36 implements ViewTreeObserver.OnGlobalLayoutListener {
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
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1265980j36 viewTreeObserverOnGlobalLayoutListenerC1265980j36) {
        View view = (View) ((WeakReference) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l0).get();
        if (view != null) {
            view.getWindowVisibleDisplayFrame(new Rect());
            if (r1 - r2.bottom > ((double) view.getRootView().getHeight()) * 0.1d) {
                if (view.findFocus() != null && !((MinisReportFeedbackActivity) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l1).LLJJIJIIJIL) {
                    ScrollView scrollView = (ScrollView) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l2;
                    HandlerHook.viewPost(scrollView, new ARunnableS113S0100000_13(scrollView, 115));
                    ((MinisReportFeedbackActivity) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l1).LLJJIJIIJIL = true;
                    return;
                }
                return;
            }
            ((MinisReportFeedbackActivity) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l1).LLJJIJIIJIL = false;
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1265980j36 viewTreeObserverOnGlobalLayoutListenerC1265980j36) {
        C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1265980j36);
        View view = (View) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l1;
        if (view != null) {
            ProfileDramaBusiness profileDramaBusiness = (ProfileDramaBusiness) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l2;
            C450720Hlu c450720Hlu = new C450720Hlu(view.getContext());
            C1391600mJi c1391600mJi = c450720Hlu.LLILLJJLI;
            c1391600mJi.LIZIZ = view;
            c1391600mJi.LIZLLL = EnumC1235690iGF.TOP;
            c450720Hlu.LJIIJ(2131839409);
            C1391600mJi c1391600mJi2 = c450720Hlu.LLILLJJLI;
            c1391600mJi2.LJII = Mp4ScreenVideoLoadTimeout.CONTROL;
            c1391600mJi2.LJIJJ = true;
            c450720Hlu.LJIIIZ(false, null);
            c450720Hlu.LIZJ(AFwS257S0000000_19.get$arr$(348));
            c450720Hlu.LJ(new AwS563S0100000_19(profileDramaBusiness, 2080));
            c450720Hlu.LIZIZ().show();
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1265980j36 viewTreeObserverOnGlobalLayoutListenerC1265980j36) {
        if (!((ViewTreeObserver) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l0).isAlive()) {
            C786410Ut5.C3(((View) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l1).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1265980j36);
        } else {
            C786410Ut5.C3((ViewTreeObserver) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l0, viewTreeObserverOnGlobalLayoutListenerC1265980j36);
        }
        ((ViewTreeObserver.OnGlobalLayoutListener) viewTreeObserverOnGlobalLayoutListenerC1265980j36.l2).onGlobalLayout();
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1265980j36(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
        this.l2 = obj3;
    }
}
