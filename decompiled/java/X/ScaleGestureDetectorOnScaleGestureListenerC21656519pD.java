package X;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.api.MoveLiveGoalEffectEvent;
import com.bytedance.android.live.interaction.drawguess.DrawGuessTouchEvent;
import com.bytedance.android.livesdk.dataChannel.LiveCenterStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveExtendedScreenStatus;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.19pD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ScaleGestureDetectorOnScaleGestureListenerC21656519pD extends AbstractC1120020fFg implements ScaleGestureDetector.OnScaleGestureListener {
    public final C19290410dS LL;
    public final ScaleGestureDetector LLILLJJLI;
    public final C21656319pB LLILLL;
    public boolean LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public float LLJ = 1.0f;
    public EnumC1700590uM5 LLJI = EnumC1700590uM5.BEF_GESTURE_TYPE_PAN;
    public boolean LLJIJIL;
    public MotionEvent LLJILJIL;
    public final int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final DataChannel LLJJI;

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector scaleGestureDetector) {
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return true;
    }

    @Override // X.AbstractC1120020fFg
    public final int LIZIZ() {
        return this.LLJILJILJ;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        this.LLJI = EnumC1700590uM5.BEF_GESTURE_TYPE_SCALE;
        MotionEvent motionEvent = this.LLJILJIL;
        if (motionEvent != null) {
            LJII(201, LJI(motionEvent, true));
            this.LLJILJIL = null;
        }
        float scaleFactor = scaleGestureDetector.getScaleFactor() / this.LLJ;
        C21656619pE c21656619pE = new C21656619pE();
        c21656619pE.LJI = scaleFactor;
        c21656619pE.LJFF = 3.0f;
        LJII(205, c21656619pE);
        this.LLJ = scaleGestureDetector.getScaleFactor();
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
        this.LLJ = 1.0f;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        this.LLJI = EnumC1700590uM5.BEF_GESTURE_TYPE_TAP;
        MotionEvent motionEvent2 = this.LLJILJIL;
        if (motionEvent2 != null) {
            LJII(201, LJI(motionEvent2, true));
            this.LLJILJIL = null;
        }
        LJII(206, LJI(motionEvent, false));
        return true;
    }

    public static void LJII(int i, C21656619pE c21656619pE) {
        if (c21656619pE != null) {
            C784440Upu.LIZ().LIZIZ(new C21657019pI(i, c21656619pE));
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("notifyTouchEvent, action: ");
            sbLIZ.append(i);
            C20441214yg.LJIIIZ("EffectGestureDetector", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("notifyTouchEvent event is null, action: ");
        sbLIZ2.append(i);
        C20441214yg.LJ("EffectGestureDetector", C2188811AlT.LIZIZ(sbLIZ2));
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00be  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C21656619pE LJFF(android.view.MotionEvent r7, long r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ScaleGestureDetectorOnScaleGestureListenerC21656519pD.LJFF(android.view.MotionEvent, long):X.19pE");
    }

    public final C21656619pE LJI(MotionEvent motionEvent, boolean z) {
        float x;
        float y;
        EnumC1700590uM5 enumC1700590uM5;
        C21656619pE c21656619pE = new C21656619pE();
        if (Math.abs(this.LLIZLLLIL) > 10) {
            x = motionEvent.getX() - this.LLIZLLLIL;
        } else {
            x = motionEvent.getX();
        }
        c21656619pE.LIZIZ = x / this.LLILZIL;
        if (Math.abs(this.LLIZ) > 10) {
            y = motionEvent.getY() - this.LLIZ;
        } else {
            y = motionEvent.getY();
        }
        float f = y / this.LLILZLL;
        c21656619pE.LIZJ = f;
        float f2 = c21656619pE.LIZIZ;
        if (f2 > 0.0f) {
            if (f2 >= 1.0f) {
                f2 = 1.0f;
            }
        } else {
            f2 = 0.0f;
        }
        c21656619pE.LIZIZ = f2;
        if (f > 0.0f) {
            if (f >= 1.0f) {
                f = 1.0f;
            }
        } else {
            f = 0.0f;
        }
        c21656619pE.LIZJ = f;
        if (z && (enumC1700590uM5 = this.LLJI) != null) {
            c21656619pE.LIZ = enumC1700590uM5.ordinal();
        }
        return c21656619pE;
    }

    public ScaleGestureDetectorOnScaleGestureListenerC21656519pD(Context context, DataChannel dataChannel, int i) {
        this.LLJILJILJ = i;
        this.LLJJI = dataChannel;
        this.LLILZIL = C786410Ut5.N3(context).getResources().getDisplayMetrics().widthPixels;
        this.LLILZLL = C786410Ut5.N3(context).getResources().getDisplayMetrics().heightPixels;
        C19290410dS c19290410dS = new C19290410dS(context, this, null);
        this.LL = c19290410dS;
        c19290410dS.LIZ.setIsLongpressEnabled(false);
        c19290410dS.LIZIZ(this);
        this.LLILLJJLI = new ScaleGestureDetector(context, this);
        this.LLILLL = new C21656319pB(context, new C21656919pH(this));
    }

    @Override // X.AbstractC1120020fFg
    public final boolean LJ(MotionEvent motionEvent, C0UKP c0ukp, View view) {
        ((IEffectService) C1161920gLG.LIZJ(IEffectService.class)).getLiveEffectHelper();
        ArrayList arrayList = (ArrayList) C767770U9v.LIZ();
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                List<String> listLIZJ = ((LiveEffect) it2.next()).LIZJ();
                if (listLIZJ != null && !listLIZJ.isEmpty() && listLIZJ.contains("TouchGes")) {
                    if (C500260Jjc.LJJIJLIJ() && view != null) {
                        view.getParent().requestDisallowInterceptTouchEvent(true);
                    }
                    Object objGg0 = this.LLJJI.gg0(LiveCenterStatusChannel.class);
                    Object objGg02 = this.LLJJI.gg0(LiveExtendedScreenStatus.class);
                    if ((objGg0 != null && objGg0 != C0UVH.DISMISS) || (objGg02 != null && objGg02 != EnumC1083260eIO.HIDE)) {
                        return false;
                    }
                    if (C500260Jjc.LJIIZILJ(this.LLJJI) && this.LLJJ) {
                        if (this.LLJILLL) {
                            return true;
                        }
                        if (motionEvent.getAction() == 0) {
                            this.LLJJI.FQ2(DrawGuessTouchEvent.class);
                        }
                    }
                    this.LLILZIL = (int) c0ukp.LIZ;
                    this.LLILZLL = (int) c0ukp.LIZIZ;
                    this.LLIZ = (int) c0ukp.LIZJ;
                    this.LLIZLLLIL = (int) c0ukp.LIZLLL;
                    C21656319pB c21656319pB = this.LLILLL;
                    c21656319pB.getClass();
                    int action = motionEvent.getAction() & 255;
                    if (!c21656319pB.LJFF) {
                        if (action != 2) {
                            if (action == 5) {
                                c21656319pB.LIZIZ();
                                c21656319pB.LIZIZ = MotionEvent.obtain(motionEvent);
                                c21656319pB.LIZJ(motionEvent);
                                boolean zLIZ = c21656319pB.LIZ(motionEvent);
                                c21656319pB.LJIIL = zLIZ;
                                if (!zLIZ) {
                                    c21656319pB.LJIIJJI.getClass();
                                    c21656319pB.LJFF = true;
                                }
                            }
                        } else if (c21656319pB.LJIIL) {
                            boolean zLIZ2 = c21656319pB.LIZ(motionEvent);
                            c21656319pB.LJIIL = zLIZ2;
                            if (!zLIZ2) {
                                c21656319pB.LJIIJJI.getClass();
                                c21656319pB.LJFF = true;
                            }
                        }
                    } else if (action != 2) {
                        if (action != 3) {
                            if (action == 6) {
                                c21656319pB.LIZJ(motionEvent);
                                if (!c21656319pB.LJIIL) {
                                    C21656919pH c21656919pH = (C21656919pH) c21656319pB.LJIIJJI;
                                    c21656919pH.getClass();
                                    C21656619pE c21656619pE = new C21656619pE();
                                    c21656619pE.LJII = (float) (Math.atan2(c21656319pB.LJIIIIZZ, c21656319pB.LJII) - Math.atan2(c21656319pB.LJIIJ, c21656319pB.LJIIIZ));
                                    c21656619pE.LJFF = 6.0f;
                                    c21656919pH.LIZ.getClass();
                                    LJII(208, c21656619pE);
                                }
                                c21656319pB.LIZIZ();
                            }
                        } else {
                            if (!c21656319pB.LJIIL) {
                                C21656919pH c21656919pH2 = (C21656919pH) c21656319pB.LJIIJJI;
                                c21656919pH2.getClass();
                                C21656619pE c21656619pE2 = new C21656619pE();
                                c21656619pE2.LJII = (float) (Math.atan2(c21656319pB.LJIIIIZZ, c21656319pB.LJII) - Math.atan2(c21656319pB.LJIIJ, c21656319pB.LJIIIZ));
                                c21656619pE2.LJFF = 6.0f;
                                c21656919pH2.LIZ.getClass();
                                LJII(208, c21656619pE2);
                            }
                            c21656319pB.LIZIZ();
                        }
                    } else {
                        c21656319pB.LIZJ(motionEvent);
                        if (c21656319pB.LIZLLL / c21656319pB.LJ > 0.67f) {
                            C21656919pH c21656919pH3 = (C21656919pH) c21656319pB.LJIIJJI;
                            c21656919pH3.getClass();
                            C21656619pE c21656619pE3 = new C21656619pE();
                            c21656619pE3.LJII = (float) (Math.atan2(c21656319pB.LJIIIIZZ, c21656319pB.LJII) - Math.atan2(c21656319pB.LJIIJ, c21656319pB.LJIIIZ));
                            c21656619pE3.LJFF = 6.0f;
                            c21656919pH3.LIZ.getClass();
                            LJII(208, c21656619pE3);
                            MotionEvent motionEvent2 = c21656319pB.LIZIZ;
                            if (motionEvent2 != null) {
                                motionEvent2.recycle();
                                c21656319pB.LIZIZ = MotionEvent.obtain(motionEvent);
                            }
                        }
                    }
                    C0UFT.LIZ();
                    if ((motionEvent.getAction() & 255) == 2) {
                        this.LLJJI.LC0(MoveLiveGoalEffectEvent.class, Boolean.TRUE);
                        for (int i = 0; i < motionEvent.getPointerCount(); i++) {
                            C784440Upu.LIZ().LIZIZ(new C21657019pI(207, LJFF(motionEvent, motionEvent.getPointerId(i))));
                        }
                    } else {
                        C784440Upu.LIZ().LIZIZ(new C21657019pI(207, LJFF(motionEvent, motionEvent.getPointerId(motionEvent.getActionIndex()))));
                    }
                    int action2 = motionEvent.getAction() & 255;
                    this.LLILLJJLI.onTouchEvent(motionEvent);
                    if (action2 == 0) {
                        this.LLILZ = false;
                    }
                    if (motionEvent.getPointerCount() > 1) {
                        this.LLILZ = true;
                    }
                    if (!this.LLILZ) {
                        this.LL.LIZ(motionEvent);
                    }
                    if (action2 != 0) {
                        if (action2 == 1) {
                            this.LLJIJIL = false;
                            LJII(202, LJI(motionEvent, true));
                        }
                        return true;
                    }
                    this.LLJIJIL = true;
                    this.LLJILJIL = motionEvent;
                    return true;
                }
            }
        }
        if (C500260Jjc.LJJIJLIJ() && view != null) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        if (this.LLJIJIL) {
            this.LLJIJIL = false;
        }
        this.LLJI = EnumC1700590uM5.BEF_GESTURE_TYPE_PAN;
        MotionEvent motionEvent3 = this.LLJILJIL;
        if (motionEvent3 != null) {
            LJII(201, LJI(motionEvent3, true));
            this.LLJILJIL = null;
        }
        C21656619pE c21656619pELJI = LJI(motionEvent2, false);
        c21656619pELJI.LIZLLL = f / this.LLILZIL;
        c21656619pELJI.LJ = f2 / this.LLILZLL;
        c21656619pELJI.LJFF = 1.0f;
        LJII(203, c21656619pELJI);
        return true;
    }
}
