package X;

import Y.ACListenerS156S0100000_22;
import Y.ARunnableS122S0100000_22;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Looper;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS218S0000000_29;

/* JADX INFO: renamed from: X.0n0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418270n0j extends LinearLayout {
    public final View LL;
    public final BPEAHandler LLILLJJLI;
    public ARunnableS122S0100000_22 LLILLL;
    public TuxTextView LLILZ;
    public TuxTextView LLILZIL;
    public TuxIconView LLILZLL;
    public C1322110kVd LLIZ;
    public TuxIconView LLIZLLLIL;
    public TuxTextView LLJ;
    public TuxIconView LLJI;
    public ImageView LLJIJIL;
    public int LLJILJIL;
    public final C01GW LLJILJILJ;

    private final RotateAnimation getRotationAnim() {
        return (RotateAnimation) this.LLJILJILJ.getValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ARunnableS122S0100000_22 aRunnableS122S0100000_22 = this.LLILLL;
        if (aRunnableS122S0100000_22 != null) {
            this.LLILLJJLI.removeCallbacks(aRunnableS122S0100000_22);
        }
        this.LLILLL = null;
    }

    public C1418270n0j(Context context) {
        super(context, null, 0);
        this.LL = C786410Ut5.Sd(R.layout.sd, C786410Ut5.ne(context), this);
        this.LLILLJJLI = new BPEAHandler(Looper.getMainLooper());
        this.LLJILJIL = R.attr.br;
        this.LLJILJILJ = C452501pT.LIZIZ(AFwS218S0000000_29.get$arr$(416));
    }

    public final void LIZ(boolean z) {
        if (z) {
            TuxIconView tuxIconView = this.LLIZLLLIL;
            if (tuxIconView != null) {
                C786410Ut5.LLLLLLZZ(tuxIconView, 0);
            }
            TuxIconView tuxIconView2 = this.LLIZLLLIL;
            if (tuxIconView2 != null) {
                tuxIconView2.startAnimation(getRotationAnim());
                return;
            }
            return;
        }
        getRotationAnim().cancel();
        TuxIconView tuxIconView3 = this.LLIZLLLIL;
        if (tuxIconView3 == null) {
            return;
        }
        C786410Ut5.LLLLLLZZ(tuxIconView3, 8);
    }

    public final void setExitListener(Function0<Unit> function0) {
        TuxIconView tuxIconView = this.LLILZLL;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS156S0100000_22(function0, 47));
        }
    }

    public final void setHintText(String str) {
        TuxTextView tuxTextView = this.LLILZIL;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void setMediaCover(Uri uri) {
        if (uri != null) {
            C1324750kZt.LIZLLL(this.LLIZ, uri, -1, -1);
            return;
        }
        Drawable drawable = getContext().getDrawable(R.drawable.a71);
        if (drawable != null) {
            Integer numLIZJ = C1308910kAL.LIZJ(this.LLJILJIL, getContext());
            if (numLIZJ != null) {
                drawable.setColorFilter(numLIZJ.intValue(), PorterDuff.Mode.SRC);
            }
            C1322110kVd c1322110kVd = this.LLIZ;
            if (c1322110kVd != null) {
                c1322110kVd.setImageDrawable(drawable);
            }
        }
    }

    public final void setProcessText(String str) {
        TuxTextView tuxTextView = this.LLILZ;
        if (tuxTextView != null) {
            tuxTextView.setText(str);
        }
    }

    public final void setProgress(int i) {
        TuxTextView tuxTextView = this.LLJ;
        boolean z = false;
        if (tuxTextView != null && tuxTextView.getLayoutDirection() == 1) {
            z = true;
        }
        if (z) {
            TuxTextView tuxTextView2 = this.LLJ;
            if (tuxTextView2 != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('%');
                sbLIZ.append(i);
                tuxTextView2.setText(C2188811AlT.LIZIZ(sbLIZ));
                return;
            }
            return;
        }
        TuxTextView tuxTextView3 = this.LLJ;
        if (tuxTextView3 == null) {
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(i);
        sbLIZ2.append('%');
        tuxTextView3.setText(C2188811AlT.LIZIZ(sbLIZ2));
    }

    public final void setRetryListener(Function0<Unit> function0) {
        TuxIconView tuxIconView = this.LLJI;
        if (tuxIconView != null) {
            C786410Ut5.a9(tuxIconView, new ACListenerS156S0100000_22(function0, 48));
        }
    }
}
