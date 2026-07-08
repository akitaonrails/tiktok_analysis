package X;

import android.content.ComponentName;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0WWD, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.otl.LoginCustomTabLauncher$bindAndGetClient$2", f = "LoginCustomTabLauncher.kt", l = {426}, m = "invokeSuspend")
public final class C0WWD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C817470W4z>, Object> {
    public int LL;
    public final /* synthetic */ C0WW5 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0WWD(C0WW5 c0ww5, InterfaceC1364105Vn<? super C0WWD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0ww5;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0WWD(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LoginCustomTabLauncher@5226.bindAndGetClient$2");
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
            final C0WW5 c0ww5 = this.LLILLJJLI;
            this.LL = 1;
            final C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(this));
            c2252611DEt.LJIJJ();
            Context context = c0ww5.LIZ;
            String str = c0ww5.LIZIZ;
            if (str != null) {
                C817470W4z.LIZ(context, str, new C0W50() { // from class: X.0WWE
                    @Override // android.content.ServiceConnection
                    public final void onServiceDisconnected(ComponentName componentName) {
                        C0WW5 c0ww52 = c0ww5;
                        c0ww52.LIZJ = null;
                        C0WW6 c0ww6 = c0ww52.LIZLLL;
                        if (c0ww6 != null) {
                            C2296808zG.LIZJ(c0ww6.LIZLLL, null);
                        }
                        c0ww5.LIZLLL = null;
                    }

                    @Override // X.C0W50
                    public final void onCustomTabsServiceConnected(ComponentName componentName, C817470W4z c817470W4z) {
                        c0ww5.LIZJ = c817470W4z;
                        if (c2252611DEt.isActive()) {
                            InterfaceC20236714Gf<C817470W4z> interfaceC20236714Gf = c2252611DEt;
                            C189200o6.m2constructorimpl(c817470W4z);
                            interfaceC20236714Gf.resumeWith(c817470W4z);
                        }
                    }
                });
                obj = c2252611DEt.LJIJ();
                if (obj == C099R.LJFF()) {
                    C099Q.LIZJ(this);
                }
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("LoginCustomTabLauncher@5226.bindAndGetClient$2");
                    return objLJFF;
                }
            } else {
                "Required value was null.".toString();
                throw new IllegalArgumentException("Required value was null.");
            }
        }
        C1C7U.LIZIZ("LoginCustomTabLauncher@5226.bindAndGetClient$2");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C817470W4z> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
