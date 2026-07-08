package X;

import android.view.ViewGroup;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.aweme.pns.consent.collector.api.IPNSConsentCollectorService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.IGatekeeperService;
import com.ss.android.ugc.aweme.pns.gatekeeper.api.networkservice.DecisionMakerNetworkApi;
import com.ss.android.ugc.aweme.pns.usercommunication.api.UserCommunicationProcessorModel;
import kotlin.jvm.internal.AFwS217S0000000_28;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zvz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915050zvz {
    public static final C1915050zvz LIZ = new C1915050zvz();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(562));

    public static void LIZ(String str, ViewGroup viewGroup) {
        DecisionMakerNetworkApi.EligibilityModel eligibilityModelLIZ;
        Object obj;
        String str2;
        CollectConsentParam collectConsentParamLJ;
        IPNSConsentCollectorService iPNSConsentCollectorService;
        IGatekeeperService iGatekeeperService = (IGatekeeperService) PluggableExtentionKt.pluggableSpi$default(IGatekeeperService.class, false, false, false, 14, null);
        if (iGatekeeperService != null && (eligibilityModelLIZ = iGatekeeperService.LIZ("tiktok_content_creation")) != null) {
            UserCommunicationProcessorModel userCommunicationProcessorModel = null;
            for (DecisionMakerNetworkApi.PPFActionModel pPFActionModel : eligibilityModelLIZ.actionList) {
                try {
                    C1227904rF.LIZ.getClass();
                    String strLJI = C1227904rF.LJI(pPFActionModel);
                    if (strLJI == null) {
                        strLJI = "";
                    }
                    UserCommunicationProcessorModel userCommunicationProcessorModel2 = (UserCommunicationProcessorModel) C1227904rF.LIZIZ(strLJI, UserCommunicationProcessorModel.class);
                    if (Intrinsics.LJFF(userCommunicationProcessorModel2.processorID, "ConsentCollectProcessor")) {
                        userCommunicationProcessorModel = userCommunicationProcessorModel2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (userCommunicationProcessorModel != null) {
                obj = userCommunicationProcessorModel.processorData;
            } else {
                obj = null;
            }
            if ((obj instanceof String) && (str2 = (String) obj) != null) {
                LIZ.getClass();
                C01GW c01gw = LIZIZ;
                IPNSConsentCollectorService iPNSConsentCollectorService2 = (IPNSConsentCollectorService) c01gw.getValue();
                if (iPNSConsentCollectorService2 != null && (collectConsentParamLJ = iPNSConsentCollectorService2.LJ(str2)) != null && (iPNSConsentCollectorService = (IPNSConsentCollectorService) c01gw.getValue()) != null) {
                    iPNSConsentCollectorService.LJFF(viewGroup.getContext(), collectConsentParamLJ, new C1914960zvq(str, viewGroup), null);
                }
            }
        }
    }
}
