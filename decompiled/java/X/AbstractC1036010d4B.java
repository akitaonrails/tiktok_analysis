package X;

import Y.ACListenerS119S0200000_16;
import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.IABBottomBarElement;
import com.ss.android.ugc.aweme.feed.model.CommerceAgentHint;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0d4B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1036010d4B extends RelativeLayout implements InterfaceC1036210d4V {
    public boolean LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public C427660Gpo LLILZLL;
    public TuxTextView LLIZ;
    public TuxIconView LLIZLLLIL;
    public C1016930cZP LLJ;
    public Runnable LLJI;
    public C1037280d6E LLJIJIL;

    public void LIZIZ(int i, int i2, int i3, int i4) {
    }

    public void LIZJ(View view, IABBottomBarElement iABBottomBarElement) {
    }

    public void LIZLLL(MotionEvent motionEvent) {
    }

    public void LJ() {
    }

    public void LJFF(boolean z) {
    }

    public void LJI(List<CommerceAgentHint> list) {
    }

    public void LJII(boolean z) {
    }

    public void LJIIIIZZ(SparkContext sparkContext, C1016930cZP c1016930cZP, String str, Runnable runnable) {
    }

    public void LJIIIZ(boolean z) {
    }

    public void LJIIJ() {
    }

    public void LJIIJJI(boolean z) {
    }

    public void LJIIL() {
    }

    public void LJIILIIL() {
    }

    public abstract void LJIILJJIL();

    public abstract void LJIILL(boolean z);

    public abstract void LJIIZILJ(Map map, Map map2);

    public abstract TimeInterpolator getAnimInterpolator();

    public boolean getAnimatorIsRunning() {
        return false;
    }

    public View getCheckoutComponent() {
        return null;
    }

    @Override // X.InterfaceC1036210d4V
    public ViewGroup getView() {
        return this;
    }

    public void setListener(InterfaceC1036080d4I interfaceC1036080d4I) {
    }

    @Override // X.InterfaceC1036210d4V
    public final void LIZ() {
        C1037280d6E c1037280d6E = this.LLJIJIL;
        if (c1037280d6E != null) {
            c1037280d6E.LJII();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        Animator animator;
        super.onDetachedFromWindow();
        C1037280d6E c1037280d6E = this.LLJIJIL;
        if (c1037280d6E == null || (animator = c1037280d6E.LJIIJ) == null) {
            return;
        }
        animator.cancel();
    }

    public final C1016930cZP getAdLpBottomModel() {
        return this.LLJ;
    }

    public final C1037280d6E getAdWebBarMoveManager() {
        return this.LLJIJIL;
    }

    public final boolean getAiComponentBannerHadClosed() {
        return this.LLILZ;
    }

    public final boolean getAiComponentBannerIsRendering() {
        return this.LLILZIL;
    }

    public final boolean getAiComponentBannerIsShowing() {
        return this.LLILLL;
    }

    public final C427660Gpo getAvatarView() {
        return this.LLILZLL;
    }

    public final TuxIconView getBaLabel() {
        return this.LLIZLLLIL;
    }

    public final Runnable getEnterProfilePageListener() {
        return this.LLJI;
    }

    public final TuxTextView getNickName() {
        return this.LLIZ;
    }

    public final void setAdLpBottomModel(C1016930cZP c1016930cZP) {
        this.LLJ = c1016930cZP;
    }

    public final void setAdWebBarMoveManager(C1037280d6E c1037280d6E) {
        this.LLJIJIL = c1037280d6E;
    }

    public final void setAiComponentBannerHadClosed(boolean z) {
        this.LLILZ = z;
    }

    public final void setAiComponentBannerIsRendering(boolean z) {
        this.LLILZIL = z;
    }

    public final void setAiComponentBannerIsShowing(boolean z) {
        this.LLILLL = z;
    }

    public final void setAvatarView(C427660Gpo c427660Gpo) {
        this.LLILZLL = c427660Gpo;
    }

    public final void setBaLabel(TuxIconView tuxIconView) {
        this.LLIZLLLIL = tuxIconView;
    }

    public final void setEnterProfilePageListener(Runnable runnable) {
        this.LLJI = runnable;
    }

    public final void setLynx(boolean z) {
        this.LL = z;
    }

    public final void setNavigationBarShow(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setNickName(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setShowing(boolean z) {
        LJIILL(z);
    }

    public AbstractC1036010d4B(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LJIILLIIL(C1016930cZP c1016930cZP, Runnable runnable) {
        String str;
        UrlModel urlModel;
        C427660Gpo c427660Gpo;
        if (c1016930cZP != null && (urlModel = c1016930cZP.avatarUri) != null && (c427660Gpo = this.LLILZLL) != null) {
            C427660Gpo.LJIIJJI(c427660Gpo, new C03IT(urlModel.getUrlList()), false, null, null, false, false, null, null, false, null, 1020);
        }
        TuxTextView tuxTextView = this.LLIZ;
        if (tuxTextView != null) {
            if (c1016930cZP != null) {
                str = c1016930cZP.nickname;
            } else {
                str = null;
            }
            tuxTextView.setText(str);
        }
        if (c1016930cZP != null && c1016930cZP.isEnterpriseVerified()) {
            TuxIconView tuxIconView = this.LLIZLLLIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
        } else {
            TuxIconView tuxIconView2 = this.LLIZLLLIL;
            if (tuxIconView2 != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView2, 8);
            }
        }
        C427660Gpo c427660Gpo2 = this.LLILZLL;
        if (c427660Gpo2 != null) {
            C786410Ut5.T8(c427660Gpo2, new ACListenerS119S0200000_16(runnable, this, 30));
        }
        TuxTextView tuxTextView2 = this.LLIZ;
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS119S0200000_16(runnable, this, 31));
        }
        TuxIconView tuxIconView3 = this.LLIZLLLIL;
        if (tuxIconView3 != null) {
            C786410Ut5.a9(tuxIconView3, new ACListenerS119S0200000_16(runnable, this, 32));
        }
        LJIIZILJ(C2097608Jq.LJIIJ(new Pair("refer", "photo")), null);
    }

    public AbstractC1036010d4B(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLILLJJLI = true;
    }
}
