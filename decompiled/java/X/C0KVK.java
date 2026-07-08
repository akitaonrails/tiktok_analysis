package X;

import Y.AgS198S0200000_7;
import com.bytedance.android.live.aireply.IAIReplyAnchorManagerService;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0KVK, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.aireply.ReplyHistoryViewHolder$bindView$2", f = "AIReplyHistoryAdapter.kt", l = {140}, m = "invokeSuspend")
public final class C0KVK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0KVL LLILLJJLI;
    public final /* synthetic */ C0KVN LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0KVK(C0KVL c0kvl, C0KVN c0kvn, InterfaceC1364105Vn<? super C0KVK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0kvl;
        this.LLILLL = c0kvn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0KVK(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReplyHistoryViewHolder@b306.bindView$2");
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
            IAIReplyAnchorManagerService.Companion.getClass();
            InterfaceC346201Wa<Pair<Long, Integer>> feedbackState = C445870He5.LIZ().getFeedbackState();
            AgS198S0200000_7 agS198S0200000_7 = new AgS198S0200000_7(this.LLILLJJLI, this.LLILLL, 0);
            this.LL = 1;
            if (feedbackState.collect(agS198S0200000_7, this) == objLJFF) {
                C1C7U.LIZIZ("ReplyHistoryViewHolder@b306.bindView$2");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReplyHistoryViewHolder@b306.bindView$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
