package X;

import android.net.Uri;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsDataCacheAllowPathListSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import defpackage.Config;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import kotlin.text.a0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0euH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1106750euH implements InterfaceC1100640ekQ {
    public static final C1106750euH LIZ = new C1106750euH();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C357901aD());
    public static final C01GW LIZJ = C452501pT.LIZIZ(new C1106850euR());
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new C1106840euQ());
    public static final C01GW LJ = C452501pT.LIZIZ(new C1106830euP());

    static {
        UserService.getInstance().user().LJII().LJIIL(new C09JN() { // from class: X.0ehb
            @Override // X.C09JN
            public final void accept(Object obj) {
                C1C7U.LIZ("DataCenter@f176.<init>$1");
                C784060UpI c784060UpI = (C784060UpI) obj;
                if (c784060UpI != null && c784060UpI.LIZ == EnumC1098720ehK.Logout) {
                    synchronized (C1106750euH.LIZ) {
                        Iterator<T> it2 = C1106750euH.LJIIIZ().values().iterator();
                        while (it2.hasNext()) {
                            C2296808zG.LIZJ(((C1106810euN) it2.next()).LIZ, null);
                        }
                        C1106750euH.LJIIIZ().clear();
                        C1106750euH.LJ().LIZIZ();
                    }
                }
                C1C7U.LIZIZ("DataCenter@f176.<init>$1");
            }
        });
    }

    public static InterfaceC1106780euK LJ() {
        return (InterfaceC1106780euK) LIZJ.getValue();
    }

    public static ConcurrentHashMap LJIIIZ() {
        return (ConcurrentHashMap) LIZLLL.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023 A[PHI: r3
      0x0023: PHI (r3v3 long) = (r3v0 long), (r3v7 long) binds: [B:17:0x003e, B:9:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0041 A[PHI: r3
      0x0041: PHI (r3v1 long) = (r3v0 long), (r3v3 long) binds: [B:17:0x003e, B:11:0x0025] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair LIZJ(X.C1106820euO r6) {
        /*
            if (r6 == 0) goto L3c
            X.0KA2 r5 = r6.LIZIZ
            if (r5 == 0) goto L3c
            boolean r0 = r5 instanceof X.C0KA1
            if (r0 == 0) goto L37
            r0 = r5
            X.0KA1 r0 = (X.C0KA1) r0
            long r3 = r0.LIZ
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L37
            long r3 = r6.LIZLLL
            long r0 = java.lang.System.currentTimeMillis()
            long r3 = r3 - r0
            r0 = 1000(0x3e8, float:1.401E-42)
            long r0 = (long) r0
            long r3 = r3 / r0
        L23:
            X.0KA2 r0 = r6.LIZIZ
            if (r0 == 0) goto L41
            boolean r0 = r0 instanceof X.C0KA3
        L29:
            kotlin.Pair r2 = new kotlin.Pair
            java.lang.Long r1 = java.lang.Long.valueOf(r3)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.<init>(r1, r0)
            return r2
        L37:
            X.0KA3 r0 = X.C0KA3.LIZ
            kotlin.jvm.internal.Intrinsics.LJFF(r5, r0)
        L3c:
            r3 = 0
            if (r6 == 0) goto L41
            goto L23
        L41:
            r0 = 0
            goto L29
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1106750euH.LIZJ(X.0euO):kotlin.Pair");
    }

    public static Map LJIIZILJ(Object obj) {
        try {
            JSONObject jSONObject = new JSONObject(C19748512Ol.LIZIZ.LJIILL(obj));
            Sequence sequenceLIZIZ = C09R4.LIZIZ(jSONObject.keys());
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj2 : sequenceLIZIZ) {
                linkedHashMap.put(obj2, jSONObject.get((String) obj2));
            }
            return linkedHashMap;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("PcsDataCenter: error ");
            sbLIZ.append(e);
            C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), e);
            return null;
        }
    }

    public static void LJIJ(String str) {
        C1106810euN c1106810euN = (C1106810euN) LJIIIZ().get(str);
        if (c1106810euN != null) {
            C2296808zG.LIZJ(c1106810euN.LIZ, null);
            LJ().LIZ(str);
            LJIIIZ().remove(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Object LIZLLL(C1106820euO c1106820euO, Class cls) {
        k kVar;
        if (c1106820euO != null && (kVar = (k) c1106820euO.LIZ) != null) {
            if (cls != null && !Intrinsics.LJFF(cls, n.class)) {
                try {
                    return new Gson().LIZJ(kVar, cls);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            } else {
                return kVar;
            }
        }
        return null;
    }

    public static String LJIIJ(String str, Map map) {
        Set setKeySet;
        List<String> listLJLLJ;
        String json;
        Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
        if (map != null && (setKeySet = map.keySet()) != null && (listLJLLJ = C13LP.LJLLJ(setKeySet)) != null) {
            for (String str2 : listLJLLJ) {
                Object obj = map.get(str2);
                if (obj != null) {
                    if (!(obj instanceof Map) && !(obj instanceof List)) {
                        json = obj.toString();
                    } else {
                        json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, obj);
                    }
                } else {
                    json = null;
                }
                if (str2.length() != 0 && (json == null || json.length() != 0)) {
                    builderBuildUpon.appendQueryParameter(str2, json);
                }
            }
        }
        return builderBuildUpon.build().toString();
    }

    public static Map LJIIJJI(String str, Map map) {
        String secUid;
        InterfaceC2262081DgM currentUser;
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        if (a0.LJJIIZI(str, "webcast/sub/upsell/one_stop_shop_setup/info", false)) {
            InterfaceC500940Jki interfaceC500940JkiUser = UserService.getInstance().user();
            if (interfaceC500940JkiUser == null || (currentUser = interfaceC500940JkiUser.getCurrentUser()) == null || (secUid = currentUser.getSecUid()) == null) {
                secUid = "";
            }
            linkedHashMap.put("sec_anchor_id", secUid);
        }
        return linkedHashMap;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        LJ().LJ(new X.C1877807Xc(r3));
     */
    @Override // X.InterfaceC1100640ekQ
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LIZ(java.lang.String r5, java.util.Map<java.lang.String, ? extends java.lang.Object> r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsDataCacheAllowPathListSetting r0 = com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsDataCacheAllowPathListSetting.INSTANCE     // Catch: java.lang.Throwable -> L48
            java.lang.String[] r0 = r0.getValue()     // Catch: java.lang.Throwable -> L48
            boolean r0 = X.C13LQ.LJIILLIIL(r5, r0)     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto Lf
            monitor-exit(r4)
            return
        Lf:
            java.lang.String r3 = LJIIJ(r5, r6)     // Catch: java.lang.Throwable -> L48
            java.util.concurrent.ConcurrentHashMap r0 = LJIIIZ()     // Catch: java.lang.Throwable -> L48
            java.util.Enumeration r0 = r0.keys()     // Catch: java.lang.Throwable -> L48
            java.util.ArrayList r0 = java.util.Collections.list(r0)     // Catch: java.lang.Throwable -> L48
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L48
        L23:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L3a
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L48
            r0 = 0
            boolean r0 = kotlin.text.a0.LJJIIZI(r1, r3, r0)     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L46
            LJIJ(r1)     // Catch: java.lang.Throwable -> L48
            goto L23
        L3a:
            X.0euK r1 = LJ()     // Catch: java.lang.Throwable -> L48
            X.07Xc r0 = new X.07Xc     // Catch: java.lang.Throwable -> L48
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L48
            r1.LJ(r0)     // Catch: java.lang.Throwable -> L48
        L46:
            monitor-exit(r4)
            return
        L48:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1106750euH.LIZ(java.lang.String, java.util.Map):void");
    }

    public static void LJIILJJIL(C1106810euN c1106810euN, n nVar, Throwable th) {
        List<C1106800euM> listLLIIII = C13LP.LLIIII(c1106810euN.LIZIZ);
        c1106810euN.LIZIZ.clear();
        for (C1106800euM c1106800euM : listLLIIII) {
            if (th != null) {
                try {
                    c1106800euM.LIZIZ.invoke(th);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("PcsDataCenter: callback execution error ");
                    sbLIZ.append(e);
                    C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), e);
                    final String str = "Callback execution failed";
                    c1106800euM.LIZIZ.invoke(new AbstractC1106920euY(str, e) { // from class: X.0euZ
                    });
                }
            } else if (nVar != null) {
                c1106800euM.LIZ.invoke(nVar);
            } else {
                final String str2 = "Response is null and no error provided";
                final Throwable th2 = null;
                c1106800euM.LIZIZ.invoke(new AbstractC1106920euY(str2, th2) { // from class: X.0euZ
                });
            }
        }
    }

    public final synchronized Object LJFF(String str, Class cls, Map map) {
        EnumC992770bwR enumC992770bwR;
        boolean z;
        long jCurrentTimeMillis;
        if (!C13LQ.LJIILLIIL(str, LivePcsDataCacheAllowPathListSetting.INSTANCE.getValue())) {
            return null;
        }
        String strLJIIJ = LJIIJ(str, map);
        C1106820euO c1106820euO = LJ().get(strLJIIJ);
        Object objLIZLLL = LIZLLL(c1106820euO, cls);
        if (objLIZLLL != null) {
            enumC992770bwR = EnumC992770bwR.SUCCESS;
        } else {
            enumC992770bwR = EnumC992770bwR.DATA_NOT_FOUND;
        }
        C1106810euN c1106810euN = (C1106810euN) LJIIIZ().get(strLJIIJ);
        if (c1106810euN != null) {
            C09AE c09ae = (C09AE) c1106810euN.LIZ.getCoroutineContext().get(C09AE.LJJLJ);
            if (c09ae != null) {
                C23118094a.LJFF(c09ae);
            }
            LJIIIZ().remove(strLJIIJ);
            z = true;
        } else {
            z = false;
        }
        if (z) {
            enumC992770bwR = EnumC992770bwR.FETCHING;
        }
        Pair pairLIZJ = LIZJ(c1106820euO);
        long jLongValue = ((Number) pairLIZJ.getFirst()).longValue();
        boolean zBooleanValue = ((Boolean) pairLIZJ.getSecond()).booleanValue();
        Long l = (Long) ((HashMap) LJ.getValue()).get(strLJIIJ);
        if (l != null && enumC992770bwR == EnumC992770bwR.SUCCESS) {
            jCurrentTimeMillis = (System.currentTimeMillis() - l.longValue()) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        } else {
            jCurrentTimeMillis = -1;
        }
        LJIIL(str, enumC992770bwR, jLongValue, zBooleanValue, jCurrentTimeMillis);
        return objLIZLLL;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, java.lang.Object] */
    public final synchronized C470590Icr LJII(Class cls, String str, Object obj) {
        ?? LJIIIIZZ = LJIIIIZZ(cls, str, obj);
        if (LJIIIIZZ == 0) {
            return null;
        }
        C470590Icr c470590Icr = new C470590Icr();
        c470590Icr.data = LJIIIIZZ;
        c470590Icr.statusCode = 0;
        return c470590Icr;
    }

    public final synchronized Object LJIIIIZZ(Class cls, String str, Object obj) {
        Object objLJFF;
        Map mapLJIIZILJ = LJIIZILJ(obj);
        if (mapLJIIZILJ != null) {
            objLJFF = LIZ.LJFF(str, cls, mapLJIIZILJ);
        } else {
            objLJFF = null;
        }
        return objLJFF;
    }

    public final synchronized void LJIILL(C1100630ekP c1100630ekP, Object obj, Object obj2, String str) {
        try {
            k kVarLJIJJLI = C19748512Ol.LIZIZ.LJIJJLI(obj2);
            if (kVarLJIJJLI != null && (kVarLJIJJLI instanceof n)) {
                n nVarLJIILIIL = kVarLJIJJLI.LJIILIIL();
                Map<String, ? extends Object> mapLJIIZILJ = LJIIZILJ(obj);
                if (mapLJIIZILJ != null) {
                    LJIILLIIL(c1100630ekP, nVarLJIILIIL, str, mapLJIIZILJ);
                }
            } else {
                IllegalStateException illegalStateException = new IllegalStateException("Failed to convert responseData to JsonObject");
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("PcsDataCenter: responseData is not a JsonObject for path ");
                sbLIZ.append(str);
                C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ), illegalStateException);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("PcsDataCenter: savePrefetchDataV2 error ");
            sbLIZ2.append(e);
            C1CC2.LIZ(C2188811AlT.LIZIZ(sbLIZ2), e);
        }
    }

    public final synchronized void LJIILLIIL(C1100630ekP c1100630ekP, n nVar, String str, Map<String, ? extends Object> map) {
        if (!C13LQ.LJIILLIIL(str, LivePcsDataCacheAllowPathListSetting.INSTANCE.getValue())) {
            return;
        }
        LJ().LJFF(LJIIJ(str, LJIIJJI(str, map)), nVar, c1100630ekP.LIZIZ);
    }

    public static void LJIIL(String str, EnumC992770bwR enumC992770bwR, long j, boolean z, long j2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_get_cache_result");
        c474500IjALIZ.LJJII(str, "path");
        c474500IjALIZ.LJJII(enumC992770bwR, "result");
        c474500IjALIZ.LJJII(Long.valueOf(j), "expiry_duration");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_one_time");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "duration");
        c474500IjALIZ.LIZ();
    }

    @Override // X.InterfaceC1100640ekQ
    public final synchronized void LIZIZ(C1100630ekP c1100630ekP, String str, Map<String, ? extends Object> map, Function1<Object, Unit> function1, Function1<? super Throwable, Unit> function12) {
        if (!C13LQ.LJIILLIIL(str, LivePcsDataCacheAllowPathListSetting.INSTANCE.getValue())) {
            return;
        }
        String strLJIIJ = LJIIJ(str, LJIIJJI(str, map));
        boolean zContainsKey = LJIIIZ().containsKey(strLJIIJ);
        boolean zLIZLLL = LJ().LIZLLL(strLJIIJ);
        boolean z = c1100630ekP.LIZ;
        if ((zContainsKey || zLIZLLL) && !z) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        ((HashMap) LJ.getValue()).put(strLJIIJ, Long.valueOf(jCurrentTimeMillis));
        LJIJ(strLJIIJ);
        C1106810euN c1106810euN = new C1106810euN(C2296808zG.LIZ(C0PEM.LIZ.plus(C2296908zH.LIZ())));
        LJIIIZ().put(strLJIIJ, c1106810euN);
        ((InterfaceC362001as) LIZIZ.getValue()).LIZ(strLJIIJ);
        C1100620ekO c1100620ekO = new C1100620ekO(jCurrentTimeMillis, strLJIIJ, c1100630ekP, str, function1);
        C23250099c.LIZLLL(c1106810euN.LIZ, null, null, new C497401wi(c1106810euN, strLJIIJ, null, new C1100610ekN(jCurrentTimeMillis, str, c1100630ekP, function12), c1100620ekO), 3);
    }

    public static void LJIILIIL(String str, long j, boolean z, int i, boolean z2, Integer num) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pcs_prefetch_result");
        c474500IjALIZ.LJJII(str, "path");
        c474500IjALIZ.LJJII(Long.valueOf(j), "time_cost");
        c474500IjALIZ.LJJII(Boolean.valueOf(z2), "success");
        c474500IjALIZ.LJJII(num, "error_code");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_from_native");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "cache_size");
        c474500IjALIZ.LIZ();
    }

    public final synchronized <TYPE> void LJI(final String str, Map<String, ? extends Object> map, Class<TYPE> cls, Function1<? super TYPE, Unit> function1, Function1<? super Throwable, Unit> function12, long j) {
        if (!C13LQ.LJIILLIIL(str, LivePcsDataCacheAllowPathListSetting.INSTANCE.getValue())) {
            function12.invoke(new AbstractC1106920euY(str) { // from class: X.0euX
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Path '");
                    sbLIZ.append(str);
                    sbLIZ.append("' is not allowed in PCS data cache");
                    super(C2188811AlT.LIZIZ(sbLIZ), null, null);
                }
            });
            return;
        }
        final String strLJIIJ = LJIIJ(str, map);
        Config config = (Object) LIZLLL(LJ().get(strLJIIJ), cls);
        if (config != null) {
            function1.invoke(config);
            return;
        }
        C1106810euN c1106810euN = (C1106810euN) LJIIIZ().get(strLJIIJ);
        if (c1106810euN != null) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            C1106800euM c1106800euM = new C1106800euM(new C1106770euJ(strLJIIJ, cls, function1, function12), new C1106790euL(function12));
            c1106810euN.LIZIZ.add(c1106800euM);
            C23250099c.LIZLLL(c1106810euN.LIZ, null, null, new C1106760euI(j, jCurrentTimeMillis, c1106810euN, c1106800euM, function12, null), 3);
        } else {
            function12.invoke(new AbstractC1106920euY(strLJIIJ) { // from class: X.0euW
                /* JADX WARN: Illegal instructions before constructor call */
                {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("No data found in cache and no ongoing request for URL: ");
                    sbLIZ.append(strLJIIJ);
                    super(C2188811AlT.LIZIZ(sbLIZ), null, null);
                }
            });
        }
    }
}
