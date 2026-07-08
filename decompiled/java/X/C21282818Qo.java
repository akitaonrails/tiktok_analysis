package X;

import android.view.View;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartRequestParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.AddToCartUiConfig;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.EnterCartParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.ICartService;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.PlatformLinkInfo;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.SkuPanelParam;
import com.ss.android.ugc.aweme.ecommerce.service.cartservice.model.AddToCartData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: X.18Qo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21282818Qo extends AbstractC21283418Qu {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void LIZJ(C013C c013c, CompletionBlock<InterfaceC1799340wvM> completionBlock, C10372043u c10372043u) {
        HashMap<String, Object> mapLJIIJ;
        Integer numValueOf;
        AddToCartData addToCartData;
        String str;
        if (!c013c.element) {
            c013c.element = true;
            String str2 = null;
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1799340wvM.class, null);
            InterfaceC1799340wvM interfaceC1799340wvM = (InterfaceC1799340wvM) xBaseModelLIZJ;
            if (c10372043u != null && (addToCartData = (AddToCartData) c10372043u.data) != null && (str = addToCartData.rawDataStr) != null) {
                mapLJIIJ = C1741890vQh.LJIIJ(str);
            } else {
                mapLJIIJ = null;
            }
            interfaceC1799340wvM.setData(mapLJIIJ);
            if (c10372043u != null) {
                numValueOf = Integer.valueOf(c10372043u.code);
            } else {
                numValueOf = null;
            }
            interfaceC1799340wvM.setCode(numValueOf);
            if (c10372043u != null) {
                str2 = c10372043u.message;
            }
            interfaceC1799340wvM.setMsg(str2);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        PlatformLinkInfo platformLinkInfo;
        C10355043d c10355043d;
        SkuPanelParam skuPanelParam;
        Integer numValueOf;
        Integer numValueOf2;
        Long lValueOf;
        Integer numValueOf3;
        View view;
        EnterCartParam enterCartParam;
        Set<String> setKeySet;
        Object obj;
        String skuId;
        String productId;
        String sellerId;
        InterfaceC21283318Qt interfaceC21283318Qt = (InterfaceC21283318Qt) xBaseParamModel;
        final C013C c013c = new C013C();
        final C013C c013c2 = new C013C();
        final C013C c013c3 = new C013C();
        InterfaceC21283218Qs requestParams = interfaceC21283318Qt.getRequestParams();
        if (requestParams.getPlatformLinkBasedItem() != null) {
            C18R0 platformLinkBasedItem = requestParams.getPlatformLinkBasedItem();
            if (platformLinkBasedItem != null) {
                skuId = platformLinkBasedItem.getSkuId();
            } else {
                skuId = null;
            }
            C18R0 platformLinkBasedItem2 = requestParams.getPlatformLinkBasedItem();
            if (platformLinkBasedItem2 != null) {
                productId = platformLinkBasedItem2.getProductId();
            } else {
                productId = null;
            }
            C18R0 platformLinkBasedItem3 = requestParams.getPlatformLinkBasedItem();
            if (platformLinkBasedItem3 != null) {
                sellerId = platformLinkBasedItem3.getSellerId();
            } else {
                sellerId = null;
            }
            platformLinkInfo = new PlatformLinkInfo(skuId, productId, sellerId);
        } else {
            platformLinkInfo = null;
        }
        AddToCartRequestParam addToCartRequestParam = new AddToCartRequestParam(requestParams.getProductId(), requestParams.getSellerId(), requestParams.getSkuId(), requestParams.getAddCount().intValue(), requestParams.getAddItemSourcePage().intValue(), requestParams.getPageSourceInfo(), requestParams.getChainKey(), requestParams.getEntranceInfo(), requestParams.getOtherParams(), null, platformLinkInfo, null, null, null, null);
        InterfaceC1875770yud reportLogParams = interfaceC21283318Qt.getReportLogParams();
        if (reportLogParams != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map<String, Object> extraParams = reportLogParams.getExtraParams();
            if (extraParams != null && (setKeySet = extraParams.keySet()) != null) {
                for (Object obj2 : setKeySet) {
                    Map<String, Object> extraParams2 = reportLogParams.getExtraParams();
                    if (extraParams2 != null) {
                        obj = extraParams2.get(obj2);
                    } else {
                        obj = null;
                    }
                    if ((obj instanceof Map) && obj != null) {
                        linkedHashMap.put(obj2, obj);
                    }
                }
            }
            c10355043d = new C10355043d(reportLogParams.getCommonParams(), linkedHashMap);
        } else {
            c10355043d = null;
        }
        boolean needReportLog = interfaceC21283318Qt.getNeedReportLog();
        InterfaceC21283118Qr skuPanelParams = interfaceC21283318Qt.getSkuPanelParams();
        if (skuPanelParams != null) {
            try {
                Number bizType = skuPanelParams.getBizType();
                if (bizType != null) {
                    numValueOf = Integer.valueOf(bizType.intValue());
                } else {
                    numValueOf = null;
                }
                Number skuType = skuPanelParams.getSkuType();
                if (skuType != null) {
                    numValueOf2 = Integer.valueOf(skuType.intValue());
                } else {
                    numValueOf2 = null;
                }
                skuPanelParam = new SkuPanelParam(numValueOf, numValueOf2, skuPanelParams.getBtm(), skuPanelParams.getBcm(), skuPanelParams.getNeedRequest(), skuPanelParams.getEnterFrom(), skuPanelParams.getTrackParams(), skuPanelParams.getOtherParams());
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                skuPanelParam = null;
            }
        } else {
            skuPanelParam = null;
        }
        InterfaceC21283918Qz uiConfig = interfaceC21283318Qt.getUiConfig();
        boolean needToast = uiConfig.getNeedToast();
        boolean needDialogShow = uiConfig.getNeedDialogShow();
        Number toastDelayMS = uiConfig.getToastDelayMS();
        if (toastDelayMS != null) {
            lValueOf = Long.valueOf(toastDelayMS.longValue());
        } else {
            lValueOf = null;
        }
        Number bottomToastDistance = uiConfig.getBottomToastDistance();
        if (bottomToastDistance != null) {
            numValueOf3 = Integer.valueOf(bottomToastDistance.intValue());
        } else {
            numValueOf3 = null;
        }
        C043Y c043y = new C043Y(addToCartRequestParam, c10355043d, needReportLog, skuPanelParam, new AddToCartUiConfig(needToast, needDialogShow, lValueOf, numValueOf3, Boolean.valueOf(uiConfig.getSuccessVibrate())), null);
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (view = interfaceC634840OvC.getView()) != null) {
            ICartService iCartService = (ICartService) ServiceManager.get().getService(ICartService.class);
            AnonymousClass0431 anonymousClass0431 = new AnonymousClass0431() { // from class: X.18Qy
                @Override // X.AnonymousClass0431
                public final void LIZIZ() {
                }

                @Override // X.AnonymousClass0431
                public final EnterCartParam LIZLLL() {
                    return null;
                }

                @Override // X.AnonymousClass0431
                public final View LJFF() {
                    return null;
                }

                @Override // X.AnonymousClass0431
                public final C043Y LJI() {
                    return null;
                }

                @Override // X.AnonymousClass0431
                public final void LIZJ() {
                    if (c013c2.element || c013c3.element) {
                        return;
                    }
                    C21282818Qo.LIZJ(c013c, completionBlock, null);
                }

                @Override // X.AnonymousClass0431
                public final void LJ() {
                    c013c3.element = true;
                }

                @Override // X.AnonymousClass0431
                public final void LIZ(C10372043u c10372043u) {
                    c013c2.element = true;
                    C21282818Qo.LIZJ(c013c, completionBlock, c10372043u);
                }
            };
            InterfaceC1799800ww6 enterCartParams = interfaceC21283318Qt.getEnterCartParams();
            if (enterCartParams != null) {
                try {
                    enterCartParam = new EnterCartParam(enterCartParams.getTrackParams());
                } catch (CancellationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    throw e2;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    enterCartParam = null;
                }
            } else {
                enterCartParam = null;
            }
            iCartService.LIZLLL(view, c043y, anonymousClass0431, true, enterCartParam);
        }
    }
}
