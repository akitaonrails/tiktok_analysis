package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.ies.ugc.aweme.commwecialize.ba.service.IBAAnchorService;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.depend.AdTaskDependImpl;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.ThreadMode;

/* JADX INFO: renamed from: X.0dRR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050430dRR extends ConstraintLayout {
    public final Aweme LL;
    public final AnchorCommonStruct LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;

    public final void e0() {
        String schema = this.LLILLJJLI.getSchema();
        if (schema == null) {
            return;
        }
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        if (C04UD.LIZ()) {
            C20684815ws.LJIJ("multi_anchor_entrance_click", C1065330dpT.LIZLLL(C1065330dpT.LJI(this.LLILLJJLI, this.LL, this.LLILLL)));
        } else {
            i0("multi_anchor_entrance_click");
        }
        if (AwemeExtKt.isAdTraffic(this.LL)) {
            AwemeRawAd awemeRawAd = this.LL.getAwemeRawAd();
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("comment_ad", (awemeRawAd == null || !awemeRawAd.getEnableSoftAdAnchorClick()) ? "otherclick" : "click", this.LL.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("product_link_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
            AdTaskDependImpl.LIZLLL().LIZ(getContext(), this.LL.getAwemeRawAd(), schema, this.LL.getAid(), 69);
        } else {
            if (AwemeExtKt.isPseudoAd(this.LL)) {
                C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("comment_ad", "click", C1017070cZd.LJJIJL(this.LL));
                c1022820ciuLIZLLL2.LIZJ("product_link_anchor", "refer");
                c1022820ciuLIZLLL2.LIZIZ(this.LLILLL, "enter_from");
                c1022820ciuLIZLLL2.LJII();
            } else {
                h0("ttelite_ba_product_link_anchor_click");
            }
            ((IBAAnchorService) ServiceManager.get().getService(IBAAnchorService.class)).LJIILLIIL(69, getContext(), null, this.LLILLJJLI, this.LL, "comment_anchor", this.LLILLL, null);
            h0("ttelite_ba_video_product_anchor_9_exp");
        }
        if (C04UD.LIZ()) {
            C20684815ws.LJIJ("enter_multi_anchor_detail", C1065330dpT.LIZLLL(C1065330dpT.LJFF(this.LLILLJJLI, this.LL, this.LLILLL)));
        } else {
            i0("enter_multi_anchor_detail");
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        EventBus.LIZLLL().LJIJJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        EventBus.LIZLLL().LJJI(this);
    }

    public final void h0(String str) {
        new C1050610dRj().LJJIII(str, this.LL, this.LLILLJJLI, "comment_anchor", null, this.LLILLL);
    }

    public final void i0(String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("enter_method", "comment_anchor");
        c2344009Gk.LJIIIIZZ("enter_from", this.LLILLL);
        c2344009Gk.LJIIIIZZ("group_id", this.LL.getGroupId());
        String authorUid = AwemeExtKt.getAuthorUid(this.LL);
        if (authorUid == null) {
            authorUid = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", authorUid);
        c2344009Gk.LJIIIIZZ("music_id", C735370Ssx.LJIILIIL(this.LL));
        c2344009Gk.LJIIIIZZ("anchor_type", "TTBA_COMMENT_LINK");
        c2344009Gk.LJIIIIZZ("anchor_name", "anchor_ba_product_link");
        c2344009Gk.LJIIIIZZ("anchor_id", this.LLILLJJLI.getId());
        c2344009Gk.LJIIIIZZ("main_anchor_type", "TTBA_COMMENT_LINK");
        c2344009Gk.LIZJ(0, "multi_anchor");
        c2344009Gk.LIZJ(1, "anchor_number");
        C698670Rar c698670Rar = C698670Rar.LIZ;
        Aweme aweme = this.LL;
        String str2 = this.LLILLL;
        boolean zLJIJI = u.LJIJI("multi_anchor_entrance_show", str, true);
        c698670Rar.getClass();
        C698670Rar.LIZ(c2344009Gk, aweme, str2, zLJIJI);
        C20684815ws.LJIILLIIL(str, c2344009Gk.LIZ);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onBACommentAnchorShowEvent(C1050440dRS c1050440dRS) {
        if (!Intrinsics.LJFF(c1050440dRS.LIZ, this.LL.getAid()) || !Intrinsics.LJFF(c1050440dRS.LIZIZ, this.LLILLL)) {
            return;
        }
        if (AwemeExtKt.isAdTraffic(this.LL)) {
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL("comment_ad", "othershow", this.LL.getAwemeRawAd());
            c1022820ciuLIZLLL.LIZJ("product_link_anchor", "refer");
            c1022820ciuLIZLLL.LJII();
        } else if (AwemeExtKt.isPseudoAd(this.LL)) {
            C1022820ciu c1022820ciuLIZLLL2 = C2184171Adz.LIZLLL("comment_ad", "othershow", C1017070cZd.LJJIJL(this.LL));
            c1022820ciuLIZLLL2.LIZJ("product_link_anchor", "refer");
            c1022820ciuLIZLLL2.LIZIZ(this.LLILLL, "enter_from");
            c1022820ciuLIZLLL2.LJII();
        } else {
            h0("ttelite_ba_product_link_anchor_show");
        }
        if (C04UD.LIZ()) {
            C20684815ws.LJIJ("multi_anchor_entrance_show", C1065330dpT.LIZLLL(C1065330dpT.LJII(this.LLILLJJLI, this.LL, this.LLILLL)));
        } else {
            i0("multi_anchor_entrance_show");
        }
    }

    public C1050430dRR(Context context, Aweme aweme, AnchorCommonStruct anchorCommonStruct, String str, AwS260S0300000_16 awS260S0300000_16) {
        List<String> urlList;
        String str2;
        super(context);
        this.LL = aweme;
        this.LLILLJJLI = anchorCommonStruct;
        this.LLILLL = str;
        this.LLILZ = awS260S0300000_16;
        if (!C0CNZ.LIZIZ() || C20673215v0.LJFF(context, context, R.layout.fx6, this, true) == null) {
            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fx6, this, true);
        }
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.ynu);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.yny);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.ynw);
        if (tuxTextView != null) {
            tuxTextView.setText(anchorCommonStruct.getKeyword());
        }
        if (tuxTextView2 != null) {
            tuxTextView2.setText(anchorCommonStruct.getDescription());
        }
        UrlModel icon = anchorCommonStruct.getIcon();
        if (icon != null && (urlList = icon.getUrlList()) != null && (str2 = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_anchor_link;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ.LJJIIZI(tuxIconDrawableLIZ);
            c1331670kl3LJIIIZ.LJIL(tuxIconDrawableLIZ);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        if (smartImageView != null) {
            C786410Ut5.Q8(smartImageView, new ACListenerS151S0100000_16(this, 175));
        }
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS151S0100000_16(this, 176));
        }
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS151S0100000_16(this, 177));
        }
    }
}
