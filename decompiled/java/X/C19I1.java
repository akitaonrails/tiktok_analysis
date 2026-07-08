package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.android.livesdk.livesetting.broadcast.AnchorCoverCameraBugFixABSetting;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.19I1, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19I1 extends SurfaceView implements SurfaceHolder.Callback {
    public C19I2 LL;
    public DataChannel LLILLJJLI;
    public boolean LLILLL;
    public Size LLILZ;
    public final C01GW LLILZIL;
    public final C01GW LLILZLL;
    public Function0<Boolean> LLIZ;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
    }

    private final GestureDetector getGestureDetector() {
        return (GestureDetector) this.LLILZLL.getValue();
    }

    private final ScaleGestureDetector getScaleGestureDetector() {
        return (ScaleGestureDetector) this.LLILZIL.getValue();
    }

    public final C19I2 getCameraProxy() {
        C19I2 c19i2 = this.LL;
        if (c19i2 != null) {
            return c19i2;
        }
        return null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        ScaleGestureDetector scaleGestureDetector = getScaleGestureDetector();
        if (scaleGestureDetector != null) {
            scaleGestureDetector.onTouchEvent(motionEvent);
        }
        GestureDetector gestureDetector = getGestureDetector();
        if (gestureDetector != null) {
            gestureDetector.onTouchEvent(motionEvent);
            return true;
        }
        return true;
    }

    public final void setCameraProxy(C19I2 c19i2) {
        this.LL = c19i2;
    }

    public final void setCheckFragVisibleCallback(Function0<Boolean> function0) {
        this.LLIZ = function0;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        getCameraProxy().LIZJ();
    }

    public C19I1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 466));
        this.LLILZLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 465));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0102  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r16, com.bytedance.bpea.basics.Cert r17) {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19I1.LIZ(int, com.bytedance.bpea.basics.Cert):void");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        Function0<Boolean> function0;
        boolean zLJI = MethodIDManager.LJI(197230);
        if (AnchorCoverCameraBugFixABSetting.INSTANCE.isMatch()) {
            if (!getCameraProxy().LJ) {
                LIZ(getCameraProxy().LIZLLL, CertProviderManagerKt.findCert("bpea-live_cover_or_profile_camera_open", 1476788238));
            }
        } else if (!getCameraProxy().LJ && ((function0 = this.LLIZ) == null || function0.invoke().booleanValue())) {
            LIZ(getCameraProxy().LIZLLL, CertProviderManagerKt.findCert("bpea-live_cover_or_profile_camera_open", 1476788238));
        }
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
