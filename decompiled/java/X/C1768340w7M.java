package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.lynx.tasm.LynxEnv;
import com.ss.android.ugc.aweme.base.ui.anchor.ICommonFeedApiService;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.utils.Default;
import com.ss.android.ugc.aweme.ecommerce.mall.mixhome.utils.MMKConfigData;
import com.ss.android.ugc.aweme.ecommerce.mall.tools.MMKStorageUtil;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.search.ISearchService;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w7M, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1768340w7M {
    public static volatile Map<String, String> LIZIZ;
    public static volatile Boolean LIZJ;
    public static volatile Long LIZLLL;
    public static volatile C1848407Lu LJ;
    public static final C1768340w7M LIZ = new C1768340w7M();
    public static String LJFF = "";
    public static final String LJI = LynxEnv.inst().getLynxVersion();
    public static final C01GW LJII = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(303));
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(302));

    public static String LJ() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String strLJIJ = ((ICommonFeedApiService) ServiceManager.get().getService(ICommonFeedApiService.class)).LJIJ();
        if (strLJIJ.length() == 0) {
            strLJIJ = "";
        }
        jSONObject.put("fromGroupId", strLJIJ);
        jSONObject.put("historyList", ((ISearchService) ServiceManager.get().getService(ISearchService.class)).q0());
        return C786410Ut5.J3(jSONObject);
    }

    public final C1848407Lu LIZJ() {
        if (LJ == null) {
            synchronized (this) {
                try {
                    if (LJ == null) {
                        LIZ.getClass();
                        LJ = LJIIJ(LJII());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJ;
    }

    public final Map<String, Object> LIZLLL() {
        if (LIZIZ == null) {
            synchronized (this) {
                try {
                    if (LIZIZ == null) {
                        LIZ.getClass();
                        LIZIZ = LJIIIZ(LJIIIIZZ());
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        Map<String, String> map = LIZIZ;
        return map == null ? C2097608Jq.LJ() : map;
    }

    public static String LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1552050qUV.LJ(C1553670qX7.LIZ(), "tiktok_ecom_hybrid_mall"));
        sbLIZ.append("/config/gecko_config.json");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (c0vsj.exists()) {
            return C09BH.LJI(c0vsj, Charsets.UTF_8);
        }
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("loadMMKGeckoConfigJson, file not exist. geckoConfigJsonPath=>");
        sbLIZ2.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        C599820Nfo.LJ(c599820Nfo);
        return null;
    }

    public static String LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1552050qUV.LJ(C1553670qX7.LIZ(), "tiktok_ecom_hybrid_mall"));
        sbLIZ.append("/config/injection.json");
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C599820Nfo c599820Nfo = C599820Nfo.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("geckoInjectionJsonPath=>");
        sbLIZ2.append(strLIZIZ);
        C2188811AlT.LIZIZ(sbLIZ2);
        c599820Nfo.getClass();
        C599820Nfo.LIZLLL();
        C0VSJ c0vsj = new C0VSJ(strLIZIZ);
        if (c0vsj.exists()) {
            return C09BH.LJI(c0vsj, Charsets.UTF_8);
        }
        return null;
    }

    public static C788370UwF LIZ(String str) {
        C01GW c01gw = LJII;
        C788370UwF c788370UwF = (C788370UwF) ((ConcurrentHashMap) c01gw.getValue()).get(str);
        if (c788370UwF != null) {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fetchGeckoInfoByChannel, channel=");
            sbLIZ.append(str);
            sbLIZ.append(", res=");
            sbLIZ.append(c788370UwF);
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZLLL();
            return c788370UwF;
        }
        boolean zLJIIZILJ = C1552050qUV.LJIIZILJ(str);
        C1553670qX7.LIZ.getClass();
        C788370UwF c788370UwF2 = new C788370UwF(zLJIIZILJ, C1552050qUV.LJIIL(C1553670qX7.LIZ(), str));
        ((ConcurrentHashMap) c01gw.getValue()).put(str, c788370UwF2);
        C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("fetchGeckoInfoByChannel, channel=");
        sbLIZ2.append(str);
        sbLIZ2.append(", res=");
        sbLIZ2.append(c788370UwF2);
        C2188811AlT.LIZIZ(sbLIZ2);
        c599820Nfo2.getClass();
        C599820Nfo.LIZLLL();
        return c788370UwF2;
    }

    public static Map LJIIIZ(String str) {
        MMKConfigData mMKConfigData;
        Default r5;
        List<String> list;
        boolean z;
        Type type;
        if (str == null) {
            return null;
        }
        boolean z2 = false;
        try {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(MMKConfigData.class));
                } else {
                    type = new TypeToken<MMKConfigData>() { // from class: X.0w7N
                    }.getType();
                }
                Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(str, type);
                if (!(objLJIIIIZZ instanceof MMKConfigData)) {
                    objLJIIIIZZ = null;
                }
                mMKConfigData = (MMKConfigData) objLJIIIIZZ;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                mMKConfigData = null;
            }
            if (mMKConfigData != null) {
                r5 = mMKConfigData.f58default;
            } else {
                r5 = null;
            }
            if (r5 != null && (list = r5.localStorageKey) != null && (!list.isEmpty())) {
                z2 = true;
            }
            if (z2) {
                HashMap map = new HashMap();
                for (String str2 : r5.localStorageKey) {
                    map.put(str2, MMKStorageUtil.LIZ.LIZIZ(str2, ""));
                }
                for (String str3 : r5.customInjectKey) {
                    if (Intrinsics.LJFF(str3, "ttmall_search_params")) {
                        LIZ.getClass();
                        map.put(str3, LJ());
                    }
                    if (Intrinsics.LJFF(str3, "ttmall_search_user_action")) {
                        C2232408os c2232408os = C341050DYp.LIZ;
                        String strLIZ = C341050DYp.LIZ(Integer.valueOf(C0QCT.LIZ()));
                        if (strLIZ == null) {
                            strLIZ = "";
                        }
                        map.put(str3, strLIZ);
                    }
                }
                return map;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exception in parsing injection data=");
            sbLIZ.append(e2.getMessage());
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZIZ();
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005e A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:7:0x0012, B:9:0x0021, B:11:0x0025, B:12:0x002f, B:17:0x0043, B:19:0x0047, B:21:0x004b, B:23:0x004f, B:29:0x005e, B:31:0x0062, B:32:0x006a, B:34:0x0070, B:36:0x0083, B:37:0x0087, B:39:0x008d, B:41:0x009d, B:43:0x00a3, B:44:0x00ae, B:46:0x00b2, B:49:0x00bb, B:51:0x00bf, B:52:0x00c3, B:54:0x00c9, B:57:0x00db, B:58:0x00df, B:60:0x00e3, B:61:0x00e5, B:15:0x0038, B:25:0x0056), top: B:67:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00c9 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:7:0x0012, B:9:0x0021, B:11:0x0025, B:12:0x002f, B:17:0x0043, B:19:0x0047, B:21:0x004b, B:23:0x004f, B:29:0x005e, B:31:0x0062, B:32:0x006a, B:34:0x0070, B:36:0x0083, B:37:0x0087, B:39:0x008d, B:41:0x009d, B:43:0x00a3, B:44:0x00ae, B:46:0x00b2, B:49:0x00bb, B:51:0x00bf, B:52:0x00c3, B:54:0x00c9, B:57:0x00db, B:58:0x00df, B:60:0x00e3, B:61:0x00e5, B:15:0x0038, B:25:0x0056), top: B:67:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e3 A[Catch: all -> 0x00ec, TryCatch #0 {all -> 0x00ec, blocks: (B:7:0x0012, B:9:0x0021, B:11:0x0025, B:12:0x002f, B:17:0x0043, B:19:0x0047, B:21:0x004b, B:23:0x004f, B:29:0x005e, B:31:0x0062, B:32:0x006a, B:34:0x0070, B:36:0x0083, B:37:0x0087, B:39:0x008d, B:41:0x009d, B:43:0x00a3, B:44:0x00ae, B:46:0x00b2, B:49:0x00bb, B:51:0x00bf, B:52:0x00c3, B:54:0x00c9, B:57:0x00db, B:58:0x00df, B:60:0x00e3, B:61:0x00e5, B:15:0x0038, B:25:0x0056), top: B:67:0x0012, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1848407Lu LJIIJ(java.lang.String r10) {
        /*
            Method dump skipped, instruction units count: 273
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1768340w7M.LJIIJ(java.lang.String):X.07Lu");
    }

    public final Long LIZIZ(String str) {
        if (!((Boolean) LJIIIIZZ.getValue()).booleanValue()) {
            if (LIZLLL == null) {
                synchronized (this) {
                    try {
                        if (LIZLLL == null) {
                            C1553670qX7.LIZ.getClass();
                            String strLIZ = C1553670qX7.LIZ();
                            LIZ.getClass();
                            LIZLLL = C1552050qUV.LJIIL(strLIZ, "tiktok_ecom_hybrid_mall");
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return LIZLLL;
        }
        return LIZ(str).LIZIZ;
    }

    public final boolean LJFF(String str) {
        if (!((Boolean) LJIIIIZZ.getValue()).booleanValue()) {
            if (LIZJ == null) {
                synchronized (this) {
                    try {
                        if (LIZJ == null) {
                            LIZ.getClass();
                            LIZJ = Boolean.valueOf(C1552050qUV.LJIIZILJ("tiktok_ecom_hybrid_mall"));
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            }
            return Intrinsics.LJFF(LIZJ, Boolean.TRUE);
        }
        return LIZ(str).LIZ;
    }
}
