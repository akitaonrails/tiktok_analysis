package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05qW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.sdk.ReadReceiptHelper$acknowledgeNoticeRead$1$1", f = "ReadReceiptHelper.kt", l = {87}, m = "invokeSuspend")
public final class C1478205qW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09AJ<BaseResponse> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1478205qW(C09AJ<BaseResponse> c09aj, InterfaceC1364105Vn<? super C1478205qW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09aj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1478205qW(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ReadReceiptHelper@c6f4.acknowledgeNoticeRead$1$1");
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
            InterfaceC315700CZc imPopupService = C1336205Ku.LIZ(false).getImPopupService();
            this.LL = 1;
            if (imPopupService.LIZIZ(2, "msg_read_status_notice", "dm_chat", null, this) == objLJFF) {
                C1C7U.LIZIZ("ReadReceiptHelper@c6f4.acknowledgeNoticeRead$1$1");
                return objLJFF;
            }
        }
        this.LLILLJJLI.onComplete();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ReadReceiptHelper@c6f4.acknowledgeNoticeRead$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
