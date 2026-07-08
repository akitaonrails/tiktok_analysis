package X;

import android.app.Activity;
import android.os.Bundle;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ExitUnlinkPhoneEmailConfirmPageEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ExitUnlinkPhoneEmailPopupEvent;
import com.ss.android.ugc.aweme.account.eventtracking.bindings.ShowUnlinkPhoneEmailPopupEvent;
import com.ss.android.ugc.aweme.account.model.SafeEnvData;
import com.ss.android.ugc.aweme.account.model.TwoStepVerifyWays;
import com.ss.android.ugc.aweme.account.model.VerificationMethodType;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS207S0000000_19;
import kotlin.jvm.internal.AwS137S0110000_19;
import kotlin.jvm.internal.AwS157S0110000_19;
import kotlin.jvm.internal.AwS563S0100000_19;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0iFG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1235080iFG {
    public final Activity LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(new AwS563S0100000_19(this, 2950));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS207S0000000_19.get$arr$(662));
    public boolean LIZLLL;

    public final DialogC1389620mGW LJ() {
        return (DialogC1389620mGW) this.LIZIZ.getValue();
    }

    public final void LJIIJ() {
        LJIIJJI(this.LIZ.getString(2131835079));
    }

    public C1235080iFG(Activity activity) {
        this.LIZ = activity;
    }

    public final void LIZ(boolean z) {
        EnumC852630Xcb enumC852630Xcb;
        if (z) {
            enumC852630Xcb = EnumC852630Xcb.CHANGE_MOBILE;
        } else {
            enumC852630Xcb = EnumC852630Xcb.CHANGE_EMAIL;
        }
        LJIIIZ(enumC852630Xcb, new AwS563S0100000_19(this, 2948), new AwS157S0110000_19(this, z, 1));
    }

    public final void LIZIZ(boolean z) {
        EnumC852630Xcb enumC852630Xcb;
        if (z) {
            enumC852630Xcb = EnumC852630Xcb.UNBIND_MOBILE;
        } else {
            enumC852630Xcb = EnumC852630Xcb.UNBIND_EMAIL;
        }
        LJIIIZ(enumC852630Xcb, new AwS137S0110000_19(this, z, 6), new AwS157S0110000_19(this, z, 2));
    }

    public final void LIZJ(Bundle bundle) {
        bundle.putInt("phone_number_source", EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_ACCOUNT_MANAGEMENT_PHONE_NUMBER.getValue());
        C786410Ut5.LJJJI("page", "change_phone", bundle);
        C0XQ7.LIZ().bindMobile(this.LIZ, "security_checkup_page", bundle, true, (C0XTR) null);
    }

    public final void LJIIIIZZ(boolean z) {
        EnumC1235120iFK enumC1235120iFK;
        EnumC854510Xfd enumC854510Xfd;
        ShowUnlinkPhoneEmailPopupEvent showUnlinkPhoneEmailPopupEvent = new ShowUnlinkPhoneEmailPopupEvent();
        if (z) {
            enumC1235120iFK = EnumC1235120iFK.NULL;
        } else if (this.LIZLLL) {
            enumC1235120iFK = EnumC1235120iFK.DIGITAL_1;
        } else {
            enumC1235120iFK = EnumC1235120iFK.DIGITAL_0;
        }
        showUnlinkPhoneEmailPopupEvent.LJI(enumC1235120iFK.getValue(), "is_email_verified");
        showUnlinkPhoneEmailPopupEvent.LJI("security_checkup_page", "enter_from");
        if (z) {
            enumC854510Xfd = EnumC854510Xfd.PHONE;
        } else {
            enumC854510Xfd = EnumC854510Xfd.EMAIL;
        }
        showUnlinkPhoneEmailPopupEvent.LJI(enumC854510Xfd.getValue(), "unlink_type");
        showUnlinkPhoneEmailPopupEvent.LJIIIIZZ();
    }

    public final void LJIIJJI(String str) {
        C1389890mGx c1389890mGx = new C1389890mGx(this.LIZ);
        c1389890mGx.LJIIJ(str);
        c1389890mGx.LJIIJJI();
    }

    public static boolean LJFF(List list, boolean z) {
        String str;
        if (list == null) {
            return false;
        }
        if (z) {
            str = "mobile_sms_verify";
        } else {
            str = "email_verify";
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            TwoStepVerifyWays twoStepVerifyWays = (TwoStepVerifyWays) it2.next();
            String str2 = twoStepVerifyWays.verify_way;
            Boolean bool = twoStepVerifyWays.isAvailable;
            if (Intrinsics.LJFF(str2, str) && Intrinsics.LJFF(Boolean.TRUE, bool)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL(VerificationMethodType verificationMethodType, Bundle bundle) {
        bundle.putInt("phone_number_source", EnumC1237820iJg.DYA_BIND_PHONE_NUMBER_SOURCE_TYPE_ACCOUNT_MANAGEMENT_PHONE_NUMBER.getValue());
        int i = C1235330iFf.LIZ[verificationMethodType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C0XQ7.LIZ().modifyMobileVerifyByPassword(this.LIZ, "security_checkup_page", bundle, true, null);
                    return;
                }
                return;
            }
            C0XQ7.LIZ().modifyMobileVerifyByEmail(this.LIZ, "security_checkup_page", bundle, true, null);
            return;
        }
        C0XQ7.LIZ().modifyMobile(this.LIZ, "security_checkup_page", bundle, true, null);
    }

    public final void LJII(boolean z, EnumC1235020iFA enumC1235020iFA, EnumC1234990iF7 enumC1234990iF7) {
        EnumC1235150iFN enumC1235150iFN;
        EnumC1235110iFJ enumC1235110iFJ;
        ExitUnlinkPhoneEmailPopupEvent exitUnlinkPhoneEmailPopupEvent = new ExitUnlinkPhoneEmailPopupEvent();
        if (z) {
            enumC1235150iFN = EnumC1235150iFN.PHONE;
        } else {
            enumC1235150iFN = EnumC1235150iFN.EMAIL;
        }
        exitUnlinkPhoneEmailPopupEvent.LJI(enumC1235150iFN.getValue(), "unlink_type");
        exitUnlinkPhoneEmailPopupEvent.LJI(enumC1235020iFA.getValue(), "exit_method");
        if (z) {
            enumC1235110iFJ = EnumC1235110iFJ.NULL;
        } else if (this.LIZLLL) {
            enumC1235110iFJ = EnumC1235110iFJ.DIGITAL_1;
        } else {
            enumC1235110iFJ = EnumC1235110iFJ.DIGITAL_0;
        }
        exitUnlinkPhoneEmailPopupEvent.LJI(enumC1235110iFJ.getValue(), "is_email_verified");
        exitUnlinkPhoneEmailPopupEvent.LJI("security_checkup_page", "enter_from");
        if (enumC1234990iF7 != null) {
            exitUnlinkPhoneEmailPopupEvent.LJI(enumC1234990iF7.getValue(), "unlink_eligible_status");
        }
        exitUnlinkPhoneEmailPopupEvent.LJIIIIZZ();
    }

    public final void LJIIIZ(EnumC852630Xcb enumC852630Xcb, Function0<Unit> function0, Function2<? super SafeEnvData, ? super Bundle, Unit> function2) {
        C786410Ut5.J4(LJ());
        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1234130iDj(enumC852630Xcb, this, function0, function2, null), 3);
    }

    public final void LJIIL(Bundle bundle, List list, boolean z) {
        boolean z2 = !list.isEmpty();
        if (z) {
            if (z2) {
                VerificationMethodType verificationMethodType = VerificationMethodType.MOBILE;
                if (list.contains(verificationMethodType)) {
                    LIZLLL(verificationMethodType, bundle);
                    return;
                } else {
                    LIZLLL((VerificationMethodType) ListProtector.get(list, 0), bundle);
                    return;
                }
            }
            LJIIJJI(this.LIZ.getString(2131827401));
            return;
        }
        if (z2) {
            if (this.LIZLLL) {
                C2344009Gk c2344009Gk = new C2344009Gk();
                c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, "verified");
                C20684815ws.LJIILLIIL("enter_email_setting", c2344009Gk.LIZ);
            }
            C786410Ut5.LJJJI("enter_from", "security_checkup_page", bundle);
            bundle.putInt("email_source", EnumC1237810iJf.DYA_BIND_EMAIL_SOURCE_TYPE_ACCOUNT_MANAGEMENT_EMAIL.getValue());
            C0XQ7.LIZ().changeEmailWithTypes(this.LIZ, "security_checkup_page", new ArrayList<>(list), bundle);
            return;
        }
        LJIIJJI(this.LIZ.getString(2131827395));
    }

    public static void LJI(boolean z, boolean z2, EnumC1235130iFL enumC1235130iFL, EnumC1235240iFW enumC1235240iFW) {
        EnumC1235140iFM enumC1235140iFM;
        EnumC1235170iFP enumC1235170iFP;
        ExitUnlinkPhoneEmailConfirmPageEvent exitUnlinkPhoneEmailConfirmPageEvent = new ExitUnlinkPhoneEmailConfirmPageEvent();
        if (z) {
            enumC1235140iFM = EnumC1235140iFM.PHONE;
        } else {
            enumC1235140iFM = EnumC1235140iFM.EMAIL;
        }
        exitUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235140iFM.getValue(), "unlink_type");
        if (z2) {
            enumC1235170iFP = EnumC1235170iFP.YES;
        } else {
            enumC1235170iFP = EnumC1235170iFP.NO;
        }
        exitUnlinkPhoneEmailConfirmPageEvent.LJIIJJI(enumC1235170iFP);
        exitUnlinkPhoneEmailConfirmPageEvent.LJIIJ(EnumC1235160iFO.DIGITAL_1);
        exitUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235130iFL.getValue(), "action_type");
        exitUnlinkPhoneEmailConfirmPageEvent.LJI(enumC1235240iFW.getValue(), "exit_method");
        exitUnlinkPhoneEmailConfirmPageEvent.LJIIIIZZ();
    }
}
