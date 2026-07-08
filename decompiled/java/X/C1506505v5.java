package X;

import com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05v5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel$requestSuggestedReply$1$1$1$1", f = "SmartReplySuggestedReplyViewModel.kt", l = {312}, m = "invokeSuspend")
public final class C1506505v5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ SmartReplySuggestedReplyViewModel LLILLJJLI;
    public final /* synthetic */ List<C869590Y9l> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1506505v5(SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel, List<? extends C869590Y9l> list, InterfaceC1364105Vn<? super C1506505v5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = smartReplySuggestedReplyViewModel;
        this.LLILLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1506505v5(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$1$1$1$1");
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
            SmartReplySuggestedReplyViewModel smartReplySuggestedReplyViewModel = this.LLILLJJLI;
            List<C869590Y9l> list = this.LLILLL;
            this.LL = 1;
            obj = smartReplySuggestedReplyViewModel.vQ2(list, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$1$1$1$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.requestSuggestedReply$1$1$1$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
