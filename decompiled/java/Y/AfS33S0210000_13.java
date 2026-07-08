package Y;

import X.C09JN;
import X.C0XO3;
import X.C0XYO;
import X.C1BWL;
import X.C1C7U;
import X.C786410Ut5;
import X.C813020Vuu;
import X.C850340XXk;
import X.EnumC852660Xce;
import X.EnumC852910Xd3;
import android.app.backup.BackupManager;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.AutobackupService;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment;
import com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment;
import com.ss.android.ugc.aweme.base.api.BaseResponse;
import com.ss.android.ugc.aweme.compliance.business.serviceimpl.PolicyNoticeServiceImpl;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes14.dex */
public class AfS33S0210000_13 implements C09JN {
    public final int $t;
    public Object l0;
    public Object l1;
    public boolean z2;

    @Override // X.C09JN
    public final void accept(Object obj) throws JSONException {
        switch (this.$t) {
            case 0:
                accept$0(this, obj);
                break;
            case 1:
                accept$1(this, obj);
                break;
            case 2:
                accept$2(this, obj);
                break;
        }
    }

    public static final void accept$0(AfS33S0210000_13 afS33S0210000_13, Object obj) throws JSONException {
        C1C7U.LIZ("PhoneLoginFragment@bda3.onGSMASuccess$2");
        C850340XXk c850340XXk = (C850340XXk) obj;
        PhoneNumberUtil.PhoneNumber phoneNumber = (PhoneNumberUtil.PhoneNumber) afS33S0210000_13.l0;
        if (phoneNumber != null) {
            C813020Vuu.LJIIL().LJIIJJI(((PhoneLoginFragment) afS33S0210000_13.l1).getContext(), "country", phoneNumber.getCountryIso());
        }
        if (c850340XXk.LJIIIZ != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("need_show_gsma_toast", !afS33S0210000_13.z2);
            C0XYO c0xyo = C0XYO.LIZ;
            PhoneLoginFragment phoneLoginFragment = (PhoneLoginFragment) afS33S0210000_13.l1;
            EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
            EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_LOGIN;
            C0XO3 c0xo3 = c850340XXk.LJIIIZ;
            c0xyo.getClass();
            C0XYO.LIZJ(phoneLoginFragment, phoneLoginFragment, enumC852660Xce, enumC852910Xd3, jSONObject, c0xo3);
        }
        C1C7U.LIZIZ("PhoneLoginFragment@bda3.onGSMASuccess$2");
    }

    public static final void accept$1(AfS33S0210000_13 afS33S0210000_13, Object obj) throws JSONException {
        C1C7U.LIZ("PhoneSignUpFragment@a8be.onGSMASuccess$2");
        C850340XXk c850340XXk = (C850340XXk) obj;
        C813020Vuu.LJIIL().LJIIJJI(((PhoneSignUpFragment) afS33S0210000_13.l0).getContext(), "country", ((PhoneNumberUtil.PhoneNumber) afS33S0210000_13.l1).getCountryIso());
        if (c850340XXk.LJIIIZ != null) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("need_show_gsma_toast", !afS33S0210000_13.z2);
            C0XYO c0xyo = C0XYO.LIZ;
            PhoneSignUpFragment phoneSignUpFragment = (PhoneSignUpFragment) afS33S0210000_13.l0;
            EnumC852660Xce enumC852660Xce = EnumC852660Xce.LOGIN;
            EnumC852910Xd3 enumC852910Xd3 = EnumC852910Xd3.PHONE_SMS_SIGN_UP;
            C0XO3 c0xo3 = c850340XXk.LJIIIZ;
            c0xyo.getClass();
            C0XYO.LIZJ(phoneSignUpFragment, phoneSignUpFragment, enumC852660Xce, enumC852910Xd3, jSONObject, c0xo3);
        }
        C1C7U.LIZIZ("PhoneSignUpFragment@a8be.onGSMASuccess$2");
    }

    public static final void accept$2(AfS33S0210000_13 afS33S0210000_13, Object obj) {
        C1C7U.LIZ("PolicyNoticeServiceImpl@4917.approvePoliceNotice$1");
        BaseResponse baseResponse = (BaseResponse) obj;
        if (afS33S0210000_13.z2) {
            AutobackupService.LIZJ().LIZIZ().edit().putLong("last_acceptance_time", baseResponse.extra.now).apply();
            BackupManager.dataChanged(C1BWL.LIZ().getPackageName());
        }
        if (Intrinsics.LJFF((Boolean) afS33S0210000_13.l0, Boolean.TRUE)) {
            ((PolicyNoticeServiceImpl) afS33S0210000_13.l1).getClass();
            C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.0zwW
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PolicyNoticeServiceImpl@4917.refreshComplianceSetting$1");
                    try {
                        C102U.LIZ.getClass();
                        C102U.LIZJ().LIZ(null, 0);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PolicyNoticeServiceImpl@4917.refreshComplianceSetting$1");
                }
            });
        }
        C1C7U.LIZIZ("PolicyNoticeServiceImpl@4917.approvePoliceNotice$1");
    }

    public AfS33S0210000_13(Object obj, boolean z, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.z2 = z;
        this.l1 = obj2;
    }
}
