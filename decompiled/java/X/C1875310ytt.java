package X;

import android.content.Context;
import android.util.Base64;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener;
import com.bytedance.frameworks.baselib.network.http.cronet.websocket.IWsClient;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Unit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ytt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1875310ytt extends AbstractC1873430yqr {
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0z0j] */
    /* JADX WARN: Type inference failed for: r9v0, types: [X.0yu4] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        Context context;
        final String containerID;
        final InterfaceC1063720dms interfaceC1063720dms;
        JSONObject jSONObject;
        JSONArray jSONArray;
        InterfaceC1873420yqq interfaceC1873420yqq = (InterfaceC1873420yqq) xBaseParamModel;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (context = interfaceC634840OvC.getContext()) != null) {
            InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
            if (interfaceC634840OvC2 != null && (containerID = interfaceC634840OvC2.getContainerID()) != null && containerID.length() != 0) {
                InterfaceC634840OvC interfaceC634840OvC3 = this.IBridgeSdkContext;
                if (interfaceC634840OvC3 != null && (interfaceC1063720dms = (InterfaceC1063720dms) interfaceC634840OvC3.LIZIZ(InterfaceC1063720dms.class)) != null) {
                    String url = interfaceC1873420yqq.getUrl();
                    Map<String, Object> header = interfaceC1873420yqq.getHeader();
                    if (header != null) {
                        jSONObject = new JSONObject(header);
                    } else {
                        jSONObject = null;
                    }
                    List<String> protocols = interfaceC1873420yqq.getProtocols();
                    if (protocols != null) {
                        jSONArray = new JSONArray((Collection) protocols);
                    } else {
                        jSONArray = null;
                    }
                    C1875330ytv c1875330ytv = new C1875330ytv(url, jSONArray, jSONObject);
                    final ?? r9 = new InterfaceC1875500yuC() { // from class: X.0yu4
                        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                        @Override // X.InterfaceC1875500yuC
                        public final void LIZ(C1875480yuA c1875480yuA) {
                            String str = c1875480yuA.LIZ;
                            switch (str.hashCode()) {
                                case -1987107780:
                                    if (str.equals("onMessaged")) {
                                        HashMap map = new HashMap();
                                        map.put("socketTaskID", c1875480yuA.LIZIZ);
                                        String str2 = c1875480yuA.LIZLLL;
                                        if (str2 != null) {
                                            map.put("data", str2);
                                        }
                                        String str3 = c1875480yuA.LJ;
                                        if (str3 != null) {
                                            map.put("dataType", str3);
                                        }
                                        try {
                                            interfaceC1063720dms.LIZ("x.socketDataReceived", map);
                                            C189200o6.m2constructorimpl(Unit.LIZ);
                                        } catch (Throwable th) {
                                            TryCatchGuardChecker.doCheck(th);
                                            C189200o6.m2constructorimpl(new C098200Yq(th));
                                            return;
                                        }
                                    }
                                    break;
                                case -1357520532:
                                    if (str.equals("closed")) {
                                        HashMap map2 = new HashMap();
                                        map2.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "closed");
                                        map2.put("socketTaskID", c1875480yuA.LIZIZ);
                                        map2.put("message", c1875480yuA.LIZJ);
                                        try {
                                            interfaceC1063720dms.LIZ("x.socketStatusChanged", map2);
                                            C189200o6.m2constructorimpl(Unit.LIZ);
                                        } catch (Throwable th2) {
                                            TryCatchGuardChecker.doCheck(th2);
                                            C189200o6.m2constructorimpl(new C098200Yq(th2));
                                            return;
                                        }
                                    }
                                    break;
                                case -1281977283:
                                    if (str.equals("failed")) {
                                        HashMap map3 = new HashMap();
                                        map3.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "failed");
                                        map3.put("message", c1875480yuA.LIZJ);
                                        map3.put("socketTaskID", c1875480yuA.LIZIZ);
                                        try {
                                            interfaceC1063720dms.LIZ("x.socketStatusChanged", map3);
                                            C189200o6.m2constructorimpl(Unit.LIZ);
                                        } catch (Throwable th3) {
                                            TryCatchGuardChecker.doCheck(th3);
                                            C189200o6.m2constructorimpl(new C098200Yq(th3));
                                            return;
                                        }
                                    }
                                    break;
                                case -579210487:
                                    if (str.equals("connected")) {
                                        HashMap map4 = new HashMap();
                                        map4.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "connected");
                                        map4.put("socketTaskID", c1875480yuA.LIZIZ);
                                        try {
                                            interfaceC1063720dms.LIZ("x.socketStatusChanged", map4);
                                            C189200o6.m2constructorimpl(Unit.LIZ);
                                        } catch (Throwable th4) {
                                            TryCatchGuardChecker.doCheck(th4);
                                            C189200o6.m2constructorimpl(new C098200Yq(th4));
                                            return;
                                        }
                                    }
                                    break;
                            }
                        }
                    };
                    final C1700080uLG value = C1700080uLG.LIZIZ.getValue();
                    value.getClass();
                    final C1875610yuN c1875610yuN = new C1875610yuN(context, c1875330ytv);
                    try {
                        IWsClient iWsClientLIZ = C1879530z0h.LIZ(new IMessageReceiveListener() { // from class: X.0z0j
                            public String LIZ;

                            @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener
                            public final void onFeedBackLog(String str) {
                                JSONObject jSONObject2;
                                String str2;
                                JSONObject jSONObject3;
                                if (c1875610yuN == null) {
                                    return;
                                }
                                try {
                                    jSONObject2 = new JSONObject(str);
                                } catch (Exception e) {
                                    TryCatchGuardChecker.doCheck(e);
                                    jSONObject2 = new JSONObject();
                                }
                                int iOptInt = jSONObject2.optInt("ws_state", -1);
                                if (iOptInt == -1) {
                                    return;
                                }
                                if (iOptInt == 0) {
                                    if (jSONObject2.optBoolean("using_quic")) {
                                        str2 = "quic";
                                    } else {
                                        str2 = "tcp";
                                    }
                                    try {
                                        jSONObject3 = new JSONObject(this.LIZ);
                                    } catch (Exception e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                        jSONObject3 = new JSONObject();
                                    }
                                    try {
                                        jSONObject3.put("__MP_RESP_HEADER", jSONObject2.optString("response_header"));
                                    } catch (Exception e3) {
                                        TryCatchGuardChecker.doCheck(e3);
                                    }
                                    try {
                                        jSONObject3.put("__MP_TRANSPORT_PROTOCOL", str2);
                                    } catch (Exception e4) {
                                        TryCatchGuardChecker.doCheck(e4);
                                    }
                                    try {
                                        jSONObject3.put("__MP_LOG", jSONObject2);
                                    } catch (JSONException e5) {
                                        TryCatchGuardChecker.doCheck(e5);
                                    }
                                    c1875610yuN.LIZ(4, String.valueOf(jSONObject3));
                                    return;
                                }
                                if (iOptInt == 1 || iOptInt == 3) {
                                    c1875610yuN.LIZ(3, jSONObject2.optString("ws_error"));
                                }
                            }

                            @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener
                            public final void onMessage(byte[] bArr, int i) {
                                InterfaceC1879570z0l interfaceC1879570z0l = c1875610yuN;
                                if (interfaceC1879570z0l == null) {
                                    return;
                                }
                                int i2 = 1;
                                if (i != 1) {
                                    i2 = 2;
                                    if (i != 2) {
                                        i2 = 0;
                                    }
                                }
                                interfaceC1879570z0l.onMessage(bArr, i2);
                            }

                            @Override // com.bytedance.frameworks.baselib.network.http.cronet.websocket.IMessageReceiveListener
                            public final void onConnection(int i, String str, JSONObject jSONObject2) {
                                String strValueOf;
                                if (c1875610yuN == null) {
                                    return;
                                }
                                if (jSONObject2 != null) {
                                    strValueOf = String.valueOf(jSONObject2);
                                } else {
                                    strValueOf = "{}";
                                }
                                if (i != 4 && i != 3 && i != 2) {
                                    c1875610yuN.LIZ(i, strValueOf);
                                } else {
                                    this.LIZ = strValueOf;
                                }
                            }
                        });
                        if (iWsClientLIZ != null) {
                            c1875610yuN.LJFF = new C1875320ytu(iWsClientLIZ);
                            final String string = UUID.randomUUID().toString();
                            c1875610yuN.LIZJ = new InterfaceC1875630yuP(containerID, string, r9) { // from class: X.0yu6
                                public final String LIZ;
                                public final String LIZIZ;
                                public final InterfaceC1875500yuC LIZJ;

                                @Override // X.InterfaceC1875630yuP
                                public final void LIZ() {
                                    this.LIZJ.LIZ(new C1875470yu9("connected", this.LIZIZ).LIZ());
                                }

                                @Override // X.InterfaceC1875630yuP
                                public final void LIZIZ(String str) {
                                    C1875470yu9 c1875470yu9 = new C1875470yu9("onMessaged", this.LIZIZ);
                                    InterfaceC1875500yuC interfaceC1875500yuC = this.LIZJ;
                                    c1875470yu9.LIZLLL = str;
                                    c1875470yu9.LJ = "string";
                                    interfaceC1875500yuC.LIZ(c1875470yu9.LIZ());
                                }

                                @Override // X.InterfaceC1875630yuP
                                public final void LIZJ(boolean z) {
                                    C1875470yu9 c1875470yu9 = new C1875470yu9("closed", this.LIZIZ);
                                    if (z) {
                                        this.LIZJ.LIZ(c1875470yu9.LIZ());
                                    }
                                    C1700080uLG c1700080uLG = this.LIZLLL;
                                    String str = this.LIZ;
                                    String str2 = this.LIZIZ;
                                    c1700080uLG.getClass();
                                    C1700080uLG.LIZIZ(str, str2);
                                }

                                @Override // X.InterfaceC1875630yuP
                                public final void onFailed(String str) {
                                    C1875470yu9 c1875470yu9 = new C1875470yu9("failed", this.LIZIZ);
                                    InterfaceC1875500yuC interfaceC1875500yuC = this.LIZJ;
                                    c1875470yu9.LIZJ = str;
                                    interfaceC1875500yuC.LIZ(c1875470yu9.LIZ());
                                    C1700080uLG c1700080uLG = this.LIZLLL;
                                    String str2 = this.LIZ;
                                    String str3 = this.LIZIZ;
                                    c1700080uLG.getClass();
                                    C1700080uLG.LIZIZ(str2, str3);
                                }

                                @Override // X.InterfaceC1875630yuP
                                public final void onMessage(byte[] bArr) {
                                    C1875470yu9 c1875470yu9 = new C1875470yu9("onMessaged", this.LIZIZ);
                                    String strEncodeToString = Base64.encodeToString(bArr, 0);
                                    InterfaceC1875500yuC interfaceC1875500yuC = this.LIZJ;
                                    c1875470yu9.LIZLLL = strEncodeToString;
                                    c1875470yu9.LJ = "base64";
                                    interfaceC1875500yuC.LIZ(c1875470yu9.LIZ());
                                }

                                {
                                    this.LIZ = containerID;
                                    this.LIZIZ = string;
                                    this.LIZJ = r9;
                                }
                            };
                            HashMap<String, HashMap<String, ? super InterfaceC1700110uLJ>> map = C1700080uLG.LIZ;
                            synchronized (map) {
                                try {
                                    if (map.containsKey(containerID)) {
                                        HashMap<String, ? super InterfaceC1700110uLJ> map2 = map.get(containerID);
                                        if (map2 != null) {
                                            map2.put(string, c1875610yuN);
                                        }
                                    } else {
                                        HashMap<String, ? super InterfaceC1700110uLJ> map3 = new HashMap<>();
                                        map3.put(string, c1875610yuN);
                                        map.put(containerID, map3);
                                    }
                                } catch (Throwable th) {
                                    TryCatchGuardChecker.doCheck(th);
                                    throw th;
                                }
                            }
                            c1875610yuN.LJ();
                            if (string != null) {
                                XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1873440yqs.class, null);
                                ((InterfaceC1873440yqs) xBaseModelLIZJ).setSocketTaskID(string);
                                completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                    }
                    C2382909Vj.LIZ(completionBlock, 0, "can not get the socketTaskID", null, 4);
                    return;
                }
                C2382909Vj.LIZ(completionBlock, 0, "JsEventDelegate not provided in host", null, 4);
                return;
            }
            C2382909Vj.LIZ(completionBlock, 0, "ContainerID not provided in host", null, 4);
            return;
        }
        C2382909Vj.LIZ(completionBlock, 0, "Context not provided in host", null, 4);
    }
}
