package X;

import android.net.Uri;
import android.os.RemoteException;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0W5A, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.otl.LoginCustomTabLauncher$startMessageChannel$1$1", f = "LoginCustomTabLauncher.kt", l = {220}, m = "invokeSuspend")
public final class C0W5A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C0WW6 LLILLJJLI;
    public final /* synthetic */ C0WW5 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0W5A(C0WW6 c0ww6, C0WW5 c0ww5, InterfaceC1364105Vn<? super C0W5A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ww6;
        this.LLILLL = c0ww5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0W5A(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean zLLJJL;
        C1C7U.LIZ("LoginCustomTabLauncher@5226.startMessageChannel$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C155000ia.LIZIZ(obj);
        do {
            C0WW6 c0ww6 = this.LLILLJJLI;
            if (!c0ww6.LJIIIZ) {
                try {
                    C0W59 c0w59 = c0ww6.LIZJ;
                    Uri uriBuild = UriProtector.parse(c0ww6.LJI).buildUpon().clearQuery().build();
                    c0w59.getClass();
                    try {
                        if (c0w59.LJ != null) {
                            zLLJJL = c0w59.LIZIZ.LLJILJIL(c0w59.LIZJ, uriBuild, c0w59.LIZ(null));
                        } else {
                            zLLJJL = c0w59.LIZIZ.LLJJL(c0w59.LIZJ, uriBuild);
                        }
                    } catch (RemoteException e) {
                        TryCatchGuardChecker.doCheck(e);
                        zLLJJL = false;
                    }
                    if (!zLLJJL) {
                        C0WW5 c0ww5 = this.LLILLL;
                        C0WW6 c0ww62 = this.LLILLJJLI;
                        c0ww5.getClass();
                        C0WW5.LJIIJ(c0ww62, false, "channel request failed");
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C0WW5 c0ww52 = this.LLILLL;
                    C0WW6 c0ww63 = this.LLILLJJLI;
                    c0ww52.getClass();
                    C0WW5.LJIIJ(c0ww63, false, "channel request error");
                }
                this.LLILLJJLI.LJIIJJI++;
                this.LL = 1;
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LoginCustomTabLauncher@5226.startMessageChannel$1$1");
                return unit;
            }
        } while (AnonymousClass0958.LIZIZ(1000L, this) != objLJFF);
        C1C7U.LIZIZ("LoginCustomTabLauncher@5226.startMessageChannel$1$1");
        return objLJFF;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
