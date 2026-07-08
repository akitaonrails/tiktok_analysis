package X;

import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0akS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel$updateGameState$1", f = "LetsDanceBaseViewModel.kt", l = {353}, m = "invokeSuspend")
public final class C946900akS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LetsDanceBaseViewModel LLILLJJLI;
    public final /* synthetic */ C947420alI LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C946900akS(LetsDanceBaseViewModel letsDanceBaseViewModel, C947420alI c947420alI, InterfaceC1364105Vn<? super C946900akS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = letsDanceBaseViewModel;
        this.LLILLL = c947420alI;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C946900akS(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LetsDanceBaseViewModel@2ff0.updateGameState$1");
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
            InterfaceC946970akZ interfaceC946970akZXQ2 = this.LLILLJJLI.xQ2();
            if (interfaceC946970akZXQ2 != null) {
                C947420alI c947420alI = this.LLILLL;
                this.LL = 1;
                if (interfaceC946970akZXQ2.LJIILJJIL(c947420alI, this) == objLJFF) {
                    C1C7U.LIZIZ("LetsDanceBaseViewModel@2ff0.updateGameState$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LetsDanceBaseViewModel@2ff0.updateGameState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
