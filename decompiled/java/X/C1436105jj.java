package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.profile.business.ur.impersonation.ImpersonationSubmitSuccessFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.impersonation.ImpersonationUtils$showImpersonationConfirmDialog$1$1$1", f = "ImpersonationUtils.kt", l = {65}, m = "invokeSuspend")
public final class C1436105jj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C19EG LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;
    public final /* synthetic */ C1397660mTU LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1436105jj(C19EG c19eg, Function0<Unit> function0, C1397660mTU c1397660mTU, String str, InterfaceC1364105Vn<? super C1436105jj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c19eg;
        this.LLILLL = function0;
        this.LLILZ = c1397660mTU;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1436105jj(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImpersonationUtils@9778.showImpersonationConfirmDialog$1$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                C1DFB c1dfb = C0PEM.LIZJ;
                C1436205jk c1436205jk = new C1436205jk(this.LLILZIL, null);
                this.LL = 1;
                if (C23250099c.LJI(this, c1dfb, c1436205jk) == objLJFF) {
                    C1C7U.LIZIZ("ImpersonationUtils@9778.showImpersonationConfirmDialog$1$1$1");
                    return objLJFF;
                }
            }
            C1440005kM.LIZ(new C1436405jm(false));
            new ImpersonationSubmitSuccessFragment().show(this.LLILLJJLI.getSupportFragmentManager(), "ImpersonationSubmitSuccessFragment");
            Function0<Unit> function0 = this.LLILLL;
            if (function0 != null) {
                function0.invoke();
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1389890mGx c1389890mGx = new C1389890mGx(this.LLILLJJLI);
            c1389890mGx.LJIIIZ(2131835079);
            c1389890mGx.LJIIJJI();
            this.LLILZ.LIZ().LIZIZ(null);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImpersonationUtils@9778.showImpersonationConfirmDialog$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
