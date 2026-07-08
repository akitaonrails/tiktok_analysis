package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PhoneCredit;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.03Go, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C815603Go extends FrameLayout {
    public C0I7D LL;
    public C1748260vay LLILLJJLI;
    public C0I7D LLILLL;
    public TuxTextView LLILZ;
    public TuxIconView LLILZIL;
    public PhoneCredit LLILZLL;
    public Function2<? super PhoneCredit, ? super Boolean, Unit> LLIZ;

    public final C0I7D getCountryCodeInputFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1n);
            this.LLILLL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final C0I7D getInputWithIndicatorEditTextFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.kq8);
            this.LL = (C0I7D) callbackFindViewById;
        }
        return (C0I7D) callbackFindViewById;
    }

    public final TuxIconView getPhoneErrorIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qay);
            this.LLILZIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getPhoneErrorMsgFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qaz);
            this.LLILZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1748260vay getPhoneNumInputFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qb5);
            this.LLILLJJLI = (C1748260vay) callbackFindViewById;
        }
        return (C1748260vay) callbackFindViewById;
    }

    public final void setCountryCodeInputFromXml(C0I7D c0i7d) {
        this.LLILLL = c0i7d;
    }

    public final void setErrorInfo(String str) {
        if (str == null) {
            C786410Ut5.LLLLZLL(getPhoneErrorMsgFromXml(), 8);
            C786410Ut5.LLLLLLZZ(getPhoneErrorIconFromXml(), 8);
        } else {
            C786410Ut5.LLLLZLL(getPhoneErrorMsgFromXml(), 0);
            C786410Ut5.LLLLLLZZ(getPhoneErrorIconFromXml(), 0);
            getPhoneErrorMsgFromXml().setText(str);
        }
    }

    public final void setInputWithIndicatorEditTextFromXml(C0I7D c0i7d) {
        this.LL = c0i7d;
    }

    public final void setOnFocusChangeListener(Function2<? super PhoneCredit, ? super Boolean, Unit> function2) {
        this.LLIZ = function2;
        getPhoneNumInputFromXml().setOnEditTextFocusChangeListener(new C04JK(this, function2, 0));
    }

    public final void setPhoneCredit(PhoneCredit phoneCredit) {
        String str = phoneCredit.countryCode;
        if (str != null) {
            getCountryCodeInputFromXml().setText(str);
        }
        String str2 = phoneCredit.phoneNumber;
        if (str2 != null) {
            getPhoneNumInputFromXml().setText(str2);
        }
        String str3 = phoneCredit.hint;
        if (str3 != null) {
            getPhoneNumInputFromXml().setHint(str3);
        }
        this.LLILZLL = phoneCredit;
    }

    public final void setPhoneErrorIconFromXml(TuxIconView tuxIconView) {
        this.LLILZIL = tuxIconView;
    }

    public final void setPhoneErrorMsgFromXml(TuxTextView tuxTextView) {
        this.LLILZ = tuxTextView;
    }

    public final void setPhoneNumInputFromXml(C1748260vay c1748260vay) {
        this.LLILLJJLI = c1748260vay;
    }

    public C815603Go(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.b42, this, true);
    }
}
