package X;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS11S2000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03hS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResultProcess$showErrorDialog$1", f = "PaymentResultProcess.kt", l = {}, m = "invokeSuspend")
public final class C912403hS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Context LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function0<Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C912403hS(Context context, String str, String str2, String str3, String str4, Function0<Unit> function0, InterfaceC1364105Vn<? super C912403hS> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = context;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C912403hS(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PaymentResultProcess@6ad4.showErrorDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        c1397580mTM.LIZIZ(this.LLILLJJLI);
        c1397580mTM.LJI(this.LLILLL);
        C985403tE.LIZ(c1397580mTM, new AwS11S2000000_1(this.LLILZ, this.LLILZIL, 3));
        c1397580mTM.LJII = false;
        c1397580mTM.LIZLLL(new AwS580S0100000_1(this.LLILZLL, (Function0<Unit>) 194));
        new C1397510mTF(c1397580mTM).LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PaymentResultProcess@6ad4.showErrorDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
