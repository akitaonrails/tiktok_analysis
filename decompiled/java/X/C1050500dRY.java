package X;

import Y.ACListenerS151S0100000_16;
import android.content.Context;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.keva.Keva;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.vcloud.strategy.StrategyCenter;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS260S0300000_16;
import kotlin.jvm.internal.AwS560S0100000_16;
import kotlin.jvm.internal.Intrinsics;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0dRY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1050500dRY extends ConstraintLayout {
    public final Aweme LL;
    public final AnchorCommonStruct LLILLJJLI;
    public final String LLILLL;
    public final Function0<Unit> LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public final C01GW LLIZ;

    private final String getAnchorData() {
        return (String) this.LLIZ.getValue();
    }

    public final void e0() {
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
        if (C04UD.LIZ()) {
            C2344009Gk c2344009GkLJI = C1065330dpT.LJI(this.LLILLJJLI, this.LL, this.LLILLL);
            c2344009GkLJI.LJFF("is_ad_signal", h0());
            C20684815ws.LJIJ("multi_anchor_entrance_click", C1065330dpT.LIZLLL(c2344009GkLJI));
        } else {
            C1050540dRc c1050540dRc = C1050540dRc.LIZ;
            Aweme aweme = this.LL;
            String strH0 = h0();
            String id = this.LLILLJJLI.getId();
            String strValueOf = String.valueOf(this.LLILLJJLI.getType());
            String str = this.LLILLL;
            c1050540dRc.getClass();
            C1050540dRc.LJI(aweme, "multi_anchor_entrance_click", strH0, id, strValueOf, str);
        }
        new C1050610dRj().LJJIII("tt_anchor_click", this.LL, this.LLILLJJLI, "comment_anchor", getAnchorData(), this.LLILLL);
        C1050540dRc c1050540dRc2 = C1050540dRc.LIZ;
        String extra = this.LLILLJJLI.getExtra();
        c1050540dRc2.getClass();
        C1050540dRc.LIZLLL(extra);
        Keva repo = Keva.getRepo("TTCM_KEVA_REPO");
        repo.storeString("anchor_extra", this.LLILLJJLI.getExtra());
        repo.storeString("group_id", this.LL.getGroupId());
        String schema = this.LLILLJJLI.getSchema();
        if (schema == null) {
            return;
        }
        SparkContext sparkContext = new SparkContext();
        sparkContext.LJJLIIJ(schema);
        Aweme aweme2 = this.LL;
        sparkContext.LJJ(C1888100zEW.class, new C1888100zEW(aweme2, this.LLILLJJLI, "comment_anchor", this.LLILLL, C1048040dNa.LIZIZ(aweme2.getAnchors())));
        C1537900q7g c1537900q7g = C1541950qED.LIZJ;
        Context context = getContext();
        c1537900q7g.getClass();
        new C1541950qED(context, sparkContext).LIZIZ();
        if (!C04UD.LIZ()) {
            C1050540dRc.LJI(this.LL, "enter_multi_anchor_detail", h0(), this.LLILLJJLI.getId(), String.valueOf(this.LLILLJJLI.getType()), this.LLILLL);
            return;
        }
        C2344009Gk c2344009GkLJFF = C1065330dpT.LJFF(this.LLILLJJLI, this.LL, this.LLILLL);
        c2344009GkLJFF.LJFF("is_ad_signal", h0());
        C20684815ws.LJIJ("enter_multi_anchor_detail", C1065330dpT.LIZLLL(c2344009GkLJFF));
    }

    public final JSONObject getBusinessData() {
        return (JSONObject) this.LLILZLL.getValue();
    }

    public final JSONObject getExtra() {
        return (JSONObject) this.LLILZIL.getValue();
    }

    public final String h0() {
        return AwemeExtKt.isAdTraffic(this.LL) ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C622680Oba.LIZJ(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C622680Oba.LIZLLL(this);
    }

    @C14EU(threadMode = ThreadMode.MAIN)
    public final void onTcmCommentAnchorShowEvent(C1050510dRZ c1050510dRZ) {
        if (!Intrinsics.LJFF(c1050510dRZ.LIZ, AwemeExtKt.getAuthorUid(this.LL)) || !Intrinsics.LJFF(c1050510dRZ.LIZIZ, this.LLILLL)) {
            return;
        }
        if (C04UD.LIZ()) {
            C2344009Gk c2344009GkLJII = C1065330dpT.LJII(this.LLILLJJLI, this.LL, this.LLILLL);
            c2344009GkLJII.LJFF("is_ad_signal", h0());
            C20684815ws.LJIJ("multi_anchor_entrance_show", C1065330dpT.LIZLLL(c2344009GkLJII));
        } else {
            C1050540dRc c1050540dRc = C1050540dRc.LIZ;
            Aweme aweme = this.LL;
            String strH0 = h0();
            String id = this.LLILLJJLI.getId();
            String strValueOf = String.valueOf(this.LLILLJJLI.getType());
            String str = this.LLILLL;
            c1050540dRc.getClass();
            C1050540dRc.LJI(aweme, "multi_anchor_entrance_show", strH0, id, strValueOf, str);
        }
        new C1050610dRj().LJJIII("tt_anchor_show", this.LL, this.LLILLJJLI, "comment_anchor", getAnchorData(), this.LLILLL);
    }

    public C1050500dRY(Context context, Aweme aweme, AnchorCommonStruct anchorCommonStruct, String str, AwS260S0300000_16 awS260S0300000_16) {
        List<String> urlList;
        String str2;
        super(context);
        this.LL = aweme;
        this.LLILLJJLI = anchorCommonStruct;
        this.LLILLL = str;
        this.LLILZ = awS260S0300000_16;
        this.LLILZIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 810));
        this.LLILZLL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 809));
        this.LLIZ = C452501pT.LIZIZ(new AwS560S0100000_16(this, StrategyCenter.ENABLE_SMART_SERVICE));
        if (!C0CNZ.LIZIZ() || C20673215v0.LJFF(context, context, R.layout.fx7, this, true) == null) {
            C786410Ut5.Td(C786410Ut5.ne(context), R.layout.fx7, this, true);
        }
        SmartImageView smartImageView = (SmartImageView) findViewById(R.id.ynz);
        TuxTextView tuxTextView = (TuxTextView) findViewById(R.id.yo1);
        TuxTextView tuxTextView2 = (TuxTextView) findViewById(R.id.yo3);
        if (tuxTextView != null) {
            tuxTextView.setText(anchorCommonStruct.getKeyword());
        }
        if (tuxTextView2 != null) {
            tuxTextView2.setText(anchorCommonStruct.getDescription());
        }
        UrlModel icon = anchorCommonStruct.getIcon();
        if (icon != null && (urlList = icon.getUrlList()) != null && (str2 = (String) C13LP.LJJJLZIJ(0, urlList)) != null) {
            C419910GdJ c419910GdJ = new C419910GdJ();
            c419910GdJ.LIZ = R.raw.icon_anchor_recommend;
            TuxIconDrawable tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
            C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(str2);
            c1331670kl3LJIIIZ.LJJIIZI(tuxIconDrawableLIZ);
            c1331670kl3LJIIIZ.LJIL(tuxIconDrawableLIZ);
            c1331670kl3LJIIIZ.LJJ(smartImageView);
            C786410Ut5.h3(c1331670kl3LJIIIZ);
        }
        if (smartImageView != null) {
            C786410Ut5.Q8(smartImageView, new ACListenerS151S0100000_16(this, 101));
        }
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS151S0100000_16(this, 102));
        }
        if (tuxTextView2 != null) {
            C786410Ut5.h9(tuxTextView2, new ACListenerS151S0100000_16(this, 103));
        }
    }
}
