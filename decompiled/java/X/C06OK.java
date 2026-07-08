package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06OK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine$defaultTaskInvalidator$1", f = "ChatNoticeFlowEngine.kt", l = {60}, m = "invokeSuspend")
public final class C06OK extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ChatNoticeFlowEngine LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OK(ChatNoticeFlowEngine chatNoticeFlowEngine, InterfaceC1364105Vn<? super C06OK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = chatNoticeFlowEngine;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06OK c06ok = new C06OK(this.LLILLL, interfaceC1364105Vn);
        c06ok.LLILLJJLI = obj;
        return c06ok;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("ChatNoticeFlowEngine@85cd.defaultTaskInvalidator$1");
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
            C06OO c06oo = (C06OO) this.LLILLJJLI;
            C06ON c06on = (C06ON) ListProtector.get(this.LLILLL.LJII, c06oo.LIZ.getSceneId().ordinal());
            ChatNoticeFlowEngine chatNoticeFlowEngine = this.LLILLL;
            this.LL = 1;
            obj = C23250099c.LJI(this, c06on.LIZIZ, new C06OG(c06on, c06oo, chatNoticeFlowEngine, null));
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.defaultTaskInvalidator$1");
                return objLJFF;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(!((Boolean) obj).booleanValue());
        C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.defaultTaskInvalidator$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
