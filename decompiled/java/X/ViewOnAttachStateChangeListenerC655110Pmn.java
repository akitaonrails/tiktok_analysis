package X;

import Y.AObserverS214S0100000_10;
import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.search.GeccContentSellingPoint;
import com.ss.android.ugc.aweme.profile.model.User;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.common.viewmodel.SearchGlobalViewModel;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.ecommerce.live.IExtendedTopLiveProductView;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductView;
import com.ss.android.ugc.aweme.search.ecommerce.live.ITopLiveProductViewProvider;
import com.ss.android.ugc.aweme.search.pages.core.viewmodel.ScreenSpecsViewModel;
import com.ss.android.ugc.aweme.search.pages.result.common.core.model.SearchCardInfo;
import com.ss.android.ugc.aweme.search.source.neo.ISearchContextAbility;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.AwS219S0300000_10;
import kotlin.jvm.internal.AwS411S0200000_10;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Pmn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class ViewOnAttachStateChangeListenerC655110Pmn extends AbstractC655570PnX implements View.OnAttachStateChangeListener, InterfaceC648350Pbt {
    public static final /* synthetic */ int LLLLII = 0;
    public final C652990PjN LLJ;
    public final View LLJI;
    public C653410Pk3 LLJIJIL;
    public final C01GW LLJILJIL;
    public final C01GW LLJILJILJ;
    public final C01GW LLJILLL;
    public final C01GW LLJJ;
    public final C01GW LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public final C01GW LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public final C01GW LLJJJ;
    public final C01GW LLJJJIL;
    public final C01GW LLJJJJ;
    public final C01GW LLJJJJJIL;
    public Integer LLJJJJLIIL;
    public final C01GW LLJJL;
    public final C01GW LLJJLIIIJLLLLLLLZ;
    public final C01GW LLJL;
    public final C01GW LLJLIL;
    public final C01GW LLJLILLLLZIIL;
    public final C01GW LLJLL;
    public Aweme LLJLLIL;
    public final C658920Psw LLJLLL;
    public boolean LLJZ;
    public int LLJZIJLIL;
    public C658630PsT LLL;
    public Float LLLF;
    public InterfaceC655080Pmk LLLFF;
    public final C01GW LLLFFI;
    public InterfaceC655280Pn4 LLLFZ;
    public List<? extends InterfaceC655250Pn1> LLLI;
    public Map<String, ? extends Object> LLLII;
    public AnonymousClass0956 LLLIIII;
    public C655440PnK LLLIIIIL;
    public C654590Plx LLLIIIL;
    public InterfaceC644520PPu LLLIIL;
    public final C054G LLLIILIL;
    public boolean LLLIL;
    public boolean LLLILZ;
    public final C655020Pme LLLILZJ;
    public final C0N7E LLLILZLLLI;
    public volatile boolean LLLIZZ;
    public C653660PkS LLLJ;
    public InterfaceC655240Pn0 LLLJIL;
    public final C655490PnP LLLJL;
    public final C01GW LLLL;

    static {
        new C654840PmM();
    }

    @Override // X.AbstractC655570PnX
    public final C661470Px3 N5() {
        return null;
    }

    public final void R5() {
        IExtendedTopLiveProductView iExtendedTopLiveProductView;
        this.LLLIL = false;
        AnonymousClass0956 anonymousClass0956 = this.LLLIIII;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
        this.LLLIIII = null;
        InterfaceC655280Pn4 interfaceC655280Pn4 = this.LLLFZ;
        if (interfaceC655280Pn4 != null) {
            interfaceC655280Pn4.stop();
        }
        this.LLLFZ = null;
        Iterator<? extends InterfaceC655250Pn1> it2 = this.LLLI.iterator();
        while (it2.hasNext()) {
            it2.next().stop();
        }
        this.LLLI = C13BV.INSTANCE;
        this.LLLII = null;
        this.LLLIIIIL = null;
        this.LLLIIIL = null;
        this.LLLIIL = null;
        LinearLayout linearLayoutA6 = a6();
        if (linearLayoutA6 != null) {
            for (int childCount = linearLayoutA6.getChildCount() - 1; -1 < childCount; childCount--) {
                View childAt = linearLayoutA6.getChildAt(childCount);
                if (Intrinsics.LJFF(childAt != null ? childAt.getTag() : null, "dynamic_anchor_view")) {
                    C786410Ut5.LJJLJ(childCount, linearLayoutA6);
                } else if (childAt != null) {
                    C786410Ut5.LJLLLLLL(0, childAt);
                }
            }
            C786410Ut5.LJZL(8, linearLayoutA6);
        }
        r6(false);
        C786410Ut5.LLIL(W5(), 0);
        e6(false);
        if (this.LLLILZ || C0BT3.LIZ() == 8) {
            P5(false);
            this.LLLILZ = false;
        }
        this.LLJZ = false;
        if (X5() instanceof IExtendedTopLiveProductView) {
            ITopLiveProductView iTopLiveProductViewX5 = X5();
            if (!(iTopLiveProductViewX5 instanceof IExtendedTopLiveProductView) || (iExtendedTopLiveProductView = (IExtendedTopLiveProductView) iTopLiveProductViewX5) == null) {
                return;
            }
            iExtendedTopLiveProductView.setLiveProductSearchAbility(null);
        }
    }

    @Override // X.AbstractC655570PnX
    public final ImageView I5() {
        return (ImageView) this.itemView.findViewById(R.id.l1s);
    }

    public final C427870Gq9 U5() {
        return (C427870Gq9) this.LLJJIJIIJIL.getValue();
    }

    public final C658530PsJ V5() {
        return (C658530PsJ) this.LLJILJIL.getValue();
    }

    public final TextView W5() {
        return (TextView) this.LLJJ.getValue();
    }

    public final LinearLayout a6() {
        return (LinearLayout) this.itemView.findViewById(R.id.ry6);
    }

    public final ITopLiveProductViewProvider c6() {
        return (ITopLiveProductViewProvider) this.LLJLL.getValue();
    }

    public final C12P4 d6() {
        return (C12P4) this.itemView.findViewById(R.id.n96);
    }

    public final void h6() {
        for (InterfaceC655250Pn1 interfaceC655250Pn1 : this.LLLI) {
            if (interfaceC655250Pn1.isPlaying()) {
                interfaceC655250Pn1.pause();
            }
        }
    }

    @Override // X.AbstractC655570PnX, X.InterfaceC648350Pbt
    public final void LJJJLIIL() {
        V5().getLiveCore().LJI();
    }

    public final boolean S5() {
        ITopLiveProductViewProvider iTopLiveProductViewProviderC6 = c6();
        if (iTopLiveProductViewProviderC6 != null) {
            return iTopLiveProductViewProviderC6.shouldShow();
        }
        return false;
    }

    public final ITopLiveProductView X5() {
        LinearLayout linearLayoutA6 = a6();
        View childAt = linearLayoutA6 != null ? linearLayoutA6.getChildAt(0) : null;
        if (childAt instanceof ITopLiveProductView) {
            return (ITopLiveProductView) childAt;
        }
        return null;
    }

    public final C1012300cRw b6() {
        if (C07P0.LIZIZ()) {
            return (C1012300cRw) this.itemView.findViewById(R.id.vqk);
        }
        return null;
    }

    @Override // X.AbstractC655570PnX
    public final InterfaceC655600Pna L5() {
        return this.LLJLLL;
    }

    @Override // X.AbstractC655570PnX, X.InterfaceC648350Pbt
    public final View p0() {
        return this.itemView;
    }

    public final void P5(boolean z) {
        C19ME c19me;
        C19ME c19me2;
        C19ME c19me3;
        C19ME c19me4;
        ViewGroup.LayoutParams layoutParams = null;
        if (z) {
            ViewGroup.LayoutParams layoutParams2 = U5().getLayoutParams();
            if (layoutParams2 instanceof C19ME) {
                c19me3 = (C19ME) layoutParams2;
            } else {
                c19me3 = null;
            }
            if (c19me3 != null) {
                c19me3.bottomToTop = R.id.ry6;
                c19me3.bottomToBottom = -1;
                C786410Ut5.F6(U5(), c19me3);
            }
            C1012300cRw c1012300cRwB6 = b6();
            if (c1012300cRwB6 != null) {
                layoutParams = c1012300cRwB6.getLayoutParams();
            }
            if ((layoutParams instanceof C19ME) && (c19me4 = (C19ME) layoutParams) != null) {
                c19me4.bottomToTop = R.id.ry6;
                c19me4.bottomToBottom = -1;
                C1012300cRw c1012300cRwB62 = b6();
                if (c1012300cRwB62 != null) {
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1012300cRwB62);
                    c1012300cRwB62.setLayoutParams(c19me4);
                }
            }
            LinearLayout linearLayoutA6 = a6();
            if (linearLayoutA6 != null) {
                ViewGroup.LayoutParams layoutParams3 = linearLayoutA6.getLayoutParams();
                if (layoutParams3 != null) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams3;
                    marginLayoutParams.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
                    C786410Ut5.W5(linearLayoutA6, marginLayoutParams);
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            return;
        }
        ViewGroup.LayoutParams layoutParams4 = U5().getLayoutParams();
        if (layoutParams4 instanceof C19ME) {
            c19me = (C19ME) layoutParams4;
        } else {
            c19me = null;
        }
        if (c19me != null) {
            c19me.bottomToTop = -1;
            c19me.bottomToBottom = 0;
            C786410Ut5.F6(U5(), c19me);
        }
        C1012300cRw c1012300cRwB63 = b6();
        if (c1012300cRwB63 != null) {
            layoutParams = c1012300cRwB63.getLayoutParams();
        }
        if ((layoutParams instanceof C19ME) && (c19me2 = (C19ME) layoutParams) != null) {
            c19me2.bottomToTop = -1;
            c19me2.bottomToBottom = 0;
            C1012300cRw c1012300cRwB64 = b6();
            if (c1012300cRwB64 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1012300cRwB64);
                c1012300cRwB64.setLayoutParams(c19me2);
            }
        }
        LinearLayout linearLayoutA62 = a6();
        if (linearLayoutA62 == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams5 = linearLayoutA62.getLayoutParams();
        if (layoutParams5 != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams5;
            marginLayoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
            C786410Ut5.W5(linearLayoutA62, marginLayoutParams2);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final void e6(boolean z) {
        if (z) {
            C661350Pwr.LIZJ((View) this.LLJJIII.getValue());
        } else {
            C661350Pwr.LJIIL((View) this.LLJJIII.getValue());
        }
    }

    public final void i6(EnumC655500PnQ enumC655500PnQ) {
        C1012300cRw c1012300cRwB6;
        C2174741A9g c2174741A9g = C2174741A9g.LIZIZ;
        if (c2174741A9g.LJIILJJIL()) {
            C659080PtC.LIZ = false;
            c2174741A9g.LJIILL("general_search", enumC655500PnQ, C0SVP.STYLE_NO_BUTTON);
        }
        int i = !C659080PtC.LIZIZ() ? 1 : 0;
        C659080PtC.LIZJ(i);
        C653660PkS c653660PkS = this.LLLJ;
        if (c653660PkS == null) {
            c653660PkS = null;
        }
        C655720Pnm c655720Pnm = C655720Pnm.LIZ;
        boolean zLIZIZ = C659080PtC.LIZIZ();
        c655720Pnm.getClass();
        C655720Pnm.LIZ(zLIZIZ, c653660PkS, null);
        V5().getLiveCore().setMute(C659080PtC.LIZ(C07P0.LIZIZ() ? 1 : 0, 0, null));
        C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
        C659080PtC.LJFF();
        int i2 = C659080PtC.LIZIZ;
        c1011980cRQ.getClass();
        EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i2);
        if (enumC1012120cReLIZ != null && (c1012300cRwB6 = b6()) != null) {
            c1012300cRwB6.LIZ(enumC1012120cReLIZ, false);
        }
        Aweme aweme = this.LLJLLIL;
        if (aweme != null) {
            C663180Pzo c663180Pzo = C663180Pzo.LIZ;
            String aid = aweme.getAid();
            c663180Pzo.getClass();
            C663180Pzo.LJII(i, aid);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        C646200PWg.LJFF(V5().getLiveCore());
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        C646200PWg.LJI(V5().getLiveCore());
    }

    public final void q6(View view) {
        Context context = this.itemView.getContext();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        float fLIZLLL = C418440Gaw.LIZLLL(context);
        if (fLIZLLL < C12ES.LIZJ(375.0f, context)) {
            marginLayoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(200.0f)));
            marginLayoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Float.valueOf(320.0f)));
        } else {
            float f = fLIZLLL * 0.53333336f;
            marginLayoutParams.width = (int) f;
            marginLayoutParams.height = (int) (f * 1.6f);
        }
        int iLIZJ = (int) C12ES.LIZJ(8.0f, this.itemView.getContext());
        Integer numValueOf = Integer.valueOf(C1913107eT.LJ());
        if (numValueOf.intValue() > 0) {
            iLIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Integer.valueOf(numValueOf.intValue())));
        }
        ((ViewGroup.MarginLayoutParams) this.itemView.getLayoutParams()).setMarginEnd(iLIZJ);
        C786410Ut5.W5(view, marginLayoutParams);
    }

    public final void r6(boolean z) {
        LinearLayout linearLayoutA6 = a6();
        if (linearLayoutA6 == null) {
            return;
        }
        if (z) {
            ViewGroup.LayoutParams layoutParams = linearLayoutA6.getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Integer numValueOf = this.LLJJJJLIIL;
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(marginLayoutParams.width);
                }
                this.LLJJJJLIIL = numValueOf;
                marginLayoutParams.width = -1;
                C786410Ut5.W5(linearLayoutA6, marginLayoutParams);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        Integer num = this.LLJJJJLIIL;
        if (num != null) {
            int iIntValue = num.intValue();
            this.LLJJJJLIIL = null;
            ViewGroup.LayoutParams layoutParams2 = linearLayoutA6.getLayoutParams();
            if (layoutParams2 != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                marginLayoutParams2.width = iIntValue;
                C786410Ut5.W5(linearLayoutA6, marginLayoutParams2);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    public final C683220Qr2 T5(Aweme aweme, C654590Plx c654590Plx) {
        String roomTitle;
        String str;
        String str2;
        String str3;
        String string;
        C653660PkS c653660PkS;
        C653660PkS c653660PkS2;
        C653660PkS c653660PkS3;
        C653660PkS c653660PkS4;
        C653660PkS c653660PkS5;
        UrlModel urlModel = null;
        Integer numValueOf = null;
        C683220Qr2 c683220Qr2 = new C683220Qr2(this.LLIZLLLIL, null, null, null, null, null, null, null, false, false, false, false, aweme, null, null, 516094);
        User author = aweme.getAuthor();
        Integer num = null;
        if (author != null) {
            urlModel = author.roomCover;
        }
        c683220Qr2.LIZIZ = urlModel;
        User author2 = aweme.getAuthor();
        String str4 = "";
        if (author2 == null || (roomTitle = author2.getRoomTitle()) == null) {
            roomTitle = "";
        }
        c683220Qr2.LIZJ = roomTitle;
        if (roomTitle.length() == 0) {
            c683220Qr2.LIZJ = this.itemView.getContext().getResources().getString(2131843031);
        }
        boolean z = C0Q9J.LIZ;
        c683220Qr2.LIZLLL = C684120QsU.LIZLLL(c683220Qr2.LIZ);
        if (c654590Plx == null || (c653660PkS5 = c654590Plx.LIZIZ) == null || (str = c653660PkS5.LJJII) == null) {
            str = "";
        }
        Pair[] pairArr = new Pair[10];
        pairArr[0] = new Pair("enter_from", "general_search");
        if (c654590Plx != null && (c653660PkS4 = c654590Plx.LIZIZ) != null) {
            str2 = c653660PkS4.LJIJI;
        } else {
            str2 = null;
        }
        pairArr[1] = new Pair("search_result_id", String.valueOf(str2));
        pairArr[2] = new Pair("token_type", str);
        pairArr[3] = new Pair("is_aladdin", "1");
        if (c654590Plx != null && (c653660PkS3 = c654590Plx.LIZIZ) != null) {
            numValueOf = Integer.valueOf(c653660PkS3.LJIILL);
        }
        pairArr[4] = new Pair("rank", String.valueOf(numValueOf));
        if (c654590Plx != null && (c653660PkS2 = c654590Plx.LIZIZ) != null) {
            num = c653660PkS2.LJIILLIIL;
        }
        pairArr[5] = new Pair("universal_rank", String.valueOf(num));
        if (c654590Plx == null || (c653660PkS = c654590Plx.LIZIZ) == null || (str3 = c653660PkS.LJIIZILJ) == null) {
            str3 = "";
        }
        pairArr[6] = new Pair("insert_type", str3);
        pairArr[7] = new Pair("list_result_type", "live");
        User author3 = aweme.getAuthor();
        if (author3 != null && (string = Long.valueOf(C486180J4u.LIZ(author3)).toString()) != null) {
            str4 = string;
        }
        pairArr[8] = new Pair("list_item_id", str4);
        pairArr[9] = new Pair("aladdin_rank", String.valueOf(getLayoutPosition()));
        c683220Qr2.LJ = C2097608Jq.LJIIJ(pairArr);
        return c683220Qr2;
    }

    @Override // X.AbstractC655570PnX, X.InterfaceC648350Pbt
    public final void W0(long j, C587060N0u c587060N0u) {
        V5().getLiveCore().LLLLLIL();
        InterfaceC655240Pn0 interfaceC655240Pn0 = this.LLLJIL;
        if (interfaceC655240Pn0 != null) {
            interfaceC655240Pn0.Tu();
        }
    }

    public final void f6(Aweme aweme, C653660PkS c653660PkS, SearchCardInfo searchCardInfo) {
        String alasrc;
        String roomTitle;
        Long lValueOf;
        String str;
        Map<String, String> map;
        String couponType;
        Product product;
        String str2;
        Product product2;
        List<Product.PromotionLabel> list;
        Product product3;
        String alasrc2;
        if (c653660PkS == null) {
            return;
        }
        User author = aweme.getAuthor();
        C654740PmC c654740PmCLIZ = C645940PVg.LIZ(c653660PkS);
        c654740PmCLIZ.LJIJI("search_result_id", c653660PkS.LJIJI);
        String strLJJLIIIJ = null;
        if (searchCardInfo != null && (alasrc2 = searchCardInfo.getAlasrc()) != null && alasrc2.length() != 0) {
            if (searchCardInfo != null) {
                alasrc = searchCardInfo.getAlasrc();
            } else {
                alasrc = null;
            }
        } else {
            alasrc = "live_card";
        }
        c654740PmCLIZ.LJIIZILJ("token_type", alasrc);
        if (author != null) {
            roomTitle = author.getRoomTitle();
        } else {
            roomTitle = null;
        }
        c654740PmCLIZ.LJ("aladdin_words", roomTitle);
        c654740PmCLIZ.LJJIJL(Integer.valueOf(getLayoutPosition()));
        c654740PmCLIZ.LJIIZILJ("list_result_type", "live");
        if (author != null) {
            lValueOf = Long.valueOf(C486180J4u.LIZ(author));
        } else {
            lValueOf = null;
        }
        c654740PmCLIZ.LJIIZILJ("list_item_id", String.valueOf(lValueOf));
        c654740PmCLIZ.LJIIZILJ("aladdin_button_type", "ec_entrance");
        c654740PmCLIZ.LJIIZILJ("anchor_info", C654840PmM.LIZ(c6()));
        c654740PmCLIZ.LJIIZILJ("button_type", "ec_entrance");
        List<Product> productsInfo = aweme.getProductsInfo();
        String str3 = "";
        if (productsInfo == null || (product3 = (Product) C13LP.LJJJLL(productsInfo)) == null || (str = product3.formatPriceNumber) == null) {
            str = "";
        }
        c654740PmCLIZ.LJIIZILJ("sales_price", str);
        List<Product> productsInfo2 = aweme.getProductsInfo();
        if (productsInfo2 != null && (product2 = (Product) C13LP.LJJJLL(productsInfo2)) != null && (list = product2.promotionLabels) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator<Product.PromotionLabel> it2 = list.iterator();
            while (it2.hasNext()) {
                String str4 = it2.next().daInfo;
                if (str4 != null) {
                    arrayList.add(str4);
                }
            }
            strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "|||", null, null, 0, null, null, 62);
        }
        c654740PmCLIZ.LJIIZILJ("product_promotion_tag", strLJJLIIIJ);
        List<Product> productsInfo3 = aweme.getProductsInfo();
        if (productsInfo3 != null && (product = (Product) C13LP.LJJJLL(productsInfo3)) != null && (str2 = product.formatDiscount) != null) {
            str3 = str2;
        }
        c654740PmCLIZ.LJIIZILJ("negative_discount_rate", str3);
        ITopLiveProductViewProvider iTopLiveProductViewProviderLJJI = C1202104n5.LIZ().LJJI();
        if (iTopLiveProductViewProviderLJJI != null && (couponType = iTopLiveProductViewProviderLJJI.getCouponType(aweme)) != null) {
            c654740PmCLIZ.LJIIZILJ(iTopLiveProductViewProviderLJJI.getCouponTypeKey(), couponType);
        }
        GeccContentSellingPoint geccContentSellingPoint = aweme.getGeccContentSellingPoint();
        if (geccContentSellingPoint != null && (map = geccContentSellingPoint.logExtra) != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                c654740PmCLIZ.LJIIZILJ(entry.getKey(), entry.getValue());
            }
        }
        c654740PmCLIZ.LJIILJJIL();
    }

    /* JADX WARN: Type inference failed for: r0v51, types: [X.0Pme] */
    /* JADX WARN: Type inference failed for: r0v52, types: [X.0N7E] */
    /* JADX WARN: Type inference failed for: r0v53, types: [X.0PnP] */
    public ViewOnAttachStateChangeListenerC655110Pmn(View view, InterfaceC641090PCp interfaceC641090PCp, C652990PjN c652990PjN, InterfaceC652950PjJ interfaceC652950PjJ, View view2) {
        C19EG c19egLIZ;
        C658480PsE dataProvider;
        super(view, interfaceC641090PCp, c652990PjN, interfaceC652950PjJ);
        this.LLJ = c652990PjN;
        this.LLJI = view2;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS554S0100000_10(this, 1250));
        this.LLJILJILJ = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1246));
        this.LLJILLL = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1251));
        this.LLJJ = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1252));
        this.LLJJI = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1268));
        this.LLJJIII = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1263));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1256));
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1248));
        this.LLJJIJIL = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1255));
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1264));
        this.LLJJJ = c01gwLIZIZ;
        this.LLJJJIL = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1253));
        this.LLJJJJ = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1265));
        this.LLJJJJJIL = C452501pT.LIZIZ(new AwS554S0100000_10(view, 1267));
        this.LLJJL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1540));
        this.LLJJLIIIJLLLLLLLZ = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1541));
        this.LLJL = C452501pT.LIZIZ(new AwS411S0200000_10(view, this, 108));
        this.LLJLIL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(1542));
        this.LLJLILLLLZIIL = C452501pT.LIZIZ(new AwS411S0200000_10(view, this, 110));
        this.LLJLL = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(689));
        this.LLJLLL = new C658920Psw(V5().getLiveCore());
        this.LLLFF = C655090Pml.LIZ;
        this.LLLFFI = C452501pT.LIZIZ(new AwS411S0200000_10(view, this, 111));
        this.LLLI = C13BV.INSTANCE;
        C23119094b c23119094bLIZ = C2296908zH.LIZ();
        C1DFH c1dfh = C0PEM.LIZ;
        this.LLLIILIL = C2296808zG.LIZ(C09A1.LIZLLL(c23119094bLIZ, C2107308Nj.LIZ));
        this.LLLILZJ = new InterfaceC658750Psf() { // from class: X.0Pme
            @Override // X.InterfaceC658750Psf
            public final void onImageLoaded(boolean z, String str, JSONObject jSONObject) {
            }

            @Override // X.InterfaceC658750Psf
            public final void Ck(JSONObject jSONObject) {
                ISearchContextAbility iSearchContextAbilityLIZJ;
                Aweme aweme = this.LL.LLJLLIL;
                if (aweme != null && (iSearchContextAbilityLIZJ = C0Q3E.LIZJ(aweme)) != null) {
                    boolean z = true;
                    if (!jSONObject.optBoolean("isSuccess")) {
                        z = false;
                    }
                    iSearchContextAbilityLIZJ.fe(new C641710PEz(z));
                }
            }
        };
        this.LLLILZLLLI = new C0H62() { // from class: X.0N7E
            @Override // X.C0H62
            public final void onChange(C0O0L c0o0l, C0O0L c0o0l2) {
                if (C0N7D.LIZ[c0o0l2.ordinal()] == 1 && c0o0l != C0O0L.AVAILABLE) {
                    C1524805y2.LIZIZ(0L, new AwS554S0100000_10(this.LL, 1258));
                }
            }
        };
        this.LLLJL = new InterfaceC1399350mWD() { // from class: X.0PnP
            @Override // X.InterfaceC1399350mWD
            public final /* synthetic */ boolean Fi() {
                return false;
            }

            @Override // X.InterfaceC1399350mWD
            public final boolean onKeyDown(int i, KeyEvent keyEvent) {
                EnumC655500PnQ enumC655500PnQ;
                if (this.LL.isPlaying() && C2174741A9g.LIZIZ.LJIILJJIL()) {
                    if (i == 24 || i == 25) {
                        ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn = this.LL;
                        if (i == 24) {
                            enumC655500PnQ = EnumC655500PnQ.TURN_UP_VOLUME;
                        } else {
                            enumC655500PnQ = EnumC655500PnQ.TURN_DOWN_VOLUME;
                        }
                        viewOnAttachStateChangeListenerC655110Pmn.i6(enumC655500PnQ);
                        return false;
                    }
                    return false;
                }
                return false;
            }
        };
        this.LLLL = C452501pT.LIZIZ(new AwS411S0200000_10(view, this, 107));
        if (C301200BrK.LIZ()) {
            view.addOnAttachStateChangeListener(new C0R47(view, this, 4));
        }
        new AwS219S0300000_10(this, interfaceC641090PCp, interfaceC652950PjJ, 27).invoke(new C658910Psv());
        V5().setMCoverView((ImageView) this.itemView.findViewById(R.id.l1s));
        view.addOnAttachStateChangeListener(new C0R45(this, 46));
        C658530PsJ c658530PsJV5 = V5();
        if (c658530PsJV5 != null && (dataProvider = c658530PsJV5.getDataProvider()) != null) {
            dataProvider.LJIIJJI = new AbstractC658540PsK() { // from class: X.0Pmo
                @Override // X.AbstractC658540PsK, X.InterfaceC663110Pzh
                public final void LIZLLL() {
                    C1012300cRw c1012300cRwB6 = this.LL.b6();
                    if (c1012300cRwB6 != null) {
                        C786410Ut5.r1(c1012300cRwB6, 8);
                    }
                }

                @Override // X.AbstractC658540PsK, X.InterfaceC663110Pzh
                public final void LJII() {
                    C1012300cRw c1012300cRwB6;
                    ITopLiveProductView iTopLiveProductViewX5;
                    if (this.LL.S5() && (iTopLiveProductViewX5 = this.LL.X5()) != null) {
                        iTopLiveProductViewX5.resumeDisplay();
                    }
                    InterfaceC655280Pn4 interfaceC655280Pn4 = this.LL.LLLFZ;
                    if (interfaceC655280Pn4 != null) {
                        interfaceC655280Pn4.start();
                    }
                    for (InterfaceC655250Pn1 interfaceC655250Pn1 : this.LL.LLLI) {
                        if (!interfaceC655250Pn1.isPlaying()) {
                            interfaceC655250Pn1.start();
                        }
                    }
                    C1011980cRQ c1011980cRQ = EnumC1012120cRe.Companion;
                    C659080PtC.LJFF();
                    int i = C659080PtC.LIZIZ;
                    c1011980cRQ.getClass();
                    EnumC1012120cRe enumC1012120cReLIZ = C1011980cRQ.LIZ(i);
                    if (enumC1012120cReLIZ != null && (c1012300cRwB6 = this.LL.b6()) != null) {
                        c1012300cRwB6.LIZ(enumC1012120cReLIZ, false);
                    }
                    C1012300cRw c1012300cRwB62 = this.LL.b6();
                    if (c1012300cRwB62 != null) {
                        C786410Ut5.r1(c1012300cRwB62, 0);
                    }
                    this.LL.V5().getLiveCore().setMute(C659080PtC.LIZ(C07P0.LIZIZ() ? 1 : 0, 0, null));
                }

                @Override // X.AbstractC658540PsK, X.InterfaceC663110Pzh
                public final void onPause() {
                    ITopLiveProductView iTopLiveProductViewX5;
                    if (this.LL.S5() && (iTopLiveProductViewX5 = this.LL.X5()) != null) {
                        iTopLiveProductViewX5.pauseDisplay();
                    }
                    InterfaceC655280Pn4 interfaceC655280Pn4 = this.LL.LLLFZ;
                    if (interfaceC655280Pn4 != null) {
                        interfaceC655280Pn4.stop();
                    }
                    this.LL.h6();
                    C1012300cRw c1012300cRwB6 = this.LL.b6();
                    if (c1012300cRwB6 != null) {
                        C786410Ut5.r1(c1012300cRwB6, 8);
                    }
                }

                @Override // X.AbstractC658540PsK, X.InterfaceC663110Pzh
                public final void onError(String str) {
                    C1012300cRw c1012300cRwB6 = this.LL.b6();
                    if (c1012300cRwB6 != null) {
                        C786410Ut5.r1(c1012300cRwB6, 8);
                    }
                }

                @Override // X.AbstractC658540PsK, X.InterfaceC663110Pzh
                public final void LJI(int i, int i2, View view3) {
                    ViewOnAttachStateChangeListenerC655110Pmn viewOnAttachStateChangeListenerC655110Pmn = this.LL;
                    viewOnAttachStateChangeListenerC655110Pmn.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onLiveVideoSizeChanged: textureView: ");
                    sbLIZ.append(view3.hashCode());
                    sbLIZ.append("; width: ");
                    sbLIZ.append(i);
                    sbLIZ.append("; height: ");
                    sbLIZ.append(i2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (i > 0 && i2 > 0) {
                        int width = viewOnAttachStateChangeListenerC655110Pmn.itemView.findViewById(R.id.video_view).getWidth();
                        int height = viewOnAttachStateChangeListenerC655110Pmn.itemView.findViewById(R.id.video_view).getHeight();
                        if (width > 0 && height > 0 && view3.getLayoutParams() != null) {
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view3.getLayoutParams();
                            if (i > i2) {
                                layoutParams.gravity = 17;
                                C21565319aV.LIZIZ(view3, Float.valueOf(C12ES.LIZJ(((Number) viewOnAttachStateChangeListenerC655110Pmn.LLJLIL.getValue()).floatValue(), viewOnAttachStateChangeListenerC655110Pmn.itemView.getContext())), null, null, null, null, 30);
                            } else {
                                layoutParams.gravity = 17;
                                C21565319aV.LIZIZ(view3, Float.valueOf(C12ES.LIZJ(((Number) viewOnAttachStateChangeListenerC655110Pmn.LLJLIL.getValue()).floatValue(), viewOnAttachStateChangeListenerC655110Pmn.itemView.getContext())), null, null, null, null, 30);
                                C786410Ut5.W5(view3, layoutParams);
                            }
                        }
                    }
                }
            };
        }
        C19EG c19egLIZ2 = C657990PrR.LIZ(view);
        if (c19egLIZ2 != null) {
            C679340Qkm.LIZIZ((Fragment) this.LLILZ.getValue(), c19egLIZ2).get(SearchGlobalViewModel.class);
        }
        if (C19252910Tv.LIZIZ.LIZLLL().LJIIJ().isPad() == 1 && (c19egLIZ = C657990PrR.LIZ(view)) != null) {
            ScreenSpecsViewModel screenSpecsViewModel = (ScreenSpecsViewModel) C679340Qkm.LIZIZ((Fragment) this.LLILZ.getValue(), c19egLIZ).get(ScreenSpecsViewModel.class);
            SAFHelper sAFHelper = SAFHelper.LIZ;
            Fragment fragment = (Fragment) this.LLILZ.getValue();
            sAFHelper.getClass();
            LifecycleOwner lifecycleOwnerLJIJJ = SAFHelper.LJIJJ(fragment, c19egLIZ);
            if (lifecycleOwnerLJIJJ != null) {
                screenSpecsViewModel.vQ2().observe(lifecycleOwnerLJIJJ, new AObserverS214S0100000_10(this, 148));
            }
        }
        if (C666750QDh.LIZ()) {
            C786410Ut5.LJLLLLLL(8, (View) c01gwLIZIZ.getValue());
        }
    }
}
