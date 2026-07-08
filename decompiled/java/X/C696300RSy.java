package X;

import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0RSy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.v2.ui.SignUpOrLoginActivity$setupRegionChangedListener$2$onChange$1", f = "SignUpOrLoginActivity.kt", l = {}, m = "invokeSuspend")
public final class C696300RSy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SignUpOrLoginActivity LL;
    public final /* synthetic */ TuxTextView LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C696300RSy(SignUpOrLoginActivity signUpOrLoginActivity, TuxTextView tuxTextView, InterfaceC1364105Vn<? super C696300RSy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = signUpOrLoginActivity;
        this.LLILLJJLI = tuxTextView;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C696300RSy(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SignUpOrLoginActivity@7602.setupRegionChangedListener$2$onChange$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLZLLLL(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SignUpOrLoginActivity@7602.setupRegionChangedListener$2$onChange$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
