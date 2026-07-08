package X;

import Y.AgS295S0100000_14;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YJO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.data.source.ReadReceiptDataSource$ReadReceiptFetcher$2", f = "ReadReceiptDataSource.kt", l = {88}, m = "invokeSuspend")
public final class C0YJO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0YJJ LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0YJO(C0YJJ c0yjj, InterfaceC1364105Vn<? super C0YJO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yjj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0YJO(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReadReceiptDataSource$ReadReceiptFetcher@6649.2");
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
            InterfaceC346201Wa interfaceC346201WaLJIILIIL = C09IC.LJIILIIL((InterfaceC346201Wa) this.LLILLJJLI.LIZLLL.getValue(), C0YJN.LIZ);
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLJJLI, 38);
            this.LL = 1;
            if (interfaceC346201WaLJIILIIL.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("ReadReceiptDataSource$ReadReceiptFetcher@6649.2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReadReceiptDataSource$ReadReceiptFetcher@6649.2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
