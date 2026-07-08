package X;

import Y.ATListenerS465S0100000_33;
import android.app.Dialog;
import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19lc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21634219lc {
    public final Context LL;
    public ViewGroup LLILLJJLI;
    public ViewGroup LLILLL;
    public InterfaceC21635519lp LLILZ;
    public Dialog LLILZIL;
    public View LLILZLL;
    public boolean LLIZ;
    public final ViewOnKeyListenerC21635019lk LLIZLLLIL = new View.OnKeyListener() { // from class: X.19lk
        @Override // android.view.View.OnKeyListener
        public final boolean onKey(View view, int i, KeyEvent keyEvent) {
            if (i == 4 && keyEvent.getAction() == 0) {
                this.LL.LJ();
                return false;
            }
            return false;
        }
    };
    public final ATListenerS465S0100000_33 LLJ = new ATListenerS465S0100000_33(this, 9);

    public static final void LJI() {
    }

    public abstract void LJ();

    public abstract C21633719lX LJFF();

    public final void LIZJ() {
        AnimationUtils.loadAnimation(this.LL, R.anim.e1);
        AnimationUtils.loadAnimation(this.LL, R.anim.e2);
    }

    public final void LIZLLL() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
        LayoutInflater layoutInflaterNe = C786410Ut5.ne(this.LL);
        LJ();
        ViewGroup viewGroup = (ViewGroup) C786410Ut5.Td(layoutInflaterNe, R.layout.dki, null, false);
        this.LLILLL = viewGroup;
        viewGroup.setBackgroundColor(0);
        this.LLILLJJLI = (ViewGroup) this.LLILLL.findViewById(R.id.eux);
        layoutParams.leftMargin = 30;
        layoutParams.rightMargin = 30;
        C786410Ut5.X5(layoutParams, this.LLILLJJLI);
        if (this.LLILLL != null) {
            Dialog dialog = new Dialog(this.LL, R.style.aby);
            this.LLILZIL = dialog;
            LJFF().getClass();
            dialog.setCancelable(true);
            this.LLILZIL.setContentView(this.LLILLL);
            Window window = this.LLILZIL.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.aef);
                window.setGravity(17);
            }
            this.LLILZIL.setOnDismissListener(new DialogInterfaceOnDismissListenerC2189651Amp(this, 3));
        }
        LJ();
        ViewGroup viewGroup2 = this.LLILLL;
        viewGroup2.setFocusable(true);
        viewGroup2.setFocusableInTouchMode(true);
        viewGroup2.setOnKeyListener(this.LLIZLLLIL);
        this.LLILZ = new C21635119ll(this);
    }

    public final void LIZ() {
        LJ();
        Dialog dialog = this.LLILZIL;
        if (dialog != null) {
            dialog.dismiss();
            C785410UrT.LIZ(dialog);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.19lk] */
    public AbstractC21634219lc(Context context) {
        this.LL = context;
    }

    public final View LIZIZ(int i) {
        return this.LLILLJJLI.findViewById(i);
    }

    public final void LJII(View view) {
        LJ();
        Dialog dialog = this.LLILZIL;
        if (dialog != null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 80);
            layoutParams.leftMargin = 0;
            layoutParams.rightMargin = 0;
            C786410Ut5.X5(layoutParams, this.LLILLJJLI);
            Window window = dialog.getWindow();
            if (window != null) {
                window.setWindowAnimations(R.style.aeg);
                window.setGravity(80);
                window.setDimAmount(0.3f);
            }
        }
        this.LLILZLL = view;
        LJ();
        Dialog dialog2 = this.LLILZIL;
        if (dialog2 != null) {
            C786410Ut5.B4(dialog2);
            WindowManager.LayoutParams attributes = this.LLILZIL.getWindow().getAttributes();
            attributes.width = -1;
            this.LLILZIL.getWindow().setAttributes(attributes);
        }
    }
}
