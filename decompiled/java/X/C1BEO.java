package X;

import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/* JADX INFO: renamed from: X.1BEO, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BEO {
    public static Map<String, String> LIZ(String str, boolean z) {
        boolean z2;
        C1BEQ c1beq;
        String host;
        List<String> list;
        HashSet hashSet;
        Map<String, String> mapEmptyMap;
        String strLIZ;
        String strLIZ2;
        if (C1BE8.LIZIZ().LIZ) {
            C1BE8 c1be8LIZIZ = C1BE8.LIZIZ();
            if (c1be8LIZIZ.LIZ && c1be8LIZIZ.LIZJ.LIZ) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                return Collections.emptyMap();
            }
            C1BE6 c1be6 = (C1BE6) ((ConcurrentHashMap) C1BE8.LIZIZ().LIZLLL.LIZ).get("c2s");
            if ((c1be6 instanceof C1BEN) && (c1beq = ((C1BEN) c1be6).LIZIZ) != null) {
                try {
                    host = UriProtector.parse(str).getHost();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    host = null;
                }
                if (!TextUtils.isEmpty(host) && c1beq.LIZ) {
                    if (c1beq.LJFF == null) {
                        c1beq.LJFF = new ArrayList();
                    }
                    if (!((ArrayList) c1beq.LJFF).contains(host)) {
                        AbstractC2201681BEw abstractC2201681BEw = c1beq.LJI;
                        ArrayList<String> arrayList = new ArrayList();
                        if (z) {
                            list = c1beq.LIZLLL;
                        } else {
                            list = c1beq.LJ;
                        }
                        if (list != null) {
                            hashSet = new HashSet(list);
                        } else {
                            hashSet = new HashSet();
                        }
                        Set<String> set = hashSet;
                        if (Build.VERSION.SDK_INT >= 24) {
                            set = (Set) hashSet.stream().filter(new Predicate<String>() { // from class: X.07zi
                                @Override // java.util.function.Predicate
                                public final boolean test(String str2) {
                                    return !TextUtils.isEmpty(str2);
                                }
                            }).collect(Collectors.toSet());
                        }
                        for (String str2 : set) {
                            if (str.contains(str2)) {
                                arrayList.add(str2);
                            }
                        }
                        if (abstractC2201681BEw != null) {
                            String strValueOf = String.valueOf(System.currentTimeMillis());
                            HashMap map = new HashMap();
                            if (arrayList.isEmpty()) {
                                map.put("[ss_random]", String.valueOf(new Random().nextLong()));
                                map.put("[ss_timestamp]", strValueOf);
                                mapEmptyMap = map;
                            } else {
                                for (String str3 : arrayList) {
                                    try {
                                        if (!TextUtils.equals("__TS__", str3) && !TextUtils.equals("{TS}", str3)) {
                                            if ((TextUtils.equals("__ANDROIDID__", str3) || TextUtils.equals("{ANDROIDID}", str3)) && !TextUtils.isEmpty("")) {
                                                String strLIZIZ = C08F0.LIZIZ();
                                                if (!TextUtils.isEmpty(strLIZIZ)) {
                                                    map.put(str3, strLIZIZ);
                                                }
                                            } else if ((TextUtils.equals("__ANDROIDID1__", str3) || TextUtils.equals("{ANDROIDID1}", str3)) && !TextUtils.isEmpty("")) {
                                                map.put(str3, "");
                                            } else if ((TextUtils.equals("__AAID__", str3) || TextUtils.equals("{AAID}", str3)) && !TextUtils.isEmpty("")) {
                                                map.put(str3, "");
                                            } else if ((TextUtils.equals("__OPENUDID__", str3) || TextUtils.equals("{OPENUDID}", str3)) && !TextUtils.isEmpty("")) {
                                                map.put(str3, "");
                                            } else if ((TextUtils.equals("__OS__", str3) || TextUtils.equals("{OS}", str3)) && !TextUtils.isEmpty(CardStruct.IStatusCode.DEFAULT)) {
                                                map.put(str3, CardStruct.IStatusCode.DEFAULT);
                                            } else if ((TextUtils.equals("__IP__", str3) || TextUtils.equals("{IP}", str3)) && !TextUtils.isEmpty("")) {
                                                map.put(str3, "");
                                            } else {
                                                if (TextUtils.equals("__UA__", str3) || TextUtils.equals("{UA}", str3)) {
                                                    AbstractC2201671BEv abstractC2201671BEv = C1BE8.LIZIZ().LJII;
                                                    if (abstractC2201671BEv == null) {
                                                        strLIZ = "";
                                                    } else {
                                                        strLIZ = abstractC2201671BEv.LIZ();
                                                    }
                                                    if (!TextUtils.isEmpty(strLIZ)) {
                                                        AbstractC2201671BEv abstractC2201671BEv2 = C1BE8.LIZIZ().LJII;
                                                        if (abstractC2201671BEv2 == null) {
                                                            strLIZ2 = "";
                                                        } else {
                                                            strLIZ2 = abstractC2201671BEv2.LIZ();
                                                        }
                                                        String strLIZ3 = C08F0.LIZ(strLIZ2);
                                                        if (!TextUtils.isEmpty(strLIZ3)) {
                                                            try {
                                                                strLIZ3 = URLEncoder.encode(strLIZ3, "UTF-8");
                                                            } catch (Throwable th) {
                                                                TryCatchGuardChecker.doCheck(th);
                                                            }
                                                        }
                                                        if (!TextUtils.isEmpty(strLIZ3)) {
                                                            map.put(str3, strLIZ3);
                                                        }
                                                    }
                                                }
                                                if ((TextUtils.equals("__UOO__", str3) || TextUtils.equals("{UOO}", str3)) && !TextUtils.isEmpty("")) {
                                                    map.put(str3, "");
                                                } else if ((TextUtils.equals("__DEVICE_ID__", str3) || TextUtils.equals("{DEVICE_ID}", str3)) && !TextUtils.isEmpty("")) {
                                                    map.put(str3, "");
                                                } else if (TextUtils.equals("__OS_STR__", str3) || TextUtils.equals("{OS_STR}", str3)) {
                                                    if (!TextUtils.isEmpty("Android")) {
                                                        map.put(str3, "Android");
                                                    }
                                                }
                                            }
                                        } else {
                                            map.put(str3, strValueOf);
                                        }
                                    } catch (Throwable th2) {
                                        TryCatchGuardChecker.doCheck(th2);
                                    }
                                }
                                map.put("[ss_random]", String.valueOf(new Random().nextLong()));
                                map.put("[ss_timestamp]", strValueOf);
                                mapEmptyMap = map;
                            }
                        } else {
                            mapEmptyMap = Collections.emptyMap();
                        }
                        arrayList.removeAll(mapEmptyMap.keySet());
                        return mapEmptyMap;
                    }
                }
                Object[] objArr = new Object[1];
                if (host == null) {
                    host = "";
                }
                objArr[0] = host;
                C786410Ut5.j4("host is empty or c2s tracker disabled or host[%s]'s macro replacement is forbidden", objArr);
                return Collections.emptyMap();
            }
            IllegalStateException illegalStateException = new IllegalStateException("c2s Tracker has not finished initializing yet");
            illegalStateException.getMessage();
            throw illegalStateException;
        }
        IllegalStateException illegalStateException2 = new IllegalStateException("SDK has not been initialized");
        illegalStateException2.getMessage();
        throw illegalStateException2;
    }
}
