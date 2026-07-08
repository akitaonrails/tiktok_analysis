package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.SubConversationConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0Cgz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.handlers.MessageOperatorHandler$updateSubConversationConfig$1", f = "MessageOperatorHandler.kt", l = {207}, m = "invokeSuspend")
public final class C320270Cgz extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1863280yaU LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C320270Cgz(C1863280yaU c1863280yaU, InterfaceC1364105Vn<? super C320270Cgz> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1863280yaU;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C320270Cgz(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageOperatorHandler@b589.updateSubConversationConfig$1");
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
            C1863280yaU c1863280yaU = this.LLILLJJLI;
            C2252331DDr c2252331DDr = c1863280yaU.LJIIJJI;
            SubConversationConfig subConversationConfig = c1863280yaU.LJIIIIZZ;
            this.LL = 1;
            if (c2252331DDr.emit(subConversationConfig, this) == objLJFF) {
                C1C7U.LIZIZ("MessageOperatorHandler@b589.updateSubConversationConfig$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageOperatorHandler@b589.updateSubConversationConfig$1");
        return unit;
    }
}
