package X;

import com.ss.android.ugc.aweme.account.login.v2.network.LoginResponse;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.10hc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.Failed3PService$attemptLoginSafeUser$1$1", f = "Failed3PService.kt", l = {}, m = "invokeSuspend")
public final class C19316210hc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LoginResponse LL;
    public final /* synthetic */ C1BV2 LLILLJJLI;
    public final /* synthetic */ Map<String, String> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19316210hc(LoginResponse loginResponse, C1BV2 c1bv2, Map<String, String> map, InterfaceC1364105Vn<? super C19316210hc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = loginResponse;
        this.LLILLJJLI = c1bv2;
        this.LLILLL = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C19316210hc(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String string;
        C1C7U.LIZ("Failed3PService@8cb2.attemptLoginSafeUser$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0XO3 c0xo3LIZIZ = C19316410he.LIZIZ(this.LL, "failed_3p");
        if (c0xo3LIZIZ != null) {
            C1BV2 c1bv2 = this.LLILLJJLI;
            Map<String, String> map = this.LLILLL;
            C0XYO.LIZLLL(C0XYO.LIZ, c1bv2.LIZ, null, c0xo3LIZIZ, false, null, false, 112);
            C852170Xbr c852170Xbr = C852170Xbr.LIZ;
            C1BV9 c1bv9 = c1bv2.LIZIZ;
            c852170Xbr.getClass();
            C852170Xbr.LJIIL(false, "safe_auto_login", c1bv9, c0xo3LIZIZ, map);
            String strOptString = c0xo3LIZIZ.LJJIIJ.optString("username");
            if (strOptString != null && strOptString.length() != 0) {
                string = c1bv2.LIZ.getString(2131836821, strOptString);
            } else {
                string = c1bv2.LIZ.getString(2131846736);
            }
            C1389890mGx c1389890mGx = new C1389890mGx(c1bv2.LIZ);
            c1389890mGx.LJIIJ(string);
            c1389890mGx.LIZ(true);
            c1389890mGx.LJIIJJI();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Failed3PService@8cb2.attemptLoginSafeUser$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
