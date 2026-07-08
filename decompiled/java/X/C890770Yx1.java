package X;

import Y.AgS103S1100000_14;
import Y.AgS295S0100000_14;
import com.ss.android.ugc.aweme.im.sdk.chatdetail.refactor.viewmodel.BaseActionViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Yx1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatdetail.redesign.detailpage.actions.NotifyActionKt$updateNotifyState$1", f = "NotifyAction.kt", l = {55}, m = "invokeSuspend")
public final class C890770Yx1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC893080Z1u LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ BaseActionViewModel<?> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C890770Yx1(InterfaceC893080Z1u interfaceC893080Z1u, String str, BaseActionViewModel<?> baseActionViewModel, InterfaceC1364105Vn<? super C890770Yx1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC893080Z1u;
        this.LLILLL = str;
        this.LLILZ = baseActionViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C890770Yx1(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NotifyActionKt@caa8.updateNotifyState$1");
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
            InterfaceC346201Wa interfaceC346201WaLJIILL = C09IC.LJIILL(new InterfaceC346201Wa<EnumC877490Ybb>() { // from class: X.0Yx3
                @Override // X.InterfaceC346201Wa
                public final Object collect(InterfaceC346701Wf<? super EnumC877490Ybb> interfaceC346701Wf, InterfaceC1364105Vn interfaceC1364105Vn) {
                    Object objCollect = c2252331DDrLIZIZ.collect(new AgS103S1100000_14(interfaceC346701Wf, str, 0), interfaceC1364105Vn);
                    if (objCollect == C099R.LJFF()) {
                        return objCollect;
                    }
                    return Unit.LIZ;
                }
            });
            AgS295S0100000_14 agS295S0100000_14 = new AgS295S0100000_14(this.LLILZ, 47);
            this.LL = 1;
            if (interfaceC346201WaLJIILL.collect(agS295S0100000_14, this) == objLJFF) {
                C1C7U.LIZIZ("NotifyActionKt@caa8.updateNotifyState$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NotifyActionKt@caa8.updateNotifyState$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
