package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.anchor.service.ITemplateAnchorStrategyService;
import com.ss.android.ugc.aweme.api.IAnchorBusinessOutBridgeService;
import com.ss.android.ugc.aweme.api.pipeline.ITemplateConsumeService;
import com.ss.android.ugc.aweme.creative.model.MDPRecommendTemplateInfo;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.services.AsyncAVService;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.SimpleServiceLoadCallback;
import com.ss.android.ugc.aweme.services.external.IInfoService;
import com.ss.android.ugc.aweme.services.external.ui.IRecordService;
import com.ss.android.ugc.aweme.services.external.ui.UgcTemplateAlbumConfig;
import com.ss.android.ugc.aweme.template.TemplateAnchorConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS54S0500000_21;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mOD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394390mOD {
    public static final C1394390mOD LIZ = new C1394390mOD();

    public static void LIZ(final Aweme aweme, final C19EG c19eg, String str, String str2, final MDPRecommendTemplateInfo mDPRecommendTemplateInfo) {
        IInfoService iInfoServiceInfoService;
        AnchorCommonStruct next;
        final ITemplateAnchorStrategyService iTemplateAnchorStrategyService;
        final TemplateAnchorConfig templateAnchorConfigLIZLLL;
        boolean z;
        String strOptString;
        C1394400mOE.LIZ.getClass();
        C20684815ws.LJIILLIIL("click_try_tt_template", C1394400mOE.LIZ(aweme, str, str2, mDPRecommendTemplateInfo));
        List<AnchorCommonStruct> anchors = aweme.getAnchors();
        AnchorCommonStruct anchorCommonStruct = null;
        if (anchors != null) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (next.getType() == EnumC1430380nKG.ANCHOR_PUGC_TEMPLATE.getTYPE()) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            AnchorCommonStruct anchorCommonStruct2 = next;
            if (anchorCommonStruct2 != null) {
                if (c19eg != null && (iTemplateAnchorStrategyService = (ITemplateAnchorStrategyService) PluggableExtentionKt.pluggableSpi$default(ITemplateAnchorStrategyService.class, false, false, false, 14, null)) != null && (templateAnchorConfigLIZLLL = iTemplateAnchorStrategyService.LIZLLL(anchorCommonStruct2, aweme, "", "", "")) != null) {
                    String logExtra = anchorCommonStruct2.getLogExtra();
                    if (logExtra != null && logExtra.length() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        strOptString = "";
                    } else {
                        try {
                            strOptString = new JSONObject(logExtra).optString("anchor_type", "");
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            strOptString = "";
                        }
                    }
                    templateAnchorConfigLIZLLL.setMainAnchorType(strOptString);
                    templateAnchorConfigLIZLLL.setFollowedTemplateType(anchorCommonStruct2.subType());
                    templateAnchorConfigLIZLLL.setShootWay("mdp_square");
                    templateAnchorConfigLIZLLL.setMdpRecommendTemplateInfo(mDPRecommendTemplateInfo);
                    if (C123100dR.LIZ("")) {
                        templateAnchorConfigLIZLLL.setShootEnterFrom("");
                    }
                    ITemplateConsumeService iTemplateConsumeService = C522540KeS.LIZ;
                    if (iTemplateConsumeService != null && iTemplateConsumeService.LJFF(4, null, templateAnchorConfigLIZLLL, null)) {
                        iTemplateAnchorStrategyService.LIZ(c19eg, templateAnchorConfigLIZLLL, false);
                        C1394400mOE c1394400mOE = C1394400mOE.LIZ;
                        String creationId = templateAnchorConfigLIZLLL.getCreativeInfo().getCreationId();
                        c1394400mOE.getClass();
                        C1394400mOE.LIZIZ(aweme, creationId, mDPRecommendTemplateInfo);
                        return;
                    }
                    IExternalService iExternalService = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                    if (iExternalService != null) {
                        iExternalService.asyncService("pugc_template", new SimpleServiceLoadCallback() { // from class: X.0mOF
                            @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                            public final void onLoad(AsyncAVService asyncAVService, long j) {
                                IRecordService iRecordServiceRecordService = asyncAVService.uiService().recordService();
                                Activity activity = c19eg;
                                TemplateAnchorConfig templateAnchorConfig = templateAnchorConfigLIZLLL;
                                iRecordServiceRecordService.checkPUGCI2VQuota(activity, templateAnchorConfig, new AwS54S0500000_21(activity, iTemplateAnchorStrategyService, mDPRecommendTemplateInfo, aweme, templateAnchorConfig, 3));
                            }
                        });
                        return;
                    }
                    return;
                }
                return;
            }
        }
        List<AnchorCommonStruct> anchors2 = aweme.getAnchors();
        if (anchors2 != null) {
            Iterator<AnchorCommonStruct> it3 = anchors2.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                AnchorCommonStruct next2 = it3.next();
                if (next2.getType() == EnumC1430380nKG.ANCHOR_UGC_TEMPLATE.getTYPE()) {
                    anchorCommonStruct = next2;
                    break;
                }
            }
            final AnchorCommonStruct anchorCommonStruct3 = anchorCommonStruct;
            if (anchorCommonStruct3 != null && c19eg != null) {
                IExternalService iExternalService2 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                if (iExternalService2 != null && (iInfoServiceInfoService = iExternalService2.infoService()) != null) {
                    iInfoServiceInfoService.loadNLELib();
                }
                IExternalService iExternalService3 = (IExternalService) PluggableExtentionKt.pluggableSpi$default(IExternalService.class, false, false, false, 14, null);
                if (iExternalService3 != null) {
                    iExternalService3.asyncService("ugc_template", new SimpleServiceLoadCallback() { // from class: X.0mOC
                        @Override // com.ss.android.ugc.aweme.services.IExternalService.ServiceLoadCallback
                        public final void onLoad(AsyncAVService asyncAVService, long j) {
                            Object objPluggableSpi$default = PluggableExtentionKt.pluggableSpi$default(IAnchorBusinessOutBridgeService.class, false, false, false, 14, null);
                            if (objPluggableSpi$default != null) {
                                UgcTemplateAlbumConfig ugcTemplateAlbumConfigLJ = ((IAnchorBusinessOutBridgeService) objPluggableSpi$default).LJ(anchorCommonStruct3, aweme, asyncAVService);
                                ugcTemplateAlbumConfigLJ.setShootWay("mdp_square");
                                ugcTemplateAlbumConfigLJ.setMdpRecommendTemplateInfo(mDPRecommendTemplateInfo);
                                asyncAVService.uiService().recordService().startUgcTemplateAnchorAlbum(c19eg, ugcTemplateAlbumConfigLJ);
                                C1394400mOE c1394400mOE2 = C1394400mOE.LIZ;
                                Aweme aweme2 = aweme;
                                String creationId2 = ugcTemplateAlbumConfigLJ.getCreativeInfo().getCreationId();
                                MDPRecommendTemplateInfo mDPRecommendTemplateInfo2 = mDPRecommendTemplateInfo;
                                c1394400mOE2.getClass();
                                C1394400mOE.LIZIZ(aweme2, creationId2, mDPRecommendTemplateInfo2);
                                return;
                            }
                            "Required value was null.".toString();
                            throw new IllegalArgumentException("Required value was null.");
                        }
                    });
                }
            }
        }
    }
}
