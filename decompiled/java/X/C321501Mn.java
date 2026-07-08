package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.01Mn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel$fetchData$4", f = "MinisCouponViewModel.kt", l = {134}, m = "invokeSuspend")
public final class C321501Mn extends C09AX implements InterfaceC1631620sYq<InterfaceC346701Wf<Object>, Throwable, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ InterfaceC346701Wf LLILLJJLI;

    public C321501Mn(InterfaceC1364105Vn<? super C321501Mn> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisCouponViewModel@376a.fetchData$4");
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
            InterfaceC346701Wf interfaceC346701Wf = this.LLILLJJLI;
            this.LL = 1;
            if (interfaceC346701Wf.emit(null, this) == objLJFF) {
                C1C7U.LIZIZ("MinisCouponViewModel@376a.fetchData$4");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisCouponViewModel@376a.fetchData$4");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC346701Wf<Object> interfaceC346701Wf, Throwable th, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C321501Mn c321501Mn = new C321501Mn(interfaceC1364105Vn);
        c321501Mn.LLILLJJLI = interfaceC346701Wf;
        return c321501Mn.invokeSuspend(Unit.LIZ);
    }
}
