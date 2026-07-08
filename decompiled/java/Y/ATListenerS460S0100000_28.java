package Y;

import X.C14TF;
import X.C1903510zdN;
import X.C1907430zjh;
import X.C1907480zjm;
import X.C1914550zvB;
import X.RunnableC1903500zdM;
import X.ViewOnClickListenerC1906680ziU;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.tako.mob.ITakoMob;
import com.zhiliaoapp.musically.R;

/* JADX INFO: loaded from: classes29.dex */
public class ATListenerS460S0100000_28 implements View.OnTouchListener {
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
            default:
                return false;
        }
    }

    public ATListenerS460S0100000_28(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS460S0100000_28 aTListenerS460S0100000_28, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                Object parent = ((C1907480zjm) aTListenerS460S0100000_28.l0).getParent();
                if (parent instanceof View) {
                    View view2 = (View) parent;
                    while (view2 != null) {
                        if (view2.getId() == R.id.ww7) {
                            view2.setPressed(false);
                            return false;
                        }
                        Object parent2 = view2.getParent();
                        if (!(parent2 instanceof View)) {
                            break;
                        }
                        view2 = (View) parent2;
                    }
                }
            }
        } else {
            Object parent3 = ((C1907480zjm) aTListenerS460S0100000_28.l0).getParent();
            if (parent3 instanceof View) {
                View view3 = (View) parent3;
                while (view3 != null) {
                    if (view3.getId() == R.id.ww7) {
                        view3.setPressed(true);
                        return false;
                    }
                    Object parent4 = view3.getParent();
                    if (!(parent4 instanceof View)) {
                        break;
                    }
                    view3 = (View) parent4;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$1(ATListenerS460S0100000_28 aTListenerS460S0100000_28, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                Object parent = ((C1907480zjm) aTListenerS460S0100000_28.l0).getParent();
                if (parent instanceof View) {
                    View view2 = (View) parent;
                    while (view2 != null) {
                        if (view2.getId() == R.id.ww7) {
                            view2.setPressed(false);
                            return false;
                        }
                        Object parent2 = view2.getParent();
                        if (!(parent2 instanceof View)) {
                            break;
                        }
                        view2 = (View) parent2;
                    }
                }
            }
        } else {
            Object parent3 = ((C1907480zjm) aTListenerS460S0100000_28.l0).getParent();
            if (parent3 instanceof View) {
                View view3 = (View) parent3;
                while (view3 != null) {
                    if (view3.getId() == R.id.ww7) {
                        view3.setPressed(true);
                        return false;
                    }
                    Object parent4 = view3.getParent();
                    if (!(parent4 instanceof View)) {
                        break;
                    }
                    view3 = (View) parent4;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$2(ATListenerS460S0100000_28 aTListenerS460S0100000_28, View view, MotionEvent motionEvent) {
        View view2;
        if (motionEvent.getAction() == 1 && (view2 = ((ViewOnClickListenerC1906680ziU) aTListenerS460S0100000_28.l0).mItemView) != null && view2.getParent() != null) {
            ((ViewOnClickListenerC1906680ziU) aTListenerS460S0100000_28.l0).mItemView.getParent().requestDisallowInterceptTouchEvent(false);
        }
        return false;
    }

    public static final boolean onTouch$3(ATListenerS460S0100000_28 aTListenerS460S0100000_28, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                Object parent = ((C1907430zjh) aTListenerS460S0100000_28.l0).getParent();
                if (parent instanceof View) {
                    View view2 = (View) parent;
                    while (view2 != null) {
                        if (view2.getId() == R.id.ww7) {
                            view2.setPressed(false);
                            return false;
                        }
                        Object parent2 = view2.getParent();
                        if (!(parent2 instanceof View)) {
                            break;
                        }
                        view2 = (View) parent2;
                    }
                }
            }
        } else {
            Object parent3 = ((C1907430zjh) aTListenerS460S0100000_28.l0).getParent();
            if (parent3 instanceof View) {
                View view3 = (View) parent3;
                while (view3 != null) {
                    if (view3.getId() == R.id.ww7) {
                        view3.setPressed(true);
                        return false;
                    }
                    Object parent4 = view3.getParent();
                    if (!(parent4 instanceof View)) {
                        break;
                    }
                    view3 = (View) parent4;
                }
            }
        }
        return false;
    }

    public static final boolean onTouch$4(ATListenerS460S0100000_28 aTListenerS460S0100000_28, View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action == 1 || action == 3) {
                Object parent = ((C1907480zjm) aTListenerS460S0100000_28.l0).getParent();
                if (parent instanceof View) {
                    View view2 = (View) parent;
                    while (view2 != null) {
                        if (view2.getId() == R.id.ww7) {
                            view2.setPressed(false);
                            return false;
                        }
                        Object parent2 = view2.getParent();
                        if (!(parent2 instanceof View)) {
                            break;
                        }
                        view2 = (View) parent2;
                    }
                }
            }
        } else {
            Object parent3 = ((C1907480zjm) aTListenerS460S0100000_28.l0).getParent();
            if (parent3 instanceof View) {
                View view3 = (View) parent3;
                while (view3 != null) {
                    if (view3.getId() == R.id.ww7) {
                        view3.setPressed(true);
                        return false;
                    }
                    Object parent4 = view3.getParent();
                    if (!(parent4 instanceof View)) {
                        break;
                    }
                    view3 = (View) parent4;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [X.0zdM, java.lang.Runnable] */
    public static final boolean onTouch$5(ATListenerS460S0100000_28 aTListenerS460S0100000_28, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    ((C1903510zdN) aTListenerS460S0100000_28.l0).f6(motionEvent.getDownTime(), "cancel");
                }
            } else {
                final long downTime = motionEvent.getDownTime();
                C1903510zdN c1903510zdN = (C1903510zdN) aTListenerS460S0100000_28.l0;
                RunnableC1903500zdM runnableC1903500zdM = c1903510zdN.LLJZ;
                if (runnableC1903500zdM != null) {
                    HandlerHook.viewRemoveCallbacks(c1903510zdN.X5(), runnableC1903500zdM);
                }
                final C1903510zdN c1903510zdN2 = (C1903510zdN) aTListenerS460S0100000_28.l0;
                ?? r3 = new Runnable() { // from class: X.0zdM
                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EntranceNormalVH@45eb.takoTouchListener$1$check$1");
                        try {
                            C1903510zdN c1903510zdN3 = c1903510zdN2;
                            if (!c1903510zdN3.LLJLLIL && !c1903510zdN3.LLJLL) {
                                c1903510zdN3.f6(downTime, "up_without_click");
                            }
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EntranceNormalVH@45eb.takoTouchListener$1$check$1");
                    }
                };
                c1903510zdN2.LLJZ = r3;
                HandlerHook.viewPostDelay(c1903510zdN2.X5(), r3, ViewConfiguration.getTapTimeout());
                return false;
            }
        } else {
            C1903510zdN c1903510zdN3 = (C1903510zdN) aTListenerS460S0100000_28.l0;
            long downTime2 = motionEvent.getDownTime();
            if (c1903510zdN3.c6()) {
                c1903510zdN3.LLJLILLLLZIIL = 0L;
                c1903510zdN3.LLJLL = false;
                c1903510zdN3.LLJLLIL = false;
                c1903510zdN3.LLJLLL = 0L;
                RunnableC1903500zdM runnableC1903500zdM2 = c1903510zdN3.LLJZ;
                if (runnableC1903500zdM2 != null) {
                    HandlerHook.viewRemoveCallbacks(c1903510zdN3.X5(), runnableC1903500zdM2);
                }
                c1903510zdN3.LLJZ = null;
                c1903510zdN3.LLJLLL = downTime2;
                c1903510zdN3.LLJLILLLLZIIL = System.currentTimeMillis();
                ((ITakoMob) c1903510zdN3.LLJZIJLIL.getValue()).mobTikbotEntranceTouchDown(C14TF.LIZIZ.LJJIIZ(), "message_cell");
                return false;
            }
        }
        return false;
    }

    public static final boolean onTouch$6(ATListenerS460S0100000_28 aTListenerS460S0100000_28, View view, MotionEvent motionEvent) {
        ((C1914550zvB) aTListenerS460S0100000_28.l0).getClass();
        C1914550zvB.LJFF(motionEvent, view);
        return false;
    }
}
