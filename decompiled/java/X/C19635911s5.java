package X;

import android.content.Context;
import android.widget.LinearLayout;
import com.bytedance.android.livesdk.livesetting.liveevent.LiveEventCountdownStickerTitleEnableSetting;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.11s5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19635911s5 {
    public final Context LIZ;
    public LinearLayout LIZIZ;
    public C197039127h LIZJ;
    public TuxTextView LIZLLL;
    public TuxTextView LJ;
    public boolean LJFF;
    public Function1<? super Boolean, Unit> LJI;
    public Function0<Unit> LJII;
    public boolean LJIIIIZZ;
    public String LJIIIZ = "";

    public final void LIZ() {
        if (!LiveEventCountdownStickerTitleEnableSetting.INSTANCE.getValue()) {
            TuxTextView tuxTextView = this.LJ;
            C786410Ut5.LLLLZLL(tuxTextView != null ? tuxTextView : null, 8);
        } else if (this.LJFF) {
            TuxTextView tuxTextView2 = this.LJ;
            C786410Ut5.LLLLZLL(tuxTextView2 != null ? tuxTextView2 : null, 8);
        } else if (this.LJIIIZ.length() == 0) {
            TuxTextView tuxTextView3 = this.LJ;
            C786410Ut5.LLLLZLL(tuxTextView3 != null ? tuxTextView3 : null, 8);
        } else {
            TuxTextView tuxTextView4 = this.LJ;
            C786410Ut5.LLLLZLL(tuxTextView4 != null ? tuxTextView4 : null, 0);
        }
    }

    public C19635911s5(Context context) {
        this.LIZ = context;
    }

    public final void LIZIZ(boolean z) {
        this.LJIIIIZZ = z;
        C197039127h c197039127h = null;
        if (z) {
            C197039127h c197039127h2 = this.LIZJ;
            if (c197039127h2 == null) {
                c197039127h2 = null;
            }
            c197039127h2.setText(this.LIZ.getString(2131851061));
            C197039127h c197039127h3 = this.LIZJ;
            if (c197039127h3 != null) {
                c197039127h = c197039127h3;
            }
            c197039127h.setButtonVariant(1);
            return;
        }
        C197039127h c197039127h4 = this.LIZJ;
        if (c197039127h4 == null) {
            c197039127h4 = null;
        }
        c197039127h4.setText(this.LIZ.getString(2131851060));
        C197039127h c197039127h5 = this.LIZJ;
        if (c197039127h5 != null) {
            c197039127h = c197039127h5;
        }
        c197039127h.setButtonVariant(0);
    }

    public final void LIZJ(long j) {
        if (j < 0) {
            return;
        }
        long j2 = j * 1000;
        TuxTextView tuxTextView = this.LIZLLL;
        if (tuxTextView == null) {
            return;
        }
        if (j == 0) {
            tuxTextView.setTextColorRes(R.attr.a1j);
        } else {
            tuxTextView.setTextColorRes(R.attr.a1h);
        }
        TuxTextView tuxTextView2 = this.LIZLLL;
        if (tuxTextView2 == null) {
            tuxTextView2 = null;
        }
        tuxTextView2.setText(C1840140xzA.LIZ(j2));
    }
}
