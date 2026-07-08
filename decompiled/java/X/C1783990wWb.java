package X;

import Y.AgS307S0100000_27;
import com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wWb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.b2c.replies.ui.IMQuickReplyFragment$subscribeDataUpdate$1", f = "IMQuickReplyFragment.kt", l = {142}, m = "invokeSuspend")
public final class C1783990wWb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMQuickReplyFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783990wWb(IMQuickReplyFragment iMQuickReplyFragment, InterfaceC1364105Vn<? super C1783990wWb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMQuickReplyFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1783990wWb(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMQuickReplyFragment@1e74.subscribeDataUpdate$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C2252321DDq c2252321DDq = this.LLILLJJLI.SR().LLILLJJLI;
            AgS307S0100000_27 agS307S0100000_27 = new AgS307S0100000_27(this.LLILLJJLI, 17);
            this.LL = 1;
            if (c2252321DDq.collect(agS307S0100000_27, this) == objLJFF) {
                C1C7U.LIZIZ("IMQuickReplyFragment@1e74.subscribeDataUpdate$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
