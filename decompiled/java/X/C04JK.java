package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.viewholder.DateElementViewHolder;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.04JK, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public class C04JK implements View.OnFocusChangeListener {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) throws Throwable {
        switch (this.$t) {
            case 0:
                onFocusChange$0(this, view, z);
                break;
            case 1:
                onFocusChange$1(this, view, z);
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C04JK(Object obj, C815603Go c815603Go, Function2<? super PhoneCredit, ? super Boolean, Unit> function2) {
        this.$t = function2;
        this.l0 = obj;
        this.l1 = c815603Go;
    }

    public static final void onFocusChange$0(C04JK c04jk, View view, boolean z) throws Throwable {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (!z) {
            C815603Go c815603Go = (C815603Go) c04jk.l0;
            PhoneCredit phoneCredit = c815603Go.LLILZLL;
            if (phoneCredit != null) {
                str = phoneCredit.countryCode;
            } else {
                str = null;
            }
            String text = c815603Go.getPhoneNumInputFromXml().getText();
            if (phoneCredit != null) {
                str2 = phoneCredit.hint;
                str3 = phoneCredit.sampleNum;
            } else {
                str2 = null;
                str3 = null;
            }
            c815603Go.LLILZLL = new PhoneCredit(str, text, str2, str3);
            C1748260vay phoneNumInputFromXml = ((C815603Go) c04jk.l0).getPhoneNumInputFromXml();
            PhoneCredit phoneCredit2 = ((C815603Go) c04jk.l0).LLILZLL;
            if (phoneCredit2 != null) {
                str4 = phoneCredit2.hint;
            }
            phoneNumInputFromXml.setHint(str4);
        } else {
            C1748260vay phoneNumInputFromXml2 = ((C815603Go) c04jk.l0).getPhoneNumInputFromXml();
            PhoneCredit phoneCredit3 = ((C815603Go) c04jk.l0).LLILZLL;
            if (phoneCredit3 != null) {
                str4 = phoneCredit3.sampleNum;
            }
            phoneNumInputFromXml2.setHint(str4);
        }
        ((Function2) c04jk.l1).invoke(((C815603Go) c04jk.l0).LLILZLL, Boolean.valueOf(z));
    }

    public static final void onFocusChange$1(C04JK c04jk, View view, boolean z) {
        ((C941203m6) c04jk.l0).setTextHasFocus(z);
        ((C941203m6) c04jk.l0).getFocusChange().invoke(Boolean.valueOf(z));
        if (z) {
            ((C941203m6) c04jk.l0).LIZIZ();
            ((C941203m6) c04jk.l0).getOnErrorClear().invoke();
            C03WH paymentLogger = ((C941203m6) c04jk.l0).getPaymentLogger();
            if (paymentLogger != null) {
                paymentLogger.LIZJ(null, C03WH.LJJI(((ElementDTO) c04jk.l1).paramName));
                paymentLogger.LJJIIJ(C13LE.LIZ(DateElementViewHolder.class).LJI());
                return;
            }
            return;
        }
        String strInvoke = ((C941203m6) c04jk.l0).getOnVerify().invoke(((C941203m6) c04jk.l0).getValue());
        if (strInvoke == null) {
            return;
        }
        ((C941203m6) c04jk.l0).LJFF(new C1745340vWG(strInvoke, null, false, null, null, 30));
    }
}
