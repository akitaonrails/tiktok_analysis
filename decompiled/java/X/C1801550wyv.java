package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.ug.common.service.IEcUgCommonService;
import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.service.IFeedEcCardService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;

/* JADX INFO: renamed from: X.0wyv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1801550wyv extends AbstractC1801570wyx {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Long lValueOf;
        Integer numValueOf;
        Long lValueOf2;
        Integer numValueOf2;
        String containerID;
        InterfaceC1801560wyw interfaceC1801560wyw = (InterfaceC1801560wyw) xBaseParamModel;
        try {
            int iIntValue = interfaceC1801560wyw.getCardSubtype().intValue();
            int iIntValue2 = interfaceC1801560wyw.getTriggerCondition().intValue();
            Number showTime = interfaceC1801560wyw.getShowTime();
            if (showTime != null) {
                lValueOf = Long.valueOf(showTime.longValue());
            } else {
                lValueOf = null;
            }
            Number dislikeClickCount = interfaceC1801560wyw.getDislikeClickCount();
            if (dislikeClickCount != null) {
                numValueOf = Integer.valueOf(dislikeClickCount.intValue());
            } else {
                numValueOf = null;
            }
            Number dislikeClickTime = interfaceC1801560wyw.getDislikeClickTime();
            if (dislikeClickTime != null) {
                lValueOf2 = Long.valueOf(dislikeClickTime.longValue());
            } else {
                lValueOf2 = null;
            }
            Number notDisplayCount = interfaceC1801560wyw.getNotDisplayCount();
            if (notDisplayCount != null) {
                numValueOf2 = Integer.valueOf(notDisplayCount.intValue());
            } else {
                numValueOf2 = null;
            }
            IEcUgCommonService iEcUgCommonService = (IEcUgCommonService) PluggableExtentionKt.pluggableSpi$default(IEcUgCommonService.class, false, false, false, 14, null);
            if (iEcUgCommonService != null) {
                iEcUgCommonService.LIZLLL(iIntValue, iIntValue2, lValueOf, numValueOf, lValueOf2, numValueOf2);
            }
            IFeedEcCardService iFeedEcCardService = (IFeedEcCardService) PluggableExtentionKt.pluggableSpi$default(IFeedEcCardService.class, false, false, false, 14, null);
            if (iFeedEcCardService != null) {
                iFeedEcCardService.LIZIZ();
            }
            C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1801580wyy.class);
            try {
                InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                if (interfaceC634840OvC != null) {
                    containerID = interfaceC634840OvC.getContainerID();
                } else {
                    containerID = null;
                }
                completionBlock.onSuccess((XBaseResultModel) C1549500qQO.LIZJ(containerID, c19719912DlLIZ), "success");
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("err: ");
                sbLIZ.append(th.getMessage());
                C2382909Vj.LIZ(completionBlock, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
