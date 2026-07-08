package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19Wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21552719Wj {
    public final Context LIZ;
    public final C19V6 LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public View LJFF;
    public int LJI;
    public boolean LJII;
    public InterfaceC21549519Vd LJIIIIZZ;
    public AbstractC21552619Wi LJIIIZ;
    public PopupWindow.OnDismissListener LJIIJ;
    public final C19X8 LJIIJJI;

    public void LIZJ() {
        this.LJIIIZ = null;
        PopupWindow.OnDismissListener onDismissListener = this.LJIIJ;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final AbstractC21552619Wi LIZ() throws Throwable {
        AbstractC21552619Wi viewOnKeyListenerC21552819Wk;
        if (this.LJIIIZ == null) {
            Display displayLLILZIL = C2204961BRm.LLILZIL((WindowManager) C786410Ut5.H2(this.LIZ, "window"), new C0WZX("dTF6Tg0zW9KSVEcxRh2JdnOJLjqZvf7BF2gsb8EvUtuaL0iTvIu7N7DA5lk=", new String[]{"01789"}));
            Point point = new Point();
            displayLLILZIL.getRealSize(point);
            if (Math.min(point.x, point.y) >= this.LIZ.getResources().getDimensionPixelSize(R.dimen.cl)) {
                viewOnKeyListenerC21552819Wk = new ViewOnKeyListenerC21552919Wl(this.LIZ, this.LJFF, this.LIZLLL, this.LJ, this.LIZJ);
            } else {
                Context context = this.LIZ;
                C19V6 c19v6 = this.LIZIZ;
                viewOnKeyListenerC21552819Wk = new ViewOnKeyListenerC21552819Wk(this.LIZLLL, this.LJ, context, this.LJFF, c19v6, this.LIZJ);
            }
            viewOnKeyListenerC21552819Wk.LJIIJ(this.LIZIZ);
            viewOnKeyListenerC21552819Wk.LJIILLIIL(this.LJIIJJI);
            viewOnKeyListenerC21552819Wk.LJIIL(this.LJFF);
            viewOnKeyListenerC21552819Wk.LJI(this.LJIIIIZZ);
            viewOnKeyListenerC21552819Wk.LJIILIIL(this.LJII);
            viewOnKeyListenerC21552819Wk.LJIILJJIL(this.LJI);
            this.LJIIIZ = viewOnKeyListenerC21552819Wk;
        }
        return this.LJIIIZ;
    }

    public final boolean LIZIZ() {
        AbstractC21552619Wi abstractC21552619Wi = this.LJIIIZ;
        return abstractC21552619Wi != null && abstractC21552619Wi.isShowing();
    }

    public C21552719Wj(Context context, C19V6 c19v6, View view, boolean z) {
        this(R.attr.b8t, 0, context, view, c19v6, z);
    }

    public final void LIZLLL(int i, int i2, boolean z, boolean z2) {
        AbstractC21552619Wi abstractC21552619WiLIZ = LIZ();
        abstractC21552619WiLIZ.LJIIZILJ(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.LJI, this.LJFF.getLayoutDirection()) & 7) == 5) {
                i -= this.LJFF.getWidth();
            }
            abstractC21552619WiLIZ.LJIILL(i);
            abstractC21552619WiLIZ.LJIJ(i2);
            int i3 = (int) ((this.LIZ.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            abstractC21552619WiLIZ.LL = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        abstractC21552619WiLIZ.show();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19X8] */
    public C21552719Wj(int i, int i2, Context context, View view, C19V6 c19v6, boolean z) {
        this.LJI = 8388611;
        this.LJIIJJI = new PopupWindow.OnDismissListener() { // from class: X.19X8
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.LL.LIZJ();
            }
        };
        this.LIZ = context;
        this.LIZIZ = c19v6;
        this.LJFF = view;
        this.LIZJ = z;
        this.LIZLLL = i;
        this.LJ = i2;
    }
}
