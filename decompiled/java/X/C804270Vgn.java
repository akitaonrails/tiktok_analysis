package X;

import com.bytedance.applog.AppLog;
import com.bytedance.scene.Scene;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Vgn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C804270Vgn extends C09AY implements Function0<Unit> {
    public C804270Vgn() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C804280Vgo.LIZ.getClass();
        C823050WQl.LIZLLL().execute(RunnableC804230Vgj.LL);
        if (C1DS1.LIZJ && !C804320Vgs.LJIIIZ) {
            C804320Vgs.LJIIIZ = true;
            C13BV c13bv = C13BV.INSTANCE;
            C830920Wig c830920Wig = new C830920Wig();
            c830920Wig.LIZIZ = true;
            TTMStrategyCenterManager.asyncRegisterSceneWithSceneKey("perf_bsr_exception_meta_scene", c13bv, c830920Wig.LIZ(), new AbstractC830880Wic() { // from class: X.0Vgm
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                @Override // X.AbstractC830880Wic
                public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) throws JSONException {
                    Map map;
                    Long l;
                    boolean z;
                    Object obj;
                    float f;
                    Map map2;
                    Long l2;
                    String str;
                    Long l3;
                    boolean z2;
                    String str2;
                    long jLongValue;
                    Long l4;
                    Long l5;
                    Long l6;
                    Long l7;
                    String str3;
                    Long l8;
                    Long l9;
                    String str4 = interfaceC805220ViK.LIZLLL().LIZIZ;
                    interfaceC805220ViK.getErrorMessage();
                    Object objLIZJ = interfaceC805220ViK.LIZJ();
                    Long l10 = null;
                    if ((objLIZJ instanceof Map) && (map = (Map) objLIZJ) != null) {
                        boolean z3 = true;
                        if (!map.isEmpty()) {
                            String str5 = "";
                            long jLongValue2 = 0;
                            switch (str4.hashCode()) {
                                case -612686051:
                                    if (str4.equals("perf_bsr_meta_bad_live_push_android")) {
                                        if (!C2214381Blc.LIZ()) {
                                            return;
                                        }
                                        C804240Vgk.LIZ.getClass();
                                        Object obj2 = map.get("meta_status");
                                        if (!(obj2 instanceof Long) || (l = (Long) obj2) == null || l.longValue() != 1) {
                                            return;
                                        }
                                        C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.LIVE, EnumC804170Vgd.LIVE_BROADCAST_ERR, null, 0L, 28));
                                        return;
                                    }
                                    break;
                                case 1098161040:
                                    if (str4.equals("perf_bsr_meta_bad_vv_android")) {
                                        C804320Vgs.LIZ++;
                                        Object obj3 = map.get("meta_status");
                                        if ((obj3 instanceof Long) && (l2 = (Long) obj3) != null && l2.longValue() == 1) {
                                            z = true;
                                        } else {
                                            z = false;
                                        }
                                        Object obj4 = map.get("biz_para");
                                        if ((obj4 instanceof Map) && (map2 = (Map) obj4) != null) {
                                            obj = map2.get("bad_index");
                                        } else {
                                            obj = null;
                                        }
                                        if (obj instanceof Long) {
                                            l10 = (Long) obj;
                                        }
                                        if (z) {
                                            C804320Vgs.LIZIZ++;
                                            if (l10 != null && l10.longValue() < 5) {
                                                C804320Vgs.LIZJ++;
                                            }
                                            if (C804320Vgs.LJFF) {
                                                C804320Vgs.LJ++;
                                            }
                                            C804320Vgs.LJFF = true;
                                        } else {
                                            C804320Vgs.LJ = 0;
                                            C804320Vgs.LJFF = false;
                                        }
                                        if (!C804320Vgs.LIZLLL && C804320Vgs.LIZJ >= ((Number) C1DS1.LJI.getValue()).intValue()) {
                                            C804320Vgs.LIZLLL = true;
                                            C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.FEED_FORYOU_5VV, EnumC804170Vgd.FEED_FORYOU_5VV_BAD, null, 0L, 28));
                                        }
                                        if (C804320Vgs.LJ >= ((Number) C1DS1.LJII.getValue()).intValue()) {
                                            C804290Vgp.LIZ(new C804330Vgt(EnumC805430Vif.VOD, EnumC804170Vgd.VOD_BAD_CONTINUOUS, null, 0L, 28));
                                        }
                                        if (C804320Vgs.LIZ > 0) {
                                            f = (C804320Vgs.LIZIZ / C804320Vgs.LIZ) * 100;
                                        } else {
                                            f = 0.0f;
                                        }
                                        if ((f > C1DS1.LIZLLL() && C804320Vgs.LJI <= C1DS1.LIZLLL()) || (f <= C1DS1.LIZLLL() && C804320Vgs.LJI > C1DS1.LIZLLL())) {
                                            C804320Vgs.LIZ().storeFloat("last_bad_vv_radio", f);
                                            if (!C804320Vgs.LJIIIIZZ) {
                                                C804320Vgs.LIZ().storeString("last_app_session", AppLog.getSessionId());
                                                C804320Vgs.LJIIIIZZ = true;
                                            }
                                        }
                                        C804320Vgs.LJI = f;
                                        return;
                                    }
                                    break;
                                case 1140627843:
                                    if (str4.equals("perf_bsr_meta_bad_live_vv_android")) {
                                        if (!C2214381Blc.LIZ()) {
                                            return;
                                        }
                                        C804240Vgk.LIZ.getClass();
                                        Object obj5 = map.get("meta_status");
                                        if (!(obj5 instanceof Long) || (l3 = (Long) obj5) == null || l3.longValue() != 1) {
                                            z3 = false;
                                        }
                                        Object obj6 = map.get("room_id");
                                        if ((obj6 instanceof String) && (str = (String) obj6) != null) {
                                            str5 = str;
                                        }
                                        C804240Vgk.LIZ(str5, z3);
                                        return;
                                    }
                                    break;
                                case 1403218716:
                                    if (str4.equals("perf_bsr_meta_bad_live_vv_stream_android")) {
                                        if (!C2214381Blc.LIZ()) {
                                            return;
                                        }
                                        C804240Vgk.LIZ.getClass();
                                        Object obj7 = map.get("state");
                                        if ((obj7 instanceof Long) && (l7 = (Long) obj7) != null && l7.longValue() == 1) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        Object obj8 = map.get("room_id");
                                        if (!(obj8 instanceof String) || (str2 = (String) obj8) == null) {
                                            str2 = "";
                                        }
                                        if (z2) {
                                            C804240Vgk.LJII = "";
                                            C804240Vgk.LJIIIIZZ = 0L;
                                            C804240Vgk.LJIIIZ = 0L;
                                            Object obj9 = map.get("meta_status");
                                            if (!(obj9 instanceof Long) || (l6 = (Long) obj9) == null || l6.longValue() != 1) {
                                                z3 = false;
                                            }
                                            C804240Vgk.LIZ(str2, z3);
                                            return;
                                        }
                                        C804240Vgk.LJII = str2;
                                        Object obj10 = map.get("sync_diff_base_count");
                                        if ((obj10 instanceof Long) && (l5 = (Long) obj10) != null) {
                                            jLongValue = l5.longValue();
                                        } else {
                                            jLongValue = 0;
                                        }
                                        C804240Vgk.LJIIIIZZ = jLongValue;
                                        Object obj11 = map.get("sync_diff_count");
                                        if ((obj11 instanceof Long) && (l4 = (Long) obj11) != null) {
                                            jLongValue2 = l4.longValue();
                                        }
                                        C804240Vgk.LJIIIZ = jLongValue2;
                                        return;
                                    }
                                    break;
                            }
                            if (((Boolean) C1DS1.LJJIJ.getValue()).booleanValue()) {
                                Object obj12 = map.get(Scene.SCENE_SERVICE);
                                if ((obj12 instanceof String) && (str3 = (String) obj12) != null) {
                                    Object obj13 = map.get("exception_type");
                                    if ((obj13 instanceof Long) && (l8 = (Long) obj13) != null) {
                                        int iLongValue = (int) l8.longValue();
                                        Object obj14 = map.get("level");
                                        if ((obj14 instanceof Long) && (l9 = (Long) obj14) != null) {
                                            int iLongValue2 = (int) l9.longValue();
                                            EnumC804170Vgd.Companion.getClass();
                                            EnumC804170Vgd[] enumC804170VgdArrValues = EnumC804170Vgd.values();
                                            int length = enumC804170VgdArrValues.length;
                                            int i = 0;
                                            while (true) {
                                                if (i < length) {
                                                    EnumC804170Vgd enumC804170Vgd = enumC804170VgdArrValues[i];
                                                    if (enumC804170Vgd.getValue() == iLongValue) {
                                                        if (C804190Vgf.LIZ[enumC804170Vgd.ordinal()] == 1) {
                                                            String sessionId = AppLog.getSessionId();
                                                            if (sessionId != null) {
                                                                str5 = sessionId;
                                                            }
                                                            ConcurrentHashMap<String, String> concurrentHashMap = C804280Vgo.LJIIL;
                                                            if (concurrentHashMap.containsKey(str3)) {
                                                                if (!Intrinsics.LJFF(concurrentHashMap.get(str3), str5)) {
                                                                    C804290Vgp.LIZIZ(EnumC804170Vgd.ENTER.getValue(), EnumC804300Vgq.NONE.getValue(), str3);
                                                                    return;
                                                                }
                                                                return;
                                                            } else {
                                                                concurrentHashMap.put(str3, str5);
                                                                C804290Vgp.LIZIZ(EnumC804170Vgd.ENTER.getValue(), EnumC804300Vgq.NONE.getValue(), str3);
                                                                return;
                                                            }
                                                        }
                                                    } else {
                                                        i++;
                                                    }
                                                }
                                            }
                                            C804290Vgp.LIZIZ(iLongValue, iLongValue2, str3);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

                @Override // X.AbstractC830880Wic
                public final void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
                    if (interfaceC830890Wid != null && enumC2213771Bkd == EnumC2213771Bkd.TTMStateCodeSuccess) {
                        C804320Vgs.LJII = interfaceC830890Wid;
                    }
                }

                @Override // X.AbstractC830880Wic
                public final TTMParamData LIZIZ(C830870Wib c830870Wib, String str, AnonymousClass1696 anonymousClass1696) {
                    if (Intrinsics.LJFF(str, "perf_bsr_meta_bad_live_vv_stream_android")) {
                        C804240Vgk.LIZ.getClass();
                        return new TTMParamData((Map<String, Object>) C2097608Jq.LJIIIIZZ(new Pair("room_id", C804240Vgk.LJII), new Pair("sync_diff_base_count", Long.valueOf(C804240Vgk.LJIIIIZZ)), new Pair("sync_diff_count", Long.valueOf(C804240Vgk.LJIIIZ))));
                    }
                    return null;
                }
            });
        }
        boolean z = C0VW0.LIZ;
        if (C1DS1.LIZIZ()) {
            C791380V2q c791380V2q = C791380V2q.LIZ;
            C791380V2q.LIZIZ.add(new InterfaceC791370V2p() { // from class: X.0VW2
                @Override // X.InterfaceC791370V2p
                public final void LIZ() {
                }

                @Override // X.InterfaceC791370V2p
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC791370V2p
                public final void LIZJ() {
                }

                @Override // X.InterfaceC791370V2p
                public final void LIZLLL(long j) {
                    if (C0VW0.LIZ && !C0VW0.LIZIZ && j > 0) {
                        if (((Boolean) C1DS1.LJIIZILJ.getValue()).booleanValue()) {
                            C0VW0.LIZJ += j;
                            if (j > ((Number) C1DS1.LJIJI.getValue()).longValue()) {
                                C0VW0.LIZLLL += j;
                                return;
                            }
                            return;
                        }
                        if (!((Boolean) C1DS1.LJIJJLI.getValue()).booleanValue() || j <= ((Number) C1DS1.LJJ.getValue()).longValue()) {
                            return;
                        }
                        C0VW0.LIZIZ = true;
                    }
                }
            });
        }
        C804280Vgo.LJIILIIL = true;
        if (((Boolean) C1DS1.LJJIFFI.getValue()).booleanValue()) {
            C804280Vgo.LIZIZ = AppLog.getSessionId();
            AppLog.addSessionHook(new InterfaceC2211051BgF() { // from class: X.0Vgl
                @Override // X.InterfaceC2211051BgF
                public final void LIZ(String str, long j, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC2211051BgF
                public final void LIZJ(String str, long j, JSONObject jSONObject) {
                }

                @Override // X.InterfaceC2211051BgF
                public final void LIZIZ(long j, String str) {
                    if (!Intrinsics.LJFF(C804280Vgo.LIZIZ, str)) {
                        C804280Vgo.LIZIZ = str;
                        C804280Vgo.LIZ.getClass();
                        C823050WQl.LIZLLL().execute(RunnableC804230Vgj.LL);
                        C804320Vgs.LIZ = 0;
                        C804320Vgs.LIZIZ = 0;
                        C804320Vgs.LJI = 0.0f;
                        C804320Vgs.LJIIIIZZ = false;
                        if (C1DS1.LIZIZ()) {
                            C0VW0.LJ = 0;
                            C0VW0.LJFF = 0;
                            C0VW0.LJIIJ = 0.0f;
                            C0VW0.LJIIJJI = false;
                        }
                        if (C2214381Blc.LIZ()) {
                            C804240Vgk.LIZ.getClass();
                            C804240Vgk.LIZIZ = 0;
                            C804240Vgk.LIZJ = 0;
                            C804240Vgk.LJFF = 0.0f;
                            C804240Vgk.LJI = false;
                        }
                    }
                }
            });
        }
        return Unit.LIZ;
    }
}
