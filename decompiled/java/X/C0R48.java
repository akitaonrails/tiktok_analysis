package X;

import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveAssem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreLiveV2Assem;
import com.ss.android.ugc.aweme.ecommerce.search.general.storecard.skeleton.EcStoreNoLiveAssem;
import com.ss.android.ugc.aweme.search.arch.v2.protocol.card.components.topbar.hub.viewmodel.SearchHubNativeViewModel;
import com.ss.android.ugc.aweme.search.arch.v2.services.SearchServiceCenter$AutoPlayAbility;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.search.ecom.data.Product;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.ISearchAwemePoolCompatParentAbility;
import com.ss.android.ugc.aweme.search.lynx.xsearch.newsearchlist.viewmodel.SearchListPlayer;
import com.ss.android.ugc.aweme.search.pages.result.common.searchvideo.core.ui.SearchAwemeCardViewHolder;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.core.ability.SearchTopFragmentAbility;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS554S0100000_10;
import kotlin.jvm.internal.AwS589S0100000_10;
import kotlin.jvm.internal.AwS61S1000000_10;
import org.greenrobot.eventbus.EventBus;

/* JADX INFO: renamed from: X.0R48, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R48 implements View.OnAttachStateChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    public static final void onViewDetachedFromWindow$15(C0R48 c0r48, View view) {
    }

    public static final void onViewDetachedFromWindow$18(C0R48 c0r48, View view) {
    }

    public static final void onViewDetachedFromWindow$19(C0R48 c0r48, View view) {
    }

    public static final void onViewDetachedFromWindow$21(C0R48 c0r48, View view) {
    }

    public static final void onViewDetachedFromWindow$3(C0R48 c0r48, View view) {
    }

    public static final void onViewDetachedFromWindow$4(C0R48 c0r48, View view) {
    }

    public static final void onViewDetachedFromWindow$6(C0R48 c0r48, View view) {
    }

    public static final void onViewDetachedFromWindow$7(C0R48 c0r48, View view) {
    }

    public static final void onViewDetachedFromWindow$8(C0R48 c0r48, View view) {
    }

    public static final void onViewDetachedFromWindow$9(C0R48 c0r48, View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewAttachedToWindow$0(this, view);
                break;
            case 1:
                onViewAttachedToWindow$1(this, view);
                break;
            case 2:
                onViewAttachedToWindow$2(this, view);
                break;
            case 3:
                onViewAttachedToWindow$3(this, view);
                break;
            case 4:
                onViewAttachedToWindow$4(this, view);
                break;
            case 5:
                onViewAttachedToWindow$5(this, view);
                break;
            case 6:
                onViewAttachedToWindow$6(this, view);
                break;
            case 7:
                onViewAttachedToWindow$7(this, view);
                break;
            case 8:
                onViewAttachedToWindow$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onViewAttachedToWindow$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onViewAttachedToWindow$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onViewAttachedToWindow$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onViewAttachedToWindow$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onViewAttachedToWindow$13(this, view);
                break;
            case 14:
                onViewAttachedToWindow$14(this, view);
                break;
            case 15:
                onViewAttachedToWindow$15(this, view);
                break;
            case 16:
                onViewAttachedToWindow$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onViewAttachedToWindow$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onViewAttachedToWindow$18(this, view);
                break;
            case 19:
                onViewAttachedToWindow$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onViewAttachedToWindow$20(this, view);
                break;
            case 21:
                onViewAttachedToWindow$21(this, view);
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        switch (this.$t) {
            case 0:
                onViewDetachedFromWindow$0(this, view);
                break;
            case 1:
                onViewDetachedFromWindow$1(this, view);
                break;
            case 2:
                onViewDetachedFromWindow$2(this, view);
                break;
            case 3:
                onViewDetachedFromWindow$3(this, view);
                break;
            case 4:
                onViewDetachedFromWindow$4(this, view);
                break;
            case 5:
                onViewDetachedFromWindow$5(this, view);
                break;
            case 6:
                onViewDetachedFromWindow$6(this, view);
                break;
            case 7:
                onViewDetachedFromWindow$7(this, view);
                break;
            case 8:
                onViewDetachedFromWindow$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onViewDetachedFromWindow$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onViewDetachedFromWindow$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onViewDetachedFromWindow$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onViewDetachedFromWindow$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onViewDetachedFromWindow$13(this, view);
                break;
            case 14:
                onViewDetachedFromWindow$14(this, view);
                break;
            case 15:
                onViewDetachedFromWindow$15(this, view);
                break;
            case 16:
                onViewDetachedFromWindow$16(this, view);
                break;
            case LiveToolbarIconStyleSetting.GRAY_WITH_TEXT /* 17 */:
                onViewDetachedFromWindow$17(this, view);
                break;
            case LiveToolbarIconStyleSetting.COLORFUL_WITH_TEXT /* 18 */:
                onViewDetachedFromWindow$18(this, view);
                break;
            case 19:
                onViewDetachedFromWindow$19(this, view);
                break;
            case LiveToolbarIconStyleSetting.HIGHLIGHT_WITH_TEXT /* 20 */:
                onViewDetachedFromWindow$20(this, view);
                break;
            case 21:
                onViewDetachedFromWindow$21(this, view);
                break;
        }
    }

    public C0R48(Object obj, int i) {
        this.$t = i;
        this.l1 = obj;
    }

    public static final void onViewAttachedToWindow$0(C0R48 c0r48, View view) {
        C662860PzI.LJ(C1558520qew.LJIIL((EcStoreLiveAssem) c0r48.l0), new AwS554S0100000_10((EcStoreLiveAssem) c0r48.l0, 29), PageFinder.via((View) c0r48.l1));
        InterfaceC662780PzA interfaceC662780PzA = ((EcStoreLiveAssem) c0r48.l0).LLJLLIL;
        if (interfaceC662780PzA != null) {
            interfaceC662780PzA.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$1(C0R48 c0r48, View view) {
        C662860PzI.LJ(C1558520qew.LJIIL((EcStoreLiveV2Assem) c0r48.l0), new AwS554S0100000_10((EcStoreLiveV2Assem) c0r48.l0, 30), PageFinder.via((View) c0r48.l1));
        InterfaceC662780PzA interfaceC662780PzA = ((EcStoreLiveV2Assem) c0r48.l0).LLL;
        if (interfaceC662780PzA != null) {
            interfaceC662780PzA.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$10(C0R48 c0r48, View view) {
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
        View view2 = (View) c0r48.l0;
        C0PPU c0ppu = null;
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            while (true) {
                if (parent == null) {
                    break;
                }
                if (parent instanceof C0PPU) {
                    c0ppu = (C0PPU) parent;
                    break;
                }
                parent = parent.getParent();
            }
        }
        C0PPS.LIZIZ(c0ppu, (Runnable) c0r48.l1);
    }

    public static final void onViewAttachedToWindow$11(C0R48 c0r48, View view) {
        ((LiveData) c0r48.l0).observeForever((Observer) c0r48.l1);
    }

    public static final void onViewAttachedToWindow$12(C0R48 c0r48, View view) {
        C786410Ut5.x3(((TextView) c0r48.l0).getViewTreeObserver(), (C0R4F) c0r48.l1);
    }

    public static final void onViewAttachedToWindow$13(C0R48 c0r48, View view) {
        C786410Ut5.x3(((TextView) c0r48.l0).getViewTreeObserver(), (C0R4F) c0r48.l1);
    }

    public static final void onViewAttachedToWindow$14(C0R48 c0r48, View view) {
        if (((C0PRV) c0r48.l0).LLILZLL) {
            return;
        }
        C0PRV c0prv = (C0PRV) c0r48.l0;
        c0prv.getClass();
        C2211631BhB.LJ(c0prv, new AwS589S0100000_10(c0prv, 485));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [T, com.ss.android.ugc.aweme.search.pages.result.topsearch.core.viewmodel.SearchRefreshPredictMobCanShowVM] */
    public static final void onViewAttachedToWindow$15(C0R48 c0r48, View view) {
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
        ((C259800zU) c0r48.l1).element = C0P72.LIZ(C946803n0.LIZ(view));
    }

    public static final void onViewAttachedToWindow$16(C0R48 c0r48, View view) {
        String strLIZIZ;
        Product product = ((C0QAX) c0r48.l0).LLJI;
        if (product != null && (strLIZIZ = product.LIZIZ()) != null) {
            C0QAX c0qax = (C0QAX) c0r48.l0;
            if (!c0qax.LLJIJIL.contains(strLIZIZ)) {
                C662730Pz5 c662730Pz5 = C662730Pz5.LIZ;
                Product product2 = c0qax.LLJI;
                C655440PnK c655440PnK = c0qax.LLILZLL;
                C654590Plx c654590Plx = c0qax.LLIZ;
                InterfaceC662740Pz6 interfaceC662740Pz6 = c0qax.LLIZLLLIL;
                String str = c0qax.LLJILJILJ;
                PageFinder pageFinderVia = PageFinder.via((View) c0qax.LLILZ);
                EnumC657940PrM enumC657940PrM = c0qax.LLJILJIL;
                c662730Pz5.getClass();
                C662730Pz5.LIZJ(product2, c655440PnK, c654590Plx, interfaceC662740Pz6, "search_live_shownow_banner", str, pageFinderVia, enumC657940PrM);
                c0qax.LLJIJIL.add(strLIZIZ);
            }
        }
    }

    public static final void onViewAttachedToWindow$17(C0R48 c0r48, View view) {
        String strLIZIZ;
        Product product = ((C0QAZ) c0r48.l0).LLJLIL;
        if (product != null && (strLIZIZ = product.LIZIZ()) != null) {
            C0QAZ c0qaz = (C0QAZ) c0r48.l0;
            LinearLayout linearLayout = (LinearLayout) c0r48.l1;
            if (!c0qaz.LLJLILLLLZIIL.contains(strLIZIZ)) {
                C662730Pz5 c662730Pz5 = C662730Pz5.LIZ;
                Product product2 = c0qaz.LLJLIL;
                C655440PnK c655440PnK = c0qaz.LLJILJILJ;
                C654590Plx c654590Plx = c0qaz.LLJILLL;
                InterfaceC662740Pz6 interfaceC662740Pz6 = c0qaz.LLJJ;
                String str = c0qaz.LLL;
                PageFinder pageFinderVia = PageFinder.via((View) linearLayout);
                EnumC657940PrM enumC657940PrM = c0qaz.LLJJL;
                c662730Pz5.getClass();
                C662730Pz5.LIZJ(product2, c655440PnK, c654590Plx, interfaceC662740Pz6, "search_live_merge_entrance", str, pageFinderVia, enumC657940PrM);
                c0qaz.LLJLILLLLZIIL.add(strLIZIZ);
            }
        }
    }

    public static final void onViewAttachedToWindow$18(C0R48 c0r48, View view) {
        C661490Px5 dataProvider;
        C653660PkS c653660PkS;
        String str;
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
        C661850Pxf core = ((C661440Px0) c0r48.l1).getCore();
        if (core != null) {
            core.setMVideoMobListener(new C661710PxR(((C661440Px0) c0r48.l1).getDataProvider(), C0Q3E.LIZ((C661440Px0) c0r48.l1)));
        }
        if (C0BQ1.LIZ() && (dataProvider = ((C661440Px0) c0r48.l1).getDataProvider()) != null && (c653660PkS = dataProvider.LJIL) != null && (str = c653660PkS.LJJJJJL.get("list_item_id")) != null) {
            c653660PkS.LJJLIIIJL = new AwS61S1000000_10(str, 19);
        }
    }

    public static final void onViewAttachedToWindow$19(C0R48 c0r48, View view) {
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
        C661850Pxf c661850Pxf = (C661850Pxf) c0r48.l1;
        c661850Pxf.LJIJI(C946803n0.LIZ(c661850Pxf));
    }

    public static final void onViewAttachedToWindow$2(C0R48 c0r48, View view) {
        C662860PzI.LJ(C1558520qew.LJIIL((EcStoreNoLiveAssem) c0r48.l0), new AwS554S0100000_10((EcStoreNoLiveAssem) c0r48.l0, 31), PageFinder.via((View) c0r48.l1));
        InterfaceC662780PzA interfaceC662780PzA = ((EcStoreNoLiveAssem) c0r48.l0).LLJZIJLIL;
        if (interfaceC662780PzA != null) {
            interfaceC662780PzA.onViewAttachedToWindow();
        }
    }

    public static final void onViewAttachedToWindow$20(C0R48 c0r48, View view) {
        InterfaceC650540PfQ interfaceC650540PfQ;
        SearchTopFragmentAbility searchTopFragmentAbility;
        SearchTopFragmentAbility searchTopFragmentAbility2;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIJJI;
        if (C0QDN.LIZJ(view.getContext())) {
            Object objLU = null;
            if (((SearchTopFragmentAbility) c0r48.l0) == null) {
                Fragment fragmentLIZ = C946803n0.LIZ(view);
                if (fragmentLIZ != null && (interfaceC665370Q7zLJIIJJI = C1558360qeg.LJIIJJI(fragmentLIZ, null)) != null) {
                    searchTopFragmentAbility2 = (SearchTopFragmentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIJJI, SearchTopFragmentAbility.class, null);
                } else {
                    searchTopFragmentAbility2 = null;
                }
                c0r48.l0 = searchTopFragmentAbility2;
            }
            SearchTopFragmentAbility searchTopFragmentAbility3 = (SearchTopFragmentAbility) c0r48.l0;
            if (searchTopFragmentAbility3 != null) {
                objLU = searchTopFragmentAbility3.LU(view);
            }
            if ((objLU instanceof InterfaceC650540PfQ) && (interfaceC650540PfQ = (InterfaceC650540PfQ) objLU) != null && interfaceC650540PfQ.mm() && (searchTopFragmentAbility = (SearchTopFragmentAbility) c0r48.l0) != null) {
                searchTopFragmentAbility.k01();
            }
        }
    }

    public static final void onViewAttachedToWindow$21(C0R48 c0r48, View view) {
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
        C671830QWv.LIZIZ((View) c0r48.l0, (Function0) c0r48.l1);
    }

    public static final void onViewAttachedToWindow$3(C0R48 c0r48, View view) {
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
        C1558520qew.LJII(C1558360qeg.LJ(((SearchListPlayer) c0r48.l1).LLILZIL, "search-list-player"), (SearchListPlayer) c0r48.l1, ISearchAwemePoolCompatParentAbility.class, null, null);
    }

    public static final void onViewAttachedToWindow$4(C0R48 c0r48, View view) {
        final InterfaceC665370Q7z interfaceC665370Q7zLIZIZ;
        if (((C652730Pix) c0r48.l0) == null && (interfaceC665370Q7zLIZIZ = C641100PCq.LIZIZ(view)) != null) {
            RecyclerView recyclerView = ((C652390PiP) c0r48.l1).LLILLJJLI;
            new C652750Piz(new C652720Piw(interfaceC665370Q7zLIZIZ), recyclerView, recyclerView, new C653210Pjj(), null, null);
            c0r48.l0 = new Object() { // from class: X.0Pix
            };
        }
    }

    public static final void onViewAttachedToWindow$5(C0R48 c0r48, View view) {
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = ((C652390PiP) c0r48.l0).itemView;
        C19EG c19eg = (C19EG) ((SearchAwemeCardViewHolder) c0r48.l1).LLJ.getValue();
        sAFHelper.getClass();
        C325901Of.LIZ(SAFHelper.LJIJI(view2, c19eg), (SearchAwemeCardViewHolder) c0r48.l1);
        C653380Pk0.LIZ(EventBus.LIZLLL(), (SearchAwemeCardViewHolder) c0r48.l1);
    }

    public static final void onViewAttachedToWindow$6(C0R48 c0r48, View view) {
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
        C652630Pin c652630PinLIZIZ = C653830Pkj.LIZIZ(view);
        if (c652630PinLIZIZ != null) {
            c652630PinLIZIZ.LL = (InterfaceC648720PcU) c0r48.l1;
        }
    }

    public static final void onViewAttachedToWindow$7(C0R48 c0r48, View view) {
        InterfaceC648720PcU interfaceC648720PcU;
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
        C652630Pin c652630PinLIZIZ = C653830Pkj.LIZIZ(((SearchAwemeCardViewHolder) c0r48.l1).LL.LLILLJJLI);
        if (c652630PinLIZIZ != null) {
            interfaceC648720PcU = c652630PinLIZIZ.LL;
        } else {
            interfaceC648720PcU = null;
        }
        SearchAwemeCardViewHolder searchAwemeCardViewHolder = (SearchAwemeCardViewHolder) c0r48.l1;
        C653160Pje c653160Pje = searchAwemeCardViewHolder.LLIZ;
        if (c653160Pje != null && interfaceC648720PcU != null) {
            interfaceC648720PcU.LJI(searchAwemeCardViewHolder.LL.LLILLJJLI, c653160Pje, -1, false);
        }
    }

    public static final void onViewAttachedToWindow$8(C0R48 c0r48, View view) {
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
        Function0<Unit> function0 = ((ViewOnAttachStateChangeListenerC648030PbN) c0r48.l1).LLJJL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onViewAttachedToWindow$9(C0R48 c0r48, View view) {
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
        Function0<Unit> function0 = ((ViewOnAttachStateChangeListenerC648030PbN) c0r48.l1).LLJJL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void onViewDetachedFromWindow$0(C0R48 c0r48, View view) {
        InterfaceC662780PzA interfaceC662780PzA = ((EcStoreLiveAssem) c0r48.l0).LLJLLIL;
        if (interfaceC662780PzA != null) {
            interfaceC662780PzA.onViewDetachedFromWindow();
        }
    }

    public static final void onViewDetachedFromWindow$1(C0R48 c0r48, View view) {
        InterfaceC662780PzA interfaceC662780PzA = ((EcStoreLiveV2Assem) c0r48.l0).LLL;
        if (interfaceC662780PzA != null) {
            interfaceC662780PzA.onViewDetachedFromWindow();
        }
    }

    public static final void onViewDetachedFromWindow$10(C0R48 c0r48, View view) {
        ((View) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
    }

    public static final void onViewDetachedFromWindow$11(C0R48 c0r48, View view) {
        ((LiveData) c0r48.l0).removeObserver((Observer) c0r48.l1);
    }

    public static final void onViewDetachedFromWindow$12(C0R48 c0r48, View view) {
        C786410Ut5.C3(((TextView) c0r48.l0).getViewTreeObserver(), (C0R4F) c0r48.l1);
        ((TextView) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
    }

    public static final void onViewDetachedFromWindow$13(C0R48 c0r48, View view) {
        C786410Ut5.C3(((TextView) c0r48.l0).getViewTreeObserver(), (C0R4F) c0r48.l1);
        ((TextView) c0r48.l0).removeOnAttachStateChangeListener(c0r48);
    }

    public static final void onViewDetachedFromWindow$14(C0R48 c0r48, View view) {
        SearchHubNativeViewModel searchHubNativeViewModel;
        MutableLiveData mutableLiveData;
        Observer observer = (Observer) ((C259800zU) c0r48.l1).element;
        if (observer != null && (searchHubNativeViewModel = ((C0PRV) c0r48.l0).LLILLL) != null && (mutableLiveData = searchHubNativeViewModel.LLILLJJLI) != null) {
            mutableLiveData.removeObserver(observer);
        }
    }

    public static final void onViewDetachedFromWindow$16(C0R48 c0r48, View view) {
        Integer numLIZJ;
        Context context = (Context) c0r48.l1;
        if (context != null && (numLIZJ = C1308910kAL.LIZJ(R.attr.e9, context)) != null) {
            C0QAX c0qax = (C0QAX) c0r48.l0;
            int iIntValue = numLIZJ.intValue();
            LinearLayout containerFromXml = c0qax.getContainerFromXml();
            if (containerFromXml != null) {
                containerFromXml.setBackgroundColor(iIntValue);
            }
        }
    }

    public static final void onViewDetachedFromWindow$17(C0R48 c0r48, View view) {
        ((C0QAZ) c0r48.l0).getAnimHandler().removeCallbacks(((C0QAZ) c0r48.l0).getShowRunnable());
        AnonymousClass0956 anonymousClass0956 = ((C0QAZ) c0r48.l0).LLJZ;
        if (anonymousClass0956 != null) {
            anonymousClass0956.LIZIZ(null);
        }
    }

    public static final void onViewDetachedFromWindow$2(C0R48 c0r48, View view) {
        InterfaceC662780PzA interfaceC662780PzA = ((EcStoreNoLiveAssem) c0r48.l0).LLJZIJLIL;
        if (interfaceC662780PzA != null) {
            interfaceC662780PzA.onViewDetachedFromWindow();
        }
    }

    public static final void onViewDetachedFromWindow$20(C0R48 c0r48, View view) {
        SearchServiceCenter$AutoPlayAbility searchServiceCenter$AutoPlayAbility = ((C652750Piz) c0r48.l1).LJFF;
        if (searchServiceCenter$AutoPlayAbility != null) {
            searchServiceCenter$AutoPlayAbility.LLZZZZ();
        }
        ((C652750Piz) c0r48.l1).LJFF = null;
    }

    public static final void onViewDetachedFromWindow$5(C0R48 c0r48, View view) {
        SAFHelper sAFHelper = SAFHelper.LIZ;
        View view2 = ((C652390PiP) c0r48.l0).itemView;
        C19EG c19eg = (C19EG) ((SearchAwemeCardViewHolder) c0r48.l1).LLJ.getValue();
        sAFHelper.getClass();
        C325901Of.LJ(SAFHelper.LJIJI(view2, c19eg), (SearchAwemeCardViewHolder) c0r48.l1);
        C653380Pk0.LIZIZ(EventBus.LIZLLL(), (SearchAwemeCardViewHolder) c0r48.l1);
    }

    public C0R48(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
    }
}
