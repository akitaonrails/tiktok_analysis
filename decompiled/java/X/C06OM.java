package X;

import com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06OM, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine$startShowingOnAllScenes$3$1", f = "ChatNoticeFlowEngine.kt", l = {215}, m = "invokeSuspend")
public final class C06OM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ ChatNoticeFlowEngine LLILLJJLI;
    public final /* synthetic */ C06ON LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OM(ChatNoticeFlowEngine chatNoticeFlowEngine, C06ON c06on, InterfaceC1364105Vn<? super C06OM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = chatNoticeFlowEngine;
        this.LLILLL = c06on;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06OM(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeFlowEngine@85cd.startShowingOnAllScenes$3$1");
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
            ChatNoticeFlowEngine chatNoticeFlowEngine = this.LLILLJJLI;
            C06NH c06nh = this.LLILLL.LIZ;
            this.LL = 1;
            if (chatNoticeFlowEngine.LJIJI(c06nh, this) == objLJFF) {
                C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.startShowingOnAllScenes$3$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.startShowingOnAllScenes$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
