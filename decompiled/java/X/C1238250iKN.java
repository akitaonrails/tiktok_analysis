package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;
import java.util.LinkedList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0iKN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1238250iKN extends LinearLayout implements InterfaceC1238260iKO {
    public static final Regex LLILZ = new Regex("\\D+");
    public static final C2280601EOk LLILZIL;
    public TuxTextView LL;
    public TuxTextView LLILLJJLI;
    public Function0<Unit> LLILLL;

    static {
        C2280601EOk c2280601EOk = C2280601EOk.LJFF;
        LLILZIL = C2280601EOk.LJFF;
    }

    public final TuxTextView getCountryCodeDdNameFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1i);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final TuxTextView getCountryCodeDdNumberFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.f1k);
            this.LLILLJJLI = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public final int getCountryCode() {
        try {
            return CastIntegerProtector.parseInt(getCountryCodeString());
        } catch (NumberFormatException e) {
            TryCatchGuardChecker.doCheck(e);
            return 0;
        }
    }

    public final String getCountryCodeString() {
        String strReplace;
        CharSequence text = getCountryCodeDdNumberFromXml().getText();
        return (text == null || (strReplace = LLILZ.replace(text, "")) == null) ? "" : strReplace;
    }

    public final String getCountryName() {
        String string;
        String string2;
        CharSequence text = getCountryCodeDdNameFromXml().getText();
        return (text == null || (string = text.toString()) == null || (string2 = a0.LJLIIIL(string).toString()) == null) ? "" : string2;
    }

    public final Function0<Unit> getOnCountryCodeChanged() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1238260iKO
    public final void LIZ(C2280601EOk c2280601EOk) {
        setCountry(c2280601EOk);
    }

    public final void setCountry(C2280601EOk c2280601EOk) {
        String str;
        String str2;
        String str3 = "";
        if (c2280601EOk == null || (str = c2280601EOk.LIZLLL) == null) {
            str = "";
        }
        setCountryCode(str);
        if (c2280601EOk != null && (str2 = c2280601EOk.LIZJ) != null) {
            str3 = str2;
        }
        setCountryName(str3);
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setCountryCode(java.lang.String r4) {
        /*
            r3 = this;
            int r1 = r4.length()
            r0 = 0
            if (r1 <= 0) goto L25
            java.lang.String r2 = "+"
            boolean r0 = kotlin.text.u.LJJIIJZLJL(r4, r2, r0)
            if (r0 != 0) goto L25
        Lf:
            com.bytedance.tux.input.TuxTextView r1 = r3.getCountryCodeDdNumberFromXml()
            java.lang.StringBuilder r0 = X.C2188811AlT.LIZ()
            r0.append(r2)
            r0.append(r4)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r0)
            r1.setText(r0)
            return
        L25:
            java.lang.String r2 = ""
            goto Lf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1238250iKN.setCountryCode(java.lang.String):void");
    }

    public final void setCountryCodeDdNameFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setCountryCodeDdNumberFromXml(TuxTextView tuxTextView) {
        this.LLILLJJLI = tuxTextView;
    }

    public final void setCountryName(String str) {
        getCountryCodeDdNameFromXml().setText(str);
    }

    public final void setOnCountryCodeChanged(Function0<Unit> function0) {
        this.LLILLL = function0;
    }

    public C1238250iKN(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C786410Ut5.LJLLJ(context, R.layout.a11, this);
        List<WeakReference<InterfaceC1238260iKO>> list = C1238280iKQ.LIZ;
        synchronized (C1238280iKQ.class) {
            try {
                ((LinkedList) C1238280iKQ.LIZ).add(new WeakReference(this));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
