package X;

import android.app.Activity;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.Window;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS560S0100000_16;

/* JADX INFO: renamed from: X.0dZU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1055420dZU extends AbstractWindowCallbackC1196730hFP {
    public static final Map<Activity, C1055420dZU> LLJILLL = new LinkedHashMap();
    public final Activity LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public VelocityTracker LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public final C01GW LLJILJIL;
    public C1055400dZS LLJILJILJ;

    @Override // X.AbstractWindowCallbackC1196730hFP, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        C1055400dZS c1055400dZS;
        C21600219g8 c21600219g8;
        float xVelocity;
        C21600219g8 c21600219g82;
        if (this.LLILLL && motionEvent != null) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 1 && actionMasked != 3 && actionMasked != 6) {
                if (actionMasked == 0) {
                    this.LLILZ = false;
                    this.LLILZIL = false;
                    this.LLILZLL = false;
                    this.LLIZ = motionEvent.getPointerId(0);
                    if (this.LLIZLLLIL == null) {
                        this.LLIZLLLIL = VelocityTracker.obtain();
                    }
                    VelocityTracker velocityTracker = this.LLIZLLLIL;
                    if (velocityTracker != null) {
                        velocityTracker.addMovement(motionEvent);
                    }
                    this.LLJI = motionEvent.getX();
                    return super.dispatchTouchEvent(motionEvent);
                }
                VelocityTracker velocityTracker2 = this.LLIZLLLIL;
                if (velocityTracker2 != null) {
                    velocityTracker2.addMovement(motionEvent);
                }
                if (actionMasked == 2 && this.LLILZ) {
                    if (this.LLILZIL) {
                        if (this.LLILZLL) {
                            return true;
                        }
                        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
                        motionEventObtain.setAction(1);
                        boolean zDispatchTouchEvent = this.LL.dispatchTouchEvent(motionEventObtain);
                        motionEventObtain.recycle();
                        this.LLILZLL = true;
                        C1055400dZS c1055400dZS2 = this.LLJILJILJ;
                        if (c1055400dZS2 != null && (c21600219g82 = c1055400dZS2.LIZ.LLJLL) != null) {
                            c21600219g82.setOptForceDetermineTargetPage(false);
                        }
                        return zDispatchTouchEvent;
                    }
                    if (this.LLIZ != -1) {
                        if (this.LLJ > 0.0f) {
                            float x = motionEvent.getX() - this.LLJI;
                            if (Math.abs(x) > this.LLJ && (this.LLILLJJLI.getResources().getConfiguration().getLayoutDirection() != 1 ? x < 0.0f : x > 0.0f)) {
                                if (this.LLJIJIL > 0.0f) {
                                    VelocityTracker velocityTracker3 = this.LLIZLLLIL;
                                    if (velocityTracker3 != null) {
                                        velocityTracker3.computeCurrentVelocity(LSPassThroughRecordSizeConfig.DEFAULT, ((Number) this.LLJILJIL.getValue()).floatValue());
                                    }
                                    VelocityTracker velocityTracker4 = this.LLIZLLLIL;
                                    if (velocityTracker4 != null) {
                                        xVelocity = velocityTracker4.getXVelocity(this.LLIZ);
                                    } else {
                                        xVelocity = 0.0f;
                                    }
                                    if (Math.abs(xVelocity) > this.LLJIJIL && (this.LLILLJJLI.getResources().getConfiguration().getLayoutDirection() != 1 ? xVelocity < 0.0f : xVelocity > 0.0f)) {
                                        this.LLILZIL = true;
                                        C1055400dZS c1055400dZS3 = this.LLJILJILJ;
                                        if (c1055400dZS3 != null) {
                                            C21600219g8 c21600219g83 = c1055400dZS3.LIZ.LLJLL;
                                            if (c21600219g83 != null) {
                                                c21600219g83.setOptForceDetermineTargetPage(true);
                                            }
                                            C1019070ccr.LIZ = "on_slide_speed";
                                        }
                                        return super.dispatchTouchEvent(motionEvent);
                                    }
                                }
                                return super.dispatchTouchEvent(motionEvent);
                            }
                        }
                        return super.dispatchTouchEvent(motionEvent);
                    }
                }
                return super.dispatchTouchEvent(motionEvent);
            }
            if (this.LLILZIL && !this.LLILZLL && (c1055400dZS = this.LLJILJILJ) != null && (c21600219g8 = c1055400dZS.LIZ.LLJLL) != null) {
                c21600219g8.setOptForceDetermineTargetPage(false);
            }
            boolean z = this.LLILZLL;
            this.LLILZ = false;
            this.LLILZIL = false;
            this.LLILZLL = false;
            this.LLIZ = -1;
            VelocityTracker velocityTracker5 = this.LLIZLLLIL;
            if (velocityTracker5 != null) {
                velocityTracker5.recycle();
            }
            this.LLIZLLLIL = null;
            if (z) {
                return false;
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public C1055420dZU(Activity activity, Window.Callback callback) {
        super(callback);
        this.LLILLJJLI = activity;
        this.LLIZ = -1;
        this.LLJ = -1.0f;
        this.LLJIJIL = -1.0f;
        this.LLJILJIL = C452501pT.LIZIZ(new AwS560S0100000_16(this, 780));
    }
}
