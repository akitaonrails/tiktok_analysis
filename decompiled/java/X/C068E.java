package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068E, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$onSendMessageEvent$1$1", f = "BaseCommonChatNoticeViewModel.kt", l = {458}, m = "invokeSuspend")
public final class C068E extends C09AX implements Function2<Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object>, InterfaceC1364105Vn<? super List<? extends C09AE>>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;

    public C068E(InterfaceC1364105Vn<? super C068E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C068E c068e = new C068E(interfaceC1364105Vn);
        c068e.LLILLJJLI = obj;
        return c068e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.onSendMessageEvent$1$1");
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
            C06AI c06ai = new C06AI(2);
            this.LL = 1;
            if (function2.invoke(c06ai, this) == objLJFF) {
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onSendMessageEvent$1$1");
                return objLJFF;
            }
        }
        C13BV c13bv = C13BV.INSTANCE;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onSendMessageEvent$1$1");
        return c13bv;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super List<? extends C09AE>> interfaceC1364105Vn) {
        return ((a) create(function2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
