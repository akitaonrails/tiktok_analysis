package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.bytex.pthread.base.proxy.PthreadTimer;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0v14, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1726000v14 extends AbstractC1726020v16 {
    public final C01GW LLILLL = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(13));

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x00bc: IGET (r0 I:X.01GW) = (r10 I:X.0v14) (LINE:50331836) X.0v14.LLILLL X.01GW, block:B:24:0x0091 */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00b9: INVOKE 
      (r11 I:com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock)
      (r4 I:int)
      (r3 I:java.lang.String)
      (r1 I:com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel)
      (r0 I:int)
     STATIC call: X.09Vj.LIZ(com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, int, java.lang.String, com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel, int):void A[MD:(com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock, int, java.lang.String, com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel, int):void (m)] (LINE:50331833), block:B:24:0x0091 */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.0v14] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        CompletionBlock completionBlockLIZ;
        ?? r10;
        final long jLongValue;
        boolean z;
        C1725990v13 c1725990v13LIZ;
        InterfaceC1726030v17 interfaceC1726030v17 = (InterfaceC1726030v17) xBaseParamModel;
        try {
            if (!C1726050v19.LIZ().enable) {
                EnumC1548140qOC enumC1548140qOC = EnumC1548140qOC.JSB_GET_PREFETCH_SWITCH_OFF;
                C2382909Vj.LIZ(completionBlock, enumC1548140qOC.getErrorCode(), enumC1548140qOC.getMessage(), null, 4);
                return;
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            final JSONObject jSONObject = new JSONObject();
            jSONObject.put("request_id", interfaceC1726030v17.getPrefetchKey());
            jSONObject.put("prefetch_api", interfaceC1726030v17.getApiUrl());
            ((InterfaceC1548020qO0) this.LLILLL.getValue()).LIZIZ("get_result", jSONObject);
            final String prefetchKey = interfaceC1726030v17.getPrefetchKey();
            final String apiUrl = interfaceC1726030v17.getApiUrl();
            Long l = C1726050v19.LIZ().timeout;
            if (l != null) {
                jLongValue = l.longValue();
                if (jLongValue > 0) {
                    z = true;
                }
                c1725990v13LIZ = C1725930v0x.LIZ(prefetchKey, apiUrl, z);
                if (!z && c1725990v13LIZ != null && c1725990v13LIZ.LIZ == EnumC1725940v0y.PENDING) {
                    new PthreadTimer("PipoGetNativePrefetchResultMethod").schedule(new C0W9W() { // from class: X.0v1A
                        @Override // java.util.TimerTask, java.lang.Runnable
                        public final void run() {
                            C1C7U.LIZ("PipoGetNativePrefetchResultMethod@fcf3.handle$1");
                            boolean zLJ = C0W9U.LJ(this.bpeaTraceContext);
                            try {
                                bpea_origin_timer_run();
                                if (zLJ) {
                                    C0W9U.LJFF();
                                }
                                C1C7U.LIZIZ("PipoGetNativePrefetchResultMethod@fcf3.handle$1");
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (zLJ) {
                                    C0W9U.LJFF();
                                }
                                throw th;
                            }
                        }

                        public final void bpea_origin_timer_run() {
                            try {
                                C1725990v13 c1725990v13LIZ2 = C1725930v0x.LIZ(prefetchKey, apiUrl, false);
                                jSONObject.put("timeout", jLongValue);
                                this.LIZJ(c1725990v13LIZ2, completionBlock, jCurrentTimeMillis, jSONObject);
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                if (!C2179971ATj.LIZ(th)) {
                                    throw th;
                                }
                            }
                        }
                    }, jLongValue);
                    return;
                } else {
                    LIZJ(c1725990v13LIZ, completionBlock, jCurrentTimeMillis, jSONObject);
                }
            }
            jLongValue = 0;
            z = false;
            c1725990v13LIZ = C1725930v0x.LIZ(prefetchKey, apiUrl, z);
            if (!z) {
            }
            LIZJ(c1725990v13LIZ, completionBlock, jCurrentTimeMillis, jSONObject);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            EnumC1548140qOC enumC1548140qOC2 = EnumC1548140qOC.JSB_GET_PREFETCH_EXCEPTION;
            int errorCode = enumC1548140qOC2.getErrorCode();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(enumC1548140qOC2.getMessage());
            sbLIZ.append(": ");
            sbLIZ.append(th.getMessage());
            C2382909Vj.LIZ(completionBlockLIZ, errorCode, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            ((InterfaceC1548020qO0) r10.LLILLL.getValue()).LIZLLL("get_result", th, null);
        }
    }

    public final void LIZJ(C1725990v13 c1725990v13, CompletionBlock<InterfaceC1726010v15> completionBlock, long j, JSONObject jSONObject) throws JSONException {
        String containerID;
        String str;
        LinkedHashMap linkedHashMap = null;
        if (c1725990v13 == null) {
            EnumC1548140qOC enumC1548140qOC = EnumC1548140qOC.JSB_GET_PREFETCH_RESULT_NULL;
            C2382909Vj.LIZ(completionBlock, enumC1548140qOC.getErrorCode(), enumC1548140qOC.getMessage(), null, 4);
            ((InterfaceC1548020qO0) this.LLILLL.getValue()).LIZJ("get_result", enumC1548140qOC, jSONObject);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        InterfaceC1726010v15 interfaceC1726010v15 = (InterfaceC1726010v15) C1909107dp.LIZJ(InterfaceC1726010v15.class, containerID);
        int i = C1725950v0z.LIZ[c1725990v13.LIZ.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        str = "pending";
                    } else {
                        throw new C1954807lC();
                    }
                } else {
                    str = "none";
                }
            } else {
                str = "fail";
            }
        } else {
            str = "success";
        }
        interfaceC1726010v15.setStatus(str);
        int length = 0;
        if (c1725990v13.LIZ == EnumC1725940v0y.SUCCESS) {
            String str2 = c1725990v13.LIZJ;
            if (str2 != null) {
                try {
                    if (str2.length() != 0) {
                        JSONObject jSONObject2 = new JSONObject(str2);
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            linkedHashMap2.put(next, jSONObject2.get(next));
                        }
                        linkedHashMap = linkedHashMap2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C1AF0.LJ(th);
                    ((InterfaceC1548020qO0) this.LLILLL.getValue()).LIZLLL("get_result", th, null);
                }
            }
            interfaceC1726010v15.setResponse(linkedHashMap);
        }
        interfaceC1726010v15.setRawResponse(c1725990v13.LIZJ);
        interfaceC1726010v15.setRequestInfo(c1725990v13.LIZIZ);
        completionBlock.onSuccess(interfaceC1726010v15, "");
        jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, interfaceC1726010v15.getStatus());
        String rawResponse = interfaceC1726010v15.getRawResponse();
        if (rawResponse != null) {
            length = rawResponse.length();
        }
        jSONObject.put("result_len", length);
        ((InterfaceC1548020qO0) this.LLILLL.getValue()).LIZ(Long.valueOf(System.currentTimeMillis() - j), "get_result", jSONObject);
    }
}
