package X;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.realx.base.Logging;
import com.bytedance.realx.base.ThreadUtils;
import com.bytedance.realx.video.EglBase;
import com.bytedance.realx.video.EglRenderer;
import com.bytedance.realx.video.GlRectDrawer;
import com.bytedance.realx.video.RendererCommon;
import com.bytedance.realx.video.SurfaceEglRenderer;
import com.bytedance.realx.video.VideoSink;
import com.bytedance.realx.video.memory.RXVideoFrameInterface;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0jQs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class SurfaceHolderCallbackC1280720jQs extends SurfaceView implements SurfaceHolder.Callback, VideoSink, RendererCommon.RendererEvents {
    public final SurfaceEglRenderer eglRenderer;
    public boolean enableFixedSize;
    public float radius;
    public RendererCommon.RendererEvents rendererEvents;
    public final String resourceName;
    public int rotatedFrameHeight;
    public int rotatedFrameWidth;
    public int surfaceHeight;
    public int surfaceWidth;
    public final RendererCommon.VideoLayoutMeasure videoLayoutMeasure;

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
    }

    public void clearImage() {
        this.eglRenderer.clearImage();
    }

    public void disableFpsReduction() {
        this.eglRenderer.disableFpsReduction();
    }

    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    public void onFirstFrameRendered() {
        RendererCommon.RendererEvents rendererEvents = this.rendererEvents;
        if (rendererEvents != null) {
            rendererEvents.onFirstFrameRendered();
        }
    }

    public void pauseVideo() {
        this.eglRenderer.pauseVideo();
    }

    public void release() {
        this.eglRenderer.release();
    }

    private String getResourceName() {
        try {
            return getResources().getResourceEntryName(getId());
        } catch (Resources.NotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }

    private void updateSurfaceSize() {
        ThreadUtils.checkIsOnMainThread();
        if (!this.enableFixedSize || this.rotatedFrameWidth == 0 || this.rotatedFrameHeight == 0 || getWidth() == 0 || getHeight() == 0) {
            this.surfaceHeight = 0;
            this.surfaceWidth = 0;
            getHolder().setSizeFromLayout();
            return;
        }
        float width = getWidth() / getHeight();
        int i = this.rotatedFrameWidth;
        int i2 = this.rotatedFrameHeight;
        if (i / i2 > width) {
            i = (int) (i2 * width);
        } else {
            i2 = (int) (i / width);
        }
        int iMin = Math.min(getWidth(), i);
        int iMin2 = Math.min(getHeight(), i2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateSurfaceSize. Layout size: ");
        sbLIZ.append(getWidth());
        sbLIZ.append("x");
        sbLIZ.append(getHeight());
        sbLIZ.append(", frame size: ");
        sbLIZ.append(this.rotatedFrameWidth);
        sbLIZ.append("x");
        sbLIZ.append(this.rotatedFrameHeight);
        sbLIZ.append(", requested surface size: ");
        sbLIZ.append(iMin);
        sbLIZ.append("x");
        sbLIZ.append(iMin2);
        sbLIZ.append(", old surface size: ");
        sbLIZ.append(this.surfaceWidth);
        sbLIZ.append("x");
        sbLIZ.append(this.surfaceHeight);
        logD(C2188811AlT.LIZIZ(sbLIZ));
        if (iMin == this.surfaceWidth && iMin2 == this.surfaceHeight) {
            return;
        }
        this.surfaceWidth = iMin;
        this.surfaceHeight = iMin2;
        getHolder().setFixedSize(iMin, iMin2);
    }

    public SurfaceHolderCallbackC1280720jQs(Context context) {
        super(context);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
        this.radius = 0.0f;
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.transparent)));
    }

    private void logD(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(this.resourceName);
        sbLIZ.append(": ");
        sbLIZ.append(str);
        Logging.i("SurfaceViewRenderer", C2188811AlT.LIZIZ(sbLIZ));
    }

    private void postOrRun(Runnable runnable) {
        if (C786410Ut5.u3() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            HandlerHook.viewPost(this, runnable);
        }
    }

    @Override // android.view.SurfaceView, android.view.View
    public void draw(Canvas canvas) {
        if (this.radius > 0.0f) {
            Path path = new Path();
            RectF rectF = new RectF(0.0f, 0.0f, getWidth(), getHeight());
            float f = this.radius;
            path.addRoundRect(rectF, f, f, Path.Direction.CCW);
            canvas.clipPath(path, Region.Op.REPLACE);
        }
        super.draw(canvas);
    }

    @Override // com.bytedance.realx.video.VideoSink
    public void onFrame(RXVideoFrameInterface rXVideoFrameInterface) {
        this.eglRenderer.onFrame(rXVideoFrameInterface);
    }

    public void removeFrameListener(EglRenderer.FrameListener frameListener) {
        this.eglRenderer.removeFrameListener(frameListener);
    }

    public void setEnableHardwareScaler(boolean z) {
        ThreadUtils.checkIsOnMainThread();
        this.enableFixedSize = z;
        updateSurfaceSize();
    }

    public void setFpsReduction(float f) {
        this.eglRenderer.setFpsReduction(f);
    }

    public void setMirror(boolean z) {
        this.eglRenderer.setMirror(z);
    }

    public void setRadius(float f) {
        this.radius = Math.max(0.0f, f);
    }

    public void setScalingType(RendererCommon.ScalingType scalingType) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType);
        requestLayout();
        this.eglRenderer.setRenderModel(scalingType);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        ThreadUtils.checkIsOnMainThread();
        this.surfaceHeight = 0;
        this.surfaceWidth = 0;
        updateSurfaceSize();
    }

    public SurfaceHolderCallbackC1280720jQs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.videoLayoutMeasure = new RendererCommon.VideoLayoutMeasure();
        String resourceName = getResourceName();
        this.resourceName = resourceName;
        SurfaceEglRenderer surfaceEglRenderer = new SurfaceEglRenderer(resourceName);
        this.eglRenderer = surfaceEglRenderer;
        getHolder().addCallback(this);
        getHolder().addCallback(surfaceEglRenderer);
        this.radius = 0.0f;
        setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.transparent)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onFrameResolutionChanged$0(int i, int i2) {
        C1C7U.LIZ("SurfaceViewRenderer@21b.onFrameResolutionChanged$1L");
        this.rotatedFrameWidth = i;
        this.rotatedFrameHeight = i2;
        updateSurfaceSize();
        requestLayout();
        C1C7U.LIZIZ("SurfaceViewRenderer@21b.onFrameResolutionChanged$1L");
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f) {
        this.eglRenderer.addFrameListener(frameListener, f);
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents) {
        init(context, rendererEvents, C1280730jQt.LJIIJ(EglBase.EglVersion.getPreferredEglVersion(), EglBase.Config.CONFIG_PLAIN), new GlRectDrawer());
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        ThreadUtils.checkIsOnMainThread();
        Point pointMeasure = this.videoLayoutMeasure.measure(i, i2, this.rotatedFrameWidth, this.rotatedFrameHeight);
        setMeasuredDimension(pointMeasure.x, pointMeasure.y);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onMeasure(). New size: ");
        sbLIZ.append(pointMeasure.x);
        sbLIZ.append("x");
        sbLIZ.append(pointMeasure.y);
        logD(C2188811AlT.LIZIZ(sbLIZ));
    }

    public void setScalingType(RendererCommon.ScalingType scalingType, RendererCommon.ScalingType scalingType2) {
        ThreadUtils.checkIsOnMainThread();
        this.videoLayoutMeasure.setScalingType(scalingType, scalingType2);
        requestLayout();
    }

    public void addFrameListener(EglRenderer.FrameListener frameListener, float f, RendererCommon.GlDrawer glDrawer) {
        this.eglRenderer.addFrameListener(frameListener, f, glDrawer);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0010 A[PHI: r1
      0x0010: PHI (r1v2 int) = (r1v0 int), (r1v3 int) binds: [B:14:0x001b, B:9:0x000e] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.bytedance.realx.video.RendererCommon.RendererEvents
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onFrameResolutionChanged(final int r3, int r4, int r5) {
        /*
            r2 = this;
            com.bytedance.realx.video.RendererCommon$RendererEvents r0 = r2.rendererEvents
            if (r0 == 0) goto L7
            r0.onFrameResolutionChanged(r3, r4, r5)
        L7:
            r0 = 180(0xb4, float:2.52E-43)
            if (r5 == 0) goto L1a
            if (r5 == r0) goto L1a
            r1 = r4
        Le:
            if (r5 != r0) goto L11
        L10:
            r3 = r4
        L11:
            X.0jRI r0 = new X.0jRI
            r0.<init>()
            r2.postOrRun(r0)
            return
        L1a:
            r1 = r3
            if (r5 == 0) goto L10
            goto Le
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SurfaceHolderCallbackC1280720jQs.onFrameResolutionChanged(int, int, int):void");
    }

    public void init(EglBase.Context context, RendererCommon.RendererEvents rendererEvents, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        ThreadUtils.checkIsOnMainThread();
        this.rendererEvents = rendererEvents;
        this.rotatedFrameWidth = 0;
        this.rotatedFrameHeight = 0;
        this.eglRenderer.init(context, this, iArr, glDrawer);
    }

    @Override // android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.eglRenderer.setLayoutAspectRatio((i3 - i) / (i4 - i2));
        updateSurfaceSize();
    }
}
