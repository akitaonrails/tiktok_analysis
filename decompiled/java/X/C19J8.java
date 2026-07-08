package X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;

/* JADX INFO: renamed from: X.19J8, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19J8 extends AnimatorListenerAdapter {
    public final C19JH LL;
    public final C19J9 LLILLJJLI;
    public ValueAnimator LLILLL;
    public final Context LLILZ;
    public int LLILZIL;
    public int LLILZLL = 1;
    public C19J0 LLIZ;
    public String LLIZLLLIL;
    public C19JG LLJ;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ() {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19J8.LIZ():void");
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        super.onAnimationEnd(animator);
        C19JG c19jg = this.LLJ;
        if (c19jg != null) {
            c19jg.LIZ();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        super.onAnimationStart(animator);
        C19JG c19jg = this.LLJ;
        if (c19jg != null) {
            c19jg.LIZIZ();
        }
    }

    public C19J8(Context context, C19JH c19jh, C19J9 c19j9) {
        this.LL = c19jh;
        this.LLILLJJLI = c19j9;
        this.LLILZ = context;
    }
}
