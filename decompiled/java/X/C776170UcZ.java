package X;

import com.bytedance.android.livesdk.mvi.core.MviViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UcZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.mvi.core.MviViewModel$emitEffect$1", f = "LiveMviFrameworkCore.kt", l = {249}, m = "invokeSuspend")
public final class C776170UcZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MviViewModel<S, I, E> LLILLJJLI;

    /* JADX INFO: Incorrect field signature: TE; */
    public final /* synthetic */ InterfaceC1180504jb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Incorrect types in method signature: (Lcom/bytedance/android/livesdk/mvi/core/MviViewModel<TS;TI;TE;>;TE;LX/05Vn<-LX/0UcZ;>;)V */
    public C776170UcZ(MviViewModel mviViewModel, InterfaceC1180504jb interfaceC1180504jb, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = mviViewModel;
        this.LLILLL = interfaceC1180504jb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C776170UcZ(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MviViewModel@c71f.emitEffect$1");
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
            C2252331DDr c2252331DDr = this.LLILLJJLI.LLILZ;
            InterfaceC1180504jb interfaceC1180504jb = this.LLILLL;
            this.LL = 1;
            if (c2252331DDr.emit(interfaceC1180504jb, this) == objLJFF) {
                C1C7U.LIZIZ("MviViewModel@c71f.emitEffect$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MviViewModel@c71f.emitEffect$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
