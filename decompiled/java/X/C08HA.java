package X;

import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.mt.protector.impl.JSONArrayProtectorUtils;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.retrofit2.mime.AbsTypedOutput;
import com.bytedance.retrofit2.mime.TypedOutput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08HA, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HA {
    public static volatile C08HA LJFF;
    public volatile String LIZ;
    public volatile boolean LIZIZ;
    public final List<AbstractC2088608Ge> LIZJ = new CopyOnWriteArrayList();
    public final List<String> LIZLLL = new CopyOnWriteArrayList();
    public final boolean LJ = true;

    public static C08HA LIZLLL() {
        if (LJFF == null) {
            synchronized (C08HA.class) {
                try {
                    if (LJFF == null) {
                        LJFF = new C08HA();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJFF;
    }

    public final Request LIZJ(Request request) {
        String str;
        List list;
        List list2;
        if (!this.LIZIZ) {
            Logger.debug();
            return null;
        }
        if (request.isPureRequest()) {
            return null;
        }
        String url = request.getUrl();
        if (TextUtils.isEmpty(url)) {
            return null;
        }
        if (request.getMetrics() != null) {
            request.getMetrics().LJLJI.LIZJ.LIZIZ();
        }
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Pair<String, String> pairLIZLLL = C2088908Gh.LIZLLL(url, linkedHashMap);
            if (!LIZIZ(request, linkedHashMap)) {
                if (request.getMetrics() != null) {
                    request.getMetrics().LJJIIJZLJL();
                }
                return null;
            }
            if (request.isQueryEncryptEnabled() && linkedHashMap.containsKey("x-tt-encrypt-queries") && (list2 = (List) linkedHashMap.get("x-tt-encrypt-queries")) != null && list2.size() > 0) {
                str = (String) list2.get(0);
                linkedHashMap.remove("x-tt-encrypt-queries");
            } else {
                str = null;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) pairLIZLLL.first);
            sbLIZ.append((String) pairLIZLLL.second);
            C2089008Gi c2089008Gi = new C2089008Gi(C2188811AlT.LIZIZ(sbLIZ));
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null && entry.getKey() != null && (list = (List) entry.getValue()) != null && !list.isEmpty()) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            c2089008Gi.LIZLLL((String) entry.getKey(), (String) it2.next());
                        }
                    }
                }
            }
            C0XMB c0xmbNewBuilder = request.newBuilder();
            LJIIIZ(c0xmbNewBuilder, request, str);
            c0xmbNewBuilder.LIZJ(c2089008Gi.LJ());
            Request requestLIZ = c0xmbNewBuilder.LIZ();
            if (request.getMetrics() != null) {
                request.getMetrics().LJJIIJZLJL();
            }
            return requestLIZ;
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                if (request.getMetrics() != null) {
                    request.getMetrics().LJJIIJZLJL();
                }
                return null;
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                if (request.getMetrics() != null) {
                    request.getMetrics().LJJIIJZLJL();
                }
                throw th2;
            }
        }
    }

    public final void LJ(String str) {
        Logger.debug();
        if (this.LIZIZ && !TextUtils.isEmpty(str)) {
            try {
                LJII(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    public final synchronized void LJII(String str) {
        if (!TextUtils.isEmpty(this.LIZ) && this.LIZ.equals(str)) {
            Logger.debug();
            return;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            LJFF(arrayList, JSONArrayProtectorUtils.getJSONObject(jSONArray, i));
        }
        Collections.sort(arrayList, new Comparator<AbstractC2088608Ge>() { // from class: X.08Gg
            @Override // java.util.Comparator
            public final int compare(AbstractC2088608Ge abstractC2088608Ge, AbstractC2088608Ge abstractC2088608Ge2) {
                return abstractC2088608Ge.LIZ - abstractC2088608Ge2.LIZ;
            }
        });
        ((CopyOnWriteArrayList) this.LIZJ).clear();
        ((CopyOnWriteArrayList) this.LIZJ).addAll(arrayList);
        this.LIZ = str;
    }

    public final void LJIIIIZZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        ((CopyOnWriteArrayList) this.LIZLLL).clear();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                ((CopyOnWriteArrayList) this.LIZLLL).add(JSONArrayProtectorUtils.getString(jSONArray, i));
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZ(List<C080U> list, C08HB c08hb) {
        int i = C08HC.LIZ[c08hb.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ArrayList arrayList = (ArrayList) list;
                    arrayList.add(new C080U("x-tt-cipher-version", BuildConfig.VERSION_NAME));
                    arrayList.add(new C080U("x-tt-encrypt-info", CardStruct.IStatusCode.DEFAULT));
                    return;
                }
                return;
            }
            ArrayList arrayList2 = (ArrayList) list;
            arrayList2.add(new C080U("x-tt-cipher-version", BuildConfig.VERSION_NAME));
            arrayList2.add(new C080U("x-tt-encrypt-info", "1"));
            return;
        }
        ArrayList arrayList3 = (ArrayList) list;
        arrayList3.add(new C080U("x-tt-cipher-version", BuildConfig.VERSION_NAME));
        arrayList3.add(new C080U("x-tt-encrypt-info", "2"));
    }

    public static void LJFF(ArrayList arrayList, JSONObject jSONObject) {
        AbstractC2088608Ge abstractC2088608Ge;
        String string = JSONObjectProtectorUtils.getString(jSONObject, "action");
        final int i = JSONObjectProtectorUtils.getInt(jSONObject, "act_priority");
        if (i < 0) {
            return;
        }
        JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObject, "param");
        int iOptInt = jSONObject.optInt("set_req_priority", i);
        if (iOptInt == -1) {
            iOptInt = Integer.MAX_VALUE;
        }
        if (string.equals("rm")) {
            abstractC2088608Ge = new AbstractC2088608Ge(i) { // from class: X.08Gd
                public final List<String> LJIIIIZZ = new ArrayList();
                public final List<String> LJIIIZ = new ArrayList();
                public boolean LJIIJ = false;
                public boolean LJIIJJI = false;

                @Override // X.AbstractC2088608Ge
                public final void LIZLLL(JSONObject jSONObject3) {
                    boolean z;
                    LJ(jSONObject3);
                    C08HA.LJI(this.LJIIIIZZ, jSONObject3.optJSONArray("keep_list"));
                    C08HA.LJI(this.LJIIIZ, jSONObject3.optJSONArray("remove_list"));
                    boolean z2 = false;
                    if (jSONObject3.optInt("protect_background_request", 0) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    this.LIZJ = z;
                    if (jSONObject3.optInt("add_background_rm_mark", 0) > 0) {
                        z2 = true;
                    }
                    this.LJIIJJI = z2;
                    if (!((ArrayList) this.LJIIIIZZ).isEmpty() && !((ArrayList) this.LJIIIZ).isEmpty()) {
                        this.LJIIJ = true;
                    }
                }

                @Override // X.AbstractC2088608Ge
                public final boolean LIZ(Request request, Map<String, List<String>> map) {
                    String url;
                    if (this.LJIIJ || !LIZJ(request) || map.isEmpty()) {
                        return false;
                    }
                    if (!((ArrayList) this.LJIIIIZZ).isEmpty()) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        if (map.containsKey("x-tt-encrypt-queries")) {
                            linkedHashMap.put("x-tt-encrypt-queries", ((LinkedHashMap) map).get("x-tt-encrypt-queries"));
                        }
                        for (Object obj : (ArrayList) this.LJIIIIZZ) {
                            if (map.containsKey(obj)) {
                                linkedHashMap.put(obj, ((LinkedHashMap) map).get(obj));
                            }
                        }
                        ((LinkedHashMap) map).clear();
                        map.putAll(linkedHashMap);
                        return true;
                    }
                    if (!((ArrayList) this.LJIIIZ).isEmpty()) {
                        Iterator it2 = ((ArrayList) this.LJIIIZ).iterator();
                        while (it2.hasNext()) {
                            map.remove(it2.next());
                        }
                        if (request.getUrl() != null) {
                            url = request.getUrl();
                        } else {
                            url = "";
                        }
                        if (this.LJIIJJI && !url.contains("bgrm")) {
                            Iterator it3 = ((ArrayList) this.LJIIIZ).iterator();
                            while (it3.hasNext()) {
                                if (url.contains((String) it3.next())) {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add("1");
                                    map.put("bgrm", arrayList2);
                                    return true;
                                }
                            }
                            return true;
                        }
                        return true;
                    }
                    return true;
                }
            };
        } else if (!string.equals("encrypt")) {
            return;
        } else {
            abstractC2088608Ge = new AbstractC2088608Ge(i) { // from class: X.08Gc
                public final List<String> LJIIIIZZ = new ArrayList();
                public boolean LJIIIZ = false;
                public boolean LJIIJ = false;

                @Override // X.AbstractC2088608Ge
                public final void LIZLLL(JSONObject jSONObject3) {
                    LJ(jSONObject3);
                    C08HA.LJI(this.LJIIIIZZ, jSONObject3.optJSONArray("encrypt_query_list"));
                    boolean z = false;
                    if (jSONObject3.optInt("encrypt_body_enabled", 0) > 0) {
                        z = true;
                    }
                    this.LJIIJ = z;
                    if (((ArrayList) this.LJIIIIZZ).isEmpty() && !this.LJIIJ) {
                        this.LJIIIZ = true;
                    }
                }

                @Override // X.AbstractC2088608Ge
                public final boolean LIZ(Request request, Map<String, List<String>> map) {
                    byte[] bArrLIZ;
                    boolean z = false;
                    if (!this.LJIIIZ && LIZJ(request)) {
                        if (this.LJIIJ) {
                            request.setBodyEncryptEnabled(true);
                            z = true;
                        }
                        if (map.isEmpty()) {
                            return z;
                        }
                        if (!((ArrayList) this.LJIIIIZZ).isEmpty() && !map.containsKey("x-tt-encrypt-queries")) {
                            LinkedList<Pair> linkedList = new LinkedList();
                            for (Object obj : (ArrayList) this.LJIIIIZZ) {
                                if (map.containsKey(obj)) {
                                    linkedList.add(new Pair(obj, ((LinkedHashMap) map).get(obj)));
                                }
                            }
                            if (linkedList.isEmpty()) {
                                return z;
                            }
                            StringBuilder sb = new StringBuilder();
                            for (Pair pair : linkedList) {
                                String str = (String) pair.first;
                                List<String> list = (List) pair.second;
                                if (list != null && list.size() > 0) {
                                    for (String str2 : list) {
                                        if (sb.length() > 0) {
                                            sb.append("&");
                                        }
                                        sb.append(str);
                                        sb.append("=");
                                        sb.append(str2);
                                    }
                                }
                            }
                            String string2 = sb.toString();
                            if (TextUtils.isEmpty(string2)) {
                                return z;
                            }
                            try {
                                byte[] bytes = string2.getBytes("UTF-8");
                                if (bytes == null || (bArrLIZ = EncryptorUtil.LIZ(bytes.length, bytes)) == null) {
                                    return z;
                                }
                                String strEncodeToString = Base64.encodeToString(bArrLIZ, 2);
                                Logger.debug();
                                LinkedList linkedList2 = new LinkedList();
                                linkedList2.add(strEncodeToString);
                                request.setQueryEncryptEnabled(true);
                                map.put("x-tt-encrypt-queries", linkedList2);
                                Iterator it2 = ((ArrayList) this.LJIIIIZZ).iterator();
                                while (it2.hasNext()) {
                                    map.remove(it2.next());
                                }
                                return true;
                            } catch (UnsupportedEncodingException e) {
                                TryCatchGuardChecker.doCheck(e);
                            }
                        }
                    }
                    return z;
                    return z;
                }
            };
        }
        abstractC2088608Ge.LIZLLL(jSONObject2);
        abstractC2088608Ge.LIZIZ = iOptInt;
        arrayList.add(abstractC2088608Ge);
    }

    public static void LJI(List list, JSONArray jSONArray) {
        if (jSONArray != null && list != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                try {
                    String string = JSONArrayProtectorUtils.getString(jSONArray, i);
                    if (!TextUtils.isEmpty(string)) {
                        list.add(string);
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZIZ(com.bytedance.retrofit2.client.Request r13, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r14) {
        /*
            r12 = this;
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0 = 0
            r13.setQueryFilterPriority(r0)
            java.util.List<X.08Ge> r0 = r12.LIZJ
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0
            java.util.Iterator r6 = r0.iterator()
            r11 = 0
        L12:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r5 = r6.next()
            X.08Ge r5 = (X.AbstractC2088608Ge) r5
            r5.getClass()
            X.08HD r4 = new X.08HD
            r4.<init>()
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.LIZJ = r0
            int r1 = r13.getQueryFilterPriority()
            int r0 = r5.LIZ
            if (r1 <= r0) goto L48
            r2 = 0
        L35:
            r4.LIZ = r2
            int r0 = r5.LIZ
            r4.LIZIZ = r0
            long r0 = android.os.SystemClock.uptimeMillis()
            r4.LIZLLL = r0
            r3.add(r4)
            if (r2 == 0) goto L12
            r11 = 1
            goto L12
        L48:
            boolean r2 = r5.LIZ(r13, r14)
            if (r2 == 0) goto L35
            int r0 = r5.LIZIZ
            r13.setQueryFilterPriority(r0)
            goto L35
        L54:
            com.bytedance.common.utility.Logger.debug()
            X.0ozn r0 = r13.getMetrics()
            if (r0 == 0) goto Lc3
            X.0ozn r6 = r13.getMetrics()
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            java.util.Iterator r10 = r3.iterator()
        L6a:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto Lbe
            java.lang.Object r7 = r10.next()
            X.08HD r7 = (X.C08HD) r7
            long r3 = r7.LIZJ     // Catch: org.json.JSONException -> Lb9
            r8 = 0
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 < 0) goto L8a
            long r1 = r7.LIZLLL     // Catch: org.json.JSONException -> Lb9
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 < 0) goto L8a
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 > 0) goto L8a
            long r1 = r1 - r3
            goto L8c
        L8a:
            r1 = -1
        L8c:
            boolean r0 = r12.LJ     // Catch: org.json.JSONException -> Lb9
            if (r0 == 0) goto L99
            boolean r0 = r7.LIZ     // Catch: org.json.JSONException -> Lb9
            if (r0 != 0) goto L99
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 > 0) goto L99
            goto L6a
        L99:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> Lb9
            r4.<init>()     // Catch: org.json.JSONException -> Lb9
            java.lang.String r3 = "hit"
            boolean r0 = r7.LIZ     // Catch: org.json.JSONException -> Lb9
            r4.put(r3, r0)     // Catch: org.json.JSONException -> Lb9
            java.lang.String r3 = "priority"
            int r0 = r7.LIZIZ     // Catch: org.json.JSONException -> Lb9
            r4.put(r3, r0)     // Catch: org.json.JSONException -> Lb9
            int r0 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lb5
            java.lang.String r0 = "consume"
            r4.put(r0, r1)     // Catch: org.json.JSONException -> Lb9
        Lb5:
            r5.put(r4)     // Catch: org.json.JSONException -> Lb9
            goto L6a
        Lb9:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L6a
        Lbe:
            com.bytedance.common.utility.Logger.debug()
            r6.LJJL = r5
        Lc3:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08HA.LIZIZ(com.bytedance.retrofit2.client.Request, java.util.Map):boolean");
    }

    public static void LJIIIZ(C0XMB c0xmb, Request request, String str) {
        boolean zInterceptRequestBody;
        if (request.getBody() instanceof AbsTypedOutput) {
            zInterceptRequestBody = ((AbsTypedOutput) request.getBody()).isBodyEncrypted();
        } else {
            zInterceptRequestBody = false;
        }
        if (!request.isQueryEncryptEnabled() && !request.isBodyEncryptEnabled() && !zInterceptRequestBody) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(new C080U("x-tt-encrypt-queries", str));
        }
        if (request.getHeaders() != null) {
            arrayList.addAll(request.getHeaders());
        }
        C1494570ozn metrics = request.getMetrics();
        if (!zInterceptRequestBody && request.isBodyEncryptEnabled()) {
            TypedOutput body = request.getBody();
            if (body instanceof AbsTypedOutput) {
                AbsTypedOutput absTypedOutput = (AbsTypedOutput) body;
                if (metrics != null) {
                    metrics.LJLJI.LIZIZ.LIZIZ();
                }
                try {
                    zInterceptRequestBody = absTypedOutput.interceptRequestBody();
                    if (metrics != null) {
                        C1494720p02 c1494720p02 = metrics.LJLJI.LIZIZ;
                        c1494720p02.LIZIZ = c1494720p02.LIZ();
                        metrics.LJJJLL = C1494420ozY.LIZIZ(metrics.LJLJI.LIZIZ.LIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    if (metrics != null) {
                        C1494720p02 c1494720p022 = metrics.LJLJI.LIZIZ;
                        c1494720p022.LIZIZ = c1494720p022.LIZ();
                        metrics.LJJJLL = C1494420ozY.LIZIZ(metrics.LJLJI.LIZIZ.LIZIZ);
                    }
                    throw th;
                }
            }
        }
        C08HB c08hb = C08HB.ENCRYPT_NONE;
        if (zInterceptRequestBody) {
            if (request.isQueryEncryptEnabled()) {
                c08hb = C08HB.ENCRYPT_BOTH_QUERY_AND_BODY;
                LIZ(arrayList, c08hb);
            } else {
                c08hb = C08HB.ENCRYPT_BODY;
                LIZ(arrayList, c08hb);
            }
        } else if (request.isQueryEncryptEnabled()) {
            c08hb = C08HB.ENCRYPT_QUERY;
            LIZ(arrayList, c08hb);
        }
        if (metrics != null) {
            metrics.LJ = c08hb;
        }
        c0xmb.LIZJ = arrayList;
    }
}
