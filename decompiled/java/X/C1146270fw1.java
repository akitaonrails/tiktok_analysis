package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS28S0101000_17;
import Y.ARunnableS86S0200000_17;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.model.message.battle.BattleUserArmy;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS0S0601003_17;

/* JADX INFO: renamed from: X.0fw1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1146270fw1 extends FrameLayout {
    public static final /* synthetic */ int LLJJJJ = 0;
    public String LL;
    public boolean LLILLJJLI;
    public final C1324720kZq LLILLL;
    public final C1324720kZq LLILZ;
    public final C1324720kZq LLILZIL;
    public final C1324720kZq LLILZLL;
    public final C0GRR LLIZ;
    public int LLIZLLLIL;
    public boolean LLJ;
    public BattleUserArmy LLJI;
    public final C1324720kZq LLJIJIL;
    public int LLJILJIL;
    public final LinkedList<C1146300fw4> LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public FrameLayout LLJJIII;
    public C1324720kZq LLJJIJI;
    public boolean LLJJIJIIJIL;
    public C1324720kZq LLJJIJIL;
    public Function0<Unit> LLJJJ;
    public boolean LLJJJIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v14, types: [T, java.lang.Object] */
    public final void LJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(" processQueue isInProcessQueue = ");
        sbLIZ.append(this.LLJILLL);
        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJILLL) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LL);
            sbLIZ2.append(' ');
            sbLIZ2.append(this.LLJILJIL);
            sbLIZ2.append(" processQueue isInProcessQueue return");
            C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        C259800zU c259800zU = new C259800zU();
        synchronized (this.LLJILJILJ) {
            try {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(this.LL);
                sbLIZ3.append(' ');
                sbLIZ3.append(this.LLJILJIL);
                sbLIZ3.append(" processQueue  synchronized(scalingAnimationQueue)");
                C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ3));
                if (this.LLJILJILJ.isEmpty()) {
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append(this.LL);
                    sbLIZ4.append(' ');
                    sbLIZ4.append(this.LLJILJIL);
                    sbLIZ4.append(" scalingAnimationQueue.isEmpty()");
                    C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ4));
                    return;
                }
                c259800zU.element = this.LLJILJILJ.removeLast();
                this.LLJILJILJ.clear();
                this.LLJILLL = true;
                if (((C1146300fw4) c259800zU.element).LIZ) {
                    long jLIZ = (2010 - C158B.LIZ()) + ((C1146300fw4) c259800zU.element).LIZJ;
                    if (jLIZ > 0) {
                        this.LLJILJIL = 1;
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append(this.LL);
                        sbLIZ5.append(' ');
                        sbLIZ5.append(this.LLJILJIL);
                        sbLIZ5.append(" delayDuration");
                        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ5));
                        HandlerHook.viewPostDelay(this, new ARunnableS86S0200000_17(this, c259800zU, 8), jLIZ);
                        return;
                    }
                }
                LJ((C1146300fw4) c259800zU.element);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIIZ() {
        C0GRR c0grr = this.LLIZ;
        if (c0grr != null) {
            c0grr.setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.etp, getContext()), C20736316Cj.LIZIZ(R.attr.eto, getContext())});
        }
    }

    public final void LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(" isPoweringUp = ");
        sbLIZ.append(this.LLJJ);
        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
        if (!this.LLJJ) {
            C1324720kZq c1324720kZq = this.LLILZ;
            if (c1324720kZq != null) {
                C500260Jjc.LJIILLIIL(c1324720kZq);
                return;
            }
            return;
        }
        if (this.LLILLJJLI) {
            C1324720kZq c1324720kZq2 = this.LLILZ;
            if (c1324720kZq2 != null) {
                C500260Jjc.LLFFF(c1324720kZq2);
                return;
            }
            return;
        }
        C1324720kZq c1324720kZq3 = this.LLILZ;
        if (c1324720kZq3 != null) {
            C500260Jjc.LJIILLIIL(c1324720kZq3);
        }
        C1324720kZq c1324720kZq4 = this.LLILLL;
        if (c1324720kZq4 != null) {
            C786410Ut5.h5(c1324720kZq4, 1.0f);
        }
    }

    public final void getRingColor() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(" getRingColor = ");
        sbLIZ.append(this.LLJJ);
        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJ) {
            C0GRR c0grr = this.LLIZ;
            if (c0grr != null) {
                c0grr.setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.etp, getContext()), C20736316Cj.LIZIZ(R.attr.eto, getContext())});
                return;
            }
            return;
        }
        if (this.LLJJJIL) {
            C0GRR c0grr2 = this.LLIZ;
            if (c0grr2 != null) {
                c0grr2.setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.f0b, getContext()), C20736316Cj.LIZIZ(R.attr.f0b, getContext())});
                return;
            }
            return;
        }
        if (this.LLJ) {
            C0GRR c0grr3 = this.LLIZ;
            if (c0grr3 != null) {
                c0grr3.setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.es2, getContext()), C20736316Cj.LIZIZ(R.attr.es1, getContext())});
                return;
            }
            return;
        }
        C20441214yg.LJIIIZ("redesign", "setblue");
        C0GRR c0grr4 = this.LLIZ;
        if (c0grr4 != null) {
            c0grr4.setGradientColors(new int[]{C20736316Cj.LIZIZ(R.attr.eug, getContext()), C20736316Cj.LIZIZ(R.attr.euf, getContext())});
        }
    }

    public final String getNameTag() {
        return this.LL;
    }

    public final int getRankId() {
        return this.LLIZLLLIL;
    }

    public final BattleUserArmy getUserInfo() {
        return this.LLJI;
    }

    public final void LIZIZ(boolean z) {
        FrameLayout frameLayout;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("checkBorderAndRankPosition: borderAnimViewShowing ");
        sbLIZ.append(this.LLJJIJIIJIL);
        sbLIZ.append(", checkAgain ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJIJIIJIL && (frameLayout = this.LLJJIII) != null) {
            LIZ(this.LLJJIJI, LIZJ(frameLayout));
            LIZ(this.LLJJIJIL, LIZLLL(frameLayout));
            if (z) {
                HandlerHook.viewPostDelay(this, new ARunnableS113S0100000_13(this, 46), 500L);
            }
        }
    }

    public final FrameLayout.LayoutParams LIZJ(FrameLayout frameLayout) {
        float f;
        if (this.LLJJI) {
            f = 31.0f;
        } else {
            f = 32.0f;
        }
        return C425250Glv.LIZ(this, frameLayout, (int) C497740JfY.LIZIZ(f), -((int) C497740JfY.LIZIZ(2.0f)), false);
    }

    public final FrameLayout.LayoutParams LIZLLL(FrameLayout frameLayout) {
        float f;
        float f2;
        float f3 = 11.0f;
        int iLIZIZ = (int) C497740JfY.LIZIZ(11.0f);
        if (this.LLJJI) {
            f = 17.0f;
        } else {
            f = 18.0f;
        }
        int iLIZIZ2 = (int) C497740JfY.LIZIZ(f);
        if (this.LLJJI) {
            f2 = 14.0f;
        } else {
            f2 = 15.0f;
        }
        int iLIZIZ3 = (int) C497740JfY.LIZIZ(f2);
        if (!this.LLJJI) {
            f3 = 13.0f;
        }
        return C425250Glv.LIZJ(this, frameLayout, iLIZIZ, iLIZIZ2, iLIZIZ3, (int) C497740JfY.LIZIZ(f3), false);
    }

    public final void LJ(C1146300fw4 c1146300fw4) {
        float f;
        float f2;
        float f3;
        boolean z = c1146300fw4.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.LL);
        sbLIZ.append(' ');
        sbLIZ.append(this.LLJILJIL);
        sbLIZ.append(" executeAnimation isPoweringUp = ");
        sbLIZ.append(this.LLJJ);
        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
        if (z == this.LLJJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(this.LL);
            sbLIZ2.append(' ');
            sbLIZ2.append(this.LLJILJIL);
            sbLIZ2.append(" executeAnimation false");
            C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ2));
            this.LLJILLL = false;
            this.LLJILJIL = 0;
            LJII();
            return;
        }
        boolean z2 = c1146300fw4.LIZ;
        int i = c1146300fw4.LIZIZ;
        boolean z3 = c1146300fw4.LIZLLL;
        FrameLayout frameLayout = c1146300fw4.LJ;
        Function1<Integer, Unit> function1 = c1146300fw4.LJFF;
        Function0<Unit> function0 = c1146300fw4.LJI;
        Function0<Unit> function02 = c1146300fw4.LJII;
        this.LLJILJIL = 2;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(this.LL);
        sbLIZ3.append(' ');
        sbLIZ3.append(this.LLJILJIL);
        sbLIZ3.append(" playScalingAnimation isPoweringUp = ");
        sbLIZ3.append(this.LLJJ);
        sbLIZ3.append("; isPowerUp = ");
        sbLIZ3.append(z2);
        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ3));
        this.LLJJ = z2;
        getRingColor();
        if (!this.LLJJ) {
            this.LLJJIJIIJIL = false;
            if (frameLayout != null) {
                C786410Ut5.LJJJZ(this.LLJJIJI, frameLayout);
                C786410Ut5.LJJJZ(this.LLJJIJIL, frameLayout);
            }
        }
        C1324720kZq c1324720kZq = this.LLILLL;
        if (c1324720kZq != null) {
            if (this.LLJJ) {
                f = 1.0f;
                f2 = 0.0f;
            } else {
                f = 0.0f;
                f2 = 1.0f;
            }
            this.LLJJI = z3;
            if (z3) {
                f3 = 1.2857143f;
            } else {
                f3 = 1.37f;
            }
            C1126360fPu.LIZ(new AwS0S0601003_17(this, f3, f, f2, c1324720kZq, function1, function02, i, frameLayout, function0, 1)).LIZJ();
        }
    }

    public final void LJIIL(int i) {
        if (this.LLJJIJIIJIL) {
            C1324720kZq c1324720kZq = this.LLJJIJI;
            if (c1324720kZq != null) {
                C786410Ut5.Jc(c1324720kZq, c1324720kZq.getTranslationX() + i);
            }
            C1324720kZq c1324720kZq2 = this.LLJJIJIL;
            if (c1324720kZq2 != null) {
                C786410Ut5.Jc(c1324720kZq2, c1324720kZq2.getTranslationX() + i);
            }
        }
    }

    public final void setDefaultSeat(boolean z) {
        int i;
        this.LLILLJJLI = true;
        this.LLJ = z;
        C1324720kZq c1324720kZq = this.LLILLL;
        if (c1324720kZq != null) {
            if (z) {
                i = R.drawable.fa_;
            } else {
                i = R.drawable.fa9;
            }
            c1324720kZq.setImageResource(i);
        }
        C1324720kZq c1324720kZq2 = this.LLILLL;
        if (c1324720kZq2 != null) {
            C786410Ut5.LLJJIII(c1324720kZq2, 0);
        }
        LJIIIIZZ();
        C1324720kZq c1324720kZq3 = this.LLILZIL;
        if (c1324720kZq3 != null) {
            C786410Ut5.LLJJIII(c1324720kZq3, 8);
        }
        C0GRR c0grr = this.LLIZ;
        if (c0grr != null) {
            int visibility = c0grr.getVisibility();
            c0grr.setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, c0grr);
        }
        C1324720kZq c1324720kZq4 = this.LLJIJIL;
        if (c1324720kZq4 != null) {
            C786410Ut5.LLJJIII(c1324720kZq4, 0);
        }
        C1324720kZq c1324720kZq5 = this.LLJIJIL;
        if (c1324720kZq5 != null) {
            C786410Ut5.h5(c1324720kZq5, 0.0f);
        }
        this.LLJI = null;
    }

    public final void setEmpty(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setIsGroupLive(boolean z) {
        this.LLJJJIL = z;
    }

    public final void setNameTag(String str) {
        this.LL = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1146270fw1(android.content.Context r4, android.util.AttributeSet r5) {
        /*
            r3 = this;
            r0 = 0
            r3.<init>(r4, r5, r0)
            java.lang.String r0 = "MatchMvpSeatView"
            r3.LL = r0
            r0 = -1
            r3.LLJILJIL = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r3.LLJILJILJ = r0
            com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting r0 = com.bytedance.android.livesdk.livesetting.performance.LiveUltimateInflateSwitchSetting.INSTANCE
            boolean r0 = r0.getValue()
            r2 = 2131569020(0x7f0d297c, float:1.8763655E38)
            if (r0 == 0) goto L6b
            X.01GW r0 = X.C485950J3x.LIZ
            boolean r0 = X.C485950J3x.LIZ(r2)
            if (r0 == 0) goto L6b
            X.C485950J3x.LIZJ(r3, r2)
        L28:
            r0 = 2131382451(0x7f0a50b3, float:1.8385248E38)
            android.view.View r0 = r3.findViewById(r0)
            X.0kZq r0 = (X.C1324720kZq) r0
            r3.LLILLL = r0
            r0 = 2131382452(0x7f0a50b4, float:1.838525E38)
            android.view.View r0 = r3.findViewById(r0)
            X.0kZq r0 = (X.C1324720kZq) r0
            r3.LLILZ = r0
            r0 = 2131382448(0x7f0a50b0, float:1.8385242E38)
            android.view.View r0 = r3.findViewById(r0)
            X.0kZq r0 = (X.C1324720kZq) r0
            r3.LLILZIL = r0
            r0 = 2131382449(0x7f0a50b1, float:1.8385244E38)
            android.view.View r0 = r3.findViewById(r0)
            X.0kZq r0 = (X.C1324720kZq) r0
            r3.LLILZLL = r0
            r0 = 2131399286(0x7f0a9276, float:1.8419393E38)
            android.view.View r0 = r3.findViewById(r0)
            X.0GRR r0 = (X.C0GRR) r0
            r3.LLIZ = r0
            r0 = 2131382443(0x7f0a50ab, float:1.8385232E38)
            android.view.View r0 = r3.findViewById(r0)
            X.0kZq r0 = (X.C1324720kZq) r0
            r3.LLJIJIL = r0
            return
        L6b:
            android.view.LayoutInflater r1 = X.C786410Ut5.ne(r4)
            r0 = 1
            X.C786410Ut5.Td(r1, r2, r3, r0)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1146270fw1.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    public static void LIZ(C1324720kZq c1324720kZq, FrameLayout.LayoutParams layoutParams) {
        FrameLayout.LayoutParams layoutParams2;
        ViewGroup.LayoutParams layoutParams3 = null;
        if (c1324720kZq != null) {
            layoutParams3 = c1324720kZq.getLayoutParams();
        }
        if ((layoutParams3 instanceof FrameLayout.LayoutParams) && (layoutParams2 = (FrameLayout.LayoutParams) layoutParams3) != null) {
            if (layoutParams2.leftMargin + ((int) c1324720kZq.getTranslationX()) != layoutParams.leftMargin || layoutParams2.topMargin + ((int) c1324720kZq.getTranslationY()) != layoutParams.topMargin) {
                C786410Ut5.W5(c1324720kZq, layoutParams);
                C786410Ut5.Jc(c1324720kZq, 0.0f);
                C786410Ut5.ed(c1324720kZq, 0.0f);
            }
        }
    }

    public final int LJFF(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRankResId: rank ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
        if (z) {
            if (i != 1) {
                if (i != 2) {
                    return R.drawable.ey6;
                }
                return R.drawable.ey7;
            }
            return R.drawable.ey5;
        }
        if (i != 1) {
            if (i != 2) {
                return R.drawable.eth;
            }
            return R.drawable.eti;
        }
        return R.drawable.etg;
    }

    public final int LJI(int i, boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getTop23RankResId: rank ");
        sbLIZ.append(i);
        sbLIZ.append(' ');
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
        if (i != 2) {
            if (i != 3) {
                return LJFF(i, z);
            }
            return R.drawable.ez_;
        }
        return R.drawable.eza;
    }

    public final void LJIIJ(BattleUserArmy battleUserArmy, int i) {
        ImageModel imageModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setMvpSeat: rank ");
        sbLIZ.append(i);
        sbLIZ.append(", ");
        sbLIZ.append(this.LL);
        C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ));
        this.LLIZLLLIL = i;
        int iLJFF = LJFF(i, this.LLJ);
        BattleUserArmy battleUserArmy2 = BattleUserArmy.LIZ;
        int i2 = R.drawable.fa_;
        if (battleUserArmy == battleUserArmy2) {
            this.LLILLJJLI = true;
            C1324720kZq c1324720kZq = this.LLILLL;
            if (c1324720kZq != null) {
                C786410Ut5.LLJJIII(c1324720kZq, 0);
            }
            this.LLJI = null;
            C1324720kZq c1324720kZq2 = this.LLILLL;
            if (c1324720kZq2 != null) {
                if (!this.LLJ) {
                    i2 = R.drawable.fa9;
                }
                c1324720kZq2.setImageResource(i2);
            }
            LJIIIIZZ();
            C0GRR c0grr = this.LLIZ;
            if (c0grr != null) {
                int visibility = c0grr.getVisibility();
                c0grr.setVisibility(8);
                C1602160rnK.LIZIZ(visibility, 8, c0grr);
            }
            C1324720kZq c1324720kZq3 = this.LLILZIL;
            if (c1324720kZq3 != null) {
                C786410Ut5.LLJJIII(c1324720kZq3, 8);
            }
            C1324720kZq c1324720kZq4 = this.LLJIJIL;
            if (c1324720kZq4 != null) {
                C786410Ut5.h5(c1324720kZq4, 0.0f);
                return;
            }
            return;
        }
        if (battleUserArmy == BattleUserArmy.LIZIZ) {
            this.LLILLJJLI = true;
            C1324720kZq c1324720kZq5 = this.LLILLL;
            if (c1324720kZq5 != null) {
                C786410Ut5.LLJJIII(c1324720kZq5, 0);
            }
            this.LLJI = null;
            C1324720kZq c1324720kZq6 = this.LLILLL;
            if (c1324720kZq6 != null) {
                if (!this.LLJ) {
                    i2 = R.drawable.fa9;
                }
                c1324720kZq6.setImageResource(i2);
            }
            LJIIIIZZ();
            C0GRR c0grr2 = this.LLIZ;
            if (c0grr2 != null) {
                int visibility2 = c0grr2.getVisibility();
                c0grr2.setVisibility(8);
                C1602160rnK.LIZIZ(visibility2, 8, c0grr2);
            }
            C1324720kZq c1324720kZq7 = this.LLILZIL;
            if (c1324720kZq7 != null) {
                C786410Ut5.LLJJIII(c1324720kZq7, 8);
            }
            C1324720kZq c1324720kZq8 = this.LLJIJIL;
            if (c1324720kZq8 == null) {
                return;
            }
            C786410Ut5.h5(c1324720kZq8, 0.0f);
            return;
        }
        BattleUserArmy battleUserArmy3 = this.LLJI;
        if (battleUserArmy3 == null) {
            this.LLJI = battleUserArmy;
        } else if (battleUserArmy3.userId == battleUserArmy.userId && (imageModel = battleUserArmy3.avatarThumb) != null && imageModel.equals(battleUserArmy.avatarThumb)) {
            return;
        }
        this.LLJI = battleUserArmy;
        this.LLILLJJLI = false;
        C1324720kZq c1324720kZq9 = this.LLILLL;
        if (c1324720kZq9 != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("army.avatarThumb = ");
            sbLIZ2.append(battleUserArmy.avatarThumb);
            C20441214yg.LIZIZ("MatchMvpSeatView", C2188811AlT.LIZIZ(sbLIZ2));
            C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(battleUserArmy.avatarThumb);
            c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el_;
            int width = c1324720kZq9.getWidth();
            int height = c1324720kZq9.getHeight();
            c1324610kZfLJIIIZ.LJ = width;
            c1324610kZfLJIIIZ.LJFF = height;
            c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
            c1324610kZfLJIIIZ.LJIIL = new C1151780g4u(this, 0);
            c1324610kZfLJIIIZ.LJJI(c1324720kZq9);
        }
        C1324720kZq c1324720kZq10 = this.LLILLL;
        if (c1324720kZq10 == null) {
            return;
        }
        HandlerHook.viewPost(c1324720kZq10, new ARunnableS28S0101000_17(iLJFF, this, 0));
    }

    public final void LJIIJJI(int i, int i2) {
        ViewGroup.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2;
        if (i > 0 && i2 > 0) {
            for (View view : C1697810uHb.LJIIJJI(this.LLILLL, this.LLIZ, this.LLILZ)) {
                if (view != null && (layoutParams2 = view.getLayoutParams()) != null && (layoutParams2.width != i || layoutParams2.height != i2)) {
                    layoutParams2.width = i;
                    layoutParams2.height = i2;
                    C786410Ut5.W5(view, layoutParams2);
                }
            }
            C1324720kZq c1324720kZq = this.LLJIJIL;
            if (c1324720kZq != null && (layoutParams = c1324720kZq.getLayoutParams()) != null) {
                layoutParams.width = i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(3));
                layoutParams.height = (i - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(1))) / 3;
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) layoutParams;
                layoutParams3.setMarginStart(0);
                layoutParams3.gravity = 81;
                C1324720kZq c1324720kZq2 = this.LLJIJIL;
                if (c1324720kZq2 != null) {
                    C786410Ut5.u6(c1324720kZq2, layoutParams);
                }
            }
        }
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            if ((i != 4 && i != 8) || !this.LLJJIJIIJIL) {
                return;
            }
            C1324720kZq c1324720kZq = this.LLJJIJI;
            if (c1324720kZq != null) {
                C500260Jjc.LJIILLIIL(c1324720kZq);
            }
            C1324720kZq c1324720kZq2 = this.LLJJIJIL;
            if (c1324720kZq2 != null) {
                C500260Jjc.LJIILLIIL(c1324720kZq2);
            }
            LIZIZ(true);
            return;
        }
        if (!this.LLJJIJIIJIL) {
            return;
        }
        Function0<Unit> function0 = this.LLJJJ;
        if (function0 != null) {
            function0.invoke();
        }
        HandlerHook.viewPostDelay(this, new ARunnableS113S0100000_13(this, 47), 20L);
    }
}
