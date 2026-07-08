package X;

import android.view.MotionEvent;

/* JADX INFO: renamed from: X.1G0t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2325411G0t extends C21648719nx {
    public final int $t;
    public Object l0;

    public static final boolean onDown$1(C2325411G0t c2325411G0t, MotionEvent motionEvent) {
        return true;
    }

    public static final boolean onDown$2(C2325411G0t c2325411G0t, MotionEvent motionEvent) {
        return true;
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onDown$0(this, motionEvent);
            case 1:
                return onDown$1(this, motionEvent);
            case 2:
                return onDown$2(this, motionEvent);
            default:
                return super.onDown(motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.$t) {
            case 1:
                onLongPress$0(this, motionEvent);
                break;
            case 2:
                onLongPress$1(this, motionEvent);
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onSingleTapUp$0(this, motionEvent);
            case 1:
                return onSingleTapUp$1(this, motionEvent);
            case 2:
                return onSingleTapUp$2(this, motionEvent);
            default:
                return super.onSingleTapUp(motionEvent);
        }
    }

    public C2325411G0t(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onDown$0(C2325411G0t c2325411G0t, MotionEvent motionEvent) {
        C2260931DeV stateContext = ((ViewOnTouchListenerC2260921DeU) c2325411G0t.l0).getStateContext();
        AbstractC2260961DeY abstractC2260961DeY = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC2260961DeY != null) {
            return abstractC2260961DeY.LIZJ();
        }
        return false;
    }

    public static final void onLongPress$0(C2325411G0t c2325411G0t, MotionEvent motionEvent) {
        if (motionEvent != null) {
            C2260321DdW c2260321DdW = (C2260321DdW) c2325411G0t.l0;
            if (c2260321DdW.LJIIJ < 2) {
                c2260321DdW.LIZIZ.LIZ();
            }
        }
    }

    public static final void onLongPress$1(C2325411G0t c2325411G0t, MotionEvent motionEvent) {
        if (motionEvent != null) {
            C2260381Ddc c2260381Ddc = (C2260381Ddc) c2325411G0t.l0;
            if (c2260381Ddc.LJIIJ < 2) {
                c2260381Ddc.LIZIZ.LIZ();
            }
        }
    }

    public static final boolean onSingleTapUp$0(C2325411G0t c2325411G0t, MotionEvent motionEvent) {
        ((ViewOnTouchListenerC2260921DeU) c2325411G0t.l0).LJIIJ();
        C2260931DeV stateContext = ((ViewOnTouchListenerC2260921DeU) c2325411G0t.l0).getStateContext();
        AbstractC2260961DeY abstractC2260961DeY = stateContext.LJIILJJIL.get(stateContext.LIZJ);
        if (abstractC2260961DeY != null) {
            return abstractC2260961DeY.LIZJ();
        }
        return false;
    }

    public static final boolean onSingleTapUp$1(C2325411G0t c2325411G0t, MotionEvent motionEvent) {
        if (motionEvent != null) {
            C2260321DdW c2260321DdW = (C2260321DdW) c2325411G0t.l0;
            c2260321DdW.LJIIJJI = motionEvent.getX();
            c2260321DdW.LJIIL = motionEvent.getY();
            return false;
        }
        return false;
    }

    public static final boolean onSingleTapUp$2(C2325411G0t c2325411G0t, MotionEvent motionEvent) {
        if (motionEvent != null) {
            C2260381Ddc c2260381Ddc = (C2260381Ddc) c2325411G0t.l0;
            c2260381Ddc.LJIIJJI = motionEvent.getX();
            c2260381Ddc.LJIIL = motionEvent.getY();
            return false;
        }
        return false;
    }
}
