package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommonRetainDisplayInfo;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03LE, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.util.PaymentRetentionHelper$showAfterPaymentBindRetainDialog$container$1$1", f = "PaymentRetentionHelper.kt", l = {813, 829}, m = "invokeSuspend")
public final class C03LE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<InterfaceC1364105Vn<? super Boolean>, Object> LLILLL;
    public final /* synthetic */ CommonRetainDisplayInfo LLILZ;
    public final /* synthetic */ C19EG LLILZIL;
    public final /* synthetic */ C197039127h LLILZLL;
    public final /* synthetic */ Function0<Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C03LE(Function1<? super InterfaceC1364105Vn<? super Boolean>, ? extends Object> function1, CommonRetainDisplayInfo commonRetainDisplayInfo, C19EG c19eg, C197039127h c197039127h, Function0<Unit> function0, InterfaceC1364105Vn<? super C03LE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = commonRetainDisplayInfo;
        this.LLILZIL = c19eg;
        this.LLILZLL = c197039127h;
        this.LLIZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C03LE c03le = new C03LE(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c03le.LLILLJJLI = obj;
        return c03le;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("PaymentRetentionHelper@3a64.showAfterPaymentBindRetainDialog$container$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        boolean z = true;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    this.LLILZLL.setLoading(false);
                    String str = TuxSheet._pnsPageId;
                    C1391190mJ3.LJ(this.LLILZLL, C343970De7.LIZ);
                    this.LLIZ.invoke();
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("PaymentRetentionHelper@3a64.showAfterPaymentBindRetainDialog$container$1$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            Object obj2 = this.LLILLJJLI;
            Function1<InterfaceC1364105Vn<? super Boolean>, Object> function1 = this.LLILLL;
            this.LLILLJJLI = obj2;
            this.LL = 1;
            obj = function1.invoke(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("PaymentRetentionHelper@3a64.showAfterPaymentBindRetainDialog$container$1$1");
                return objLJFF;
            }
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        if (zBooleanValue) {
            string = this.LLILZ.successToast;
        } else {
            string = this.LLILZ.failureToast;
            if (string == null) {
                string = this.LLILZIL.getString(2131832931);
            }
        }
        if (string != null && string.length() != 0) {
            z = false;
        }
        if (!z) {
            try {
                C1389880mGw c1389880mGw = new C1389880mGw(this.LLILZLL);
                c1389880mGw.LJIIIZ(string);
                if (zBooleanValue) {
                    c1389880mGw.LJ(R.raw.icon_tick);
                    c1389880mGw.LJI(R.attr.ee);
                }
                c1389880mGw.LJIIJ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
            this.LLILLJJLI = null;
            this.LL = 2;
            if (AnonymousClass0958.LIZIZ(300L, this) == objLJFF) {
                C1C7U.LIZIZ("PaymentRetentionHelper@3a64.showAfterPaymentBindRetainDialog$container$1$1");
                return objLJFF;
            }
        }
        this.LLILZLL.setLoading(false);
        String str2 = TuxSheet._pnsPageId;
        C1391190mJ3.LJ(this.LLILZLL, C343970De7.LIZ);
        this.LLIZ.invoke();
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PaymentRetentionHelper@3a64.showAfterPaymentBindRetainDialog$container$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
