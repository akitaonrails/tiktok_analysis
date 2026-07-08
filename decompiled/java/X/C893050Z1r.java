package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z1r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "detailpage.actions.MuteActionKt$bindIsMuted$1", f = "MuteAction.kt", l = {60}, m = "invokeSuspend")
public final class C893050Z1r extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC893080Z1u LLILLJJLI;
    public final /* synthetic */ BaseSwitchActionViewModel<?> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C893050Z1r(InterfaceC893080Z1u interfaceC893080Z1u, BaseSwitchActionViewModel<?> baseSwitchActionViewModel, InterfaceC1364105Vn<? super C893050Z1r> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC893080Z1u;
        this.LLILLL = baseSwitchActionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C893050Z1r(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C914080ZtW(this.LLILLJJLI.LJJJ().LIZIZ(), 9));
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLL, 68);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS295S0100000_14, this) == objLJFF) {
                return objLJFF;
            }
        }
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
