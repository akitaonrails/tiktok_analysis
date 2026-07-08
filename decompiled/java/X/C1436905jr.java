package X;

import com.ss.android.ugc.aweme.base.api.BaseResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05jr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.controller.utils.SendFeedbackHelper$sendApiRequest$2", f = "SendFeedbackHelper.kt", l = {}, m = "invokeSuspend")
public final class C1436905jr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function2<Integer, String, Unit> LL;
    public final /* synthetic */ BaseResponse LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1436905jr(Function2<? super Integer, ? super String, Unit> function2, BaseResponse baseResponse, InterfaceC1364105Vn<? super C1436905jr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = function2;
        this.LLILLJJLI = baseResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1436905jr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendFeedbackHelper@4377.sendApiRequest$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(C2286608xc.LJ(this.LLILLJJLI.status_code), this.LLILLJJLI.status_msg);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SendFeedbackHelper@4377.sendApiRequest$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
