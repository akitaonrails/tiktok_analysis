package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlRule;
import com.ss.android.ugc.aweme.compliance.api.model.InterfaceControlSettings;
import com.ss.android.ugc.aweme.compliance.api.model.RuleConfig;
import com.ss.android.ugc.aweme.compliance.api.services.monitor.IComplianceMonitorService;
import com.ss.android.ugc.aweme.compliance.common.enums.ConfigTypeEnum;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import okhttp3.Request;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0X1C, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X1C implements InterfaceC841900X0y, InterfaceC841910X0z, C0X0V, C0X1H {
    public static final Set<String> LIZIZ = C13LQ.LJLIIL(new String[]{"/tfe/api/request_combine/v1/", "/aweme/v1/compliance/settings/", "/tiktok/v1/kids/settings/"});
    public static final Set<String> LIZJ = C13LQ.LJLIIL(new String[]{"did", "deviceid", "device_id"});
    public static final Set<String> LIZLLL = C13LQ.LJLIIL(new String[]{"iid", "installid", "install_id"});
    public static final TypedByteArray LJ = new TypedByteArray("application/json; charset=utf-8", "{\"status_code\": 1001}".getBytes(Charsets.UTF_8), new String[0]);
    public static final Object LJFF = new Object();
    public static final List<JSONObject> LJI = new ArrayList();
    public final C01GW LIZ = C452501pT.LIZIZ(new C0X1F());

    @Override // X.InterfaceC841910X0z
    public final C841880X0w<Request, C0XLY> LIZ(C841880X0w<Request, C0XLY> c841880X0w) {
        return c841880X0w;
    }

    @Override // X.InterfaceC841900X0y
    public final C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> LJI(C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> c841880X0w) {
        return c841880X0w;
    }

    public final boolean LJIIIZ() {
        List<InterfaceControlRule> list;
        InterfaceControlSettings interfaceControlSettingsLIZIZ = ((IComplianceMonitorService) this.LIZ.getValue()).LIZIZ();
        ArrayList arrayList = null;
        if (interfaceControlSettingsLIZIZ != null && (list = interfaceControlSettingsLIZIZ.rules) != null) {
            arrayList = new ArrayList();
            for (InterfaceControlRule interfaceControlRule : list) {
                List<RuleConfig> list2 = interfaceControlRule.ruleThens;
                if (list2 != null) {
                    Iterator<RuleConfig> it2 = list2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            RuleConfig next = it2.next();
                            ConfigTypeEnum.Companion.getClass();
                            if (C13LP.LJJJJ(next.type, C0X1E.LIZ())) {
                                if (next != null) {
                                    arrayList.add(interfaceControlRule);
                                }
                            }
                        }
                    }
                }
            }
        }
        if (C10EU.LJIIIIZZ()) {
            return true;
        }
        return (arrayList == null || arrayList.isEmpty()) ? false : true;
    }

    /* JADX WARN: Type inference failed for: r0v11, types: [Q, com.bytedance.retrofit2.client.Request] */
    /* JADX WARN: Type inference failed for: r1v6, types: [R, X.0X52] */
    @Override // X.InterfaceC841900X0y
    public final C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> LIZIZ(C841880X0w<com.bytedance.retrofit2.client.Request, C0X52<?>> c841880X0w) throws JSONException {
        String url;
        com.bytedance.retrofit2.client.Request request;
        List<C080U> headers;
        com.bytedance.retrofit2.client.Request request2 = c841880X0w.LIZ;
        if (request2 != null) {
            url = request2.getUrl();
        } else {
            url = null;
        }
        C0X18 c0x18LJIIJJI = LJIIJJI(url);
        if (c0x18LJIIJJI.LIZ) {
            com.bytedance.retrofit2.client.Request request3 = c841880X0w.LIZ;
            if (request3 == null || (headers = request3.getHeaders()) == null) {
                headers = C13BV.INSTANCE;
            }
            C2175508fh c2175508fh = new C2175508fh(url, 1001, "", headers, LJ);
            ?? LIZIZ2 = C0X52.LIZIZ(c2175508fh.LJ, c2175508fh);
            c841880X0w.LIZLLL = EnumC841890X0x.INTERCEPT;
            c841880X0w.LIZIZ = LIZIZ2;
            LJIIJ(url, "2", 0, c0x18LJIIJJI);
        } else if (LJIIIZ() && (request = c841880X0w.LIZ) != null) {
            C0X18 c0x18 = new C0X18(false, url, 502);
            LJIIIIZZ(c0x18);
            HashMap<String, String> map = new HashMap<>();
            List<C080U> headers2 = request.getHeaders();
            if (headers2 != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(headers2, 10));
                for (C080U c080u : headers2) {
                    String string = a0.LJLIIIL(c080u.LIZ).toString();
                    String str = c080u.LIZIZ;
                    if (str == null) {
                        str = "";
                    }
                    map.put(string, str);
                    arrayList.add(Unit.LIZ);
                }
            }
            HashMap<String, String> mapLJII = LJII(c0x18, map, 2);
            if (c0x18.LIZ) {
                ArrayList arrayList2 = new ArrayList(mapLJII.size());
                for (Map.Entry<String, String> entry : mapLJII.entrySet()) {
                    arrayList2.add(new C080U(entry.getKey(), entry.getValue()));
                }
                List<C080U> listLLIIII = C13LP.LLIIII(arrayList2);
                C0XMB c0xmbNewBuilder = request.newBuilder();
                c0xmbNewBuilder.LIZJ(c0x18.LIZIZ);
                c0xmbNewBuilder.LIZJ = listLLIIII;
                c841880X0w.LIZ = c0xmbNewBuilder.LIZ();
                LJIIJ(url, "2", 1, c0x18);
                return c841880X0w;
            }
        }
        return c841880X0w;
    }

    /* JADX WARN: Type inference failed for: r0v12, types: [Q, okhttp3.Request] */
    /* JADX WARN: Type inference failed for: r1v7, types: [R, X.0XLY] */
    @Override // X.InterfaceC841910X0z
    public final C841880X0w<Request, C0XLY> LJFF(C841880X0w<Request, C0XLY> c841880X0w) throws JSONException {
        Request request;
        Set<String> setLJFF;
        C0XLQ c0xlqUrl;
        Request request2 = c841880X0w.LIZ;
        String str = null;
        if (request2 != null && (c0xlqUrl = request2.url()) != null) {
            str = c0xlqUrl.LJIIIIZZ;
        }
        C0X18 c0x18LJIIJJI = LJIIJJI(str);
        if (c0x18LJIIJJI.LIZ) {
            C0XLX c0xlx = new C0XLX();
            c0xlx.LIZJ = 1001;
            c0xlx.LIZIZ = EnumC847200XLi.HTTP_2;
            c0xlx.LIZLLL = "";
            c0xlx.LIZ = c841880X0w.LIZ;
            c0xlx.LJI = AbstractC842510X3h.create(C0X0P.LIZJ("application/json; charset=utf-8"), "{\"status_code\": 1001}");
            ?? LIZ = c0xlx.LIZ();
            c841880X0w.LIZLLL = EnumC841890X0x.INTERCEPT;
            c841880X0w.LIZIZ = LIZ;
            LJIIJ(str, "4", 0, c0x18LJIIJJI);
        } else if (LJIIIZ() && (request = c841880X0w.LIZ) != null) {
            C0X1V c0x1vHeaders = request.headers();
            C0X18 c0x18 = new C0X18(false, str, 502);
            LJIIIIZZ(c0x18);
            HashMap<String, String> map = new HashMap<>();
            if (c0x1vHeaders != null && (setLJFF = c0x1vHeaders.LJFF()) != null) {
                ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(setLJFF, 10));
                for (String str2 : setLJFF) {
                    String string = a0.LJLIIIL(str2).toString();
                    String strLIZLLL = c0x1vHeaders.LIZLLL(str2);
                    if (strLIZLLL == null) {
                        strLIZLLL = "";
                    }
                    map.put(string, strLIZLLL);
                    arrayList.add(Unit.LIZ);
                }
            }
            HashMap<String, String> mapLJII = LJII(c0x18, map, 2);
            if (c0x18.LIZ) {
                C0X1U c0x1u = new C0X1U();
                for (Map.Entry<String, String> entry : mapLJII.entrySet()) {
                    c0x1u.LIZ(entry.getKey(), entry.getValue());
                }
                C0X33 c0x33NewBuilder = request.newBuilder();
                c0x33NewBuilder.LJII(c0x18.LIZIZ);
                c0x33NewBuilder.LIZLLL = new C0X1V(c0x1u).LJI();
                c841880X0w.LIZ = c0x33NewBuilder.LIZIZ();
                LJIIJ(str, "4", 1, c0x18);
                return c841880X0w;
            }
        }
        return c841880X0w;
    }

    public final void LJIIIIZZ(C0X18 c0x18) {
        Uri uri;
        Set<String> queryParameterNames;
        if (!TextUtils.isEmpty(c0x18.LIZIZ) && (queryParameterNames = UriProtector.getQueryParameterNames((uri = UriProtector.parse(c0x18.LIZIZ)))) != null && !queryParameterNames.isEmpty()) {
            HashMap<String, String> map = new HashMap<>();
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(queryParameterNames, 10));
            for (String str : queryParameterNames) {
                String string = a0.LJLIIIL(str).toString();
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
                }
                map.put(string, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                arrayList.add(Unit.LIZ);
            }
            HashMap<String, String> mapLJII = LJII(c0x18, map, 0);
            if (c0x18.LIZ) {
                Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
                for (Map.Entry<String, String> entry : mapLJII.entrySet()) {
                    builderClearQuery.appendQueryParameter(entry.getKey(), entry.getValue());
                }
                c0x18.LIZIZ = builderClearQuery.build().toString();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a0, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00ae, code lost:
    
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C0X18 LJIIJJI(java.lang.String r16) {
        /*
            Method dump skipped, instruction units count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X1C.LJIIJJI(java.lang.String):X.0X18");
    }

    @Override // X.C0X1H
    public final void LJ(String str, InterfaceControlSettings interfaceControlSettings, Exception exc) throws JSONException {
        boolean z;
        boolean zLJFF;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "init_settings");
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 1);
        }
        int i = 2;
        if (exc != null) {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 2);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(exc.getClass().getSimpleName());
            sbLIZ.append(": ");
            sbLIZ.append(exc.getMessage());
            jSONObject.put("reason", C2188811AlT.LIZIZ(sbLIZ));
        }
        if (interfaceControlSettings != null) {
            zLJFF = Intrinsics.LJFF(interfaceControlSettings.useNewControl, Boolean.FALSE);
        } else {
            zLJFF = false;
        }
        jSONObject.put("type", String.valueOf(!zLJFF));
        if (interfaceControlSettings != null) {
            jSONObject.put("version", interfaceControlSettings.version);
            jSONObject.put("user_type", interfaceControlSettings.userType);
            String uid = ((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid();
            if (uid != null && !a0.LJJJIL(uid)) {
                if (C10EU.LJIIIIZZ()) {
                    i = 1;
                } else if (!C10EU.LJIIIZ()) {
                    i = 0;
                }
            } else {
                i = -1;
            }
            jSONObject.put("current", i);
            if (!Intrinsics.LJFF(String.valueOf(i), interfaceControlSettings.userType)) {
                jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 3);
            }
        }
        if (!jSONObject.has(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)) {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, 0);
        } else if (str != null && !a0.LJJJIL(str)) {
            jSONObject.put("content", str);
        }
        ((ArrayList) LJI).add(jSONObject);
        C08JS.LIZLLL(interfaceControlSettings);
        if (exc != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(exc.getClass().getSimpleName());
            sb.append(": ");
            sb.append(exc.getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x038d A[LOOP:14: B:224:0x0387->B:226:0x038d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:230:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x03fa A[LOOP:16: B:246:0x03f4->B:248:0x03fa, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.HashMap<java.lang.String, java.lang.String> LJII(X.C0X18 r14, java.util.HashMap<java.lang.String, java.lang.String> r15, int r16) {
        /*
            Method dump skipped, instruction units count: 1036
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0X1C.LJII(X.0X18, java.util.HashMap, int):java.util.HashMap");
    }

    public final void LJIIJ(String str, String str2, int i, C0X18 c0x18) throws JSONException {
        ArrayList arrayList = (ArrayList) LJI;
        if (!arrayList.isEmpty()) {
            synchronized (LJFF) {
                try {
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            C793770VBv.LJ(EnumC841820X0q.COMPLIANCE_NETWORK_MONITOR_LOG.getLogType(), (JSONObject) it2.next());
                        }
                        ((ArrayList) LJI).clear();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("event", "hit_rule");
        jSONObject.put("flag", c0x18.LIZ);
        String str3 = c0x18.LIZIZ;
        if ((str3 != null && !a0.LJJJIL(str3)) || (str != null && !a0.LJJJIL(str))) {
            String str4 = c0x18.LIZIZ;
            if (str4 != null) {
                str = str4;
            }
            c0x18.LIZIZ = str;
            LJIIIIZZ(c0x18);
            jSONObject.put("url", c0x18.LIZIZ);
        }
        Set<String> set = c0x18.LIZJ;
        if (set != null && !set.isEmpty()) {
            JSONArray jSONArray = new JSONArray();
            Iterator<T> it3 = c0x18.LIZJ.iterator();
            while (it3.hasNext()) {
                jSONArray.put(it3.next());
            }
            jSONObject.put("header_keys", jSONArray);
        }
        Set<String> set2 = c0x18.LIZLLL;
        if (set2 != null && !set2.isEmpty()) {
            JSONArray jSONArray2 = new JSONArray();
            Iterator<T> it4 = c0x18.LIZLLL.iterator();
            while (it4.hasNext()) {
                jSONArray2.put(it4.next());
            }
            jSONObject.put("query_keys", jSONArray2);
        }
        Set<String> set3 = c0x18.LJI;
        if (set3 != null && !set3.isEmpty()) {
            jSONObject.put("config", c0x18.LJI.toString());
        }
        jSONObject.put("action", i);
        jSONObject.put("net_type", str2);
        C793770VBv.LJ(EnumC841820X0q.COMPLIANCE_NETWORK_MONITOR_LOG.getLogType(), jSONObject);
    }
}
