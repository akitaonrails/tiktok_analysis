package X;

import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z1O, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "detailpage.actions.CreateGroupChatActionKt$updateEnable$1", f = "CreateGroupChatAction.kt", l = {112}, m = "invokeSuspend")
public final class C0Z1O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0Z1M LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC893080Z1u LLILZ;
    public final /* synthetic */ BaseActionViewModel<?> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0Z1O(C0Z1M c0z1m, boolean z, InterfaceC893080Z1u interfaceC893080Z1u, BaseActionViewModel<?> baseActionViewModel, InterfaceC1364105Vn<? super C0Z1O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0z1m;
        this.LLILLL = z;
        this.LLILZ = interfaceC893080Z1u;
        this.LLILZIL = baseActionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0Z1O(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC346201Wa c914080ZtW;
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
            C2252331DDr c2252331DDrLIZJ = this.LLILLJJLI.LIZJ();
            if (this.LLILLL) {
                c914080ZtW = this.LLILZ.LJJJ().LIZIZ();
            } else {
                c914080ZtW = new C914080ZtW(this.LLILZ.LJJJ().LIZIZ(), 6);
            }
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new C414301jJ(c2252331DDrLIZJ, c914080ZtW, new C0Z1P(this.LLILLL, null)));
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILZIL, 62);
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
