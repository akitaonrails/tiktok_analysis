package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.ccl.model.api.MessageSender;
import defpackage.r2;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yW6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$fetchMultiTurnWelcome$1", f = "MessageViewModel.kt", l = {4535}, m = "invokeSuspend")
public final class C1860560yW6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MessageViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860560yW6(MessageViewModel messageViewModel, InterfaceC1364105Vn<? super C1860560yW6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = messageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860560yW6(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.fetchMultiTurnWelcome$1");
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
                this.LL = 1;
                Object objLJIILL = c1863380yae.LJIILL.LJIILL(new r2(13, new Message(null, null, null, new MessageSender(2, 0L, 0L, false, ""), null, null, false, null, 0L, 0L, UUID.randomUUID().toString(), 3, null, null, false, 0, false, null, null, 0L, 0L, 0L, 0, 0, 0, null, 0, null, 0L, false, 0, 0, null, null, false, false, 1, null, System.currentTimeMillis(), 0, 0, null, 0L, null, false, null, null, null, null, null, null, false, null, -3081, 2097071, null), null, null, null, null, null, null, null, null, 0, 0, null, null, false, c1863380yae, null, null, null, null, null, null, null, null, null, false, null, 0, 0, false, null, null, 0, null, null, null, false, null, null, false, false, false, false, null, -32772, 8191), this);
                if (objLJIILL != C099R.LJFF()) {
                    objLJIILL = Unit.LIZ;
                }
                if (objLJIILL == objLJFF) {
                    C1C7U.LIZIZ("MessageViewModel@9229.fetchMultiTurnWelcome$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.fetchMultiTurnWelcome$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
