package X;

import android.widget.EditText;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Wnz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public interface InterfaceC834210Wnz {
    String getCountryCodeString();

    String getCountryName();

    EditText getEditText();

    String getFullPhoneNumber();

    long getPhoneNumber();

    PhoneNumberUtil.PhoneNumber getPhoneNumberObject();

    String getPhoneNumberString();

    void setCountry(C2280601EOk c2280601EOk);

    void setCountryCode(String str);

    void setOnCountryCodeChanged(Function0<Unit> function0);

    void setPhoneNumber(String str);
}
