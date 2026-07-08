package X;

import android.graphics.Rect;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewTreeObserver;
import com.bytedance.ies.ugc.aweme.commercialize.splash.service.ISplashAdService;
import com.ss.android.ugc.aweme.component.interestfeedbackbuttoncomponent.AnoleInterestFeedbackButtonModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.creatorvideo.SeaPdpCreatorVideoViewHolder;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e8p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class ViewTreeObserverOnPreDrawListenerC1077330e8p implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        switch (this.$t) {
            case 0:
                return onPreDraw$0(this);
            case 1:
                return onPreDraw$1(this);
            case 2:
                return onPreDraw$2(this);
            case 3:
                return onPreDraw$3(this);
            default:
                return false;
        }
    }

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1077330e8p viewTreeObserverOnPreDrawListenerC1077330e8p) {
        int width;
        if (((View) viewTreeObserverOnPreDrawListenerC1077330e8p.l0).getViewTreeObserver().isAlive() && ((View) viewTreeObserverOnPreDrawListenerC1077330e8p.l0).isShown()) {
            C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC1077330e8p.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1077330e8p);
            SeaPdpCreatorVideoViewHolder seaPdpCreatorVideoViewHolder = (SeaPdpCreatorVideoViewHolder) viewTreeObserverOnPreDrawListenerC1077330e8p.l1;
            seaPdpCreatorVideoViewHolder.LLJLLL = true;
            seaPdpCreatorVideoViewHolder.c6();
            SeaPdpCreatorVideoViewHolder seaPdpCreatorVideoViewHolder2 = (SeaPdpCreatorVideoViewHolder) viewTreeObserverOnPreDrawListenerC1077330e8p.l1;
            seaPdpCreatorVideoViewHolder2.getClass();
            if (seaPdpCreatorVideoViewHolder2.itemView.getGlobalVisibleRect(new Rect()) && (width = seaPdpCreatorVideoViewHolder2.itemView.getWidth() * seaPdpCreatorVideoViewHolder2.itemView.getHeight()) > 0) {
                C1018703yb.LJ("tiktokec_rd_creator_video_module_show", C2097908Jt.LIZJ(new Pair("visible_ratio", Float.valueOf((r4.width() * r4.height()) / width))));
            }
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1077330e8p viewTreeObserverOnPreDrawListenerC1077330e8p) {
        ((ISplashAdService) viewTreeObserverOnPreDrawListenerC1077330e8p.l0).LJJIIJZLJL(C1018070cbF.LJJIJIIJIL, System.currentTimeMillis());
        View view = (View) ((WeakReference) viewTreeObserverOnPreDrawListenerC1077330e8p.l1).get();
        if (view != null) {
            C786410Ut5.D3(view.getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1077330e8p);
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC1077330e8p viewTreeObserverOnPreDrawListenerC1077330e8p) {
        C786410Ut5.D3(((View) viewTreeObserverOnPreDrawListenerC1077330e8p.l0).getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1077330e8p);
        ((ISplashAdService) viewTreeObserverOnPreDrawListenerC1077330e8p.l1).LJJIIJZLJL(C1018070cbF.LJJIJ, System.currentTimeMillis());
        return true;
    }

    public static final boolean onPreDraw$3(ViewTreeObserverOnPreDrawListenerC1077330e8p viewTreeObserverOnPreDrawListenerC1077330e8p) {
        C197039127h c197039127h;
        View view;
        C197039127h c197039127h2;
        AnoleInterestFeedbackButtonModel anoleInterestFeedbackButtonModel;
        Integer numValueOf;
        ViewTreeObserver viewTreeObserver = ((View) viewTreeObserverOnPreDrawListenerC1077330e8p.l0).getViewTreeObserver();
        if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
            C786410Ut5.D3(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1077330e8p);
        }
        C1006980cJM c1006980cJM = (C1006980cJM) viewTreeObserverOnPreDrawListenerC1077330e8p.l1;
        View view2 = c1006980cJM.LLJJIJIL;
        if (view2 == null || (c197039127h = (C197039127h) view2.findViewById(R.id.d7t)) == null || (view = c1006980cJM.LLJJIJIL) == null || (c197039127h2 = (C197039127h) view.findViewById(R.id.d7l)) == null || (anoleInterestFeedbackButtonModel = c1006980cJM.LLJLILLLLZIIL) == null || c197039127h.getWidth() <= 0 || c197039127h2.getWidth() <= 0) {
            return true;
        }
        float fMin = Math.min(c197039127h.getTextSize(), c197039127h2.getTextSize());
        for (C197039127h c197039127h3 : C1697810uHb.LJIIJJI(c197039127h, c197039127h2)) {
            if (c197039127h3.getTextSize() > fMin) {
                c197039127h3.LJJJJLI(false);
                c197039127h3.setTextSize(0, fMin);
            }
        }
        if (Intrinsics.LJFF(anoleInterestFeedbackButtonModel.shouldShowIcon, Boolean.TRUE)) {
            TextPaint paint = c197039127h.getPaint();
            if (paint != null) {
                numValueOf = Integer.valueOf((int) paint.measureText(anoleInterestFeedbackButtonModel.buttonNoText));
            } else {
                numValueOf = null;
            }
            int width = (((c197039127h.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16))) - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            if (numValueOf != null && numValueOf.intValue() > width) {
                c197039127h.setButtonStartIcon(null);
                c197039127h2.setButtonStartIcon(null);
            }
        }
        c197039127h.requestLayout();
        c197039127h2.requestLayout();
        return true;
    }

    public ViewTreeObserverOnPreDrawListenerC1077330e8p(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
