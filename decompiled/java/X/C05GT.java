package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05GT, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.common.MobClickConsentHelper$setPendingEvents$2", f = "MobClickConsentHelper.kt", l = {}, m = "invokeSuspend")
public final class C05GT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ List<C05GX> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05GT(List<C05GX> list, InterfaceC1364105Vn<? super C05GT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05GT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MobClickConsentHelper@eaa4.setPendingEvents$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C05GX> list = this.LL;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        Iterator<C05GX> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList.add(C08JS.LIZLLL(it2.next()));
        }
        C05GY.LIZ.storeStringArray("pending_events", (String[]) arrayList.toArray(new String[0]));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MobClickConsentHelper@eaa4.setPendingEvents$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
