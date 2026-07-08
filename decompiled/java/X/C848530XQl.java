package X;

import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ectracker.EcTrackerFilterConfig;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.text.Charsets;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848530XQl {
    public static final C848530XQl LIZ = new C848530XQl();

    public static JSONObject LIZ(View view, JSONObject jSONObject) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        List<C2211641BhC> pageRecordChain;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2;
        JSONObject jSONObject2;
        long jLongValue;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3;
        boolean z;
        boolean zContains;
        boolean z2;
        Object objOpt;
        boolean z3;
        boolean z4;
        String name;
        boolean z5;
        boolean zContains2;
        boolean z6;
        ConcurrentHashMap<String, String> concurrentHashMap;
        String str;
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4;
        boolean z7;
        String name2;
        boolean z8;
        String name3;
        try {
            if (!C848520XQk.LIZ().sdkSwitch) {
                return jSONObject;
            }
            if (jSONObject != null) {
                jSONObject.length();
            }
            String name4 = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                String name5 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name3 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name3 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name5, name3, z8);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            List<C2211641BhC> pageRecordChain2 = ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getPageRecordChain(false);
            if (view != null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4 != null) {
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    String name6 = ILogDependencyService.class.getName();
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4 != null) {
                        name2 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4.getClass().getName();
                    } else {
                        name2 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name6, name2, z7);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                }
                pageRecordChain = ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin4).getPageRecordChain(view, false);
                if (pageRecordChain == null) {
                    pageRecordChain = pageRecordChain2;
                }
            } else {
                pageRecordChain = pageRecordChain2;
            }
            if (!pageRecordChain.isEmpty()) {
                pageRecordChain2 = pageRecordChain;
            }
            if (pageRecordChain2.isEmpty()) {
                Objects.toString(view);
                return jSONObject;
            }
            List<EcTrackerFilterConfig> list = C848520XQk.LIZ().filterConfigs;
            JSONObject jSONObject3 = new JSONObject();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            ArrayList arrayList = new ArrayList();
            for (C2211641BhC c2211641BhC : pageRecordChain2) {
                for (EcTrackerFilterConfig ecTrackerFilterConfig : list) {
                    List<String> list2 = ecTrackerFilterConfig.btmFilter;
                    String str2 = ecTrackerFilterConfig.key;
                    if (str2 == null) {
                        str2 = "";
                    }
                    String strLIZIZ = c2211641BhC.LIZIZ();
                    if (list2 == null || list2.isEmpty()) {
                        z5 = true;
                    } else {
                        z5 = false;
                    }
                    if (z5) {
                        zContains2 = true;
                    } else {
                        zContains2 = list2.contains(strLIZIZ);
                    }
                    if (zContains2) {
                        if (str2.length() <= 0) {
                            z6 = false;
                        } else {
                            z6 = true;
                        }
                        if (z6 && (concurrentHashMap = c2211641BhC.LJJJ) != null && (str = concurrentHashMap.get(str2)) != null) {
                            if (jSONObject3.has(str2)) {
                                linkedHashSet.add(str2);
                                arrayList.add(c2211641BhC.LIZIZ());
                            } else {
                                jSONObject3.put(str2, str);
                            }
                        }
                    }
                }
            }
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                String name7 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 != null) {
                    name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name7, name, z4);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            Pair<Boolean, Boolean> bDBTMReplaceSwitch = ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin2).getBDBTMReplaceSwitch();
            boolean zBooleanValue = bDBTMReplaceSwitch.getFirst().booleanValue();
            boolean zBooleanValue2 = bDBTMReplaceSwitch.getSecond().booleanValue();
            if (zBooleanValue) {
                JSONObject jSONObject4 = new JSONObject();
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3 = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String name8 = ILogDependencyService.class.getName();
                    if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3 != null) {
                        name4 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime4, 1, name8, name4, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                }
                for (C443120HZe<String, String, JSONObject> c443120HZe : ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin3).getBDBTMList(view)) {
                    c443120HZe.getFirst();
                    String second = c443120HZe.getSecond();
                    JSONObject third = c443120HZe.getThird();
                    for (EcTrackerFilterConfig ecTrackerFilterConfig2 : list) {
                        List<String> list3 = ecTrackerFilterConfig2.btmFilter;
                        String str3 = ecTrackerFilterConfig2.key;
                        if (str3 == null) {
                            str3 = "";
                        }
                        if (list3 == null || list3.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (z) {
                            zContains = true;
                        } else {
                            zContains = list3.contains(second);
                        }
                        if (zContains) {
                            if (str3.length() <= 0) {
                                z2 = false;
                            } else {
                                z2 = true;
                            }
                            if (z2 && third != null && (objOpt = third.opt(str3)) != null && !jSONObject4.has(str3)) {
                                jSONObject4.put(str3, objOpt);
                            }
                        }
                    }
                }
                if (jSONObject3.length() > 0 || jSONObject4.length() > 0) {
                    C1507790pL7 c1507790pL7 = C1507790pL7.LIZ;
                    JSONObject jSONObject5 = new JSONObject();
                    jSONObject5.putOpt("tt_params", jSONObject3);
                    jSONObject5.putOpt("bd_params", jSONObject4);
                    jSONObject5.putOpt("type", "append_entrance_info");
                    c1507790pL7.getClass();
                    C1507790pL7.LIZLLL("btm_tt_switch_to_bd_diff", jSONObject5);
                }
                if (zBooleanValue2) {
                    jSONObject3 = jSONObject4;
                }
            }
            JSONObject[] jSONObjectArr = new JSONObject[2];
            jSONObjectArr[0] = jSONObject3;
            if (jSONObject != null) {
                jSONObject2 = jSONObject;
            } else {
                jSONObject2 = new JSONObject();
            }
            jSONObjectArr[1] = jSONObject2;
            JSONObject jSONObject6 = new JSONObject();
            for (int i = 0; i < 2; i++) {
                JSONObject jSONObject7 = jSONObjectArr[i];
                if (jSONObject7 != null) {
                    try {
                        Iterator<String> itKeys = jSONObject7.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            jSONObject6.put(next, jSONObject7.get(next));
                        }
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            }
            linkedHashSet.size();
            if (C848520XQk.LIZ().enableErrorReport) {
                String strJ3 = C786410Ut5.J3(jSONObject3);
                Charset charset = Charsets.UTF_8;
                strJ3.getBytes(charset);
                int length = C786410Ut5.J3(jSONObject6).getBytes(charset).length;
                Long l = C848520XQk.LIZ().totalLargeReportSize;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = Long.MAX_VALUE;
                }
                int i2 = (length > jLongValue ? 1 : (length == jLongValue ? 0 : -1));
            }
            if (jSONObject6.length() == 0) {
                return jSONObject;
            }
            return jSONObject6;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            Log.getStackTraceString(th);
            return jSONObject;
        }
    }

    public static String LIZIZ(C848530XQl c848530XQl, View view, String str) {
        JSONObject jSONObject;
        c848530XQl.getClass();
        try {
            if (C848520XQk.LIZ().sdkSwitch) {
                if (str == null) {
                    jSONObject = null;
                } else {
                    jSONObject = new JSONObject(str);
                }
                str = String.valueOf(LIZ(view, jSONObject));
                return str;
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            Log.getStackTraceString(th);
        }
        return str;
    }
}
