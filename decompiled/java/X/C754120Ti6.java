package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ti6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity$activityResultContracts$1$onActivityResult$2$1", f = "I18nSignUpActivity.kt", l = {}, m = "invokeSuspend")
public final class C754120Ti6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ I18nSignUpActivity LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754120Ti6(I18nSignUpActivity i18nSignUpActivity, Bundle bundle, int i, InterfaceC1364105Vn<? super C754120Ti6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i18nSignUpActivity;
        this.LLILLJJLI = bundle;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754120Ti6(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1BV2 c1bv2;
        C1C7U.LIZ("I18nSignUpActivity@349e.activityResultContracts$1$onActivityResult$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJLIL = this.LLILLJJLI.getLong("close_3p_time_ms");
        this.LL.LLJL = this.LLILLJJLI.getBoolean("is_cancelled");
        if (this.LLILLL != -1) {
            I18nSignUpActivity i18nSignUpActivity = this.LL;
            if ((!i18nSignUpActivity.LLJL || i18nSignUpActivity.LLJLIL >= i18nSignUpActivity.LLJJLIIIJLLLLLLLZ) && (c1bv2 = i18nSignUpActivity.LLJJI) != null) {
                String string = this.LLILLJJLI.getString("platform", "");
                I18nSignUpActivity i18nSignUpActivity2 = this.LL;
                c1bv2.LIZLLL(i18nSignUpActivity2.LLJLIL, string, i18nSignUpActivity2.LLJL);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nSignUpActivity@349e.activityResultContracts$1$onActivityResult$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
