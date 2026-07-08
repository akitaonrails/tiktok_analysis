package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.function.Consumer;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k01, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSession$onAnswer$1", f = "CallSession.kt", l = {474, 476}, m = "invokeSuspend")
public final class C1302510k01 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1302520k02 LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Consumer<Boolean> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302510k01(C1302520k02 c1302520k02, int i, Consumer<Boolean> consumer, InterfaceC1364105Vn<? super C1302510k01> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1302520k02;
        this.LLILLL = i;
        this.LLILZ = consumer;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302510k01(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        return Unit.LIZ;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> function2 = this.LLILLJJLI.LLILLL;
                Integer numLJ = C2286608xc.LJ(this.LLILLL);
                this.LL = 1;
                if (function2.invoke(numLJ, this) == objLJFF) {
                    return objLJFF;
                }
            }
            this.LLILZ.accept(true);
            C05YC<EnumC1302210jzX> c05yc = this.LLILLJJLI.LLIZLLLIL;
            EnumC1302210jzX enumC1302210jzX = EnumC1302210jzX.ACTIVE;
            this.LL = 2;
            if (c05yc.emit(enumC1302210jzX, this) == objLJFF) {
                return objLJFF;
            }
            return Unit.LIZ;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1302520k02 c1302520k02 = this.LLILLJJLI;
            Consumer<Boolean> consumer = this.LLILZ;
            c1302520k02.getClass();
            consumer.accept(Boolean.FALSE);
            c1302520k02.LLJI.LJIIZILJ(Unit.LIZ);
            throw e;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
