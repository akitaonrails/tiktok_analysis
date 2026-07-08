package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.tts.oecverify.BdTuring;
import com.tts.oecverify.BdTuringCallback;
import com.tts.oecverify.BdTuringConfig;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.148n, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202167148n extends C09VP {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v50, types: [X.09Ri] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        boolean z;
        C202168148o c202168148o;
        String str;
        String str2;
        Number number;
        ReentrantLock reentrantLock;
        String str3;
        int iIntValue;
        Number number2;
        Number number3;
        String str4;
        int iIntValue2;
        int iIntValue3;
        Number number4;
        Number number5;
        String str5;
        String string;
        final String str6;
        Map map;
        Map map2;
        JSONObject jSONObject;
        String string2;
        C09VN c09vn = (C09VN) xBaseParamModel;
        boolean z2 = true;
        int iIntValue4 = 0;
        if (c09vn.getFunc().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C2382909Vj.LIZ(completionBlock, -3, "Func is empty", null, 4);
            return;
        }
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null && (c202168148o = (C202168148o) interfaceC634840OvC.LIZIZ(C202168148o.class)) != 0) {
            final String func = c09vn.getFunc();
            Map<String, Object> params = c09vn.getParams();
            String str7 = "";
            switch (func.hashCode()) {
                case -1759249244:
                    if (!func.equals("bytedcert.verifyResult")) {
                        return;
                    }
                    if (params != null) {
                        Object obj = params.get("result");
                        if ((obj instanceof Number) && (number = (Number) obj) != null) {
                            iIntValue4 = number.intValue();
                        }
                        boolean z3 = params.get("mode") instanceof String;
                        boolean z4 = params.get("type") instanceof String;
                        Object obj2 = params.get("token");
                        if (!(obj2 instanceof String) || (str = (String) obj2) == null) {
                            str = "";
                        }
                        Object obj3 = params.get("mobile");
                        if ((obj3 instanceof String) && (str2 = (String) obj3) != null) {
                            str7 = str2;
                        }
                        c202168148o.LJI(iIntValue4, str, str7);
                    }
                    XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg = (C09VG) xBaseModelLIZJ;
                    c09vg.setFunc(func);
                    c09vg.setData(null);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "success");
                    return;
                case -1628743486:
                    if (!func.equals("bytedcert.h5_state_changed")) {
                        return;
                    }
                    XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg2 = (C09VG) xBaseModelLIZJ2;
                    c09vg2.setFunc(func);
                    c09vg2.setData(null);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "success");
                    return;
                case -1563440329:
                    if (!func.equals("bytedcert.getTouch")) {
                        return;
                    }
                    HashMap map3 = new HashMap();
                    try {
                        map3.put("os_name", "android");
                        reentrantLock = C145Q.LIZ;
                        reentrantLock.lockInterruptibly();
                        List<JSONObject> list = C145Q.LIZIZ;
                        map3.put("touch", list);
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("responseGetTouchToJs motion list size ");
                        sbLIZ.append(((LinkedList) list).size());
                        C2188811AlT.LIZIZ(sbLIZ);
                        ((LinkedList) list).clear();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("responseGetTouchToJs end motion list size ");
                        sbLIZ2.append(((LinkedList) list).size());
                        C2188811AlT.LIZIZ(sbLIZ2);
                        break;
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        reentrantLock = C145Q.LIZ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C145Q.LIZ.unlock();
                        throw th;
                    }
                    reentrantLock.unlock();
                    XBaseModel xBaseModelLIZJ3 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg3 = (C09VG) xBaseModelLIZJ3;
                    c09vg3.setFunc(func);
                    c09vg3.setData(map3);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ3, "success");
                    return;
                case -1534238297:
                    if (!func.equals("bytedcert.verify") || params == null) {
                        return;
                    }
                    Object obj4 = params.get("params");
                    if ((obj4 instanceof String) && (str3 = (String) obj4) != null) {
                        str7 = str3;
                    }
                    c202168148o.LJFF(str7, new BdTuringCallback() { // from class: X.09Ri
                        @Override // com.tts.oecverify.BdTuringCallback
                        public final void onFail(int i, JSONObject jSONObject2) {
                            try {
                                HashMap map4 = new HashMap();
                                map4.put("result", Integer.valueOf(i));
                                CompletionBlock<C09VG> completionBlock2 = completionBlock;
                                XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(C09VG.class);
                                C09VG c09vg4 = (C09VG) xBaseModelLIZ;
                                c09vg4.setFunc(func);
                                c09vg4.setData(map4);
                                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZ, "success");
                            } catch (JSONException e2) {
                                TryCatchGuardChecker.doCheck(e2);
                            }
                        }

                        @Override // com.tts.oecverify.BdTuringCallback
                        public final void onSuccess(int i, JSONObject jSONObject2) {
                            onFail(i, jSONObject2);
                        }
                    });
                    return;
                case -1471628194:
                    if (!func.equals("bytedcert.pageEnd")) {
                        return;
                    }
                    c202168148o.LIZ();
                    XBaseModel xBaseModelLIZJ4 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg4 = (C09VG) xBaseModelLIZJ4;
                    c09vg4.setFunc(func);
                    c09vg4.setData(null);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ4, "success");
                    return;
                case -1366167938:
                    if (!func.equals("bytedcert.refreshVerifyViewFinish")) {
                        return;
                    }
                    C202191149l.LJIIJJI(System.currentTimeMillis() - 0);
                    XBaseModel xBaseModelLIZJ5 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg5 = (C09VG) xBaseModelLIZJ5;
                    c09vg5.setFunc(func);
                    c09vg5.setData(null);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ5, "success");
                    return;
                case -1028963129:
                    if (!func.equals("bytedcert.preLoadVerifyFinish")) {
                        return;
                    }
                    C202191149l.LJIIL(System.currentTimeMillis() - C202170148q.LIZ.LIZ);
                    XBaseModel xBaseModelLIZJ6 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg6 = (C09VG) xBaseModelLIZJ6;
                    c09vg6.setFunc(func);
                    c09vg6.setData(null);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ6, "success");
                    return;
                case -740751416:
                    if (!func.equals("bytedcert.getOrientation")) {
                        return;
                    }
                    Map<String, ? extends Object> mapLIZJ = c202168148o.LIZJ();
                    XBaseModel xBaseModelLIZJ7 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg7 = (C09VG) xBaseModelLIZJ7;
                    c09vg7.setFunc(func);
                    c09vg7.setData(mapLIZJ);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ7, "success");
                    return;
                case -514719849:
                    if (!func.equals("bytedcert.dialogSize")) {
                        return;
                    }
                    if (params != null) {
                        Object obj5 = params.get("w");
                        if ((obj5 instanceof Number) && (number3 = (Number) obj5) != null) {
                            iIntValue = number3.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        Object obj6 = params.get("h");
                        if ((obj6 instanceof Number) && (number2 = (Number) obj6) != null) {
                            iIntValue4 = number2.intValue();
                        }
                        c202168148o.LIZLLL(iIntValue, iIntValue4);
                    }
                    XBaseModel xBaseModelLIZJ8 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg8 = (C09VG) xBaseModelLIZJ8;
                    c09vg8.setFunc(func);
                    c09vg8.setData(null);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ8, "success");
                    return;
                case 428780843:
                    if (!func.equals("bytedcert.getSettings")) {
                        return;
                    }
                    Map<String, ? extends Object> mapLIZIZ = c202168148o.LIZIZ();
                    XBaseModel xBaseModelLIZJ9 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg9 = (C09VG) xBaseModelLIZJ9;
                    c09vg9.setFunc(func);
                    c09vg9.setData(mapLIZIZ);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ9, "success");
                    return;
                case 491779646:
                    if (!func.equals("bytedcert.eventToNative")) {
                        return;
                    }
                    if (params != null) {
                        Object obj7 = params.get("event");
                        if ((obj7 instanceof String) && (str4 = (String) obj7) != null) {
                            str7 = str4;
                        }
                        C202191149l.LIZJ(str7, new JSONObject(params));
                    }
                    XBaseModel xBaseModelLIZJ10 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg10 = (C09VG) xBaseModelLIZJ10;
                    c09vg10.setFunc(func);
                    c09vg10.setData(null);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ10, "success");
                    return;
                case 733318851:
                    if (!func.equals("bytedcert.notifyLifeCircle")) {
                        return;
                    }
                    if (params != null) {
                        Object obj8 = params.get("state");
                        if ((obj8 instanceof String) && (str5 = (String) obj8) != null) {
                            str7 = str5;
                        }
                        Object obj9 = params.get("result");
                        if ((obj9 instanceof Number) && (number5 = (Number) obj9) != null) {
                            iIntValue2 = number5.intValue();
                        } else {
                            iIntValue2 = 0;
                        }
                        Object obj10 = params.get("err_code");
                        if ((obj10 instanceof Number) && (number4 = (Number) obj10) != null) {
                            iIntValue3 = number4.intValue();
                        } else {
                            iIntValue3 = 0;
                        }
                        if (str7.length() > 0) {
                            c202168148o.LJ(iIntValue2, iIntValue3, str7);
                        }
                    }
                    XBaseModel xBaseModelLIZJ11 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg11 = (C09VG) xBaseModelLIZJ11;
                    c09vg11.setFunc(func);
                    c09vg11.setData(null);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ11, "success");
                    return;
                case 1154510586:
                    if (!func.equals("bytedcert.readyView")) {
                        return;
                    }
                    XBaseModel xBaseModelLIZJ12 = C1909107dp.LIZJ(C09VG.class, null);
                    C09VG c09vg12 = (C09VG) xBaseModelLIZJ12;
                    c09vg12.setFunc(func);
                    c09vg12.setData(null);
                    completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ12, "success");
                    return;
                case 1176627553:
                    if (!func.equals("bytedcert.network.request")) {
                        return;
                    }
                    if (params != null && !params.isEmpty()) {
                        z2 = false;
                    }
                    if (z2) {
                        C2382909Vj.LIZ(completionBlock, -3, "Params invalid", null, 4);
                        return;
                    }
                    final HashMap map4 = new HashMap();
                    try {
                        Object obj11 = params.get("url");
                        if (!(obj11 instanceof String) || (string = (String) obj11) == null) {
                            string = "";
                        }
                        Object obj12 = params.get("method");
                        if (!(obj12 instanceof String) || (str6 = (String) obj12) == null) {
                            str6 = "";
                        }
                        Object obj13 = params.get("query");
                        if (obj13 instanceof Map) {
                            map = (Map) obj13;
                        } else {
                            map = null;
                        }
                        Object obj14 = params.get("data");
                        if (obj14 instanceof Map) {
                            map2 = (Map) obj14;
                        } else {
                            map2 = null;
                        }
                        if (map != null) {
                            StringBuilder sb = new StringBuilder(string);
                            sb.append("?");
                            for (Map.Entry entry : map.entrySet()) {
                                Object key = entry.getKey();
                                Object value = entry.getValue();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append('&');
                                sbLIZ3.append(key);
                                sbLIZ3.append('=');
                                sb.append(C2188811AlT.LIZIZ(sbLIZ3));
                                if (value == null || (string2 = value.toString()) == null) {
                                    string2 = "";
                                }
                                sb.append(string2);
                            }
                            string = sb.toString();
                        }
                        if (map2 != null) {
                            jSONObject = new JSONObject(map2);
                        } else {
                            jSONObject = new JSONObject();
                        }
                        final String strReplace = new Regex("\\\\/").replace(C786410Ut5.J3(jSONObject), "/");
                        final HashMap map5 = new HashMap();
                        map5.put("Content-Type", "application/json; charset=utf-8");
                        final C259800zU c259800zU = new C259800zU();
                        c259800zU.element = "";
                        final BdTuringConfig config = BdTuring.getInstance().getConfig();
                        if (config == null) {
                            C2382909Vj.LIZ(completionBlock, -3, "Params invalid", null, 4);
                            return;
                        } else {
                            final String str8 = string;
                            C145R.LIZ.LIZ(new Runnable() { // from class: X.09Rh
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r0v19, types: [T, java.lang.String] */
                                /* JADX WARN: Type inference failed for: r0v3, types: [T, java.lang.String] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    String str9 = str6;
                                    String str10 = strReplace;
                                    BdTuringConfig bdTuringConfig = config;
                                    String str11 = str8;
                                    Map<String, String> map6 = map5;
                                    C259800zU c259800zU2 = c259800zU;
                                    Map<String, ? extends Object> map7 = map4;
                                    CompletionBlock completionBlock2 = completionBlock;
                                    String str12 = func;
                                    C1C7U.LIZ("IDLOECTuringVerifyPiperCallNativeMethod@12be.nativeRequest$1L");
                                    if (Intrinsics.LJFF(str9, "post")) {
                                        Charset charset = Charsets.UTF_8;
                                        byte[] bytes = str10.getBytes(charset);
                                        if (bytes == null) {
                                            bytes = new byte[0];
                                        }
                                        c259800zU2.element = new String(bdTuringConfig.getHttpClient().post(str11, map6, bytes), charset);
                                    } else {
                                        c259800zU2.element = new String(bdTuringConfig.getHttpClient().get(str11, map6), Charsets.UTF_8);
                                    }
                                    try {
                                        if (a0.LJLIIIL((String) c259800zU2.element).toString().length() > 0) {
                                            JSONObject jSONObject2 = new JSONObject((String) c259800zU2.element);
                                            Iterator<String> itKeys = jSONObject2.keys();
                                            while (itKeys.hasNext()) {
                                                String next = itKeys.next();
                                                map7.put(next, jSONObject2.get(next));
                                            }
                                        }
                                    } catch (JSONException e2) {
                                        TryCatchGuardChecker.doCheck(e2);
                                    }
                                    XBaseModel xBaseModelLIZ = C1549500qQO.LIZ(C09VG.class);
                                    C09VG c09vg13 = (C09VG) xBaseModelLIZ;
                                    c09vg13.setFunc(str12);
                                    c09vg13.setData(map7);
                                    completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZ, "success");
                                    C1C7U.LIZIZ("IDLOECTuringVerifyPiperCallNativeMethod@12be.nativeRequest$1L");
                                }
                            });
                            return;
                        }
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        return;
                    }
                default:
                    return;
            }
        }
        C2382909Vj.LIZ(completionBlock, -2, "VerifySparkHandler is not registered", null, 4);
    }
}
