package X;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Size;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.bpea.basics.CertProviderManagerKt;
import com.ss.android.ugc.profile.business.ur.camera.datachannel.DataChannel;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.19Hv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class SurfaceHolderCallbackC21514919Hv extends SurfaceView implements SurfaceHolder.Callback {
    public C21514619Hs LL;
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

    public final C21514619Hs getCameraProxy() {
        C21514619Hs c21514619Hs = this.LL;
        if (c21514619Hs != null) {
            return c21514619Hs;
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

    public final void setCameraProxy(C21514619Hs c21514619Hs) {
        this.LL = c21514619Hs;
    }

    public final void setCheckFragVisibleCallback(Function0<Boolean> function0) {
        this.LLIZ = function0;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        getCameraProxy().LIZLLL();
    }

    public SurfaceHolderCallbackC21514919Hv(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZIL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 847));
        this.LLILZLL = C452501pT.LIZIZ(new AwS576S0100000_32(this, 846));
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(int r16, com.bytedance.bpea.basics.Cert r17) {
        /*
            Method dump skipped, instruction units count: 434
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolderCallbackC21514919Hv.LIZ(int, com.bytedance.bpea.basics.Cert):void");
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        if (!getCameraProxy().LJ) {
            Function0<Boolean> function0 = this.LLIZ;
            if (function0 != null && !function0.invoke().booleanValue()) {
                return;
            }
            LIZ(getCameraProxy().LIZLLL, CertProviderManagerKt.findCert("bpea-live_cover_or_profile_camera_open", 1476788238));
        }
    }
}
