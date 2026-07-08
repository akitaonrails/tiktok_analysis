package X;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS576S0100000_32;

/* JADX INFO: renamed from: X.18nL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21390118nL extends FrameLayout {
    public Matrix LL;
    public C21390318nN LLILLJJLI;
    public Integer LLILLL;
    public TimeInterpolator LLILZ;
    public RenderNode LLILZIL;
    public boolean LLILZLL;
    public int LLIZ;
    public int LLIZLLLIL;
    public InterfaceC21389118nB LLJ;

    @Override // android.view.View
    public Matrix getMatrix() {
        Matrix matrix = this.LL;
        if (matrix == null) {
            return super.getMatrix();
        }
        C21390318nN c21390318nN = this.LLILLJJLI;
        if (c21390318nN != null) {
            float f = c21390318nN.LIZ;
            float f2 = c21390318nN.LIZIZ;
            float fUptimeMillis = (SystemClock.uptimeMillis() - c21390318nN.LIZJ) / c21390318nN.LIZLLL;
            if (fUptimeMillis > 1.0f) {
                fUptimeMillis = 1.0f;
            }
            TimeInterpolator timeInterpolator = this.LLILZ;
            if (timeInterpolator != null) {
                fUptimeMillis = timeInterpolator.getInterpolation(fUptimeMillis);
            }
            float f3 = f + ((f2 - f) * fUptimeMillis);
            Matrix matrix2 = this.LL;
            if (matrix2 != null) {
                Integer num = this.LLILLL;
                if (num == null || num.intValue() != 2) {
                    matrix2.setTranslate(f3, 0.0f);
                    return matrix;
                }
                matrix2.setScale(f3, f3);
            }
        }
        return matrix;
    }

    public final InterfaceC21389118nB getRenderNodeDriver() {
        return this.LLJ;
    }

    public C21390118nL(Context context) {
        super(context);
        this.LLILZLL = true;
        this.LLIZ = -1;
        this.LLIZLLLIL = -1;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        InterfaceC21389118nB interfaceC21389118nB = this.LLJ;
        if (interfaceC21389118nB != null && Build.VERSION.SDK_INT >= 29 && (canvas instanceof RecordingCanvas) && getWidth() > 0 && getHeight() > 0) {
            RecordingCanvas recordingCanvas = (RecordingCanvas) canvas;
            if (getWidth() <= recordingCanvas.getMaximumBitmapWidth() && getHeight() <= recordingCanvas.getMaximumBitmapHeight()) {
                RenderNode renderNode = this.LLILZIL;
                if (renderNode == null) {
                    renderNode = new RenderNode("saf_root_container");
                    this.LLILZIL = renderNode;
                }
                if (getWidth() != this.LLIZ || getHeight() != this.LLIZLLLIL) {
                    renderNode.setPosition(0, 0, getWidth(), getHeight());
                    this.LLIZ = getWidth();
                    this.LLIZLLLIL = getHeight();
                    this.LLILZLL = true;
                }
                if (this.LLILZLL || !renderNode.hasDisplayList()) {
                    try {
                        super.dispatchDraw(renderNode.beginRecording(getWidth(), getHeight()));
                        renderNode.endRecording();
                        this.LLILZLL = false;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        renderNode.endRecording();
                        throw th;
                    }
                }
                interfaceC21389118nB.LIZ(renderNode);
                recordingCanvas.drawRenderNode(renderNode);
                return;
            }
        }
        super.dispatchDraw(canvas);
    }

    public final void setRenderNodeDriver(InterfaceC21389118nB interfaceC21389118nB) {
        if (this.LLJ == interfaceC21389118nB) {
            return;
        }
        this.LLJ = interfaceC21389118nB;
        if (interfaceC21389118nB == null && Build.VERSION.SDK_INT >= 29) {
            RenderNode renderNode = this.LLILZIL;
            if (renderNode != null) {
                renderNode.discardDisplayList();
            }
        } else {
            this.LLILZLL = true;
        }
        invalidate();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void onDescendantInvalidated(View view, View view2) {
        this.LLILZLL = true;
        super.onDescendantInvalidated(view, view2);
    }

    public final void LIZ(float f, float f2, long j, Integer num, TimeInterpolator timeInterpolator, InterfaceC21390418nO interfaceC21390418nO) {
        this.LLILLJJLI = new C21390318nN(f, f2, SystemClock.uptimeMillis(), j);
        this.LLILLL = num;
        this.LLILZ = timeInterpolator;
        Matrix matrix = new Matrix();
        if (num != null && num.intValue() == 2) {
            matrix.setScale(f, f);
        } else {
            matrix.setTranslate(f, 0.0f);
        }
        this.LL = matrix;
        interfaceC21390418nO.LIZ(new AwS576S0100000_32(this, 671));
    }
}
