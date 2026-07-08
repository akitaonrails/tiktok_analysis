package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS569S0100000_25;
import njp.a;

/* JADX INFO: renamed from: X.0u67, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.factory.SignupPagerKt$AlwaysUseTargetPageHeightPager$1$1", f = "SignupPager.kt", l = {137}, m = "invokeSuspend")
public final class C1690690u67 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC1690640u62 LLILLL;
    public final /* synthetic */ InterfaceC1676320tiw LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1690690u67(AbstractC1690640u62 abstractC1690640u62, InterfaceC1676320tiw interfaceC1676320tiw, InterfaceC1364105Vn<? super C1690690u67> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC1690640u62;
        this.LLILZ = interfaceC1676320tiw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1690690u67 c1690690u67 = new C1690690u67(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c1690690u67.LLILLJJLI = obj;
        return c1690690u67;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SignupPagerKt@6476.AlwaysUseTargetPageHeightPager$1$1");
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
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            if (this.LLILLL.LIZIZ()) {
                C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS569S0100000_25(this.LLILLL, 1117));
                C1690680u66 c1690680u66 = new C1690680u66(interfaceC497601wk, this.LLILLL, this.LLILZ, null);
                this.LL = 1;
                if (C09IC.LJII(c095dLJIIIZ, this, c1690680u66) == objLJFF) {
                    C1C7U.LIZIZ("SignupPagerKt@6476.AlwaysUseTargetPageHeightPager$1$1");
                    return objLJFF;
                }
            } else {
                this.LLILZ.LJIIJ(0);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignupPagerKt@6476.AlwaysUseTargetPageHeightPager$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
