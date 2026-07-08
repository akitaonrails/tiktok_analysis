package X;

import Y.ARunnableS129S0100000_29;
import android.animation.ObjectAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import irm.AkS95S0100000_29;

/* JADX INFO: renamed from: X.10nK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19351610nK extends RecyclerView.ViewHolder {
    public final FrameLayout LL;
    public final InterfaceC19351810nM LLILLJJLI;
    public final ImageView LLILLL;
    public final C19470511Fn LLILZ;
    public ObjectAnimator LLILZIL;
    public int LLILZLL;
    public long LLIZ;

    public final void I5() {
        ObjectAnimator objectAnimator;
        ObjectAnimator objectAnimator2 = this.LLILZIL;
        if (objectAnimator2 != null && objectAnimator2.isRunning() && (objectAnimator = this.LLILZIL) != null) {
            objectAnimator.cancel();
        }
        ImageView imageView = this.LLILLL;
        if (imageView != null) {
            C786410Ut5.Cb(imageView, 0.0f);
        }
    }

    public final void L5(int i) {
        int i2;
        if (getAdapterPosition() != 0 && i != (i2 = this.LLILZLL)) {
            this.LLILZLL = i;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                    } else {
                        this.LLIZ = System.currentTimeMillis();
                        ImageView imageView = this.LLILLL;
                        if (imageView != null) {
                            C786410Ut5.LJZI(0, imageView);
                        }
                        ImageView imageView2 = this.LLILLL;
                        if (imageView2 != null) {
                            imageView2.setImageResource(R.drawable.aa0);
                        }
                        ImageView imageView3 = this.LLILLL;
                        if (imageView3 == null) {
                            return;
                        }
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView3, "rotation", 0.0f, 360.0f);
                        this.LLILZIL = objectAnimatorOfFloat;
                        if (objectAnimatorOfFloat != null) {
                            objectAnimatorOfFloat.setDuration(800L);
                        }
                        ObjectAnimator objectAnimator = this.LLILZIL;
                        if (objectAnimator != null) {
                            objectAnimator.setRepeatMode(1);
                        }
                        ObjectAnimator objectAnimator2 = this.LLILZIL;
                        if (objectAnimator2 != null) {
                            objectAnimator2.setRepeatCount(-1);
                        }
                        ObjectAnimator objectAnimator3 = this.LLILZIL;
                        if (objectAnimator3 == null) {
                            return;
                        }
                        C786410Ut5.Pd(objectAnimator3);
                        return;
                    }
                } else {
                    if (2 == i2 && this.LLIZ > 0) {
                        long jCurrentTimeMillis = System.currentTimeMillis() - this.LLIZ;
                        if (jCurrentTimeMillis >= 100) {
                            ImageView imageView4 = this.LLILLL;
                            if (imageView4 != null) {
                                C786410Ut5.LJZI(8, imageView4);
                            }
                            I5();
                            return;
                        }
                        HandlerHook.viewPostDelay(this.itemView, new ARunnableS129S0100000_29(this, 236), ((long) 100) - jCurrentTimeMillis);
                        return;
                    }
                    ImageView imageView5 = this.LLILLL;
                    if (imageView5 != null) {
                        C786410Ut5.LJZI(8, imageView5);
                    }
                    I5();
                    return;
                }
            }
            ImageView imageView6 = this.LLILLL;
            if (imageView6 != null) {
                imageView6.setImageResource(R.drawable.c3u);
            }
            ImageView imageView7 = this.LLILLL;
            if (imageView7 != null) {
                C786410Ut5.LJZI(0, imageView7);
            }
            I5();
        }
    }

    public C19351610nK(FrameLayout frameLayout, InterfaceC19351810nM interfaceC19351810nM) {
        super(frameLayout);
        this.LL = frameLayout;
        this.LLILLJJLI = interfaceC19351810nM;
        this.LLILZLL = -1;
        this.LLILLL = (ImageView) this.itemView.findViewById(R.id.l9e);
        this.LLILZ = (C19470511Fn) this.itemView.findViewById(R.id.khk);
        C786410Ut5.I7(new AkS95S0100000_29(this, 100), this.itemView);
    }
}
