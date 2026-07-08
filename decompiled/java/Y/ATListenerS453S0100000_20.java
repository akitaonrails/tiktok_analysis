package Y;

import X.C1318190kPJ;
import X.TextureViewSurfaceTextureListenerC1288270jd3;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import com.lynx.canvas.PlatformCanvasView;

/* JADX INFO: loaded from: classes21.dex */
public class ATListenerS453S0100000_20 implements View.OnTouchListener {
    public final int $t;
    public Object l0;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        switch (this.$t) {
            case 0:
                return onTouch$0(this, view, motionEvent);
            case 1:
                return onTouch$1(this, view, motionEvent);
            case 2:
                return onTouch$2(this, view, motionEvent);
            default:
                return false;
        }
    }

    public ATListenerS453S0100000_20(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final boolean onTouch$0(ATListenerS453S0100000_20 aTListenerS453S0100000_20, View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
        }
        TextureViewSurfaceTextureListenerC1288270jd3 textureViewSurfaceTextureListenerC1288270jd3 = (TextureViewSurfaceTextureListenerC1288270jd3) aTListenerS453S0100000_20.l0;
        Rect rect = new Rect(0, 0, ((TextureViewSurfaceTextureListenerC1288270jd3) aTListenerS453S0100000_20.l0).getWidth(), ((TextureViewSurfaceTextureListenerC1288270jd3) aTListenerS453S0100000_20.l0).getHeight());
        Rect rect2 = new Rect(0, 0, ((TextureViewSurfaceTextureListenerC1288270jd3) aTListenerS453S0100000_20.l0).getWidth(), ((TextureViewSurfaceTextureListenerC1288270jd3) aTListenerS453S0100000_20.l0).getHeight());
        PlatformCanvasView platformCanvasView = textureViewSurfaceTextureListenerC1288270jd3.LLIZLLLIL;
        if (platformCanvasView != null) {
            platformCanvasView.LIZ(motionEvent, rect, rect2);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        if (r8.getY() > r3.LLJJJJLIIL) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean onTouch$1(Y.ATListenerS453S0100000_20 r6, android.view.View r7, android.view.MotionEvent r8) {
        /*
            java.lang.Object r3 = r6.l0
            com.bytedance.ies.xelement.input.LynxBaseInputView r3 = (com.bytedance.ies.xelement.input.LynxBaseInputView) r3
            int r6 = r8.getAction()
            r2 = 0
            r5 = 1
            if (r6 == 0) goto L85
            r4 = 10
            r1 = 0
            if (r6 == r5) goto L68
            r0 = 2
            if (r6 == r0) goto L34
            r0 = 3
            if (r6 != r0) goto L33
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            r3.getClass()
            r3.LLJJJJLIIL = r1
            int r1 = r7.getScrollY()
            int r0 = r3.LLJJL
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            if (r0 > r4) goto L31
            r5 = 0
        L31:
            r3.LLJJLIIIJLLLLLLLZ = r5
        L33:
            return r2
        L34:
            X.18oS r0 = r3.LL
            r4 = 0
            if (r0 != 0) goto L3a
            r0 = r4
        L3a:
            boolean r0 = r0.canScrollVertically(r5)
            if (r0 != 0) goto L4a
            float r1 = r8.getY()
            float r0 = r3.LLJJJJLIIL
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 < 0) goto L60
        L4a:
            X.18oS r0 = r3.LL
            if (r0 == 0) goto L4f
            r4 = r0
        L4f:
            r0 = -1
            boolean r0 = r4.canScrollVertically(r0)
            if (r0 != 0) goto L33
            float r1 = r8.getY()
            float r0 = r3.LLJJJJLIIL
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L33
        L60:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            return r2
        L68:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r2)
            r3.getClass()
            r3.LLJJJJLIIL = r1
            int r1 = r7.getScrollY()
            int r0 = r3.LLJJL
            int r1 = r1 - r0
            int r0 = java.lang.Math.abs(r1)
            if (r0 > r4) goto L82
            r5 = 0
        L82:
            r3.LLJJLIIIJLLLLLLLZ = r5
            return r2
        L85:
            android.view.ViewParent r0 = r7.getParent()
            r0.requestDisallowInterceptTouchEvent(r5)
            r8.getX()
            r3.getClass()
            float r0 = r8.getY()
            r3.LLJJJJLIIL = r0
            int r0 = r7.getScrollY()
            r3.LLJJL = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.ATListenerS453S0100000_20.onTouch$1(Y.ATListenerS453S0100000_20, android.view.View, android.view.MotionEvent):boolean");
    }

    public static final boolean onTouch$2(ATListenerS453S0100000_20 aTListenerS453S0100000_20, View view, MotionEvent motionEvent) {
        return !((C1318190kPJ) aTListenerS453S0100000_20.l0).LLILZLL;
    }
}
