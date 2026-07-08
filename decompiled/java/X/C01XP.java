package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01XP, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.profile.info.identifier.page.mob.ProfileIdentifierMobHelper$mobRequestResult$1", f = "ProfileIdentifierMobHelper.kt", l = {}, m = "invokeSuspend")
public final class C01XP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01XP(long j, int i, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = i;
        this.LLILZIL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        String str3 = this.LLILLL;
        return new C01XP(this.LLILZIL, this.LLILZ, str, str2, str3, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileIdentifierMobHelper@8587.mobRequestResult$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ("to_user_id", this.LL);
        c2344009Gk.LJIIIIZZ("log_id", this.LLILLJJLI);
        c2344009Gk.LJIIIIZZ("result", this.LLILLL);
        c2344009Gk.LIZJ(this.LLILZ, "status_code");
        c2344009Gk.LIZLLL(this.LLILZIL, "duration");
        C01XQ.LIZJ(c2344009Gk, "profile_identifier_request_result");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProfileIdentifierMobHelper@8587.mobRequestResult$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
