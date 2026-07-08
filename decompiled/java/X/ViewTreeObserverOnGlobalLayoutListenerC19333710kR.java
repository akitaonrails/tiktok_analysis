package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.assem.tns.banner.VideoReviewStatusBarAssem;

/* JADX INFO: renamed from: X.10kR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC19333710kR implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.$t) {
            case 0:
                onGlobalLayout$0(this);
                break;
            case 1:
                onGlobalLayout$1(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC19333710kR viewTreeObserverOnGlobalLayoutListenerC19333710kR) {
        if (((VideoReviewStatusBarAssem) viewTreeObserverOnGlobalLayoutListenerC19333710kR.l0).Fp().getVisibility() == 0 && ((VideoReviewStatusBarAssem) viewTreeObserverOnGlobalLayoutListenerC19333710kR.l0).Bp().getVisibility() == 0) {
            Rect rect = new Rect();
            ((VideoReviewStatusBarAssem) viewTreeObserverOnGlobalLayoutListenerC19333710kR.l0).Bp().getHitRect(rect);
            rect.bottom += rect.top;
            rect.top = 0;
            rect.left -= ((VideoReviewStatusBarAssem) viewTreeObserverOnGlobalLayoutListenerC19333710kR.l0).Fp().getPaddingEnd();
            rect.right += ((VideoReviewStatusBarAssem) viewTreeObserverOnGlobalLayoutListenerC19333710kR.l0).Fp().getPaddingRight();
            ((VideoReviewStatusBarAssem) viewTreeObserverOnGlobalLayoutListenerC19333710kR.l0).Fp().setTouchDelegate(new TouchDelegate(rect, ((VideoReviewStatusBarAssem) viewTreeObserverOnGlobalLayoutListenerC19333710kR.l0).Bp()));
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC19333710kR viewTreeObserverOnGlobalLayoutListenerC19333710kR) {
        int width;
        ViewTreeObserver viewTreeObserver;
        View view = ((C1902360zbW) viewTreeObserverOnGlobalLayoutListenerC19333710kR.l0).LLILLL.getView();
        if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC19333710kR);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC19333710kR, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        try {
            C1902360zbW c1902360zbW = (C1902360zbW) viewTreeObserverOnGlobalLayoutListenerC19333710kR.l0;
            View view2 = c1902360zbW.LLILLL.getView();
            if (view2 != null) {
                width = view2.getWidth();
            } else {
                width = C1389340mG4.LIZJ(c1902360zbW.LL, null).LIZIZ;
            }
            c1902360zbW.update(width, -2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC19333710kR(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
