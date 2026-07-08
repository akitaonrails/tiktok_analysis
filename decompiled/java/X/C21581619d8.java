package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import com.lynx.base.log.LynxLog;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.19d8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21581619d8 extends C1AML {
    public float[] LLILLL;
    public boolean LLILZ;
    public volatile boolean LLILZIL;
    public InterfaceC1473700oS8 LLILZLL;

    @Override // X.C1AML
    public final void LJFF() {
        this.LLILZ = false;
        this.LLILZLL = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.LLILZIL) {
            InterfaceC1491100ouC mediaView = getMediaView();
            if (mediaView != null) {
                mediaView.LJII(this.LLILZLL);
            }
            this.LLILZLL = null;
            this.LLILZ = true;
            this.LLILZIL = false;
            LynxLog.i("LynxVideoEnginePlayableWrapperView", "unset pendingPrepare");
        }
    }

    @Override // X.C1AML
    public final boolean LIZLLL() {
        return this.LLILZ;
    }

    public C21581619d8(Context context) {
        new LinkedHashMap();
        super(context);
    }

    @Override // X.C1AML
    public final void LIZJ(C1491120ouE c1491120ouE) {
        if (isAttachedToWindow()) {
            InterfaceC1491100ouC mediaView = getMediaView();
            if (mediaView != null) {
                LynxLog.i("LynxVideoEnginePlayableWrapperView", "invoke prepare");
                mediaView.LJII(c1491120ouE);
                this.LLILZ = true;
                return;
            }
            return;
        }
        this.LLILZIL = true;
        this.LLILZLL = c1491120ouE;
        LynxLog.i("LynxVideoEnginePlayableWrapperView", "set pendingPrepare");
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        if (canvas != null && this.LLILLL != null) {
            canvas.saveLayer(new RectF(0.0f, 0.0f, getWidth(), getHeight()), null, 31);
            Path path = new Path();
            path.addRoundRect(new RectF(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom()), this.LLILLL, Path.Direction.CW);
            canvas.clipPath(path);
            super.draw(canvas);
            canvas.restore();
            return;
        }
        super.draw(canvas);
    }

    public final void setBorderRadius(float[] fArr) {
        this.LLILLL = fArr;
        invalidate();
    }

    @Override // X.C1AML
    public void setPlayParams(Map<String, ? extends Object> map) {
        Boolean bool;
        Object obj = map.get("player-type");
        if (!(obj instanceof String) || obj == null) {
            obj = "default";
        }
        InterfaceC21582019dC interfaceC21582019dC = C21581719d9.LIZ.get(obj);
        if (interfaceC21582019dC == null) {
            LynxLog.e("LynxVideoEnginePlayableWrapperView", "mediaView playerType not found");
            return;
        }
        interfaceC21582019dC.LIZ();
        InterfaceC1491100ouC mediaView = getMediaView();
        setMediaView(new C1473720oSA(getContext()));
        if (getMediaView() == null) {
            if (mediaView != null) {
                mediaView.destroy();
            }
            LynxLog.e("LynxVideoEnginePlayableWrapperView", "mediaView invalid playableInstance");
            return;
        }
        InterfaceC1491100ouC mediaView2 = getMediaView();
        if (mediaView2 != null) {
            mediaView2.initialize();
            mediaView2.LJIIL(this);
            LynxLog.i("LynxVideoEnginePlayableWrapperView", "mediaView trigger initialize");
        }
        InterfaceC1491100ouC mediaView3 = getMediaView();
        if (mediaView3 != null) {
            mediaView3.LJIILL(map);
        }
        Object obj2 = map.get("auto_prepare");
        if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null && bool.booleanValue()) {
            if (isAttachedToWindow()) {
                InterfaceC1491100ouC mediaView4 = getMediaView();
                if (mediaView4 != null) {
                    mediaView4.LJII(null);
                }
                this.LLILZ = true;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Trigger prepare for mediaView ");
                sbLIZ.append(getMediaView());
                LynxLog.i("LynxVideoEnginePlayableWrapperView", C2188811AlT.LIZIZ(sbLIZ));
            } else {
                this.LLILZIL = true;
            }
        }
        if (mediaView != null) {
            mediaView.destroy();
        }
    }
}
