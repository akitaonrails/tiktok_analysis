package X;

import Y.ATListenerS338S0200000_10;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0QBE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QBE {
    public static long LIZ;

    public static final void LIZ(final View view, final Function1<? super View, Unit> function1, Function1<? super View, Unit> function12, final boolean z) {
        if (view != null) {
            final Context context = view.getContext();
            C0QBG c0qbg = new C0QBG(context) { // from class: X.0QBF
                @Override // X.C0QBG
                public final void LIZ(boolean z2) {
                    int iIntValue;
                    if (z2 && z) {
                        View view2 = view;
                        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.a03, view.getContext());
                        if (numLIZJ != null) {
                            iIntValue = numLIZJ.intValue();
                        } else {
                            iIntValue = 0;
                        }
                        view2.setForeground(new ColorDrawable(iIntValue));
                        return;
                    }
                    view.setForeground(null);
                }
            };
            c0qbg.LLIZ = new C0QBI() { // from class: X.0QBH
                @Override // X.C0QBI
                public final void LIZ() {
                    Function1<View, Unit> function13 = function1;
                    if (function13 != null) {
                        function13.invoke(view);
                    }
                }
            };
            c0qbg.LLIZLLLIL = new ATListenerS338S0200000_10(view, function12, 5);
            view.setOnTouchListener(c0qbg);
        }
    }
}
