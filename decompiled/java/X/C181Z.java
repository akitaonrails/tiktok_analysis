package X;

import Y.ARunnableS101S0200000_32;
import android.content.Context;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.page.SparkPopup;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.bidding.UsBidViewModel;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.AuctionData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.data.SurpriseSetData;
import com.ss.android.ugc.aweme.ecommercelive.common.biz.us.popcard.vo.UsPopupCardVO;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.ECImage;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS576S0100000_32;
import kotlin.jvm.internal.AwS646S0100000_32;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.181Z, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C181Z extends C181R implements InterfaceC19677911yr {
    public final C19EG LLJILJIL;
    public final TuxTextView LLJILJILJ;
    public final TuxTextView LLJILLL;
    public final TuxTextView LLJJ;
    public String LLJJI;
    public boolean LLJJIII;
    public String LLJJIJI;
    public final SmartImageView LLJJIJIIJIL;
    public final LinearLayout LLJJIJIL;
    public List<Integer> LLJJJ;
    public String LLJJJIL;

    @Override // X.InterfaceC1865210ydb
    public final Map<String, String> LJLLL(String str) {
        return null;
    }

    public final void C0() {
        TuxTextView tuxTextView = this.LLJILLL;
        if (tuxTextView != null) {
            C786410Ut5.B5(tuxTextView, 1.0f);
        }
        TuxTextView tuxTextView2 = this.LLJJ;
        if (tuxTextView2 != null) {
            C786410Ut5.B5(tuxTextView2, 1.0f);
        }
    }

    @Override // X.C181R
    public final void z0() {
        C786410Ut5.I7(new C19LP(this, 9), this);
    }

    @Override // X.C181R, X.AbstractC21202917yF
    public final void e0() {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        List<Fragment> listLJJLIIIJL;
        SparkPopup sparkPopup;
        SparkContext sparkContext;
        String strLJIJI;
        super.e0();
        Context context = getContext();
        if (context == null || (c19egLIZIZ = C1388190mED.LIZIZ(context)) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null || (listLJJLIIIJL = supportFragmentManager.LJJLIIIJL()) == null) {
            return;
        }
        for (Fragment fragment : listLJJLIIIJL) {
            if ((fragment instanceof SparkPopup) && (sparkPopup = (SparkPopup) fragment) != null && (sparkContext = sparkPopup.LLJIJIL) != null && (strLJIJI = sparkContext.LJIJI()) != null && a0.LJJIIZI(strLJIJI, "live_auction_surprise_set", false)) {
                sparkPopup.gS(true);
                return;
            }
        }
    }

    @Override // X.C181R, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        UsBidViewModel bidVM = getBidVM();
        if (bidVM != null) {
            bidVM.CQ2(this);
        }
    }

    @Override // X.C181R
    public final void p0() {
        C19EG c19egLIZIZ;
        FragmentManager supportFragmentManager;
        super.p0();
        if (this.LLIZ || (c19egLIZIZ = C1388190mED.LIZIZ(getContext())) == null || (supportFragmentManager = c19egLIZIZ.getSupportFragmentManager()) == null) {
            return;
        }
        C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
        c1390920mIc.LIZ.LLJJIII = new C19674511yJ(getContext(), getBidVM(), this.LLJILJIL, new AwS576S0100000_32(this, 36));
        c1390920mIc.LJIIIIZZ(1);
        TuxSheet tuxSheet = c1390920mIc.LIZ;
        tuxSheet.LLJJIJIIJIL = false;
        tuxSheet.LLJLLL = true;
        setTuxSheet(tuxSheet);
        TuxSheet tuxSheet2 = getTuxSheet();
        if (tuxSheet2 != null) {
            tuxSheet2.show(supportFragmentManager, "biddingFragment");
        }
    }

    @Override // X.C181R
    public final void s0() {
        super.s0();
        C19673611yA.LIZ(this.LLJILJIL, getBidVM());
    }

    public final C19EG getActivityContext() {
        return this.LLJILJIL;
    }

    public final void E0(Integer num) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int iIntValue;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        ViewGroup.MarginLayoutParams marginLayoutParams3;
        if (this.LLIZ) {
            AbstractC212300186g bidCardView = getBidCardView();
            if (bidCardView != null) {
                bidCardView.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
            }
            View viewFindViewById = findViewById(R.id.bzf);
            if (viewFindViewById != null) {
                ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
                if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                    marginLayoutParams3.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(84));
                    return;
                }
                return;
            }
            return;
        }
        if (num != null && ((iIntValue = num.intValue()) == 30 || iIntValue == 31 || iIntValue == 32 || iIntValue == 33)) {
            C337180DJs.LIZ(this.LLJJIJIL);
            AbstractC212300186g bidCardView2 = getBidCardView();
            if (bidCardView2 != null) {
                bidCardView2.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(82));
            }
            View viewFindViewById2 = findViewById(R.id.bzf);
            if (viewFindViewById2 == null) {
                return;
            }
            ViewGroup.LayoutParams layoutParams2 = viewFindViewById2.getLayoutParams();
            if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                return;
            }
            marginLayoutParams2.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(82));
            return;
        }
        C03DZ.LIZJ(this.LLJJIJIL);
        AbstractC212300186g bidCardView3 = getBidCardView();
        if (bidCardView3 != null) {
            bidCardView3.getLayoutParams().height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(61));
        }
        View viewFindViewById3 = findViewById(R.id.bzf);
        if (viewFindViewById3 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = viewFindViewById3.getLayoutParams();
        if (!(layoutParams3 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
            return;
        }
        marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(61));
    }

    @Override // X.InterfaceC19677911yr
    public final void LJLIIIL(C181U c181u) {
        C2487409ou.LIZJ(new ARunnableS101S0200000_32(this, c181u, 9));
    }

    public final void setAuctionData(C181U c181u) {
        Integer numValueOf;
        if (c181u != null) {
            numValueOf = Integer.valueOf(c181u.LJI);
        } else {
            numValueOf = null;
        }
        E0(numValueOf);
    }

    @Override // X.C181R
    public final void u0(UsPopupCardVO usPopupCardVO, boolean z) {
        Integer numValueOf;
        String str;
        List<Integer> list;
        String str2;
        C212301186h c212301186h;
        SurpriseSetData surpriseSetData;
        ECImage eCImage;
        SurpriseSetData surpriseSetData2;
        SurpriseSetData surpriseSetData3;
        AuctionData auctionData = usPopupCardVO.auctionData;
        String str3 = null;
        if (auctionData != null) {
            numValueOf = Integer.valueOf(auctionData.auctionStatus);
        } else {
            numValueOf = null;
        }
        AuctionData auctionData2 = usPopupCardVO.auctionData;
        if (auctionData2 == null || (surpriseSetData3 = auctionData2.surpriseSetData) == null || (str = surpriseSetData3.topTitle) == null) {
            str = "";
        }
        this.LLJJIJI = str;
        if (auctionData2 != null && (surpriseSetData2 = auctionData2.surpriseSetData) != null) {
            list = surpriseSetData2.allowStatusClick;
        } else {
            list = null;
        }
        this.LLJJJ = list;
        if (auctionData2 != null) {
            str2 = auctionData2.schema;
        } else {
            str2 = null;
        }
        this.LLJJJIL = str2;
        C19411510wz c19411510wz = C19411510wz.LIZ;
        EnumC1769850w9n enumC1769850w9n = EnumC1769850w9n.LIVE_SURPRISE_AUCTION_CARD_ICON;
        SmartImageView smartImageView = this.LLJJIJIIJIL;
        if (auctionData2 != null && (surpriseSetData = auctionData2.surpriseSetData) != null && (eCImage = surpriseSetData.auctionIconLight) != null) {
            str3 = eCImage.url;
        }
        c19411510wz.LJ(enumC1769850w9n, smartImageView, str3);
        AbstractC212300186g bidCardView = getBidCardView();
        if (!(bidCardView instanceof C212304186k) && (bidCardView instanceof C212301186h)) {
            AbstractC212300186g bidCardView2 = getBidCardView();
            if ((bidCardView2 instanceof C212301186h) && (c212301186h = (C212301186h) bidCardView2) != null) {
                this.LLJILJILJ.setText("");
                c212301186h.setExtendedAddTimeHelper(new C1217030hm9(this.LLJILJILJ));
                c212301186h.setCountDownUpdateCallback(new AwS646S0100000_32(this, 7));
            }
        }
        super.u0(usPopupCardVO, z);
        E0(numValueOf);
    }

    public C181Z(Context context, UsBidViewModel usBidViewModel, C19EG c19eg, boolean z) {
        int i;
        AbstractC212300186g c212301186h;
        super(context, null, 0, usBidViewModel, c19eg, z);
        this.LLJILJIL = c19eg;
        this.LLJJI = "";
        this.LLJJIJI = "";
        LayoutInflater layoutInflaterCloneInContext = C786410Ut5.ne(context).cloneInContext(new ContextThemeWrapper(context, R.style.acp));
        if (z) {
            i = R.layout.bx0;
        } else {
            i = R.layout.bwz;
        }
        C786410Ut5.Sd(i, layoutInflaterCloneInContext, this);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(8));
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ee);
        setBackground(c384050F3z.LIZ(context));
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.bzf);
        if (z) {
            c212301186h = new C212304186k(context, null, 0);
        } else {
            c212301186h = new C212301186h(context);
        }
        viewGroup.addView(c212301186h);
        setBidCardView(c212301186h);
        setIconClose(findViewById(R.id.gl8));
        this.LLJILJILJ = (TuxTextView) findViewById(R.id.hib);
        this.LLJILLL = (TuxTextView) findViewById(R.id.yb9);
        this.LLJJ = (TuxTextView) findViewById(R.id.yb7);
        this.LLJJIJIIJIL = (SmartImageView) findViewById(R.id.bzi);
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.wqe);
        this.LLJJIJIL = linearLayout;
        if (z) {
            C337180DJs.LIZ(linearLayout);
        }
    }
}
