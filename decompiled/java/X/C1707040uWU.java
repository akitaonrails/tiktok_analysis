package X;

import com.bytedance.pipo.verify.base.model.response.DoVerifyResponse;
import com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uWU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.pipo.verify.base.network.NetworkHandler$doVerify$2", f = "NetworkHandler.kt", l = {278}, m = "invokeSuspend")
public final class C1707040uWU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<DoVerifyResponse>>>, Object> {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1713530ugx LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1707040uWU(C1713530ugx c1713530ugx, String str, String str2, InterfaceC1364105Vn<? super C1707040uWU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1713530ugx;
        this.LLILZLL = str;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1707040uWU c1707040uWU = new C1707040uWU(this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c1707040uWU.LLILZ = obj;
        return c1707040uWU;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1707040uWU.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C0X52<BaseResponse<DoVerifyResponse>>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
