package X;

import com.ss.android.ugc.aweme.account.changemail.VerifyEmailBeforeChangeFragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyEmailForTicketFragment;
import com.ss.android.ugc.aweme.account.login.twostep.VerifyPhoneForTicketFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragmentV2;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneNon1pBindFragment;
import com.ss.android.ugc.aweme.account.setpwd.EmailCodeChangePwdFragment;
import com.ss.android.ugc.aweme.account.setpwd.PhoneChangePwdVerifyFragment;
import com.ss.android.ugc.aweme.account.verify.VerifyPhoneFragment;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Xfw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C854700Xfw implements InterfaceC781210Ukh {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC781210Ukh
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
            case BdTuring.TYPE_EMAIL /* 11 */:
                run$11(this);
                break;
        }
    }

    public static final void run$0(C854700Xfw c854700Xfw) {
        ((PhoneNon1pBindFragment) c854700Xfw.l0).oT();
    }

    public static final void run$1(C854700Xfw c854700Xfw) {
        ((PhoneNon1pBindFragment) c854700Xfw.l0).oT();
    }

    public static final void run$10(C854700Xfw c854700Xfw) {
        ((VerifyEmailForTicketFragment) c854700Xfw.l0).oT();
    }

    public static final void run$11(C854700Xfw c854700Xfw) {
        ((VerifyPhoneForTicketFragment) c854700Xfw.l0).oT();
    }

    public static final void run$2(C854700Xfw c854700Xfw) {
        ((VerifyPhoneFragment) c854700Xfw.l0).oT();
    }

    public static final void run$3(C854700Xfw c854700Xfw) {
        ((InputCodeFragmentV2.VerifyCodeActions.ClickResendEmailCodeAction) ((InterfaceC853790XeT) c854700Xfw.l0)).getFragment().oT();
    }

    public static final void run$4(C854700Xfw c854700Xfw) {
        C0XU7 c0xu7 = (C0XU7) c854700Xfw.l0;
        if (c0xu7 != null) {
            c0xu7.LIZIZ();
        }
    }

    public static final void run$5(C854700Xfw c854700Xfw) {
        ((EmailCodeChangePwdFragment) c854700Xfw.l0).oT();
    }

    public static final void run$6(C854700Xfw c854700Xfw) {
        ((PhoneChangePwdVerifyFragment) c854700Xfw.l0).oT();
    }

    public static final void run$7(C854700Xfw c854700Xfw) {
        ((VerifyEmailBeforeChangeFragment) c854700Xfw.l0).oT();
    }

    public static final void run$8(C854700Xfw c854700Xfw) {
        Function0 function0 = (Function0) c854700Xfw.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public static final void run$9(C854700Xfw c854700Xfw) {
        Function0 function0 = (Function0) c854700Xfw.l0;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public C854700Xfw(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }
}
