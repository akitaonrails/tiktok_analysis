package X;

import com.ss.android.ugc.aweme.account.login.auth.SignupViewModel;
import com.ss.android.ugc.aweme.account.login.auth.ui.login.SmsInputViewModel;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.services.GSMAService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS133S1100000_19;
import kotlin.jvm.internal.AwS168S1100000_19;
import kotlin.jvm.internal.AwS563S0100000_19;

/* JADX INFO: renamed from: X.0iLX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238970iLX extends C09AY implements Function0<Unit> {
    public final /* synthetic */ SmsInputViewModel LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ SignupViewModel LLILZLL;
    public final /* synthetic */ boolean LLIZ;
    public final /* synthetic */ C05P1<C1238980iLY> LLIZLLLIL;
    public final /* synthetic */ String LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1238970iLX(SmsInputViewModel smsInputViewModel, String str, String str2, String str3, String str4, SignupViewModel signupViewModel, boolean z, C05P0 c05p0, String str5) {
        super(0);
        this.LL = smsInputViewModel;
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
        this.LLILZLL = signupViewModel;
        this.LLIZ = z;
        this.LLIZLLLIL = c05p0;
        this.LLJ = str5;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        this.LL.wQ2(true);
        if (PhoneNumberUtil.LIZJ(C1669520tXy.LIZJ(this.LLIZLLLIL).LJ).length() == 0) {
            this.LL.vQ2(this.LLILLJJLI);
        } else {
            GSMAService.INSTANCE.mobSendCodeInsteadClick(this.LLILLL, this.LLILZ, "signup");
            if (PhoneNumberUtil.LJFF(PhoneNumberUtil.LIZIZ(C1669520tXy.LIZJ(this.LLIZLLLIL).LJ), PhoneNumberUtil.LIZJ(C1669520tXy.LIZJ(this.LLIZLLLIL).LJ))) {
                this.LLILZLL.SQ2(C1669520tXy.LIZJ(this.LLIZLLLIL).LJ, new AwS563S0100000_19(this.LL, 3418), new AwS168S1100000_19(this.LL, this.LLJ, 14), new AwS133S1100000_19(this.LL, this.LLJ, 35), this.LLIZ ? Boolean.valueOf(C1669520tXy.LIZJ(this.LLIZLLLIL).LJFF) : null, "opt_out");
            } else {
                this.LL.vQ2(this.LLILZIL);
            }
        }
        return Unit.LIZ;
    }
}
