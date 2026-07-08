package X;

import Y.ACListenerS141S0100000_6;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.tux.status.loading.TuxSpinner;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0GmP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C425550GmP extends FrameLayout {
    public Function0<Unit> LL;

    public final Function0<Unit> getBlock() {
        return this.LL;
    }

    public C425550GmP(Context context) {
        super(context, null, 0);
        C786410Ut5.Sd(R.layout.bma, C786410Ut5.ne(context), this);
        TuxSpinner tuxSpinner = (TuxSpinner) findViewById(R.id.nln);
        C197039127h c197039127h = (C197039127h) findViewById(R.id.ctf);
        if (tuxSpinner != null) {
            C786410Ut5.LLZILL(tuxSpinner, 0);
            tuxSpinner.LIZ(R.raw.icon_spinner_normal, -65536);
        }
        if (c197039127h != null) {
            c197039127h.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.alo));
            c197039127h.setTextColor(C446980Hfs.LIZ(getContext(), R.color.cu));
            c197039127h.setBackground(C800330VaR.LIZIZ(getContext(), R.drawable.aqg));
            c197039127h.setTextColor(C446980Hfs.LIZ(getContext(), R.color.ac4));
            C786410Ut5.U8(c197039127h, new ACListenerS141S0100000_6(this, 88));
        }
    }

    public final void setBlock(Function0<Unit> function0) {
        this.LL = function0;
    }

    public final void setCallback(Function0<Unit> function0) {
        this.LL = function0;
    }
}
