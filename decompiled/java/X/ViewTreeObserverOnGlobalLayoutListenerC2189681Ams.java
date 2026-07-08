package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.adapter.FollowLiveVideoViewHolder;
import com.ss.android.ugc.feed.platform.panel.viewpager.IViewPagerComponentAbility;
import com.ss.android.ugc.feed.platform.tablet.FastForwardButtonComponent;
import com.ss.android.ugc.feed.platform.tablet.RewindButtonComponent;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.1Ams, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC2189681Ams implements ViewTreeObserver.OnGlobalLayoutListener {
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
            case 7:
                onGlobalLayout$7(this);
                break;
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC2189681Ams viewTreeObserverOnGlobalLayoutListenerC2189681Ams) {
        if (((ViewOnKeyListenerC21552919Wl) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).isShowing() && ((ArrayList) ((ViewOnKeyListenerC21552919Wl) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).LLJ).size() > 0 && !((C19X2) ListProtector.get(((ViewOnKeyListenerC21552919Wl) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).LLJ, 0)).LIZ.LLJJJJJIL) {
            View view = ((ViewOnKeyListenerC21552919Wl) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).LLJJI;
            if (view != null && view.isShown()) {
                Iterator it2 = ((ArrayList) ((ViewOnKeyListenerC21552919Wl) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).LLJ).iterator();
                while (it2.hasNext()) {
                    ((C19X2) it2.next()).LIZ.show();
                }
                return;
            }
            ((ViewOnKeyListenerC21552919Wl) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).dismiss();
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC2189681Ams viewTreeObserverOnGlobalLayoutListenerC2189681Ams) {
        if (((ViewOnKeyListenerC21552819Wk) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).isShowing()) {
            ViewOnKeyListenerC21552819Wk viewOnKeyListenerC21552819Wk = (ViewOnKeyListenerC21552819Wk) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0;
            if (!viewOnKeyListenerC21552819Wk.LLJ.LLJJJJJIL) {
                View view = viewOnKeyListenerC21552819Wk.LLJILLL;
                if (view != null && view.isShown()) {
                    ((ViewOnKeyListenerC21552819Wk) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).LLJ.show();
                } else {
                    ((ViewOnKeyListenerC21552819Wk) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).dismiss();
                }
            }
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC2189681Ams viewTreeObserverOnGlobalLayoutListenerC2189681Ams) {
        if (!((C21553719Wt) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).getInternalPopup().isShowing()) {
            C21553719Wt c21553719Wt = (C21553719Wt) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0;
            c21553719Wt.LLILZLL.LJI(c21553719Wt.getTextDirection(), c21553719Wt.getTextAlignment());
        }
        ViewTreeObserver viewTreeObserver = ((C21553719Wt) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC2189681Ams);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC2189681Ams, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC2189681Ams viewTreeObserverOnGlobalLayoutListenerC2189681Ams) {
        C21553619Ws c21553619Ws = (C21553619Ws) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0;
        C21553719Wt c21553719Wt = c21553619Ws.LLJLLL;
        c21553619Ws.getClass();
        if (c21553719Wt.isAttachedToWindow() && c21553719Wt.getGlobalVisibleRect(c21553619Ws.LLJLL)) {
            ((C21553619Ws) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).LJ();
            ((C21553619Ws) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).show();
        } else {
            ((C21553619Ws) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).dismiss();
        }
    }

    public static final void onGlobalLayout$4(ViewTreeObserverOnGlobalLayoutListenerC2189681Ams viewTreeObserverOnGlobalLayoutListenerC2189681Ams) {
        Integer numBp;
        FastForwardButtonComponent fastForwardButtonComponent = (FastForwardButtonComponent) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0;
        View view = fastForwardButtonComponent.LLLFF;
        if (view != null && (numBp = fastForwardButtonComponent.Bp()) != null) {
            numBp.intValue();
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) fastForwardButtonComponent.LLJLLL.getValue();
            if (!C1616650sAh.LJII(numBp)) {
                C1616650sAh.LIZLLL(false, view, iViewPagerComponentAbility, true);
            }
        }
    }

    public static final void onGlobalLayout$5(ViewTreeObserverOnGlobalLayoutListenerC2189681Ams viewTreeObserverOnGlobalLayoutListenerC2189681Ams) {
        Integer numBp;
        RewindButtonComponent rewindButtonComponent = (RewindButtonComponent) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0;
        View view = rewindButtonComponent.LLLFF;
        if (view != null && (numBp = rewindButtonComponent.Bp()) != null) {
            numBp.intValue();
            IViewPagerComponentAbility iViewPagerComponentAbility = (IViewPagerComponentAbility) rewindButtonComponent.LLJLLL.getValue();
            if (!C1616650sAh.LJII(numBp)) {
                C1616650sAh.LIZLLL(false, view, iViewPagerComponentAbility, true);
            }
        }
    }

    public static final void onGlobalLayout$6(ViewTreeObserverOnGlobalLayoutListenerC2189681Ams viewTreeObserverOnGlobalLayoutListenerC2189681Ams) {
        C1AW9 c1aw9 = (C1AW9) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0;
        if (c1aw9.LJ) {
            c1aw9.LIZLLL = c1aw9.LIZ.getHeight();
            c1aw9.LJ = false;
        }
        Rect rect = new Rect();
        c1aw9.LIZ.getWindowVisibleDisplayFrame(rect);
        int i = rect.bottom - rect.top;
        if (i != c1aw9.LIZIZ) {
            int height = c1aw9.LIZ.getRootView().getHeight();
            int i2 = height - i;
            if (i2 > height / 4) {
                c1aw9.LIZJ.height = (height - i2) + c1aw9.LJFF;
            } else {
                c1aw9.LIZJ.height = c1aw9.LIZLLL;
            }
            c1aw9.LIZ.requestLayout();
            c1aw9.LIZIZ = i;
        }
    }

    public static final void onGlobalLayout$7(ViewTreeObserverOnGlobalLayoutListenerC2189681Ams viewTreeObserverOnGlobalLayoutListenerC2189681Ams) {
        C786410Ut5.A3(((FollowLiveVideoViewHolder) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).a1.getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC2189681Ams);
        View view = ((FollowLiveVideoViewHolder) viewTreeObserverOnGlobalLayoutListenerC2189681Ams.l0).a1;
        C786410Ut5.Jc(view, FollowLiveVideoViewHolder.z1(view));
    }

    public ViewTreeObserverOnGlobalLayoutListenerC2189681Ams(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
