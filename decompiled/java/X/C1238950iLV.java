package X;

import androidx.lifecycle.ViewModelKt;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAExperiment;
import com.ss.android.ugc.aweme.account.experiment.AccountGSMAPhase2Experiment;
import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SmsInputViewModel;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.services.GSMAService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS168S1100000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iLV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238950iLV extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SmsInputViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ SignupViewModel LLIZLLLIL;
    public final /* synthetic */ C05P1<C1238980iLY> LLJ;
    public final /* synthetic */ String LLJI;
    public final /* synthetic */ String LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238950iLV(SmsInputViewModel smsInputViewModel, String str, String str2, String str3, String str4, String str5, boolean z, SignupViewModel signupViewModel, C05P0 c05p0, String str6, String str7) {
        super(0);
        this.LL = smsInputViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = str5;
        this.LLIZ = z;
        this.LLIZLLLIL = signupViewModel;
        this.LLJ = c05p0;
        this.LLJI = str6;
        this.LLJIJIL = str7;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.wQ2(true);
        if (PhoneNumberUtil.LIZJ(C1669520tXy.LIZJ(this.LLJ).LJ).length() == 0) {
            this.LL.vQ2(this.LLILLJJLI);
        } else {
            C853660XeG c853660XeG = C853660XeG.LIZ;
            String str = this.LLILLL;
            String str2 = this.LLILZ;
            String str3 = this.LLILZIL;
            c853660XeG.getClass();
            C853660XeG.LJI(str, str2, str3);
            if (PhoneNumberUtil.LJFF(PhoneNumberUtil.LIZIZ(C1669520tXy.LIZJ(this.LLJ).LJ), PhoneNumberUtil.LIZJ(C1669520tXy.LIZJ(this.LLJ).LJ))) {
                boolean z = C1669520tXy.LIZJ(this.LLJ).LIZ && this.LLIZ;
                C1238940iLU c1238940iLU = new C1238940iLU(z, this.LLIZLLLIL, this.LLJ, this.LL, this.LLJI);
                if (AccountGSMAPhase2Experiment.LIZJ()) {
                    SignupViewModel signupViewModel = this.LLIZLLLIL;
                    String str4 = C1669520tXy.LIZJ(this.LLJ).LJ;
                    signupViewModel.getClass();
                    GSMAService.INSTANCE.getGSMACodePhase2(ViewModelKt.getViewModelScope(signupViewModel), str4, EnumC852910Xd3.PHONE_SMS_SIGN_UP, signupViewModel.getEnterFrom(), signupViewModel.getEnterMethod(), signupViewModel.BQ2(), c1238940iLU);
                } else {
                    SignupViewModel signupViewModel2 = this.LLIZLLLIL;
                    String str5 = C1669520tXy.LIZJ(this.LLJ).LJ;
                    AwS563S0100000_19 awS563S0100000_19 = new AwS563S0100000_19(this.LL, 3415);
                    AwS168S1100000_19 awS168S1100000_19 = new AwS168S1100000_19(this.LL, this.LLJI, 12);
                    AwS133S1100000_19 awS133S1100000_19 = new AwS133S1100000_19(this.LL, this.LLJIJIL, 33);
                    Boolean boolValueOf = z ? Boolean.valueOf(C1669520tXy.LIZJ(this.LLJ).LJFF) : null;
                    signupViewModel2.getClass();
                    AccountGSMAExperiment.LIZ.getClass();
                    if (AccountGSMAExperiment.LIZIZ()) {
                        GSMAService.INSTANCE.getGSMACode("account_gsma_signup_trigger", str5, EnumC852910Xd3.PHONE_SMS_SIGN_UP, signupViewModel2.getEnterFrom(), signupViewModel2.getEnterMethod(), "signup", c1238940iLU);
                    } else {
                        signupViewModel2.SQ2(str5, awS563S0100000_19, awS168S1100000_19, awS133S1100000_19, boolValueOf, null);
                    }
                }
            } else {
                int i = C1238900iLQ.LLJILJILJ;
                C1238920iLS.LIZ(null, this.LLILZ, this.LLILLL, this.LLILZIL, null, 96);
                this.LL.vQ2(this.LLILZLL);
            }
        }
        return Unit.LIZ;
    }
}
