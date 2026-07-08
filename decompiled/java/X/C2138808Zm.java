package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.08Zm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.preload.ECColdStartFetchTask$run$1", f = "ECColdStartFetchTask.kt", l = {47}, m = "invokeSuspend")
public final class C2138808Zm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C2138808Zm(InterfaceC1364105Vn<? super C2138808Zm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2138808Zm(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ECColdStartFetchTask@28e3.run$1");
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
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("ShopTabV3 ECColdStartFetchTask.run");
            C1770990wBd c1770990wBd = C1770990wBd.LIZ;
            if (!((Boolean) C1770990wBd.LIZIZ.getValue()).booleanValue()) {
                this.LL = 1;
                if (c1770990wBd.LIZLLL(false, this) == objLJFF) {
                    C1C7U.LIZIZ("ECColdStartFetchTask@28e3.run$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECColdStartFetchTask@28e3.run$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C2138808Zm(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
