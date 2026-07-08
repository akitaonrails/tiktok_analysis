package X;

import com.ss.android.ugc.aweme.ecommerce.network.EcLynxNetReuseHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0pKZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.network.EcLynxNetReuseHandler$Companion$asyncCheckExpired$1", f = "EcLynxNetReuseHandler.kt", l = {}, m = "invokeSuspend")
public final class C1507450pKZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1507450pKZ(InterfaceC1364105Vn<? super C1507450pKZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1507450pKZ(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcLynxNetReuseHandler$Companion@ca42.asyncCheckExpired$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1507520pKg c1507520pKg = EcLynxNetReuseHandler.LIZLLL;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1507520pKg.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it2 = c1507520pKg.LIZ.LIZ().iterator();
        while (it2.hasNext()) {
            Map.Entry entry = (Map.Entry) it2.next();
            if (((C1507550pKj) entry.getValue()).LIZIZ < jCurrentTimeMillis) {
                arrayList.add(entry.getKey());
            }
        }
        if (!arrayList.isEmpty()) {
            c1507520pKg.LIZ.LJ(arrayList);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcLynxNetReuseHandler$Companion@ca42.asyncCheckExpired$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1507450pKZ(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
