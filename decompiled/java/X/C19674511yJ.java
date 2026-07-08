package X;

import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.BidPanel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11yJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19674511yJ extends AbstractC19674311yH {
    public final TuxTextView LLJILLL;
    public final TuxTextView LLJJ;
    public String LLJJI;
    public String LLJJIII;

    @Override // X.AbstractC19674311yH, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        AwS643S0100000_29 awS643S0100000_29 = new AwS643S0100000_29(this, 95);
        AbstractC212300186g bidCardView = getBidCardView();
        if (bidCardView instanceof C212301186h) {
            ((C212301186h) bidCardView).setCountDownUpdateCallback(awS643S0100000_29);
        } else if (bidCardView instanceof C212306186m) {
            ((C212306186m) bidCardView).setCountDownUpdateCallback(awS643S0100000_29);
        }
        AbstractC212300186g bidCardView2 = getBidCardView();
        if (bidCardView2 != null) {
            Context context = getContext();
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(12)));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a1d);
            bidCardView2.setBackground(c384050F3z.LIZ(context));
        }
    }

    @Override // X.AbstractC19674311yH
    public void setPopProduct(UsPopupCardVO usPopupCardVO) {
        String str;
        BidPanel bidPanel;
        String str2;
        BidPanel bidPanel2;
        String str3 = "";
        this.LLJJ.setText("");
        AbstractC212300186g bidCardView = getBidCardView();
        C1217030hm9 c1217030hm9 = new C1217030hm9(this.LLJJ);
        if (bidCardView instanceof C212301186h) {
            ((C212301186h) bidCardView).setExtendedAddTimeHelper(c1217030hm9);
        } else if (bidCardView instanceof C212306186m) {
            ((C212306186m) bidCardView).setExtendedAddTimeHelper(c1217030hm9);
        }
        super.setPopProduct(usPopupCardVO);
        AuctionData auctionData = usPopupCardVO.auctionData;
        if (auctionData == null || (bidPanel2 = auctionData.bidPanel) == null || (str = bidPanel2.topTitleWithCountdown) == null) {
            str = "";
        }
        this.LLJJI = str;
        if (auctionData != null && (bidPanel = auctionData.bidPanel) != null && (str2 = bidPanel.topTitle) != null) {
            str3 = str2;
        }
        this.LLJJIII = str3;
    }

    public C19674511yJ(Context context, UsBidViewModel usBidViewModel, C19EG c19eg, Function0 function0) {
        super(context, null, 0, usBidViewModel, c19eg, function0);
        this.LLJJI = "";
        this.LLJJIII = "";
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp));
        if (layoutInflaterCloneInContext != null) {
            C786410Ut5.Sd(R.layout.bww, layoutInflaterCloneInContext, this);
        }
        setEcommerceliveBtnBid((C197039127h) findViewById(R.id.gkd));
        setEcommerceliveBtnMaxBid((C197039127h) findViewById(R.id.gki));
        setShipmentIcon((SmartImageView) findViewById(R.id.v5g));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.bzf);
        C212301186h c212301186h = new C212301186h(context);
        c212301186h.setId(R.id.bzg);
        viewGroup.addView(c212301186h, new ViewGroup.LayoutParams(-1, -2));
        setBidCardView(c212301186h);
        AbstractC212300186g bidCardView = getBidCardView();
        if (bidCardView != null) {
            ViewGroup.LayoutParams layoutParams = bidCardView.getLayoutParams();
            C0H1U.LJIIJ(C0H9H.LIZIZ(12), bidCardView);
            C0H1U.LJII(C0H9H.LIZIZ(12), bidCardView);
            C0H1U.LJIIIIZZ(C0H9H.LIZIZ(14), bidCardView);
            C0H1U.LJIIIZ(C0H9H.LIZIZ(14), bidCardView);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(bidCardView);
            bidCardView.setLayoutParams(layoutParams);
        }
        this.LLJILLL = (TuxTextView) findViewById(R.id.yb_);
        this.LLJJ = (TuxTextView) findViewById(R.id.hib);
        setTipInfoLayout((LinearLayout) findViewById(R.id.bzl));
        setMaxBidClickAction(new AwS238S0300000_29(this, usBidViewModel, context, 2));
    }
}
