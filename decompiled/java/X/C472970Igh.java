package X;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.os.SystemClock;
import android.util.DisplayMetrics;
import com.bytedance.android.livesdk.comp.api.performance.IPerformanceService;
import com.bytedance.android.livesdk.livesetting.other.LiveAdaptStrategyAddParamsPitayaSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveAdaptStrategyParamsDisableListAnchorSetting;
import com.bytedance.android.livesdk.livesetting.other.LiveAdaptStrategyParamsDisableListAudienceSetting;
import com.bytedance.android.livesdkapi.host.IHostAppContext;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.ttnet.TTNetInit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Igh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C472970Igh {
    public static int LIZJ;
    public static volatile long LJIIL;
    public static volatile long LJIILIIL;
    public static volatile long LJIILJJIL;
    public static volatile long LJIILL;
    public static volatile long LJIILLIIL;
    public static volatile float LJIIZILJ;
    public static volatile int LJIJ;
    public static volatile long LJIJI;
    public static volatile boolean LJIJJ;
    public static volatile boolean LJIJJLI;
    public static String LJIL;
    public static boolean LJJ;
    public static boolean LJJI;
    public static final List<Long> LIZ = new ArrayList();
    public static final List<Long> LIZIZ = new ArrayList();
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(395));
    public static final boolean LJ = LiveAdaptStrategyAddParamsPitayaSetting.INSTANCE.getValue();
    public static final String[] LJFF = LiveAdaptStrategyParamsDisableListAnchorSetting.INSTANCE.getValue();
    public static final String[] LJI = LiveAdaptStrategyParamsDisableListAudienceSetting.INSTANCE.getValue();
    public static final int LJII = 30000;
    public static final int LJIIIIZZ = 30000;
    public static final int LJIIIZ = 30000;
    public static final int LJIIJ = 30000;
    public static final int LJIIJJI = 30000;

    public static void LIZ() {
        Long l = (Long) C19719612Di.LJJIIZI(LIZIZ);
        if (l != null) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - l.longValue();
            ArrayList arrayList = (ArrayList) LIZ;
            if ((!arrayList.isEmpty()) && arrayList.size() >= 5) {
                C19719612Di.LJJIJIIJI(arrayList);
            }
            ListProtector.add(arrayList, 0, Long.valueOf(jElapsedRealtime));
        }
    }

    public static Boolean LIZIZ(Map map, boolean z) {
        if (!LJIIJ("is_charging", z)) {
            return null;
        }
        if (LJIILLIIL == 0 || SystemClock.elapsedRealtime() - LJIILLIIL > LJIIJJI) {
            LJIJJLI = C476230Ilx.LIZ.LJII();
            LJIILLIIL = SystemClock.elapsedRealtime();
        }
        Boolean boolValueOf = Boolean.valueOf(LJIJJLI);
        boolean zBooleanValue = boolValueOf.booleanValue();
        if (map != null) {
            ((HashMap) map).put("is_charging", String.valueOf(zBooleanValue));
        }
        return boolValueOf;
    }

    public static Boolean LIZJ(Map map, boolean z) {
        boolean z2;
        Object objH2 = null;
        if (!LJIIJ("is_local_volume", z)) {
            return null;
        }
        if (LJIILL == 0 || SystemClock.elapsedRealtime() - LJIILL > LJIIJ) {
            LJIILL = SystemClock.elapsedRealtime();
            Context contextLIZ = C176600m4.LIZ();
            if (contextLIZ != null) {
                objH2 = C786410Ut5.H2(contextLIZ, "audio");
            }
            if (objH2 instanceof AudioManager) {
                AudioManager audioManager = (AudioManager) objH2;
                if (!audioManager.isWiredHeadsetOn() && !audioManager.isBluetoothA2dpOn()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                LJIJJ = z2;
            }
        }
        if (map != null) {
            ((HashMap) map).put("is_local_volume", String.valueOf(LJIJJ));
        }
        return Boolean.valueOf(LJIJJ);
    }

    public static Integer LIZLLL(Map map, boolean z) {
        if (!LJIIJ("network_quality", z)) {
            return null;
        }
        if (LJIILIIL == 0 || LJIJ == 0 || SystemClock.elapsedRealtime() - LJIILIIL > LJIIIIZZ) {
            LJIJ = TTNetInit.getEffectiveConnectionType() * 2;
            LJIILIIL = SystemClock.elapsedRealtime();
        }
        Integer numValueOf = Integer.valueOf(LJIJ);
        int iIntValue = numValueOf.intValue();
        if (map != null) {
            ((HashMap) map).put("network_quality", String.valueOf(iIntValue));
        }
        return numValueOf;
    }

    public static Float LJ(Map map, boolean z) {
        if (!LJIIJ("power_rate", z)) {
            return null;
        }
        if (LJIILJJIL == 0 || LJIJI == 0 || SystemClock.elapsedRealtime() - LJIILJJIL > LJIIIZ) {
            LJIJI = ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getPowerRate();
            LJIILJJIL = SystemClock.elapsedRealtime();
        }
        Float fValueOf = Float.valueOf((LJIJI * 1.0f) / 100);
        float fFloatValue = fValueOf.floatValue();
        if (map != null) {
            ((HashMap) map).put("power_rate", String.valueOf(fFloatValue));
        }
        return fValueOf;
    }

    public static Float LJFF(Map map, boolean z) {
        if (!LJIIJ("temperature", z)) {
            return null;
        }
        if (LJIIL == 0 || LJIIZILJ == 0.0f || SystemClock.elapsedRealtime() - LJIIL > LJII) {
            LJIIZILJ = C476230Ilx.LIZ.LJFF();
            LJIIL = SystemClock.elapsedRealtime();
        }
        Float fValueOf = Float.valueOf(LJIIZILJ);
        float fFloatValue = fValueOf.floatValue();
        if (map != null) {
            ((HashMap) map).put("temperature", String.valueOf(fFloatValue));
        }
        return fValueOf;
    }

    public static Float LJI(Map map, boolean z) {
        if (!LJIIJ("volume", z)) {
            return null;
        }
        Float fValueOf = Float.valueOf((float) ((IHostAppContext) C1161920gLG.LIZJ(IHostAppContext.class)).getVolume());
        float fFloatValue = fValueOf.floatValue();
        if (map != null) {
            ((HashMap) map).put("volume", String.valueOf(fFloatValue));
        }
        return fValueOf;
    }

    public static Integer LJII(Map map, boolean z) {
        if (z || !LJIIJ("watch_landscape", z)) {
            return null;
        }
        Integer numValueOf = Integer.valueOf(LIZJ);
        int iIntValue = numValueOf.intValue();
        if (map != null) {
            ((HashMap) map).put("watch_landscape", String.valueOf(iIntValue));
        }
        return numValueOf;
    }

    public static void LJIIIIZZ(Map map, C0IMC c0imc) {
        String str = c0imc.LIZLLL;
        if (str != null && LJIIJ("current_room_live_type", true)) {
            ((HashMap) map).put("current_room_live_type", str);
        }
        String str2 = c0imc.LIZ;
        if (str2 != null && LJIIJ("current_room_enter_from_merge", true)) {
            ((HashMap) map).put("current_room_enter_from_merge", str2);
        }
        String str3 = c0imc.LIZIZ;
        if (str3 != null && LJIIJ("current_room_enter_method", true)) {
            ((HashMap) map).put("current_room_enter_method", str3);
        }
        String str4 = c0imc.LIZJ;
        if (str4 != null && LJIIJ("current_room_action_type", true)) {
            ((HashMap) map).put("current_room_action_type", str4);
        }
    }

    public static String LJIIIZ(Map map, C0IMC c0imc) {
        String str;
        String str2;
        Object value;
        C1101180elI c1101180elI;
        EnumC1101170elH enumC1101170elH;
        C1100750ekb c1100750ekbJM;
        C1101180elI c1101180elI2;
        Map<String, C491530JPj> map2;
        C491530JPj c491530JPj;
        LIZ();
        LJJ = Intrinsics.LJFF(((HashMap) map).get("user_type"), "anchor");
        LJJI = Intrinsics.LJFF(((HashMap) map).get("anchor_anr_opt"), "1");
        HashMap map3 = new HashMap();
        JSONObject jSONObjectLIZIZ = null;
        int iOrdinal = 0;
        if (LJIIJ("past_watch_time", true)) {
            ArrayList arrayList = (ArrayList) LIZ;
            if (!arrayList.isEmpty()) {
                StringBuilder sb = new StringBuilder("");
                int i = 0;
                for (Object obj : arrayList) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        long jLongValue = ((Number) obj).longValue();
                        if (i != 0) {
                            sb.append(";");
                        }
                        sb.append(jLongValue);
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                map3.put("past_watch_time", sb.toString());
            }
        }
        LJI(map3, true);
        LIZJ(map3, true);
        LJII(map3, true);
        LIZLLL(map3, true);
        LJFF(map3, true);
        if (LJIIJ("fps", true) && (c1100750ekbJM = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).jM()) != null && (c1101180elI2 = c1100750ekbJM.LIZ) != null && (map2 = c1101180elI2.LIZJ) != null && (c491530JPj = map2.get("fps")) != null) {
            map3.put("fps", String.valueOf(Float.valueOf(c491530JPj.LIZ).floatValue()));
        }
        if (LJIIJ("exp_level", true)) {
            C1100750ekb c1100750ekbJM2 = ((IPerformanceService) C1161920gLG.LIZJ(IPerformanceService.class)).jM();
            if (c1100750ekbJM2 != null && (c1101180elI = c1100750ekbJM2.LIZ) != null && (enumC1101170elH = c1101180elI.LIZLLL) != null) {
                iOrdinal = enumC1101170elH.ordinal();
            }
            map3.put("exp_level", String.valueOf(Integer.valueOf(iOrdinal).intValue()));
        }
        LJ(map3, true);
        LIZIZ(map3, true);
        if (LJIIJ("language", true) && (value = LIZLLL.getValue()) != null) {
            map3.put("language", value);
        }
        if (LJIIJ("live_play_session_id", true) && (str2 = LJIL) != null) {
            map3.put("live_play_session_id", str2);
        }
        if (LJIIJ("live_session_id", true) && (str = C0IL2.LIZ.LJ) != null) {
            map3.put("live_session_id", str);
        }
        if (LJIIJ("screen_height", true)) {
            DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
            map3.put("screen_height", String.valueOf(Integer.valueOf((int) Math.max((float) Math.ceil(displayMetrics.heightPixels / displayMetrics.density), (float) Math.ceil(displayMetrics.widthPixels / displayMetrics.density))).intValue()));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            if (LJ && !LJJ) {
                if (c0imc != null) {
                    LJIIIIZZ(map3, c0imc);
                }
                InterfaceC472980Igi interfaceC472980Igi = C0ITX.LIZ;
                if (interfaceC472980Igi == null) {
                    C20441214yg.LIZIZ("strategyParamsForEnterRoom", "pitayaCore is null");
                }
                if (interfaceC472980Igi != null) {
                    jSONObjectLIZIZ = interfaceC472980Igi.LIZIZ();
                }
                if (jSONObjectLIZIZ == null) {
                    C20441214yg.LIZIZ("strategyParamsForEnterRoom", "epi params is null");
                }
                if (jSONObjectLIZIZ != null) {
                    JSONObject jSONObject2 = JSONObjectProtectorUtils.getJSONObject(jSONObjectLIZIZ, "epi_features");
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        jSONObject.put(next, jSONObject2.get(next));
                    }
                }
            }
            for (Map.Entry entry : map3.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            for (Map.Entry entry2 : ((HashMap) map).entrySet()) {
                jSONObject.put((String) entry2.getKey(), entry2.getValue());
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        return C786410Ut5.J3(jSONObject);
    }

    public static boolean LJIIJ(String str, boolean z) {
        if (LJJI) {
            return !C13LQ.LJIILLIIL(str, LJFF);
        }
        if (!z) {
            return true;
        }
        if (LJJ && C13LQ.LJIILLIIL(str, LJFF)) {
            return false;
        }
        if (LJJ || !C13LQ.LJIILLIIL(str, LJI)) {
            return true;
        }
        return false;
    }
}
