package X;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.ss.android.ugc.aweme.account.login.twostep.SendEmailCodeResponse;
import com.ss.android.ugc.aweme.account.login.twostep.TwoStepApiResponse;
import kotlin.Unit;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0j3N, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1266150j3N implements InterfaceC2385309Wh {
    public final int $t;
    public Object l1;
    public String s0;

    @Override // X.InterfaceC2385309Wh
    public final Object then(C15O7<TwoStepApiResponse> c15o7) {
        switch (this.$t) {
            case 0:
                return then$0(this, c15o7);
            case 1:
                return then$1(this, c15o7);
            default:
                return null;
        }
    }

    public static final Object then$0(C1266150j3N c1266150j3N, C15O7 c15o7) {
        Integer num;
        String str;
        int iIntValue;
        TwoStepApiResponse.Data data;
        int iIntValue2;
        TwoStepApiResponse.Data data2;
        Integer num2;
        C1C7U.LIZ("EmailCodeAuthenticator@9588.onInputComplete$1");
        if (!C09UZ.LIZLLL(c15o7)) {
            C1239840iMw c1239840iMw = (C1239840iMw) c1266150j3N.l1;
            c1239840iMw.LLJJ = true;
            c1239840iMw.LJIIJ(null, "TwoStepAuthApi.verifyEmailCode bolts Task error");
            C1239840iMw c1239840iMw2 = (C1239840iMw) c1266150j3N.l1;
            TwoStepApiResponse twoStepApiResponse = (TwoStepApiResponse) c15o7.LJIIL();
            if (twoStepApiResponse != null && (data2 = twoStepApiResponse.data) != null && (num2 = data2.errorCode) != null) {
                iIntValue2 = num2.intValue();
            } else {
                iIntValue2 = 0;
            }
            String str2 = c1266150j3N.s0;
            c1239840iMw2.getClass();
            C1239830iMv.LIZLLL(iIntValue2, str2, false);
            C1C7U.LIZIZ("EmailCodeAuthenticator@9588.onInputComplete$1");
            return null;
        }
        TwoStepApiResponse twoStepApiResponse2 = (TwoStepApiResponse) c15o7.LJIIL();
        if (u.LJIJI("success", twoStepApiResponse2.message, true) && (data = twoStepApiResponse2.data) != null && !TextUtils.isEmpty(data.ticket)) {
            C1239840iMw c1239840iMw3 = (C1239840iMw) c1266150j3N.l1;
            String str3 = twoStepApiResponse2.data.ticket;
            c1239840iMw3.LJ(true);
            c1239840iMw3.LJIIIZ();
            c1239840iMw3.LJIIIIZZ();
            InterfaceC1239890iN1 interfaceC1239890iN1 = c1239840iMw3.LLILLJJLI;
            if (interfaceC1239890iN1 != null) {
                interfaceC1239890iN1.onSuccess(str3);
            }
            C1239840iMw c1239840iMw4 = (C1239840iMw) c1266150j3N.l1;
            String str4 = c1266150j3N.s0;
            c1239840iMw4.getClass();
            C1239830iMv.LIZLLL(0, str4, true);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EmailCodeAuthenticator@9588.onInputComplete$1");
            return unit;
        }
        C1239840iMw c1239840iMw5 = (C1239840iMw) c1266150j3N.l1;
        c1239840iMw5.LLJJ = true;
        TwoStepApiResponse.Data data3 = twoStepApiResponse2.data;
        if (data3 != null) {
            num = data3.errorCode;
            str = data3.errorDescription;
        } else {
            num = null;
            str = null;
        }
        c1239840iMw5.LJIIJ(num, str);
        C1239840iMw c1239840iMw6 = (C1239840iMw) c1266150j3N.l1;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        String str5 = c1266150j3N.s0;
        c1239840iMw6.getClass();
        C1239830iMv.LIZLLL(iIntValue, str5, false);
        C1C7U.LIZIZ("EmailCodeAuthenticator@9588.onInputComplete$1");
        return null;
    }

    public static final Object then$1(C1266150j3N c1266150j3N, C15O7 c15o7) {
        Integer num;
        String message;
        int iIntValue;
        SendEmailCodeResponse.Data data;
        Integer num2;
        String string;
        String str;
        C1C7U.LIZ("EmailCodeAuthenticator@9588.sendCode$1");
        C1237240iIk c1237240iIk = null;
        if (C09UZ.LIZLLL(c15o7) && !u.LJIJI("error", ((SendEmailCodeResponse) c15o7.LJIIL()).message, true)) {
            TextView textView = ((C1239840iMw) c1266150j3N.l1).LLJIJIL;
            if (textView == null) {
                textView = null;
            }
            if (TextUtils.isEmpty(textView.getText())) {
                C1239840iMw c1239840iMw = (C1239840iMw) c1266150j3N.l1;
                TextView textView2 = c1239840iMw.LLJIJIL;
                if (textView2 == null) {
                    textView2 = null;
                }
                C19GS c19gsLIZ = c1239840iMw.LIZ();
                if (c19gsLIZ != null) {
                    Object[] objArr = new Object[1];
                    SendEmailCodeResponse.Data data2 = ((SendEmailCodeResponse) c15o7.LJIIL()).data;
                    if (data2 != null) {
                        str = data2.email;
                    } else {
                        str = null;
                    }
                    objArr[0] = str;
                    string = c19gsLIZ.getString(2131833843, objArr);
                } else {
                    string = null;
                }
                textView2.setText(string);
            }
            C21407818qC c21407818qC = ((C1239840iMw) c1266150j3N.l1).LLJ;
            if (c21407818qC == null) {
                c21407818qC = null;
            }
            c21407818qC.setEnabled(true);
            View view = ((C1239840iMw) c1266150j3N.l1).LLJILJILJ;
            if (view == null) {
                view = null;
            }
            view.setEnabled(false);
            ((C1239840iMw) c1266150j3N.l1).LJIIIZ();
            C1237240iIk c1237240iIk2 = ((C1239840iMw) c1266150j3N.l1).LLIZLLLIL;
            if (c1237240iIk2 != null) {
                c1237240iIk = c1237240iIk2;
            }
            c1237240iIk.LJJJJJ();
            C1239840iMw c1239840iMw2 = (C1239840iMw) c1266150j3N.l1;
            String str2 = c1266150j3N.s0;
            c1239840iMw2.getClass();
            C1239830iMv.LJI(0, str2, true);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("EmailCodeAuthenticator@9588.sendCode$1");
            return unit;
        }
        C1239840iMw c1239840iMw3 = (C1239840iMw) c1266150j3N.l1;
        SendEmailCodeResponse.Data data3 = ((SendEmailCodeResponse) c15o7.LJIIL()).data;
        if (data3 != null) {
            num = data3.errorCode;
        } else {
            num = null;
        }
        Exception excLJIIJJI = c15o7.LJIIJJI();
        if (excLJIIJJI == null || (message = excLJIIJJI.getMessage()) == null) {
            SendEmailCodeResponse.Data data4 = ((SendEmailCodeResponse) c15o7.LJIIL()).data;
            if (data4 != null) {
                message = data4.errorDescription;
            } else {
                message = null;
            }
        }
        c1239840iMw3.LJIIJ(num, message);
        C1239840iMw c1239840iMw4 = (C1239840iMw) c1266150j3N.l1;
        SendEmailCodeResponse sendEmailCodeResponse = (SendEmailCodeResponse) c15o7.LJIIL();
        if (sendEmailCodeResponse != null && (data = sendEmailCodeResponse.data) != null && (num2 = data.errorCode) != null) {
            iIntValue = num2.intValue();
        } else {
            iIntValue = 0;
        }
        String str3 = c1266150j3N.s0;
        c1239840iMw4.getClass();
        C1239830iMv.LJI(iIntValue, str3, false);
        C1C7U.LIZIZ("EmailCodeAuthenticator@9588.sendCode$1");
        return null;
    }

    public C1266150j3N(C1239840iMw c1239840iMw, String str, int i) {
        this.$t = i;
        this.l1 = c1239840iMw;
        this.s0 = str;
    }
}
