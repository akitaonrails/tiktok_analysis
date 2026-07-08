package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yx2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "detailpage.actions.StarActionKt$updateIsStarred$1", f = "StarAction.kt", l = {84}, m = "invokeSuspend")
public final class C890780Yx2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC893080Z1u LLILLJJLI;
    public final /* synthetic */ BaseActionViewModel<?> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C890780Yx2(InterfaceC893080Z1u interfaceC893080Z1u, BaseActionViewModel<?> baseActionViewModel, InterfaceC1364105Vn<? super C890780Yx2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC893080Z1u;
        this.LLILLL = baseActionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C890780Yx2(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C914080ZtW(this.LLILLJJLI.LJJJ().LIZIZ(), 4));
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILLL, 54);
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
