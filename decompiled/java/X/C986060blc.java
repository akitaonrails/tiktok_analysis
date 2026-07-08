package X;

import com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0blc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.competition.game.component.CatchBeansGameComponent$showGame$2", f = "CatchBeansGameComponent.kt", l = {217}, m = "invokeSuspend")
public final class C986060blc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CatchBeansGameComponent LLILLJJLI;
    public final /* synthetic */ C0UEA LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C986060blc(CatchBeansGameComponent catchBeansGameComponent, C0UEA c0uea, String str, String str2, InterfaceC1364105Vn<? super C986060blc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = catchBeansGameComponent;
        this.LLILLL = c0uea;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C986060blc(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CatchBeansGameComponent@7e04.showGame$2");
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
            CatchBeansGameComponent catchBeansGameComponent = this.LLILLJJLI;
            C0UEA c0uea = this.LLILLL;
            String str = this.LLILZ;
            String str2 = this.LLILZIL;
            this.LL = 1;
            if (catchBeansGameComponent.LJIILLIIL(c0uea, str, str2, this) == objLJFF) {
                C1C7U.LIZIZ("CatchBeansGameComponent@7e04.showGame$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CatchBeansGameComponent@7e04.showGame$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
