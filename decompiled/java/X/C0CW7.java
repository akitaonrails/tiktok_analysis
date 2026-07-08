package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CW7, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$recoverMiddlePageSug$4", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C0CW7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CW7(MessageViewModel messageViewModel, InterfaceC1364105Vn<? super C0CW7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CW7(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.recoverMiddlePageSug$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJJIJI = false;
        MessageViewModel messageViewModel = this.LL;
        messageViewModel.sI0(messageViewModel.LLJILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.recoverMiddlePageSug$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
