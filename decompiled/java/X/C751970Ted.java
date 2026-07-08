package X;

import Y.AgS308S0100000_28;
import com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ted, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.auth.I18nSignUpActivity$setupOldActivityContent$2$1", f = "I18nSignUpActivity.kt", l = {634}, m = "invokeSuspend")
public final class C751970Ted extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ I18nSignUpActivity LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C751970Ted(I18nSignUpActivity i18nSignUpActivity, InterfaceC1364105Vn<? super C751970Ted> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = i18nSignUpActivity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C751970Ted(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("I18nSignUpActivity@349e.setupOldActivityContent$2$1");
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
            InterfaceC346201Wa<C0D5P> interfaceC346201Wa = this.LLILLJJLI.LLLLZLLLI().LLILZIL;
            AgS308S0100000_28 agS308S0100000_28 = new AgS308S0100000_28(this.LLILLJJLI, 0);
            this.LL = 1;
            if (interfaceC346201Wa.collect(agS308S0100000_28, this) == objLJFF) {
                C1C7U.LIZIZ("I18nSignUpActivity@349e.setupOldActivityContent$2$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("I18nSignUpActivity@349e.setupOldActivityContent$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
