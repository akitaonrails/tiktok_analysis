package X;

import com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS232S0000000_4;
import njp.a;

/* JADX INFO: renamed from: X.0CbT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.chatagent.botpage.vm.MessageViewModel$doBeforeAskQuestionAnim$1", f = "MessageViewModel.kt", l = {}, m = "invokeSuspend")
public final class C316850CbT extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MessageViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C316850CbT(MessageViewModel messageViewModel, InterfaceC1364105Vn<? super C316850CbT> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = messageViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C316850CbT(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageViewModel@2947.doBeforeAskQuestionAnim$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        MessageViewModel messageViewModel = this.LL;
        messageViewModel.getClass();
        messageViewModel.setState(AFwS232S0000000_4.get$arr$(219));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageViewModel@2947.doBeforeAskQuestionAnim$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
