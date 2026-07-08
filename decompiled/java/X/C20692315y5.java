package X;

import Y.ACListenerS165S0100000_31;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.15y5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20692315y5 extends LinearLayout {
    public final C1841350y17 LL;
    public boolean LLILLJJLI;

    public final boolean getCheckStatus() {
        return this.LLILLJJLI;
    }

    public C20692315y5(Context context) {
        super(context, null, 0);
        this.LLILLJJLI = true;
        View viewTd = C786410Ut5.Td(C786410Ut5.ne(context), R.layout.c0p, this, true);
        TuxTextView tuxTextView = (TuxTextView) viewTd.findViewById(R.id.cvr);
        C1841350y17 c1841350y17 = (C1841350y17) viewTd.findViewById(R.id.cuu);
        this.LL = c1841350y17;
        C1841350y17 c1841350y172 = this.LL;
        if (c1841350y172 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1841350y172);
            c1841350y172.setScaleY(0.66f);
        }
        C1841350y17 c1841350y173 = this.LL;
        if (c1841350y173 != null) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1841350y173);
            c1841350y173.setScaleX(0.66f);
        }
        if (c1841350y17 != null) {
            c1841350y17.setChecked(this.LLILLJJLI);
        }
        if (tuxTextView != null) {
            C786410Ut5.h9(tuxTextView, new ACListenerS165S0100000_31(this, 190));
        }
        if (c1841350y17 != null) {
            C786410Ut5.e9(c1841350y17, new ACListenerS165S0100000_31(this, 191));
        }
    }
}
