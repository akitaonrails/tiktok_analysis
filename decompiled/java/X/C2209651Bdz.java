package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Bdz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2209651Bdz {
    public static final List<String> LIZLLL = Collections.singletonList("Api");
    public static final String[] LJ = {"GET", "POST"};
    public JSONObject LIZ;
    public final C2209901BeO LIZIZ;
    public final C20223814Bg LIZJ;

    public C2209651Bdz(C2209901BeO c2209901BeO) {
        this.LIZIZ = c2209901BeO;
        this.LIZJ = new C20223814Bg(c2209901BeO);
    }

    public final void LJIIIZ(JSONObject jSONObject) {
        try {
            long jOptLong = jSONObject.optLong("server_time");
            if (jOptLong > 0) {
                final JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("server_time", jOptLong);
                jSONObject2.put("local_time", System.currentTimeMillis() / 1000);
                this.LIZ = jSONObject2;
                if (!C2210111Bej.LIZIZ()) {
                    C2210111Bej.LIZJ("server_time_sync", new InterfaceC800590Var() { // from class: X.1Be1
                        @Override // X.InterfaceC800590Var
                        public final Object LIZ() {
                            JSONObject jSONObject3 = new JSONObject();
                            C0VS7.LIZIZ(jSONObject2, jSONObject3);
                            try {
                                jSONObject3.put("appId", this.LIZIZ.LIZIZ.LJIIIZ);
                                return jSONObject3;
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                return jSONObject3;
                            }
                        }
                    });
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
        }
    }

    public static String LIZJ(String str, String[] strArr) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        Uri uri = UriProtector.parse(str);
        HashMap map = new HashMap(strArr.length);
        for (String str2 : strArr) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str2);
            if (!TextUtils.isEmpty(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                map.put(str2, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
        }
        Uri.Builder builderBuildUpon = uri.buildUpon();
        builderBuildUpon.clearQuery();
        for (String str3 : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str3, (String) map.get(str3));
        }
        return builderBuildUpon.build().toString();
    }

    public final JSONObject LIZ(String str, JSONObject jSONObject) {
        String strPost;
        JSONObject jSONObject2;
        boolean z;
        boolean z2 = false;
        HashMap mapLIZLLL = LIZLLL(-1, null, false);
        String string = UUID.randomUUID().toString();
        LJIIIIZZ(str, string, jSONObject, 1, mapLIZLLL);
        this.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.CONFIG_REQUEST_COUNT, 1);
        try {
            byte[] bArrLJI = this.LIZJ.LJI(C786410Ut5.J3(jSONObject));
            String strOptString = jSONObject.optString("key");
            String strOptString2 = jSONObject.optString("iv");
            if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                byte[] bArrLIZ = this.LIZIZ.getNetClient().LIZ(str, mapLIZLLL, bArrLJI);
                byte[] bArrLIZIZ = C20223814Bg.LIZIZ(strOptString, strOptString2, bArrLIZ);
                if (bArrLIZIZ == null) {
                    strPost = new String(bArrLIZ);
                } else {
                    strPost = new String(C20223814Bg.LJ(bArrLIZIZ));
                }
            } else {
                strPost = this.LIZIZ.getNetClient().post(str, mapLIZLLL, bArrLJI);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.REQUEST_ERROR_COUNT, 1);
            this.LIZIZ.LJJZZI.LJIILLIIL(11, LIZLLL, "config request failed", th, new Object[0]);
            this.LIZIZ.LJJJJLI.LJI("api send config failed", th, true);
            strPost = null;
        }
        if (strPost != null) {
            try {
                jSONObject2 = new JSONObject(strPost);
                try {
                    LJIIIZ(jSONObject2);
                    LJI(200, string, strPost, null);
                } catch (Throwable th2) {
                    th = th2;
                    TryCatchGuardChecker.doCheck(th);
                    this.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
                    this.LIZIZ.LJJZZI.LJIILLIIL(11, LIZLLL, "Parse config response failed", th, new Object[0]);
                    LJI(-1, string, "Parse config response failed", null);
                }
            } catch (Throwable th3) {
                th = th3;
                jSONObject2 = null;
            }
        } else {
            LJI(-1, string, "Config response empty", null);
            jSONObject2 = null;
        }
        if (jSONObject2 != null && "ss_app_log".equals(jSONObject2.optString("magic_tag", ""))) {
            z2 = true;
        }
        if (z2) {
            return jSONObject2.optJSONObject("config");
        }
        this.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.CONFIG_REQUEST_FAILED_COUNT, 1);
        return null;
    }

    public final void LIZIZ(JSONObject jSONObject, boolean z) {
        try {
            if (z) {
                if (this.LIZIZ.LJJI) {
                    jSONObject.put("uid_enable", 1);
                } else {
                    return;
                }
            } else if (this.LIZIZ.LJ() != null && this.LIZIZ.LJ().LJJIFFI) {
                jSONObject.put("event_filter", 1);
            } else {
                return;
            }
            if (this.LIZIZ.LJIL) {
                String[] strArrLIZLLL = C20223814Bg.LIZLLL();
                if (C20223814Bg.LJFF(strArrLIZLLL)) {
                    jSONObject.put("key", strArrLIZLLL[0]);
                    jSONObject.put("iv", strArrLIZLLL[1]);
                }
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
            this.LIZIZ.LJJZZI.LJIILLIIL(11, LIZLLL, "fillKeyIvForEncryptResp error", e, new Object[0]);
        }
    }

    public final HashMap LIZLLL(int i, String str, boolean z) {
        HashMap map = new HashMap(2);
        if (this.LIZIZ.LJIL) {
            map.put("Content-Type", "application/octet-stream;tt-data=a");
        } else {
            map.put("Content-Type", "application/json; charset=utf-8");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.optString(next));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                this.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
                if (i == 0) {
                    map.put("log-encode-type", "gzip");
                } else if (i == 1 || i == 2) {
                    map.put("log-encode-type", "zstd");
                    map.put("log-encode-token", String.valueOf(0));
                }
            }
        }
        if (!z) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("t=0;n=");
            sbLIZ.append(0);
            map.put("x-tt-request-tag", C2188811AlT.LIZIZ(sbLIZ));
        }
        return map;
    }

    public final void LJI(final int i, final String str, final String str2, final byte[] bArr) {
        if (C2210111Bej.LIZIZ()) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C2210111Bej.LIZJ("do_request_end", new InterfaceC800590Var() { // from class: X.14CM
            @Override // X.InterfaceC800590Var
            public final Object LIZ() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("appId", this.LJFF.LIZIZ.LJIIIZ);
                    jSONObject.put("nid", str);
                    jSONObject.put("statusCode", i);
                    jSONObject.put("responseByte", bArr);
                    jSONObject.put("responseString", str2);
                    jSONObject.put("time", jCurrentTimeMillis);
                    return jSONObject;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    this.LJFF.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
                    return jSONObject;
                }
            }
        });
    }

    public final void LJII(final String str, final String str2, final Map map, final byte[] bArr) {
        if (C2210111Bej.LIZIZ()) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C2210111Bej.LIZJ("do_request_begin", new InterfaceC800590Var() { // from class: X.14CK
            public final /* synthetic */ int LJ = 1;

            /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
            @Override // X.InterfaceC800590Var
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object LIZ() {
                /*
                    r7 = this;
                    org.json.JSONObject r4 = new org.json.JSONObject
                    r4.<init>()
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>()
                    java.util.Map r0 = r3
                    if (r0 == 0) goto L34
                    java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L30
                    java.util.Iterator r3 = r0.iterator()     // Catch: java.lang.Throwable -> L30
                L16:
                    boolean r0 = r3.hasNext()     // Catch: java.lang.Throwable -> L30
                    if (r0 == 0) goto L34
                    java.lang.Object r0 = r3.next()     // Catch: java.lang.Throwable -> L30
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L30
                    java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L30
                    java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L30
                    java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L30
                    r2.put(r1, r0)     // Catch: java.lang.Throwable -> L30
                    goto L16
                L30:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                L34:
                    byte[] r1 = r4
                    r3 = 1
                    if (r1 == 0) goto L80
                    int r0 = r1.length
                    if (r0 <= 0) goto L80
                    java.lang.String r6 = new java.lang.String
                    r6.<init>(r1)
                    boolean r0 = X.C2200271B9l.LJI(r6)
                    r1 = 0
                    if (r0 != 0) goto L69
                    java.lang.String r0 = "{"
                    boolean r0 = r6.startsWith(r0)
                    if (r0 == 0) goto L58
                    java.lang.String r0 = "}"
                    boolean r0 = r6.startsWith(r0)
                    if (r0 != 0) goto L68
                L58:
                    java.lang.String r0 = "["
                    boolean r0 = r6.startsWith(r0)
                    if (r0 == 0) goto L69
                    java.lang.String r0 = "]"
                    boolean r0 = r6.endsWith(r0)
                    if (r0 == 0) goto L69
                L68:
                    r1 = 1
                L69:
                    if (r1 == 0) goto L80
                    org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L71
                    r5.<init>(r6)     // Catch: java.lang.Throwable -> L71
                    goto L81
                L71:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.1Bdz r0 = r7.LJI
                    X.1BeO r0 = r0.LIZIZ
                    X.1BeQ r1 = r0.LJJJJLI
                    X.1Bea r0 = X.EnumC2210021Bea.JSON_ERROR_COUNT
                    r1.LIZIZ(r0, r3)
                L80:
                    r5 = 0
                L81:
                    java.lang.String r1 = "appId"
                    X.1Bdz r0 = r7.LJI     // Catch: java.lang.Throwable -> Lb3
                    X.1BeO r0 = r0.LIZIZ     // Catch: java.lang.Throwable -> Lb3
                    java.lang.String r0 = r0.LJIIIZ     // Catch: java.lang.Throwable -> Lb3
                    r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lb3
                    java.lang.String r1 = "nid"
                    java.lang.String r0 = r5     // Catch: java.lang.Throwable -> Lb3
                    r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lb3
                    java.lang.String r1 = "url"
                    java.lang.String r0 = r6     // Catch: java.lang.Throwable -> Lb3
                    r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lb3
                    java.lang.String r0 = "data"
                    r4.put(r0, r5)     // Catch: java.lang.Throwable -> Lb3
                    java.lang.String r0 = "header"
                    r4.put(r0, r2)     // Catch: java.lang.Throwable -> Lb3
                    java.lang.String r1 = "method"
                    int r0 = r7.LJ     // Catch: java.lang.Throwable -> Lb3
                    r4.put(r1, r0)     // Catch: java.lang.Throwable -> Lb3
                    java.lang.String r2 = "time"
                    long r0 = r7     // Catch: java.lang.Throwable -> Lb3
                    r4.put(r2, r0)     // Catch: java.lang.Throwable -> Lb3
                    return r4
                Lb3:
                    r0 = move-exception
                    com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                    X.1Bdz r0 = r7.LJI
                    X.1BeO r0 = r0.LIZIZ
                    X.1BeQ r1 = r0.LJJJJLI
                    X.1Bea r0 = X.EnumC2210021Bea.JSON_ERROR_COUNT
                    r1.LIZIZ(r0, r3)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C14CK.LIZ():java.lang.Object");
            }
        });
    }

    /* JADX WARN: Removed duplicated region for block: B:86:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0229 A[Catch: all -> 0x022c, TRY_ENTER, TryCatch #4 {all -> 0x022c, blocks: (B:84:0x0201, B:88:0x0229, B:89:0x022b), top: B:101:0x0201 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C2209711Be5 LJ(int r14, java.lang.String r15, java.util.HashMap<java.lang.String, java.lang.String> r16, byte[] r17, int r18) {
        /*
            Method dump skipped, instruction units count: 573
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209651Bdz.LJ(int, java.lang.String, java.util.HashMap, byte[], int):X.1Be5");
    }

    public final void LJIIIIZZ(final String str, final String str2, final JSONObject jSONObject, final int i, final Map<String, String> map) {
        if (C2210111Bej.LIZIZ()) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C2210111Bej.LIZJ("do_request_begin", new InterfaceC800590Var() { // from class: X.14CL
            @Override // X.InterfaceC800590Var
            public final Object LIZ() {
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                Map map2 = map;
                if (map2 != null) {
                    try {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject3.put((String) entry.getKey(), entry.getValue());
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        this.LJI.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
                    }
                }
                try {
                    jSONObject2.put("appId", this.LJI.LIZIZ.LJIIIZ);
                    jSONObject2.put("nid", str2);
                    jSONObject2.put("url", str);
                    jSONObject2.put("data", jSONObject);
                    jSONObject2.put("header", jSONObject3);
                    jSONObject2.put("method", i);
                    jSONObject2.put("time", jCurrentTimeMillis);
                    return jSONObject2;
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    this.LJI.LIZIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.JSON_ERROR_COUNT, 1);
                    return jSONObject2;
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(20:5|(1:124)(1:9)|10|(1:12)(1:123)|13|(5:15|(1:17)(1:122)|18|(1:20)(1:121)|21)|22|(4:298|23|(1:25)|26)|(11:28|(4:30|(1:32)|33|315)(2:35|(1:37)(1:39))|104|288|105|(11:107|(1:111)|282|112|276|113|(2:126|(2:319|128))(2:117|(3:318|119|128))|228|(1:230)|(1:232)|233)(1:120)|294|149|150|321|152)(1:34)|38|302|40|(10:286|42|280|43|44|(2:46|(6:306|48|310|49|316|50)(3:296|55|(1:80)(16:61|308|62|304|63|64|(2:66|(1:68)(1:69))|70|(1:72)(1:73)|78|292|79|317|153|(1:155)|156)))(3:83|312|84)|228|(0)|(0)|233)(2:284|94)|95|290|96|151|320|152|3) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:5|(1:124)(1:9)|10|(1:12)(1:123)|13|(5:15|(1:17)(1:122)|18|(1:20)(1:121)|21)|22|298|23|(1:25)|26|(11:28|(4:30|(1:32)|33|315)(2:35|(1:37)(1:39))|104|288|105|(11:107|(1:111)|282|112|276|113|(2:126|(2:319|128))(2:117|(3:318|119|128))|228|(1:230)|(1:232)|233)(1:120)|294|149|150|321|152)(1:34)|38|302|40|(10:286|42|280|43|44|(2:46|(6:306|48|310|49|316|50)(3:296|55|(1:80)(16:61|308|62|304|63|64|(2:66|(1:68)(1:69))|70|(1:72)(1:73)|78|292|79|317|153|(1:155)|156)))(3:83|312|84)|228|(0)|(0)|233)(2:284|94)|95|290|96|151|320|152|3) */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x02ae, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x02a8, code lost:
    
        r7 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02f2 A[Catch: all -> 0x0447, TryCatch #6 {all -> 0x0447, blocks: (B:105:0x02b0, B:107:0x02f2, B:109:0x0303), top: B:288:0x02b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x05b4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x05c0  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x06d9  */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20, types: [int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v2, types: [X.1AmG, X.1Bdx, android.content.SharedPreferences$Editor, java.lang.String, java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r4v54 */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJFF(java.lang.String[] r43, byte[] r44, X.C2209911BeP r45, java.lang.String[] r46, int r47, java.lang.String r48, java.util.Map<java.lang.String, java.lang.String> r49, boolean r50, int r51, X.C2209881BeM r52) {
        /*
            Method dump skipped, instruction units count: 1757
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2209651Bdz.LJFF(java.lang.String[], byte[], X.1BeP, java.lang.String[], int, java.lang.String, java.util.Map, boolean, int, X.1BeM):int");
    }
}
