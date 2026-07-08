package X;

import android.graphics.Outline;
import android.graphics.Rect;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.ss.android.ugc.aweme.hangout.component.livecard.view.HangoutRoomFeedAssem;

/* JADX INFO: renamed from: X.0Kct, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C521570Kct extends ViewOutlineProvider {
    public final int $t;
    public Object l0;

    @Override // android.view.ViewOutlineProvider
    public final void getOutline(View view, Outline outline) {
        switch (this.$t) {
            case 0:
                getOutline$0(this, view, outline);
                break;
            case 1:
                getOutline$1(this, view, outline);
                break;
            case 2:
                getOutline$2(this, view, outline);
                break;
            case 3:
                getOutline$3(this, view, outline);
                break;
            default:
                super.getOutline(view, outline);
                break;
        }
    }

    public C521570Kct(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void getOutline$0(C521570Kct c521570Kct, View view, Outline outline) {
        if (outline != null) {
            outline.setRoundRect(new Rect(0, 0, ((SurfaceView) c521570Kct.l0).getWidth(), ((SurfaceView) c521570Kct.l0).getHeight()), C497740JfY.LIZIZ(12));
        }
    }

    public static final void getOutline$1(C521570Kct c521570Kct, View view, Outline outline) {
        int width;
        int height;
        if (view != null) {
            width = view.getWidth();
            height = view.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        Rect rect = new Rect(0, 0, width, height);
        if (outline != null) {
            outline.setRoundRect(rect, ((HangoutRoomFeedAssem) c521570Kct.l0).LLLJL);
        }
    }

    public static final void getOutline$2(C521570Kct c521570Kct, View view, Outline outline) {
        int width;
        int height;
        if (view != null) {
            width = view.getWidth();
            height = view.getHeight();
        } else {
            width = 0;
            height = 0;
        }
        Rect rect = new Rect(0, 0, width, height);
        if (outline != null) {
            outline.setRoundRect(rect, ((AbstractC476820Imu) c521570Kct.l0).LJIILIIL);
        }
    }

    public static final void getOutline$3(C521570Kct c521570Kct, View view, Outline outline) {
        if (outline != null) {
            outline.setRoundRect(new Rect(0, 0, ((SurfaceView) c521570Kct.l0).getWidth(), ((SurfaceView) c521570Kct.l0).getHeight()), C497740JfY.LIZIZ(12));
        }
    }
}
