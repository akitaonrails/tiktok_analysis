package Y;

import X.C0P0T;
import X.C1403960mde;
import X.C1408710mlJ;
import X.C1415280mvu;
import X.C1427500nFc;
import X.C1428470nHB;
import X.C1433730nPf;
import X.C1447150nlJ;
import X.C1447520nlu;
import X.C1447770nmJ;
import X.C1451990nt7;
import X.C1453280nvC;
import X.C1458920o4I;
import X.C20684815ws;
import X.C2344009Gk;
import X.C786410Ut5;
import X.InterfaceC1427550nFh;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes23.dex */
public class ATListenerS455S0100000_22 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            case 3:
                return onTouch$3(this, view, motionEvent);
            case 4:
                return onTouch$4(this, view, motionEvent);
            case 5:
                return onTouch$5(this, view, motionEvent);
            case 6:
                return onTouch$6(this, view, motionEvent);
            case 7:
                return onTouch$7(this, view, motionEvent);
            case 8:
                return onTouch$8(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS455S0100000_22(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS455S0100000_22 aTListenerS455S0100000_22, View view, MotionEvent motionEvent) {
        C1408710mlJ c1408710mlJ;
        Function1<? super C1408710mlJ, Unit> function1;
        if (motionEvent.getActionMasked() == 0 && (function1 = (c1408710mlJ = (C1408710mlJ) aTListenerS455S0100000_22.l0).LLJIJIL) != null) {
            function1.invoke(c1408710mlJ);
            return false;
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS455S0100000_22 aTListenerS455S0100000_22, View view, MotionEvent motionEvent) {
        ((C1447150nlJ) aTListenerS455S0100000_22.l0).LLIZLLLIL.onNext(motionEvent);
        return true;
    }

    public static final boolean onTouch$2(ATListenerS455S0100000_22 aTListenerS455S0100000_22, View view, MotionEvent motionEvent) {
        InterfaceC1427550nFh interfaceC1427550nFh;
        if (motionEvent.getAction() == 0 && (interfaceC1427550nFh = ((C1427500nFc) aTListenerS455S0100000_22.l0).LL) != null) {
            interfaceC1427550nFh.LIZJ();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$3(ATListenerS455S0100000_22 aTListenerS455S0100000_22, View view, MotionEvent motionEvent) {
        int i;
        int i2;
        String creationId;
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action == 3) {
                        C1447770nmJ c1447770nmJ = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                        c1447770nmJ.LJJII = false;
                        c1447770nmJ.LJJIJIL.setValue(Boolean.FALSE);
                        ((C1447770nmJ) aTListenerS455S0100000_22.l0).LJJIFFI = System.currentTimeMillis();
                        C1447770nmJ c1447770nmJ2 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                        if (c1447770nmJ2.LJIIL != 0 && c1447770nmJ2.LJIJI) {
                            C1447770nmJ.LIZLLL(c1447770nmJ2, 3);
                        }
                        C1447770nmJ c1447770nmJ3 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                        c1447770nmJ3.LJIL = -1.0f;
                        c1447770nmJ3.LJJ = -1.0f;
                    }
                } else {
                    C1447770nmJ c1447770nmJ4 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                    if (c1447770nmJ4.LJIILJJIL) {
                        if (Intrinsics.LJFF(c1447770nmJ4.LJJIJIL.getValue(), Boolean.FALSE)) {
                            C1447770nmJ c1447770nmJ5 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                            c1447770nmJ5.getClass();
                            C2344009Gk c2344009Gk = new C2344009Gk();
                            VideoPublishEditModel currentModel = c1447770nmJ5.LIZIZ.getCurrentModel();
                            String strLJIILIIL = null;
                            if (currentModel != null) {
                                creationId = currentModel.getCreationId();
                            } else {
                                creationId = null;
                            }
                            c2344009Gk.LJIIIIZZ("creation_id", creationId);
                            VideoPublishEditModel currentModel2 = c1447770nmJ5.LIZIZ.getCurrentModel();
                            if (currentModel2 != null) {
                                strLJIILIIL = C1428470nHB.LJIILIIL(currentModel2);
                            }
                            c2344009Gk.LJIIIIZZ("content_source", strLJIILIIL);
                            c2344009Gk.LJ(c1447770nmJ5.LIZIZ.getCurrentProgress(), "publishing_percentage");
                            c2344009Gk.LIZJ(C1433730nPf.LJIIL(), "publish_cnt");
                            C20684815ws.LJIILLIIL("drag_publishing_toast", c2344009Gk.LIZ);
                        }
                        C1447770nmJ c1447770nmJ6 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                        float rawX = motionEvent.getRawX();
                        float rawY = motionEvent.getRawY();
                        WindowManager.LayoutParams layoutParams = c1447770nmJ6.LJIIIZ;
                        int i3 = layoutParams.x;
                        float f = c1447770nmJ6.LJIL;
                        if (f < 0.0f) {
                            i = 0;
                        } else {
                            i = (int) (rawX - f);
                        }
                        layoutParams.x = i3 + i;
                        int i4 = layoutParams.y;
                        float f2 = c1447770nmJ6.LJJ;
                        if (f2 < 0.0f) {
                            i2 = 0;
                        } else {
                            i2 = (int) (rawY - f2);
                        }
                        layoutParams.y = i4 + i2;
                        WindowManager windowManager = c1447770nmJ6.LJIIJ;
                        if (windowManager != null) {
                            windowManager.updateViewLayout(c1447770nmJ6.LIZIZ, layoutParams);
                        }
                        ((C1447770nmJ) aTListenerS455S0100000_22.l0).LJJIJIL.setValue(Boolean.TRUE);
                    }
                    float rawX2 = motionEvent.getRawX();
                    float rawY2 = motionEvent.getRawY();
                    C1447770nmJ c1447770nmJ7 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                    float f3 = rawX2 - c1447770nmJ7.LJIL;
                    float fSqrt = (float) Math.sqrt(f3 * f3);
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    C1447770nmJ c1447770nmJ8 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                    c1447770nmJ7.LJJIJ = fSqrt / (jCurrentTimeMillis - c1447770nmJ8.LJJIJIIJIL);
                    c1447770nmJ8.LJJIJIIJI = rawX2 - c1447770nmJ8.LJIL;
                    c1447770nmJ8.LJIL = rawX2;
                    c1447770nmJ8.LJJ = rawY2;
                    c1447770nmJ8.LJJIJIIJIL = System.currentTimeMillis();
                    C1447770nmJ c1447770nmJ9 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                    float fAbs = Math.abs(c1447770nmJ9.LJIJJ - c1447770nmJ9.LJIL);
                    C1447770nmJ c1447770nmJ10 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                    if (fAbs > c1447770nmJ10.LJIIJJI || Math.abs(c1447770nmJ10.LJIJJLI - c1447770nmJ10.LJJ) > ((C1447770nmJ) aTListenerS455S0100000_22.l0).LJIIJJI) {
                        ((C1447770nmJ) aTListenerS455S0100000_22.l0).LJJII = false;
                        return false;
                    }
                }
            } else {
                C1447770nmJ c1447770nmJ11 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                c1447770nmJ11.LJJII = false;
                c1447770nmJ11.LJJIJIL.setValue(Boolean.FALSE);
                ((C1447770nmJ) aTListenerS455S0100000_22.l0).LJIL = motionEvent.getRawX();
                ((C1447770nmJ) aTListenerS455S0100000_22.l0).LJJ = motionEvent.getRawY();
                ((C1447770nmJ) aTListenerS455S0100000_22.l0).LJJIFFI = System.currentTimeMillis();
                C1447770nmJ c1447770nmJ12 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                float fAbs2 = Math.abs(c1447770nmJ12.LJIJJ - c1447770nmJ12.LJIL);
                C1447770nmJ c1447770nmJ13 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                if (fAbs2 < c1447770nmJ13.LJIIJJI) {
                    float fAbs3 = Math.abs(c1447770nmJ13.LJIJJLI - c1447770nmJ13.LJJ);
                    C1447770nmJ c1447770nmJ14 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                    if (fAbs3 < c1447770nmJ14.LJIIJJI && c1447770nmJ14.LJJIFFI - c1447770nmJ14.LJJI < c1447770nmJ14.LJJIIZI) {
                        c1447770nmJ14.LJJIIJ++;
                    }
                }
                C1447770nmJ c1447770nmJ15 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                if (c1447770nmJ15.LJIIL != 0 && c1447770nmJ15.LJIJI) {
                    C1447770nmJ.LIZLLL(c1447770nmJ15, 3);
                }
                C1447770nmJ c1447770nmJ16 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
                c1447770nmJ16.LJIL = -1.0f;
                c1447770nmJ16.LJJ = -1.0f;
                return false;
            }
        } else {
            C1447770nmJ c1447770nmJ17 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
            c1447770nmJ17.LJJII = true;
            c1447770nmJ17.LJIJJ = motionEvent.getRawX();
            ((C1447770nmJ) aTListenerS455S0100000_22.l0).LJIJJLI = motionEvent.getRawY();
            ((C1447770nmJ) aTListenerS455S0100000_22.l0).LJJI = System.currentTimeMillis();
            C1447770nmJ c1447770nmJ18 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
            C786410Ut5.LJLIIL(c1447770nmJ18.LJJIIJZLJL, c1447770nmJ18.LJIILIIL, new ARunnableS122S0100000_22(c1447770nmJ18, 41));
            C1447770nmJ c1447770nmJ19 = (C1447770nmJ) aTListenerS455S0100000_22.l0;
            if (c1447770nmJ19.LJJIII) {
                c1447770nmJ19.LJJIII = false;
                C786410Ut5.LJLIIL(c1447770nmJ19.LJJIIZ, c1447770nmJ19.LJIILIIL, new ARunnableS122S0100000_22(c1447770nmJ19, 42));
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$4(ATListenerS455S0100000_22 aTListenerS455S0100000_22, View view, MotionEvent motionEvent) {
        String str;
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                C1415280mvu c1415280mvu = (C1415280mvu) aTListenerS455S0100000_22.l0;
                if (c1415280mvu.LLJZIJLIL == 0.0f) {
                    c1415280mvu.LLJZIJLIL = motionEvent.getX();
                }
                C1415280mvu c1415280mvu2 = (C1415280mvu) aTListenerS455S0100000_22.l0;
                c1415280mvu2.LLLFZ = false;
                c1415280mvu2.LLLLIL().LJII.invoke(Boolean.TRUE, null);
            }
            return false;
        }
        C1415280mvu c1415280mvu3 = (C1415280mvu) aTListenerS455S0100000_22.l0;
        if (c1415280mvu3.LLJZIJLIL > motionEvent.getX()) {
            str = "wheel_slide_left";
        } else {
            str = "wheel_slide_right";
        }
        c1415280mvu3.LLJZ = str;
        C1415280mvu c1415280mvu4 = (C1415280mvu) aTListenerS455S0100000_22.l0;
        c1415280mvu4.LLJZIJLIL = 0.0f;
        c1415280mvu4.LLLFZ = true;
        return false;
    }

    public static final boolean onTouch$5(ATListenerS455S0100000_22 aTListenerS455S0100000_22, View view, MotionEvent motionEvent) {
        C0P0T c0p0t = ((C1458920o4I) aTListenerS455S0100000_22.l0).LLJJIJI;
        if (c0p0t != null) {
            c0p0t.dismiss();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS455S0100000_22 aTListenerS455S0100000_22, View view, MotionEvent motionEvent) {
        C0P0T c0p0t = ((C1458920o4I) aTListenerS455S0100000_22.l0).LLJJIJI;
        if (c0p0t != null) {
            c0p0t.dismiss();
            return false;
        }
        return false;
    }

    public static final boolean onTouch$7(ATListenerS455S0100000_22 aTListenerS455S0100000_22, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        TuxIconView tuxIconView = null;
        if (action != 0) {
            if (action != 1 && action != 3) {
                return false;
            }
            TuxIconView tuxIconView2 = ((C1453280nvC) aTListenerS455S0100000_22.l0).LLJJIJIIJIL;
            if (tuxIconView2 != null) {
                tuxIconView = tuxIconView2;
            }
            C786410Ut5.x5(tuxIconView, 1.0f);
            C1453280nvC c1453280nvC = (C1453280nvC) aTListenerS455S0100000_22.l0;
            c1453280nvC.LLLIIIIL(c1453280nvC.LLJLLIL);
            return true;
        }
        TuxIconView tuxIconView3 = ((C1453280nvC) aTListenerS455S0100000_22.l0).LLJJIJIIJIL;
        if (tuxIconView3 != null) {
            tuxIconView = tuxIconView3;
        }
        C786410Ut5.x5(tuxIconView, 0.5f);
        ((C1453280nvC) aTListenerS455S0100000_22.l0).LLLIIIIL(C1451990nt7.LIZ());
        C1403960mde c1403960mde = C1403960mde.LIZ;
        VideoPublishEditModel videoPublishEditModelLLLILZLLLI = ((C1453280nvC) aTListenerS455S0100000_22.l0).LLLILZLLLI();
        c1403960mde.getClass();
        C20684815ws.LJIILLIIL("adjust_compare", C1403960mde.LIZJ(videoPublishEditModelLLLILZLLLI).LIZ);
        return true;
    }

    public static final boolean onTouch$8(ATListenerS455S0100000_22 aTListenerS455S0100000_22, View view, MotionEvent motionEvent) {
        ((C1447520nlu) aTListenerS455S0100000_22.l0).LLILZLL.onNext(motionEvent);
        return true;
    }
}
