package X;

import com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u0d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.aivideo.detail.assem.TakoAIVideoInputAssem$Input$2$1", f = "TakoAIVideoInputAssem.kt", l = {349}, m = "invokeSuspend")
public final class C1687290u0d extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ TakoAIVideoInputAssem LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687290u0d(boolean z, TakoAIVideoInputAssem takoAIVideoInputAssem, InterfaceC1364105Vn<? super C1687290u0d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = takoAIVideoInputAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687290u0d(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoAIVideoInputAssem@6324.Input$2$1");
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
            if (this.LLILLJJLI) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$2$1");
                return unit;
            }
            C05YD<Boolean> c05ydLJII = this.LLILLL.cp().LL.LJII();
            C13064059i c13064059i = new C13064059i(null);
            this.LL = 1;
            if (C09IC.LJIJ(c05ydLJII, this, c13064059i) == objLJFF) {
                C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$2$1");
                return objLJFF;
            }
        }
        this.LLILLL.ap().Fh();
        if (this.LLILLL.cp().getState().LLILLJJLI != EnumC1679580toC.LOADING) {
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$2$1");
            return unit2;
        }
        C1687300u0e.LIZ.getClass();
        if (((Number) C1687300u0e.LIZIZ.getValue()).intValue() == 2) {
            this.LLILLL.cp().vQ2();
        } else {
            C449180HjQ c449180HjQ = C449180HjQ.LIZ;
            C19EG c19egLIZ = C724240Sb0.LIZ(this.LLILLL);
            c449180HjQ.getClass();
            if (C449180HjQ.LIZJ(c19egLIZ)) {
                this.LLILLL.cp().wQ2();
            } else {
                this.LLILLL.cp().vQ2();
            }
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("TakoAIVideoInputAssem@6324.Input$2$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
