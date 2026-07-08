package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.bytedance.ies.ugc.aweme.commercialize.search.ISearchAdEventLogger;
import com.bytedance.tux.tag.TuxTag;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.navigate.ICommerceNavigateService;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.feed.model.search.AwemeSearchAdModel;
import com.ss.android.ugc.aweme.feed.model.search.SearchAdPromotionAnchorInfo;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.common.utils.SAFHelper;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import com.zhiliaoapp.musically.R;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS252S0000000_16;
import kotlin.jvm.internal.AwS100S1200000_16;
import kotlin.jvm.internal.AwS124S0101000_16;
import kotlin.jvm.internal.AwS595S0100000_16;
import kotlin.jvm.internal.AwS630S0100000_16;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cO8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1009940cO8 {
    public static void LIZ(ViewGroup viewGroup) {
        if (viewGroup.findViewById(R.id.udt) == null) {
            View viewTd = C786410Ut5.Td(C786410Ut5.ne(viewGroup.getContext()), R.layout.f2q, viewGroup, false);
            TuxTag tuxTag = (TuxTag) viewTd.findViewById(R.id.udt);
            if (tuxTag != null) {
                tuxTag.setTagSize(2);
                tuxTag.setText("PseudoAdDebug");
                tuxTag.setTagIcon(Integer.valueOf(R.raw.icon_bubble_ellipsis_right_fill));
                C786410Ut5.LLZLLIL(tuxTag, 0);
            }
            viewGroup.addView(viewTd);
        } else {
            TextView textView = (TextView) viewGroup.findViewById(R.id.udt);
            if (textView != null) {
                textView.setText("PseudoAdDebug");
            }
        }
        C786410Ut5.LJLZ(0, viewGroup);
    }

    public static final boolean LIZLLL(Aweme aweme) {
        if (C256500A3k.LIZIZ) {
            C1029590ctp.LJI().getClass();
            if (C1045220dJ2.LJIIIIZZ(aweme)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static final void LJI(ViewGroup viewGroup) {
        C786410Ut5.LJJJJI(viewGroup);
        C786410Ut5.LJLZ(8, viewGroup);
    }

    public static final View LIZJ(Context context, ViewGroup viewGroup) {
        int i;
        if (C1011530cQh.LIZ().enableNewBottomLayout) {
            i = R.layout.esk;
        } else {
            i = R.layout.etd;
        }
        if (C1011530cQh.LIZ().enableSearchPreload) {
            return C21146717pB.LIZIZ(context, i, viewGroup, true);
        }
        return C786410Ut5.Td(C786410Ut5.ne(context), i, viewGroup, true);
    }

    public static void LJ(Aweme aweme, Context context) {
        if (aweme != null && context != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("[navigateToCommercePageFromSearchResult], refer: ");
            sbLIZ.append("endlayer");
            C2188811AlT.LIZIZ(sbLIZ);
            int i = C2510609se.LIZ;
            ICommerceNavigateService iCommerceNavigateServiceW2 = ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).w2();
            String aid = aweme.getAid();
            if (aid == null) {
                aid = "";
            }
            iCommerceNavigateServiceW2.LIZ(context, aweme, new C1027520cqU("result_ad", "endlayer", aid, aweme.getRequestId(), (Function1<? super Boolean, Unit>) null));
        }
    }

    public static final void LIZIZ(InterfaceC1010450cOx interfaceC1010450cOx, LifecycleOwner lifecycleOwner, Map<AbstractC1010890cPf, ? extends Function0<Unit>> map) {
        LifecycleCoroutineScope lifecycleScope;
        if (lifecycleOwner != null && (lifecycleScope = LifecycleOwnerKt.getLifecycleScope(lifecycleOwner)) != null) {
            C23250099c.LIZLLL(lifecycleScope, null, null, new C860120Xog(lifecycleOwner, interfaceC1010450cOx, map, null), 3);
        }
    }

    public static final void LJFF(Fragment fragment, View view, Lifecycle.State state) {
        Context context;
        C19EG c19egLIZIZ;
        Fragment fragmentLJJJJZI;
        if (view != null && (context = view.getContext()) != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
            SAFHelper.LIZ.getClass();
            FragmentManager fragmentManagerLJIILJJIL = SAFHelper.LJIILJJIL(fragment, c19egLIZIZ);
            if (fragmentManagerLJIILJJIL != null && (fragmentLJJJJZI = fragmentManagerLJIILJJIL.LJJJJZI("container")) != null) {
                C19EH c19ehLJIIJ = fragmentManagerLJIILJJIL.LJIIJ();
                c19ehLJIIJ.LJIL(fragmentLJJJJZI, state);
                c19ehLJIIJ.LJIIJ();
            }
        }
    }

    public static final void LJII(Aweme aweme, ISearchAdEventLogger iSearchAdEventLogger, C1007630cKP c1007630cKP) {
        AwemeRawAd awemeRawAd;
        AwemeSearchAdModel searchAdInfo;
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo;
        AwemeRawAd awemeRawAd2;
        AwemeSearchAdModel searchAdInfo2;
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo2;
        AwemeRawAd awemeRawAd3;
        AwemeSearchAdModel searchAdInfo3;
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo3;
        AwemeRawAd awemeRawAd4;
        AwemeSearchAdModel searchAdInfo4;
        SearchAdPromotionAnchorInfo searchAdPromotionAnchorInfo4;
        if (Intrinsics.LJFF(c1007630cKP.LIZ, "opt_selling_point")) {
            if (aweme != null && (awemeRawAd3 = aweme.getAwemeRawAd()) != null && (searchAdInfo3 = awemeRawAd3.getSearchAdInfo()) != null && (searchAdPromotionAnchorInfo3 = searchAdInfo3.promotionAnchorInfo) != null && !searchAdPromotionAnchorInfo3.getHasTrackedOptSellingPointShow()) {
                if (iSearchAdEventLogger != null) {
                    C1009980cOC.LIZ.getClass();
                    iSearchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LL.getValue(), AFwS252S0000000_16.get$arr$(402));
                }
                if (aweme != null && (awemeRawAd4 = aweme.getAwemeRawAd()) != null && (searchAdInfo4 = awemeRawAd4.getSearchAdInfo()) != null && (searchAdPromotionAnchorInfo4 = searchAdInfo4.promotionAnchorInfo) != null) {
                    searchAdPromotionAnchorInfo4.setHasTrackedOptSellingPointShow(true);
                    return;
                }
                return;
            }
            return;
        }
        if (aweme == null || (awemeRawAd = aweme.getAwemeRawAd()) == null || (searchAdInfo = awemeRawAd.getSearchAdInfo()) == null || (searchAdPromotionAnchorInfo = searchAdInfo.promotionAnchorInfo) == null || searchAdPromotionAnchorInfo.getHasTrackedAnchorShow()) {
            return;
        }
        if (iSearchAdEventLogger != null) {
            C1009980cOC.LIZ.getClass();
            iSearchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJZL.getValue(), AFwS252S0000000_16.get$arr$(403));
        }
        if (aweme == null || (awemeRawAd2 = aweme.getAwemeRawAd()) == null || (searchAdInfo2 = awemeRawAd2.getSearchAdInfo()) == null || (searchAdPromotionAnchorInfo2 = searchAdInfo2.promotionAnchorInfo) == null) {
            return;
        }
        searchAdPromotionAnchorInfo2.setHasTrackedAnchorShow(true);
    }

    public static final void LJIIIIZZ(ISearchAdEventLogger iSearchAdEventLogger, C641120PCs c641120PCs, AnoleComponentModel anoleComponentModel, Function1<? super Boolean, Unit> function1) {
        int iIntValue;
        Integer num = c641120PCs.LIZ;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = -1;
        }
        if (function1 != null) {
            function1.invoke(Boolean.TRUE);
        }
        String str = c641120PCs.LIZIZ;
        int iHashCode = str.hashCode();
        if (iHashCode != -1573218129) {
            if (iHashCode != -1377687758) {
                if (iHashCode == 1376594443 && str.equals("product_image")) {
                    if (iSearchAdEventLogger != null) {
                        C1009980cOC.LIZ.getClass();
                        iSearchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJJJZ.getValue(), new AwS124S0101000_16(iIntValue, anoleComponentModel, 8));
                        return;
                    }
                    return;
                }
            } else if (str.equals("button")) {
                if (iSearchAdEventLogger == null) {
                    return;
                }
                C1009980cOC.LIZ.getClass();
                iSearchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJJL.getValue(), new AwS124S0101000_16(iIntValue, anoleComponentModel, 9));
                return;
            }
        } else if (str.equals("view_more")) {
            if (iSearchAdEventLogger == null) {
                return;
            }
            C1009980cOC.LIZ.getClass();
            iSearchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJJLIIIIJ.getValue(), new AwS595S0100000_16(anoleComponentModel, 196));
            return;
        }
        if (iSearchAdEventLogger == null) {
            return;
        }
        C1009980cOC.LIZ.getClass();
        iSearchAdEventLogger.logAd((InterfaceC1023400cjq<C443120HZe<String, String, String>>) C1009980cOC.LJJLI.getValue(), new AwS124S0101000_16(iIntValue, anoleComponentModel, 10));
    }

    public static final void LJIIIZ(AbstractC1023470cjx abstractC1023470cjx, Aweme aweme, String str, C622570ObP c622570ObP, Function1 function1) {
        AwemeRawAd awemeRawAd;
        if (C1011530cQh.LIZ().enableLiteShowEventLogger) {
            C1009970cOB.LIZ.getClass();
            abstractC1023470cjx.logAd(C1009970cOB.LIZIZ, new AwS100S1200000_16(str, (String) c622570ObP, (C622570ObP) function1, (Function1<? super C1023640ckE, Unit>) 4));
        } else {
            C1009980cOC.LIZ.getClass();
            abstractC1023470cjx.logAd(C1009980cOC.LIZIZ, new AwS100S1200000_16(str, (String) c622570ObP, (C622570ObP) function1, (Function1<? super C1023640ckE, Unit>) 5));
        }
        if (aweme != null && (awemeRawAd = aweme.getAwemeRawAd()) != null) {
            UrlModel trackUrlList = awemeRawAd.getTrackUrlList();
            Long creativeId = awemeRawAd.getCreativeId();
            String logExtra = awemeRawAd.getLogExtra();
            new AwS630S0100000_16(awemeRawAd, 61);
            C2201691BEx.LIZ("show", trackUrlList, creativeId, logExtra);
        }
    }
}
