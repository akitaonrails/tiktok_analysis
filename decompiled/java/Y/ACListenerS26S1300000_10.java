package Y;

import X.C098200Yq;
import X.C0GYM;
import X.C0QER;
import X.C0R12;
import X.C189200o6;
import X.C2344009Gk;
import X.C2399609ak;
import X.C677890QiR;
import X.C679270Qkf;
import X.InterfaceC682870QqT;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.arch.SearchBffItem;
import com.ss.android.ugc.aweme.ecommerce.search.page.mix.MixFloatingLayerAssem;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.search.model.SearchResultParam;
import kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public class ACListenerS26S1300000_10 implements View.OnClickListener {
    public final int $t;
    public Object l1;
    public Object l2;
    public Object l3;
    public String s0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS26S1300000_10 aCListenerS26S1300000_10, View view) {
        InterfaceC682870QqT interfaceC682870QqT = (InterfaceC682870QqT) aCListenerS26S1300000_10.l1;
        if (interfaceC682870QqT != null) {
            interfaceC682870QqT.LJIIZILJ(aCListenerS26S1300000_10.s0);
        }
        C0R12.LIZIZ.LJIJJLI((Context) aCListenerS26S1300000_10.l2, (Aweme) aCListenerS26S1300000_10.l3, "banner", "general_search_brandhub");
    }

    public static final void onClick$1(ACListenerS26S1300000_10 aCListenerS26S1300000_10, View view) {
        Integer numValueOf;
        C0QER searchEnterParam;
        String strLIZJ;
        String pageName;
        String previousPage;
        ViewGroup viewGroup;
        SmartRouter.buildRoute(((MixFloatingLayerAssem) aCListenerS26S1300000_10.l1).getContext(), aCListenerS26S1300000_10.s0).open();
        int i = ((SearchBffItem) aCListenerS26S1300000_10.l2).type;
        if (i == 1004) {
            try {
                ((MixFloatingLayerAssem) aCListenerS26S1300000_10.l1).cp((n) aCListenerS26S1300000_10.l3);
                C189200o6.m2constructorimpl(Unit.LIZ);
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        if (i == 1008) {
            String enterSearchFrom = null;
            if ((view instanceof FrameLayout) && (viewGroup = (ViewGroup) view) != null) {
                int childCount = viewGroup.getChildCount();
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = viewGroup.getChildAt(i2);
                    if (childAt instanceof C0GYM) {
                        numValueOf = Integer.valueOf(((C0GYM) childAt).getCount());
                        break;
                    }
                }
                numValueOf = null;
            } else {
                numValueOf = null;
            }
            SearchResultParam searchResultParam = ((MixFloatingLayerAssem) aCListenerS26S1300000_10.l1).LLJILLL;
            if (searchResultParam != null) {
                searchEnterParam = searchResultParam.getSearchEnterParam();
            } else {
                searchEnterParam = null;
            }
            n value = ((MixFloatingLayerAssem) aCListenerS26S1300000_10.l1).No().LLJI.getValue();
            if (value == null || (strLIZJ = C2399609ak.LIZJ(value, "search_id")) == null) {
                strLIZJ = "";
            }
            C2344009Gk c2344009Gk = new C2344009Gk();
            c2344009Gk.LJIIIIZZ("EVENT_ORIGIN_FEATURE", "TEMAI");
            if (searchEnterParam == null || (pageName = searchEnterParam.getPageName()) == null) {
                pageName = "goods_search";
            }
            c2344009Gk.LJIIIIZZ("page_name", pageName);
            if (searchEnterParam != null) {
                previousPage = searchEnterParam.getPreviousPage();
                if (previousPage == null) {
                    previousPage = searchEnterParam.getEnterSearchFrom();
                }
            } else {
                previousPage = null;
            }
            c2344009Gk.LJIIIIZZ("previous_page", previousPage);
            if (searchEnterParam != null) {
                enterSearchFrom = searchEnterParam.getEnterSearchFrom();
            }
            c2344009Gk.LJIIIIZZ("enter_from", enterSearchFrom);
            c2344009Gk.LJIIIIZZ("notice_type", "black_number");
            c2344009Gk.LJ(numValueOf, "notice_number");
            c2344009Gk.LJIIIIZZ("cart_entrance", "search_float_cart");
            c2344009Gk.LJIIIIZZ("search_id", strLIZJ);
            C679270Qkf.LIZIZ("tiktokec_cart_entrance_click", c2344009Gk.LIZ);
        }
    }

    public ACListenerS26S1300000_10(InterfaceC682870QqT interfaceC682870QqT, String str, Context context, Aweme aweme, int i) {
        this.$t = i;
        this.l1 = interfaceC682870QqT;
        this.s0 = str;
        this.l2 = context;
        this.l3 = aweme;
    }

    public ACListenerS26S1300000_10(MixFloatingLayerAssem mixFloatingLayerAssem, String str, SearchBffItem searchBffItem, n nVar, C677890QiR c677890QiR, int i) {
        this.$t = i;
        this.l1 = mixFloatingLayerAssem;
        this.s0 = str;
        this.l2 = searchBffItem;
        this.l3 = nVar;
    }
}
