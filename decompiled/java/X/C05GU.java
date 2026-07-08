package X;

import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05GU, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.common.MobClickConsentHelper$getPendingEvents$2", f = "MobClickConsentHelper.kt", l = {}, m = "invokeSuspend")
public final class C05GU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super List<C05GX>>, Object> {
    public C05GU(InterfaceC1364105Vn<? super C05GU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05GU(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobClickConsentHelper@eaa4.getPendingEvents$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String[] stringArray = C05GY.LIZ.getStringArray("pending_events", new String[0]);
        ArrayList arrayList = new ArrayList(stringArray.length);
        for (String str : stringArray) {
            arrayList.add(C08JS.LIZ(str, C05GX.class));
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        C1C7U.LIZIZ("MobClickConsentHelper@eaa4.getPendingEvents$2");
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super List<C05GX>> interfaceC1364105Vn) {
        return new C05GU(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
