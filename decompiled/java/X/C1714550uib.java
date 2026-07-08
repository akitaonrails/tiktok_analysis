package X;

import com.ss.android.ugc.aweme.verify.pin.PinVerifyViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uib, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.verify.pin.PinVerifyViewModel$verifyPin$1", f = "PinVerifyViewModel.kt", l = {86, 101}, m = "invokeSuspend")
public final class C1714550uib extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ PinVerifyViewModel LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1714550uib(PinVerifyViewModel pinVerifyViewModel, String str, InterfaceC1364105Vn<? super C1714550uib> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = pinVerifyViewModel;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1714550uib(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ee A[PHI: r1
      0x00ee: PHI (r1v13 X.0X52<com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse<com.bytedance.pipo.verify.base.model.response.DoVerifyResponse>>) = 
      (r1v11 X.0X52<com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse<com.bytedance.pipo.verify.base.model.response.DoVerifyResponse>>)
      (r1v17 X.0X52<com.ss.android.ugc.aweme.pipo.common.network.model.BaseResponse<com.bytedance.pipo.verify.base.model.response.DoVerifyResponse>>)
     binds: [B:47:0x00ed, B:8:0x001d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1714550uib.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
