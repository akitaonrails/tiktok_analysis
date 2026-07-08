package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cgf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$updateMsgReadCursor$1", f = "MessageViewModel.kt", l = {4138}, m = "invokeSuspend")
public final class C320070Cgf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;
    public final /* synthetic */ Message LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320070Cgf(MessageViewModel messageViewModel, Message message, InterfaceC1364105Vn<? super C320070Cgf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
        this.LLILLL = message;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320070Cgf(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.updateMsgReadCursor$1");
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
            C1863380yae c1863380yae = this.LLILLJJLI.LLJJJJ;
            if (c1863380yae != null) {
                Message message = this.LLILLL;
                this.LL = 1;
                Object objLJIILL = c1863380yae.LJIILL.LJIILL(C1863390yaf.LJII(message, c1863380yae), this);
                if (objLJIILL != C099R.LJFF()) {
                    objLJIILL = Unit.LIZ;
                }
                if (objLJIILL == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.updateMsgReadCursor$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.updateMsgReadCursor$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
