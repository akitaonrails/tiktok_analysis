package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginSignupTabFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ti8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.LoginSignupTabFragment$onActivityResult$2$1", f = "LoginSignupTabFragment.kt", l = {}, m = "invokeSuspend")
public final class C754140Ti8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LoginSignupTabFragment LL;
    public final /* synthetic */ Bundle LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754140Ti8(LoginSignupTabFragment loginSignupTabFragment, Bundle bundle, int i, InterfaceC1364105Vn<? super C754140Ti8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = loginSignupTabFragment;
        this.LLILLJJLI = bundle;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754140Ti8(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1BV2 c1bv2;
        C1C7U.LIZ("LoginSignupTabFragment@2c72.onActivityResult$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILZIL = this.LLILLJJLI.getLong("close_3p_time_ms");
        this.LL.LLILZ = this.LLILLJJLI.getBoolean("is_cancelled");
        if (this.LLILLL != -1) {
            LoginSignupTabFragment loginSignupTabFragment = this.LL;
            if ((!loginSignupTabFragment.LLILZ || loginSignupTabFragment.LLILZIL >= loginSignupTabFragment.LLILLL) && (c1bv2 = loginSignupTabFragment.LLILLJJLI) != null) {
                String string = this.LLILLJJLI.getString("platform", "");
                LoginSignupTabFragment loginSignupTabFragment2 = this.LL;
                c1bv2.LIZLLL(loginSignupTabFragment2.LLILZIL, string, loginSignupTabFragment2.LLILZ);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LoginSignupTabFragment@2c72.onActivityResult$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
