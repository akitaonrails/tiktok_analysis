package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0vNP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739850vNP extends AbstractC1739810vNL {
    public final long LLILLL = 10000;

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        ConcurrentHashMap<String, Object> concurrentHashMap;
        long jLongValue;
        String containerID;
        InterfaceC1739820vNM interfaceC1739820vNM = (InterfaceC1739820vNM) xBaseParamModel;
        final String prefetchKey = interfaceC1739820vNM.getPrefetchKey();
        final String apiPath = interfaceC1739820vNM.getApiPath();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            Number timeout = interfaceC1739820vNM.getTimeout();
            if (timeout != null) {
                jLongValue = timeout.longValue();
            } else {
                jLongValue = this.LLILLL;
            }
            final PthreadTimer pthreadTimer = new PthreadTimer("GetNativePrefetchResultMethod");
            final C1739860vNQ c1739860vNQ = (C1739860vNQ) ((LinkedHashMap) C1739770vNH.LIZ).get(prefetchKey);
            if (c1739860vNQ != null) {
                pthreadTimer.schedule(new C0W9W() { // from class: X.0vNJ
                    public final void LIZ() {
                        Map mapLJIIZILJ = C2097608Jq.LJIIZILJ(c1739860vNQ.LJI);
                        c1739860vNQ.LIZ();
                        C2382909Vj.LIZ(completionBlock, -9999, "call jsb timeout", null, 4);
                        C1739950vNZ.LIZIZ(C1739950vNZ.LIZ, "bridge_called", "fail", prefetchKey, apiPath, null, "jsb_time_out", null, null, null, null, mapLJIIZILJ, 976);
                    }

                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        C1C7U.LIZ("GetNativePrefetchResultMethod@6a9b.handle$1$1");
                        boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                        try {
                            LIZ();
                        } finally {
                        }
                        if (zLJ) {
                            C0W9U.LJFF();
                        }
                        C1C7U.LIZIZ("GetNativePrefetchResultMethod@6a9b.handle$1$1");
                    }
                }, jLongValue);
                InterfaceC1739890vNT interfaceC1739890vNT = new InterfaceC1739890vNT() { // from class: X.0vNV
                    /* JADX WARN: Removed duplicated region for block: B:41:0x0110  */
                    @Override // X.InterfaceC1739890vNT
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(X.C1739920vNW r20) {
                        /*
                            Method dump skipped, instruction units count: 367
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C1739910vNV.LIZ(X.0vNW):void");
                    }
                };
                if (c1739860vNQ.LIZJ) {
                    interfaceC1739890vNT.LIZ(new C1739920vNW(EnumC1739900vNU.EXECUTE_ERROR.getValue()));
                } else {
                    C1739880vNS c1739880vNS = c1739860vNQ.LIZIZ.get(apiPath);
                    if (c1739880vNS != null) {
                        C1739920vNW c1739920vNW = c1739880vNS.LIZ;
                        if (c1739920vNW != null) {
                            interfaceC1739890vNT.LIZ(c1739920vNW);
                        } else {
                            c1739880vNS.LIZIZ = interfaceC1739890vNT;
                        }
                    }
                }
            } else {
                try {
                    C1739950vNZ.LIZIZ(C1739950vNZ.LIZ, "bridge_called", "fail", prefetchKey, apiPath, null, "jsb_params_wrong", null, null, null, null, null, 2000);
                    C19719912Dl c19719912DlLIZ = C13LE.LIZ(InterfaceC1739840vNO.class);
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        containerID = interfaceC634840OvC.getContainerID();
                    } else {
                        containerID = null;
                    }
                    XBaseModel xBaseModelLIZJ = C1549500qQO.LIZJ(containerID, c19719912DlLIZ);
                    InterfaceC1739840vNO interfaceC1739840vNO = (InterfaceC1739840vNO) xBaseModelLIZJ;
                    interfaceC1739840vNO.setState(Integer.valueOf(EnumC1739900vNU.EXECUTE_ERROR.getValue()));
                    interfaceC1739840vNO.setResult(null);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                    C2382909Vj.LIZ(completionBlock, 0, "call jsb fail", null, 4);
                    C1739950vNZ c1739950vNZ = C1739950vNZ.LIZ;
                    String message = e.getMessage();
                    C1739860vNQ c1739860vNQ2 = (C1739860vNQ) ((LinkedHashMap) C1739770vNH.LIZ).get(prefetchKey);
                    if (c1739860vNQ2 != null) {
                        concurrentHashMap = c1739860vNQ2.LJI;
                    } else {
                        concurrentHashMap = null;
                    }
                    C1739950vNZ.LIZIZ(c1739950vNZ, "bridge_called", "fail", prefetchKey, apiPath, null, message, null, null, null, null, concurrentHashMap, 976);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        C1440005kM.LIZ(new C1739870vNR(prefetchKey, apiPath));
    }
}
