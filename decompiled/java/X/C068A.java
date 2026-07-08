package X;

import com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068A, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$addLocalTasks$1", f = "BaseCommonChatNoticeViewModel.kt", l = {196}, m = "invokeSuspend")
public final class C068A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public SessionInfo LL;
    public int LLILLJJLI;
    public final /* synthetic */ BaseCommonChatNoticeViewModel LLILLL;
    public final /* synthetic */ Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C068A(BaseCommonChatNoticeViewModel baseCommonChatNoticeViewModel, Function2<? super C06OO, ? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function2, InterfaceC1364105Vn<? super C068A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = baseCommonChatNoticeViewModel;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C068A(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        SessionInfo sessionInfoRQ2;
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.addLocalTasks$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                sessionInfoRQ2 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            sessionInfoRQ2 = this.LLILLL.RQ2();
            if (sessionInfoRQ2 == null) {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.addLocalTasks$1");
                return unit;
            }
            Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> function2 = this.LLILZ;
            C06AI c06ai = new C06AI(0);
            this.LL = sessionInfoRQ2;
            this.LLILLJJLI = 1;
            if (function2.invoke(c06ai, this) == objLJFF) {
                C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.addLocalTasks$1");
                return objLJFF;
            }
        }
        C1419505h3.LIZ.getClass();
        if (C1419505h3.LIZLLL) {
            ((IPromptUnifiedFrequencyController) this.LLILLL.LLILZLL.getValue()).LJI(sessionInfoRQ2.getUuid(), EnumC15599068v.COMMON_LOCAL_TASK);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.addLocalTasks$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
