package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import defpackage.r2;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import njp.a;

/* JADX INFO: renamed from: X.0yWJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.base.model.conversation.ConversationModel$updateMessageLocal$1", f = "ConversationModel.kt", l = {355}, m = "invokeSuspend")
public final class C1860690yWJ extends C09AX implements Function1<InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1863380yae LLILLJJLI;
    public final /* synthetic */ Message LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1860690yWJ(C1863380yae c1863380yae, Message message, boolean z, InterfaceC1364105Vn<? super C1860690yWJ> interfaceC1364105Vn) {
        super(1, interfaceC1364105Vn);
        this.LLILLJJLI = c1863380yae;
        this.LLILLL = message;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1860690yWJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ConversationModel@ae6d.updateMessageLocal$1");
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
            C1863380yae c1863380yae = this.LLILLJJLI;
            C1863280yaU c1863280yaU = c1863380yae.LJIILL;
            r2 r2Var = new r2(1003, this.LLILLL, null, null, null, null, null, null, null, null, 0, 0, null, null, false, c1863380yae, null, null, null, null, null, null, null, null, C2097608Jq.LJIIJ(new Pair("lock_local_data", String.valueOf(this.LLILZ))), false, null, 0, 0, false, null, null, 0, null, null, null, false, null, null, false, false, false, false, null, -16809988, 8191);
            this.LL = 1;
            if (c1863280yaU.LJIILL(r2Var, this) == objLJFF) {
                C1C7U.LIZIZ("ConversationModel@ae6d.updateMessageLocal$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ConversationModel@ae6d.updateMessageLocal$1");
        return unit;
    }
}
