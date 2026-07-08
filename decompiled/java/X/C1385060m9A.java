package X;

import Y.ARunnableS121S0100000_21;
import android.content.Context;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.common.meteor.control.BaseHandler;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS565S0100000_21;

/* JADX INFO: renamed from: X.0m9A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public class C1385060m9A extends View implements InterfaceC1396910mSH {
    public InterfaceC1384330m7z LL;
    public final BaseHandler LLILLJJLI;
    public boolean LLILLL;
    public LinkedList<Long> LLILZ;
    public final ARunnableS121S0100000_21 LLILZIL;

    public C1385060m9A(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // X.InterfaceC1396910mSH
    public View getView() {
        return this;
    }

    @Override // X.InterfaceC1396910mSH
    public final void LIZ() {
        C1385100m9E c1385100m9ELJJIIJ;
        C1385100m9E c1385100m9ELJJIIJ2;
        C1385100m9E c1385100m9ELJJIIJ3;
        C1384750m8f config;
        C1385090m9D c1385090m9D;
        InterfaceC1384330m7z interfaceC1384330m7z = this.LL;
        if (interfaceC1384330m7z != null && (config = interfaceC1384330m7z.getConfig()) != null && (c1385090m9D = config.LIZLLL) != null && c1385090m9D.LIZIZ) {
            postInvalidate();
            return;
        }
        InterfaceC1384330m7z interfaceC1384330m7z2 = this.LL;
        if (interfaceC1384330m7z2 == null || (c1385100m9ELJJIIJ2 = interfaceC1384330m7z2.LJJIIJ()) == null) {
            InterfaceC1384330m7z interfaceC1384330m7z3 = this.LL;
            if (interfaceC1384330m7z3 == null || (c1385100m9ELJJIIJ = interfaceC1384330m7z3.LJJIIJ()) == null) {
                return;
            }
            c1385100m9ELJJIIJ.LIZ.LIZLLL.getClass();
            getView();
            HandlerHook.viewPostDelay(this, this.LLILZIL, 0L);
            return;
        }
        c1385100m9ELJJIIJ2.LIZ.LIZLLL.getClass();
        postInvalidateOnAnimation();
        InterfaceC1384330m7z interfaceC1384330m7z4 = this.LL;
        if (interfaceC1384330m7z4 == null || (c1385100m9ELJJIIJ3 = interfaceC1384330m7z4.LJJIIJ()) == null) {
            return;
        }
        c1385100m9ELJJIIJ3.LIZ.LIZLLL.getClass();
    }

    @Override // X.InterfaceC1396910mSH
    public final void LIZLLL() {
        InterfaceC1384330m7z interfaceC1384330m7z = this.LL;
        if (interfaceC1384330m7z != null) {
            interfaceC1384330m7z.LJI(this);
        }
        this.LL = null;
    }

    public InterfaceC1384330m7z getCurrentDanmakuController() {
        return this.LL;
    }

    public BaseHandler getDrawThreadHandler() {
        return this.LLILLJJLI;
    }

    public final boolean getShowFps() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC1396910mSH
    public final void LIZJ(float f) {
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(f);
    }

    public final void LJ(InterfaceC1384330m7z interfaceC1384330m7z) {
        if (interfaceC1384330m7z.LJIJJLI(this)) {
            interfaceC1384330m7z.getConfig().LIZIZ = getDrawThreadHandler();
            this.LL = interfaceC1384330m7z;
            requestLayout();
            return;
        }
        throw new IllegalStateException("controller already bound by another view");
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00bc  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void draw(android.graphics.Canvas r10) {
        /*
            r9 = this;
            super.draw(r10)
            X.0m7z r0 = r9.LL
            if (r0 == 0) goto La
            r0.LJIL(r10)
        La:
            boolean r0 = r9.LLILLL
            if (r0 == 0) goto Lbb
            java.util.LinkedList<java.lang.Long> r0 = r9.LLILZ
            if (r0 != 0) goto L19
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r9.LLILZ = r0
        L19:
            java.util.Locale r3 = java.util.Locale.getDefault()
            r0 = 1
            java.lang.Object[] r2 = new java.lang.Object[r0]
            long r4 = android.os.SystemClock.uptimeMillis()
            java.util.LinkedList<java.lang.Long> r1 = r9.LLILZ
            java.lang.Long r0 = java.lang.Long.valueOf(r4)
            r1.addLast(r0)
            java.util.LinkedList<java.lang.Long> r0 = r9.LLILZ
            java.lang.Object r0 = r0.peekFirst()
            java.lang.Long r0 = (java.lang.Long) r0
            r8 = 0
            r1 = 0
            if (r0 == 0) goto Lbc
            long r6 = r0.longValue()
            long r4 = r4 - r6
            float r6 = (float) r4
            java.util.LinkedList<java.lang.Long> r0 = r9.LLILZ
            int r4 = r0.size()
            r0 = 50
            if (r4 <= r0) goto L4e
            java.util.LinkedList<java.lang.Long> r0 = r9.LLILZ
            r0.removeFirst()
        L4e:
            float r0 = (float) r1
            int r0 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r0 <= 0) goto Lbc
            java.util.LinkedList<java.lang.Long> r0 = r9.LLILZ
            int r0 = r0.size()
            int r0 = r0 * 1000
            float r0 = (float) r0
            float r0 = r0 / r6
        L5d:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r2[r1] = r0
            java.lang.String r0 = "fps %.2f"
            java.lang.String r4 = X.C786410Ut5.k4(r3, r0, r2)
            android.graphics.Paint r0 = X.C0GU5.LIZIZ
            if (r0 != 0) goto L80
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            X.C0GU5.LIZIZ = r1
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r1.setColor(r0)
            android.graphics.Paint r1 = X.C0GU5.LIZIZ
            r0 = 1106247680(0x41f00000, float:30.0)
            r1.setTextSize(r0)
        L80:
            int r0 = r10.getHeight()
            int r5 = r0 + (-50)
            int r0 = r5 + (-50)
            float r6 = (float) r0
            android.graphics.Paint r0 = X.C0GU5.LIZIZ
            float r1 = r0.measureText(r4)
            r0 = 1101004800(0x41a00000, float:20.0)
            float r1 = r1 + r0
            int r0 = (int) r1
            float r3 = (float) r0
            int r0 = r10.getHeight()
            float r0 = (float) r0
            android.graphics.RectF r1 = X.C0GU5.LIZJ
            r2 = 1092616192(0x41200000, float:10.0)
            r1.set(r2, r6, r3, r0)
            float r0 = r1.width()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lb5
            float r0 = r1.height()
            int r0 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r0 <= 0) goto Lb5
            android.graphics.Paint r0 = X.C0GU5.LIZ
            r10.drawRect(r1, r0)
        Lb5:
            float r1 = (float) r5
            android.graphics.Paint r0 = X.C0GU5.LIZIZ
            r10.drawText(r4, r2, r1, r0)
        Lbb:
            return
        Lbc:
            r0 = 0
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1385060m9A.draw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        InterfaceC1384330m7z interfaceC1384330m7z = this.LL;
        if (interfaceC1384330m7z != null && interfaceC1384330m7z.onTouchEvent(motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public final void setShowFps(boolean z) {
        this.LLILLL = z;
    }

    @Override // X.InterfaceC1396910mSH
    public final void LIZIZ(long j, Function0 function0) {
        HandlerHook.viewPostDelay(this, new RunnableC514801zW(function0, (Function0<Unit>) 202), j);
    }

    public C1385060m9A(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LLILLJJLI = new BaseHandler(Looper.getMainLooper(), new AwS565S0100000_21(this, 71));
        this.LLILZIL = new ARunnableS121S0100000_21(this, 13);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        InterfaceC1384330m7z interfaceC1384330m7z = this.LL;
        if (interfaceC1384330m7z != null) {
            interfaceC1384330m7z.LIZ(i3 - i, i4 - i2);
        }
    }
}
