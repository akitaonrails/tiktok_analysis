package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.pipo.probe.ProbeService;
import com.ss.android.ugc.aweme.pipo.probe.ab.PipoProbeFallbackConfigSettings;
import com.ss.android.ugc.aweme.pipo.probe.ab.PipoProbeSdkConfigSettings;
import com.ss.android.ugc.aweme.pipo.probe.core.infocollect.pitaya.ProbePitayaFieldCollector;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.147z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C202153147z {
    public static final C202153147z LIZ = new C202153147z();

    public static Object LIZIZ(C00EM c00em) {
        Unit unit;
        PipoProbeFallbackConfigSettings.EntranceAppList next;
        boolean z;
        String str;
        PipoProbeFallbackConfigSettings.EntranceAppList next2;
        if (!c00em.LIZIZ.LIZ) {
            return C2097908Jt.LIZJ(new Pair("applist", C2097608Jq.LJ()));
        }
        ArrayList<C0XJX> arrayList = new ArrayList();
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoProbeFallbackConfigSettings.PipoProbeFallbackConfigModel pipoProbeFallbackConfigModel = PipoProbeFallbackConfigSettings.LIZ;
        PipoProbeFallbackConfigSettings.PipoProbeFallbackConfigModel pipoProbeFallbackConfigModel2 = (PipoProbeFallbackConfigSettings.PipoProbeFallbackConfigModel) settingsManagerLIZLLL.LJIIIIZZ("pipo_probe_fallback_config", PipoProbeFallbackConfigSettings.PipoProbeFallbackConfigModel.class, pipoProbeFallbackConfigModel);
        if (pipoProbeFallbackConfigModel2 != null) {
            pipoProbeFallbackConfigModel = pipoProbeFallbackConfigModel2;
        }
        Iterator<PipoProbeFallbackConfigSettings.EntranceAppList> it2 = pipoProbeFallbackConfigModel.byEntrance.iterator();
        while (true) {
            unit = null;
            if (it2.hasNext()) {
                next = it2.next();
                if (Intrinsics.LJFF(next.entrance, c00em.LIZ)) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PipoProbeFallbackConfigSettings.EntranceAppList entranceAppList = next;
        if (entranceAppList == null) {
            Iterator<PipoProbeFallbackConfigSettings.EntranceAppList> it3 = pipoProbeFallbackConfigModel.byEntrance.iterator();
            while (true) {
                if (it3.hasNext()) {
                    next2 = it3.next();
                    if (Intrinsics.LJFF(next2.entrance, "")) {
                        break;
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            entranceAppList = next2;
        }
        if (entranceAppList != null) {
            try {
                List<PipoProbeFallbackConfigSettings.AppInstallTarget> list = entranceAppList.appList;
                if (list != null) {
                    for (PipoProbeFallbackConfigSettings.AppInstallTarget appInstallTarget : list) {
                        String str2 = appInstallTarget.appName;
                        if (str2.length() <= 0) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            arrayList.add(new C0XJX(str2, appInstallTarget.packageName, appInstallTarget.schema));
                        }
                    }
                    unit = Unit.LIZ;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        C189200o6.m2constructorimpl(unit);
        if (arrayList.isEmpty()) {
            return C2097908Jt.LIZJ(new Pair("applist", C2097608Jq.LJ()));
        }
        String str3 = c00em.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap(arrayList.size());
        for (C0XJX c0xjx : arrayList) {
            boolean zLIZJ = C1716300ulQ.LIZJ(c0xjx.LIZIZ, c0xjx.LIZJ);
            String str4 = c0xjx.LIZ;
            if (zLIZJ) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put(str4, str);
        }
        AnonymousClass0678.LIZ("collect_applist", C2097608Jq.LJIIJ(new Pair("entrance", str3), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "success")));
        return C2097908Jt.LIZJ(new Pair("applist", linkedHashMap));
    }

    public static List LIZLLL(Object obj) {
        if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : (Iterable) obj) {
                if (obj2 instanceof String) {
                    arrayList.add(obj2);
                }
            }
            return arrayList;
        }
        if (obj instanceof Map) {
            Collection collectionValues = ((Map) obj).values();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : collectionValues) {
                if (obj3 instanceof String) {
                    arrayList2.add(obj3);
                }
            }
            return arrayList2;
        }
        return C13BV.INSTANCE;
    }

    public static List LJFF(List... listArr) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (List list : listArr) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                linkedHashSet.add(it2.next());
            }
        }
        return C13LP.LLIIII(linkedHashSet);
    }

    public static HashMap LIZ(String str, String str2) {
        Object obj;
        Map<String, Object> next;
        Object obj2;
        String str3;
        if (str2 == null && (str2 = ProbeService.LJ) == null) {
            str2 = "";
        }
        HashMap mapLJI = C2097608Jq.LJI(new Pair("pitaya", new HashMap()), new Pair("probe_id", str2));
        mapLJI.putAll(ProbeService.LIZLLL);
        try {
            PipoProbeSdkConfigSettings.PipoProbeSdkConfigModel pipoProbeSdkConfigModelLIZ = PipoProbeSdkConfigSettings.LIZ();
            Iterator<Map<String, Object>> it2 = pipoProbeSdkConfigModelLIZ.byEntrance.iterator();
            while (true) {
                obj = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.get("entrance"), str)) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            Map<String, Object> map = next;
            if (map != null) {
                obj2 = map.get("native_fields");
            } else {
                obj2 = null;
            }
            List<String> listLJFF = LJFF(pipoProbeSdkConfigModelLIZ.common.nativeFields, LIZLLL(obj2));
            if (map != null) {
                obj = map.get("pitaya_fields");
            }
            List<String> listLJFF2 = LJFF(pipoProbeSdkConfigModelLIZ.common.pitayaFields, LIZLLL(obj));
            for (String str4 : listLJFF) {
                C202146147s.LIZ.getClass();
                C202152147y c202152147yLIZ = C202146147s.LIZ(str4);
                if (c202152147yLIZ != null) {
                    mapLJI.put(c202152147yLIZ.LIZ, c202152147yLIZ.LIZIZ);
                }
            }
            for (String str5 : listLJFF2) {
                if (str == null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                C202152147y c202152147yLIZ2 = ProbePitayaFieldCollector.LIZ(str3, str5);
                if (c202152147yLIZ2 != null) {
                    Object obj3 = c202152147yLIZ2.LIZIZ;
                    if (obj3 instanceof JSONObject) {
                        Iterator<String> itKeys = ((JSONObject) obj3).keys();
                        while (itKeys.hasNext()) {
                            String next2 = itKeys.next();
                            Object objOpt = ((JSONObject) obj3).opt(next2);
                            if (objOpt != null) {
                                mapLJI.put(next2, objOpt);
                            }
                        }
                    } else {
                        mapLJI.put(c202152147yLIZ2.LIZ, obj3);
                    }
                }
            }
            mapLJI.put("probe_id", str2);
            return mapLJI;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            Pair[] pairArr = new Pair[4];
            String str6 = ProbeService.LJ;
            if (str6 == null) {
                str6 = "";
            }
            pairArr[0] = new Pair("trxn_id", str6);
            if (str == null) {
                str = "";
            }
            pairArr[1] = new Pair("entrance", str);
            pairArr[2] = new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "exception");
            String message = e.getMessage();
            if (message == null) {
                message = "unknown";
            }
            pairArr[3] = new Pair("error", message);
            AnonymousClass0678.LIZ("collect", C2097608Jq.LJIIJ(pairArr));
            return mapLJI;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C604530NnP r12, X.InterfaceC1364105Vn<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof X.AnonymousClass1486
            if (r0 == 0) goto L8c
            r3 = r13
            X.1486 r3 = (X.AnonymousClass1486) r3
            int r2 = r3.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8c
            int r2 = r2 - r1
            r3.LLILLL = r2
        L12:
            java.lang.Object r2 = r3.LL
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r3.LLILLL
            r6 = 1
            if (r0 == 0) goto L7e
            if (r0 != r6) goto L92
            X.C155000ia.LIZIZ(r2)
        L22:
            X.147y r2 = (X.C202152147y) r2
            java.lang.String r5 = "latitude"
            r10 = 2
            java.lang.String r8 = "longitude"
            java.lang.String r9 = "no_access"
            java.lang.String r7 = "permission"
            r4 = 0
            r1 = 3
            java.lang.String r3 = ""
            if (r2 == 0) goto L62
            java.lang.Object r2 = r2.LIZIZ
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto L3b
            if (r2 != 0) goto L56
        L3b:
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r7, r9)
            r1[r4] = r0
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r8, r3)
            r1[r6] = r0
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r5, r3)
            r1[r10] = r0
            java.util.Map r2 = X.C2097608Jq.LJIIIIZZ(r1)
        L56:
            kotlin.Pair r1 = new kotlin.Pair
            java.lang.String r0 = "gps_coordinate"
            r1.<init>(r0, r2)
            java.util.Map r0 = X.C2097908Jt.LIZJ(r1)
            return r0
        L62:
            kotlin.Pair[] r1 = new kotlin.Pair[r1]
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r7, r9)
            r1[r4] = r0
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r8, r3)
            r1[r6] = r0
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r5, r3)
            r1[r10] = r0
            java.util.Map r2 = X.C2097608Jq.LJIIIIZZ(r1)
            goto L56
        L7e:
            X.C155000ia.LIZIZ(r2)
            X.0vLW r0 = X.C1738680vLW.LIZ
            r3.LLILLL = r6
            java.lang.Object r2 = r0.LIZ(r12, r3)
            if (r2 != r1) goto L22
            return r1
        L8c:
            X.1486 r3 = new X.1486
            r3.<init>(r11, r13)
            goto L12
        L92:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C202153147z.LIZJ(X.0NnP, X.05Vn):java.lang.Object");
    }

    public static void LJ(AnonymousClass1489 anonymousClass1489, String str, String str2) {
        HashMap mapLIZ = LIZ(str, str2);
        if (anonymousClass1489.LIZJ == null) {
            anonymousClass1489.LIZJ = new HashMap<>();
        }
        HashMap map = new HashMap();
        HashMap<String, Object> map2 = anonymousClass1489.LIZJ;
        if (map2 != null) {
            map.putAll(map2);
        }
        HashMap<String, Object> map3 = anonymousClass1489.LIZJ;
        if (map3 != null) {
            map3.clear();
        }
        HashMap<String, Object> map4 = anonymousClass1489.LIZJ;
        if (map4 != null) {
            map4.putAll(mapLIZ);
        }
        HashMap<String, Object> map5 = anonymousClass1489.LIZJ;
        if (map5 != null) {
            map5.put("entrance", anonymousClass1489.LIZ);
            String str3 = anonymousClass1489.LIZIZ;
            if (str3 == null) {
                str3 = "_";
            }
            map5.put("event_name", str3);
        }
        HashMap<String, Object> map6 = anonymousClass1489.LIZJ;
        if (map6 != null) {
            map6.putAll(map);
        }
    }
}
