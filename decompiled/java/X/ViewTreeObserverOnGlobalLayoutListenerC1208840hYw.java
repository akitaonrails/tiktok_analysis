package X;

import Y.ARunnableS118S0100000_18;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.inbox.bulletin.BulletinQuickEditInputBoxFragment;
import com.ss.android.ugc.aweme.poi.reviews.landing.ui.PoiReviewsContentAssem;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS256S0000000_18;

/* JADX INFO: renamed from: X.0hYw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public class ViewTreeObserverOnGlobalLayoutListenerC1208840hYw implements ViewTreeObserver.OnGlobalLayoutListener {
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
        }
    }

    public static final void onGlobalLayout$0(ViewTreeObserverOnGlobalLayoutListenerC1208840hYw viewTreeObserverOnGlobalLayoutListenerC1208840hYw) {
        C786410Ut5.C3(((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1208840hYw);
        if (((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).getLineCount() == 2) {
            ((TuxTextView) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).setTuxFont(82);
        }
    }

    public static final void onGlobalLayout$1(ViewTreeObserverOnGlobalLayoutListenerC1208840hYw viewTreeObserverOnGlobalLayoutListenerC1208840hYw) {
        ViewTreeObserver viewTreeObserver;
        BulletinQuickEditInputBoxFragment bulletinQuickEditInputBoxFragment = (BulletinQuickEditInputBoxFragment) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0;
        C0I7D c0i7d = bulletinQuickEditInputBoxFragment.LLILZ;
        if (c0i7d != null) {
            HandlerHook.viewPostDelay(c0i7d, new ARunnableS118S0100000_18(bulletinQuickEditInputBoxFragment, 19), 200L);
        }
        C0I7D c0i7d2 = ((BulletinQuickEditInputBoxFragment) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).LLILZ;
        if (c0i7d2 != null && (viewTreeObserver = c0i7d2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1208840hYw);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1208840hYw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
    }

    public static final void onGlobalLayout$2(ViewTreeObserverOnGlobalLayoutListenerC1208840hYw viewTreeObserverOnGlobalLayoutListenerC1208840hYw) {
        LinearLayout.LayoutParams layoutParams;
        LinearLayout.LayoutParams layoutParams2;
        C786410Ut5.C3(((C1196500hF2) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).getContentView().getViewTreeObserver(), viewTreeObserverOnGlobalLayoutListenerC1208840hYw);
        View viewFindViewById = ((C1196500hF2) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).getContentView().findViewById(R.id.lkw);
        View viewFindViewById2 = ((C1196500hF2) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).getContentView().findViewById(R.id.lc0);
        int lineCount = ((TextView) ((C1196500hF2) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).getContentView().findViewById(R.id.tv_title)).getLineCount();
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById.getLayoutParams();
        if (layoutParams3 instanceof LinearLayout.LayoutParams) {
            layoutParams = (LinearLayout.LayoutParams) layoutParams3;
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            if (lineCount == 1) {
                layoutParams.gravity = 16;
                layoutParams.topMargin = 0;
                layoutParams.bottomMargin = 0;
            }
            C786410Ut5.W5(viewFindViewById, layoutParams);
        }
        ViewGroup.LayoutParams layoutParams4 = viewFindViewById2.getLayoutParams();
        if ((layoutParams4 instanceof LinearLayout.LayoutParams) && (layoutParams2 = (LinearLayout.LayoutParams) layoutParams4) != null) {
            if (lineCount == 1) {
                layoutParams2.gravity = 16;
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
            }
            C786410Ut5.W5(viewFindViewById2, layoutParams2);
        }
    }

    public static final void onGlobalLayout$3(ViewTreeObserverOnGlobalLayoutListenerC1208840hYw viewTreeObserverOnGlobalLayoutListenerC1208840hYw) {
        C08QU c08quLJIJI;
        PoiReviewsContentAssem poiReviewsContentAssem;
        C425980Gn6 c425980Gn6;
        ViewTreeObserver viewTreeObserver;
        C425980Gn6 c425980Gn62 = ((PoiReviewsContentAssem) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).LLJJIJIIJIL;
        if (c425980Gn62 != null && (viewTreeObserver = c425980Gn62.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnGlobalLayoutListener(viewTreeObserverOnGlobalLayoutListenerC1208840hYw);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnGlobalLayoutListenerC1208840hYw, ViewTreeObserver.OnGlobalLayoutListener.class);
        }
        C425980Gn6 c425980Gn63 = ((PoiReviewsContentAssem) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).LLJJIJIIJIL;
        if (c425980Gn63 != null && (c08quLJIJI = C09RB.LJIJI(C09RB.LJIIIZ(new C09RD(c425980Gn63), AFwS256S0000000_18.get$arr$(896)), AFwS256S0000000_18.get$arr$(897))) != null && C09RB.LJIILL(c08quLJIJI, ((PoiReviewsContentAssem) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).No().LLJILJILJ) >= 0 && (c425980Gn6 = (poiReviewsContentAssem = (PoiReviewsContentAssem) viewTreeObserverOnGlobalLayoutListenerC1208840hYw.l0).LLJJIJIIJIL) != null) {
            HandlerHook.viewPost(c425980Gn6, new ARunnableS118S0100000_18(poiReviewsContentAssem, 70));
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC1208840hYw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
