package X;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0v46, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1727880v46 extends LinearLayout {
    public final C1749140vcO LL;
    public FragmentManager LLILLJJLI;
    public LifecycleOwner LLILLL;
    public Function0<Unit> LLILZ;
    public String LLILZIL;
    public String LLILZLL;

    public final String getSelectedCountry() {
        return this.LLILZLL;
    }

    public C1727880v46(Context context) {
        super(context, null);
        C1749140vcO c1749140vcO = new C1749140vcO(context, null, 6);
        this.LL = c1749140vcO;
        this.LLILZLL = "";
        C1749140vcO c1749140vcO2 = this.LL;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1749140vcO2);
        c1749140vcO2.setLayoutParams(layoutParams);
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey_);
        c384050F3z.LIZJ = Float.valueOf(24.0f);
        c1749140vcO.setBackground(c384050F3z.LIZ(context));
        addView(c1749140vcO);
    }

    public final void setCountry(String str) {
        this.LL.setText(str);
        this.LLILZLL = str;
        Function0<Unit> function0 = this.LLILZ;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void setInvalid(Context context) {
        C1749140vcO c1749140vcO = this.LL;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ezk);
        c384050F3z.LIZJ = Float.valueOf(24.0f);
        c384050F3z.LIZLLL = Integer.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(2)));
        c384050F3z.LJ = Integer.valueOf(C20736316Cj.LIZIZ(R.attr.exz, context));
        c1749140vcO.setBackground(c384050F3z.LIZ(context));
    }

    public final void setOnCountrySelected(Function0<Unit> function0) {
        this.LLILZ = function0;
    }

    public final void setPlaceholder(String str) {
        if (str.length() == 0) {
            return;
        }
        this.LL.setPlaceholderText(str);
    }

    public final void setValid(Context context) {
        C1749140vcO c1749140vcO = this.LL;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.ey_);
        c384050F3z.LIZJ = Float.valueOf(24.0f);
        c1749140vcO.setBackground(c384050F3z.LIZ(context));
    }
}
