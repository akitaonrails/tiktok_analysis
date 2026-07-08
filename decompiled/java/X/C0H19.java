package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.text.Spannable;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import avg.f;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import mf.a;

/* JADX INFO: renamed from: X.0H19, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0H19 extends LinearLayout {
    public TuxTextView LL;
    public TuxIconView LLILLJJLI;

    public final TuxIconView getBizumPhoneCountryRegionSelectIconFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LLILLJJLI;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c2_);
            this.LLILLJJLI = (TuxIconView) callbackFindViewById;
        }
        return (TuxIconView) callbackFindViewById;
    }

    public final TuxTextView getBizumPhoneCountryRegionValueFromXml() {
        KeyEvent.Callback callbackFindViewById = this.LL;
        if (callbackFindViewById == null) {
            callbackFindViewById = findViewById(R.id.c2a);
            this.LL = (TuxTextView) callbackFindViewById;
        }
        return (TuxTextView) callbackFindViewById;
    }

    public C0H19(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.ac3, this, true);
        setGravity(1);
    }

    public final void setBizumPhoneCountryRegionSelectIconFromXml(TuxIconView tuxIconView) {
        this.LLILLJJLI = tuxIconView;
    }

    public final void setBizumPhoneCountryRegionValueFromXml(TuxTextView tuxTextView) {
        this.LL = tuxTextView;
    }

    public final void setClickEvent(Function0<Unit> function0) {
        View.OnClickListener aCListenerS141S0100000_6 = new ACListenerS141S0100000_6(function0, 170);
        if (C1848410yCV.LIZ) {
            aCListenerS141S0100000_6 = new f(aCListenerS141S0100000_6);
        }
        a aVar = new a(aCListenerS141S0100000_6);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void setText(String str) {
        Spannable spannable;
        TuxTextView bizumPhoneCountryRegionValueFromXml = getBizumPhoneCountryRegionValueFromXml();
        bizumPhoneCountryRegionValueFromXml.setText(str, TextView.BufferType.SPANNABLE);
        CharSequence text = bizumPhoneCountryRegionValueFromXml.getText();
        if ((text instanceof Spannable) && (spannable = (Spannable) text) != null) {
            for (Object obj : spannable.getSpans(0, spannable.length(), C434230H0z.class)) {
                spannable.removeSpan(obj);
            }
        }
    }
}
