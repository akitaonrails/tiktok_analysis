package X;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0bkK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985260bkK extends ConstraintLayout {
    public final C1324720kZq LL;
    public final C1324720kZq LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C16F5 LLILZ;
    public final C16F5 LLILZIL;

    public final void setCountdown(long j) {
        this.LLILZIL.setText(C497740JfY.LJIJJ(2131841124, Long.valueOf(j)));
    }

    public final void setCountdownVisibility(boolean z) {
        int i;
        C16F5 c16f5 = this.LLILZIL;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        C786410Ut5.LLJJJJ(c16f5, i);
    }

    public final void setReadyStatus(EnumC985270bkL enumC985270bkL) {
        int i = C985280bkM.LIZ[enumC985270bkL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    C500260Jjc.LLFFF(this.LLILLJJLI);
                    C500260Jjc.LJIILIIL(this.LLILLL);
                    C500260Jjc.LLFFF(this.LLILZIL);
                    return;
                }
                throw new C1954807lC();
            }
            C500260Jjc.LJIILIIL(this.LLILLJJLI);
            C500260Jjc.LLFFF(this.LLILLL);
            C500260Jjc.LJIILIIL(this.LLILZIL);
            return;
        }
        C500260Jjc.LLFFF(this.LLILLJJLI);
        C500260Jjc.LJIILIIL(this.LLILLL);
        C500260Jjc.LJIILIIL(this.LLILZIL);
    }

    public C985260bkK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.gy9, this, true);
        this.LL = (C1324720kZq) findViewById(R.id.lz0);
        this.LLILLJJLI = (C1324720kZq) findViewById(R.id.lz_);
        this.LLILLL = (C1324720kZq) findViewById(R.id.lyy);
        this.LLILZ = (C16F5) findViewById(R.id.tv_user_name);
        this.LLILZIL = (C16F5) findViewById(R.id.tv_user_countdown);
        C1143680frq.LIZLLL(this.LLILLJJLI, "tiktok_live_interaction_demand_10", "ttlive_icon_catch_beans_invite_panel_ellipsis.png");
    }
}
