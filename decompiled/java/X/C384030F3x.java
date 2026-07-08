package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0F3x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C384030F3x extends LinearLayout {
    public final View LL;
    public final C0HZQ LLILLJJLI;

    public final C0HZQ getCheckBox() {
        return this.LLILLJJLI;
    }

    public final View getView() {
        return this.LL;
    }

    public C384030F3x(Context context) {
        super(context, null, 0);
        View viewLJLLJ = C786410Ut5.LJLLJ(context, R.layout.bz8, this);
        this.LL = viewLJLLJ;
        this.LLILLJJLI = (C0HZQ) viewLJLLJ.findViewById(R.id.fsu);
        C786410Ut5.I7(new ACListenerS140S0100000_5(this, 131), viewLJLLJ);
    }
}
