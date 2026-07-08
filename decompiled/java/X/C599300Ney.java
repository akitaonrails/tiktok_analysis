package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ney, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.SeaPdpCommunicationService$subscribeEvent$1$1", f = "SeaPdpCommunicationService.kt", l = {}, m = "invokeSuspend")
public final class C599300Ney extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC1631630sYr<String, Map<String, ? extends Object>, Map<String, ? extends Object>, C1757320vpa, Unit> LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ InterfaceC599270Nev LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C599300Ney(InterfaceC1631630sYr<? super String, ? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, ? super C1757320vpa, Unit> interfaceC1631630sYr, String str, InterfaceC599270Nev interfaceC599270Nev, InterfaceC1364105Vn<? super C599300Ney> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC1631630sYr;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC599270Nev;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C599300Ney(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        C1C7U.LIZ("SeaPdpCommunicationService@dc30.subscribeEvent$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        InterfaceC1631630sYr<String, Map<String, ? extends Object>, Map<String, ? extends Object>, C1757320vpa, Unit> interfaceC1631630sYr = this.LL;
        String str = this.LLILLJJLI;
        Map<String, ? extends Object> data = this.LLILLL.getData();
        Map<String, ? extends Object> extras = this.LLILLL.getExtras();
        Map<String, Object> extras2 = this.LLILLL.getExtras();
        Object obj3 = null;
        if (extras2 != null) {
            obj2 = extras2.get("__sea_pdp_communication_context");
        } else {
            obj2 = null;
        }
        if (obj2 instanceof C1757320vpa) {
            obj3 = obj2;
        }
        interfaceC1631630sYr.invoke(str, data, extras, (C1757320vpa) obj3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpCommunicationService@dc30.subscribeEvent$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
