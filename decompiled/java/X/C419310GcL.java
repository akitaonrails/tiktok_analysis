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

/* JADX INFO: renamed from: X.0GcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C419310GcL extends LinearLayout {
    public final int LL;
    public final SmartImageView LLILLJJLI;
    public final TuxTextView LLILLL;
    public final TuxTextView LLILZ;
    public Function1<? super String, Unit> LLILZIL;

    public final SmartImageView getCoverImg() {
        return this.LLILLJJLI;
    }

    private final void setAICreateMessageType(boolean z) {
        if (z) {
            this.LLILLL.setText(getContext().getString(2131825405));
            this.LLILZ.setText(getContext().getString(2131850022));
        } else {
            this.LLILLL.setText(getContext().getString(2131825400));
            this.LLILZ.setText(getContext().getString(2131850026));
        }
    }

    private final void setAIPlaygroundMessage(boolean z) {
        if (z) {
            this.LLILLL.setText(getContext().getString(2131829715));
            this.LLILZ.setText(getContext().getString(2131829718));
        } else {
            this.LLILLL.setText(getContext().getString(2131829716));
            this.LLILZ.setText(getContext().getString(2131829717));
        }
    }

    public final void setClickAction(Function0<Unit> function0) {
        View.OnClickListener aCListenerS110S0200000_6 = new ACListenerS110S0200000_6(function0, this, 57);
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
        int i = this.LL;
        if (i != 2397) {
            if (i == 2449) {
                setAIPlaygroundMessage(z);
                return;
            }
            return;
        }
        setAICreateMessageType(z);
    }

    public C419310GcL(int i, Context context) {
        super(context, null, 0);
        this.LL = i;
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d1u, this, true);
        this.LLILLJJLI = (SmartImageView) findViewById(R.id.f59);
        this.LLILLL = (TuxTextView) findViewById(R.id.oma);
        this.LLILZ = (TuxTextView) findViewById(R.id.a23);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setLayoutParams(layoutParams);
    }
}
