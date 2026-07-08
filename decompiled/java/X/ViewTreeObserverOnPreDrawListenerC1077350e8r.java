package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.autofill.model.AdAutofillModel;
import com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegateKt;
import com.ss.android.ugc.aweme.relation.ffp.ui.RecFriendsEmptyFragment;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import com.ss.android.ugc.aweme.tako.multipletemplate.album.TakoMediaChooseAlbumAssem;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0e8r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class ViewTreeObserverOnPreDrawListenerC1077350e8r implements ViewTreeObserver.OnPreDrawListener {
    public final int $t;
    public Object l0;

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

    public static final boolean onPreDraw$0(ViewTreeObserverOnPreDrawListenerC1077350e8r viewTreeObserverOnPreDrawListenerC1077350e8r) {
        View view;
        ViewTreeObserver viewTreeObserver;
        C588810N7n c588810N7n = C588810N7n.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c588810N7n.getClass();
        C588810N7n.LIZLLL = jCurrentTimeMillis;
        View view2 = ((CommerceVideoDelegateKt) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).awesomeSplashMask;
        if (view2 != null && view2.getViewTreeObserver() != null && (view = ((CommerceVideoDelegateKt) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).awesomeSplashMask) != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1077350e8r);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1077350e8r, ViewTreeObserver.OnPreDrawListener.class);
            return true;
        }
        return true;
    }

    public static final boolean onPreDraw$1(ViewTreeObserverOnPreDrawListenerC1077350e8r viewTreeObserverOnPreDrawListenerC1077350e8r) {
        boolean z;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("addOnPreDrawListener: powerList.height=");
        sbLIZ.append(((RecFriendsEmptyFragment) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).getPowerList().getHeight());
        sbLIZ.append(", numberOfChunks=");
        sbLIZ.append(((RecFriendsEmptyFragment) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).LLJILJIL);
        sbLIZ.append(" and statusView.visibility is ");
        if (((RecFriendsEmptyFragment) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).dS().getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        if (((RecFriendsEmptyFragment) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).getPowerList().getHeight() > 0) {
            RecFriendsEmptyFragment recFriendsEmptyFragment = (RecFriendsEmptyFragment) viewTreeObserverOnPreDrawListenerC1077350e8r.l0;
            if (recFriendsEmptyFragment.LLJILJIL > 0) {
                recFriendsEmptyFragment.hS();
                C786410Ut5.D3(((RecFriendsEmptyFragment) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).getPowerList().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1077350e8r);
                return true;
            }
        }
        return false;
    }

    public static final boolean onPreDraw$2(ViewTreeObserverOnPreDrawListenerC1077350e8r viewTreeObserverOnPreDrawListenerC1077350e8r) {
        int fullScreenHeight;
        View view;
        Object parent = ((TakoMediaChooseAlbumAssem) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).LJJIJL().getParent();
        if ((parent instanceof View) && (view = (View) parent) != null) {
            fullScreenHeight = view.getHeight();
        } else {
            fullScreenHeight = ScreenUtils.getFullScreenHeight(((TakoMediaChooseAlbumAssem) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).getContext());
        }
        C786410Ut5.ed(((TakoMediaChooseAlbumAssem) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).LJJIJL(), -fullScreenHeight);
        C786410Ut5.LJLLLLLL(4, ((TakoMediaChooseAlbumAssem) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).LJJIJL());
        C786410Ut5.D3(((TakoMediaChooseAlbumAssem) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).LJJIJL().getViewTreeObserver(), viewTreeObserverOnPreDrawListenerC1077350e8r);
        return true;
    }

    public static final boolean onPreDraw$3(ViewTreeObserverOnPreDrawListenerC1077350e8r viewTreeObserverOnPreDrawListenerC1077350e8r) {
        RelativeLayout relativeLayout;
        int marginStart;
        ViewTreeObserver viewTreeObserver;
        C1069080dvW c1069080dvW = (C1069080dvW) viewTreeObserverOnPreDrawListenerC1077350e8r.l0;
        TuxIconView tuxIconView = c1069080dvW.LLLJIL;
        if (tuxIconView == null || (relativeLayout = c1069080dvW.LLLILZLLLI) == null || relativeLayout.getWidth() == 0 || tuxIconView.getWidth() == 0) {
            return true;
        }
        RelativeLayout relativeLayout2 = ((C1069080dvW) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).LLLIZZ;
        if (relativeLayout2 != null && (viewTreeObserver = relativeLayout2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnPreDrawListener(viewTreeObserverOnPreDrawListenerC1077350e8r);
            C2187701Ajg.LIZIZ(viewTreeObserver, viewTreeObserverOnPreDrawListenerC1077350e8r, ViewTreeObserver.OnPreDrawListener.class);
        }
        C1069080dvW c1069080dvW2 = (C1069080dvW) viewTreeObserverOnPreDrawListenerC1077350e8r.l0;
        int width = tuxIconView.getWidth();
        ViewGroup.LayoutParams layoutParams = tuxIconView.getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            marginStart = ((ViewGroup.MarginLayoutParams) layoutParams).getMarginStart();
        } else {
            marginStart = 0;
        }
        c1069080dvW2.LLLLLLIL = width + marginStart;
        ((C1069080dvW) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).LLLLLLJ = relativeLayout.getWidth();
        RelativeLayout relativeLayout3 = ((C1069080dvW) viewTreeObserverOnPreDrawListenerC1077350e8r.l0).LLLILZLLLI;
        if (relativeLayout3 != null) {
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(relativeLayout3, null);
            relativeLayout3.removeAllViews();
        }
        C1069080dvW c1069080dvW3 = (C1069080dvW) viewTreeObserverOnPreDrawListenerC1077350e8r.l0;
        c1069080dvW3.LLLLJI = 0;
        c1069080dvW3.LLLLL = null;
        c1069080dvW3.LLLLLIL = null;
        C1069080dvW c1069080dvW4 = (C1069080dvW) viewTreeObserverOnPreDrawListenerC1077350e8r.l0;
        c1069080dvW4.getClass();
        AdAutofillModel adAutofillModelLJIIL = C1067990dtl.LJIIL();
        c1069080dvW4.LJIILL(R.id.bfq, "first_name", adAutofillModelLJIIL.firstName, false);
        c1069080dvW4.LJIILL(R.id.bfs, "last_name", adAutofillModelLJIIL.lastName, false);
        c1069080dvW4.LJIILL(R.id.bfl, "address", adAutofillModelLJIIL.address, true);
        c1069080dvW4.LJIILL(R.id.bfz, "unit", adAutofillModelLJIIL.unit, false);
        c1069080dvW4.LJIILL(R.id.bfn, "city", adAutofillModelLJIIL.city, false);
        c1069080dvW4.LJIILL(R.id.bfw, "state", adAutofillModelLJIIL.state, false);
        c1069080dvW4.LJIILL(R.id.bg0, "zip_code", adAutofillModelLJIIL.zipCode, false);
        c1069080dvW4.LJIILL(R.id.bfo, "country", adAutofillModelLJIIL.country, false);
        c1069080dvW4.LJIILL(R.id.bfp, "email", adAutofillModelLJIIL.email, true);
        c1069080dvW4.LJIILL(R.id.bfu, "mobile", adAutofillModelLJIIL.mobile, true);
        return false;
    }

    public ViewTreeObserverOnPreDrawListenerC1077350e8r(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
