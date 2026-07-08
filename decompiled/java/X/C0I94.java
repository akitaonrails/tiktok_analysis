package X;

import Y.ALAdapterS3S0100000_6;
import Y.AUListenerS256S0100000_6;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import com.ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0I94, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I94 {
    public final SeekBar LIZ;
    public final ImageView LIZIZ;
    public final ImageView LIZJ;
    public final C423380Giu LIZLLL;
    public final InteractStickerStruct LJ;
    public final Context LJFF;

    public final void LIZ() {
        SeekBar seekBar = this.LIZ;
        if (seekBar != null) {
            seekBar.setProgress(0);
        }
        SeekBar seekBar2 = this.LIZ;
        if (seekBar2 != null) {
            seekBar2.setMax(100);
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 14);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS256S0100000_6(this, 141));
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.setStartDelay(1000L);
        valueAnimatorOfInt.setInterpolator(C1619980sG4.LJI());
        ValueAnimator valueAnimatorOfInt2 = ValueAnimator.ofInt(14, 0);
        valueAnimatorOfInt2.addUpdateListener(new AUListenerS256S0100000_6(this, 142));
        valueAnimatorOfInt2.setDuration(300L);
        valueAnimatorOfInt2.setStartDelay(200L);
        valueAnimatorOfInt2.setInterpolator(C1619980sG4.LJI());
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playSequentially(valueAnimatorOfInt, valueAnimatorOfInt2);
        animatorSet.start();
    }

    public final void LIZIZ() {
        SeekBar seekBar = this.LIZ;
        if (seekBar == null || this.LIZJ == null) {
            return;
        }
        ImageView imageView = this.LIZJ;
        C786410Ut5.Hd(imageView, (this.LIZLLL.LIZJ(seekBar) + this.LIZ.getLeft()) - (this.LIZJ.getWidth() / 2.0f));
        C786410Ut5.Nd(imageView, this.LIZ.getY());
        C786410Ut5.LJZI(0, imageView);
        ImageView imageView2 = this.LIZJ;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) View.TRANSLATION_Y, imageView2.getTranslationY(), this.LIZJ.getTranslationY() - 80.0f);
        objectAnimatorOfFloat.setDuration(300L);
        objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
        C786410Ut5.Pd(objectAnimatorOfFloat);
    }

    public final void LIZJ(int i) {
        int progress;
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        ImageView imageView = this.LIZJ;
        boolean z = true;
        if (imageView != null) {
            ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(imageView, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, imageView.getTranslationY(), this.LIZJ.getTranslationY() - 500.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, this.LIZJ.getScaleX(), 3.6f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, this.LIZJ.getScaleY(), 3.6f));
            objectAnimatorOfPropertyValuesHolder.setDuration(750L);
            objectAnimatorOfPropertyValuesHolder.setInterpolator(C1619980sG4.LJFF());
            arrayList.add(objectAnimatorOfPropertyValuesHolder);
        }
        ImageView imageView2 = this.LIZJ;
        if (imageView2 != null) {
            ObjectAnimator objectAnimatorOfPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(imageView2, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, 3.6f, 5.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, 3.6f, 5.0f), PropertyValuesHolder.ofFloat((Property<?, Float>) View.ALPHA, 1.0f, 0.0f));
            objectAnimatorOfPropertyValuesHolder2.setDuration(300L);
            objectAnimatorOfPropertyValuesHolder2.setInterpolator(C1619980sG4.LJ());
            objectAnimatorOfPropertyValuesHolder2.addListener(new ALAdapterS3S0100000_6(this, 50));
            arrayList.add(objectAnimatorOfPropertyValuesHolder2);
        }
        C423380Giu c423380Giu = this.LIZLLL;
        SeekBar seekBar = this.LIZ;
        if (seekBar != null) {
            progress = seekBar.getProgress();
        } else {
            progress = 0;
        }
        c423380Giu.getClass();
        if (Math.abs(i - progress) <= 15) {
            z = false;
        }
        if (z) {
            SeekBar seekBar2 = this.LIZ;
            if (seekBar2 != null && this.LIZIZ != null) {
                ImageView imageView3 = this.LIZIZ;
                C423380Giu c423380Giu2 = this.LIZLLL;
                c423380Giu2.getClass();
                float width = ((seekBar2.getWidth() - seekBar2.getPaddingStart()) - seekBar2.getPaddingEnd()) * (i / seekBar2.getMax());
                float paddingStart = seekBar2.getPaddingStart() + width;
                float paddingEnd = (seekBar2.getPaddingEnd() + r8) - width;
                if (C426750GoL.LIZLLL(c423380Giu2.LIZ)) {
                    paddingStart = paddingEnd;
                }
                C786410Ut5.Hd(imageView3, (paddingStart + this.LIZ.getLeft()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.6d))) / 2.0f));
                ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this.LIZIZ, (Property<ImageView, Float>) View.ALPHA, 0.0f, 1.0f);
                objectAnimatorOfFloat.setStartDelay(300L);
                objectAnimatorOfFloat.setDuration(250L);
                objectAnimatorOfFloat.setInterpolator(C1619980sG4.LJI());
                objectAnimatorOfFloat.addListener(new ALAdapterS3S0100000_6(this, 49));
                arrayList.add(objectAnimatorOfFloat);
            }
        } else {
            SeekBar seekBar3 = this.LIZ;
            if (seekBar3 != null && this.LIZIZ != null) {
                C786410Ut5.Hd(this.LIZIZ, (this.LIZLLL.LIZJ(seekBar3) + this.LIZ.getLeft()) - (C814420VxA.LIZIZ(C418440Gaw.LIZIZ(Double.valueOf(5.6d))) / 2.0f));
                C786410Ut5.LJZI(4, this.LIZIZ);
            }
        }
        animatorSet.playSequentially(arrayList);
        animatorSet.start();
    }

    public final void LIZLLL(int i) {
        SeekBar seekBar = this.LIZ;
        if (seekBar != null && this.LIZJ != null) {
            float f = 1;
            float f2 = ((i / 100.0f) * 2.0f) + f;
            float fLIZJ = (this.LIZLLL.LIZJ(seekBar) + this.LIZ.getLeft()) - (this.LIZJ.getWidth() / 2.0f);
            ImageView imageView = this.LIZJ;
            C786410Ut5.Hd(imageView, fLIZJ);
            C786410Ut5.Qb(imageView, f2);
            C786410Ut5.rc(imageView, f2);
            C786410Ut5.gd(this.LIZJ, ((-1) * ((this.LIZJ.getWidth() * (f2 - f)) / 2)) - 80.0f);
        }
    }

    public C0I94(SeekBar seekBar, ImageView imageView, ImageView imageView2, C423380Giu c423380Giu, InteractStickerStruct interactStickerStruct, Context context) {
        this.LIZ = seekBar;
        this.LIZIZ = imageView;
        this.LIZJ = imageView2;
        this.LIZLLL = c423380Giu;
        this.LJ = interactStickerStruct;
        this.LJFF = context;
    }
}
