package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import wh6.AbS689S0100000_7;

/* JADX INFO: renamed from: X.0K4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C511510K4f {
    public View LIZ;
    public FrameLayout LIZIZ;
    public Function0<Unit> LIZJ;
    public LayoutInflater LIZLLL;

    public final void LIZ() {
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout != null) {
            C786410Ut5.LJZ(8, frameLayout);
        }
        FrameLayout frameLayout2 = this.LIZIZ;
        if (frameLayout2 != null) {
            C786410Ut5.LJJJJIZL(frameLayout2);
        }
    }

    public final void LIZJ(boolean z) {
        View viewTd;
        Context context;
        FrameLayout frameLayout;
        FrameLayout frameLayout2 = this.LIZIZ;
        if (frameLayout2 != null) {
            C786410Ut5.LJJJJIZL(frameLayout2);
        }
        FrameLayout frameLayout3 = this.LIZIZ;
        if (frameLayout3 != null && (context = frameLayout3.getContext()) != null && (frameLayout = this.LIZIZ) != null) {
            frameLayout.setBackgroundColor(C426930God.LIZ(R.attr.f8h, context));
        }
        FrameLayout frameLayout4 = this.LIZIZ;
        if (frameLayout4 != null) {
            C786410Ut5.LJZ(0, frameLayout4);
        }
        if (z) {
            LayoutInflater layoutInflater = this.LIZLLL;
            if (layoutInflater != null) {
                viewTd = C786410Ut5.Td(layoutInflater, R.layout.fhe, this.LIZIZ, false);
            } else {
                return;
            }
        } else {
            LayoutInflater layoutInflater2 = this.LIZLLL;
            if (layoutInflater2 == null) {
                return;
            } else {
                viewTd = C786410Ut5.Td(layoutInflater2, R.layout.fhd, this.LIZIZ, false);
            }
        }
        if (viewTd != null) {
            View viewFindViewById = viewTd.findViewById(R.id.teg);
            this.LIZ = viewFindViewById;
            if (viewFindViewById != null) {
                C786410Ut5.I7(new AbS689S0100000_7(this, 0), viewFindViewById);
            }
            FrameLayout frameLayout5 = this.LIZIZ;
            if (frameLayout5 != null) {
                frameLayout5.addView(viewTd);
            }
        }
    }

    public final void LIZIZ(View view, Function0<Unit> function0) {
        Context context;
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.j7q);
        this.LIZIZ = frameLayout;
        this.LIZJ = function0;
        if (frameLayout != null) {
            context = frameLayout.getContext();
        } else {
            context = null;
        }
        this.LIZLLL = C786410Ut5.ne(context);
    }
}
