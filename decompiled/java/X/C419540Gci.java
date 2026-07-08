package X;

import Y.ACListenerS110S0200000_6;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import avg.f;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import mf.a;

/* JADX INFO: renamed from: X.0Gci, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419540Gci extends LinearLayout {
    public final SmartImageView LL;
    public final TuxTextView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public Function1<? super String, Unit> LLILZIL;
    public String LLILZLL;

    public final SmartImageView getCoverImg() {
        return this.LL;
    }

    public final String getShowString() {
        return this.LLILZLL;
    }

    public C419540Gci(Context context) {
        super(context, null, 0);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d1v, this, true);
        this.LL = (SmartImageView) findViewById(R.id.f59);
        this.LLILLJJLI = (TuxTextView) findViewById(R.id.omf);
        this.LLILLL = (TuxTextView) findViewById(R.id.oma);
        this.LLILZ = (TuxTextView) findViewById(R.id.a23);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }

    public final void setClickAction(Function0<Unit> function0) {
        View.OnClickListener aCListenerS110S0200000_6 = new ACListenerS110S0200000_6(function0, this, 23);
        if (C1848410yCV.LIZ) {
            aCListenerS110S0200000_6 = new f(aCListenerS110S0200000_6);
        }
        a aVar = new a(aCListenerS110S0200000_6);
        if (C2213981Bky.LIZIZ.isOffline()) {
            C2211941Bhg.LIZ.injectViewListener(this);
        }
        setOnClickListener(aVar);
    }

    public final void setDismissAction(Function1<? super String, Unit> function1) {
        this.LLILZIL = function1;
    }

    public final void setMessageType(boolean z) {
        if (C357620E0i.LIZ()) {
            if (z) {
                this.LLILLL.setText(getContext().getString(2131834117));
                this.LLILZ.setText(getContext().getString(2131850022));
            } else {
                this.LLILLL.setText(getContext().getString(2131834116));
                this.LLILZ.setText(getContext().getString(2131850026));
            }
            String str = this.LLILZLL;
            if (str != null && str.length() != 0) {
                TuxTextView tuxTextView = this.LLILLL;
                String str2 = this.LLILZLL;
                if (str2 == null) {
                    str2 = "";
                }
                tuxTextView.setText(str2);
            }
            C786410Ut5.LLLLZLL(this.LLILLJJLI, 8);
            return;
        }
        if (z) {
            this.LLILLJJLI.setText(getContext().getString(2131850023));
            this.LLILLL.setText(getContext().getString(2131850021));
            this.LLILZ.setText(getContext().getString(2131850022));
        } else {
            this.LLILLJJLI.setText(getContext().getString(2131850024));
            this.LLILLL.setText(getContext().getString(2131850025));
            this.LLILZ.setText(getContext().getString(2131850022));
        }
        C786410Ut5.LLLLZLL(this.LLILLJJLI, 0);
    }

    public final void setShowString(String str) {
        this.LLILZLL = str;
    }
}
