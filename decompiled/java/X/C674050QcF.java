package X;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import android.widget.EditText;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0QcF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C674050QcF {
    public final Function0<Context> LIZ;
    public final View LIZIZ;
    public final EditText LIZJ;
    public final View LIZLLL;
    public final View LJFF;
    public final ChoreographerFrameCallbackC674130QcN LJI;
    public final C674110QcL LJIIIIZZ;
    public final C674150QcP LJIIIZ;
    public ValueAnimator LJIIJ;
    public final View LJ = null;
    public final C674060QcG LJII = new C674060QcG();

    public C674050QcF(Context context, Function0 function0, View view, C418060GaK c418060GaK, TuxIconView tuxIconView, EditText editText, C1357120lQ6 c1357120lQ6, C1357120lQ6 c1357120lQ62, View view2, TuxIconView tuxIconView2, View view3, TuxTextView tuxTextView, C427110Gov c427110Gov, TuxIconView tuxIconView3, ChoreographerFrameCallbackC674130QcN choreographerFrameCallbackC674130QcN) {
        this.LIZ = function0;
        this.LIZIZ = view;
        this.LIZJ = c1357120lQ6;
        this.LIZLLL = view2;
        this.LJFF = view3;
        this.LJI = choreographerFrameCallbackC674130QcN;
        this.LJIIIIZZ = new C674110QcL(context, function0, view, c418060GaK, tuxIconView, editText, c1357120lQ6, c1357120lQ62, view2, tuxIconView2, null, view3, null, tuxTextView, c427110Gov, tuxIconView3, choreographerFrameCallbackC674130QcN);
        this.LJIIIZ = new C674150QcP(c418060GaK, tuxIconView, editText, c1357120lQ6, choreographerFrameCallbackC674130QcN, c427110Gov);
    }
}
