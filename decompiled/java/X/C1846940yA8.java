package X;

import Y.AAListenerS171S0000000_27;
import Y.ARunnableS127S0100000_27;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.util.Property;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.zhiliaoapp.musically.R;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yA8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1846940yA8 implements InterfaceC1846720y9m<C1119420fEi> {
    public final View LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final ImageView LIZLLL;
    public final LinearLayout LJ;
    public final C1846630y9d LJFF;
    public final C1846630y9d LJI;
    public boolean LJII;
    public CountDownTimerC1811820xFU LJIIIIZZ;
    public C1119420fEi LJIIIZ;
    public AbstractC1847300yAi LJIIJ;
    public final ARunnableS127S0100000_27 LJIIJJI;
    public final long LJIIL;

    @Override // X.InterfaceC1846720y9m
    public final Pair<Integer, Integer> LIZ() {
        C1119210fEN.LIZ.getClass();
        int i = C1119210fEN.LIZJ;
        this.LJFF.setText("");
        this.LJI.setText(C497740JfY.LJIJI(2131855536));
        C786410Ut5.LJZI(0, this.LIZLLL);
        C1846800y9u.LJIIJJI(this.LJ);
        this.LJFF.setText("");
        this.LJI.setText("");
        C786410Ut5.LJZI(8, this.LIZLLL);
        return new Pair<>(Integer.valueOf(this.LJ.getMeasuredWidth() + i), Integer.valueOf(this.LJ.getMeasuredHeight()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x002c, code lost:
    
        if (r3 != 100) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0046, code lost:
    
        if (r3 <= 150) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0032  */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.0yAC, X.0yAi] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZJ() {
        /*
            r9 = this;
            boolean r0 = r9.LIZJ
            r8 = 1
            r6 = 0
            r5 = 0
            if (r0 == 0) goto L38
            X.0fEi r0 = r9.LJIIIZ
            if (r0 == 0) goto L49
            X.0yA7 r0 = X.C1846800y9u.LJIIIIZZ(r0)
            if (r0 == 0) goto L36
            int r3 = r0.LIZ
        L14:
            X.0fEi r0 = r9.LJIIIZ
            if (r0 == 0) goto L1e
            long r1 = r0.LJFF
            int r0 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r0 > 0) goto L49
        L1e:
            r0 = 400(0x190, float:5.6E-43)
            if (r3 == r0) goto L2e
            r0 = 300(0x12c, float:4.2E-43)
            if (r3 == r0) goto L2e
            r0 = 200(0xc8, float:2.8E-43)
            if (r3 == r0) goto L2e
            r0 = 100
            if (r3 != r0) goto L49
        L2e:
            X.0yAi r0 = r9.LJIIJ
            if (r0 == 0) goto L35
            r0.LLIILZL()
        L35:
            return r8
        L36:
            r3 = 0
            goto L14
        L38:
            X.0fEi r0 = r9.LJIIIZ
            if (r0 == 0) goto L49
            long r3 = r0.LJII
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 <= 0) goto L2e
            r1 = 150(0x96, double:7.4E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L49
            goto L2e
        L49:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1846940yA8.LIZJ():boolean");
    }

    @Override // X.InterfaceC1846720y9m
    public final void onDestroy() {
        CountDownTimerC1811820xFU countDownTimerC1811820xFU = this.LJIIIIZZ;
        if (countDownTimerC1811820xFU != null) {
            countDownTimerC1811820xFU.cancel();
        }
        CountDownTimerC1811820xFU countDownTimerC1811820xFU2 = this.LJIIIIZZ;
        if (countDownTimerC1811820xFU2 != null) {
            countDownTimerC1811820xFU2.LIZ = null;
        }
        this.LJIIIIZZ = null;
        HandlerHook.viewRemoveCallbacks(this.LJI, this.LJIIJJI);
        this.LJIIJ = null;
    }

    public final void LJ() {
        this.LJI.setText(C497740JfY.LJIJI(2131855536));
    }

    @Override // X.InterfaceC1846720y9m
    public final void LIZIZ(C1119420fEi c1119420fEi) {
        int i;
        this.LJIIIZ = c1119420fEi;
        C1846930yA7 c1846930yA7LJIIIIZZ = C1846800y9u.LJIIIIZZ(c1119420fEi);
        if (c1846930yA7LJIIIIZZ != null) {
            i = c1846930yA7LJIIIIZZ.LIZ;
        } else {
            i = 0;
        }
        if (this.LJII) {
            LJFF(Integer.valueOf(i));
            C1846810y9v c1846810y9v = c1119420fEi.LJIIIIZZ;
            if (c1846810y9v != null) {
                int i2 = c1846810y9v.LIZ;
                if (i2 != 1) {
                    if (i2 == 2) {
                        LJ();
                        return;
                    }
                    return;
                } else {
                    LJ();
                    LIZJ();
                    return;
                }
            }
            return;
        }
        this.LJII = true;
        LJFF(Integer.valueOf(i));
        C1846810y9v c1846810y9v2 = c1119420fEi.LJIIIIZZ;
        if (c1846810y9v2 != null) {
            int i3 = c1846810y9v2.LIZ;
            if (i3 != 1) {
                if (i3 == 2) {
                    LJ();
                    return;
                }
            } else {
                LJ();
                LIZJ();
                return;
            }
        }
        this.LJFF.setText("");
        long jLIZJ = (c1119420fEi.LIZLLL - C158B.LIZJ()) * 1000;
        if (jLIZJ < 0) {
            jLIZJ = 0;
        }
        LIZLLL(this, jLIZJ);
        if (!this.LIZIZ && jLIZJ > 0) {
            CountDownTimerC1811820xFU countDownTimerC1811820xFU = new CountDownTimerC1811820xFU(jLIZJ);
            this.LJIIIIZZ = countDownTimerC1811820xFU;
            countDownTimerC1811820xFU.LIZ = new InterfaceC1811830xFV() { // from class: X.0yA9
                /* JADX WARN: Type inference failed for: r0v4, types: [X.0yAC, X.0yAi] */
                @Override // X.InterfaceC1811830xFV
                public final void LIZLLL() {
                    ?? r0;
                    C1846940yA8 c1846940yA8 = this.LIZ;
                    if (c1846940yA8.LJIIIZ != null && !c1846940yA8.LIZJ() && (r0 = c1846940yA8.LJIIJ) != 0) {
                        r0.LLJIJIL();
                    }
                    C1846940yA8.LIZLLL(this.LIZ, 0L);
                    this.LIZ.LJ();
                }

                @Override // X.InterfaceC1811830xFV
                public final void LJJI(long j) {
                    C1846940yA8.LIZLLL(this.LIZ, j);
                    C1846940yA8 c1846940yA8 = this.LIZ;
                    if (j <= c1846940yA8.LJIIL) {
                        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(c1846940yA8.LJI, (Property<C1846630y9d, Float>) View.SCALE_X, 1.2f, 1.0f);
                        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(c1846940yA8.LJI, (Property<C1846630y9d, Float>) View.SCALE_Y, 1.2f, 1.0f);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.addListener(new AAListenerS171S0000000_27(0));
                        animatorSet.setDuration(250L);
                        animatorSet.setInterpolator(new InterpolatorC1088720eRC(0.35d, 0.0d, 0.0d, 1.0d));
                        animatorSet.playTogether(objectAnimatorOfFloat, objectAnimatorOfFloat2);
                        animatorSet.start();
                    }
                }
            };
            countDownTimerC1811820xFU.start();
            return;
        }
        if (jLIZJ > 0) {
            return;
        }
        LJ();
    }

    public void LJFF(Integer num) {
        C786410Ut5.LJZI(0, this.LIZLLL);
        this.LIZLLL.setImageResource(R.drawable.el5);
    }

    public static final void LIZLLL(C1846940yA8 c1846940yA8, long j) {
        String strLJFF = C1846800y9u.LJFF(j, false);
        if (!Intrinsics.LJFF(c1846940yA8.LJI.getText(), strLJFF)) {
            c1846940yA8.LJI.setText(strLJFF);
        }
    }

    public C1846940yA8(View view, boolean z, boolean z2) {
        this.LIZ = view;
        this.LIZIZ = z;
        this.LIZJ = z2;
        ImageView imageView = (ImageView) view.findViewById(R.id.lxu);
        this.LIZLLL = imageView;
        this.LJ = (LinearLayout) view.findViewById(R.id.f0m);
        C1846630y9d c1846630y9d = (C1846630y9d) view.findViewById(R.id.xwk);
        this.LJFF = c1846630y9d;
        C1846630y9d c1846630y9d2 = (C1846630y9d) view.findViewById(R.id.xwc);
        this.LJI = c1846630y9d2;
        this.LJIIJJI = new ARunnableS127S0100000_27(this, 63);
        new AnimatorSet();
        this.LJIIL = 10000L;
        int visibility = c1846630y9d.getVisibility();
        c1846630y9d.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c1846630y9d);
        c1846630y9d2.LJJJJIZL();
        C1119210fEN.LIZ.getClass();
        int i = C1119210fEN.LIZIZ;
        c1846630y9d2.LLJJIJIIJIL = true;
        c1846630y9d2.LLJJIJI = i;
        C786410Ut5.LJZI(0, imageView);
    }
}
