package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.text.u;
import njp.a;

/* JADX INFO: renamed from: X.03iX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess$showAppNotInstalledDialog$1", f = "PaymentResultProcess.kt", l = {}, m = "invokeSuspend")
public final class C919103iX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C19EG LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C919103iX(C19EG c19eg, String str, Function0<Unit> function0, InterfaceC1364105Vn<? super C919103iX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c19eg;
        this.LLILLJJLI = str;
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C919103iX(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentResultProcess@6ad4.showAppNotInstalledDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (!this.LL.isFinishing() && !this.LL.isDestroyed()) {
            C19EG c19eg = this.LL;
            C1397580mTM c1397580mTM = new C1397580mTM(c19eg);
            c1397580mTM.LJI(u.LJJIFFI(c19eg.getString(2131832546), "{{payment_method}}", this.LLILLJJLI, false));
            c1397580mTM.LIZIZ(u.LJJIFFI(this.LL.getString(2131832531), "{{payment_method}}", this.LLILLJJLI, false));
            c1397580mTM.LJIIIIZZ = true;
            C985403tE.LIZ(c1397580mTM, AFwS228S0000000_1.get$arr$(228));
            c1397580mTM.LJII = true;
            c1397580mTM.LIZLLL(new AwS580S0100000_1(this.LLILLL, (Function0<Unit>) 170));
            new C1397510mTF(c1397580mTM).LIZLLL();
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("PaymentResultProcess@6ad4.showAppNotInstalledDialog$1");
            return unit;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.showAppNotInstalledDialog$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
