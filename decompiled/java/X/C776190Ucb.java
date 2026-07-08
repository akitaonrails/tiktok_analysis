package X;

import com.bytedance.android.livesdk.mvi.core.MviViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ucb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.mvi.core.MviViewModel$acceptIntent$1", f = "LiveMviFrameworkCore.kt", l = {258}, m = "invokeSuspend")
public final class C776190Ucb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MviViewModel<S, I, E> LLILLJJLI;

    /* JADX INFO: Incorrect field signature: TI; */
    public final /* synthetic */ InterfaceC774460UZo LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/bytedance/android/livesdk/mvi/core/MviViewModel<TS;TI;TE;>;TI;LX/05Vn<-LX/0Ucb;>;)V */
    public C776190Ucb(MviViewModel mviViewModel, InterfaceC774460UZo interfaceC774460UZo, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mviViewModel;
        this.LLILLL = interfaceC774460UZo;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C776190Ucb(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MviViewModel@c71f.acceptIntent$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
            InterfaceC774460UZo interfaceC774460UZo = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(interfaceC774460UZo, this) == objLJFF) {
                C1C7U.LIZIZ("MviViewModel@c71f.acceptIntent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MviViewModel@c71f.acceptIntent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
