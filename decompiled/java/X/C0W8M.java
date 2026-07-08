package X;

import Y.ARunnableS82S0200000_13;
import com.bytedance.helios.network.ttnet.MatchExpr;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.pumbaa.utility.worker.PumbaaWorkerThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0W8M, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0W8M {
    public static final ConcurrentHashMap<String, List<MatchExpr>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Set<String>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Pattern> LIZJ = new ConcurrentHashMap<>();

    public static void LIZ() {
        HashSet hashSet = new HashSet();
        ConcurrentHashMap<String, Set<String>> concurrentHashMap = LIZIZ;
        concurrentHashMap.put("RiskInfoInterceptor", hashSet);
        concurrentHashMap.put("RegionParamInterceptor", new HashSet());
        concurrentHashMap.put("RiskInfoInterceptor", new HashSet());
        HashSet hashSet2 = new HashSet();
        hashSet2.add("support_webview");
        hashSet2.add("interstitial_token");
        concurrentHashMap.put("AccountRetrofitInetcept", hashSet2);
        concurrentHashMap.put("RiskInfoInterceptor", new HashSet());
        HashSet hashSet3 = new HashSet();
        hashSet3.add("x-tt-bypass-dp");
        hashSet3.add("x-tt-passport-csrf-token");
        hashSet3.add("device_redirect_info");
        concurrentHashMap.put("account/TTPInterceptorWrapper", hashSet3);
        HashSet hashSet4 = new HashSet();
        hashSet4.add("origin");
        hashSet4.add("shoot_way");
        hashSet4.add("video_duration");
        hashSet4.add("enter_from");
        hashSet4.add("enter_way");
        concurrentHashMap.put("SamiRequestInterceptor", hashSet4);
    }

    public static void LIZIZ() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MatchExpr(2, new String[]{"/wallet/v1/user"}, 0, true));
        ConcurrentHashMap<String, List<MatchExpr>> concurrentHashMap = LIZ;
        concurrentHashMap.put("RiskInfoInterceptor", arrayList);
        concurrentHashMap.put("RegionParamInterceptor", new ArrayList());
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new MatchExpr(2, new String[]{"/wallet/v1/user", "/credit/v1/"}, 0, true));
        concurrentHashMap.put("RiskInfoInterceptor", arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new MatchExpr(2, new String[]{".*/passport/.*"}, 3, true));
        concurrentHashMap.put("AccountRetrofitInetcept", arrayList3);
        ArrayList arrayList4 = new ArrayList();
        arrayList4.add(new MatchExpr(2, new String[]{"/wallet/v1/user", "/credit/v1/"}, 0, true));
        concurrentHashMap.put("RiskInfoInterceptor", arrayList4);
        ArrayList arrayList5 = new ArrayList();
        arrayList5.add(new MatchExpr(2, new String[]{"/captcha/"}, 0, true));
        arrayList5.add(new MatchExpr(2, new String[]{".*/passport/.*", ".*/notify/.*"}, 3, true));
        concurrentHashMap.put("account/TTPInterceptorWrapper", arrayList5);
        ArrayList arrayList6 = new ArrayList();
        arrayList6.add(new MatchExpr(2, new String[]{"/tiktok/v1/voice/conversion/"}, 2, true));
        concurrentHashMap.put("SamiRequestInterceptor", arrayList6);
    }

    static {
        try {
            LIZIZ();
            LIZ();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C823280WRi.LIZLLL(th);
        }
    }

    public static boolean LIZJ(String str, String str2) {
        String host;
        try {
            try {
                URL url = new URL(str2);
                List<MatchExpr> arrayList = LIZ.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                }
                for (MatchExpr matchExpr : arrayList) {
                    int i = matchExpr.scope;
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                return false;
                            }
                            host = url.getPath();
                        } else {
                            host = url.getHost();
                        }
                    } else {
                        host = str2;
                    }
                    int i2 = matchExpr.match;
                    if (i2 != 0) {
                        if (i2 != 1) {
                            if (i2 != 2) {
                                if (i2 != 3) {
                                    return false;
                                }
                                for (String str3 : matchExpr.exprs) {
                                    ConcurrentHashMap<String, Pattern> concurrentHashMap = LIZJ;
                                    Pattern patternCompile = concurrentHashMap.get(str3);
                                    if (patternCompile == null) {
                                        patternCompile = PatternProtector.compile(str3);
                                        concurrentHashMap.put(str3, patternCompile);
                                    }
                                    if (patternCompile.matcher(host).matches()) {
                                        return true;
                                    }
                                }
                            } else {
                                for (String str4 : matchExpr.exprs) {
                                    if (host.equals(str4)) {
                                        return true;
                                    }
                                }
                            }
                        } else {
                            for (String str5 : matchExpr.exprs) {
                                if (host.endsWith(str5)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        for (String str6 : matchExpr.exprs) {
                            if (host.startsWith(str6)) {
                                return true;
                            }
                        }
                    }
                }
                return false;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return false;
            }
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C786410Ut5.LJJZZIII(PumbaaWorkerThread.getHandler(), new ARunnableS82S0200000_13(e2, new Throwable(), 101));
            return true;
        }
    }
}
