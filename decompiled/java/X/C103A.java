package X;

import Y.AfS172S0100000_3;
import Y.AfS53S1100000_28;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.tiktok.tpsc.core.render.TPSCRenderManager;
import com.ss.android.ugc.tiktok.tpsc.privacy.business.configurable.model.PrivacyPageConfigModel;
import com.ss.android.ugc.tiktok.tpsc.privacy.unifiedconfig.PrivacyUnifiedConfigResponse;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS572S0100000_28;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.103A, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C103A {
    public static final Map<String, PrivacyPageConfigModel> LIZ = new LinkedHashMap();
    public static final BPEAHandler LIZIZ = new BPEAHandler(Looper.getMainLooper());

    public static void LIZ() {
        Map<String, PrivacyPageConfigModel> map = LIZ;
        if (map.isEmpty()) {
            C103F.LIZ.getClass();
            if (C103D.LIZIZ.length() == 0) {
                C103D.LIZIZ = C103D.LIZ.getString("unified_page_config");
            }
            map.putAll(LIZIZ(C103D.LIZIZ));
        }
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            TPSCRenderManager tPSCRenderManager = TPSCRenderManager.LIZ;
            String str = (String) entry.getKey();
            AwS572S0100000_28 awS572S0100000_28 = new AwS572S0100000_28(entry, (Map.Entry<String, PrivacyPageConfigModel>) 870);
            tPSCRenderManager.getClass();
            TPSCRenderManager.LIZ(str, awS572S0100000_28);
        }
    }

    public static Map LIZIZ(String str) {
        Map mapLJ;
        try {
            mapLJ = (Map) C1703730uR9.LIZ().LJIIIIZZ(str, new TypeToken<Map<String, ? extends PrivacyPageConfigModel>>() { // from class: X.080f
            }.getType());
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            mapLJ = C2097608Jq.LJ();
        }
        if (mapLJ == null) {
            return C2097608Jq.LJ();
        }
        return mapLJ;
    }

    public static void LIZJ(final String str, String str2, Function0 function0, Function0 function02) {
        boolean zLJI = MethodIDManager.LJI(137335);
        C103F c103f = C103F.LIZ;
        final AwS582S0100000_3 awS582S0100000_3 = new AwS582S0100000_3(function0, (Function0<Unit>) 134);
        final AwS582S0100000_3 awS582S0100000_32 = new AwS582S0100000_3(function02, (Function0<Unit>) 135);
        c103f.getClass();
        boolean zLJI2 = MethodIDManager.LJI(137339);
        InterfaceC1518570pcV interfaceC1518570pcVLIZLLL = C100C.LIZ.LIZLLL();
        if (interfaceC1518570pcVLIZLLL.LIZLLL()) {
            InterfaceC1518350pc9 interfaceC1518350pc9LIZIZ = new InterfaceC1518350pc9<PrivacyUnifiedConfigResponse>() { // from class: X.103B
                @Override // X.InterfaceC1518350pc9
                public final void LIZ(C1518330pc7<PrivacyUnifiedConfigResponse> c1518330pc7) {
                    String configs = c1518330pc7.LIZ.getConfigs();
                    if (configs == null) {
                        configs = "";
                    }
                    if (configs.length() == 0) {
                        Function1<Throwable, Unit> function1 = awS582S0100000_32;
                        if (function1 != null) {
                            function1.invoke(new IllegalStateException("unified config is empty"));
                            return;
                        }
                        return;
                    }
                    if (str == null && !Intrinsics.LJFF(configs, C103D.LIZIZ)) {
                        C103D.LIZIZ = configs;
                        C103D.LIZ.putString("unified_page_config", configs);
                    }
                    Function1<String, Unit> function12 = awS582S0100000_3;
                    if (function12 != null) {
                        function12.invoke(configs);
                    }
                    C103F.LIZ.getClass();
                    Iterator<InterfaceC989510brB<Unit>> it2 = C103F.LIZIZ.iterator();
                    while (it2.hasNext()) {
                        it2.next().LLZZLLIL(Unit.LIZ);
                    }
                }

                @Override // X.InterfaceC1518350pc9
                public final void onError(Throwable th) {
                    Function1<Throwable, Unit> function1 = awS582S0100000_32;
                    if (function1 != null) {
                        function1.invoke(th);
                    }
                }
            };
            Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("scenario", str2), new Pair("report_to_tea", "true"));
            InterfaceC1888940zFs interfaceC1888940zFsLIZJ = C191871104n.LIZJ();
            if (interfaceC1888940zFsLIZJ != null) {
                interfaceC1518350pc9LIZIZ = interfaceC1888940zFsLIZJ.LIZIZ(interfaceC1518350pc9LIZIZ, "/tiktok/privacy/unified_config/v1", mapLJIIIIZZ);
            }
            C1518410pcF c1518410pcFLIZIZ = interfaceC1518570pcVLIZLLL.LIZIZ();
            C1518500pcO c1518500pcO = new C1518500pcO("/tiktok/privacy/unified_config/v1", null);
            if (str != null) {
                c1518500pcO.LIZLLL.put("page_tag", str);
            }
            c1518410pcFLIZIZ.LIZ(c1518500pcO.LIZ(), PrivacyUnifiedConfigResponse.class, false, interfaceC1518350pc9LIZIZ);
        } else {
            boolean zLJI3 = MethodIDManager.LJI(137674);
            C11NZ c11nzLIZIZ = C1888930zFr.LIZIZ(((C103C) C103E.LIZ.getValue()).LIZ(str), "/tiktok/privacy/unified_config/v1", C2097608Jq.LJIIIIZZ(new Pair("scenario", str2), new Pair("report_to_tea", "true")));
            if (zLJI3) {
                MethodIDManager.LJ();
            }
            c11nzLIZIZ.LJL(C11S5.LIZ()).LJJJLZIJ(C11S5.LIZ()).LJJLL(new AfS53S1100000_28(awS582S0100000_3, str, 0), new AfS172S0100000_3((Object) awS582S0100000_32, 0));
        }
        if (zLJI2) {
            MethodIDManager.LJ();
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
