package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Nez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.communication.SeaPdpCommunicationService$subscribeEvent$1", f = "SeaPdpCommunicationService.kt", l = {283}, m = "invokeSuspend")
public final class C599310Nez extends C09AX implements Function2<InterfaceC599270Nev, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1631630sYr<String, Map<String, ? extends Object>, Map<String, ? extends Object>, C1757320vpa, Unit> LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C599310Nez(InterfaceC1631630sYr<? super String, ? super Map<String, ? extends Object>, ? super Map<String, ? extends Object>, ? super C1757320vpa, Unit> interfaceC1631630sYr, String str, InterfaceC1364105Vn<? super C599310Nez> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1631630sYr;
        this.LLILZ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C599310Nez c599310Nez = new C599310Nez(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c599310Nez.LLILLJJLI = obj;
        return c599310Nez;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SeaPdpCommunicationService@dc30.subscribeEvent$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC599270Nev interfaceC599270Nev = (InterfaceC599270Nev) this.LLILLJJLI;
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
            C599300Ney c599300Ney = new C599300Ney(this.LLILLL, this.LLILZ, interfaceC599270Nev, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pqLLIILII, c599300Ney) == objLJFF) {
                C1C7U.LIZIZ("SeaPdpCommunicationService@dc30.subscribeEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpCommunicationService@dc30.subscribeEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC599270Nev interfaceC599270Nev, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC599270Nev, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
