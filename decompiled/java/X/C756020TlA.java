package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS52S1300000_12;
import njp.a;

/* JADX INFO: renamed from: X.0TlA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.payment.bnpl.BnplMiddleActivity$showRetryDialog$1", f = "BnplMiddleActivity.kt", l = {}, m = "invokeSuspend")
public final class C756020TlA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ BnplMiddleActivity LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<C1397660mTU, Unit> LLILZ;
    public final /* synthetic */ Function1<C1397660mTU, Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C756020TlA(BnplMiddleActivity bnplMiddleActivity, int i, String str, Function1<? super C1397660mTU, Unit> function1, Function1<? super C1397660mTU, Unit> function12, InterfaceC1364105Vn<? super C756020TlA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bnplMiddleActivity;
        this.LLILLJJLI = i;
        this.LLILLL = str;
        this.LLILZ = function1;
        this.LLILZIL = function12;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C756020TlA(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BnplMiddleActivity@70bc.showRetryDialog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1397580mTM c1397580mTM = new C1397580mTM(this.LL);
        c1397580mTM.LIZ(this.LLILLJJLI);
        c1397580mTM.LJII = false;
        C985403tE.LIZ(c1397580mTM, new AwS52S1300000_12(this.LL, (BnplMiddleActivity) this.LLILLL, (String) this.LLILZ, (Function1<? super C1397660mTU, Unit>) this.LLILZIL, (Function1<? super C1397660mTU, Unit>) 2));
        new C1397510mTF(c1397580mTM).LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("BnplMiddleActivity@70bc.showRetryDialog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
