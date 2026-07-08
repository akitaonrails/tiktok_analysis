package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NUo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.bytedance.android.starship.engine.strategy.processor.FuncProcessor$getFeatureSet$1", f = "FuncProcessor.kt", l = {}, m = "invokeSuspend")
public final class C594800NUo extends C09AX implements InterfaceC1631620sYq<C1307670k8L, List<? extends Object>, InterfaceC1364105Vn<? super Map<String, Object>>, Object> {
    public /* synthetic */ Object LL;

    public C594800NUo(InterfaceC1364105Vn<? super C594800NUo> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iLIZIZ;
        C1C7U.LIZ("FuncProcessor@6723.getFeatureSet$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            if (Intrinsics.LJFF(String.valueOf(C13LP.LJJJJZI((List) this.LL)), "photo_memory_runtime_set")) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                if (System.currentTimeMillis() - C594810NUp.LIZ > 3000) {
                    iLIZIZ = C1307940k8m.LIZIZ().LIZIZ();
                    C594810NUp.LIZ = System.currentTimeMillis();
                    C594810NUp.LIZIZ = iLIZIZ;
                } else {
                    iLIZIZ = C594810NUp.LIZIZ;
                }
                linkedHashMap.put("am_mem_avail", C2286608xc.LJ(iLIZIZ));
                C1C7U.LIZIZ("FuncProcessor@6723.getFeatureSet$1");
                return linkedHashMap;
            }
            throw new IllegalStateException("get_feature_set>>> featureSetName is not support");
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalStateException("get_feature_set>>> error", e);
        }
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(C1307670k8L c1307670k8L, List<? extends Object> list, InterfaceC1364105Vn<? super Map<String, Object>> interfaceC1364105Vn) {
        C594800NUo c594800NUo = new C594800NUo(interfaceC1364105Vn);
        c594800NUo.LL = list;
        return c594800NUo.invokeSuspend(Unit.LIZ);
    }
}
