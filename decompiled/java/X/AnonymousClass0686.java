package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0686, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$onGetMessageEvent$1$3", f = "BaseCommonChatNoticeViewModel.kt", l = {417}, m = "invokeSuspend")
public final class AnonymousClass0686 extends C09AX implements Function2<Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>, InterfaceC1364105Vn<? super List<? extends C09AE>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C869590Y9l LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnonymousClass0686(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super AnonymousClass0686> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0686 anonymousClass0686 = new AnonymousClass0686(this.LLILLL, interfaceC1364105Vn);
        anonymousClass0686.LLILLJJLI = obj;
        return anonymousClass0686;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1$3");
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
            Function2 function2 = (Function2) this.LLILLJJLI;
            if (!C0ZDX.LJJJJIZL(this.LLILLL)) {
                C06AI c06ai = new C06AI(1);
                this.LL = 1;
                obj = function2.invoke(c06ai, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1$3");
                    return objLJFF;
                }
            }
            C13BV c13bv = C13BV.INSTANCE;
            C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1$3");
            return c13bv;
        }
        ((Boolean) obj).booleanValue();
        C13BV c13bv2 = C13BV.INSTANCE;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1$3");
        return c13bv2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super List<? extends C09AE>> interfaceC1364105Vn) {
        return ((a) create(function2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
