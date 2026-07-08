package X;

import android.os.Looper;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.rules.EventParamsConfig;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18b5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21314118b5 {
    public static final C21314118b5 LIZ = new C21314118b5();
    public static final Object LIZIZ = new Object();
    public static final Map<String, EventParamsConfig> LIZJ = new LinkedHashMap();
    public static final Map<String, Boolean> LIZLLL = new LinkedHashMap();

    public static EventParamsConfig LIZJ(String str) throws Throwable {
        try {
            C844470XAv.LIZ.getClass();
            InputStream inputStreamOpen = C844470XAv.LIZ().getAssets().open(str);
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamOpen);
                try {
                    C1227904rF c1227904rF = C1227904rF.LIZ;
                    String strLIZJ = C08KC.LIZJ(inputStreamReader);
                    c1227904rF.getClass();
                    EventParamsConfig eventParamsConfig = (EventParamsConfig) C1227904rF.LIZIZ(strLIZJ, EventParamsConfig.class);
                    C2107108Nh.LIZ(inputStreamReader, null);
                    C2107108Nh.LIZ(inputStreamOpen, null);
                    return eventParamsConfig;
                } catch (Throwable th) {
                    th = th;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(inputStreamReader, th);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = null;
                    }
                }
            } catch (Throwable th5) {
                th = th5;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th6) {
                        th = th6;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(inputStreamOpen, th);
                                throw th;
                            } catch (Throwable th7) {
                                th = th7;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    th = th8;
                    th = null;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static final void LIZIZ(String str, EventParamsConfig eventParamsConfig) {
        synchronized (LIZIZ) {
            try {
                LIZJ.put(str, eventParamsConfig);
                LIZLLL.put(str, Boolean.FALSE);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static EventParamsConfig LIZ(EventParamsConfig eventParamsConfig, String str, String str2) {
        try {
            synchronized (LIZIZ) {
                try {
                    EventParamsConfig eventParamsConfig2 = (EventParamsConfig) ((LinkedHashMap) LIZJ).get(str);
                    if (eventParamsConfig2 != null) {
                        return eventParamsConfig2;
                    }
                    Map<String, Boolean> map = LIZLLL;
                    Object obj = ((LinkedHashMap) map).get(str);
                    Boolean bool = Boolean.TRUE;
                    if (Intrinsics.LJFF(obj, bool)) {
                        return eventParamsConfig;
                    }
                    map.put(str, bool);
                    if (Intrinsics.LJFF(Looper.getMainLooper(), Looper.myLooper())) {
                        C086F c086f = C086F.LIZ;
                        C21314718bB c21314718bB = new C21314718bB(eventParamsConfig, str, str2);
                        c086f.getClass();
                        C086F.LJI(c21314718bB);
                        return eventParamsConfig;
                    }
                    EventParamsConfig eventParamsConfigLIZLLL = LIZLLL(eventParamsConfig, str, str2, false);
                    LIZIZ(str, eventParamsConfigLIZLLL);
                    return eventParamsConfigLIZLLL;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Exception th) {
            return eventParamsConfig;
        }
    }

    public static EventParamsConfig LIZLLL(EventParamsConfig eventParamsConfig, String str, String str2, boolean z) {
        Integer num;
        boolean z2;
        try {
            if (!C296990BkX.LIZ()) {
                return eventParamsConfig;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            Integer num2 = eventParamsConfig.configVersion;
            if (num2 != null) {
                C21314018b4 c21314018b4 = C21314018b4.LIZ;
                Long lValueOf = Long.valueOf(jCurrentTimeMillis);
                c21314018b4.getClass();
                C21314018b4.LJFF(true, str, num2, lValueOf, false, z);
                return eventParamsConfig;
            }
            EventParamsConfig eventParamsConfigLIZJ = LIZJ(str2);
            C21314018b4 c21314018b42 = C21314018b4.LIZ;
            Integer num3 = null;
            if (eventParamsConfigLIZJ != null) {
                num = eventParamsConfigLIZJ.configVersion;
            } else {
                num = null;
            }
            Long lValueOf2 = Long.valueOf(jCurrentTimeMillis);
            if (eventParamsConfigLIZJ != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            c21314018b42.getClass();
            C21314018b4.LJFF(false, str, num, lValueOf2, z2, z);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("loadParamsConfigInternal finish: ");
            sbLIZ.append(str);
            sbLIZ.append(", assetConfig: ");
            if (eventParamsConfigLIZJ != null) {
                num3 = eventParamsConfigLIZJ.configVersion;
            }
            sbLIZ.append(num3);
            C2188811AlT.LIZIZ(sbLIZ);
            if (eventParamsConfigLIZJ != null) {
                return eventParamsConfigLIZJ;
            }
            return eventParamsConfig;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return eventParamsConfig;
        }
    }
}
