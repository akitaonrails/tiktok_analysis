package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cnc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.effect2.viewmodel.BillboardGlobalViewModel$initLiveEffect$5", f = "BillboardGlobalViewModel.kt", l = {104}, m = "invokeSuspend")
public final class C324380Cnc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1728700v5Q LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C324380Cnc(InterfaceC1728700v5Q interfaceC1728700v5Q, String str, String str2, String str3, InterfaceC1364105Vn<? super C324380Cnc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1728700v5Q;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = str3;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C324380Cnc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BillboardGlobalViewModel@db34.initLiveEffect$5");
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
            InterfaceC1728700v5Q interfaceC1728700v5Q = this.LLILLJJLI;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            this.LL = 1;
            if (interfaceC1728700v5Q.LJFF(str, str2, str3, this) == objLJFF) {
                C1C7U.LIZIZ("BillboardGlobalViewModel@db34.initLiveEffect$5");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BillboardGlobalViewModel@db34.initLiveEffect$5");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
