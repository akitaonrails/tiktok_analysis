package X;

import com.bytedance.common.wschannel.model.WsChannelMsg;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.Charsets;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XDq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845200XDq extends AbstractC845210XDr {
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Integer num;
        Integer num2;
        InterfaceC845220XDs interfaceC845220XDs = (InterfaceC845220XDs) xBaseParamModel;
        Number serviceId = interfaceC845220XDs.getServiceId();
        String containerID = null;
        if (serviceId instanceof Integer) {
            num = (Integer) serviceId;
        } else {
            num = null;
        }
        if (num != null) {
            final int iIntValue = num.intValue();
            Number methodId = interfaceC845220XDs.getMethodId();
            if ((methodId instanceof Integer) && (num2 = (Integer) methodId) != null) {
                final int iIntValue2 = num2.intValue();
                Map<String, InterfaceC486470J5x> map = C845140XDk.LIZIZ;
                if (((LinkedHashMap) map).get(C845140XDk.LIZ(iIntValue, iIntValue2)) == null) {
                    C2203431BLp c2203431BLp = C2203431BLp.LIZIZ;
                    if (c2203431BLp.getState() == C0XE1.CONNECTION_UNKNOWN) {
                        c2203431BLp.LJ(interfaceC845220XDs.getEnterFrom());
                    }
                    InterfaceC486470J5x interfaceC486470J5x = new InterfaceC486470J5x() { // from class: X.0J7l
                        @Override // X.InterfaceC486470J5x
                        public final void LIZIZ(WsChannelMsg wsChannelMsg) {
                            HashMap map2 = new HashMap();
                            int i = iIntValue;
                            int i2 = iIntValue2;
                            map2.put("serviceId", Integer.valueOf(i));
                            map2.put("methodId", Integer.valueOf(i2));
                            map2.put("payload", new String(wsChannelMsg.LIZ(), Charsets.UTF_8));
                            C1548820qPI.LIZIZ(new C397901gf(System.currentTimeMillis(), new C1323820kYO(new JSONObject(map2)), "poiWsMsgReceived"));
                        }
                    };
                    map.put(C845140XDk.LIZ(iIntValue, iIntValue2), interfaceC486470J5x);
                    c2203431BLp.LJI(iIntValue, iIntValue2, interfaceC486470J5x);
                    C0XEZ c0xez = new C0XEZ() { // from class: X.0J7m
                        /* JADX WARN: Removed duplicated region for block: B:16:0x0059 A[PHI: r1
                          0x0059: PHI (r1v6 int) = (r1v5 int), (r1v7 int) binds: [B:9:0x0014, B:13:0x001a] A[DONT_GENERATE, DONT_INLINE]] */
                        /* JADX WARN: Removed duplicated region for block: B:17:0x005b A[PHI: r0
                          0x005b: PHI (r0v9 int) = (r0v8 int), (r0v10 int) binds: [B:7:0x0011, B:11:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // X.C0XEZ
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void LIZ(X.C821280WJq r7, org.json.JSONObject r8) {
                            /*
                                r6 = this;
                                X.0XE1 r0 = r7.LIZIZ
                                r3 = -1
                                if (r0 == 0) goto L1c
                                int[] r1 = X.C845250XDv.LIZ
                                int r0 = r0.ordinal()
                                r2 = r1[r0]
                                r0 = 1
                                if (r2 == r0) goto L5d
                                r1 = 2
                                if (r2 == r1) goto L5b
                                r0 = 3
                                if (r2 == r0) goto L59
                                r1 = 4
                                if (r2 == r1) goto L5b
                                r0 = 5
                                if (r2 == r0) goto L59
                            L1c:
                                java.util.HashMap r5 = new java.util.HashMap
                                r5.<init>()
                                int r0 = r1
                                int r2 = r2
                                java.lang.String r1 = "serviceId"
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                                r5.put(r1, r0)
                                java.lang.String r1 = "methodId"
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
                                r5.put(r1, r0)
                                java.lang.String r1 = "status"
                                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                                r5.put(r1, r0)
                                X.01gf r4 = new X.01gf
                                long r2 = java.lang.System.currentTimeMillis()
                                X.0kYO r1 = new X.0kYO
                                org.json.JSONObject r0 = new org.json.JSONObject
                                r0.<init>(r5)
                                r1.<init>(r0)
                                java.lang.String r0 = "poiWsStatusChanged"
                                r4.<init>(r2, r1, r0)
                                X.C1548820qPI.LIZIZ(r4)
                                return
                            L59:
                                r3 = r1
                                goto L1c
                            L5b:
                                r3 = r0
                                goto L1c
                            L5d:
                                r3 = 0
                                goto L1c
                            */
                            throw new UnsupportedOperationException("Method not decompiled: X.C486880J7m.LIZ(X.0WJq, org.json.JSONObject):void");
                        }
                    };
                    C845140XDk.LIZ.put(C845140XDk.LIZ(iIntValue, iIntValue2), c0xez);
                    c2203431BLp.LIZLLL(c0xez);
                    InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
                    if (interfaceC634840OvC != null) {
                        containerID = interfaceC634840OvC.getContainerID();
                    }
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC845230XDt.class, containerID);
                    ((InterfaceC845230XDt) xBaseModelLIZJ).setCode(10001);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                    return;
                }
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID = interfaceC634840OvC2.getContainerID();
                }
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC845230XDt.class, containerID);
                ((InterfaceC845230XDt) xBaseModelLIZJ2).setCode(10002);
                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "serviceId type error", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "serviceId type error", null, 4);
    }
}
