package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JQr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491870JQr {
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
        FrameLayout frameLayout = this.LIZIZ;
        if (frameLayout != null) {
            C786410Ut5.LJJJJIZL(frameLayout);
        }
        FrameLayout frameLayout2 = this.LIZIZ;
        if (frameLayout2 != null) {
            C786410Ut5.LJZ(0, frameLayout2);
        }
        if (z) {
            LayoutInflater layoutInflater = this.LIZLLL;
            if (layoutInflater != null) {
                viewTd = C786410Ut5.Td(layoutInflater, R.layout.hol, this.LIZIZ, false);
            } else {
                return;
            }
        } else {
            LayoutInflater layoutInflater2 = this.LIZLLL;
            if (layoutInflater2 == null) {
                return;
            } else {
                viewTd = C786410Ut5.Td(layoutInflater2, R.layout.hok, this.LIZIZ, false);
            }
        }
        if (viewTd != null) {
            View viewFindViewById = viewTd.findViewById(R.id.teg);
            this.LIZ = viewFindViewById;
            if (viewFindViewById != null) {
                C786410Ut5.I7(new AbstractViewOnClickListenerC1637610siV() { // from class: X.0JQs
                    {
                        super(300L);
                    }

                    @Override // X.AbstractViewOnClickListenerC1637610siV
                    public final void LIZ(View view) {
                        if (view != null) {
                            Function0<Unit> function0 = this.LLILZ.LIZJ;
                            if (function0 == null) {
                                function0 = null;
                            }
                            function0.invoke();
                        }
                    }
                }, viewFindViewById);
            }
            FrameLayout frameLayout3 = this.LIZIZ;
            if (frameLayout3 != null) {
                frameLayout3.addView(viewTd);
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
