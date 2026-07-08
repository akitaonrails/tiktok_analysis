package X;

import com.bytedance.im.core.proto.SendMessageResponseBody;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XvK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.im.core.internal.link.usecase.sendmsg.SendMsgUseCase$sendMessageOverNetwork$sendMessageResponse$networkResponse$1", f = "SendMsgUseCase.kt", l = {315}, m = "invokeSuspend")
public final class C864240XvK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super SendMessageResponseBody>, Object> {
    public int LL;
    public final /* synthetic */ C0YC5 LLILLJJLI;
    public final /* synthetic */ C0YCX LLILLL;
    public final /* synthetic */ C869590Y9l LLILZ;
    public final /* synthetic */ C0YC8 LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C864240XvK(C0YC5 c0yc5, C0YCX c0ycx, C869590Y9l c869590Y9l, C0YC8 c0yc8, InterfaceC1364105Vn<? super C864240XvK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0yc5;
        this.LLILLL = c0ycx;
        this.LLILZ = c869590Y9l;
        this.LLILZIL = c0yc8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C864240XvK(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super SendMessageResponseBody> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SendMsgUseCase@4b94.sendMessageOverNetwork$sendMessageResponse$networkResponse$1");
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
            C868780Y6i c868780Y6iLIZLLL = this.LLILLJJLI.LIZIZ.LIZLLL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("job is running on ");
            sbLIZ.append(C786410Ut5.u3().getName());
            C868780Y6i.LJIILJJIL(c868780Y6iLIZLLL, "SendMsgUseCase", C2188811AlT.LIZIZ(sbLIZ), 4);
            C0YC5 c0yc5 = this.LLILLJJLI;
            C0YCX c0ycx = this.LLILLL;
            C869590Y9l c869590Y9l = this.LLILZ;
            C0YC8 c0yc8 = this.LLILZIL;
            this.LL = 1;
            obj = c0yc5.LIZJ(c0ycx, c869590Y9l, c0yc8, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("SendMsgUseCase@4b94.sendMessageOverNetwork$sendMessageResponse$networkResponse$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("SendMsgUseCase@4b94.sendMessageOverNetwork$sendMessageResponse$networkResponse$1");
        return obj;
    }
}
