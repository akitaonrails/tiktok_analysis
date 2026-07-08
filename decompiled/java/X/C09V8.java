package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.INetworkApi;
import com.google.gson.n;
import com.ss.android.ugc.aweme.fe.method.SendAnalyticsEventApi;
import com.ss.android.ugc.aweme.settings.SendAnalyticsEventData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09V8, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09V8 extends C09VQ {
    public final String LLILLL;
    public final List<String> LLILZ;

    public C09V8() {
        SendAnalyticsEventData sendAnalyticsEventDataLIZ = C09V7.LIZ();
        this.LLILLL = sendAnalyticsEventDataLIZ != null ? sendAnalyticsEventDataLIZ.baseUrl : null;
        SendAnalyticsEventData sendAnalyticsEventDataLIZ2 = C09V7.LIZ();
        this.LLILZ = sendAnalyticsEventDataLIZ2 != null ? sendAnalyticsEventDataLIZ2.whiteList : null;
    }

    public static final List<C080U> LIZJ(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            Iterator<String> itKeys = jSONObject.keys();
            ArrayList arrayList = new ArrayList();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                arrayList.add(new C080U(next, JSONObjectProtectorUtils.getString(jSONObject, next)));
            }
            return arrayList;
        }
        return null;
    }

    public static final Map<String, String> LIZLLL(JSONObject jSONObject) {
        if (jSONObject != null && jSONObject.length() != 0) {
            Iterator<String> itKeys = jSONObject.keys();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                linkedHashMap.put(next, jSONObject.get(next).toString());
            }
            return linkedHashMap;
        }
        return null;
    }

    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean zContains;
        JSONObject jSONObject;
        n nVar;
        JSONObject jSONObject2;
        C09V9 c09v9 = (C09V9) xBaseParamModel;
        String path = c09v9.getPath();
        String str = "";
        if (path == null) {
            path = "";
        }
        List<String> list = this.LLILZ;
        if (list == null) {
            zContains = false;
        } else {
            zContains = list.contains(path);
        }
        if (!zContains) {
            C2382909Vj.LIZ(completionBlock, 0, "path doesn't match!", null, 4);
            return;
        }
        String method = c09v9.getMethod();
        Map<String, Object> params = c09v9.getParams();
        if (params != null) {
            jSONObject = new JSONObject(params);
        } else {
            jSONObject = null;
        }
        Map<String, Object> data = c09v9.getData();
        if (data != null) {
            nVar = (n) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), C786410Ut5.J3(new JSONObject(data)), n.class);
        } else {
            nVar = null;
        }
        Map<String, Object> header = c09v9.getHeader();
        if (header != null) {
            jSONObject2 = new JSONObject(header);
        } else {
            jSONObject2 = null;
        }
        if (TextUtils.equals(method, "GET")) {
            List<C080U> listLIZJ = LIZJ(jSONObject2);
            String str2 = this.LLILLL;
            if (str2 != null && !a0.LJJJIL(str2)) {
                Map<String, String> mapLIZLLL = LIZLLL(jSONObject);
                try {
                    List<C080U> listLJIILJJIL = C1697810uHb.LJIILJJIL(new C080U("X-SS-No-Cookie", "true"));
                    if (listLIZJ != null && !((ArrayList) listLIZJ).isEmpty()) {
                        listLJIILJJIL.addAll(listLIZJ);
                    }
                    C1499850p8J c1499850p8J = (C1499850p8J) C09S2.LIZIZ(this.LLILLL);
                    c1499850p8J.LIZJ = true;
                    ((INetworkApi) c1499850p8J.build().retrofit.LIZ(INetworkApi.class)).doGet(false, -1, path, mapLIZLLL, listLJIILJJIL, null).enqueue(new InterfaceC594300NSq<String>() { // from class: X.09VS
                        @Override // X.InterfaceC594300NSq
                        public final void onFailure(C0X9S<String> c0x9s, Throwable th) {
                            String message;
                            CompletionBlock<C09VR> completionBlock2 = completionBlock;
                            if (th == null || (message = th.getMessage()) == null) {
                                message = "";
                            }
                            C2382909Vj.LIZ(completionBlock2, 1, message, null, 4);
                        }

                        @Override // X.InterfaceC594300NSq
                        public final void onResponse(C0X9S<String> c0x9s, C0X52<String> c0x52) {
                            String containerID;
                            InterfaceC634840OvC interfaceC634840OvC = this.LL.IBridgeSdkContext;
                            String str3 = null;
                            if (interfaceC634840OvC != null) {
                                containerID = interfaceC634840OvC.getContainerID();
                            } else {
                                containerID = null;
                            }
                            C09VR c09vr = (C09VR) C1909107dp.LIZJ(C09VR.class, containerID);
                            if (c0x52 != null) {
                                str3 = c0x52.LIZIZ;
                            }
                            c09vr.setBody(str3);
                            completionBlock.onSuccess(c09vr, "");
                        }
                    });
                    return;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    String message = e.getMessage();
                    if (message != null) {
                        str = message;
                    }
                    C2382909Vj.LIZ(completionBlock, 1, str, null, 4);
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "base url is empty!", null, 4);
            return;
        }
        if (TextUtils.equals(method, "POST")) {
            List<C080U> listLIZJ2 = LIZJ(jSONObject2);
            String str3 = this.LLILLL;
            if (str3 != null && !a0.LJJJIL(str3)) {
                try {
                    List<C080U> listLJIILJJIL2 = C1697810uHb.LJIILJJIL(new C080U("X-SS-No-Cookie", "true"));
                    if (listLIZJ2 != null && !((ArrayList) listLIZJ2).isEmpty()) {
                        listLJIILJJIL2.addAll(listLIZJ2);
                    }
                    C1499850p8J c1499850p8J2 = (C1499850p8J) C09S2.LIZIZ(this.LLILLL);
                    c1499850p8J2.LIZJ = true;
                    ((SendAnalyticsEventApi) c1499850p8J2.build().retrofit.LIZ(SendAnalyticsEventApi.class)).doPost(false, -1, path, LIZLLL(jSONObject), nVar, listLJIILJJIL2, null).enqueue(new InterfaceC594300NSq<String>() { // from class: X.09VT
                        @Override // X.InterfaceC594300NSq
                        public final void onFailure(C0X9S<String> c0x9s, Throwable th) {
                            String message2;
                            CompletionBlock<C09VR> completionBlock2 = completionBlock;
                            if (th == null || (message2 = th.getMessage()) == null) {
                                message2 = "";
                            }
                            C2382909Vj.LIZ(completionBlock2, 1, message2, null, 4);
                        }

                        @Override // X.InterfaceC594300NSq
                        public final void onResponse(C0X9S<String> c0x9s, C0X52<String> c0x52) {
                            String containerID;
                            InterfaceC634840OvC interfaceC634840OvC = this.LL.IBridgeSdkContext;
                            String str4 = null;
                            if (interfaceC634840OvC != null) {
                                containerID = interfaceC634840OvC.getContainerID();
                            } else {
                                containerID = null;
                            }
                            C09VR c09vr = (C09VR) C1909107dp.LIZJ(C09VR.class, containerID);
                            if (c0x52 != null) {
                                str4 = c0x52.LIZIZ;
                            }
                            c09vr.setBody(str4);
                            completionBlock.onSuccess(c09vr, "");
                        }
                    });
                    return;
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    String message2 = e2.getMessage();
                    if (message2 != null) {
                        str = message2;
                    }
                    C2382909Vj.LIZ(completionBlock, 1, str, null, 4);
                    return;
                }
            }
            C2382909Vj.LIZ(completionBlock, 0, "base url is empty!", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "method is neither GET nor POST", null, 4);
    }
}
