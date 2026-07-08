package X;

import com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS225S0300000_16;
import njp.a;

/* JADX INFO: renamed from: X.0cBS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multimatch.ui.MatchCountDownViewModel$showCountDownText$2", f = "MatchCountDownViewModel.kt", l = {225}, m = "invokeSuspend")
public final class C1002080cBS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ MatchCountDownViewModel LLILLL;
    public final /* synthetic */ C20486515Eh LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1002080cBS(long j, MatchCountDownViewModel matchCountDownViewModel, C20486515Eh c20486515Eh, Function0<Unit> function0, InterfaceC1364105Vn<? super C1002080cBS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = matchCountDownViewModel;
        this.LLILZ = c20486515Eh;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1002080cBS(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MatchCountDownViewModel@197b.showCountDownText$2");
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
            long j = this.LLILLJJLI;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(j, this) == objLJFF) {
                C1C7U.LIZIZ("MatchCountDownViewModel@197b.showCountDownText$2");
                return objLJFF;
            }
        }
        MatchCountDownViewModel matchCountDownViewModel = this.LLILLL;
        matchCountDownViewModel.setState(new AwS225S0300000_16(this.LLILZ, (C20486515Eh) matchCountDownViewModel, (MatchCountDownViewModel) this.LLILZIL, (Function0<Unit>) 10));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MatchCountDownViewModel@197b.showCountDownText$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
