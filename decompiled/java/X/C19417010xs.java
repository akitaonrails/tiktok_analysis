package X;

import Y.AUListenerS231S0200000_29;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.cardview.widget.CardView;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.gamora.editor.sticker.read.ReadTextEffectBean;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AFwS192S0000000_6;

/* JADX INFO: renamed from: X.10xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19417010xs extends FrameLayout {
    public int LL;
    public ImageView LLILLJJLI;
    public C19470511Fn LLILLL;
    public View LLILZ;
    public SmartImageView LLILZIL;
    public CardView LLILZLL;
    public TuxTextView LLIZ;
    public FrameLayout LLIZLLLIL;
    public C1295960jpS LLJ;
    public ObjectAnimator LLJI;
    public int LLJIJIL;
    public InterfaceC19417310xv LLJILJIL;
    public C19670811xi LLJILJILJ;
    public final boolean LLJILLL;
    public final C01GW LLJJ;
    public ReadTextEffectBean LLJJI;

    public final void LIZ() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LLJI;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LLJI) != null) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.LLILLJJLI;
        if (imageView != null) {
            C786410Ut5.Cb(imageView, 0.0f);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LLJI;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LLJI) != null) {
            objectAnimator.end();
        }
        C1295960jpS c1295960jpS = this.LLJ;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        super.onDetachedFromWindow();
    }

    public final ReadTextEffectBean getModel() {
        return this.LLJJI;
    }

    public C19417010xs(Context context) {
        super(context, null, 0);
        this.LL = -1;
        this.LLJILLL = C297840Blu.LIZ();
        this.LLJJ = C452501pT.LIZIZ(AFwS192S0000000_6.get$arr$(494));
    }

    public final void setModel(ReadTextEffectBean readTextEffectBean) {
        this.LLJJI = readTextEffectBean;
    }

    public final void setPosition(int i) {
        this.LLJIJIL = i;
    }

    public final void setSelectedView(boolean z) {
        C19470511Fn c19470511Fn = this.LLILLL;
        if (c19470511Fn != null) {
            c19470511Fn.LJFF(z);
        }
        if (z && this.LLJIJIL != 0) {
            View view = this.LLILZ;
            if (view != null) {
                C786410Ut5.LJLLLLLL(0, view);
            }
            C1295960jpS c1295960jpS = this.LLJ;
            if (c1295960jpS != null) {
                C786410Ut5.LLD(0, c1295960jpS);
            }
            C1295960jpS c1295960jpS2 = this.LLJ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.playAnimation();
            }
        } else {
            View view2 = this.LLILZ;
            if (view2 != null) {
                C786410Ut5.LJLLLLLL(8, view2);
            }
            C1295960jpS c1295960jpS3 = this.LLJ;
            if (c1295960jpS3 != null) {
                C786410Ut5.LLD(8, c1295960jpS3);
            }
            C1295960jpS c1295960jpS4 = this.LLJ;
            if (c1295960jpS4 != null) {
                c1295960jpS4.cancelAnimation();
            }
        }
        if (C357780E0y.LIZ()) {
            if (z) {
                CardView cardView = this.LLILZLL;
                int iLIZ = C960203pA.LIZ(R.attr.ee, getContext());
                Drawable drawable = getContext().getDrawable(R.drawable.a9q);
                ((GradientDrawable) drawable).setStroke((int) C12ES.LIZJ(2.0f, getContext()), iLIZ);
                if (cardView != null) {
                    cardView.setBackground(drawable);
                    return;
                }
                return;
            }
            CardView cardView2 = this.LLILZLL;
            if (cardView2 == null) {
                return;
            }
            cardView2.setBackground(null);
        }
    }

    public final void LIZIZ(int i, boolean z) {
        this.LL = i;
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                } else {
                    if (this.LLJIJIL == 0) {
                        setSelectedView(true);
                        return;
                    }
                    if (this.LLJILLL) {
                        C19670811xi c19670811xi = this.LLJILJILJ;
                        if (c19670811xi != null) {
                            C786410Ut5.G1(c19670811xi, 0);
                        }
                        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 80.0f);
                        valueAnimatorOfFloat.setDuration(300L);
                        valueAnimatorOfFloat.addUpdateListener(new AUListenerS231S0200000_29(valueAnimatorOfFloat, this, 5));
                        valueAnimatorOfFloat.start();
                        return;
                    }
                    ImageView imageView = this.LLILLJJLI;
                    if (imageView != null) {
                        C786410Ut5.LJZI(0, imageView);
                    }
                    ImageView imageView2 = this.LLILLJJLI;
                    if (imageView2 != null) {
                        imageView2.setImageResource(R.drawable.aa0);
                    }
                    ImageView imageView3 = this.LLILLJJLI;
                    if (imageView3 == null) {
                        return;
                    }
                    ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView3, "rotation", 0.0f, 360.0f);
                    this.LLJI = objectAnimatorOfFloat;
                    if (objectAnimatorOfFloat != null) {
                        objectAnimatorOfFloat.setDuration(800L);
                    }
                    ObjectAnimator objectAnimator = this.LLJI;
                    if (objectAnimator != null) {
                        objectAnimator.setRepeatMode(1);
                    }
                    ObjectAnimator objectAnimator2 = this.LLJI;
                    if (objectAnimator2 != null) {
                        objectAnimator2.setRepeatCount(-1);
                    }
                    ObjectAnimator objectAnimator3 = this.LLJI;
                    if (objectAnimator3 == null) {
                        return;
                    }
                    C786410Ut5.Pd(objectAnimator3);
                    return;
                }
            } else {
                if (this.LLJILLL) {
                    C19670811xi c19670811xi2 = this.LLJILJILJ;
                    if (c19670811xi2 != null) {
                        c19670811xi2.setProgressIfCircle(100.0f);
                    }
                    C19670811xi c19670811xi3 = this.LLJILJILJ;
                    if (c19670811xi3 != null) {
                        C786410Ut5.G1(c19670811xi3, 8);
                    }
                } else {
                    ImageView imageView4 = this.LLILLJJLI;
                    if (imageView4 != null) {
                        C786410Ut5.LJZI(8, imageView4);
                    }
                    LIZ();
                }
                if (!z) {
                    return;
                }
                setSelectedView(true);
                return;
            }
        }
        if (this.LLJILLL) {
            C19670811xi c19670811xi4 = this.LLJILJILJ;
            if (c19670811xi4 != null) {
                c19670811xi4.setProgressIfCircle(100.0f);
            }
            C19670811xi c19670811xi5 = this.LLJILJILJ;
            if (c19670811xi5 == null) {
                return;
            }
            C786410Ut5.G1(c19670811xi5, 8);
            return;
        }
        ImageView imageView5 = this.LLILLJJLI;
        if (imageView5 != null) {
            imageView5.setImageResource(R.drawable.c3u);
        }
        ImageView imageView6 = this.LLILLJJLI;
        if (imageView6 != null) {
            C786410Ut5.LJZI(0, imageView6);
        }
        LIZ();
    }
}
