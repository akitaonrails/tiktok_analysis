package X;

import Y.AgS286S0100000_5;
import com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.ugc.android.editor.components.base.magicprocessor.handler.I2VHandler$observeProgress$1", f = "I2VHandler.kt", l = {109}, m = "invokeSuspend")
public final class C355700Dx2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C354410Dux LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C355700Dx2(String str, C354410Dux c354410Dux, InterfaceC1364105Vn<? super C355700Dx2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = c354410Dux;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C355700Dx2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa<C0LSZ> interfaceC346201WaLJJJJL;
        InterfaceC346201Wa interfaceC346201WaLJIILL;
        C1C7U.LIZ("I2VHandler@c922.observeProgress$1");
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
            ICreationAsyncTaskManager iCreationAsyncTaskManagerLIZ = C09BV.LIZ();
            if (iCreationAsyncTaskManagerLIZ != null && (interfaceC346201WaLJJJJL = iCreationAsyncTaskManagerLIZ.LJJJJL(this.LLILLJJLI)) != null && (interfaceC346201WaLJIILL = C09IC.LJIILL(new C0FXA(interfaceC346201WaLJJJJL, 6))) != null) {
                AgS286S0100000_5 agS286S0100000_5 = new AgS286S0100000_5(this.LLILLL, 24);
                this.LL = 1;
                if (interfaceC346201WaLJIILL.collect(agS286S0100000_5, this) == objLJFF) {
                    C1C7U.LIZIZ("I2VHandler@c922.observeProgress$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I2VHandler@c922.observeProgress$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
