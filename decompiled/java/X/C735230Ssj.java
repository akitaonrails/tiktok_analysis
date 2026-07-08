package X;

import android.content.Context;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ssj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.localservice.optimistic.base.LoginOptimisticPlugin$execute$2", f = "LoginOptimisticPlugin.kt", l = {43}, m = "invokeSuspend")
public final class C735230Ssj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Boolean>, Object> {
    public int LL;
    public final /* synthetic */ C735220Ssi LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C735230Ssj(C735220Ssi c735220Ssi, InterfaceC1364105Vn<? super C735230Ssj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c735220Ssi;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C735230Ssj(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C19EG c19egLIZIZ;
        Object objLIZ = obj;
        C1C7U.LIZ("LoginOptimisticPlugin@8a8e.execute$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(objLIZ);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(objLIZ);
            IUserService iUserService = (IUserService) PluggableExtentionKt.pluggableSpi$default(IUserService.class, false, false, false, 14, null);
            if (iUserService != null && iUserService.isLogin()) {
                C1C7U.LIZIZ("LoginOptimisticPlugin@8a8e.execute$2");
                return true;
            }
            Context context = this.LLILLJJLI.LIZ;
            if (context != null && (c19egLIZIZ = C1388190mED.LIZIZ(context)) != null) {
                C735220Ssi c735220Ssi = this.LLILLJJLI;
                this.LL = 1;
                C23260099m c23260099m = new C23260099m(C099M.LIZLLL(this));
                C0XPD.LIZIZ(c19egLIZIZ, c735220Ssi.LIZIZ, c735220Ssi.LIZJ, c735220Ssi.LIZLLL, new C738960Syk(c735220Ssi, c23260099m, 8));
                objLIZ = c23260099m.LIZ();
                if (objLIZ == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (objLIZ == objLJFF) {
                    C1C7U.LIZIZ("LoginOptimisticPlugin@8a8e.execute$2");
                    return objLJFF;
                }
            } else {
                Function1<C0OAF, Unit> function1 = this.LLILLJJLI.LJFF;
                if (function1 != null) {
                    function1.invoke(new C0OAF(101, "fragmentActivity is null", null));
                }
                C1C7U.LIZIZ("LoginOptimisticPlugin@8a8e.execute$2");
                return false;
            }
        }
        C1C7U.LIZIZ("LoginOptimisticPlugin@8a8e.execute$2");
        return objLIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
