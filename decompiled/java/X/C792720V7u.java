package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V7u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C792720V7u extends AbstractC792220V5w<C790240UzG> {
    public static long LLJJJJLIIL = 30000;
    public static boolean LLJJL;
    public int LLJ;
    public volatile int LLJIJIL;
    public volatile List<String> LLJILJIL;
    public List<Pattern> LLJILJILJ;
    public List<String> LLJILLL;
    public List<Pattern> LLJJ;
    public boolean LLJJI;
    public List<String> LLJJIII;
    public List<String> LLJJIJI;
    public List<String> LLJJIJIIJIL;
    public List<String> LLJJIJIL;
    public boolean LLJJJIL;
    public double LLJJJJ;
    public boolean LLJI = true;
    public final boolean LLJJJ = true;
    public final List<InterfaceC792740V7w> LLJJJJJIL = new LinkedList();

    public final boolean LJIILJJIL() {
        return this.LLJJJ && this.LLJJJJ != 0.0d;
    }

    @Override // X.AbstractC792220V5w
    public final boolean LIZIZ(InterfaceC792320V6g interfaceC792320V6g) {
        C790240UzG c790240UzG = (C790240UzG) interfaceC792320V6g;
        if (c790240UzG != null && !TextUtils.isEmpty(c790240UzG.LIZLLL)) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC792220V5w
    public final void LIZLLL(InterfaceC792320V6g interfaceC792320V6g) {
        boolean z;
        C790240UzG c790240UzG = (C790240UzG) interfaceC792320V6g;
        String str = c790240UzG.LIZLLL;
        String str2 = c790240UzG.LIZ;
        boolean z2 = !c790240UzG.LJII.isNull("hit_rules");
        if (!z2 && !LJIIJ(str, c790240UzG.LJII)) {
            return;
        }
        JSONObject jSONObjectLIZ = c790240UzG.LIZ();
        JSONObject jSONObject = c790240UzG.LJII;
        if (jSONObjectLIZ == null) {
            return;
        }
        if (jSONObject != null && jSONObject.length() > 0) {
            try {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectLIZ.put(next, jSONObject.get(next));
                }
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (!z2 && !LJIIJJI(str2, str, jSONObjectLIZ)) {
            z = false;
        } else {
            z = true;
        }
        if (this.LLJJJ) {
            String str3 = c790240UzG.LIZ;
            try {
                if (TextUtils.equals(str3, "api_all")) {
                    jSONObjectLIZ.put("net_log_type", "api_all_v2");
                } else if (TextUtils.equals(str3, "api_error")) {
                    jSONObjectLIZ.put("net_log_type", "api_error_v2");
                }
                if (LJIILJJIL() && this.LLJI) {
                    jSONObjectLIZ.put("inject_tracelog", "01");
                } else if (this.LLJ == 1 && this.LLJI) {
                    jSONObjectLIZ.put("inject_tracelog", "02");
                }
                double d = this.LLJJJJ;
                if (d != 0.0d) {
                    jSONObjectLIZ.put("enable_base_api_all", d);
                }
            } catch (Exception e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        LJIIL("requestHeader", this.LLJJIJIIJIL, jSONObjectLIZ);
        LJIIL("responseHeader", this.LLJJIJIL, jSONObjectLIZ);
        if (((LinkedList) this.LLJJJJJIL).size() > 0 && "api_all".equals(str2) && !c790240UzG.LJII.optBoolean("download", false)) {
            for (InterfaceC792740V7w interfaceC792740V7w : this.LLJJJJJIL) {
                if (interfaceC792740V7w != null) {
                    interfaceC792740V7w.LIZ(str, c790240UzG.LJII);
                }
            }
        }
        if (z && this.LLJJI && C792730V7v.LIZIZ(str, this.LLJJIII, null)) {
            LJIIIIZZ(str2, str2, jSONObjectLIZ, true, false, true);
        }
        LJII(str2, str2, jSONObjectLIZ, z, true);
    }

    @Override // X.AbstractC792220V5w
    public final void LJI(InterfaceC792320V6g interfaceC792320V6g) {
        int i;
        C790240UzG c790240UzG = (C790240UzG) interfaceC792320V6g;
        try {
            if (ActivityLifeObserver.getInstance() != null && !(!ActivityLifeObserver.getInstance().isForeground())) {
                i = 1;
            } else {
                i = 0;
            }
            if (c790240UzG.LJII.isNull("front")) {
                c790240UzG.LJII.put("front", i);
            }
            if (LLJJL && C792400V6o.LJIILIIL != 0 && System.currentTimeMillis() - C792400V6o.LJIILIIL <= LLJJJJLIIL) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("trace_base", C792400V6o.LJIILIIL);
                    c790240UzG.LJII.put("relate_start_trace", jSONObject);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (c790240UzG.LJII.isNull("net_consume_type")) {
                c790240UzG.LJII.put("net_consume_type", "ttnet");
            }
        } catch (JSONException e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public final void LJIIIZ(InterfaceC792740V7w interfaceC792740V7w) {
        if (!((LinkedList) this.LLJJJJJIL).contains(interfaceC792740V7w) && interfaceC792740V7w != null) {
            ((LinkedList) this.LLJJJJJIL).add(interfaceC792740V7w);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0123 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012d A[Catch: Exception -> 0x0150, TryCatch #0 {Exception -> 0x0150, blocks: (B:75:0x0123, B:77:0x012d, B:78:0x0136, B:80:0x013c, B:82:0x0148), top: B:112:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0177  */
    @Override // X.AbstractC792220V5w, X.InterfaceC792030V5d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJFF(org.json.JSONObject r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C792720V7u.LJFF(org.json.JSONObject, boolean):void");
    }

    public final boolean LJIIJ(String str, JSONObject jSONObject) {
        List<String> list = this.LLJJIJI;
        if (!C08GN.LIZIZ(list) && !TextUtils.isEmpty(str)) {
            try {
                String host = UriProtector.parse(str).getHost();
                Iterator<String> it2 = list.iterator();
                while (it2.hasNext()) {
                    if (host.equalsIgnoreCase(it2.next())) {
                        return false;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Context context = C792400V6o.LIZ;
        if (C302820Btw.LIZ() ? C0O0L.NOT_AVAILABLE == C036E.LIZ.LIZJ : !C786970Utz.LIZ(context)) {
            return false;
        }
        if (jSONObject != null) {
            try {
                String strOptString = jSONObject.optString("cronet_internal_error_code");
                if ("11".equals(jSONObject.optString("cronet_error_code"))) {
                    if ("-999".equals(strOptString) && !this.LLJJJIL) {
                        return false;
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0052 A[PHI: r3
      0x0052: PHI (r3v5 int) = (r3v1 int), (r3v2 int), (r3v1 int), (r3v1 int) binds: [B:13:0x002d, B:26:0x004f, B:18:0x003b, B:20:0x0041] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIILIIL(java.lang.String r8, org.json.JSONObject r9) {
        /*
            r7 = this;
            boolean r0 = r7.LJIILJJIL()
            r6 = 0
            if (r0 != 0) goto L32
            int r0 = r7.LLJ
            if (r0 != 0) goto L32
            java.util.List<java.lang.String> r1 = r7.LLJILLL
            java.util.List<java.util.regex.Pattern> r0 = r7.LLJJ
            boolean r0 = X.C792730V7v.LIZIZ(r8, r1, r0)
            if (r0 != 0) goto L32
            r5 = 0
        L16:
            X.0Uzr r1 = X.C790620Uzs.LIZ
            java.lang.String r0 = "smart_traffic"
            boolean r4 = r1.getServiceSwitch(r0)
            if (r4 == 0) goto L30
            r3 = r5 | 4
        L23:
            java.lang.String r0 = "requestHeader"
            java.lang.String r2 = r9.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L52
            goto L34
        L30:
            r3 = r5
            goto L23
        L32:
            r5 = 1
            goto L16
        L34:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L4e
            r1.<init>(r2)     // Catch: org.json.JSONException -> L4e
            X.0V6i r0 = r7.LLILZIL     // Catch: org.json.JSONException -> L4e
            if (r0 == 0) goto L52
            boolean r0 = X.C792340V6i.LIZ(r1)     // Catch: org.json.JSONException -> L4e
            if (r0 == 0) goto L52
            X.0V6i r0 = r7.LLILZIL     // Catch: org.json.JSONException -> L4e
            if (r0 == 0) goto L4a
            X.C792340V6i.LIZIZ(r9)     // Catch: org.json.JSONException -> L4e
        L4a:
            r1 = 1
            r3 = r3 | 16
            goto L53
        L4e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L52:
            r1 = 0
        L53:
            java.lang.String r0 = "hit_rules"
            r9.put(r0, r3)     // Catch: org.json.JSONException -> L59
            goto L5d
        L59:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5d:
            if (r5 != 0) goto L63
            if (r4 != 0) goto L63
            if (r1 == 0) goto L64
        L63:
            r6 = 1
        L64:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C792720V7u.LJIILIIL(java.lang.String, org.json.JSONObject):boolean");
    }

    public static void LJIIL(String str, List list, JSONObject jSONObject) {
        if (list != null) {
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!TextUtils.isEmpty(str)) {
                try {
                    String strOptString = jSONObject.optString(str);
                    if (!TextUtils.isEmpty(strOptString)) {
                        JSONObject jSONObject2 = new JSONObject(strOptString);
                        JSONObject jSONObject3 = new JSONObject();
                        Iterator<String> itKeys = jSONObject2.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            if (list.contains(next)) {
                                jSONObject3.put(next, jSONObject2.opt(next));
                            }
                        }
                        jSONObject.put(str, C786410Ut5.J3(jSONObject3));
                        return;
                    }
                    return;
                } catch (JSONException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    return;
                }
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final boolean LJIIJJI(String str, String str2, JSONObject jSONObject) {
        if (TextUtils.equals(str, "api_all")) {
            if (LJIILJJIL()) {
                LJIILIIL(str2, jSONObject);
                return true;
            }
            if (!C792730V7v.LIZIZ(str2, this.LLJILJIL, this.LLJILJILJ)) {
                return LJIILIIL(str2, jSONObject);
            }
            return false;
        }
        if (TextUtils.equals(str, "api_error") && this.LLJIJIL == 1) {
            return true;
        }
        return false;
    }

    public final boolean LJIILL(String str, String str2, JSONObject jSONObject) {
        if (!this.LLILLJJLI || ((LinkedList) this.LLJJJJJIL).size() > 0) {
            return true;
        }
        if (LJIIJ(str2, jSONObject)) {
            return LJIIJJI(str, str2, jSONObject);
        }
        return false;
    }
}
