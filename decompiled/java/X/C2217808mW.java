package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.08mW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.plugin.AIGCWorkflowEventHub$attachPlugin$pluginEvents$1", f = "AIGCWorkflowEventHub.kt", l = {454}, m = "invokeSuspend")
public final class C2217808mW extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<? super C2217908mX>, InterfaceC1902607cm, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public /* synthetic */ InterfaceC1902607cm LLILLL;
    public final /* synthetic */ C553220Lmq LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2217808mW(C553220Lmq c553220Lmq, InterfaceC1364105Vn<? super C2217808mW> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LLILZ = c553220Lmq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC1902607cm interfaceC1902607cm;
        C1C7U.LIZ("AIGCWorkflowEventHub@14b7.attachPlugin$pluginEvents$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC1902607cm = (InterfaceC1902607cm) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC346701Wf interfaceC346701Wf = (InterfaceC346701Wf) this.LLILLJJLI;
            interfaceC1902607cm = this.LLILLL;
            C2217908mX c2217908mX = new C2217908mX(this.LLILZ, interfaceC1902607cm);
            this.LLILLJJLI = interfaceC1902607cm;
            this.LL = 1;
            if (interfaceC346701Wf.emit(c2217908mX, this) == objLJFF) {
                C1C7U.LIZIZ("AIGCWorkflowEventHub@14b7.attachPlugin$pluginEvents$1");
                return objLJFF;
            }
        }
        Boolean boolValueOf = Boolean.valueOf(!C07ZH.LIZ(interfaceC1902607cm));
        C1C7U.LIZIZ("AIGCWorkflowEventHub@14b7.attachPlugin$pluginEvents$1");
        return boolValueOf;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<? super C2217908mX> interfaceC346701Wf, InterfaceC1902607cm interfaceC1902607cm, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        C2217808mW c2217808mW = new C2217808mW(this.LLILZ, interfaceC1364105Vn);
        c2217808mW.LLILLJJLI = interfaceC346701Wf;
        c2217808mW.LLILLL = interfaceC1902607cm;
        return c2217808mW.invokeSuspend(Unit.LIZ);
    }
}
