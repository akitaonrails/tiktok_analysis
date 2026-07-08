package X;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.view.ViewGroup;
import android.view.autofill.AutofillValue;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.form.LivePcsFormUxOptSetting;
import com.bytedance.android.livesdkapi.host.IHostPCS;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0v4A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727920v4A extends LinearLayout {
    public final C1727930v4B LL;
    public final C1748440vbG LLILLJJLI;
    public FragmentManager LLILLL;
    public LifecycleOwner LLILZ;
    public final C1775980wJg LLILZIL;
    public Function0<Unit> LLILZLL;
    public Function0<Unit> LLIZ;
    public String LLIZLLLIL;

    @Override // android.view.View
    public int getAutofillType() {
        return 1;
    }

    public final void LIZ() {
        setCountryCode(((IHostPCS) C1161920gLG.LIZJ(IHostPCS.class)).uX(getContext()));
    }

    public final String getCountryCodeString() {
        return this.LL.getCountryCodeString();
    }

    public final String getPhoneNumberString() {
        String string;
        Editable text = this.LLILLJJLI.getText();
        if (text != null && (string = text.toString()) != null) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < string.length(); i++) {
                char cCharAt = string.charAt(i);
                if (!C1244080iTm.LJ(cCharAt)) {
                    sb.append(cCharAt);
                }
            }
            String string2 = sb.toString();
            if (string2 != null) {
                return string2;
            }
        }
        return "";
    }

    @Override // android.view.View
    public AutofillValue getAutofillValue() {
        return AutofillValue.forText(getFullPhoneNumber());
    }

    public final String getFullPhoneNumber() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(getCountryCodeString());
        sbLIZ.append('/');
        sbLIZ.append(getPhoneNumberString());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C1775980wJg c1775980wJg = this.LLILZIL;
        if (c1775980wJg != null) {
            this.LLILLJJLI.LIZ(c1775980wJg);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C1775980wJg c1775980wJg = this.LLILZIL;
        if (c1775980wJg != null) {
            C1748440vbG.LJIIL(this.LLILLJJLI, c1775980wJg);
        }
    }

    public C1727920v4A(Context context) {
        super(context, null);
        C1727930v4B c1727930v4B = new C1727930v4B(context);
        this.LL = c1727930v4B;
        C1748440vbG c1748440vbG = new C1748440vbG(context, null, 6);
        this.LLILLJJLI = c1748440vbG;
        C786410Ut5.L6(this.LLILLJJLI, new ViewGroup.LayoutParams(-1, -2));
        c1748440vbG.LJIILIIL(3, false);
        c1748440vbG.setFocusable(true);
        c1748440vbG.setFocusableInTouchMode(true);
        if (C426750GoL.LIZLLL(context)) {
            c1748440vbG.LLJLILLLLZIIL.setGravity(8388613);
            c1748440vbG.setEditTextTextAlignment(5);
        }
        c1748440vbG.setImeOptions(5);
        c1727930v4B.setFocusable(false);
        c1727930v4B.setFocusableInTouchMode(false);
        c1748440vbG.LJI(c1727930v4B);
        C0I7D c0i7d = c1748440vbG.LLJLILLLLZIIL;
        c0i7d.setOnFocusChangeListener(new ViewOnFocusChangeListenerC1775810wJP(c0i7d, this, 3));
        C1775980wJg c1775980wJg = new C1775980wJg(this, 8);
        this.LLILZIL = c1775980wJg;
        c1748440vbG.LIZ(c1775980wJg);
        addView(c1748440vbG);
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"phone"});
            setImportantForAutofill(1);
            c1748440vbG.setImportantForAutofill(2);
        }
    }

    public final void LIZIZ(String str) {
        List<C1727970v4F> listZt2;
        C1727970v4F c1727970v4FUX;
        C1727970v4F c1727970v4F;
        String str2;
        String upperCase;
        List<C1727970v4F> listZt22;
        C1727970v4F c1727970v4FUX2;
        String str3;
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        String string = sb.toString();
        if (string.length() == 0) {
            return;
        }
        Object obj = null;
        if (LivePcsFormUxOptSetting.INSTANCE.isUxOptEnabled()) {
            IHostPCS iHostPCS = (IHostPCS) C1161920gLG.LIZJ(IHostPCS.class);
            if (iHostPCS != null && (c1727970v4FUX2 = iHostPCS.uX(getContext())) != null && (str3 = c1727970v4FUX2.LIZJ) != null) {
                upperCase = str3.toUpperCase(Locale.ROOT);
            } else {
                upperCase = null;
            }
            try {
                C2218571BsN c2218571BsNLIZJ = C2218571BsN.LIZJ();
                C2218561BsM c2218561BsMLJIIZILJ = c2218571BsNLIZJ.LJIIZILJ(str, upperCase);
                String strLJIIIZ = c2218571BsNLIZJ.LJIIIZ(c2218561BsMLJIIZILJ);
                IHostPCS iHostPCS2 = (IHostPCS) C1161920gLG.LIZJ(IHostPCS.class);
                if (iHostPCS2 == null || (listZt22 = iHostPCS2.Zt2(getContext())) == null) {
                    listZt22 = C13BV.INSTANCE;
                }
                Iterator<C1727970v4F> it2 = listZt22.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C1727970v4F next = it2.next();
                    if (u.LJIJI(next.LIZJ, strLJIIIZ, true)) {
                        obj = next;
                        break;
                    }
                }
                C1727970v4F c1727970v4F2 = (C1727970v4F) obj;
                if (c1727970v4F2 != null) {
                    setCountryCode(c1727970v4F2);
                    C1748440vbG.LJIILL(this.LLILLJJLI, String.valueOf(c2218561BsMLJIIZILJ.getNationalNumber()));
                    return;
                } else {
                    C1748440vbG.LJIILL(this.LLILLJJLI, string);
                    LIZ();
                    return;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                C1748440vbG.LJIILL(this.LLILLJJLI, string);
                if (u.LJJIIJZLJL(a0.LJLJJL(str).toString(), "+", false)) {
                    LIZ();
                    return;
                }
                return;
            }
        }
        if (u.LJJIIJZLJL(a0.LJLJJL(str).toString(), "+", false)) {
            IHostPCS iHostPCS3 = (IHostPCS) C1161920gLG.LIZJ(IHostPCS.class);
            if (iHostPCS3 == null || (listZt2 = iHostPCS3.Zt2(getContext())) == null) {
                listZt2 = C13BV.INSTANCE;
            }
            int i2 = 4;
            do {
                if (string.length() > i2) {
                    String strLJZL = C13LN.LJZL(i2, string);
                    ArrayList arrayList = new ArrayList();
                    for (C1727970v4F c1727970v4F3 : listZt2) {
                        if (Intrinsics.LJFF(a0.LJLJJLL(c1727970v4F3.LIZLLL, '+'), strLJZL)) {
                            arrayList.add(c1727970v4F3);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        if (arrayList.size() == 1) {
                            c1727970v4F = (C1727970v4F) C13LP.LJJJJZI(arrayList);
                        } else {
                            IHostPCS iHostPCS4 = (IHostPCS) C1161920gLG.LIZJ(IHostPCS.class);
                            if (iHostPCS4 != null) {
                                c1727970v4FUX = iHostPCS4.uX(getContext());
                            } else {
                                c1727970v4FUX = null;
                            }
                            Iterator it3 = arrayList.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                }
                                Object next2 = it3.next();
                                String str4 = ((C1727970v4F) next2).LIZJ;
                                if (c1727970v4FUX != null) {
                                    str2 = c1727970v4FUX.LIZJ;
                                } else {
                                    str2 = null;
                                }
                                if (Intrinsics.LJFF(str4, str2)) {
                                    obj = next2;
                                    break;
                                }
                            }
                            c1727970v4F = (C1727970v4F) obj;
                            if (c1727970v4F == null) {
                                c1727970v4F = (C1727970v4F) C13LP.LJJJJZI(arrayList);
                            }
                        }
                        setCountryCode(c1727970v4F);
                        C1748440vbG.LJIILL(this.LLILLJJLI, C13LN.LJLJLJ(i2, string));
                        return;
                    }
                }
                i2--;
            } while (i2 > 0);
            C1748440vbG.LJIILL(this.LLILLJJLI, string);
            LIZ();
            return;
        }
        C1748440vbG.LJIILL(this.LLILLJJLI, string);
    }

    @Override // android.view.View
    public final void autofill(AutofillValue autofillValue) {
        CharSequence textValue;
        String string;
        if (autofillValue != null && (textValue = autofillValue.getTextValue()) != null && (string = textValue.toString()) != null && (!a0.LJJJIL(string))) {
            LIZIZ(string);
        }
    }

    public final void setCountryCode(C1727970v4F c1727970v4F) {
        if (c1727970v4F == null) {
            return;
        }
        this.LL.setCountryCode(c1727970v4F);
        Function0<Unit> function0 = this.LLIZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setFullPhoneNumber(String str) {
        C1727970v4F next;
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{"/"}, 2, 2);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJJLIIIJILLIZJL, 10));
        Iterator it2 = listLJJLIIIJILLIZJL.iterator();
        while (it2.hasNext()) {
            arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((String) obj).length() > 0) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            return;
        }
        Iterator<C1727970v4F> it3 = ((IHostPCS) C1161920gLG.LIZJ(IHostPCS.class)).Zt2(getContext()).iterator();
        while (true) {
            if (it3.hasNext()) {
                next = it3.next();
                String str2 = next.LIZLLL;
                StringBuilder sb = new StringBuilder();
                int length = str2.length();
                for (int i = 0; i < length; i++) {
                    char cCharAt = str2.charAt(i);
                    if (Character.isDigit(cCharAt)) {
                        sb.append(cCharAt);
                    }
                }
                if (Intrinsics.LJFF(sb.toString(), ListProtector.get(arrayList2, 0))) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        setCountryCode(next);
        if (arrayList2.size() == 2) {
            setPhoneNumber((String) ListProtector.get(arrayList2, 1));
        }
    }

    public final void setOnCountryCodeUpdate(Function0<Unit> function0) {
        this.LLIZ = function0;
    }

    public final void setOnPhoneNumberImeAction(Function0<Unit> function0) {
        this.LLILLJJLI.setOnEditorActionListener(new C1775780wJM(function0, 0));
    }

    public final void setOnPhoneNumberUpdate(Function0<Unit> function0) {
        this.LLILZLL = function0;
    }

    public final void setPhoneNumber(String str) {
        C1748440vbG.LJIILL(this.LLILLJJLI, str);
        Function0<Unit> function0 = this.LLILZLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setPhoneNumberImeOptions(int i) {
        this.LLILLJJLI.setImeOptions(i);
    }

    public final void setPhoneNumberPlaceholder(String str) {
        if (str.length() == 0) {
            return;
        }
        this.LLILLJJLI.setPlaceholderText(str);
    }
}
