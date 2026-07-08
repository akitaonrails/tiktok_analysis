package X;

import com.ss.android.ugc.aweme.minis.model.payment.coupon.TiktokMinisMonetizationCheckQcpxResponse;
import com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponAssem;
import com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponViewModel;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CWX, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.payment.qcpx.MinisCouponAssem$showSurfacePopupHandler$2$1$1", f = "MinisCouponAssem.kt", l = {BaseNotice.CREATOR, 67}, m = "invokeSuspend")
public final class C0CWX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ MinisCouponAssem LLILLJJLI;
    public final /* synthetic */ Function2<Boolean, String, Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0CWX(MinisCouponAssem minisCouponAssem, Function2<? super Boolean, ? super String, Unit> function2, InterfaceC1364105Vn<? super C0CWX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = minisCouponAssem;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CWX(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisCouponAssem@34fb.showSurfacePopupHandler$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("MinisCouponAssem@34fb.showSurfacePopupHandler$2$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            MinisCouponViewModel minisCouponViewModelFo = this.LLILLJJLI.fo();
            this.LL = 1;
            obj = minisCouponViewModelFo.wQ2(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("MinisCouponAssem@34fb.showSurfacePopupHandler$2$1$1");
                return objLJFF;
            }
        }
        TiktokMinisMonetizationCheckQcpxResponse tiktokMinisMonetizationCheckQcpxResponse = (TiktokMinisMonetizationCheckQcpxResponse) obj;
        if (tiktokMinisMonetizationCheckQcpxResponse == null) {
            this.LLILLL.invoke(true, "");
            Unit unit2 = Unit.LIZ;
            C1C7U.LIZIZ("MinisCouponAssem@34fb.showSurfacePopupHandler$2$1$1");
            return unit2;
        }
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C1392010mKN c1392010mKN = new C1392010mKN(tiktokMinisMonetizationCheckQcpxResponse, this.LLILLJJLI, this.LLILLL, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c1392010mKN) == objLJFF) {
            C1C7U.LIZIZ("MinisCouponAssem@34fb.showSurfacePopupHandler$2$1$1");
            return objLJFF;
        }
        Unit unit3 = Unit.LIZ;
        C1C7U.LIZIZ("MinisCouponAssem@34fb.showSurfacePopupHandler$2$1$1");
        return unit3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
