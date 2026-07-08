package X;

import android.os.Build;
import android.view.View;
import java.util.List;

/* JADX INFO: renamed from: X.0tvB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class RunnableC1683910tvB extends C14JJ implements Runnable, C0TVI, View.OnAttachStateChangeListener {
    public final C1683860tv6 LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public C20246014Ju LLILZLL;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        try {
            if (this.LLILZ) {
                this.LLILZ = false;
                this.LLILZIL = false;
                C20246014Ju c20246014Ju = this.LLILZLL;
                if (c20246014Ju != null) {
                    this.LLILLL.LJIILLIIL.LJFF(C1683840tv4.LIZJ(c20246014Ju.LIZ(8)));
                    C1683860tv6.LIZ(this.LLILLL, c20246014Ju);
                    this.LLILZLL = null;
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
    }

    public RunnableC1683910tvB(C1683860tv6 c1683860tv6) {
        super(!c1683860tv6.LJIIZILJ ? 1 : 0);
        this.LLILLL = c1683860tv6;
    }

    @Override // X.C14JJ
    public final void LIZ(C14JM c14jm) {
        this.LLILZ = false;
        this.LLILZIL = false;
        C20246014Ju c20246014Ju = this.LLILZLL;
        if (c14jm.LIZ.LIZ() != 0 && c20246014Ju != null) {
            this.LLILLL.LJIILLIIL.LJFF(C1683840tv4.LIZJ(c20246014Ju.LIZ(8)));
            this.LLILLL.LJIILL.LJFF(C1683840tv4.LIZJ(c20246014Ju.LIZ(8)));
            C1683860tv6.LIZ(this.LLILLL, c20246014Ju);
        }
        this.LLILZLL = null;
    }

    @Override // X.C14JJ
    public final void LIZIZ(C14JM c14jm) {
        this.LLILZ = true;
        this.LLILZIL = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // X.C14JJ
    public final C20246014Ju LIZJ(C20246014Ju c20246014Ju, List<C14JM> list) {
        C1683860tv6.LIZ(this.LLILLL, c20246014Ju);
        if (this.LLILLL.LJIIZILJ) {
            return C20246014Ju.LIZIZ;
        }
        return c20246014Ju;
    }

    @Override // X.C14JJ
    public final C14JL LIZLLL(C14JM c14jm, C14JL c14jl) {
        this.LLILZ = false;
        return c14jl;
    }

    @Override // X.C0TVI
    public final C20246014Ju onApplyWindowInsets(View view, C20246014Ju c20246014Ju) {
        this.LLILZLL = c20246014Ju;
        this.LLILLL.LJIILL.LJFF(C1683840tv4.LIZJ(c20246014Ju.LIZ(8)));
        if (this.LLILZ) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.LLILZIL) {
            this.LLILLL.LJIILLIIL.LJFF(C1683840tv4.LIZJ(c20246014Ju.LIZ(8)));
            C1683860tv6.LIZ(this.LLILLL, c20246014Ju);
        }
        if (this.LLILLL.LJIIZILJ) {
            return C20246014Ju.LIZIZ;
        }
        return c20246014Ju;
    }
}
