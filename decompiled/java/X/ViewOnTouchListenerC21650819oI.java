package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import kotlin.jvm.internal.AwS577S0100000_33;

/* JADX INFO: renamed from: X.19oI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class ViewOnTouchListenerC21650819oI extends SmartImageView implements View.OnTouchListener {
    public boolean LLIZLLLIL;
    public EnumC585180MxI LLJ;
    public PointF LLJI;
    public PointF LLJIJIL;
    public PointF LLJILJIL;
    public float LLJILJILJ;
    public C21650919oJ LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final C01GW LLJJIII;
    public final C01GW LLJJIJI;
    public Long LLJJIJIIJIL;

    public final View getBackgroundView() {
        return (View) this.LLJJIII.getValue();
    }

    public final FrameLayout getOverlayContainer() {
        return (FrameLayout) this.LLJJIJI.getValue();
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C20597815iq.LIZ(this);
    }

    public final Long getZoomOutDuration() {
        return this.LLJJIJIIJIL;
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public final void setPinchEnabled(boolean z) {
        this.LLJJI = z;
    }

    public final void setTouchEnabled(boolean z) {
        this.LLJJ = z;
    }

    public final void setZoomOutDuration(Long l) {
        this.LLJJIJIIJIL = l;
    }

    public ViewOnTouchListenerC21650819oI(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void LJIIIIZZ(MotionEvent motionEvent, PointF pointF) {
        if (motionEvent.getPointerCount() == 2) {
            float f = 2;
            pointF.set((motionEvent.getX(0) + motionEvent.getX(1)) / f, (motionEvent.getY(0) + motionEvent.getY(1)) / f);
        }
    }

    @Override // X.C1322100kVc
    public final void inflateHierarchy(Context context, AttributeSet attributeSet) {
        C1331090kk7 c1331090kk7LIZLLL = C1335990ks1.LIZLLL(context, attributeSet);
        setAspectRatio(c1331090kk7LIZLLL.LIZLLL);
        setHierarchy(new C1331860klM(c1331090kk7LIZLLL));
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x014d  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r12, android.view.MotionEvent r13) {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnTouchListenerC21650819oI.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public ViewOnTouchListenerC21650819oI(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJ = EnumC585180MxI.IDLE;
        this.LLJI = new PointF();
        this.LLJIJIL = new PointF();
        this.LLJILJIL = new PointF();
        this.LLJILJILJ = 1.0f;
        this.LLJJI = true;
        this.LLJJIII = C452501pT.LIZIZ(new AwS577S0100000_33(context, 2842));
        this.LLJJIJI = C452501pT.LIZIZ(new AwS577S0100000_33(context, 2843));
    }
}
