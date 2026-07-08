package X;

import android.content.Context;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05vq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.utils.EmailAuthorizationTextUtils$openEmailConsentOptOut$1", f = "EmailAuthorizationTextUtils.kt", l = {99}, m = "invokeSuspend")
public final class C1511205vq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Context LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1511205vq(Context context, String str, String str2, InterfaceC1364105Vn<? super C1511205vq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = context;
        this.LLILZ = str;
        this.LLILZIL = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1511205vq c1511205vq = new C1511205vq(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1511205vq.LLILLJJLI = obj;
        return c1511205vq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Object c098200Yq;
        C1C7U.LIZ("EmailAuthorizationTextUtils@dc15.openEmailConsentOptOut$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        Object obj2 = null;
        if (i != 0) {
            if (i == 1) {
                str = (String) this.LLILLJJLI;
                try {
                    C155000ia.LIZIZ(obj);
                } catch (Throwable th) {
                    th = th;
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            str = "https://www.tiktok.com/email/preference?hide_right=1";
            String str2 = this.LLILZIL;
            String str3 = this.LLILZ;
            try {
                C1DFB c1dfb = C0PEM.LIZJ;
                C1511305vr c1511305vr = new C1511305vr(str2, str3, null);
                this.LLILLJJLI = "https://www.tiktok.com/email/preference?hide_right=1";
                this.LL = 1;
                obj = C23250099c.LJI(this, c1dfb, c1511305vr);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("EmailAuthorizationTextUtils@dc15.openEmailConsentOptOut$1");
                    return objLJFF;
                }
            } catch (Throwable th2) {
                th = th2;
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
        }
        c098200Yq = (String) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj2 = c098200Yq;
        }
        String str4 = (String) obj2;
        if (str4 != null) {
            str = str4;
        }
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(this.LLILLL, "//webview/");
        smartRouteBuildRoute.withParam("url", str);
        smartRouteBuildRoute.withParam("enter_from", this.LLILZ);
        smartRouteBuildRoute.open();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EmailAuthorizationTextUtils@dc15.openEmailConsentOptOut$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
