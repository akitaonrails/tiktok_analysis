package X;

import android.view.View;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18mK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21383818mK {
    public final View LIZ;
    public View.OnClickListener LIZJ;
    public View.OnClickListener LIZLLL;
    public View.OnClickListener LJ;
    public boolean LIZIZ = true;
    public final C01GW LJFF = C452501pT.LIZIZ(new AwS576S0100000_32(this, 761));
    public final C01GW LJI = C452501pT.LIZIZ(new AwS576S0100000_32(this, 759));
    public final C01GW LJII = C452501pT.LIZIZ(new AwS576S0100000_32(this, 760));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 758));
    public final C01GW LJIIIZ = C452501pT.LIZIZ(new AwS576S0100000_32(this, 762));

    public final TuxIconView LIZ() {
        return (TuxIconView) this.LJIIIIZZ.getValue();
    }

    public final TuxTextView LIZIZ() {
        return (TuxTextView) this.LJI.getValue();
    }

    public final void LJI() {
        C786410Ut5.a9((TuxIconView) this.LJII.getValue(), this.LIZJ);
        C786410Ut5.h9((TuxTextView) this.LJFF.getValue(), this.LIZJ);
        if (this.LIZIZ) {
            C786410Ut5.a9(LIZ(), this.LIZLLL);
            C786410Ut5.h9(LIZIZ(), this.LIZLLL);
        } else {
            C786410Ut5.a9(LIZ(), this.LJ);
            C786410Ut5.h9(LIZIZ(), this.LJ);
        }
    }

    public C21383818mK(View view) {
        this.LIZ = view;
    }

    public final void LIZJ(boolean z) {
        this.LIZIZ = z;
        if (z) {
            LIZ().setColorFilter(C960203pA.LIZ(R.attr.ee, this.LIZ.getContext()));
            LIZIZ().setTextColor(C446980Hfs.LIZ(this.LIZ.getContext(), R.color.f569bc));
        } else {
            LIZ().setColorFilter(C960203pA.LIZ(R.attr.eh, this.LIZ.getContext()));
            LIZIZ().setTextColor(C446980Hfs.LIZ(this.LIZ.getContext(), R.color.bg));
        }
        LJI();
    }

    public final void LIZLLL(int i) {
        if (C13LQ.LJLIIL(new Integer[]{0, 8, 4}).contains(Integer.valueOf(i))) {
            C786410Ut5.LJLLLLLL(i, this.LIZ);
        }
    }

    public final void LJFF(String str) {
        TuxTextView tuxTextViewLIZIZ = LIZIZ();
        LJ(tuxTextViewLIZIZ, true);
        tuxTextViewLIZIZ.setText(str);
        LJ(LIZ(), false);
    }

    public static void LJ(View view, boolean z) {
        if (z) {
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
                view.setEnabled(true);
                return;
            }
            return;
        }
        if (view == null) {
            return;
        }
        C786410Ut5.LJLLLLLL(4, view);
        view.setEnabled(false);
    }
}
