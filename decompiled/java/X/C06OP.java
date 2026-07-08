package X;

import com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine;
import com.ss.android.ugc.aweme.im.prompts.api.freqcontrol.IPromptUnifiedFrequencyController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06OP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnoticenew.ChatNoticeFlowEngine$addTask$2", f = "ChatNoticeFlowEngine.kt", l = {189}, m = "invokeSuspend")
public final class C06OP extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C06OO LLILLL;
    public final /* synthetic */ ChatNoticeFlowEngine LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06OP(C06OO c06oo, ChatNoticeFlowEngine chatNoticeFlowEngine, InterfaceC1364105Vn<? super C06OP> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c06oo;
        this.LLILZ = chatNoticeFlowEngine;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06OP c06op = new C06OP(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c06op.LLILLJJLI = obj;
        return c06op;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatNoticeFlowEngine@85cd.addTask$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C06OO c06oo = (C06OO) this.LLILLJJLI;
            if (c06oo.LIZ.getSceneId() == this.LLILLL.LIZ.getSceneId()) {
                C06OO c06oo2 = this.LLILLL;
                EnumC1596306Mv enumC1596306Mv = c06oo.LIZ;
                IPromptUnifiedFrequencyController iPromptUnifiedFrequencyController = (IPromptUnifiedFrequencyController) this.LLILZ.LJI.getValue();
                String str = this.LLILZ.LIZLLL;
                this.LL = 1;
                obj = c06oo2.LIZ(enumC1596306Mv, iPromptUnifiedFrequencyController, str, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.addTask$2");
                    return objLJFF;
                }
            }
            z = false;
            Boolean boolValueOf = Boolean.valueOf(z);
            C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.addTask$2");
            return boolValueOf;
        }
        if (!((Boolean) obj).booleanValue()) {
            z = false;
        }
        Boolean boolValueOf2 = Boolean.valueOf(z);
        C1C7U.LIZIZ("ChatNoticeFlowEngine@85cd.addTask$2");
        return boolValueOf2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
