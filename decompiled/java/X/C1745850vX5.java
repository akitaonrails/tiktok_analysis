package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import g1c.AjS70S0100000_26;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS215S0000000_26;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0vX5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1745850vX5 extends LinearLayout {
    public static final Regex LLJJ = new Regex("\\D+");
    public static final C2280611EOl LLJJI;
    public LinearLayout LL;
    public LinearLayout LLILLJJLI;
    public LinearLayout LLILLL;
    public RelativeLayout LLILZ;
    public TuxTextView LLILZIL;
    public TuxTextView LLILZLL;
    public TuxTextView LLIZ;
    public TuxTextView LLIZLLLIL;
    public C1748260vay LLJ;
    public C1748260vay LLJI;
    public TuxIconView LLJIJIL;
    public TuxIconView LLJILJIL;
    public View.OnClickListener LLJILJILJ;
    public Function0<Unit> LLJILLL;

    public C1745850vX5(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    static {
        LLJJI = C7879035x.LIZLLL() ? C2280611EOl.LIZJ : C2280611EOl.LIZJ;
    }

    public final TuxTextView getCountryCodeDdNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1i);
            this.LLILZIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getCountryCodeDdNameRtlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1j);
            this.LLILZLL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getCountryCodeDdNumberFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1k);
            this.LLIZ = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getCountryCodeDdNumberRtlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLIZLLLIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1l);
            this.LLIZLLLIL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final C1748260vay getCountryCodePhoneInputFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1o);
            this.LLJI = (C1748260vay) callbackFindViewById;
        }
        return (C1748260vay) callbackFindViewById;
    }

    public final C1748260vay getCountryCodePhoneInputRtlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1p);
            this.LLJ = (C1748260vay) callbackFindViewById;
        }
        return (C1748260vay) callbackFindViewById;
    }

    public final TuxIconView getIconArrowDownFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJILJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jyq);
            this.LLJILJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxIconView getIconArrowDownRtlFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLJIJIL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.jyr);
            this.LLJIJIL = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final LinearLayout getPhoneInputViewCountryLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qb2);
            this.LL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getPhoneInputViewCountryRtlLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qb3);
            this.LLILLJJLI = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final LinearLayout getPhoneLtrLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qb4);
            this.LLILLL = (LinearLayout) callbackFindViewById;
        }
        return (LinearLayout) callbackFindViewById;
    }

    public final C942903mN getPhoneModel() {
        return new C942903mN(getCountryName(), getCountryCodeString(), getPhoneNumberString());
    }

    public final RelativeLayout getPhoneRtlLayoutFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILZ;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.qba);
            this.LLILZ = (RelativeLayout) callbackFindViewById;
        }
        return (RelativeLayout) callbackFindViewById;
    }

    private final int getCountryCode() {
        try {
            return CastIntegerProtector.parseInt(getCountryCodeString());
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    private final String getCountryCodeString() {
        String strReplace;
        String strReplace2;
        if (C426750GoL.LIZLLL(getContext())) {
            CharSequence text = getCountryCodeDdNumberRtlFromXml().getText();
            if (text != null && (strReplace2 = LLJJ.replace(text, "")) != null) {
                return strReplace2;
            }
        } else {
            CharSequence text2 = getCountryCodeDdNumberFromXml().getText();
            if (text2 != null && (strReplace = LLJJ.replace(text2, "")) != null) {
                return strReplace;
            }
        }
        return "";
    }

    private final long getPhoneNumber() {
        try {
            return CastLongProtector.parseLong(getPhoneNumberString());
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0L;
        }
    }

    public final TuxTextView getCountryCodeTextView() {
        return C426750GoL.LIZLLL(getContext()) ? getCountryCodeDdNumberRtlFromXml() : getCountryCodeDdNumberFromXml();
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[PHI: r0
      0x0042: PHI (r0v7 java.lang.String) = (r0v6 java.lang.String), (r0v12 java.lang.String) binds: [B:16:0x003f, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String getCountryName() {
        /*
            r2 = this;
            android.content.Context r0 = r2.getContext()
            boolean r0 = X.C426750GoL.LIZLLL(r0)
            java.lang.String r1 = ""
            if (r0 == 0) goto L27
            com.bytedance.tux.input.TuxTextView r0 = r2.getCountryCodeDdNameRtlFromXml()
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L26
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L26
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L42
        L26:
            return r1
        L27:
            com.bytedance.tux.input.TuxTextView r0 = r2.getCountryCodeDdNameFromXml()
            java.lang.CharSequence r0 = r0.getText()
            if (r0 == 0) goto L26
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L26
            java.lang.CharSequence r0 = kotlin.text.a0.LJLIIIL(r0)
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L42
            return r1
        L42:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1745850vX5.getCountryName():java.lang.String");
    }

    public final TuxTextView getCountryNameTextView() {
        return C426750GoL.LIZLLL(getContext()) ? getCountryCodeDdNameRtlFromXml() : getCountryCodeDdNameFromXml();
    }

    public final Pair<String, String> getFullPhoneNumber() {
        return new Pair<>(getCountryName(), LIZ(getCountryCodeString(), getPhoneNumberString()));
    }

    public final C1748260vay getInputWithIndicator() {
        return C426750GoL.LIZLLL(getContext()) ? getCountryCodePhoneInputRtlFromXml() : getCountryCodePhoneInputFromXml();
    }

    public final LinearLayout getPhoneCountryLayout() {
        return C426750GoL.LIZLLL(getContext()) ? getPhoneInputViewCountryRtlLayoutFromXml() : getPhoneInputViewCountryLayoutFromXml();
    }

    public final String getPhoneNumberString() {
        return C426750GoL.LIZLLL(getContext()) ? getCountryCodePhoneInputRtlFromXml().getText() : getCountryCodePhoneInputFromXml().getText();
    }

    public final Function0<Unit> getOnCountryCodeChangeListener() {
        return this.LLJILLL;
    }

    public final View.OnClickListener getOnCountryCodeClickListener() {
        return this.LLJILJILJ;
    }

    private final void setCountryCode(String str) {
        getCountryCodeDdNumberFromXml().setText(str);
        getCountryCodeDdNumberRtlFromXml().setText(str);
    }

    private final void setCountryName(String str) {
        getCountryCodeDdNameFromXml().setText(str);
        getCountryCodeDdNameRtlFromXml().setText(str);
    }

    public final void setCountryCodeDdNameFromXml(TuxTextView tuxTextView) {
        this.LLILZIL = tuxTextView;
    }

    public final void setCountryCodeDdNameRtlFromXml(TuxTextView tuxTextView) {
        this.LLILZLL = tuxTextView;
    }

    public final void setCountryCodeDdNumberFromXml(TuxTextView tuxTextView) {
        this.LLIZ = tuxTextView;
    }

    public final void setCountryCodeDdNumberRtlFromXml(TuxTextView tuxTextView) {
        this.LLIZLLLIL = tuxTextView;
    }

    public final void setCountryCodePhoneInputFromXml(C1748260vay c1748260vay) {
        this.LLJI = c1748260vay;
    }

    public final void setCountryCodePhoneInputRtlFromXml(C1748260vay c1748260vay) {
        this.LLJ = c1748260vay;
    }

    public final void setCountryLayoutState(String str) {
        if (C426750GoL.LIZLLL(getContext())) {
            if (str != null && str.length() != 0) {
                C03DZ.LIZJ(getPhoneInputViewCountryRtlLayoutFromXml());
            } else {
                C03DZ.LIZ(getPhoneInputViewCountryRtlLayoutFromXml());
            }
        }
    }

    public final void setHint(String str) {
        getInputWithIndicator().getEditText().setHint(str);
    }

    public final void setIconArrowDownFromXml(TuxIconView tuxIconView) {
        this.LLJILJIL = tuxIconView;
    }

    public final void setIconArrowDownRtlFromXml(TuxIconView tuxIconView) {
        this.LLJIJIL = tuxIconView;
    }

    public final void setOnCountryCodeChangeListener(Function0<Unit> function0) {
        this.LLJILLL = function0;
    }

    public final void setOnCountryCodeClickListener(View.OnClickListener onClickListener) {
        this.LLJILJILJ = onClickListener;
    }

    public final void setPhoneInputViewCountryLayoutFromXml(LinearLayout linearLayout) {
        this.LL = linearLayout;
    }

    public final void setPhoneInputViewCountryRtlLayoutFromXml(LinearLayout linearLayout) {
        this.LLILLJJLI = linearLayout;
    }

    public final void setPhoneLtrLayoutFromXml(LinearLayout linearLayout) {
        this.LLILLL = linearLayout;
    }

    public final void setPhoneModel(C942903mN c942903mN) {
        LIZJ(new Pair<>(c942903mN.LIZ, LIZ(c942903mN.LIZIZ, c942903mN.LIZJ)), false);
    }

    public final void setPhoneNumber(String str) {
        CharSequence charSequence;
        CharSequence charSequence2;
        C1748260vay countryCodePhoneInputFromXml = getCountryCodePhoneInputFromXml();
        if (a0.LJJIIZI(str, "*", false)) {
            C1360520lVa c1360520lVa = new C1360520lVa();
            c1360520lVa.LIZLLL(str);
            charSequence = c1360520lVa.LIZ;
        } else {
            charSequence = str;
        }
        countryCodePhoneInputFromXml.setText(charSequence);
        C1748260vay countryCodePhoneInputRtlFromXml = getCountryCodePhoneInputRtlFromXml();
        if (a0.LJJIIZI(str, "*", false)) {
            C1360520lVa c1360520lVa2 = new C1360520lVa();
            c1360520lVa2.LIZLLL(str);
            charSequence2 = c1360520lVa2.LIZ;
        } else {
            charSequence2 = str;
        }
        countryCodePhoneInputRtlFromXml.setText(charSequence2);
        setCountryLayoutState(str);
    }

    public final void setPhoneRtlLayoutFromXml(RelativeLayout relativeLayout) {
        this.LLILZ = relativeLayout;
    }

    public static String LIZ(String str, String str2) {
        if (str2.length() == 0) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("(+");
        sbLIZ.append(str);
        sbLIZ.append(")");
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZIZ(String str, String str2) {
        setCountryCode(str);
        setCountryName(str2);
    }

    public final void LIZJ(Pair<String, String> pair, boolean z) {
        if (pair == null) {
            setPhoneNumber("");
            return;
        }
        String second = pair.getSecond();
        if (second == null) {
            second = "";
        }
        String first = pair.getFirst();
        try {
            Object obj = null;
            if (a0.LJJJIL(second)) {
                setPhoneNumber("");
                if (z && first != null && !a0.LJJJIL(first)) {
                    Iterator<C2280611EOl> it2 = C2280611EOl.LIZLLL.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C2280611EOl next = it2.next();
                        if (Intrinsics.LJFF(next.LIZ, first)) {
                            obj = next;
                            break;
                        }
                    }
                    C2280611EOl c2280611EOl = (C2280611EOl) obj;
                    if (c2280611EOl != null) {
                        LIZIZ(c2280611EOl.LIZIZ, c2280611EOl.LIZ);
                        return;
                    }
                    return;
                }
                return;
            }
            String strSubstring = second.substring(1, a0.LJJJ(second, ")", 0, false, 6));
            String strSubstring2 = second.substring(a0.LJJJ(second, ")", 0, false, 6) + 1);
            List<C2280611EOl> list = C2280611EOl.LIZLLL;
            ArrayList arrayList = new ArrayList();
            for (C2280611EOl c2280611EOl2 : list) {
                if (Intrinsics.LJFF(c2280611EOl2.LIZIZ, strSubstring)) {
                    arrayList.add(c2280611EOl2);
                }
            }
            if (first != null && first.length() != 0) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        break;
                    }
                    Object next2 = it3.next();
                    if (Intrinsics.LJFF(((C2280611EOl) next2).LIZ, first)) {
                        obj = next2;
                        break;
                    }
                }
                C2280611EOl c2280611EOl3 = (C2280611EOl) obj;
                if (c2280611EOl3 != null) {
                    LIZIZ(c2280611EOl3.LIZIZ, c2280611EOl3.LIZ);
                }
            } else if (arrayList.size() == 1) {
                LIZIZ(((C2280611EOl) arrayList.get(0)).LIZIZ, ((C2280611EOl) arrayList.get(0)).LIZ);
            } else {
                LIZIZ(strSubstring, "");
            }
            setPhoneNumber(strSubstring2);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LIZJ("phone is not correct");
        }
    }

    public C1745850vX5(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        C786410Ut5.LJLLJ(context, R.layout.b4e, this);
        C10VO.LIZIZ(getPhoneInputViewCountryLayoutFromXml());
        C10VO.LIZIZ(getPhoneInputViewCountryRtlLayoutFromXml());
        C2280611EOl c2280611EOlLIZ = C14L2.LIZ();
        LIZIZ(c2280611EOlLIZ.LIZIZ, c2280611EOlLIZ.LIZ);
        AwS392S0200000_26 awS392S0200000_26 = new AwS392S0200000_26(this, context, 37);
        C786410Ut5.I7(new AjS70S0100000_26(awS392S0200000_26, 9), getPhoneInputViewCountryLayoutFromXml());
        C786410Ut5.I7(new AjS70S0100000_26(awS392S0200000_26, 10), getPhoneInputViewCountryRtlLayoutFromXml());
        if (C426750GoL.LIZLLL(getContext())) {
            C03DZ.LIZ(getPhoneLtrLayoutFromXml());
            C03DZ.LIZJ(getPhoneRtlLayoutFromXml());
        } else {
            C03DZ.LIZJ(getPhoneLtrLayoutFromXml());
            C03DZ.LIZ(getPhoneRtlLayoutFromXml());
        }
        int i2 = C20094413jq.LJIIZILJ;
        LinearLayout phoneInputViewCountryLayoutFromXml = getPhoneInputViewCountryLayoutFromXml();
        C1397760mTe c1397760mTe = new C1397760mTe();
        EnumC1397840mTm enumC1397840mTm = EnumC1397840mTm.BUTTON;
        c1397760mTe.LIZIZ = enumC1397840mTm;
        c1397760mTe.LIZJ = null;
        C20094813ju.LIZ(phoneInputViewCountryLayoutFromXml, c1397760mTe.LIZ());
        LinearLayout phoneInputViewCountryRtlLayoutFromXml = getPhoneInputViewCountryRtlLayoutFromXml();
        C1397760mTe c1397760mTe2 = new C1397760mTe();
        c1397760mTe2.LIZIZ = enumC1397840mTm;
        c1397760mTe2.LIZJ = null;
        C20094813ju.LIZ(phoneInputViewCountryRtlLayoutFromXml, c1397760mTe2.LIZ());
        this.LLJILLL = AFwS215S0000000_26.get$arr$(75);
    }
}
