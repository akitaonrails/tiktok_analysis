package X;

import com.bytedance.pipo.verify.base.model.response.GetPageResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.verify.base.network.NetworkHandler$getPage$2", f = "NetworkHandler.kt", l = {377}, m = "invokeSuspend")
public final class C1707020uWS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C0X52<BaseResponse<GetPageResponse>>>>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1713530ugx LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707020uWS(C1713530ugx c1713530ugx, InterfaceC1364105Vn<? super C1707020uWS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1713530ugx;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1707020uWS(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x00be  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 227
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1707020uWS.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C189200o6<? extends C0X52<BaseResponse<GetPageResponse>>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
