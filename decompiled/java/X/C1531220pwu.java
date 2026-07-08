package X;

import com.bytedance.forest.model.RequestParams;
import com.bytedance.lynx.hybrid.param.HybridSchemaParam;
import com.bytedance.lynx.hybrid.prefetch.worker.Worker;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pwu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1531220pwu implements InterfaceC1531440pxG {
    public final String LIZ;
    public final C1537480q70 LIZIZ;
    public String LIZJ;
    public final AbstractC1538620q8q LIZLLL;
    public final IResourceServiceX LJ;
    public EnumC1531250pwx LJFF;
    public Worker LJI;
    public InterfaceC1531280px0 LJII;
    public volatile boolean LJIIIIZZ;
    public C443120HZe<Integer, String, ? extends Throwable> LJIIIZ;
    public final C01GW LJIIJ;

    public final void LIZ(String str) {
        C1522300piW.LIZIZ("hybrid_prefetch_file_load_state", this.LIZIZ, str, new JSONObject().put("success", 0).put("errorCode", -996).put("errorMsg", "generate prefetch url failed"));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("fail to handle url, url = ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1531440pxG
    public final void LIZIZ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMessage: ");
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized void LJII(Map<String, ?> map) {
        InterfaceC1531300px2 interfaceC1531300px2;
        C1530570pvr.LIZIZ(this.LIZIZ, "spark_lynx_prefetch_page_prefetch_end");
        this.LJIIIIZZ = true;
        this.LJFF = EnumC1531250pwx.Ready;
        C01GW<C1537410q6t> c01gw = C1537410q6t.LJIIIZ;
        if (C1161970gLL.LIZIZ().LIZ && (interfaceC1531300px2 = (InterfaceC1531300px2) this.LIZIZ.LJFF(InterfaceC1531300px2.class)) != null) {
            C1531270pwz.LIZ(interfaceC1531300px2, null, null, null, null, map, 15);
        }
        InterfaceC1531280px0 interfaceC1531280px0 = this.LJII;
        if (interfaceC1531280px0 != null) {
            C1531270pwz.LIZ(interfaceC1531280px0, null, null, null, null, map, 15);
            this.LJII = null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onResult: ");
        sbLIZ.append(map);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final synchronized void LJIIIIZZ(C1531330px5 c1531330px5) {
        Object obj;
        Map<String, Object> mapLJFF;
        Integer first;
        String second;
        Map map = null;
        Throwable third = null;
        if (this.LJFF != EnumC1531250pwx.Ready && !this.LJIIIIZZ) {
            if (this.LJFF == EnumC1531250pwx.Terminate) {
                C443120HZe<Integer, String, ? extends Throwable> c443120HZe = this.LJIIIZ;
                this.LJIIIZ = null;
                if (c443120HZe == null) {
                    first = null;
                    second = null;
                } else {
                    first = c443120HZe.getFirst();
                    second = c443120HZe.getSecond();
                    third = c443120HZe.getThird();
                }
                C1531270pwz.LIZ(c1531330px5, first, second, third, null, null, 24);
                return;
            }
            this.LJII = c1531330px5;
            return;
        }
        InterfaceC1531560pxS interfaceC1531560pxS = this.LIZIZ.hybridParams;
        if (interfaceC1531560pxS != null && (mapLJFF = interfaceC1531560pxS.LJFF()) != null) {
            obj = mapLJFF.get("prefetchData");
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            map = (Map) obj;
        }
        C1531270pwz.LIZ(c1531330px5, null, null, null, null, map, 15);
    }

    @Override // X.InterfaceC1531440pxG
    public final void onError(String str) throws JSONException {
        C1537480q70 c1537480q70 = this.LIZIZ;
        String str2 = this.LIZJ;
        if (str2 == null) {
            str2 = this.LIZ;
        }
        JSONObject jSONObjectPut = new JSONObject().put("success", 0);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("worker runtime error, ");
        sbLIZ.append(str);
        C1522300piW.LIZIZ("hybrid_prefetch_worker_finish", c1537480q70, str2, jSONObjectPut.put("errorMsg", C2188811AlT.LIZIZ(sbLIZ)).put("errorCode", -998));
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onError: ");
        sbLIZ2.append(str);
        C2188811AlT.LIZIZ(sbLIZ2);
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("worker runtime error, ");
        sbLIZ3.append(str);
        LJIIJ(this, 3, C2188811AlT.LIZIZ(sbLIZ3), null, 4);
    }

    public C1531220pwu(C1537480q70 c1537480q70, String str) {
        this.LIZ = str;
        this.LIZIZ = c1537480q70;
        String str2 = c1537480q70.bidFrom;
        ConcurrentHashMap<String, AbstractC1538620q8q> concurrentHashMap = C1530050pv1.LIZIZ;
        AbstractC1538620q8q abstractC1538620q8q = concurrentHashMap.get(str2);
        this.LIZLLL = abstractC1538620q8q == null ? concurrentHashMap.get("hybridkit_default_bid") : abstractC1538620q8q;
        JSONArray jSONArray = C1533710q0v.LIZ;
        this.LJ = C1533710q0v.LIZIZ(c1537480q70, false);
        this.LJFF = EnumC1531250pwx.Unusable;
        this.LJIIJ = C452501pT.LIZIZ(new C1093204Pi());
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x004b A[Catch: all -> 0x0098, PHI: r5
      0x004b: PHI (r5v7 java.util.Map<java.lang.Object, java.lang.Object>) = (r5v4 java.util.Map<java.lang.Object, java.lang.Object>), (r5v8 java.util.Map<java.lang.Object, java.lang.Object>) binds: [B:29:0x0049, B:27:0x0043] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0098, blocks: (B:11:0x000f, B:13:0x001f, B:15:0x0023, B:17:0x0027, B:19:0x002d, B:23:0x0035, B:30:0x004b, B:31:0x0050, B:33:0x0065, B:34:0x006c, B:36:0x0072, B:37:0x0079, B:38:0x0090, B:21:0x0031, B:28:0x0045, B:25:0x003b), top: B:59:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0065 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:11:0x000f, B:13:0x001f, B:15:0x0023, B:17:0x0027, B:19:0x002d, B:23:0x0035, B:30:0x004b, B:31:0x0050, B:33:0x0065, B:34:0x006c, B:36:0x0072, B:37:0x0079, B:38:0x0090, B:21:0x0031, B:28:0x0045, B:25:0x003b), top: B:59:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072 A[Catch: all -> 0x0098, TryCatch #0 {all -> 0x0098, blocks: (B:11:0x000f, B:13:0x001f, B:15:0x0023, B:17:0x0027, B:19:0x002d, B:23:0x0035, B:30:0x004b, B:31:0x0050, B:33:0x0065, B:34:0x006c, B:36:0x0072, B:37:0x0079, B:38:0x0090, B:21:0x0031, B:28:0x0045, B:25:0x003b), top: B:59:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0090 A[Catch: all -> 0x0098, TRY_LEAVE, TryCatch #0 {all -> 0x0098, blocks: (B:11:0x000f, B:13:0x001f, B:15:0x0023, B:17:0x0027, B:19:0x002d, B:23:0x0035, B:30:0x004b, B:31:0x0050, B:33:0x0065, B:34:0x006c, B:36:0x0072, B:37:0x0079, B:38:0x0090, B:21:0x0031, B:28:0x0045, B:25:0x003b), top: B:59:0x000f, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ab A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:6:0x0008, B:41:0x00a4, B:43:0x00ab, B:44:0x00ef, B:46:0x00f5, B:48:0x010e, B:50:0x0112, B:52:0x0118, B:40:0x0099, B:11:0x000f, B:13:0x001f, B:15:0x0023, B:17:0x0027, B:19:0x002d, B:23:0x0035, B:30:0x004b, B:31:0x0050, B:33:0x0065, B:34:0x006c, B:36:0x0072, B:37:0x0079, B:38:0x0090, B:21:0x0031, B:28:0x0045, B:25:0x003b), top: B:61:0x0008, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f5 A[Catch: all -> 0x011f, TryCatch #1 {all -> 0x011f, blocks: (B:6:0x0008, B:41:0x00a4, B:43:0x00ab, B:44:0x00ef, B:46:0x00f5, B:48:0x010e, B:50:0x0112, B:52:0x0118, B:40:0x0099, B:11:0x000f, B:13:0x001f, B:15:0x0023, B:17:0x0027, B:19:0x002d, B:23:0x0035, B:30:0x004b, B:31:0x0050, B:33:0x0065, B:34:0x006c, B:36:0x0072, B:37:0x0079, B:38:0x0090, B:21:0x0031, B:28:0x0045, B:25:0x003b), top: B:61:0x0008, inners: #0 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.String r9, java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1531220pwu.LIZJ(java.lang.String, java.lang.String):void");
    }

    public final void LJ(String str, C1533790q13 c1533790q13) throws JSONException {
        String string = c1533790q13.LIZLLL.toString();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(string);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1537480q70 c1537480q70 = this.LIZIZ;
        String str2 = this.LIZJ;
        if (str2 == null) {
            str2 = this.LIZ;
        }
        JSONObject jSONObjectPut = new JSONObject().put("success", 0).put("errorCode", -997);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Forest load error, ");
        sbLIZ2.append(strLIZIZ);
        C1522300piW.LIZIZ("hybrid_prefetch_file_load_state", c1537480q70, str2, jSONObjectPut.put("errorMsg", C2188811AlT.LIZIZ(sbLIZ2)));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Forest error, ");
        sbLIZ3.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Forest load error, ");
        sbLIZ4.append(strLIZIZ);
        LJIIJ(this, 2, C2188811AlT.LIZIZ(sbLIZ4), null, 4);
    }

    public final void LJFF(C1532310pyf c1532310pyf, String str) throws JSONException {
        String strLIZJ = c1532310pyf.LIZJ.LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append(", ");
        sbLIZ.append(strLIZJ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C1537480q70 c1537480q70 = this.LIZIZ;
        String str2 = this.LIZJ;
        if (str2 == null) {
            str2 = this.LIZ;
        }
        JSONObject jSONObjectPut = new JSONObject().put("success", 0).put("errorCode", -997);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Forest load error, ");
        sbLIZ2.append(strLIZIZ);
        C1522300piW.LIZIZ("hybrid_prefetch_file_load_state", c1537480q70, str2, jSONObjectPut.put("errorMsg", C2188811AlT.LIZIZ(sbLIZ2)));
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("Forest error, ");
        sbLIZ3.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ3);
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("Forest load error, ");
        sbLIZ4.append(strLIZIZ);
        LJIIJ(this, 2, C2188811AlT.LIZIZ(sbLIZ4), null, 4);
    }

    public final void LIZLLL(C1537480q70 c1537480q70, IResourceServiceX iResourceServiceX, String str) throws JSONException {
        String str2;
        String strLIZLLL;
        boolean z;
        C1533790q13 c1533790q13LIZIZ;
        C1537910q7h c1537910q7h;
        C1530570pvr.LIZIZ(c1537480q70, "spark_lynx_prefetch_load_prefetch_start");
        RequestParams requestParams = new RequestParams(EnumC1533980q1M.LYNX_CHILD_RESOURCE);
        requestParams.loadToMemory = true;
        requestParams.waitGeckoUpdate = false;
        requestParams.needLocalFile = Boolean.FALSE;
        C1533760q10 c1533760q10 = c1537480q70.mainDocumentGeckoInfo;
        String strLIZIZ = null;
        if (c1533760q10 != null) {
            str2 = c1533760q10.LIZIZ;
        } else {
            str2 = null;
        }
        requestParams.channel = str2;
        requestParams.bundle = "prefetch.js";
        requestParams.customParams.put("rl_container_uuid", c1537480q70.containerId);
        C1529870puj.LIZ.getClass();
        C1529870puj.LIZ(c1537480q70);
        requestParams.customParams.put("hybrid_channel", "prefetch");
        InterfaceC1531560pxS interfaceC1531560pxS = c1537480q70.hybridParams;
        if ((interfaceC1531560pxS instanceof C1537910q7h) && (c1537910q7h = (C1537910q7h) interfaceC1531560pxS) != null && c1537910q7h.LJJIIJ != null) {
            JSONArray jSONArray = C1533710q0v.LIZ;
            C1533710q0v.LJIIIIZZ(requestParams, c1537910q7h.LJJIIJ);
            HybridSchemaParam hybridSchemaParam = c1537910q7h.LJJIIJ;
            if (hybridSchemaParam == null || (strLIZLLL = C1533710q0v.LIZJ(hybridSchemaParam, str, true)) == null) {
                strLIZLLL = "";
            }
        } else {
            JSONArray jSONArray2 = C1533710q0v.LIZ;
            strLIZLLL = C1533710q0v.LIZLLL(null, requestParams, str);
        }
        String str3 = requestParams.bundle;
        if (str3 != null && str3.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            String str4 = requestParams.bundle;
            if (str4 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(str4.substring(0, a0.LJJJJ(str4, '/', 0, 6) + 1));
                sbLIZ.append("prefetch.js");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            }
            requestParams.bundle = strLIZIZ;
        }
        String lastPathSegment = UriProtector.parse(strLIZLLL).getLastPathSegment();
        if (lastPathSegment != null && u.LJIIZILJ(lastPathSegment, ".js", false) && a0.LJJJJ(strLIZLLL, '/', 0, 6) != -1) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(strLIZLLL.substring(0, a0.LJJJJ(strLIZLLL, '/', 0, 6) + 1));
            sbLIZ2.append("prefetch.js");
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            this.LIZJ = strLIZIZ2;
            requestParams.customParams.put("resource_url", strLIZIZ2);
            if (this.LJFF == EnumC1531250pwx.Terminate) {
                return;
            }
            this.LJFF = EnumC1531250pwx.Fetching;
            C1533910q1F c1533910q1FCreateSyncRequest = iResourceServiceX.createSyncRequest(this.LIZJ, requestParams);
            if (c1533910q1FCreateSyncRequest != null && (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) != null) {
                if (c1533790q13LIZIZ.LIZIZ) {
                    byte[] bArrLJIIIZ = c1533790q13LIZIZ.LJIIIZ();
                    if (bArrLJIIIZ != null) {
                        String str5 = new String(bArrLJIIIZ, Charsets.UTF_8);
                        C1537480q70 c1537480q702 = this.LIZIZ;
                        String str6 = this.LIZJ;
                        if (str6 == null) {
                            str6 = this.LIZ;
                        }
                        C1522300piW.LIZIZ("hybrid_prefetch_file_load_state", c1537480q702, str6, new JSONObject().put("success", 1));
                        C1537480q70 c1537480q703 = this.LIZIZ;
                        String str7 = this.LIZJ;
                        if (str7 == null) {
                            str7 = this.LIZ;
                        }
                        JSONObject jSONObjectPut = new JSONObject().put("type", "forest");
                        String str8 = c1533790q13LIZIZ.LJ;
                        if (str8 == null) {
                            str8 = "unknown";
                        }
                        C1522300piW.LIZIZ("hybrid_prefetch_resource_load", c1537480q703, str7, jSONObjectPut.put("res_from", str8).put("channel", c1533790q13LIZIZ.LIZ.LJJJJLI.LIZIZ).put("bundle", c1533790q13LIZIZ.LIZ.LJJJJLI.LIZJ));
                        LIZJ(this.LIZJ, str5);
                        return;
                    }
                    LJ("forest load succeeded but null bytes", c1533790q13LIZIZ);
                    return;
                }
                LJ("fetch_reject_2", c1533790q13LIZIZ);
                return;
            }
            return;
        }
        LIZ(strLIZLLL);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJI(X.C1533020pzo r12, java.lang.String r13, X.C1537480q70 r14) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1531220pwu.LJI(X.0pzo, java.lang.String, X.0q70):void");
    }

    public final synchronized void LJIIIZ(Throwable th, String str, Integer num) {
        Unit unit;
        this.LJFF = EnumC1531250pwx.Terminate;
        try {
            Worker worker = this.LJI;
            if (worker != null) {
                worker.LIZIZ();
                unit = Unit.LIZ;
            } else {
                unit = null;
            }
            C189200o6.m2constructorimpl(unit);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C189200o6.m2constructorimpl(new C098200Yq(th2));
        }
        InterfaceC1531280px0 interfaceC1531280px0 = this.LJII;
        if (interfaceC1531280px0 != null) {
            this.LJII = null;
            C1531270pwz.LIZ(interfaceC1531280px0, num, str, th, null, null, 24);
        }
        this.LJIIIZ = new C443120HZe<>(num, str, th);
        Iterator it2 = ((ConcurrentHashMap) this.LJIIJ.getValue()).entrySet().iterator();
        while (it2.hasNext()) {
            ((C1531310px3) ((Map.Entry) it2.next()).getValue()).LIZIZ(th, str, num);
        }
    }

    public static /* synthetic */ void LJIIJ(C1531220pwu c1531220pwu, Integer num, String str, Throwable th, int i) {
        if ((i & 1) != 0) {
            num = null;
        }
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            th = null;
        }
        c1531220pwu.LJIIIZ(th, str, num);
    }
}
