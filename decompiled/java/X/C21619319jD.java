package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.tux.input.TuxTextView;

/* JADX INFO: renamed from: X.19jD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21619319jD extends AbstractC21619419jE {
    public final C20576615fQ LLJ;
    public final Paint LLJI;
    public final Paint LLJIJIL;
    public final float LLJILJIL;
    public final TuxTextView LLJILJILJ;
    public final float LLJILLL;
    public final float LLJJ;
    public final RectF LLJJI;
    public final RectF LLJJIII;
    public RunnableC21619619jG LLJJIJI;
    public InterfaceC21620119jL LLJJIJIIJIL;

    @Override // X.AbstractC21619419jE
    public final float LIZIZ() {
        float fLIZ;
        float scaleRuler;
        C20576615fQ c20576615fQ = this.LLJ;
        long j = c20576615fQ.LIZJ;
        if (j == -2) {
            fLIZ = getRequest().LIZ();
            scaleRuler = getScaleRuler();
        } else {
            fLIZ = j - c20576615fQ.LIZIZ;
            scaleRuler = getScaleRuler();
        }
        return fLIZ / scaleRuler;
    }

    @Override // X.AbstractC21619419jE
    public final void LIZJ() {
        super.LIZJ();
        RectF rectF = this.LLJJI;
        rectF.left = 2.0f;
        rectF.top = 0.0f;
        rectF.right = getHopeWidth() - 2.0f;
        RectF rectF2 = this.LLJJI;
        float f = this.LLJILLL;
        rectF2.bottom = f;
        RectF rectF3 = this.LLJJIII;
        float f2 = rectF2.left;
        float f3 = this.LLJILJIL;
        float f4 = 2;
        rectF3.left = f2 + (f3 / f4);
        rectF3.top = rectF2.top + (f3 / f4);
        rectF3.right = rectF2.right - (f3 / f4);
        rectF3.bottom = f - (f3 / f4);
    }

    @Override // X.AbstractC21619419jE
    public final float LIZ() {
        return this.LLJILLL;
    }

    public final C20576615fQ getBean() {
        return this.LLJ;
    }

    public final RunnableC21619619jG getLongTimeClickRunnable() {
        return this.LLJJIJI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.LLJJI;
        float f = this.LLJJ;
        canvas.drawRoundRect(rectF, f, f, this.LLJI);
        RectF rectF2 = this.LLJJIII;
        float f2 = this.LLJJ;
        canvas.drawRoundRect(rectF2, f2, f2, this.LLJIJIL);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    HandlerHook.viewRemoveCallbacks(this, this.LLJJIJI);
                }
            } else {
                HandlerHook.viewRemoveCallbacks(this, this.LLJJIJI);
                InterfaceC21620119jL interfaceC21620119jL = this.LLJJIJIIJIL;
                if (interfaceC21620119jL != null) {
                    interfaceC21620119jL.LIZIZ(this.LLJ);
                    return true;
                }
            }
            return true;
        }
        getClass();
        motionEvent.getX();
        motionEvent.getY();
        HandlerHook.viewPostDelay(this, this.LLJJIJI, ViewConfiguration.getLongPressTimeout());
        return true;
    }

    public final void setListener(InterfaceC21620119jL interfaceC21620119jL) {
        this.LLJJIJIIJIL = interfaceC21620119jL;
    }

    public final void setLongTimeClickRunnable(RunnableC21619619jG runnableC21619619jG) {
        this.LLJJIJI = runnableC21619619jG;
    }

    public void setSelectAnimF(float f) {
        invalidate();
    }

    public final void LIZLLL(float f, long j) {
        this.LLILZ = f;
        this.LLILZIL = j;
        LIZJ();
        invalidate();
    }

    @Override // X.AbstractC21619419jE, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.LLJILJILJ.measure(View.MeasureSpec.makeMeasureSpec((int) getHopeWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((int) getHopeHeight(), 1073741824));
        setMeasuredDimension((int) getHopeWidth(), (int) getHopeHeight());
    }

    /* JADX WARN: Type inference failed for: r0v15, types: [X.19jG] */
    public C21619319jD(Context context, C20576615fQ c20576615fQ, C21618719j7 c21618719j7) {
        super(context, c21618719j7);
        this.LLJ = c20576615fQ;
        Paint paint = new Paint();
        this.LLJI = paint;
        Paint paint2 = new Paint();
        this.LLJIJIL = paint2;
        float fLIZ = C0T83.LIZ(0.5f, getContext());
        this.LLJILJIL = fLIZ;
        setWillNotDraw(false);
        paint.setAntiAlias(true);
        paint.setColor(-15658735);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fLIZ);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextSize(12.0f);
        tuxTextView.setTextColor(-16777216);
        tuxTextView.setGravity(8388627);
        tuxTextView.setSingleLine();
        this.LLJILJILJ = tuxTextView;
        addView(tuxTextView);
        paint.setColor(-1317406);
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
        setAlpha(0.5f);
        tuxTextView.setText("Filter");
        this.LLJILLL = C0T83.LIZ(20.0f, getContext());
        this.LLJJ = C0T83.LIZ(0.0f, getContext());
        this.LLJJI = new RectF();
        this.LLJJIII = new RectF();
        this.LLJJIJI = new Runnable() { // from class: X.19jG
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("FilterView$LongClickRunnable@6be1.run");
                try {
                    C21619319jD c21619319jD = this.LL;
                    InterfaceC21620119jL interfaceC21620119jL = c21619319jD.LLJJIJIIJIL;
                    if (interfaceC21620119jL != null) {
                        c21619319jD.getBean();
                        interfaceC21620119jL.LIZ();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("FilterView$LongClickRunnable@6be1.run");
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LLJILJILJ.layout(20, 0, (int) (getHopeWidth() - 20), (int) getHopeHeight());
    }
}
