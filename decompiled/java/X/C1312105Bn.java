package X;

import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.ecommerce.search.utils.SignalMonitor;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Bn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.utils.SignalMonitor$init$2", f = "SignalMonitor.kt", l = {}, m = "invokeSuspend")
public final class C1312105Bn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1312105Bn(InterfaceC1364105Vn<? super C1312105Bn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1312105Bn(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        C1C7U.LIZ("SignalMonitor@2a82.init$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        SignalMonitor.LIZ.getClass();
        Map<String, ?> all = SignalMonitor.LJFF.getAll();
        if (all != null) {
            for (Map.Entry<String, ?> entry : all.entrySet()) {
                String key = entry.getKey();
                try {
                    if (CastLongProtector.parseLong(SignalMonitor.LIZJ) - CastLongProtector.parseLong(key) > 604800000) {
                        SignalMonitor.LJFF.erase(key);
                    } else {
                        ConcurrentHashMap<String, Map<String, SignalMonitor.SignalRecord>> concurrentHashMap = SignalMonitor.LJ;
                        C1227904rF c1227904rF = C1227904rF.LIZ;
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            str = (String) value;
                        } else {
                            str = null;
                        }
                        Type type = new TypeToken<Map<String, ? extends SignalMonitor.SignalRecord>>() { // from class: X.04Zm
                        }.getType();
                        c1227904rF.getClass();
                        concurrentHashMap.put(key, (Map<String, SignalMonitor.SignalRecord>) C1227904rF.LIZJ(str, type));
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    SignalMonitor.LJFF.erase(key);
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignalMonitor@2a82.init$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1312105Bn(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
