package X;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import kotlin.Unit;

/* JADX INFO: renamed from: X.1Amy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189741Amy implements InterfaceC300801Eo {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;

    @Override // X.InterfaceC300801Eo
    public final void subscribe(InterfaceC2329309At<Unit> interfaceC2329309At) {
        switch (this.$t) {
            case 0:
                subscribe$0(this, interfaceC2329309At);
                break;
            case 1:
                subscribe$1(this, interfaceC2329309At);
                break;
        }
    }

    public static final void subscribe$0(C2189741Amy c2189741Amy, InterfaceC2329309At interfaceC2329309At) {
        ViewPropertyAnimator viewPropertyAnimatorAnimate;
        ViewPropertyAnimator viewPropertyAnimatorAlpha;
        long jLongValue;
        InterfaceC1631620sYq<String, Integer, String, Unit> interfaceC1631620sYq = ((C1AGN) c2189741Amy.l0).LJ;
        C1AGA c1aga = (C1AGA) c2189741Amy.l1;
        interfaceC1631620sYq.invoke(c1aga.LIZJ, null, c1aga.LIZLLL);
        View view = ((C1AGN) c2189741Amy.l0).LIZJ;
        if (view != null && (viewPropertyAnimatorAnimate = view.animate()) != null && (viewPropertyAnimatorAlpha = viewPropertyAnimatorAnimate.alpha(1.0f)) != null) {
            Long l = (Long) c2189741Amy.l2;
            if (l != null) {
                jLongValue = l.longValue();
            } else {
                jLongValue = 150;
            }
            ViewPropertyAnimator duration = viewPropertyAnimatorAlpha.setDuration(jLongValue);
            if (duration != null) {
                final C1AGN c1agn = (C1AGN) c2189741Amy.l0;
                final C11KT c11kt = (C11KT) interfaceC2329309At;
                ViewPropertyAnimator listener = duration.setListener(new C464420IJc() { // from class: X.1AGB
                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                    public final void onAnimationCancel(Animator animator) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
                        c1agn.LIZLLL("createIconChangeAnimation fade out onAnimationCancel");
                        View view2 = c1agn.LIZJ;
                        if (view2 != null && (viewPropertyAnimatorAnimate2 = view2.animate()) != null) {
                            viewPropertyAnimatorAnimate2.setListener(null);
                        }
                        c11kt.onSuccess(Unit.LIZ);
                    }

                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        ViewPropertyAnimator viewPropertyAnimatorAnimate2;
                        c1agn.LIZLLL("createIconChangeAnimation fade out onAnimationEnd");
                        View view2 = c1agn.LIZJ;
                        if (view2 != null && (viewPropertyAnimatorAnimate2 = view2.animate()) != null) {
                            viewPropertyAnimatorAnimate2.setListener(null);
                        }
                        c11kt.onSuccess(Unit.LIZ);
                    }
                });
                if (listener != null) {
                    listener.start();
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0132  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void subscribe$1(X.C2189741Amy r15, X.InterfaceC2329309At r16) {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2189741Amy.subscribe$1(X.1Amy, X.09At):void");
    }

    public C2189741Amy(Object obj, Object obj2, Object obj3, int i) {
        this.$t = i;
        this.l0 = obj2;
        this.l1 = obj;
        this.l2 = obj3;
    }
}
