package X;

import Y.AgS103S1100000_14;
import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseSwitchActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Z1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "detailpage.actions.MuteCallActionKt$bindIsCallMuted$1", f = "MuteCallAction.kt", l = {66}, m = "invokeSuspend")
public final class C892950Z1h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC893080Z1u LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ BaseSwitchActionViewModel<?> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C892950Z1h(InterfaceC893080Z1u interfaceC893080Z1u, String str, BaseSwitchActionViewModel<?> baseSwitchActionViewModel, InterfaceC1364105Vn<? super C892950Z1h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC893080Z1u;
        this.LLILLL = str;
        this.LLILZ = baseSwitchActionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C892950Z1h(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
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
            final C2252331DDr c2252331DDrLIZIZ = this.LLILLJJLI.LJJJ().LIZIZ();
            final String str = this.LLILLL;
            InterfaceC346201Wa interfaceC346201WaLJIL = C09IC.LJIL(C09IC.LJIILL(new InterfaceC346201Wa<Boolean>() { // from class: X.0Z1i
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super Boolean> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c2252331DDrLIZIZ.collect(new AgS103S1100000_14(interfaceC346701Wf, str, 2), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            }), C0PEM.LIZJ);
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILZ, 72);
            this.LL = 1;
            if (interfaceC346201WaLJIL.collect(agS295S0100000_14, this) == objLJFF) {
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
