package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS141S1100000_27;
import njp.a;

/* JADX INFO: renamed from: X.0CXv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.vm.MessageViewModel$prepareLocatorBeforeAskQuestion$1", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C315370CXv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315370CXv(MessageViewModel messageViewModel, String str, InterfaceC1364105Vn<? super C315370CXv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C315370CXv(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@9229.prepareLocatorBeforeAskQuestion$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MessageViewModel messageViewModel = this.LL;
        String str = this.LLILLJJLI;
        messageViewModel.getClass();
        messageViewModel.setState(new AwS141S1100000_27(messageViewModel, str, 0));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@9229.prepareLocatorBeforeAskQuestion$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
