package X;

import Y.AAListenerS262S0200000_7;
import Y.AUListenerS2S0200001_7;
import android.animation.ValueAnimator;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMockCurTime;

/* JADX INFO: renamed from: X.0INk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C465540INk {
    public static final C465540INk LIZ = new C465540INk();
    public static String LIZIZ = "new_oldversion";
    public static final float LIZJ = C418440Gaw.LIZIZ(90);
    public static boolean LIZLLL;
    public static boolean LJ;
    public static boolean LJFF;
    public static ValueAnimator LJI;
    public static ValueAnimator LJII;
    public static Float LJIIIIZZ;

    public static String LIZ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_state");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static Float LIZIZ(LivePlayFragment livePlayFragment) {
        View view;
        if (livePlayFragment != null && (view = livePlayFragment.getView()) != null) {
            return Float.valueOf(view.getTranslationY());
        }
        return null;
    }

    public static String LIZJ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_last_show_time");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LIZLLL(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_last_slide_time");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static String LJ(long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(j);
        sbLIZ.append("_type");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJFF(LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2) {
        Float fLIZIZ = LIZIZ(livePlayFragment);
        if (fLIZIZ != null || (fLIZIZ = LIZIZ(livePlayFragment2)) != null) {
            float fFloatValue = fLIZIZ.floatValue();
            if (fFloatValue != 0.0f && livePlayFragment != null && livePlayFragment2 != null) {
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue, 0.0f);
                LJII = valueAnimatorOfFloat;
                if (valueAnimatorOfFloat != null) {
                    valueAnimatorOfFloat.setDuration(Math.abs((long) fFloatValue));
                }
                ValueAnimator valueAnimator = LJII;
                if (valueAnimator != null) {
                    valueAnimator.addUpdateListener(new AUListenerS2S0200001_7(fFloatValue, livePlayFragment, livePlayFragment2, 0));
                }
                ValueAnimator valueAnimator2 = LJII;
                if (valueAnimator2 != null) {
                    valueAnimator2.addListener(new AAListenerS262S0200000_7(livePlayFragment2, livePlayFragment, 1));
                }
                LIZLLL = false;
                ValueAnimator valueAnimator3 = LJII;
                if (valueAnimator3 != null) {
                    valueAnimator3.start();
                }
            }
        }
    }

    public static void LJI(C465540INk c465540INk, LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2, boolean z) {
        String str;
        c465540INk.getClass();
        Float fLIZIZ = LIZIZ(livePlayFragment);
        if (fLIZIZ != null) {
            LJ = false;
            livePlayFragment2.QV(C497740JfY.LJIJI(2131844517));
            float f = -LIZJ;
            float fAbs = Math.abs(f - fLIZIZ.floatValue());
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fLIZIZ.floatValue(), f);
            LJI = valueAnimatorOfFloat;
            if (valueAnimatorOfFloat != null) {
                valueAnimatorOfFloat.setDuration(500L);
            }
            ValueAnimator valueAnimator = LJI;
            if (valueAnimator != null) {
                valueAnimator.addUpdateListener(new AUListenerS2S0200001_7(fAbs, livePlayFragment, livePlayFragment2, 1));
            }
            ValueAnimator valueAnimator2 = LJI;
            if (valueAnimator2 != null) {
                valueAnimator2.addListener(new AAListenerS262S0200000_7(livePlayFragment, livePlayFragment2, 2));
            }
            LIZLLL = true;
            ValueAnimator valueAnimator3 = LJI;
            if (valueAnimator3 != null) {
                valueAnimator3.start();
            }
            if (z) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("draw_guide_show");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LJJII(C466640IRq.LIZJ().LIZLLL(), "request_page");
                if (C466230IQb.LIZJ().LLJJIJI == 0) {
                    str = "medium";
                } else {
                    str = "low";
                }
                c474500IjALIZ.LJJII(str, "strength");
                c474500IjALIZ.LJJII(LIZIZ, "type");
                c474500IjALIZ.LIZ();
            }
        }
    }

    public final boolean LJII(LivePlayFragment livePlayFragment, LivePlayFragment livePlayFragment2, C1305440k4k c1305440k4k, long j) {
        if (livePlayFragment.f1 == 0) {
            LIZIZ = "new";
            long curTime = LiveMockCurTime.INSTANCE.getCurTime();
            if (curTime <= 0) {
                curTime = System.currentTimeMillis();
            }
            int iLJFF = c1305440k4k.LJFF(LIZ(j), 0);
            if (iLJFF != 0) {
                if (iLJFF == 1) {
                    long jLJI = c1305440k4k.LJI(LIZLLL(j), 0L);
                    if (jLJI > 0 && curTime - jLJI <= 1209600000) {
                        c1305440k4k.LJIIIIZZ(2, LIZ(j));
                        return false;
                    }
                    long jLJI2 = c1305440k4k.LJI(LIZJ(j), 0L);
                    if (jLJI2 > 0 && curTime - jLJI2 < 86400000) {
                        return false;
                    }
                    LJI(this, livePlayFragment, livePlayFragment2, true);
                    c1305440k4k.LJII(Long.valueOf(curTime), LIZJ(j));
                    c1305440k4k.LJII(2, LIZ(j));
                    c1305440k4k.LIZ();
                    return true;
                }
            } else {
                long jLJI3 = c1305440k4k.LJI(LIZLLL(j), 0L);
                if (jLJI3 <= 0 || curTime - jLJI3 > 1209600000) {
                    LJI(this, livePlayFragment, livePlayFragment2, true);
                    c1305440k4k.LJII(Long.valueOf(curTime), LIZJ(j));
                    c1305440k4k.LJII(1, LIZ(j));
                    c1305440k4k.LIZ();
                    return true;
                }
            }
            return false;
        }
        C466230IQb.LIZJ().LLJJIJIL = false;
        return false;
    }
}
