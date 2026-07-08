package X;

import android.app.Activity;
import com.ss.android.ugc.aweme.compliance.api.interfaces.IFundraiserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.services.IExternalService;
import com.ss.android.ugc.aweme.services.IMusicPublishBridgeService;
import com.ss.android.ugc.aweme.shortvideo.CreateBaseAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.CreateAwemeResponse;
import com.ss.android.ugc.aweme.shortvideo.publish.PublishModel;
import com.ss.android.ugc.aweme.story.publish.ISocialPublishBridgeService;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import kotlin.jvm.internal.AFwS210S0000000_22;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0nP1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1433330nP1 extends AbstractC1433570nPP {
    public static final C01GW<ISocialPublishBridgeService> LIZJ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(465));
    public PublishModel LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(466));

    public C1433330nP1(PublishModel publishModel) {
        this.LIZ = publishModel;
    }

    public static String LIZ(C1434650nR9 c1434650nR9) {
        Activity topActivity = ActivityStack.getTopActivity();
        if (topActivity == null) {
            return "";
        }
        return ((IExternalService) ServiceManager.get().getService(IExternalService.class)).publishService().getErrorMsg(topActivity, c1434650nR9, topActivity.getString(2131849116));
    }

    public final void LIZIZ(String str) {
        String str2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(" | creationId:");
        PublishModel publishModel = this.LIZ;
        String str3 = null;
        if (publishModel != null) {
            str2 = publishModel.creationId;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(",publishId:");
        PublishModel publishModel2 = this.LIZ;
        if (publishModel2 != null) {
            str3 = publishModel2.publishId;
        }
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1433570nPP
    public final void onProgress(int i, Object obj) {
        C1434900nRY c1434900nRY;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onProgress,progress:");
        sbLIZ.append(i);
        LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
        ISocialPublishBridgeService iSocialPublishBridgeServiceLIZ = C1403320mcc.LIZ();
        if (obj instanceof C1434900nRY) {
            c1434900nRY = (C1434900nRY) obj;
        } else {
            c1434900nRY = null;
        }
        iSocialPublishBridgeServiceLIZ.onPublishProgress(i, c1434900nRY);
    }

    public final void LIZJ(PublishModel publishModel, C1434650nR9 c1434650nR9, String str) {
        LIZIZ("onPublishFailed");
        C1403320mcc.LIZ().onPublishFailed(publishModel, c1434650nR9, str);
    }

    @Override // X.AbstractC1433570nPP
    public final void onCancel(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
        super.onCancel(abstractC1433460nPE, obj, publishModel);
        C1403320mcc.LIZ().onPublishCanceled(publishModel, abstractC1433460nPE, obj);
    }

    @Override // X.AbstractC1433570nPP
    public final void onFinish(AbstractC1433460nPE abstractC1433460nPE, Object obj, PublishModel publishModel) {
        if (abstractC1433460nPE instanceof C492390JSr) {
            CreateBaseAwemeResponse createBaseAwemeResponse = ((C492390JSr) abstractC1433460nPE).LIZ;
            LIZIZ("onPublishSuccess");
            if (createBaseAwemeResponse instanceof CreateAwemeResponse) {
                CreateAwemeResponse createAwemeResponse = (CreateAwemeResponse) createBaseAwemeResponse;
                C1403320mcc.LIZ().onPublishSuccess(publishModel, createAwemeResponse);
                ((IMusicPublishBridgeService) this.LIZIZ.getValue()).onPublishSuccess(publishModel, createAwemeResponse);
                IFundraiserService iFundraiserService = (IFundraiserService) PluggableExtentionKt.pluggableSpi$default(IFundraiserService.class, false, false, false, 14, null);
                if (iFundraiserService != null) {
                    iFundraiserService.LJIIIZ();
                    return;
                }
                return;
            }
            return;
        }
        if (abstractC1433460nPE instanceof C1433450nPD) {
            C1433450nPD c1433450nPD = (C1433450nPD) abstractC1433460nPE;
            C1433270nOv c1433270nOv = c1433450nPD.LIZ;
            if (c1433270nOv.LIZLLL == null || !(c1433270nOv.LJ instanceof Boolean)) {
                return;
            }
            C1433270nOv c1433270nOv2 = c1433450nPD.LIZ;
            C1434650nR9 c1434650nR9 = new C1434650nR9(c1433270nOv2.LIZLLL, c1433270nOv2.LIZJ, c1433270nOv2.LJFF, c1433270nOv2.LIZIZ);
            c1434650nR9.setRecover(((Boolean) c1433450nPD.LIZ.LJ).booleanValue());
            LIZJ(publishModel, c1434650nR9, LIZ(c1434650nR9));
            return;
        }
        if (abstractC1433460nPE instanceof C1433410nP9) {
            C1430810nKx c1430810nKx = ((C1433410nP9) abstractC1433460nPE).LIZ;
            LIZJ(publishModel, c1430810nKx, LIZ(c1430810nKx));
            return;
        }
        if (abstractC1433460nPE instanceof C1433440nPC) {
            C1434650nR9 c1434650nR92 = ((C1433440nPC) abstractC1433460nPE).LIZ;
            LIZJ(publishModel, c1434650nR92, LIZ(c1434650nR92));
            return;
        }
        if (abstractC1433460nPE instanceof C1433420nPA) {
            C1434650nR9 c1434650nR93 = ((C1433420nPA) abstractC1433460nPE).LIZ.LIZJ;
            if (c1434650nR93 == null) {
                c1434650nR93 = new C1434650nR9(new Throwable(""));
            }
            LIZJ(publishModel, c1434650nR93, LIZ(c1434650nR93));
            return;
        }
        if (!(abstractC1433460nPE instanceof C1433430nPB)) {
            return;
        }
        C1434650nR9 c1434650nR94 = ((C1433430nPB) abstractC1433460nPE).LIZ.LIZJ;
        if (c1434650nR94 == null) {
            c1434650nR94 = new C1434650nR9(new Throwable(""));
        }
        LIZJ(publishModel, c1434650nR94, LIZ(c1434650nR94));
    }

    @Override // X.AbstractC1433570nPP
    public final void onStageUpdate(String str, AbstractC1433380nP6 abstractC1433380nP6, Object obj) {
        if (Intrinsics.LJFF(str, "STAGE_SYNTHETIC") && (abstractC1433380nP6 instanceof C1433370nP5)) {
            AbstractC1433400nP8 abstractC1433400nP8 = ((C1433370nP5) abstractC1433380nP6).LIZ;
            if (abstractC1433400nP8 instanceof C1433390nP7) {
                Object obj2 = ((C1433390nP7) abstractC1433400nP8).LIZ;
                if (obj2 instanceof String) {
                    String str2 = (String) obj2;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onSynthetiseSuccess,path:");
                    sbLIZ.append(str2);
                    LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                    C1403320mcc.LIZ().onSynthesisSuccess(this.LIZ, str2);
                }
            }
        }
    }
}
