package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.streak.impl.monitor.RestoreDelayCallbackData;
import com.ss.android.ugc.aweme.im.streak.impl.monitor.StreakPanelMountedData;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.06EB, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06EB extends C06EF {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Object c098200Yq;
        C06EW c06ewRemove;
        Object c098200Yq2;
        C06EG c06eg = (C06EG) xBaseParamModel;
        completionBlock.onSuccess((XBaseResultModel) C1909107dp.LIZJ(C06EI.class, null), "");
        if (Intrinsics.LJFF(c06eg.getCallbackType(), 0)) {
            C06EC c06ec = C06EC.LIZIZ;
            String callbackData = c06eg.getCallbackData();
            c06ec.getClass();
            C1231704rr c1231704rr = C06EC.LJI;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("receiveRestoreDelayCallbackData ");
            sbLIZ.append(callbackData);
            C2188811AlT.LIZIZ(sbLIZ);
            c1231704rr.getClass();
            try {
                c098200Yq2 = (RestoreDelayCallbackData) C051M.LIZIZ(RestoreDelayCallbackData.class, callbackData);
                C189200o6.m2constructorimpl(c098200Yq2);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq2 = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq2);
            }
            if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                C06EC.LJI.LIZIZ();
            }
            if (C189200o6.m7isFailureimpl(c098200Yq2)) {
                c098200Yq2 = null;
            }
            RestoreDelayCallbackData restoreDelayCallbackData = (RestoreDelayCallbackData) c098200Yq2;
            if (restoreDelayCallbackData != null) {
                ConcurrentHashMap<String, C09AE> concurrentHashMap = C06EC.LJ;
                C09AE c09aeRemove = concurrentHashMap.remove(restoreDelayCallbackData.peerId);
                if (c09aeRemove != null) {
                    c09aeRemove.LIZIZ(null);
                }
                C06E4.LIZ.getClass();
                String strLJ = C0YNP.LJ(restoreDelayCallbackData.peerId);
                TTMStrategyCenterManager.asyncEmitEventToGlobalStrategyEventStream("im_psp_streak_restore_result", new JSONObject(C2097608Jq.LJIIIIZZ(new Pair("convId", strLJ), new Pair("convType", Integer.valueOf(C1567806Bw.LIZIZ(strLJ))), new Pair("restoreResult", Integer.valueOf(restoreDelayCallbackData.restoreResult)), new Pair("receiveRestoreResponse", Long.valueOf(restoreDelayCallbackData.receiveRestoreResponse)), new Pair("clickRestoreButton", Long.valueOf(restoreDelayCallbackData.clickRestoreButton)))), (ExecutorService) null);
                concurrentHashMap.put(restoreDelayCallbackData.peerId, C23250099c.LIZLLL(C06EC.LJFF, null, null, new C06EA(restoreDelayCallbackData, null), 3));
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(c06eg.getCallbackType(), 1)) {
            C1459105nR c1459105nR = C1459105nR.LIZIZ;
            String callbackData2 = c06eg.getCallbackData();
            c1459105nR.getClass();
            C1231704rr c1231704rr2 = C1459105nR.LJFF;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("receiveLynxPanelDelayCallbackData ");
            sbLIZ2.append(callbackData2);
            C2188811AlT.LIZIZ(sbLIZ2);
            c1231704rr2.getClass();
            C23250099c.LIZLLL(C1459105nR.LIZLLL, null, null, new C066G(callbackData2, null), 3);
            return;
        }
        if (!Intrinsics.LJFF(c06eg.getCallbackType(), 2)) {
            return;
        }
        C06ED c06ed = C06ED.LIZIZ;
        String callbackData3 = c06eg.getCallbackData();
        c06ed.getClass();
        try {
            c098200Yq = (StreakPanelMountedData) C051M.LIZ.LJII(callbackData3, StreakPanelMountedData.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        StreakPanelMountedData streakPanelMountedData = (StreakPanelMountedData) c098200Yq;
        if (streakPanelMountedData == null || (c06ewRemove = C06ED.LJ.remove(streakPanelMountedData.uuid)) == null) {
            return;
        }
        C06ED.LIZ(c06ewRemove, true, null, null);
    }
}
