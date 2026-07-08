package X;

import Y.AgS307S0100000_27;
import com.ss.android.ugc.aweme.tako.autoplay.TakoAutoPlayController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wW5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.autoplay.TakoAutoPlayController$initStrategy$2", f = "TakoAutoPlayController.kt", l = {176}, m = "invokeSuspend")
public final class C1783670wW5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC1783680wW6 LLILLJJLI;
    public final /* synthetic */ TakoAutoPlayController LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783670wW5(InterfaceC1783680wW6 interfaceC1783680wW6, TakoAutoPlayController takoAutoPlayController, InterfaceC1364105Vn<? super C1783670wW5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC1783680wW6;
        this.LLILLL = takoAutoPlayController;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783670wW5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAutoPlayController@e714.initStrategy$2");
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
            InterfaceC346201Wa interfaceC346201WaLIZ = this.LLILLJJLI.LIZ(C09IC.LIZ(this.LLILLL.LJIILLIIL));
            AgS307S0100000_27 agS307S0100000_27 = new AgS307S0100000_27(this.LLILLL, 31);
            this.LL = 1;
            if (interfaceC346201WaLIZ.collect(agS307S0100000_27, this) == objLJFF) {
                C1C7U.LIZIZ("TakoAutoPlayController@e714.initStrategy$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoAutoPlayController@e714.initStrategy$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
