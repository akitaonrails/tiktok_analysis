package X;

import Y.ARunnableS40S0400000_32;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.MutableContextWrapper;
import android.content.res.AssetManager;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.RequestParams;
import com.bytedance.geckox.model.UpdatePackage;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.tiktok.myna.preload.MynaGeckoChannelPreloadInfo;
import com.tiktok.myna.render.render.MynaElement;
import com.tiktok.myna.render.render.MynaTemplateProtocol;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.AFwS219S0000000_30;
import kotlin.jvm.internal.AFwS278S0000000_32;
import kotlin.jvm.internal.AwS146S1100000_32;
import kotlin.jvm.internal.AwS53S1000000_2;
import kotlin.jvm.internal.AwS602S0100000_23;
import kotlin.jvm.internal.AwS82S1000000_32;
import kotlin.jvm.internal.AwS87S1000000_2;
import kotlin.jvm.internal.AwS9S1310000_32;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18cO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21322218cO {
    public static final C21322218cO LIZ = new C21322218cO();
    public static final Gson LIZIZ = new Gson();
    public static final Executor LIZJ = C786410Ut5.d4(6);
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(332));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(331));
    public static final HashMap<String, InterfaceC21322918cV> LJFF = new HashMap<>();
    public static final C21322018cM LJI = new C21322018cM();
    public static final C1759030vsL LJII = new C1759030vsL();
    public static final C01GW LJIIIIZZ = C452501pT.LIZIZ(AFwS219S0000000_30.get$arr$(330));
    public static final C01GW LJIIIZ;

    static {
        C1551940qUK.LJIIL(new AbstractC1552040qUU() { // from class: X.18cH
            @Override // X.AbstractC1552040qUU
            public final void LJIL(long j, UpdatePackage updatePackage) {
                final String channel = updatePackage.getChannel();
                if (channel != null && channel.length() != 0) {
                    C1168400gVi.LIZ(new AwS53S1000000_2(channel, 30));
                    Set<String> set = C21322218cO.LJI.LIZJ.get(channel);
                    Object obj = null;
                    if (set != null) {
                        Iterator<T> it2 = set.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            Object next = it2.next();
                            if (!a0.LJJJIL((String) next)) {
                                obj = next;
                                break;
                            }
                        }
                        final String str = (String) obj;
                        if (str != null) {
                            Runnable runnable = new Runnable() { // from class: X.18cE
                                public final void LIZ() {
                                    int iLJJJJ;
                                    int iLJJJJ2;
                                    int iLJJJJ3;
                                    C21322018cM c21322018cM = C21322218cO.LJI;
                                    String str2 = channel;
                                    c21322018cM.getClass();
                                    ArrayList<String> arrayList = new ArrayList();
                                    if (!(str2 == null || str2.length() == 0)) {
                                        Iterator<Map.Entry<String, C21323018cW>> it3 = c21322018cM.LIZ.snapshot().entrySet().iterator();
                                        while (it3.hasNext()) {
                                            String key = it3.next().getKey();
                                            try {
                                                iLJJJJ = a0.LJJJJ(key, '/', 0, 6);
                                                iLJJJJ2 = a0.LJJJJ(key, '/', iLJJJJ - 1, 4);
                                            } catch (Throwable th) {
                                                TryCatchGuardChecker.doCheck(th);
                                                C1325860kbg.LIZIZ(th, new AwS87S1000000_2(key, 47), C2097608Jq.LJ());
                                            }
                                            String strSubstring = (iLJJJJ < 0 || iLJJJJ2 < 0 || (iLJJJJ3 = a0.LJJJJ(key, '/', iLJJJJ2 + (-1), 4)) < 0) ? "" : key.substring(iLJJJJ3 + 1, iLJJJJ2);
                                            if (Intrinsics.LJFF(strSubstring, str2)) {
                                                arrayList.add(key);
                                            }
                                        }
                                    }
                                    Iterator it4 = arrayList.iterator();
                                    while (it4.hasNext()) {
                                        C21322218cO.LJI.LIZ.remove((String) it4.next());
                                    }
                                    C21322218cO c21322218cO = C21322218cO.LIZ;
                                    String str3 = str;
                                    c21322218cO.getClass();
                                    InterfaceC1540190qBN interfaceC1540190qBNLIZLLL = C21322218cO.LIZLLL(str3);
                                    if (interfaceC1540190qBNLIZLLL != null) {
                                        for (String str4 : arrayList) {
                                            String strLIZ = C1942607jE.LIZ(str4);
                                            if (strLIZ.length() > 0) {
                                                C21322518cR c21322518cR = new C21322518cR(str, str4, strLIZ, C21321318cF.LIZ(false, false, false, 7));
                                                C21322218cO.LIZ.getClass();
                                                C21322218cO.LIZJ(interfaceC1540190qBNLIZLLL, c21322518cR, null);
                                            }
                                        }
                                    }
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    boolean zLIZ;
                                    C1C7U.LIZ("MynaPreloadUtil$TemplateUpdateListener@a5a9.onUpdateSuccess$runnable$1");
                                    try {
                                        LIZ();
                                    } finally {
                                        if (!zLIZ) {
                                        }
                                    }
                                    C1C7U.LIZIZ("MynaPreloadUtil$TemplateUpdateListener@a5a9.onUpdateSuccess$runnable$1");
                                }
                            };
                            C21322218cO.LIZ.getClass();
                            C21322218cO.LIZJ.execute(runnable);
                        }
                    }
                }
            }
        });
        C1536980q6C c1536980q6C = new C1536980q6C();
        C1534490q2B.LIZIZ.add(c1536980q6C);
        C1533030pzp.LIZ.LIZ(c1536980q6C);
        LJIIIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(254));
    }

    public static InterfaceC1540190qBN LIZLLL(String str) {
        InterfaceC1540190qBN interfaceC1540190qBN = LJI.LIZIZ.get(str);
        if (interfaceC1540190qBN == null) {
            return (InterfaceC1540190qBN) LJIIIZ.getValue();
        }
        return interfaceC1540190qBN;
    }

    public static boolean LJFF(String str) {
        boolean z;
        C1168270gVV.LIZ.getClass();
        C1162950gMv c1162950gMv = (C1162950gMv) C1168270gVV.LJIIIZ().get(str);
        if (c1162950gMv != null && !((Boolean) c1162950gMv.LIZ("enable_template_cache")).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public static boolean LJIIJJI(String str) {
        C1162950gMv c1162950gMv;
        boolean z = false;
        if (!LJFF(str)) {
            return false;
        }
        C1168270gVV.LIZ.getClass();
        InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
        if (interfaceC1168280gVW != null && interfaceC1168280gVW.LJII() && (c1162950gMv = (C1162950gMv) C1168270gVV.LJIIIZ().get(str)) != null && ((Boolean) c1162950gMv.LIZ("use_mock_data")).booleanValue()) {
            z = true;
        }
        return !z;
    }

    public static InterfaceC21322918cV LJ(Object obj, String str) {
        boolean z;
        JSONObject jSONObjectLIZIZ;
        JSONObject jSONObjectLIZIZ2;
        HashMap<String, InterfaceC21322918cV> map = LJFF;
        synchronized (map) {
            try {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(obj.hashCode());
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                InterfaceC21322918cV interfaceC21322918cV = map.get(strLIZIZ);
                if (interfaceC21322918cV != null) {
                    return interfaceC21322918cV;
                }
                C21322218cO c21322218cO = LIZ;
                c21322218cO.getClass();
                InterfaceC1540190qBN interfaceC1540190qBNLIZLLL = LIZLLL(str);
                if (interfaceC1540190qBNLIZLLL != null) {
                    C21322318cP c21322318cP = new C21322318cP(strLIZIZ, str, interfaceC1540190qBNLIZLLL, LJI.LIZ(str), c21322218cO);
                    C1168270gVV.LIZ.getClass();
                    InterfaceC1168310gVZ interfaceC1168310gVZ = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get(str);
                    boolean z2 = true;
                    if (interfaceC1168310gVZ != null && (jSONObjectLIZIZ2 = interfaceC1168310gVZ.LIZIZ()) != null && jSONObjectLIZIZ2.optBoolean("enable_fully_async_fetch", false)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    c21322318cP.LJ = z;
                    InterfaceC1168310gVZ interfaceC1168310gVZ2 = (InterfaceC1168310gVZ) C1168270gVV.LJIIIIZZ().get(str);
                    if (interfaceC1168310gVZ2 == null || (jSONObjectLIZIZ = interfaceC1168310gVZ2.LIZIZ()) == null || !jSONObjectLIZIZ.optBoolean("disable_sync_fetch", false)) {
                        z2 = false;
                    }
                    c21322318cP.LJFF = z2;
                    map.put(strLIZIZ, c21322318cP);
                    return c21322318cP;
                }
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(str);
                sbLIZ2.append(" not initialized yet: need to call initChannel first");
                throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static void LJIIJ(Context context, Context context2) {
        if (context2 instanceof MutableContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
        }
        if (context instanceof MutableContextWrapper) {
            ((MutableContextWrapper) context).setBaseContext(context2);
        }
    }

    public static C21323018cW LIZ(C21322518cR c21322518cR, MynaTemplateProtocol mynaTemplateProtocol, String str) throws JSONException {
        long j;
        int i;
        String strJ3;
        String string;
        String str2;
        C21322818cU c21322818cU;
        byte[] bArr;
        boolean z;
        List<String> list;
        C21322818cU c21322818cU2 = c21322518cR.LJII;
        if (c21322818cU2 != null) {
            j = c21322818cU2.LIZJ;
        } else {
            j = 0;
        }
        C21322818cU c21322818cU3 = c21322518cR.LJII;
        if (c21322818cU3 != null) {
            i = c21322818cU3.LJIIIIZZ;
        } else {
            i = 0;
        }
        C21322818cU c21322818cU4 = c21322518cR.LJII;
        String str3 = null;
        if (c21322818cU4 == null) {
            strJ3 = null;
        } else {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("res_error_msg", c21322818cU4.LJIIIZ);
            jSONObject.put("http_status_code", String.valueOf(c21322818cU4.LJIIJ));
            jSONObject.put("use_forestx", c21322818cU4.LJIIJJI);
            strJ3 = C786410Ut5.J3(jSONObject);
        }
        String strLIZLLL = c21322518cR.LIZLLL();
        if (C1325860kbg.LJII()) {
            C21322818cU c21322818cU5 = c21322518cR.LJII;
            if (c21322818cU5 == null || (list = c21322818cU5.LJII) == null || (string = list.toString()) == null) {
                string = "";
            }
        } else {
            string = null;
        }
        if (C1325860kbg.LJII()) {
            try {
                c21322818cU = c21322518cR.LJII;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1325860kbg.LJFF(th, th.getMessage());
            }
            if (c21322818cU != null && (bArr = c21322818cU.LIZLLL) != null) {
                str2 = new String(bArr, Charsets.UTF_8);
            } else {
                str2 = null;
            }
        } else {
            str2 = null;
        }
        long j2 = c21322518cR.LJFF;
        long j3 = c21322518cR.LJI;
        C21322818cU c21322818cU6 = c21322518cR.LJII;
        if (c21322818cU6 != null) {
            z = c21322818cU6.LIZIZ;
        } else {
            z = false;
        }
        if (C1325860kbg.LJII()) {
            str3 = str;
        }
        return new C21323018cW(mynaTemplateProtocol, j, i, strJ3, strLIZLLL, string, str2, z, str3, Long.valueOf(j2), Long.valueOf(j3), 6);
    }

    public static void LIZJ(InterfaceC1540190qBN interfaceC1540190qBN, C21322518cR c21322518cR, Function2 function2) {
        Object obj;
        Map<String, Object> mapLJIIIZ;
        c21322518cR.getClass();
        System.currentTimeMillis();
        String str = c21322518cR.LIZIZ;
        C1168400gVi.LIZ(new AwS146S1100000_32(str, c21322518cR, 16));
        String str2 = c21322518cR.LIZ;
        C21321418cG c21321418cG = c21322518cR.LIZLLL;
        AwS9S1310000_32 awS9S1310000_32 = new AwS9S1310000_32(c21322518cR, function2, str, interfaceC1540190qBN, 1);
        if (interfaceC1540190qBN instanceof C1539470qAD) {
            interfaceC1540190qBN.LIZIZ(str, new C1539490qAF(str2, null, null, new C1539500qAG(false, false, false), null, 22), new AwS146S1100000_32(str, awS9S1310000_32, 22));
            return;
        }
        C1168270gVV.LIZ.getClass();
        InterfaceC1168280gVW interfaceC1168280gVW = C1168270gVV.LIZJ;
        if (interfaceC1168280gVW != null && (mapLJIIIZ = interfaceC1168280gVW.LJIIIZ()) != null) {
            obj = mapLJIIIZ.get("legacy_forest_cdn_request");
        } else {
            obj = null;
        }
        if (((Boolean) obj).booleanValue()) {
            interfaceC1540190qBN.LIZIZ(str, new C1539490qAF(null, null, null, new C1539500qAG(c21321418cG.LIZIZ, c21321418cG.LIZ, c21321418cG.LIZJ), null, 23), new AwS146S1100000_32(str, awS9S1310000_32, 22));
            return;
        }
        C1533510q0b c1533510q0bLIZ = C21322418cQ.LIZ(str);
        if (c1533510q0bLIZ == null) {
            awS9S1310000_32.invoke(new C21323218cY(null, "parse url failed", null, "parse_url", null, false, 53));
        } else {
            interfaceC1540190qBN.LIZIZ(str, new C1539490qAF(null, c1533510q0bLIZ.LIZIZ, c1533510q0bLIZ.LIZJ, new C1539500qAG(c21321418cG.LIZIZ, c21321418cG.LIZ, c21321418cG.LIZJ), null, 17), new AwS146S1100000_32(str, awS9S1310000_32, 22));
        }
    }

    @InterfaceC1294060jmO
    public static void LJIIIZ(String str, String str2, final Forest forest) {
        Set<String> setPutIfAbsent;
        if (!a0.LJJJIL(str) && !a0.LJJJIL(str2)) {
            C21322018cM c21322018cM = LJI;
            c21322018cM.LIZIZ.put(str, new InterfaceC1540190qBN(forest) { // from class: X.0qAE
                public final Forest LIZ;

                @Override // X.InterfaceC1540190qBN
                public final AssetManager LJIIJ() {
                    return this.LIZ.getApplication().getAssets();
                }

                {
                    this.LIZ = forest;
                }

                public static RequestParams LIZJ(C1539490qAF c1539490qAF) {
                    C21322218cO.LIZ.getClass();
                    RequestParams requestParams = new RequestParams(EnumC1533980q1M.MYNA_TEMPLATE);
                    C1539500qAG c1539500qAG = c1539490qAF.LIZLLL;
                    requestParams.disableBuiltin = c1539500qAG.LIZ;
                    requestParams.disableOffline = c1539500qAG.LIZIZ;
                    requestParams.disableCdn = c1539500qAG.LIZJ;
                    requestParams.accessKey = "";
                    requestParams.channel = c1539490qAF.LIZIZ;
                    requestParams.bundle = c1539490qAF.LIZJ;
                    Class<?> cls = c1539490qAF.LJ;
                    if (cls != null) {
                        requestParams.consumeType = cls;
                    }
                    return requestParams;
                }

                @Override // X.InterfaceC1540190qBN
                public final C21322818cU LIZ(String str3, C1539490qAF c1539490qAF) {
                    C1533790q13 c1533790q13LIZIZ;
                    C1533910q1F c1533910q1FCreateSyncRequest = this.LIZ.createSyncRequest(str3, LIZJ(c1539490qAF));
                    if (c1533910q1FCreateSyncRequest == null || (c1533790q13LIZIZ = c1533910q1FCreateSyncRequest.LIZIZ()) == null) {
                        return null;
                    }
                    C1533490q0Z c1533490q0Z = c1533790q13LIZIZ.LIZ;
                    boolean z = c1533790q13LIZIZ.LIZIZ;
                    String str4 = c1533790q13LIZIZ.LJ;
                    long j = c1533790q13LIZIZ.LJIIIZ;
                    byte[] bArrLJIIIZ = c1533790q13LIZIZ.LJIIIZ();
                    String strLIZLLL = c1533790q13LIZIZ.LIZLLL();
                    List<String> list = c1533790q13LIZIZ.LIZ.LJJJLL;
                    C1533810q15 c1533810q15 = c1533790q13LIZIZ.LIZLLL;
                    return new C21322818cU(str4, z, j, bArrLJIIIZ, strLIZLLL, c1533790q13LIZIZ, c1533490q0Z, list, c1533810q15.LIZIZ, c1533810q15.toString(), Integer.valueOf(c1533790q13LIZIZ.LIZLLL.LIZJ), false);
                }

                @Override // X.InterfaceC1540190qBN
                public final Object LIZIZ(String str3, C1539490qAF c1539490qAF, Function1<? super C21322818cU, Unit> function1) {
                    return this.LIZ.fetchResourceAsync(str3, LIZJ(c1539490qAF), new AwS602S0100000_23(function1, (Function1<? super InterfaceC1540940qCa, Unit>) 84));
                }
            });
            ConcurrentHashMap<String, Set<String>> concurrentHashMap = c21322018cM.LIZJ;
            Set<String> setNewSetFromMap = concurrentHashMap.get(str2);
            if (setNewSetFromMap == null && (setPutIfAbsent = concurrentHashMap.putIfAbsent(str2, (setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap())))) != null) {
                setNewSetFromMap = setPutIfAbsent;
            }
            setNewSetFromMap.add(str);
            return;
        }
        C1325860kbg.LJFF(null, "initBiz,biz or channel is empty");
    }

    public static void LJIIIIZZ(String str, MynaGeckoChannelPreloadInfo mynaGeckoChannelPreloadInfo, boolean z, AbstractC21321718cJ abstractC21321718cJ) {
        InterfaceC1540190qBN interfaceC1540190qBNLIZLLL = LIZLLL(str);
        if (interfaceC1540190qBNLIZLLL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadTemplate, forest not register for ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (abstractC21321718cJ != null) {
                abstractC21321718cJ.LIZJ(7000, null, null, null, strLIZIZ);
            }
            new C1338670kwL(EnumC1325870kbh.PRELOAD_ERROR, 7000, strLIZIZ, null, 24).LIZJ(C2097608Jq.LJ());
            return;
        }
        LIZJ.execute(new RunnableC21321818cK(mynaGeckoChannelPreloadInfo, str, abstractC21321718cJ, interfaceC1540190qBNLIZLLL, z));
    }

    public static C21323018cW LIZIZ(InterfaceC1540190qBN interfaceC1540190qBN, C21322518cR c21322518cR, boolean z, boolean z2, AbstractC21321718cJ abstractC21321718cJ) {
        C21323218cY c21323218cYLIZIZ;
        String str;
        String str2;
        Character chLJLLJ;
        String str3;
        C21322818cU c21322818cU;
        String str4;
        String str5;
        String str6;
        boolean zLIZIZ = C1168320gVa.LIZIZ();
        try {
            System.currentTimeMillis();
            str4 = c21322518cR.LIZIZ;
            C1168400gVi.LIZ(new AwS146S1100000_32(str4, c21322518cR, 14));
            c21323218cYLIZIZ = C21322418cQ.LIZIZ(interfaceC1540190qBN, str4, c21322518cR.LIZLLL);
        } catch (Throwable th) {
            th = th;
            c21323218cYLIZIZ = null;
        }
        try {
            c21322518cR.LJII = c21323218cYLIZIZ.LJ;
            String str7 = c21323218cYLIZIZ.LIZ;
            if (str7 != null && !a0.LJJJIL(str7)) {
                c21322518cR.LJFF = System.currentTimeMillis();
                MynaTemplateProtocol mynaTemplateProtocol = (MynaTemplateProtocol) LIZIZ.LJII(c21323218cYLIZIZ.LIZ, MynaTemplateProtocol.class);
                c21322518cR.LJI = System.currentTimeMillis();
                MynaElement uiInfo = mynaTemplateProtocol.getUiInfo();
                if (z2 && uiInfo != null) {
                    ARunnableS40S0400000_32 aRunnableS40S0400000_32 = new ARunnableS40S0400000_32(uiInfo, LJI.LIZ(c21322518cR.LIZ), abstractC21321718cJ, c21322518cR, 4);
                    if (!zLIZIZ) {
                        aRunnableS40S0400000_32.run();
                    } else {
                        LIZJ.execute(aRunnableS40S0400000_32);
                    }
                }
                C1168400gVi.LIZ(new AwS82S1000000_32(str4, 16));
                C21323018cW c21323018cWLIZ = LIZ(c21322518cR, mynaTemplateProtocol, null);
                if (LJIIJJI(c21322518cR.LIZ)) {
                    C21322018cM c21322018cM = LJI;
                    c21322018cM.getClass();
                    if (c21323018cWLIZ.LIZ != null) {
                        c21322018cM.LIZ.put(str4, c21323018cWLIZ);
                    }
                }
                if (abstractC21321718cJ != null) {
                    String str8 = c21322518cR.LIZJ;
                    String str9 = c21322518cR.LIZIZ;
                    C21322818cU c21322818cU2 = c21323218cYLIZIZ.LJ;
                    if (c21322818cU2 != null) {
                        str6 = c21322818cU2.LIZ;
                    } else {
                        str6 = null;
                    }
                    abstractC21321718cJ.LIZJ(0, str8, str9, str6, null);
                    return c21323018cWLIZ;
                }
                return c21323018cWLIZ;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getGeckoResourceSync, result content is empty: ");
            sbLIZ.append(str4);
            sbLIZ.append(", ");
            sbLIZ.append(c21323218cYLIZIZ.LIZIZ);
            sbLIZ.append(';');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (z) {
                new C1338670kwL(EnumC1325870kbh.PRELOAD_ERROR, 7002, strLIZIZ, null, 24).LIZJ(C21323718cd.LIZ(c21322518cR));
            }
            if (abstractC21321718cJ != null) {
                String str10 = c21322518cR.LIZJ;
                String str11 = c21322518cR.LIZIZ;
                C21322818cU c21322818cU3 = c21323218cYLIZIZ.LJ;
                if (c21322818cU3 != null) {
                    str5 = c21322818cU3.LIZ;
                } else {
                    str5 = null;
                }
                abstractC21321718cJ.LIZJ(7002, str10, str11, str5, strLIZIZ);
            }
            return LIZ(c21322518cR, null, null);
        } catch (Throwable th2) {
            th = th2;
            TryCatchGuardChecker.doCheck(th);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("fetch template exception: ");
            sbLIZ2.append(c21322518cR.LIZIZ);
            sbLIZ2.append(' ');
            sbLIZ2.append(th.getMessage());
            sbLIZ2.append(",content:");
            if (c21323218cYLIZIZ != null) {
                str = c21323218cYLIZIZ.LIZ;
            } else {
                str = null;
            }
            sbLIZ2.append(str);
            sbLIZ2.append(' ');
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            if (abstractC21321718cJ != null) {
                String str12 = c21322518cR.LIZJ;
                String str13 = c21322518cR.LIZIZ;
                if (c21323218cYLIZIZ != null && (c21322818cU = c21323218cYLIZIZ.LJ) != null) {
                    str3 = c21322818cU.LIZ;
                } else {
                    str3 = null;
                }
                abstractC21321718cJ.LIZJ(7003, str12, str13, str3, strLIZIZ2);
            }
            if (z) {
                new C1338670kwL(EnumC1325870kbh.PRELOAD_ERROR, 7003, strLIZIZ2, null, 24).LIZJ(C21323718cd.LIZ(c21322518cR));
            }
            if (c21323218cYLIZIZ != null && (str2 = c21323218cYLIZIZ.LIZ) != null && (chLJLLJ = C13LN.LJLLJ(0, str2)) != null && chLJLLJ.charValue() == '{') {
                C1325860kbg.LJFF(th, strLIZIZ2);
            }
            return LIZ(c21322518cR, null, null);
        }
    }

    public static void LJI(final String str, final Context context, final MynaGeckoChannelPreloadInfo mynaGeckoChannelPreloadInfo, boolean z, final AbstractC21321718cJ abstractC21321718cJ) {
        C1168400gVi.LIZ(AFwS278S0000000_32.get$arr$(190));
        InterfaceC1540190qBN interfaceC1540190qBNLIZLLL = LIZLLL(str);
        if (interfaceC1540190qBNLIZLLL == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("preloadMynaContainer, forest not registered for ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (abstractC21321718cJ != null) {
                abstractC21321718cJ.LIZIZ(7000, "", "", strLIZIZ);
            }
            new C1338670kwL(EnumC1325870kbh.PRELOAD_ERROR, 7000, strLIZIZ, null, 24).LIZJ(C2097608Jq.LJ());
            return;
        }
        LIZJ.execute(new RunnableC21321818cK(mynaGeckoChannelPreloadInfo, str, new AbstractC21321718cJ() { // from class: X.18cI
            /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
            /* JADX WARN: Removed duplicated region for block: B:26:0x005c A[PHI: r4
              0x005c: PHI (r4v4 com.tiktok.myna.preload.MynaTemplatePreloadInfo) = (r4v2 com.tiktok.myna.preload.MynaTemplatePreloadInfo), (r4v8 com.tiktok.myna.preload.MynaTemplatePreloadInfo) binds: [B:25:0x005a, B:15:0x0035] A[DONT_GENERATE, DONT_INLINE]] */
            @Override // X.AbstractC21321718cJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void LIZJ(int r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
                /*
                    Method dump skipped, instruction units count: 297
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21321618cI.LIZJ(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
            }
        }, interfaceC1540190qBNLIZLLL, z));
    }
}
