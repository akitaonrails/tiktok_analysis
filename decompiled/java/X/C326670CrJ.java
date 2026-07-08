package X;

import com.ss.android.ugc.aweme.tako.TakoInitTask;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CrJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoInitTask$run$1", f = "TakoInitTask.kt", l = {60, 63}, m = "invokeSuspend")
public final class C326670CrJ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ TakoInitTask LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C326670CrJ(TakoInitTask takoInitTask, InterfaceC1364105Vn<? super C326670CrJ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = takoInitTask;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C326670CrJ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoInitTask@e202.run$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("TakoInitTask@e202.run$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            long jLongValue = ((Number) C287290BNv.LIZ.getValue()).longValue();
            if (jLongValue >= 600000 && C123100dR.LIZ(C14TF.LIZIZ.LJJLIIIJLLLLLLLZ())) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TakoInitTask@e202.run$1");
                return unit2;
            }
            if (C123100dR.LIZ(C14TF.LIZIZ.LJJLIIIJLLLLLLLZ())) {
                this.LL = 1;
                if (AnonymousClass0958.LIZIZ(jLongValue, this) == objLJFF) {
                    C1C7U.LIZIZ("TakoInitTask@e202.run$1");
                    return objLJFF;
                }
            }
        }
        TakoInitTask takoInitTask = this.LLILLJJLI;
        this.LL = 2;
        if (takoInitTask.LIZ(this) == objLJFF) {
            C1C7U.LIZIZ("TakoInitTask@e202.run$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TakoInitTask@e202.run$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
