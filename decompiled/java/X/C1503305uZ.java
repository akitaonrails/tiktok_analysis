package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.api.GreetingCardApi;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05uZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.viewmodel.GreetingCardViewModel$syncOpenedStateWithServer$1", f = "GreetingCardViewModel.kt", l = {376}, m = "invokeSuspend")
public final class C1503305uZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C869590Y9l LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1503305uZ(C869590Y9l c869590Y9l, InterfaceC1364105Vn<? super C1503305uZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c869590Y9l;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1503305uZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("GreetingCardViewModel@d8e.syncOpenedStateWithServer$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C869590Y9l c869590Y9l = this.LLILLJJLI;
            GreetingCardApi greetingCardApi = (GreetingCardApi) C1503405ua.LIZ.getValue();
            if (greetingCardApi != null) {
                long msgId = c869590Y9l.getMsgId();
                String conversationId = c869590Y9l.getConversationId();
                this.LL = 1;
                obj = greetingCardApi.updateGreetingCard(1, msgId, conversationId, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("GreetingCardViewModel@d8e.syncOpenedStateWithServer$1");
                    return objLJFF;
                }
            } else {
                c098200Yq = null;
                C189200o6.m2constructorimpl(c098200Yq);
                C189200o6.m5exceptionOrNullimpl(c098200Yq);
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("GreetingCardViewModel@d8e.syncOpenedStateWithServer$1");
                return unit;
            }
        }
        c098200Yq = (BaseResponse) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("GreetingCardViewModel@d8e.syncOpenedStateWithServer$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
