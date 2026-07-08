package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.search.utils.SignalMonitor;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Bo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.search.utils.SignalMonitor$collect$3", f = "SignalMonitor.kt", l = {}, m = "invokeSuspend")
public final class C1312205Bo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1312205Bo(InterfaceC1364105Vn<? super C1312205Bo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1312205Bo(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SignalMonitor@2a82.collect$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            Keva keva = SignalMonitor.LJFF;
            String str = SignalMonitor.LIZJ;
            C1227904rF c1227904rF = C1227904rF.LIZ;
            Map<String, SignalMonitor.SignalRecord> map = SignalMonitor.LIZLLL;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                if (C1312305Bp.LIZ.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            c1227904rF.getClass();
            keva.storeString(str, C1227904rF.LJI(linkedHashMap));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignalMonitor@2a82.collect$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1312205Bo(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
