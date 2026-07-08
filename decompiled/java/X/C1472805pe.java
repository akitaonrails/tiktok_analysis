package X;

import com.bytedance.keva.Keva;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05pe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.internalshare.impl.manager.InternalShareExpHitKeva$saveUserExpHitMap$1", f = "InternalShareExpHitManager.kt", l = {}, m = "invokeSuspend")
public final class C1472805pe extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Map<String, String> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1472805pe(Map<String, String> map, InterfaceC1364105Vn<? super C1472805pe> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1472805pe(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Map mapLIZ;
        C1C7U.LIZ("InternalShareExpHitKeva@379e.saveUserExpHitMap$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        for (Map.Entry<String, String> entry : this.LL.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Map mapLIZ2 = C1472905pf.LIZ(key);
            if (mapLIZ2 != null) {
                for (Map.Entry entry2 : mapLIZ2.entrySet()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
            if (value != null && (mapLIZ = C1277504zF.LIZ(value)) != null) {
                for (Map.Entry entry3 : mapLIZ.entrySet()) {
                    linkedHashMap.put(entry3.getKey(), entry3.getValue());
                }
            }
            String strLIZIZ = C2093608Ic.LIZIZ(linkedHashMap.toString());
            Keva keva = (Keva) C1472905pf.LIZ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("exp_hit_list_");
            sbLIZ.append(key);
            keva.storeString(C2188811AlT.LIZIZ(sbLIZ), strLIZIZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InternalShareExpHitKeva@379e.saveUserExpHitMap$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
