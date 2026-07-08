package X;

import Y.ACListenerS122S0200000_19;
import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.util.AttributeSet;
import android.util.LruCache;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.zhiliaoapp.musically.R;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;
import kotlin.text.u;
import mf.a;

/* JADX INFO: renamed from: X.0iKM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public class C1238240iKM extends LinearLayout implements InterfaceC834210Wnz {
    public C1237400iJ0 LL;
    public final C1238250iKN LLILLJJLI;
    public final C1748440vbG LLILLL;
    public final C1748330vb5 LLILZ;
    public String LLILZIL;
    public String LLILZLL;
    public List<String> LLIZ;

    public C1238240iKM(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final void LIZ() {
        this.LLILLL.setValidationStatus(0);
        getPhoneInputV2FormViewFromXml().setFooter(null);
    }

    public final void LIZIZ() {
        TelephonyManager telephonyManager;
        C1238250iKN c1238250iKN = this.LLILLJJLI;
        Object objH2 = C786410Ut5.H2(c1238250iKN.getContext(), "phone");
        String strLJFF = null;
        if ((objH2 instanceof TelephonyManager) && (telephonyManager = (TelephonyManager) objH2) != null) {
            AtomicBoolean atomicBoolean = C794320VDy.LIZ;
            strLJFF = C1300840jxK.LJIIIIZZ(telephonyManager);
        }
        boolean z = false;
        if (((strLJFF == null || strLJFF.length() == 0) && (strLJFF = C813020Vuu.LJIIL().LJFF(c1238250iKN.getContext(), "country")) == null) || strLJFF.length() == 0) {
            LruCache<Integer, String> lruCache = C0SRQ.LIZ;
            strLJFF = C837920Wty.LIZIZ(Locale.getDefault());
        }
        if (strLJFF.length() == 0) {
            c1238250iKN.setCountry(C1238250iKN.LLILZIL);
            return;
        }
        for (C2280601EOk c2280601EOk : C2280601EOk.LJI) {
            if (u.LJIJI(c2280601EOk.LIZJ, strLJFF, true)) {
                c1238250iKN.setCountry(c2280601EOk);
                z = true;
            }
        }
        if (z) {
            return;
        }
        c1238250iKN.setCountry(C1238250iKN.LLILZIL);
    }

    public int getCountryCode() {
        return this.LLILLJJLI.getCountryCode();
    }

    @Override // X.InterfaceC834210Wnz
    public String getCountryCodeString() {
        return this.LLILLJJLI.getCountryCodeString();
    }

    @Override // X.InterfaceC834210Wnz
    public String getCountryName() {
        return this.LLILLJJLI.getCountryName();
    }

    @Override // X.InterfaceC834210Wnz
    public EditText getEditText() {
        return this.LLILLL.LLJLILLLLZIIL;
    }

    public final C1237400iJ0 getPhoneInputV2FormViewFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qar);
            this.LL = (C1237400iJ0) callbackFindViewById;
        }
        return (C1237400iJ0) callbackFindViewById;
    }

    @Override // X.InterfaceC834210Wnz
    public String getPhoneNumberString() {
        String string;
        String string2;
        Editable text = this.LLILLL.getText();
        return (text == null || (string = text.toString()) == null || (string2 = a0.LJLIIIL(string).toString()) == null) ? "" : string2;
    }

    @Override // X.InterfaceC834210Wnz
    public String getFullPhoneNumber() {
        return PhoneNumberUtil.LIZ(getPhoneNumberObject());
    }

    @Override // X.InterfaceC834210Wnz
    public long getPhoneNumber() {
        try {
            return CastLongProtector.parseLong(getPhoneNumberString());
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    @Override // X.InterfaceC834210Wnz
    public PhoneNumberUtil.PhoneNumber getPhoneNumberObject() {
        PhoneNumberUtil.PhoneNumber phoneNumberCreate = PhoneNumberUtil.PhoneNumber.create(getCountryCode(), getPhoneNumberString());
        phoneNumberCreate.setCountryIso(getCountryName());
        return phoneNumberCreate;
    }

    public final C1748440vbG getContentView() {
        return this.LLILLL;
    }

    public final void LIZJ(String str) {
        this.LLILLL.setValidationStatus(3);
        getPhoneInputV2FormViewFromXml().setFooter(this.LLILZ);
        this.LLILZ.setMessage(str);
    }

    @Override // X.InterfaceC834210Wnz
    public void setCountry(C2280601EOk c2280601EOk) {
        this.LLILLJJLI.setCountry(c2280601EOk);
    }

    @Override // X.InterfaceC834210Wnz
    public void setCountryCode(String str) {
        this.LLILLJJLI.setCountryCode(str);
    }

    public void setCountryName(String str) {
        this.LLILLJJLI.setCountryName(str);
    }

    public final void setExcludedCountries(List<String> list) {
        this.LLIZ = list;
    }

    public final void setImeOptionForEditText(int i) {
        this.LLILLL.setImeOptions(i);
    }

    @Override // X.InterfaceC834210Wnz
    public void setOnCountryCodeChanged(Function0<Unit> function0) {
        this.LLILLJJLI.setOnCountryCodeChanged(function0);
    }

    public final void setPhoneInputV2FormViewFromXml(C1237400iJ0 c1237400iJ0) {
        this.LL = c1237400iJ0;
    }

    @Override // X.InterfaceC834210Wnz
    public void setPhoneNumber(String str) {
        C1748440vbG.LJIILL(this.LLILLL, str);
    }

    public final void setValidationStatus(int i) {
        this.LLILLL.setValidationStatus(i);
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        C1238250iKN c1238250iKN = this.LLILLJJLI;
        int visibility = c1238250iKN.getVisibility();
        c1238250iKN.setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, c1238250iKN);
    }

    public C1238240iKM(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        C1238250iKN c1238250iKN = new C1238250iKN(context, attributeSet, 0);
        this.LLILLJJLI = c1238250iKN;
        C1748440vbG c1748440vbG = new C1748440vbG(context, null, 6);
        this.LLILLL = c1748440vbG;
        C1748330vb5 c1748330vb5 = new C1748330vb5(context, null, 6);
        this.LLILZ = c1748330vb5;
        this.LLILZIL = "";
        this.LLILZLL = "";
        C786410Ut5.LJLLJ(context, R.layout.a12, this);
        C786410Ut5.L6(this.LLILLL, new LinearLayout.LayoutParams(-1, -2));
        c1748440vbG.setPlaceholderText(context.getString(2131837665));
        c1748440vbG.LJIILLIIL(true);
        c1748440vbG.LJIILIIL(3, false);
        if (C426750GoL.LIZLLL(context)) {
            c1748440vbG.LLJLILLLLZIIL.setGravity(8388613);
            c1748440vbG.setEditTextTextAlignment(5);
        }
        setValidationStatus(0);
        View.OnClickListener aCListenerS122S0200000_19 = new ACListenerS122S0200000_19(context, this, 13);
        a aVar = new a(C1848410yCV.LIZ ? new f(aCListenerS122S0200000_19) : aCListenerS122S0200000_19);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(c1238250iKN);
        }
        c1238250iKN.setOnClickListener(aVar);
        c1748440vbG.LJI(c1238250iKN);
        C786410Ut5.K6(this.LLILZ, new FrameLayout.LayoutParams(-1, -2));
        c1748330vb5.setMessageIcon(C958703ov.LIZ);
        getPhoneInputV2FormViewFromXml().setContent(c1748440vbG);
        getPhoneInputV2FormViewFromXml().setContentUpdateDelegate(null);
    }
}
