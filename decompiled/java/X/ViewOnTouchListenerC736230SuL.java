package X;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ss.android.ugc.aweme.feed.longvideo.edgespeedup.EdgeSpeedupAbility;

/* JADX INFO: renamed from: X.0SuL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ViewOnTouchListenerC736230SuL implements View.OnTouchListener {
    public final View LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public float LLILZIL;
    public final float LLILZLL;
    public EdgeSpeedupAbility LLJ;
    public final C01GW LLIZ = C452501pT.LIZIZ(new C736260SuO(this));
    public long LLIZLLLIL = -1;
    public final C01GW LLJI = C452501pT.LIZIZ(new C339170DRj());
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new C736250SuN(this));
    public final RunnableC736240SuM LLJILJIL = new Runnable() { // from class: X.0SuM
        @Override // java.lang.Runnable
        public final void run() {
            boolean zLIZ;
            C1C7U.LIZ("LongPressTouchDelegator@39c.r$1");
            try {
                ViewOnTouchListenerC736230SuL viewOnTouchListenerC736230SuL = this.LL;
                EdgeSpeedupAbility edgeSpeedupAbility = viewOnTouchListenerC736230SuL.LLJ;
                if (edgeSpeedupAbility != null) {
                    edgeSpeedupAbility.fs(viewOnTouchListenerC736230SuL.LLILLJJLI, viewOnTouchListenerC736230SuL.LLILLL);
                }
            } finally {
                if (!zLIZ) {
                }
            }
            C1C7U.LIZIZ("LongPressTouchDelegator@39c.r$1");
        }
    };

    /* JADX WARN: Type inference failed for: r0v11, types: [X.0SuM] */
    public ViewOnTouchListenerC736230SuL(View view) {
        this.LL = view;
        this.LLILZLL = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        EdgeSpeedupAbility edgeSpeedupAbility;
        EdgeSpeedupAbility edgeSpeedupAbility2;
        ViewGroup viewGroup;
        EdgeSpeedupAbility edgeSpeedupAbility3;
        EdgeSpeedupAbility edgeSpeedupAbility4;
        EdgeSpeedupAbility edgeSpeedupAbility5;
        EdgeSpeedupAbility edgeSpeedupAbility6;
        boolean z;
        EdgeSpeedupAbility edgeSpeedupAbility7;
        if (motionEvent == null || (edgeSpeedupAbility = this.LLJ) == null) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked == 5 && !edgeSpeedupAbility.aW1()) {
                            ((Handler) this.LLIZ.getValue()).removeCallbacks(this.LLJILJIL);
                        }
                    } else {
                        ((Handler) this.LLIZ.getValue()).removeCallbacks(this.LLJILJIL);
                        if (edgeSpeedupAbility.aW1() && (edgeSpeedupAbility7 = this.LLJ) != null) {
                            edgeSpeedupAbility7.wi(false);
                        }
                    }
                } else {
                    this.LLILZ = motionEvent.getX();
                    this.LLILZIL = motionEvent.getY();
                    float fAbs = Math.abs(this.LLILLJJLI - this.LLILZ);
                    float fAbs2 = Math.abs(this.LLILLL - this.LLILZIL);
                    float f = this.LLILZLL;
                    if ((fAbs > f || fAbs2 > f) && !edgeSpeedupAbility.aW1()) {
                        ((Handler) this.LLIZ.getValue()).removeCallbacks(this.LLJILJIL);
                    }
                    if (fAbs2 > this.LLILZLL && edgeSpeedupAbility.aW1() && (edgeSpeedupAbility6 = this.LLJ) != null) {
                        if (this.LLILLL - this.LLILZIL > 0.0f) {
                            z = true;
                        } else {
                            z = false;
                        }
                        edgeSpeedupAbility6.dp0(z);
                    }
                    if (C300710BqX.LIZ() && fAbs2 > this.LLILZLL) {
                        if (this.LLILLL - this.LLILZIL < 0.0f && (edgeSpeedupAbility5 = this.LLJ) != null && edgeSpeedupAbility5.aW1() && (fAbs2 > ((Number) this.LLJI.getValue()).floatValue() || this.LLILZIL >= ((Number) this.LLJIJIL.getValue()).floatValue())) {
                            EdgeSpeedupAbility edgeSpeedupAbility8 = this.LLJ;
                            if (edgeSpeedupAbility8 != null) {
                                edgeSpeedupAbility8.Eg1(true);
                            }
                        } else {
                            EdgeSpeedupAbility edgeSpeedupAbility9 = this.LLJ;
                            if (edgeSpeedupAbility9 != null && edgeSpeedupAbility9.q80() && (edgeSpeedupAbility3 = this.LLJ) != null && edgeSpeedupAbility3.aW1() && fAbs2 < ((Number) this.LLJI.getValue()).floatValue() && (edgeSpeedupAbility4 = this.LLJ) != null) {
                                edgeSpeedupAbility4.Eg1(false);
                            }
                        }
                    }
                }
            } else {
                ((Handler) this.LLIZ.getValue()).removeCallbacks(this.LLJILJIL);
                if (edgeSpeedupAbility.aW1()) {
                    EdgeSpeedupAbility edgeSpeedupAbility10 = this.LLJ;
                    if (edgeSpeedupAbility10 != null) {
                        edgeSpeedupAbility10.wi(false);
                    }
                    MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                    motionEventObtain.setAction(3);
                    ViewParent parent = this.LL.getParent();
                    if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                        viewGroup.dispatchTouchEvent(motionEventObtain);
                    }
                } else if (System.currentTimeMillis() - this.LLIZLLLIL > 300 && (edgeSpeedupAbility2 = this.LLJ) != null) {
                    edgeSpeedupAbility2.Xl(this.LLILLJJLI, this.LLILLL);
                }
            }
        } else {
            this.LLILLJJLI = motionEvent.getX();
            this.LLILLL = motionEvent.getY();
            this.LLIZLLLIL = System.currentTimeMillis();
            if (edgeSpeedupAbility.cS1(this.LLILLJJLI, this.LLILLL)) {
                ((Handler) this.LLIZ.getValue()).postDelayed(this.LLJILJIL, 300L);
            }
        }
        return edgeSpeedupAbility.aW1();
    }
}
