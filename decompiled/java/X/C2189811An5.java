package X;

import android.os.SystemClock;
import android.view.MotionEvent;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.widget.RadiusLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1An5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C2189811An5 extends C21648719nx {
    public final int $t;
    public Object l0;

    public static final boolean onFling$0(C2189811An5 c2189811An5, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public static final void onLongPress$0(C2189811An5 c2189811An5, MotionEvent motionEvent) {
    }

    public static final void onShowPress$0(C2189811An5 c2189811An5, MotionEvent motionEvent) {
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(MotionEvent motionEvent) {
        return 1 - this.$t != 0 ? super.onDoubleTap(motionEvent) : onDoubleTap$0(this, motionEvent);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return this.$t != 0 ? super.onDown(motionEvent) : onDown$0(this, motionEvent);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.$t != 0 ? super.onFling(motionEvent, motionEvent2, f, f2) : onFling$0(this, motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                onLongPress$0(this, motionEvent);
                break;
            case 1:
                onLongPress$1(this, motionEvent);
                break;
            default:
                super.onLongPress(motionEvent);
                break;
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return this.$t != 0 ? super.onScroll(motionEvent, motionEvent2, f, f2) : onScroll$0(this, motionEvent, motionEvent2, f, f2);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
        if (this.$t != 0) {
            super.onShowPress(motionEvent);
        } else {
            onShowPress$0(this, motionEvent);
        }
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        return 1 - this.$t != 0 ? super.onSingleTapConfirmed(motionEvent) : onSingleTapConfirmed$0(this, motionEvent);
    }

    @Override // X.C21648719nx, android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.$t != 0 ? super.onSingleTapUp(motionEvent) : onSingleTapUp$0(this, motionEvent);
    }

    public C2189811An5(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onDoubleTap$0(C2189811An5 c2189811An5, MotionEvent motionEvent) {
        if (!((C21652419oY) c2189811An5.l0).getGestureConfig().LIZLLL) {
            return false;
        }
        Function0<Unit> defaultOnDoubleTapAction = ((C21652419oY) c2189811An5.l0).getDefaultOnDoubleTapAction();
        if (defaultOnDoubleTapAction != null) {
            defaultOnDoubleTapAction.invoke();
            return true;
        }
        return true;
    }

    public static final boolean onDown$0(C2189811An5 c2189811An5, MotionEvent motionEvent) {
        RadiusLayout radiusLayoutLIZ = ((C21661919q5) c2189811An5.l0).LLJILJILJ.LIZ();
        C21661919q5 c21661919q5 = (C21661919q5) c2189811An5.l0;
        if (motionEvent.getY() >= radiusLayoutLIZ.getTop() && motionEvent.getY() < radiusLayoutLIZ.getTop() + c21661919q5.LLIZ) {
            c21661919q5.LLIZLLLIL = true;
            return true;
        }
        return ((C21661919q5) c2189811An5.l0).LJFF(motionEvent);
    }

    public static final void onLongPress$1(C2189811An5 c2189811An5, MotionEvent motionEvent) {
        if (((C21652419oY) c2189811An5.l0).getGestureConfig().LIZJ && ((C21652419oY) c2189811An5.l0).LLILLL != EnumC1779570wPT.SWIPE) {
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (jUptimeMillis < C21652419oY.LLJILJIL + 600) {
                return;
            }
            synchronized (C21652419oY.LLJILJILJ) {
                try {
                    if (jUptimeMillis < C21652419oY.LLJILJIL + 600) {
                        return;
                    }
                    C21652419oY.LLJILJIL = jUptimeMillis;
                    C21652419oY c21652419oY = (C21652419oY) c2189811An5.l0;
                    c21652419oY.LLILLL = EnumC1779570wPT.LONG_PRESS;
                    if (motionEvent != null) {
                        c21652419oY.LLIZ = motionEvent.getRawX();
                        c21652419oY.LLIZLLLIL = motionEvent.getRawY();
                    }
                    Function0<Unit> defaultOnLongPressAction = ((C21652419oY) c2189811An5.l0).getDefaultOnLongPressAction();
                    if (defaultOnLongPressAction != null) {
                        defaultOnLongPressAction.invoke();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    public static final boolean onSingleTapConfirmed$0(C2189811An5 c2189811An5, MotionEvent motionEvent) {
        Function0<Boolean> singleClickInterceptor;
        if (!((C21652419oY) c2189811An5.l0).getGestureConfig().LIZIZ) {
            return false;
        }
        if (motionEvent == null) {
            return true;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (jUptimeMillis < C21652419oY.LLJIJIL + 600) {
            return true;
        }
        synchronized (C21652419oY.LLJILJILJ) {
            try {
                if (jUptimeMillis < C21652419oY.LLJIJIL + 600) {
                    return true;
                }
                C21652419oY.LLJIJIL = jUptimeMillis;
                if (((C21652419oY) c2189811An5.l0).getSingleClickInterceptor() != null && (singleClickInterceptor = ((C21652419oY) c2189811An5.l0).getSingleClickInterceptor()) != null && singleClickInterceptor.invoke().booleanValue()) {
                    return false;
                }
                MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 0, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
                super/*android.widget.FrameLayout*/.dispatchTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
                MotionEvent motionEventObtain2 = MotionEvent.obtain(motionEvent.getDownTime(), motionEvent.getEventTime(), 1, motionEvent.getX(), motionEvent.getY(), motionEvent.getMetaState());
                super/*android.widget.FrameLayout*/.dispatchTouchEvent(motionEventObtain2);
                motionEventObtain2.recycle();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public static final boolean onSingleTapUp$0(C2189811An5 c2189811An5, MotionEvent motionEvent) {
        float y = motionEvent.getY();
        int height = ((C21661919q5) c2189811An5.l0).getHeight();
        C21661919q5 c21661919q5 = (C21661919q5) c2189811An5.l0;
        if (y < height - c21661919q5.LLILZLL && c21661919q5.LJFF(motionEvent)) {
            ((C21661919q5) c2189811An5.l0).LIZ(1);
            return true;
        }
        return false;
    }

    public static final boolean onScroll$0(C2189811An5 c2189811An5, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        RadiusLayout radiusLayoutLIZ = ((C21661919q5) c2189811An5.l0).LLJILJILJ.LIZ();
        C21661919q5 c21661919q5 = (C21661919q5) c2189811An5.l0;
        if (!c21661919q5.LLIZLLLIL) {
            return false;
        }
        if ((c21661919q5.LL == 1 && radiusLayoutLIZ.getLayoutParams().height >= c21661919q5.LLILLL && f2 > 0.0f) || radiusLayoutLIZ.getLayoutParams().height > c21661919q5.LLILLL) {
            return false;
        }
        radiusLayoutLIZ.getLayoutParams().height += (int) f2;
        radiusLayoutLIZ.requestLayout();
        c21661919q5.LLILLJJLI = true;
        return false;
    }
}
