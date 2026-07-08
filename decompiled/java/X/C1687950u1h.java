package X;

import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0u1h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.ui.login.ComposeLoginChannelColumnKt$ChannelContainer$2$1$1", f = "ComposeLoginChannelColumn.kt", l = {}, m = "invokeSuspend")
public final class C1687950u1h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ SignupViewModel LLILLL;
    public final /* synthetic */ C05P1<Float> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1687950u1h(int i, int i2, SignupViewModel signupViewModel, C05P1<Float> c05p1, InterfaceC1364105Vn<? super C1687950u1h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = i2;
        this.LLILLL = signupViewModel;
        this.LLILZ = c05p1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1687950u1h(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ComposeLoginChannelColumnKt@5bbb.ChannelContainer$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL == this.LLILLJJLI) {
            SignupViewModel signupViewModel = this.LLILLL;
            float fFloatValue = this.LLILZ.getValue().floatValue();
            C786410Ut5.B5(signupViewModel.HQ2().LIZ, fFloatValue);
            C786410Ut5.T4(signupViewModel.HQ2().LIZIZ, fFloatValue);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ComposeLoginChannelColumnKt@5bbb.ChannelContainer$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
