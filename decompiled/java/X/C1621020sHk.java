package X;

import android.view.MotionEvent;
import android.view.View;
import com.ss.android.ugc.aweme.feed.ui.seekbar.VideoSeekBarMaskView;

/* JADX INFO: renamed from: X.0sHk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public class C1621020sHk extends C21648719nx {
    public final int $t;
    public Object l0;

    public static final boolean onDown$0(C1621020sHk c1621020sHk, MotionEvent motionEvent) {
        return true;
    }

    public static final void onLongPress$0(C1621020sHk c1621020sHk, MotionEvent motionEvent) {
    }

    public static final boolean onScroll$0(C1621020sHk c1621020sHk, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return true;
    }

    public static final void onShowPress$0(C1621020sHk c1621020sHk, MotionEvent motionEvent) {
    }

    public static final boolean onSingleTapUp$0(C1621020sHk c1621020sHk, MotionEvent motionEvent) {
        return true;
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

    public C1621020sHk(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onDoubleTap$0(C1621020sHk c1621020sHk, MotionEvent motionEvent) {
        View.OnClickListener onClickListenerLIZIZ = ((C1609070ryT) c1621020sHk.l0).LIZ.getClickListener().LIZIZ(2);
        if (onClickListenerLIZIZ != null) {
            onClickListenerLIZIZ.onClick(((C1609070ryT) c1621020sHk.l0).LIZ);
            return true;
        }
        return true;
    }

    public static final void onLongPress$1(C1621020sHk c1621020sHk, MotionEvent motionEvent) {
        View.OnClickListener onClickListenerLIZIZ = ((C1609070ryT) c1621020sHk.l0).LIZ.getClickListener().LIZIZ(3);
        if (onClickListenerLIZIZ != null) {
            onClickListenerLIZIZ.onClick(((C1609070ryT) c1621020sHk.l0).LIZ);
        }
    }

    public static final boolean onSingleTapConfirmed$0(C1621020sHk c1621020sHk, MotionEvent motionEvent) {
        View.OnClickListener onClickListenerLIZIZ = ((C1609070ryT) c1621020sHk.l0).LIZ.getClickListener().LIZIZ(1);
        if (onClickListenerLIZIZ != null) {
            onClickListenerLIZIZ.onClick(((C1609070ryT) c1621020sHk.l0).LIZ);
        }
        return true;
    }

    public static final boolean onFling$0(C1621020sHk c1621020sHk, MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        String eventType;
        VideoSeekBarMaskView videoSeekBarMaskView = (VideoSeekBarMaskView) c1621020sHk.l0;
        if (videoSeekBarMaskView.LLJJI && videoSeekBarMaskView.getNeedHandleImmersiveClearMode()) {
            int type = EnumC1616310sA9.OTHER_SWIPE.getType();
            C1211700hdY controller = ((VideoSeekBarMaskView) c1621020sHk.l0).getController();
            if (controller != null) {
                eventType = controller.getEventType();
            } else {
                eventType = null;
            }
            C1440005kM.LIZ(new C714060Rzg(false, type, "swipe_exit", eventType));
            return true;
        }
        return true;
    }
}
