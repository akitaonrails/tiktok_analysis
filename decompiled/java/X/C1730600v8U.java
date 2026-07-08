package X;

import com.ss.ugc.live.sdk.message.data.IMessage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0v8U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.influencer.ecommercelive.common.business.broadcaster.duringlive.slot.ECDuringLiveBroadcasterWidget$onMessage$4", f = "ECDuringLiveBroadcasterWidget.kt", l = {587}, m = "invokeSuspend")
public final class C1730600v8U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C180M LLILLJJLI;
    public final /* synthetic */ IMessage LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1730600v8U(C180M c180m, IMessage iMessage, InterfaceC1364105Vn<? super C1730600v8U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c180m;
        this.LLILLL = iMessage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1730600v8U(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0145 A[PHI: r12
      0x0145: PHI (r12v1 int) = (r12v0 int), (r12v0 int), (r12v3 int), (r12v3 int) binds: [B:69:0x00e2, B:71:0x00e5, B:75:0x00eb, B:77:0x00ee] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0152  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1730600v8U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
