package X;

import Y.AUListenerS230S0200000_27;
import Y.AUListenerS275S0100000_27;
import android.animation.Animator;
import android.animation.ValueAnimator;
import androidx.cardview.widget.CardView;
import com.bytedance.android.livesdk.model.message.RankAnimationInfo;
import com.bytedance.android.livesdk.rank.api.RankAnimationType;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0y47, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1843210y47 extends AbstractC1842530y31 {
    public long LJJIIZ;
    public long LJJIIZI;
    public long LJJIJ;
    public long LJJIJIIJI;
    public ValueAnimator LJJIJIIJIL;
    public ValueAnimator LJJIJIL;
    public ValueAnimator LJJIJL;
    public ValueAnimator LJJIJLIJ;
    public ValueAnimator LJJIL;
    public ValueAnimator LJJIZ;
    public ValueAnimator LJJJ;
    public ValueAnimator LJJJI;
    public ValueAnimator LJJJIL;
    public ValueAnimator LJJJJ;
    public ValueAnimator LJJJJI;
    public ValueAnimator LJJJJIZL;
    public ValueAnimator LJJJJJ;
    public ValueAnimator LJJJJJL;
    public ValueAnimator LJJJJL;
    public ValueAnimator LJJJJLI;
    public int LJJJJLL;
    public int LJJJJZ;
    public int LJJJJZI;
    public String LJJJLIIL;
    public String LJJJLL;
    public String LJJJLZIJ;

    public void LJIL() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        valueAnimatorOfFloat.setStartDelay(this.LJJII ? 0L : this.LJJIIZ);
        valueAnimatorOfFloat.setDuration(700L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 71));
        valueAnimatorOfFloat.addListener(new C1864940ydA(this, 24));
        this.LJJIJLIJ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public void LJJ() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        valueAnimatorOfFloat.setStartDelay(this.LJJII ? 700L : 700 + this.LJJIIZ);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 72));
        valueAnimatorOfFloat.addListener(new C1864940ydA(this, 25));
        this.LJJIJL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public void LJJIFFI(C1842470y2v c1842470y2v) {
    }

    public void LJJIIJZLJL() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        valueAnimatorOfFloat.setStartDelay(this.LJJII ? 0L : this.LJJIIZ);
        valueAnimatorOfFloat.setDuration(700L);
        valueAnimatorOfFloat.addListener(new C1864940ydA(this, 10));
        this.LJJIJLIJ = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        valueAnimatorOfFloat2.setStartDelay(this.LJJII ? 700L : 700 + this.LJJIIZ);
        valueAnimatorOfFloat2.setDuration(300L);
        valueAnimatorOfFloat2.addListener(new C1864940ydA(this, 11));
        this.LJJIJL = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.start();
    }

    @Override // X.AbstractC1842530y31
    public final void LIZ() {
        ValueAnimator valueAnimator = this.LJJIJIIJIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimator2 = this.LJJIJIL;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
        }
        ValueAnimator valueAnimator3 = this.LJJIJL;
        if (valueAnimator3 != null) {
            valueAnimator3.cancel();
        }
        ValueAnimator valueAnimator4 = this.LJJIJLIJ;
        if (valueAnimator4 != null) {
            valueAnimator4.cancel();
        }
        ValueAnimator valueAnimator5 = this.LJJIL;
        if (valueAnimator5 != null) {
            valueAnimator5.cancel();
        }
        ValueAnimator valueAnimator6 = this.LJJIZ;
        if (valueAnimator6 != null) {
            valueAnimator6.cancel();
        }
        ValueAnimator valueAnimator7 = this.LJJJ;
        if (valueAnimator7 != null) {
            valueAnimator7.cancel();
        }
        ValueAnimator valueAnimator8 = this.LJJJI;
        if (valueAnimator8 != null) {
            valueAnimator8.cancel();
        }
        ValueAnimator valueAnimator9 = this.LJJJIL;
        if (valueAnimator9 != null) {
            valueAnimator9.cancel();
        }
        ValueAnimator valueAnimator10 = this.LJJJJ;
        if (valueAnimator10 != null) {
            valueAnimator10.cancel();
        }
        ValueAnimator valueAnimator11 = this.LJJJJI;
        if (valueAnimator11 != null) {
            valueAnimator11.cancel();
        }
        ValueAnimator valueAnimator12 = this.LJJJJIZL;
        if (valueAnimator12 != null) {
            valueAnimator12.cancel();
        }
        ValueAnimator valueAnimator13 = this.LJJJJJ;
        if (valueAnimator13 != null) {
            valueAnimator13.cancel();
        }
        ValueAnimator valueAnimator14 = this.LJJJJJL;
        if (valueAnimator14 != null) {
            valueAnimator14.cancel();
        }
        ValueAnimator valueAnimator15 = this.LJJJJL;
        if (valueAnimator15 != null) {
            valueAnimator15.cancel();
        }
        ValueAnimator valueAnimator16 = this.LJJJJLI;
        if (valueAnimator16 != null) {
            valueAnimator16.cancel();
        }
    }

    @Override // X.AbstractC1842530y31
    public final void LJIIJJI() {
        super.LJIIJJI();
        C786410Ut5.S4(1.0f, this.LJIILIIL);
        C786410Ut5.V4(this.LJIIL, 1.0f);
        C786410Ut5.LJZL(8, this.LJIILJJIL);
        C786410Ut5.o5(this.LJIILLIIL, 1.0f);
        C786410Ut5.V4(this.LJIILL, 1.0f);
        C786410Ut5.cd(0.0f, this.LJIILIIL);
        C786410Ut5.LJZL(8, this.LJIILJJIL);
        C786410Ut5.pd(this.LJIILLIIL, 0.0f);
        C786410Ut5.hd(this.LJIIJJI, 0.0f);
        C786410Ut5.LJZL(8, this.LJIILJJIL);
        C786410Ut5.hd(this.LJIILJJIL, 0.0f);
        this.LJIILLIIL.setScrollEnabled(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJI(X.C1842470y2v r13) {
        /*
            r12 = this;
            r6 = r12
            android.widget.ImageView r7 = r6.LJIILL
            r9 = 0
            r10 = 1
            r11 = 4
            r8 = r13
            X.AbstractC1842530y31.LJIIL(r6, r7, r8, r9, r10, r11)
            X.0y5u r5 = r6.LJIILLIIL
            com.bytedance.android.livesdk.model.message.RankAnimationInfo r0 = r8.LJI
            if (r0 == 0) goto L3b
            java.lang.String r4 = r0.getContent()
            if (r4 == 0) goto L3b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r2 = 0
        L1c:
            int r0 = r4.length()
            if (r2 >= r0) goto L34
            char r1 = r4.charAt(r2)
            r0 = 91
            if (r1 == r0) goto L31
            r0 = 93
            if (r1 == r0) goto L31
            r3.append(r1)
        L31:
            int r2 = r2 + 1
            goto L1c
        L34:
            java.lang.String r0 = r3.toString()
            if (r0 == 0) goto L3b
            goto L3d
        L3b:
            java.lang.String r0 = r8.LIZIZ
        L3d:
            r5.setText(r0)
            android.widget.TextView r0 = r6.LJIILIIL
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.LJJJLIIL = r0
            X.0y5u r0 = r6.LJIILLIIL
            java.lang.CharSequence r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            r6.LJJJLL = r0
            java.lang.String r0 = r8.LIZIZ
            r6.LJJJLZIJ = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1843210y47.LJIJI(X.0y2v):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void LJIJJ(X.C1842470y2v r9) {
        /*
            Method dump skipped, instruction units count: 267
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1843210y47.LJIJJ(X.0y2v):void");
    }

    public void LJJI(C1842470y2v c1842470y2v) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 73));
        valueAnimatorOfFloat.addListener(new C1864930yd9(this, c1842470y2v, 6));
        this.LJJIJIIJIL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public void LJJIII(C1842470y2v c1842470y2v) {
        long j;
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(this.LJJJJZ, this.LJJJJZI);
        valueAnimatorOfInt.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
        if (this.LJJII) {
            j = 250;
        } else {
            j = this.LJJIJIIJI;
        }
        valueAnimatorOfInt.setStartDelay(j);
        valueAnimatorOfInt.setDuration(750L);
        valueAnimatorOfInt.addUpdateListener(new AUListenerS230S0200000_27(this, valueAnimatorOfInt, 12));
        valueAnimatorOfInt.addListener(new C1864940ydA(this, 26));
        this.LJJJJLI = valueAnimatorOfInt;
        valueAnimatorOfInt.start();
    }

    public C1843210y47(CardView cardView, C1842430y2r c1842430y2r) {
        super(cardView, c1842430y2r);
        this.LJJIIZ = 4000L;
        this.LJJIIZI = 4500L;
        this.LJJIJ = Mp4ScreenVideoLoadTimeout.CONTROL;
        this.LJJIJIIJI = 4500L;
        this.LJJJLIIL = "";
        this.LJJJLL = "";
        this.LJJJLZIJ = "";
    }

    @Override // X.AbstractC1842530y31
    public final void LJIIIZ(final C1842470y2v c1842470y2v, final C1842470y2v c1842470y2v2) {
        Integer numValueOf;
        int i;
        C1810410xDD c1810410xDD;
        RankTypeV2 rankTypeV2;
        LJIJI(c1842470y2v);
        C20441214yg.LIZIZ("Ranking Entrance Unification", "GeneralAdvancedTransitionProcessor - set up animations");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("needMarquee: ");
        sbLIZ.append(this.LJJII);
        C20441214yg.LIZIZ("Ranking Entrance Unification", C2188811AlT.LIZIZ(sbLIZ));
        LJIJJ(c1842470y2v);
        int i2 = C1843090y3v.LIZ[AbstractC1842530y31.LIZJ(c1842470y2v, c1842470y2v2).ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.LJJJJZI = this.LJJJJLL;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, this.LIZIZ.LJIILL * (-1.0f));
                    valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                    valueAnimatorOfFloat.setStartDelay(0L);
                    valueAnimatorOfFloat.setDuration(750L);
                    valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 37));
                    this.LJJJJI = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.start();
                    ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(this.LIZIZ.LJIILL, 0.0f);
                    valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                    valueAnimatorOfFloat2.setStartDelay(0L);
                    valueAnimatorOfFloat2.setDuration(750L);
                    valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(this, 81));
                    valueAnimatorOfFloat2.addListener(new C1704130uRn() { // from class: X.0y4C
                        @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            C1843210y47 c1843210y47 = this.LL;
                            c1843210y47.LJIJ(c1842470y2v, c1842470y2v2, c1843210y47.LJIILLIIL.getText().toString(), this.LL.LJJIIZI);
                        }

                        @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                        public final void onAnimationStart(Animator animator) {
                            C786410Ut5.LJZL(0, this.LL.LJIILJJIL);
                            C1843210y47 c1843210y47 = this.LL;
                            C786410Ut5.hd(c1843210y47.LJIILJJIL, c1843210y47.LIZIZ.LJIILL);
                        }
                    });
                    this.LJJJJIZL = valueAnimatorOfFloat2;
                    valueAnimatorOfFloat2.start();
                }
            } else {
                ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(0.0f, this.LIZIZ.LJIILL * (-1.0f));
                valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                valueAnimatorOfFloat3.setStartDelay(0L);
                valueAnimatorOfFloat3.setDuration(750L);
                valueAnimatorOfFloat3.addUpdateListener(new AUListenerS275S0100000_27(this, 44));
                this.LJJJ = valueAnimatorOfFloat3;
                valueAnimatorOfFloat3.start();
                ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(this.LIZIZ.LJIILL, 0.0f);
                valueAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                valueAnimatorOfFloat4.setStartDelay(0L);
                valueAnimatorOfFloat4.setDuration(750L);
                valueAnimatorOfFloat4.addUpdateListener(new AUListenerS275S0100000_27(this, 29));
                valueAnimatorOfFloat4.addListener(new C1704130uRn() { // from class: X.0y4B
                    @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        C1843210y47 c1843210y47 = this.LL;
                        c1843210y47.LJIJ(c1842470y2v, c1842470y2v2, c1843210y47.LJIILLIIL.getText().toString(), this.LL.LJJIIZI);
                    }

                    @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        C786410Ut5.LJZL(0, this.LL.LJIILJJIL);
                        C1843210y47 c1843210y47 = this.LL;
                        C786410Ut5.pd(c1843210y47.LJIILLIIL, c1843210y47.LIZIZ.LJIILL);
                    }
                });
                this.LJJJI = valueAnimatorOfFloat4;
                valueAnimatorOfFloat4.start();
            }
        } else if (Intrinsics.LJFF(this.LJJJLIIL, this.LJJJLL)) {
            LJJIIJ(c1842470y2v, c1842470y2v2);
        } else {
            LJJI(c1842470y2v);
            LJIJJLI(c1842470y2v, c1842470y2v2);
        }
        C1842430y2r c1842430y2r = this.LIZIZ;
        if (c1842470y2v2 != null && (c1810410xDD = c1842470y2v2.LIZ) != null && (rankTypeV2 = c1810410xDD.LIZIZ) != null) {
            numValueOf = Integer.valueOf(rankTypeV2.type);
        } else {
            numValueOf = null;
        }
        int iLIZ = c1842430y2r.LIZ(numValueOf);
        C1842430y2r c1842430y2r2 = this.LIZIZ;
        RankAnimationInfo rankAnimationInfo = c1842470y2v.LJI;
        if (rankAnimationInfo != null) {
            i = rankAnimationInfo.type;
        } else {
            i = RankAnimationType.LIZLLL.type;
        }
        int iLIZIZ = c1842430y2r2.LIZIZ(i);
        this.LIZJ.setCardBackgroundColor(iLIZ);
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(iLIZ, iLIZIZ);
        valueAnimatorOfArgb.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        valueAnimatorOfArgb.setStartDelay(0L);
        valueAnimatorOfArgb.setDuration(500L);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS275S0100000_27(this, 78));
        this.LJJJJJ = valueAnimatorOfArgb;
        valueAnimatorOfArgb.start();
        LJJIFFI(c1842470y2v);
    }

    public void LJIJJLI(final C1842470y2v c1842470y2v, final C1842470y2v c1842470y2v2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        valueAnimatorOfFloat.setStartDelay(300L);
        valueAnimatorOfFloat.setDuration(700L);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(this, 70));
        valueAnimatorOfFloat.addListener(new C1704130uRn() { // from class: X.0y4F
            @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1843210y47 c1843210y47 = this.LL;
                c1843210y47.LJIJ(c1842470y2v, c1842470y2v2, c1843210y47.LJIILLIIL.getText().toString(), this.LL.LJJIIZ);
            }

            @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C786410Ut5.LJZL(0, this.LL.LJIILJJIL);
                C786410Ut5.o5(this.LL.LJIILLIIL, 0.0f);
            }
        });
        this.LJJIJIL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
    }

    public void LJJII(C1842470y2v c1842470y2v, C1842470y2v c1842470y2v2) {
        Integer numValueOf;
        int i;
        long j;
        C1810410xDD c1810410xDD;
        RankTypeV2 rankTypeV2;
        C1842430y2r c1842430y2r = this.LIZIZ;
        if (c1842470y2v2 != null && (c1810410xDD = c1842470y2v2.LIZ) != null && (rankTypeV2 = c1810410xDD.LIZIZ) != null) {
            numValueOf = Integer.valueOf(rankTypeV2.type);
        } else {
            numValueOf = null;
        }
        int iLIZ = c1842430y2r.LIZ(numValueOf);
        C1842430y2r c1842430y2r2 = this.LIZIZ;
        RankAnimationInfo rankAnimationInfo = c1842470y2v.LJI;
        if (rankAnimationInfo != null) {
            i = rankAnimationInfo.type;
        } else {
            i = RankAnimationType.LIZLLL.type;
        }
        ValueAnimator valueAnimatorOfArgb = ValueAnimator.ofArgb(c1842430y2r2.LIZIZ(i), iLIZ);
        valueAnimatorOfArgb.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        if (this.LJJII) {
            j = 500;
        } else {
            j = this.LJJIJ;
        }
        valueAnimatorOfArgb.setStartDelay(j);
        valueAnimatorOfArgb.setDuration(500L);
        valueAnimatorOfArgb.addUpdateListener(new AUListenerS275S0100000_27(this, 74));
        this.LJJJJJL = valueAnimatorOfArgb;
        valueAnimatorOfArgb.start();
    }

    public void LJJIIJ(final C1842470y2v c1842470y2v, final C1842470y2v c1842470y2v2) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        valueAnimatorOfFloat.setStartDelay(0L);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.addListener(new C1864930yd9(this, c1842470y2v, 7));
        this.LJJIJIIJIL = valueAnimatorOfFloat;
        valueAnimatorOfFloat.start();
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.0f, 0.0f, 1.0f, 1.0f));
        valueAnimatorOfFloat2.setStartDelay(300L);
        valueAnimatorOfFloat2.setDuration(700L);
        valueAnimatorOfFloat2.addListener(new C1704130uRn() { // from class: X.0y4H
            @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                C1843210y47 c1843210y47 = this.LL;
                c1843210y47.LJIJ(c1842470y2v, c1842470y2v2, c1843210y47.LJIILLIIL.getText().toString(), this.LL.LJJIIZ);
            }

            @Override // X.C1704130uRn, android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator) {
                C786410Ut5.LJZL(0, this.LL.LJIILJJIL);
            }
        });
        this.LJJIJIL = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.start();
    }

    public final void LJIJ(final C1842470y2v c1842470y2v, final C1842470y2v c1842470y2v2, String str, long j) {
        AbstractC1842530y31.LJIILJJIL(this.LIZJ, -2);
        LJIILL(EnumC1842640y3C.ONCE, this.LJIILLIIL, str, j, new InterfaceC1704110uRl() { // from class: X.0y4A
            @Override // X.InterfaceC1704110uRl
            public final void LIZ(int i) {
                long j2;
                long j3;
                long j4;
                long j5;
                if (i > 0) {
                    this.LIZ.LJIILLIIL.setScrollEnabled(false);
                }
                C1843210y47 c1843210y47 = this.LIZ;
                C1842470y2v c1842470y2v3 = c1842470y2v;
                C1842470y2v c1842470y2v4 = c1842470y2v2;
                c1843210y47.getClass();
                int i2 = C1843090y3v.LIZ[AbstractC1842530y31.LIZJ(c1842470y2v3, c1842470y2v4).ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(c1843210y47.LIZIZ.LJIILL, 0.0f);
                            valueAnimatorOfFloat.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                            if (c1843210y47.LJJII) {
                                j4 = 0;
                            } else {
                                j4 = c1843210y47.LJJIIZI;
                            }
                            valueAnimatorOfFloat.setStartDelay(j4);
                            valueAnimatorOfFloat.setDuration(750L);
                            valueAnimatorOfFloat.addUpdateListener(new AUListenerS275S0100000_27(c1843210y47, 35));
                            valueAnimatorOfFloat.start();
                            ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(0.0f, c1843210y47.LIZIZ.LJIILL * (-1.0f));
                            valueAnimatorOfFloat2.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                            if (c1843210y47.LJJII) {
                                j5 = 0;
                            } else {
                                j5 = c1843210y47.LJJIIZI;
                            }
                            valueAnimatorOfFloat2.setStartDelay(j5);
                            valueAnimatorOfFloat2.setDuration(750L);
                            valueAnimatorOfFloat2.addUpdateListener(new AUListenerS275S0100000_27(c1843210y47, 84));
                            valueAnimatorOfFloat2.addListener(new C1864940ydA(c1843210y47, 29));
                            valueAnimatorOfFloat2.start();
                        }
                    } else {
                        ValueAnimator valueAnimatorOfFloat3 = ValueAnimator.ofFloat(c1843210y47.LIZIZ.LJIILL, 0.0f);
                        valueAnimatorOfFloat3.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                        if (c1843210y47.LJJII) {
                            j2 = 0;
                        } else {
                            j2 = c1843210y47.LJJIIZI;
                        }
                        valueAnimatorOfFloat3.setStartDelay(j2);
                        valueAnimatorOfFloat3.setDuration(750L);
                        valueAnimatorOfFloat3.addUpdateListener(new AUListenerS275S0100000_27(c1843210y47, 41));
                        c1843210y47.LJJJIL = valueAnimatorOfFloat3;
                        valueAnimatorOfFloat3.start();
                        ValueAnimator valueAnimatorOfFloat4 = ValueAnimator.ofFloat(0.0f, c1843210y47.LIZIZ.LJIILL * (-1.0f));
                        valueAnimatorOfFloat4.setInterpolator(C0GY9.LIZIZ(0.66f, 0.0f, 0.34f, 1.0f));
                        if (c1843210y47.LJJII) {
                            j3 = 0;
                        } else {
                            j3 = c1843210y47.LJJIIZI;
                        }
                        valueAnimatorOfFloat4.setStartDelay(j3);
                        valueAnimatorOfFloat4.setDuration(750L);
                        valueAnimatorOfFloat4.addUpdateListener(new AUListenerS275S0100000_27(c1843210y47, 32));
                        valueAnimatorOfFloat4.addListener(new C1864940ydA(c1843210y47, 5));
                        c1843210y47.LJJJJ = valueAnimatorOfFloat4;
                        valueAnimatorOfFloat4.start();
                    }
                } else if (Intrinsics.LJFF(c1843210y47.LJJJLL, c1843210y47.LJJJLZIJ)) {
                    c1843210y47.LJJIIJZLJL();
                } else {
                    c1843210y47.LJJ();
                    c1843210y47.LJIL();
                }
                c1843210y47.LJJIII(c1842470y2v3);
                c1843210y47.LJJII(c1842470y2v3, c1842470y2v4);
            }
        }, true);
    }
}
