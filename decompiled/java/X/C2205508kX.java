package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.affinity.AffinityEvent;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08kX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.affinity.AffinityFeatureManager$startFeatureCollect$1", f = "AffinityAggregationManager.kt", l = {}, m = "invokeSuspend")
public final class C2205508kX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C2205508kX(InterfaceC1364105Vn<? super C2205508kX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2205508kX(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        List list;
        C1C7U.LIZ("AffinityFeatureManager@ac19.startFeatureCollect$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2204308kL.LIZ.getClass();
        try {
            list = (List) C2204308kL.LIZJ.LJIIIIZZ(C2204308kL.LIZ().getString("affinity_feature", ""), new TypeToken<List<? extends AffinityEvent>>() { // from class: X.08kY
            }.getType());
            if (list == null) {
                list = C13BV.INSTANCE;
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            list = C13BV.INSTANCE;
        }
        C2205908kb c2205908kb = C2205908kb.LIZ;
        C2205908kb.LJ = new CopyOnWriteArrayList<>(list);
        C2204308kL.LIZ.getClass();
        C2204308kL.LIZ().storeString("affinity_feature", "");
        if (!list.isEmpty()) {
            C2205908kb.LIZ.LIZJ(null, "cold_start");
            C2205908kb.LJ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AffinityFeatureManager@ac19.startFeatureCollect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2205508kX(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
