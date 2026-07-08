package Y;

import X.AbstractC1720900usq;
import X.AbstractC19484711Kz;
import X.AbstractC2126608Uu;
import X.AnonymousClass0484;
import X.C0221005j;
import X.C0CQT;
import X.C0N0Y;
import X.C0QXR;
import X.C0WZX;
import X.C11IR;
import X.C11N2;
import X.C11NZ;
import X.C11O8;
import X.C11S5;
import X.C1255704vj;
import X.C1398470mUn;
import X.C13LP;
import X.C1406710mi5;
import X.C15438062q;
import X.C1558520qew;
import X.C1578630rBN;
import X.C1701940uOG;
import X.C1703770uRD;
import X.C1708990uZd;
import X.C1709400uaI;
import X.C1709570uaZ;
import X.C1709620uae;
import X.C1709930ub9;
import X.C1710060ubM;
import X.C1714410uiN;
import X.C1716310ulR;
import X.C1719440uqU;
import X.C1720250urn;
import X.C1720760usc;
import X.C1721980uua;
import X.C1740160vNu;
import X.C1741890vQh;
import X.C1742820vSC;
import X.C1743050vSZ;
import X.C1743070vSb;
import X.C1744100vUG;
import X.C1744110vUH;
import X.C1744410vUl;
import X.C1744440vUo;
import X.C1745480vWU;
import X.C1748720vbi;
import X.C1751550vgH;
import X.C1761290vvz;
import X.C1761460vwG;
import X.C1761470vwH;
import X.C1761780vwm;
import X.C1770180wAK;
import X.C1770220wAO;
import X.C1770320wAY;
import X.C1770430wAj;
import X.C2097608Jq;
import X.C21659619pi;
import X.C21659719pj;
import X.C21698919w3;
import X.C2204961BRm;
import X.C259800zU;
import X.C724240Sb0;
import X.C724270Sb3;
import X.C786410Ut5;
import X.C788230Uw1;
import X.DialogC1761330vw3;
import X.DialogInterfaceOnDismissListenerC1775910wJZ;
import X.EnumC1396040mQs;
import X.InterfaceC1720050urT;
import X.InterfaceC1743080vSc;
import X.InterfaceC1744130vUJ;
import X.InterfaceC1749900vdc;
import X.InterfaceC1750090vdv;
import X.InterfaceC1761420vwC;
import X.InterfaceC19474811He;
import X.InterfaceC2661011f;
import X.InterfaceC665370Q7z;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.bytedance.ies.ugc.aweme.network.IRetrofitFactory;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.pipo.stellar.base.model.TextDO;
import com.bytedance.pipo.stellar.base.model.prop.StellarActionDO;
import com.bytedance.pipo.ttpay.model.FinancialProductDO;
import com.bytedance.pipo.ttpay.recharge.RechargeAssem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.ecommerce.base.address.edit.viewholder.PudoInfoItemViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.review.gallery.GalleryViewerViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.widget.regionpicker.model.District;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoEntranceConfig;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.EcSearchFeedVideoGuideFrequencyParams;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.PhotoSearchData;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.ResultPage;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.bean.WithoutCartSearchStruct;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssem;
import com.ss.android.ugc.aweme.ecommerce.search.videoguide.ui.EcSearchNoCartFypBottomButtonAssemV2;
import com.ss.android.ugc.aweme.ecommerce.search.vision.result.PhotoSearchSingleDetectionFragment;
import com.ss.android.ugc.aweme.ecommerce.service.vo.Image;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.idl.dto.ChannelVoucherModule;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.repo.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.repo.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.repo.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.card.voucher.view.ECTrendingVoucherAssem;
import com.ss.android.ugc.aweme.ecommerce.ug.trending.list.vm.TrendingListViewModel;
import com.ss.android.ugc.aweme.feed.assem.ability.IFeedPanelPlatformAbility;
import com.ss.android.ugc.aweme.feed.flexible.ability.FlexibleComponentAbility;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.feed.model.search.TagBoundBoxStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.minis.api.IMinisApiService;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.POPromotion;
import com.ss.android.ugc.aweme.pipo.cashier.common.model.po.PaymentOption;
import com.ss.android.ugc.aweme.search.df.api.visualsearch.ISearchVisualSearchService;
import com.ss.android.ugc.aweme.search.model.ECProductEntityModel;
import com.ss.android.ugc.aweme.setting.api.AuthListApi;
import com.ss.android.ugc.aweme.setting.model.AuthScopeInfo;
import com.ss.android.ugc.aweme.setting.model.AuthorizedStruct;
import com.ss.android.ugc.aweme.setting.model.RemoveAuthInfoScopeRequest;
import com.ss.android.ugc.aweme.setting.model.SecondPartyPartnerAuth;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoFragment;
import com.ss.android.ugc.aweme.setting.page.authmanager.AuthAppInfoListFragment;
import com.ss.android.ugc.aweme.setting.viewmodel.AuthListViewModel;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchLogEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import com.ss.android.ugc.aweme.vision.model.ProductCard;
import com.ss.android.ugc.feed.platform.panel.RootPanelComponent;
import com.ss.android.ugc.feed.platform.panel.player.IPlayerComponentAbility;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS268S0000000_26;
import kotlin.jvm.internal.AwS38S0010000_26;
import kotlin.jvm.internal.AwS605S0100000_26;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes27.dex */
public class ACListenerS90S0300000_26 implements View.OnClickListener {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
            case 3:
                onClick$3(this, view);
                break;
            case 4:
                onClick$4(this, view);
                break;
            case 5:
                onClick$5(this, view);
                break;
            case 6:
                onClick$6(this, view);
                break;
            case 7:
                onClick$7(this, view);
                break;
            case 8:
                onClick$8(this, view);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                onClick$9(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                onClick$10(this, view);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                onClick$11(this, view);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                onClick$12(this, view);
                break;
            case BdTuring.TYPE_SMS_VOICE /* 13 */:
                onClick$13(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        C1721980uua c1721980uua = (C1721980uua) aCListenerS90S0300000_26.l0;
        EditText editText = (EditText) aCListenerS90S0300000_26.l1;
        c1721980uua.e0();
        int selectionStart = editText.getSelectionStart();
        int selectionEnd = editText.getSelectionEnd();
        if (selectionStart != 0 || selectionEnd != 0) {
            if (selectionStart != selectionEnd) {
                C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhwMOXCw4YwRSzxfnVPcxJoskQoC66PRHLsUZ7j4+9lIy/3EcqONU4Pr7m8E=", null)).delete(selectionStart, selectionEnd);
            } else {
                C2204961BRm.LLJILLL(editText, new C0WZX("dzBzEgAjS8/YVFkiQFyUb/aLhwMOXCw4YwRSzxfnVPcxJoskQoC66PRHLsUZ7j4+9lIy/3EcqONU4Pr7m8E=", null)).delete(selectionStart - 1, selectionEnd);
            }
        }
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair("event_type", "click"), new Pair("button_id", "backspace"));
        mapLJIIJ.putAll((Map) aCListenerS90S0300000_26.l2);
        C1716310ulR.LIZ.getClass();
        C1716310ulR.LIZLLL("pipo_button_click", mapLJIIJ);
    }

    public static final void onClick$1(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        Object obj;
        String str;
        boolean z;
        int i;
        int i2;
        Object obj2;
        long currentPosition;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        C0N0Y playerManager;
        String str2;
        String str3;
        RootPanelComponent rootPanelComponentLIZJ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        FlexibleComponentAbility flexibleComponentAbility;
        ProductCard productCard;
        ProductCard productCard2;
        ProductCard productCard3;
        WithoutCartSearchStruct withoutCartSearchStructLIZ;
        ResultPage resultPage;
        Integer num;
        Map<String, Object> map;
        EcSearchFeedVideoEntranceConfig ecSearchFeedVideoEntranceConfig = ((C1770220wAO) aCListenerS90S0300000_26.l0).LIZIZ;
        if (ecSearchFeedVideoEntranceConfig != null && (map = ecSearchFeedVideoEntranceConfig.daParams) != null) {
            obj = map.get("impr_id");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        EcSearchFeedVideoEntranceConfig ecSearchFeedVideoEntranceConfig2 = ((C1770220wAO) aCListenerS90S0300000_26.l0).LIZIZ;
        if (ecSearchFeedVideoEntranceConfig2 != null && (withoutCartSearchStructLIZ = ecSearchFeedVideoEntranceConfig2.LIZ()) != null && (resultPage = withoutCartSearchStructLIZ.resultPage) != null && (num = resultPage.style) != null && num.intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem = (EcSearchNoCartFypBottomButtonAssem) aCListenerS90S0300000_26.l1;
            PhotoSearchData photoSearchData = (PhotoSearchData) aCListenerS90S0300000_26.l2;
            String strBp = ecSearchNoCartFypBottomButtonAssem.Bp();
            if (strBp.length() <= 0) {
                strBp = "homepage_hot";
            }
            C1770180wAK c1770180wAK = C1770180wAK.LIZ;
            Fragment fragmentLJI = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssem);
            c1770180wAK.getClass();
            String strLIZ = C1770180wAK.LIZ(fragmentLJI);
            if (C724240Sb0.LIZ(ecSearchNoCartFypBottomButtonAssem) != null) {
                int value = C0QXR.VISUAL_SEARCH_FEED_MALL_BUTTON.getValue();
                Pair[] pairArr = new Pair[3];
                List<ProductCard> list = photoSearchData.productCards;
                if (list != null && (productCard3 = (ProductCard) C13LP.LJJJLZIJ(0, list)) != null) {
                    str2 = productCard3.productId;
                } else {
                    str2 = null;
                }
                pairArr[0] = new Pair("product_id", str2);
                pairArr[1] = new Pair("position", 1);
                Boolean bool = Boolean.TRUE;
                pairArr[2] = new Pair("is_extra", bool);
                String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(Collections.singletonList(C2097608Jq.LJIIIIZZ(pairArr)));
                List<ProductCard> list2 = photoSearchData.productCards;
                if (list2 != null && (productCard2 = (ProductCard) C13LP.LJJJLZIJ(0, list2)) != null) {
                    str3 = productCard2.productId;
                } else {
                    str3 = null;
                }
                String str5 = null;
                PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams(strBp, "visual_non_shoppable_videos", null, null, "", 0, "", "", strLJIIIIZZ, strBp, null, null, "", "", "", null, null, null, null, value, null, null, null, null, strLIZ, str3, null, String.valueOf(System.currentTimeMillis()));
                i = 2;
                PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(strBp, ecSearchNoCartFypBottomButtonAssem.Bp(), "photo_search", null, strBp, null, "non_shoppable_videos_recom_find_similar", null, null, null, null, null, str);
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<ProductCard> list3 = photoSearchData.productCards;
                if (list3 != null && (productCard = (ProductCard) C13LP.LJJJLZIJ(0, list3)) != null) {
                    str5 = productCard.url;
                }
                PhotoSearchEnterParams photoSearchEnterParams = new PhotoSearchEnterParams(photoSearchBusinessEnterParams, photoSearchLogEnterParams, new PhotoSearchToolsEnterParams(str5, Long.valueOf(jCurrentTimeMillis), "", null, null, null, photoSearchData.productCards), null, null, null, null, null, null);
                C21659719pj.Companion.getClass();
                C21659619pi c21659619pi = new C21659619pi();
                c21659619pi.LJII = EnumC1396040mQs.SEVEN;
                i2 = 1;
                c21659619pi.LJI = true;
                c21659619pi.LJIIIZ = bool;
                C21659719pj c21659719pjLIZ = c21659619pi.LIZ();
                C21698919w3 c21698919w3 = new C21698919w3(null, null, null, null, "feed_component", "bottom_button_shop_video_guide", "bottom_button");
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIZ(bundle, "photo_search_enter_param", photoSearchEnterParams);
                C786410Ut5.LJJJI("has_overlay", "1", bundle);
                C1398470mUn c1398470mUn = new C1398470mUn("PhotoSearchSingleDetectionFragment", PhotoSearchSingleDetectionFragment.class, bundle);
                c1398470mUn.LIZLLL = c21659719pjLIZ;
                c1398470mUn.LJ = c21698919w3;
                Fragment fragmentLJI2 = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssem);
                if (fragmentLJI2 != null && (rootPanelComponentLIZJ = C1578630rBN.LIZJ(fragmentLJI2)) != null && (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(rootPanelComponentLIZJ)) != null && (flexibleComponentAbility = (FlexibleComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, FlexibleComponentAbility.class, null)) != null) {
                    flexibleComponentAbility.jC2(c1398470mUn);
                }
            } else {
                i = 2;
                i2 = 1;
            }
        } else {
            i = 2;
            i2 = 1;
            EcSearchNoCartFypBottomButtonAssem ecSearchNoCartFypBottomButtonAssem2 = (EcSearchNoCartFypBottomButtonAssem) aCListenerS90S0300000_26.l1;
            PhotoSearchData photoSearchData2 = (PhotoSearchData) aCListenerS90S0300000_26.l2;
            if (ecSearchNoCartFypBottomButtonAssem2.getContext() != null) {
                String strBp2 = ecSearchNoCartFypBottomButtonAssem2.Bp();
                if (strBp2.length() <= 0) {
                    strBp2 = "homepage_hot";
                }
                C1770180wAK c1770180wAK2 = C1770180wAK.LIZ;
                Fragment fragmentLJI3 = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssem2);
                c1770180wAK2.getClass();
                String strLIZ2 = C1770180wAK.LIZ(fragmentLJI3);
                List<ProductCard> list4 = photoSearchData2.productCards;
                if (list4 != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    for (ProductCard productCard4 : list4) {
                        TagBoundBoxStruct tagBoundBoxStruct = new TagBoundBoxStruct(Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(0.9f), Float.valueOf(0.9f));
                        String str6 = productCard4.productId;
                        if (str6 == null) {
                            str6 = "";
                        }
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUri(productCard4.url);
                        urlModel.setUrlList(Collections.singletonList(productCard4.url));
                        arrayList.add(new ECProductEntityModel(tagBoundBoxStruct, str6, urlModel));
                    }
                    ISearchVisualSearchService iSearchVisualSearchServiceLIZ = C1255704vj.LIZ();
                    Fragment fragmentLJI4 = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssem2);
                    C724270Sb3 c724270Sb3 = ecSearchNoCartFypBottomButtonAssem2.LLJI;
                    if (c724270Sb3 != null) {
                        obj2 = c724270Sb3.LL;
                    } else {
                        obj2 = null;
                    }
                    Aweme aweme = ((VideoItemParams) obj2).getAweme();
                    if (strLIZ2 != null) {
                        str4 = strLIZ2;
                    }
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecSearchNoCartFypBottomButtonAssem2), IFeedPanelPlatformAbility.class, null);
                    if (iFeedPanelPlatformAbility != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbility.x32()) != null && (playerManager = iPlayerComponentAbilityX32.getPlayerManager()) != null) {
                        currentPosition = playerManager.getCurrentPosition();
                    } else {
                        currentPosition = -1;
                    }
                    iSearchVisualSearchServiceLIZ.LJJIIJ(fragmentLJI4, aweme, strBp2, str4, Long.valueOf(currentPosition), str, arrayList);
                }
            }
        }
        C1770320wAY c1770320wAY = C1770320wAY.LIZ;
        Map<String, Object> mapLJ = ((C1770220wAO) aCListenerS90S0300000_26.l0).LIZIZ.daParams;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        String strBp3 = ((EcSearchNoCartFypBottomButtonAssem) aCListenerS90S0300000_26.l1).Bp();
        c1770320wAY.getClass();
        C1770320wAY.LIZJ(strBp3, mapLJ);
        ((EcSearchNoCartFypBottomButtonAssem) aCListenerS90S0300000_26.l1).Ip().wQ2(new EcSearchFeedVideoGuideFrequencyParams(Integer.valueOf(i2), Integer.valueOf(i)));
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public static final void onClick$10(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        ((C1744410vUl) aCListenerS90S0300000_26.l0).LLLIILIL(((C1744440vUo) aCListenerS90S0300000_26.l1).getBindingAdapterPosition());
        Function2<? super Integer, ? super T, Unit> function2 = ((C1744410vUl) aCListenerS90S0300000_26.l0).LLILLJJLI;
        if (function2 != 0) {
            function2.invoke(Integer.valueOf(((C1744440vUo) aCListenerS90S0300000_26.l1).getBindingAdapterPosition()), (District) aCListenerS90S0300000_26.l2);
        }
    }

    public static final void onClick$11(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        String str;
        ArrayList arrayList = new ArrayList();
        C1406710mi5 c1406710mi5 = (C1406710mi5) aCListenerS90S0300000_26.l1;
        List<String> list = c1406710mi5.LL.toImageUrlModel().LIZ;
        if (list == null || (str = (String) C13LP.LJJJLL(list)) == null) {
            str = "";
        }
        arrayList.add(C1761780vwm.LIZIZ(C1761780vwm.LIZ, str, c1406710mi5.LL.getUri(), null, 12));
        DialogC1761330vw3 dialogC1761330vw3 = new DialogC1761330vw3(((C788230Uw1) aCListenerS90S0300000_26.l0).getContext(), false);
        final InterfaceC1750090vdv interfaceC1750090vdv = (InterfaceC1750090vdv) aCListenerS90S0300000_26.l2;
        dialogC1761330vw3.LLJIJIL = new InterfaceC1761420vwC() { // from class: X.0vdz
            @Override // X.InterfaceC1761420vwC
            public final void onShow() {
                interfaceC1750090vdv.LJJJJJL(true);
            }
        };
        dialogC1761330vw3.LJJZZI(arrayList);
        dialogC1761330vw3.LJJZZIII(0, null);
        dialogC1761330vw3.setOnDismissListener(new DialogInterfaceOnDismissListenerC1775910wJZ(interfaceC1750090vdv, 4));
    }

    public static final void onClick$12(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        Map<String, ? extends Object> map;
        C1748720vbi.LIZLLL(((ECTrendingVoucherAssem) aCListenerS90S0300000_26.l0).LJJIJL(), new C1751550vgH(), new AwS605S0100000_26((Map) aCListenerS90S0300000_26.l1, (Map<String, ? extends Object>) 858));
        if (!((ECTrendingVoucherAssem) aCListenerS90S0300000_26.l0).op().getState().LLIZLLLIL) {
            C1743070vSb c1743070vSb = InterfaceC1743080vSc.LIZ;
            String strValueOf = String.valueOf(((Map) aCListenerS90S0300000_26.l1).get("voucher_type_id"));
            Map map2 = (Map) aCListenerS90S0300000_26.l1;
            c1743070vSb.getClass();
            C11O8 c11o8LJJJLZIJ = ((InterfaceC1743080vSc) C1743070vSb.LIZIZ.create(InterfaceC1743080vSc.class)).LIZ(new ClaimVoucherRequest(strValueOf, 1, 0, "a2270.b90718.c09483.d96855", C1743070vSb.LIZ(map2), 3)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
            final ECTrendingVoucherAssem eCTrendingVoucherAssem = (ECTrendingVoucherAssem) aCListenerS90S0300000_26.l0;
            final C1743050vSZ c1743050vSZ = (C1743050vSZ) aCListenerS90S0300000_26.l2;
            final Map map3 = (Map) aCListenerS90S0300000_26.l1;
            c11o8LJJJLZIJ.LIZIZ(new C11N2<ClaimVoucherResponse>() { // from class: X.0vSa
                @Override // X.InterfaceC626120Oh8
                public final void onComplete() {
                }

                @Override // X.InterfaceC626120Oh8
                public final void onError(Throwable th) {
                    C197039127h c197039127h = eCTrendingVoucherAssem.LLJLL;
                    if (c197039127h != null) {
                        C1740160vNu.LIZ.getClass();
                        C1740160vNu.LIZIZ(c197039127h, false, "");
                    }
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC626120Oh8
                public final void onNext(Object obj) {
                    Map<String, Object> map4;
                    Object obj2;
                    String string;
                    ClaimVoucherResponse claimVoucherResponse = (ClaimVoucherResponse) obj;
                    C197039127h c197039127h = eCTrendingVoucherAssem.LLJLL;
                    if (c197039127h != null) {
                        C1740160vNu c1740160vNu = C1740160vNu.LIZ;
                        boolean zIsCodeOK = claimVoucherResponse.isCodeOK();
                        String str = claimVoucherResponse.message;
                        c1740160vNu.getClass();
                        C1740160vNu.LIZIZ(c197039127h, zIsCodeOK, str);
                    }
                    ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) claimVoucherResponse.data;
                    Map<String, ? extends Object> map5 = null;
                    if (claimVoucherResponseData != null) {
                        map4 = claimVoucherResponseData.voucher;
                    } else {
                        map4 = null;
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("code: ");
                    sbLIZ.append(claimVoucherResponse.isCodeOK());
                    sbLIZ.append(" | serverVoucher: ");
                    sbLIZ.append(map4);
                    sbLIZ.append("| vercherIDIDIDIDI: ->");
                    if (map4 != null) {
                        obj2 = map4.get("voucher_id");
                    } else {
                        obj2 = null;
                    }
                    sbLIZ.append(obj2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (claimVoucherResponse.isCodeOK() && map4 != null) {
                        Object obj3 = map4.get("voucher_id");
                        if (obj3 != null) {
                            string = obj3.toString();
                        } else {
                            string = null;
                        }
                        if (C703302op.LIZ(string)) {
                            C1748720vbi.LIZLLL(eCTrendingVoucherAssem.LJJIJL(), new C1751570vgJ(), AFwS268S0000000_26.get$arr$(747));
                            Context context = eCTrendingVoucherAssem.getContext();
                            if (context != null) {
                                C1743050vSZ c1743050vSZ2 = c1743050vSZ;
                                ECTrendingVoucherAssem eCTrendingVoucherAssem2 = eCTrendingVoucherAssem;
                                Map<String, Object> map6 = map3;
                                ArrayList arrayList = new ArrayList();
                                for (Map<String, Object> map7 : c1743050vSZ2.LLILLJJLI.voucher.voucherList) {
                                    if (Intrinsics.LJFF(map6.get("voucher_type_id"), map7.get("voucher_type_id"))) {
                                        arrayList.add(new LinkedHashMap(map4));
                                    } else {
                                        arrayList.add(map7);
                                    }
                                }
                                c1743050vSZ2.LLILLJJLI.voucher.setVoucherList(arrayList);
                                TrendingListViewModel trendingListViewModelOp = eCTrendingVoucherAssem2.op();
                                if (!trendingListViewModelOp.getState().LLIZLLLIL) {
                                    trendingListViewModelOp.setState(new AwS38S0010000_26(21));
                                }
                                C1740160vNu c1740160vNu2 = C1740160vNu.LIZ;
                                String str2 = c1743050vSZ2.LLILLL;
                                ChannelVoucherModule channelVoucherModule = c1743050vSZ2.LLILLJJLI.voucher;
                                C1742820vSC c1742820vSC = eCTrendingVoucherAssem2.op().LL;
                                if (c1742820vSC != null) {
                                    map5 = c1742820vSC.LIZLLL;
                                }
                                c1740160vNu2.getClass();
                                C1740160vNu.LIZ(context, str2, channelVoucherModule, map5);
                                return;
                            }
                            return;
                        }
                    }
                    C1748720vbi.LIZLLL(eCTrendingVoucherAssem.LJJIJL(), new C1751570vgJ(), new AwS605S0100000_26(claimVoucherResponse, 859));
                }
            });
            return;
        }
        Context context = ((ECTrendingVoucherAssem) aCListenerS90S0300000_26.l0).getContext();
        if (context == null) {
            return;
        }
        C1743050vSZ c1743050vSZ2 = (C1743050vSZ) aCListenerS90S0300000_26.l2;
        ECTrendingVoucherAssem eCTrendingVoucherAssem2 = (ECTrendingVoucherAssem) aCListenerS90S0300000_26.l0;
        C1740160vNu c1740160vNu = C1740160vNu.LIZ;
        String str = c1743050vSZ2.LLILLL;
        ChannelVoucherModule channelVoucherModule = c1743050vSZ2.LLILLJJLI.voucher;
        C1742820vSC c1742820vSC = eCTrendingVoucherAssem2.op().LL;
        if (c1742820vSC != null) {
            map = c1742820vSC.LIZLLL;
        } else {
            map = null;
        }
        c1740160vNu.getClass();
        C1740160vNu.LIZ(context, str, channelVoucherModule, map);
    }

    public static final void onClick$13(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        GalleryViewerViewModel galleryViewerViewModel = ((C1761460vwG) aCListenerS90S0300000_26.l0).LLILLJJLI;
        if (galleryViewerViewModel != null) {
            galleryViewerViewModel.yQ2((C1761470vwH) aCListenerS90S0300000_26.l2, true, ((C1761290vvz) aCListenerS90S0300000_26.l1).LIZ);
        }
    }

    public static final void onClick$2(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        Object obj;
        String str;
        boolean z;
        boolean z2;
        Object obj2;
        long currentPosition;
        IPlayerComponentAbility iPlayerComponentAbilityX32;
        C0N0Y playerManager;
        String str2;
        String str3;
        RootPanelComponent rootPanelComponentLIZJ;
        InterfaceC665370Q7z interfaceC665370Q7zLJIIL;
        FlexibleComponentAbility flexibleComponentAbility;
        ProductCard productCard;
        ProductCard productCard2;
        ProductCard productCard3;
        WithoutCartSearchStruct withoutCartSearchStructLIZ;
        ResultPage resultPage;
        Integer num;
        Map<String, Object> map;
        EcSearchFeedVideoEntranceConfig ecSearchFeedVideoEntranceConfig = ((C1770220wAO) aCListenerS90S0300000_26.l0).LIZIZ;
        if (ecSearchFeedVideoEntranceConfig != null && (map = ecSearchFeedVideoEntranceConfig.daParams) != null) {
            obj = map.get("impr_id");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        String str4 = "";
        if (str == null) {
            str = "";
        }
        EcSearchFeedVideoEntranceConfig ecSearchFeedVideoEntranceConfig2 = ((C1770220wAO) aCListenerS90S0300000_26.l0).LIZIZ;
        if (ecSearchFeedVideoEntranceConfig2 != null && (withoutCartSearchStructLIZ = ecSearchFeedVideoEntranceConfig2.LIZ()) != null && (resultPage = withoutCartSearchStructLIZ.resultPage) != null && (num = resultPage.style) != null && num.intValue() == 2) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            EcSearchNoCartFypBottomButtonAssemV2 ecSearchNoCartFypBottomButtonAssemV2 = (EcSearchNoCartFypBottomButtonAssemV2) aCListenerS90S0300000_26.l1;
            PhotoSearchData photoSearchData = (PhotoSearchData) aCListenerS90S0300000_26.l2;
            String strBp = ecSearchNoCartFypBottomButtonAssemV2.Bp();
            if (strBp.length() <= 0) {
                strBp = "homepage_hot";
            }
            C1770180wAK c1770180wAK = C1770180wAK.LIZ;
            Fragment fragmentLJI = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssemV2);
            c1770180wAK.getClass();
            String strLIZ = C1770180wAK.LIZ(fragmentLJI);
            if (C724240Sb0.LIZ(ecSearchNoCartFypBottomButtonAssemV2) != null) {
                int value = C0QXR.VISUAL_SEARCH_FEED_MALL_BUTTON.getValue();
                Pair[] pairArr = new Pair[3];
                List<ProductCard> list = photoSearchData.productCards;
                if (list != null && (productCard3 = (ProductCard) C13LP.LJJJLZIJ(0, list)) != null) {
                    str2 = productCard3.productId;
                } else {
                    str2 = null;
                }
                pairArr[0] = new Pair("product_id", str2);
                pairArr[1] = new Pair("position", 1);
                Boolean bool = Boolean.TRUE;
                pairArr[2] = new Pair("is_extra", bool);
                String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(Collections.singletonList(C2097608Jq.LJIIIIZZ(pairArr)));
                List<ProductCard> list2 = photoSearchData.productCards;
                if (list2 != null && (productCard2 = (ProductCard) C13LP.LJJJLZIJ(0, list2)) != null) {
                    str3 = productCard2.productId;
                } else {
                    str3 = null;
                }
                String str5 = null;
                PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams = new PhotoSearchBusinessEnterParams(strBp, "visual_non_shoppable_videos", null, null, "", 0, "", "", strLJIIIIZZ, strBp, null, null, "", "", "", null, null, null, null, value, null, null, null, null, strLIZ, str3, null, String.valueOf(System.currentTimeMillis()));
                PhotoSearchLogEnterParams photoSearchLogEnterParams = new PhotoSearchLogEnterParams(strBp, ecSearchNoCartFypBottomButtonAssemV2.Bp(), "photo_search", null, strBp, null, "non_shoppable_videos_recom_find_similar", null, null, null, null, null, str);
                long jCurrentTimeMillis = System.currentTimeMillis();
                List<ProductCard> list3 = photoSearchData.productCards;
                if (list3 != null && (productCard = (ProductCard) C13LP.LJJJLZIJ(0, list3)) != null) {
                    str5 = productCard.url;
                }
                PhotoSearchEnterParams photoSearchEnterParams = new PhotoSearchEnterParams(photoSearchBusinessEnterParams, photoSearchLogEnterParams, new PhotoSearchToolsEnterParams(str5, Long.valueOf(jCurrentTimeMillis), "", null, null, null, photoSearchData.productCards), null, null, null, null, null, null);
                C21659719pj.Companion.getClass();
                C21659619pi c21659619pi = new C21659619pi();
                c21659619pi.LJII = EnumC1396040mQs.SEVEN;
                z2 = true;
                c21659619pi.LJI = true;
                c21659619pi.LJIIIZ = bool;
                C21659719pj c21659719pjLIZ = c21659619pi.LIZ();
                C21698919w3 c21698919w3 = new C21698919w3(null, null, null, null, "feed_component", "bottom_button_shop_video_guide", "bottom_button");
                Bundle bundle = new Bundle();
                C786410Ut5.LJJIZ(bundle, "photo_search_enter_param", photoSearchEnterParams);
                C786410Ut5.LJJJI("has_overlay", "1", bundle);
                C1398470mUn c1398470mUn = new C1398470mUn("PhotoSearchSingleDetectionFragment", PhotoSearchSingleDetectionFragment.class, bundle);
                c1398470mUn.LIZLLL = c21659719pjLIZ;
                c1398470mUn.LJ = c21698919w3;
                Fragment fragmentLJI2 = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssemV2);
                if (fragmentLJI2 != null && (rootPanelComponentLIZJ = C1578630rBN.LIZJ(fragmentLJI2)) != null && (interfaceC665370Q7zLJIIL = C1558520qew.LJIIL(rootPanelComponentLIZJ)) != null && (flexibleComponentAbility = (FlexibleComponentAbility) C1558520qew.LIZ(interfaceC665370Q7zLJIIL, FlexibleComponentAbility.class, null)) != null) {
                    flexibleComponentAbility.jC2(c1398470mUn);
                }
            } else {
                z2 = true;
            }
        } else {
            z2 = true;
            EcSearchNoCartFypBottomButtonAssemV2 ecSearchNoCartFypBottomButtonAssemV22 = (EcSearchNoCartFypBottomButtonAssemV2) aCListenerS90S0300000_26.l1;
            PhotoSearchData photoSearchData2 = (PhotoSearchData) aCListenerS90S0300000_26.l2;
            if (ecSearchNoCartFypBottomButtonAssemV22.getContext() != null) {
                String strBp2 = ecSearchNoCartFypBottomButtonAssemV22.Bp();
                if (strBp2.length() <= 0) {
                    strBp2 = "homepage_hot";
                }
                C1770180wAK c1770180wAK2 = C1770180wAK.LIZ;
                Fragment fragmentLJI3 = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssemV22);
                c1770180wAK2.getClass();
                String strLIZ2 = C1770180wAK.LIZ(fragmentLJI3);
                List<ProductCard> list4 = photoSearchData2.productCards;
                if (list4 != null) {
                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
                    for (ProductCard productCard4 : list4) {
                        TagBoundBoxStruct tagBoundBoxStruct = new TagBoundBoxStruct(Float.valueOf(0.1f), Float.valueOf(0.1f), Float.valueOf(0.9f), Float.valueOf(0.9f));
                        String str6 = productCard4.productId;
                        if (str6 == null) {
                            str6 = "";
                        }
                        UrlModel urlModel = new UrlModel();
                        urlModel.setUri(productCard4.url);
                        urlModel.setUrlList(Collections.singletonList(productCard4.url));
                        arrayList.add(new ECProductEntityModel(tagBoundBoxStruct, str6, urlModel));
                    }
                    ISearchVisualSearchService iSearchVisualSearchServiceLIZ = C1255704vj.LIZ();
                    Fragment fragmentLJI4 = C724240Sb0.LJI(ecSearchNoCartFypBottomButtonAssemV22);
                    C724270Sb3 c724270Sb3 = ecSearchNoCartFypBottomButtonAssemV22.LLJI;
                    if (c724270Sb3 != null) {
                        obj2 = c724270Sb3.LL;
                    } else {
                        obj2 = null;
                    }
                    Aweme aweme = ((VideoItemParams) obj2).getAweme();
                    if (strLIZ2 != null) {
                        str4 = strLIZ2;
                    }
                    IFeedPanelPlatformAbility iFeedPanelPlatformAbility = (IFeedPanelPlatformAbility) C1558520qew.LIZ(C1558520qew.LJIIL(ecSearchNoCartFypBottomButtonAssemV22), IFeedPanelPlatformAbility.class, null);
                    if (iFeedPanelPlatformAbility != null && (iPlayerComponentAbilityX32 = iFeedPanelPlatformAbility.x32()) != null && (playerManager = iPlayerComponentAbilityX32.getPlayerManager()) != null) {
                        currentPosition = playerManager.getCurrentPosition();
                    } else {
                        currentPosition = -1;
                    }
                    iSearchVisualSearchServiceLIZ.LJJIIJ(fragmentLJI4, aweme, strBp2, str4, Long.valueOf(currentPosition), str, arrayList);
                }
            }
        }
        C1770320wAY c1770320wAY = C1770320wAY.LIZ;
        Map<String, Object> mapLJ = ((C1770220wAO) aCListenerS90S0300000_26.l0).LIZIZ.daParams;
        if (mapLJ == null) {
            mapLJ = C2097608Jq.LJ();
        }
        String strBp3 = ((EcSearchNoCartFypBottomButtonAssemV2) aCListenerS90S0300000_26.l1).Bp();
        c1770320wAY.getClass();
        C1770320wAY.LIZJ(strBp3, mapLJ);
        ((EcSearchNoCartFypBottomButtonAssemV2) aCListenerS90S0300000_26.l1).LLLII = z2;
        C1770430wAj.LL.getClass();
        C1770430wAj.LIZLLL();
    }

    public static final void onClick$3(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        InterfaceC1749900vdc interfaceC1749900vdc = ((AuthAppInfoListFragment) aCListenerS90S0300000_26.l0).LLIZ;
        if (interfaceC1749900vdc != null) {
            interfaceC1749900vdc.Gq((AuthorizedStruct) aCListenerS90S0300000_26.l1, (SecondPartyPartnerAuth) aCListenerS90S0300000_26.l2);
        }
    }

    public static final void onClick$4(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        C11NZ<C0221005j> c11nzRemoveAuthInfoScope;
        AuthListApi authListApi;
        AuthListApi authListApi2;
        InterfaceC2661011f interfaceC2661011fLIZ;
        final AuthScopeInfo authScopeInfo = (AuthScopeInfo) aCListenerS90S0300000_26.l0;
        String str = authScopeInfo.name;
        if (str != null) {
            final AuthAppInfoFragment authAppInfoFragment = (AuthAppInfoFragment) aCListenerS90S0300000_26.l1;
            final AuthorizedStruct authorizedStruct = (AuthorizedStruct) aCListenerS90S0300000_26.l2;
            String str2 = AuthAppInfoFragment.LLJJIJIL;
            if (str2 == null) {
                str2 = "";
            }
            AuthListViewModel authListViewModelOR = authAppInfoFragment.OR();
            List listSingletonList = Collections.singletonList(str);
            C1703770uRD c1703770uRD = authListViewModelOR.LLILZIL;
            RemoveAuthInfoScopeRequest removeAuthInfoScopeRequest = new RemoveAuthInfoScopeRequest(str2, listSingletonList);
            c1703770uRD.getClass();
            try {
                if (c1703770uRD.LJ == null) {
                    IRetrofitFactory iRetrofitFactory = (IRetrofitFactory) PluggableExtentionKt.pluggableSpi$default(IRetrofitFactory.class, false, false, false, 14, null);
                    if (iRetrofitFactory != null && (interfaceC2661011fLIZ = iRetrofitFactory.LIZ(C0CQT.LIZJ)) != null) {
                        authListApi2 = (AuthListApi) interfaceC2661011fLIZ.create(AuthListApi.class);
                    } else {
                        authListApi2 = null;
                    }
                    c1703770uRD.LJ = authListApi2;
                }
                authListApi = c1703770uRD.LJ;
            } catch (ExecutionException e) {
                TryCatchGuardChecker.doCheck(e);
                AbstractC2126608Uu.getCompatibleException(e);
            }
            if (authListApi != null) {
                c11nzRemoveAuthInfoScope = authListApi.removeAuthInfoScope(removeAuthInfoScopeRequest);
            } else {
                c11nzRemoveAuthInfoScope = C11IR.LL;
            }
            AbstractC19484711Kz.LJIJJ(c11nzRemoveAuthInfoScope).LJJIJIIJI(C11S5.LIZ()).LJJ(C1701940uOG.LIZIZ()).LIZ(new InterfaceC19474811He<C0221005j>() { // from class: X.0vde
                @Override // X.InterfaceC19474811He
                public final void onSubscribe(InterfaceC420801kM interfaceC420801kM) {
                }

                @Override // X.InterfaceC19474811He
                public final void onError(Throwable th) {
                    boolean z;
                    String str3;
                    Intent intent;
                    int i = C2187451AjH.LIZ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onRemoveAuthInfoScope, onError:");
                    sbLIZ.append(th);
                    C1720106oR.LIZ("appauth-AuthAppInfoFragment", C2188811AlT.LIZIZ(sbLIZ));
                    if (authAppInfoFragment.LLJJI) {
                        C2344009Gk c2344009Gk = new C2344009Gk();
                        C19EG activity = authAppInfoFragment.getActivity();
                        if (activity != null && !C960203pA.LIZIZ(activity)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            str3 = "1";
                        } else {
                            str3 = CardStruct.IStatusCode.DEFAULT;
                        }
                        c2344009Gk.LJIIIIZZ("background", str3);
                        c2344009Gk.LJIIIIZZ("click_type", "2");
                        c2344009Gk.LJIIIIZZ("action", "");
                        c2344009Gk.LJIIIIZZ("result", CardStruct.IStatusCode.DEFAULT);
                        c2344009Gk.LJIIIIZZ("minis_id", AuthAppInfoFragment.LLJJIJIL);
                        C19EG activity2 = authAppInfoFragment.getActivity();
                        String string = null;
                        if (activity2 != null && (intent = activity2.getIntent()) != null) {
                            try {
                                Bundle extras = intent.getExtras();
                                if (extras != null) {
                                    string = extras.getString("enter_from");
                                }
                            } catch (Exception e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }
                        c2344009Gk.LJFF("enter_from", string);
                        IMinisApiService iMinisApiService = (IMinisApiService) PluggableExtentionKt.pluggableSpi$default(IMinisApiService.class, false, false, false, 14, null);
                        if (iMinisApiService != null) {
                            iMinisApiService.LJIJ(c2344009Gk, "tm_data_privacy_page_click");
                        }
                    }
                    authAppInfoFragment.SR();
                }

                /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
                /* JADX WARN: Removed duplicated region for block: B:28:0x0085  */
                @Override // X.InterfaceC19474811He
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onSuccess(X.C0221005j r10) {
                    /*
                        Method dump skipped, instruction units count: 209
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1749920vde.onSuccess(java.lang.Object):void");
                }
            });
        }
    }

    public static final void onClick$5(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        ((PudoInfoItemViewHolder) aCListenerS90S0300000_26.l0).W5().LLLLIIL = true;
        C786410Ut5.LJLLLLLL(8, (SmartImageView) aCListenerS90S0300000_26.l1);
        ((Function0) aCListenerS90S0300000_26.l2).invoke();
        C1745480vWU.LJ(((PudoInfoItemViewHolder) aCListenerS90S0300000_26.l0).W5().LLJJIJIL, "pickup_location_business_hours", null, null, 6);
    }

    public static final void onClick$6(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        InterfaceC1720050urT interfaceC1720050urT;
        StellarActionDO action = ((TextDO) aCListenerS90S0300000_26.l0).getAction();
        if (action != null) {
            FinancialProductDO financialProductDO = (FinancialProductDO) aCListenerS90S0300000_26.l1;
            AbstractC1720900usq abstractC1720900usq = (AbstractC1720900usq) aCListenerS90S0300000_26.l2;
            C1720250urn c1720250urn = new C1720250urn(financialProductDO.getObjId(), financialProductDO.getTrackingParams(), "card", null, 24);
            C1720760usc c1720760usc = abstractC1720900usq.LL;
            if (c1720760usc != null && (interfaceC1720050urT = c1720760usc.LIZIZ) != null) {
                interfaceC1720050urT.bL(action, c1720250urn, null);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void onClick$7(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        long jLongValue;
        Context context = (Context) aCListenerS90S0300000_26.l0;
        String str = (String) ((C259800zU) aCListenerS90S0300000_26.l1).element;
        if (str == null) {
            str = "";
        }
        C1719440uqU.LIZ(context, str, "ttapy");
        C1716310ulR c1716310ulR = C1716310ulR.LIZ;
        Map<String, String> mapSo = ((RechargeAssem) aCListenerS90S0300000_26.l2).So();
        RechargeAssem rechargeAssem = (RechargeAssem) aCListenerS90S0300000_26.l2;
        mapSo.put("obj_id", "contact_us");
        long jCurrentTimeMillis = System.currentTimeMillis();
        Long l = (Long) ((LinkedHashMap) rechargeAssem.LLJJJ).get("user_resume_time");
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        mapSo.put("click_cost", String.valueOf(jCurrentTimeMillis - jLongValue));
        c1716310ulR.getClass();
        C1716310ulR.LIZLLL("rd_pipo_object_click", mapSo);
    }

    public static final void onClick$8(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        int bindingAdapterPosition = ((C1744110vUH) aCListenerS90S0300000_26.l0).getBindingAdapterPosition();
        InterfaceC1744130vUJ interfaceC1744130vUJ = ((C1744100vUG) aCListenerS90S0300000_26.l1).LLILZLL;
        if (interfaceC1744130vUJ != null) {
            interfaceC1744130vUJ.LIZ(bindingAdapterPosition);
        }
        C1748720vbi.LIZLLL(view, new AnonymousClass0484(), new AwS605S0100000_26((Image) aCListenerS90S0300000_26.l2, 671));
    }

    public static final void onClick$9(ACListenerS90S0300000_26 aCListenerS90S0300000_26, View view) {
        String strLJIIL;
        C1709930ub9 c1709930ub9 = (C1709930ub9) aCListenerS90S0300000_26.l0;
        PaymentOption paymentOption = c1709930ub9.LIZIZ;
        if (paymentOption != null && (strLJIIL = paymentOption.LJIIL(c1709930ub9.LIZ, (POPromotion) aCListenerS90S0300000_26.l1)) != null) {
            C1710060ubM c1710060ubM = (C1710060ubM) aCListenerS90S0300000_26.l2;
            C1709930ub9 c1709930ub92 = (C1709930ub9) aCListenerS90S0300000_26.l0;
            C1714410uiN c1714410uiN = C1714410uiN.LIZ;
            Context context = c1710060ubM.getContext();
            C1708990uZd c1708990uZdLIZIZ = C1709400uaI.LIZIZ(c1709930ub92.LIZ);
            C1709570uaZ c1709570uaZ = c1709930ub92.LIZ;
            String str = c1709930ub92.LIZLLL;
            String str2 = c1709930ub92.LJ;
            PaymentOption paymentOption2 = c1709930ub92.LIZIZ;
            c1709570uaZ.getClass();
            C1714410uiN.LIZLLL(c1714410uiN, context, strLJIIL, null, false, null, c1708990uZdLIZIZ, C1709570uaZ.LIZJ(paymentOption2, str, str2), null, null, 824);
            PaymentOption paymentOption3 = c1709930ub92.LIZIZ;
            C1709620uae c1709620uae = c1709930ub92.LJFF;
            if (c1709620uae != null) {
                String str3 = c1709930ub92.LJ;
                if (str3 == null) {
                    str3 = "";
                }
                C1709620uae.LIZLLL(c1709620uae, "promotion_tag", str3, paymentOption3);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ACListenerS90S0300000_26(Object obj, Context context, C259800zU<String> c259800zU, RechargeAssem rechargeAssem) {
        this.$t = rechargeAssem;
        this.l0 = obj;
        this.l1 = context;
        this.l2 = c259800zU;
    }
}
