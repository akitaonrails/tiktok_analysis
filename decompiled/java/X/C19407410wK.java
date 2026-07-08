package X;

import Y.AUListenerS231S0200000_29;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.icon.TuxIconView;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.10wK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19407410wK extends RecyclerView.ViewHolder {
    public final SmartImageView LL;
    public final View LLILLJJLI;
    public final ImageView LLILLL;
    public final TuxTextView LLILZ;
    public final TuxIconView LLILZIL;
    public final TuxIconView LLILZLL;
    public final ProgressBar LLIZ;
    public final TuxTextView LLIZLLLIL;
    public ObjectAnimator LLJ;
    public final C19670811xi LLJI;
    public final FrameLayout LLJIJIL;
    public final /* synthetic */ C19407510wL LLJILJIL;

    public final void I5() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LLJ;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LLJ) != null) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.LLILLL;
        if (imageView != null) {
            C786410Ut5.Cb(imageView, 0.0f);
        }
    }

    public final void N5(boolean z) {
        int iIntValue = 0;
        if (C19407210wI.LIZ()) {
            if (z) {
                C786410Ut5.LJZ(0, this.LLJIJIL);
                SmartImageView smartImageView = this.LL;
                C1331750klB c1331750klB = new C1331750klB();
                c1331750klB.LIZ = true;
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ee, this.itemView.getContext());
                if (numLIZJ != null) {
                    iIntValue = numLIZJ.intValue();
                }
                float fLIZIZ = C418440Gaw.LIZIZ(2);
                c1331750klB.LIZJ = iIntValue;
                c1331750klB.LIZIZ = fLIZIZ;
                smartImageView.setCircleOptions(new C1331730kl9(c1331750klB));
                return;
            }
            C786410Ut5.LJZ(8, this.LLJIJIL);
            SmartImageView smartImageView2 = this.LL;
            C1331750klB c1331750klB2 = new C1331750klB();
            c1331750klB2.LIZ = true;
            smartImageView2.setCircleOptions(new C1331730kl9(c1331750klB2));
            return;
        }
        if (z) {
            View view = this.LLILLJJLI;
            C384050F3z c384050F3z = new C384050F3z();
            c384050F3z.LIZJ = Float.valueOf(C418440Gaw.LIZIZ(28));
            c384050F3z.LIZIZ = Integer.valueOf(R.attr.a04);
            view.setBackground(c384050F3z.LIZ(this.itemView.getContext()));
            C786410Ut5.LJLLLLLL(0, this.LLILLJJLI);
            this.LLILZ.setTextColor(C1388580mEq.LIZ(R.attr.a04, this.itemView.getContext()));
            this.LLILZLL.setTintColor(C1388580mEq.LIZ(R.attr.a04, this.itemView.getContext()));
            return;
        }
        C786410Ut5.LJLLLLLL(4, this.LLILLJJLI);
        this.LLILZ.setTextColor(C1388580mEq.LIZ(R.attr.ee, this.itemView.getContext()));
        this.LLILZLL.setTintColor(C1388580mEq.LIZ(R.attr.ee, this.itemView.getContext()));
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C19407410wK(C19407510wL c19407510wL, View view) {
        super(view);
        this.LLJILJIL = c19407510wL;
        this.LL = (SmartImageView) view.findViewById(R.id.yx3);
        this.LLILLJJLI = view.findViewById(R.id.yx4);
        this.LLILLL = (ImageView) view.findViewById(R.id.l9e);
        this.LLILZ = (TuxTextView) view.findViewById(R.id.y23);
        this.LLILZIL = (TuxIconView) view.findViewById(R.id.k3l);
        this.LLILZLL = (TuxIconView) view.findViewById(R.id.k1t);
        this.LLIZ = (ProgressBar) view.findViewById(R.id.s8q);
        this.LLIZLLLIL = (TuxTextView) view.findViewById(R.id.s_3);
        this.LLJI = (C19670811xi) view.findViewById(R.id.lno);
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.ulz);
        this.LLJIJIL = frameLayout;
        C384050F3z c384050F3z = new C384050F3z();
        c384050F3z.LIZIZ = Integer.valueOf(R.attr.dy);
        c384050F3z.LJIIJ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        c384050F3z.LJIIJJI = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        c384050F3z.LJIIIIZZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        c384050F3z.LJIIIZ = Float.valueOf(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        frameLayout.setBackground(c384050F3z.LIZ(view.getContext()));
    }

    public static void L5(C19407410wK c19407410wK, int i) {
        c19407410wK.getClass();
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                } else {
                    if (c19407410wK.LLJILJIL.LL.LLILZLL) {
                        C786410Ut5.G1(c19407410wK.LLJI, 0);
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 80.0f);
                        valueAnimatorOfFloat.setDuration(300L);
                        valueAnimatorOfFloat.addUpdateListener(new AUListenerS231S0200000_29(valueAnimatorOfFloat, c19407410wK, 2));
                        valueAnimatorOfFloat.start();
                        return;
                    }
                    ImageView imageView = c19407410wK.LLILLL;
                    if (imageView != null) {
                        C786410Ut5.LJZI(0, imageView);
                    }
                    ImageView imageView2 = c19407410wK.LLILLL;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.aa0);
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c19407410wK.LLILLL, "rotation", 0.0f, 360.0f);
                    c19407410wK.LLJ = objectAnimatorOfFloat;
                    if (objectAnimatorOfFloat != null) {
                        objectAnimatorOfFloat.setDuration(800L);
                    }
                    ObjectAnimator objectAnimator = c19407410wK.LLJ;
                    if (objectAnimator != null) {
                        objectAnimator.setRepeatMode(1);
                    }
                    ObjectAnimator objectAnimator2 = c19407410wK.LLJ;
                    if (objectAnimator2 != null) {
                        objectAnimator2.setRepeatCount(-1);
                    }
                    ObjectAnimator objectAnimator3 = c19407410wK.LLJ;
                    if (objectAnimator3 == null) {
                        return;
                    }
                    C786410Ut5.Pd(objectAnimator3);
                    return;
                }
            } else if (c19407410wK.LLJILJIL.LL.LLILZLL) {
                c19407410wK.LLJI.setProgressIfCircle(100.0f);
                C786410Ut5.G1(c19407410wK.LLJI, 8);
                return;
            } else {
                C786410Ut5.LJZI(8, c19407410wK.LLILLL);
                c19407410wK.I5();
                return;
            }
        }
        if (c19407410wK.LLJILJIL.LL.LLILZLL) {
            c19407410wK.LLJI.setProgressIfCircle(100.0f);
            C786410Ut5.G1(c19407410wK.LLJI, 8);
            return;
        }
        ImageView imageView3 = c19407410wK.LLILLL;
        if (imageView3 != null) {
            imageView3.setImageResource(R.drawable.c3u);
        }
        ImageView imageView4 = c19407410wK.LLILLL;
        if (imageView4 != null) {
            C786410Ut5.LJZI(0, imageView4);
        }
        c19407410wK.I5();
    }
}
