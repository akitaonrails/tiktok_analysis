package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.AwS31S0100001_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kZL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class SurfaceHolderCallbackC1324410kZL extends SurfaceView implements SurfaceHolder.Callback {
    public final Paint LL;
    public Float LLILLJJLI;
    public volatile EnumC1324400kZK LLILLL;
    public boolean LLILZ;

    public final synchronized void LIZ(float f) {
        Canvas canvasLockCanvas;
        float f2;
        try {
            canvasLockCanvas = getHolder().lockCanvas();
        } finally {
        }
        if (canvasLockCanvas == null) {
            return;
        }
        canvasLockCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
        float measuredWidth = getMeasuredWidth() / 2.0f;
        float measuredHeight = getMeasuredHeight() / 2.0f;
        if (measuredWidth > measuredHeight) {
            f2 = measuredHeight;
        } else {
            f2 = measuredWidth;
        }
        float f3 = f2 - 5;
        float f4 = 360 * f;
        Paint paint = this.LL;
        if (paint != null) {
            canvasLockCanvas.drawArc(measuredWidth - f3, measuredHeight - f3, measuredWidth + f3, measuredHeight + f3, -90.0f, f4, false, paint);
        }
        this.LLILZ = true;
        getHolder().unlockCanvasAndPost(canvasLockCanvas);
        Object c098200Yq = Unit.LIZ;
        C189200o6.m2constructorimpl(c098200Yq);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1AF0.LJ(thM5exceptionOrNullimpl);
        }
    }

    public final void setProgress(float f) {
        if (Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C0CNO.LIZ(C15O7.LJI, new AwS31S0100001_20(this, f, 0));
            return;
        }
        this.LLILLJJLI = Float.valueOf(f);
        if (this.LLILLL == EnumC1324400kZK.INIT && this.LLILLL == EnumC1324400kZK.DESTROYED) {
            return;
        }
        LIZ(f);
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Float f;
        this.LLILLL = EnumC1324400kZK.CREATED;
        if (!this.LLILZ && (f = this.LLILLJJLI) != null) {
            LIZ(f.floatValue());
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        this.LLILLL = EnumC1324400kZK.DESTROYED;
    }

    public SurfaceHolderCallbackC1324410kZL(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILLL = EnumC1324400kZK.INIT;
        SurfaceHolder holder = getHolder();
        holder.setFormat(-2);
        setZOrderOnTop(true);
        holder.addCallback(this);
        Paint paint = new Paint();
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.xa, context);
        paint.setColor(numLIZJ != null ? numLIZJ.intValue() : 0);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(C339190DRl.LIZ(3));
        paint.setStrokeCap(Paint.Cap.ROUND);
        setBackground(context.getDrawable(R.drawable.bkj));
        this.LL = paint;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.LLILLL = EnumC1324400kZK.CHANGED;
    }
}
