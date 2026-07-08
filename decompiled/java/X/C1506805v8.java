package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05v8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.ai.impl.smartreply.suggestedreply.SmartReplySuggestedReplyViewModel$ableToRequestSuggestedReply$2$1", f = "SmartReplySuggestedReplyViewModel.kt", l = {378}, m = "invokeSuspend")
public final class C1506805v8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C1506805v8(InterfaceC1364105Vn<? super C1506805v8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1506805v8(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SmartReplySuggestedReplyViewModel@aef2.ableToRequestSuggestedReply$2$1");
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
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C1507005vA c1507005vA = new C1507005vA(null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c1507005vA) == objLJFF) {
                C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.ableToRequestSuggestedReply$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SmartReplySuggestedReplyViewModel@aef2.ableToRequestSuggestedReply$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C1506805v8(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
