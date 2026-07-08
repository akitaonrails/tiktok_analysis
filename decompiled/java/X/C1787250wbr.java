package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0wbr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.bytedance.iap.core.payment.action.external.ListenToWebPaymentUpdateAction$perform$paymentStatus$1", f = "ListenToWebPaymentUpdateAction.kt", l = {BaseNotice.CREATOR}, m = "invokeSuspend")
public final class C1787250wbr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super String>, Object> {
    public int LL;
    public final /* synthetic */ InterfaceC346201Wa<C1882807Za> LLILLJJLI;
    public final /* synthetic */ C1787220wbo LLILLL;
    public final /* synthetic */ C1787830wcn LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1787250wbr(InterfaceC346201Wa<C1882807Za> interfaceC346201Wa, C1787220wbo c1787220wbo, C1787830wcn c1787830wcn, InterfaceC1364105Vn<? super C1787250wbr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = interfaceC346201Wa;
        this.LLILLL = c1787220wbo;
        this.LLILZ = c1787830wcn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1787250wbr(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1864870yd3 c1864870yd3;
        C1C7U.LIZ("ListenToWebPaymentUpdateAction@dbeb.perform$paymentStatus$1");
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
            InterfaceC346201Wa<C1882807Za> interfaceC346201Wa = this.LLILLJJLI;
            if (interfaceC346201Wa != null) {
                c1864870yd3 = new C1864870yd3(new C1864870yd3(interfaceC346201Wa, 19), 20);
            } else {
                c1864870yd3 = null;
            }
            C1864870yd3 c1864870yd32 = new C1864870yd3(new C1864860yd2(this.LLILLL.LIZ.LIZLLL().LIZ(), this.LLILZ, 11), 21);
            this.LLILLL.getClass();
            C09IW c09iw = new C09IW(c1864870yd32, c1864870yd3, null);
            this.LL = 1;
            obj = C099A.LIZJ(900000L, c09iw, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ListenToWebPaymentUpdateAction@dbeb.perform$paymentStatus$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("ListenToWebPaymentUpdateAction@dbeb.perform$paymentStatus$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
