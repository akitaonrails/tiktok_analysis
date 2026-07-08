package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.18gc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public class C21348418gc extends AnimatorListenerAdapter implements InterfaceC21462418z0 {
    public final View LL;
    public final View LLILLJJLI;
    public final int LLILLL;
    public final int LLILZ;
    public int[] LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public final float LLIZLLLIL;
    public final float LLJ;

    @Override // X.InterfaceC21462418z0
    public final void LIZ() {
    }

    @Override // X.InterfaceC21462418z0
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC21462418z0
    public final void LIZJ() {
    }

    @Override // X.InterfaceC21462418z0
    public final void LJFF(AbstractC21460218ye abstractC21460218ye) {
    }

    @Override // X.InterfaceC21462418z0
    public final void LIZLLL(AbstractC21463118z7 abstractC21463118z7) {
        C786410Ut5.Jc(this.LLILLJJLI, this.LLIZLLLIL);
        C786410Ut5.ed(this.LLILLJJLI, this.LLJ);
        abstractC21463118z7.LJJII(this);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        if (this.LLILZIL == null) {
            this.LLILZIL = new int[2];
        }
        this.LLILZIL[0] = Math.round(this.LLILLL + this.LLILLJJLI.getTranslationX());
        this.LLILZIL[1] = Math.round(this.LLILZ + this.LLILLJJLI.getTranslationY());
        this.LL.setTag(R.id.yid, this.LLILZIL);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationPause(Animator animator) {
        this.LLILZLL = this.LLILLJJLI.getTranslationX();
        this.LLIZ = this.LLILLJJLI.getTranslationY();
        C786410Ut5.Jc(this.LLILLJJLI, this.LLIZLLLIL);
        C786410Ut5.ed(this.LLILLJJLI, this.LLJ);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
    public final void onAnimationResume(Animator animator) {
        C786410Ut5.Jc(this.LLILLJJLI, this.LLILZLL);
        C786410Ut5.ed(this.LLILLJJLI, this.LLIZ);
    }

    public C21348418gc(float f, float f2, int i, int i2, View view, View view2) {
        this.LLILLJJLI = view;
        this.LL = view2;
        this.LLILLL = i - Math.round(view.getTranslationX());
        this.LLILZ = i2 - Math.round(view.getTranslationY());
        this.LLIZLLLIL = f;
        this.LLJ = f2;
        int[] iArr = (int[]) view2.getTag(R.id.yid);
        this.LLILZIL = iArr;
        if (iArr != null) {
            view2.setTag(R.id.yid, null);
        }
    }
}
