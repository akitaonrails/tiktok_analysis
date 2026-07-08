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
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19jC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21619219jC extends AbstractC21619419jE {
    public final C20576815fS LLJ;
    public final Paint LLJI;
    public final Paint LLJIJIL;
    public final Paint LLJILJIL;
    public final float LLJILJILJ;
    public final TuxTextView LLJILLL;
    public final float LLJJ;
    public final float LLJJI;
    public final RectF LLJJIII;
    public final RectF LLJJIJI;
    public final List<RectF> LLJJIJIIJIL;
    public RunnableC21619719jH LLJJIJIL;
    public InterfaceC21620219jM LLJJJ;

    @Override // X.AbstractC21619419jE
    public final float LIZIZ() {
        float fLIZ;
        float scaleRuler;
        C20576815fS c20576815fS = this.LLJ;
        long j = c20576815fS.LIZJ;
        if (j == -2) {
            fLIZ = getRequest().LIZ();
            scaleRuler = getScaleRuler();
        } else {
            fLIZ = j - c20576815fS.LIZIZ;
            scaleRuler = getScaleRuler();
        }
        return fLIZ / scaleRuler;
    }

    @Override // X.AbstractC21619419jE
    public final void LIZJ() {
        super.LIZJ();
        RectF rectF = this.LLJJIII;
        rectF.left = 2.0f;
        rectF.top = 0.0f;
        rectF.right = getHopeWidth() - 2.0f;
        RectF rectF2 = this.LLJJIII;
        float f = this.LLJJ;
        rectF2.bottom = f;
        RectF rectF3 = this.LLJJIJI;
        float f2 = rectF2.left;
        float f3 = this.LLJILJILJ;
        float f4 = 2;
        rectF3.left = f2 + (f3 / f4);
        rectF3.top = rectF2.top + (f3 / f4);
        rectF3.right = rectF2.right - (f3 / f4);
        rectF3.bottom = f - (f3 / f4);
        for (C20576815fS c20576815fS : this.LLJ.LJ) {
            float hopeWidth = (((c20576815fS.LIZIZ * 1.0f) / this.LLJ.LIZJ) * getHopeWidth()) + f4;
            float hopeWidth2 = (((c20576815fS.LIZJ * 1.0f) / this.LLJ.LIZJ) * getHopeWidth()) - f4;
            RectF rectF4 = new RectF();
            rectF4.left = hopeWidth;
            rectF4.top = 0.0f;
            rectF4.right = hopeWidth2;
            rectF4.bottom = this.LLJJ / f4;
            ((ArrayList) this.LLJJIJIIJIL).add(rectF4);
        }
    }

    @Override // X.AbstractC21619419jE
    public final float LIZ() {
        return this.LLJJ;
    }

    public final C20576815fS getBean() {
        return this.LLJ;
    }

    public final RunnableC21619719jH getLongTimeClickRunnable() {
        return this.LLJJIJIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = this.LLJJIII;
        float f = this.LLJJI;
        canvas.drawRoundRect(rectF, f, f, this.LLJI);
        RectF rectF2 = this.LLJJIJI;
        float f2 = this.LLJJI;
        canvas.drawRoundRect(rectF2, f2, f2, this.LLJIJIL);
        for (RectF rectF3 : this.LLJJIJIIJIL) {
            float f3 = this.LLJJI;
            canvas.drawRoundRect(rectF3, f3, f3, this.LLJILJIL);
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    HandlerHook.viewRemoveCallbacks(this, this.LLJJIJIL);
                }
            } else {
                HandlerHook.viewRemoveCallbacks(this, this.LLJJIJIL);
                InterfaceC21620219jM interfaceC21620219jM = this.LLJJJ;
                if (interfaceC21620219jM != null) {
                    interfaceC21620219jM.LIZIZ(this.LLJ);
                    return true;
                }
            }
            return true;
        }
        getClass();
        motionEvent.getX();
        motionEvent.getY();
        HandlerHook.viewPostDelay(this, this.LLJJIJIL, ViewConfiguration.getLongPressTimeout());
        return true;
    }

    public final void setListener(InterfaceC21620219jM interfaceC21620219jM) {
        this.LLJJJ = interfaceC21620219jM;
    }

    public final void setLongTimeClickRunnable(RunnableC21619719jH runnableC21619719jH) {
        this.LLJJIJIL = runnableC21619719jH;
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
        this.LLJILLL.measure(View.MeasureSpec.makeMeasureSpec((int) getHopeWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec((int) getHopeHeight(), 1073741824));
        setMeasuredDimension((int) getHopeWidth(), (int) getHopeHeight());
    }

    /* JADX WARN: Type inference failed for: r0v21, types: [X.19jH] */
    public C21619219jC(Context context, C20576815fS c20576815fS, C21618719j7 c21618719j7) {
        super(context, c21618719j7);
        this.LLJ = c20576815fS;
        Paint paint = new Paint();
        this.LLJI = paint;
        Paint paint2 = new Paint();
        this.LLJIJIL = paint2;
        Paint paint3 = new Paint();
        this.LLJILJIL = paint3;
        float fLIZ = C0T83.LIZ(1.0f, getContext());
        this.LLJILJILJ = fLIZ;
        setWillNotDraw(false);
        paint.setAntiAlias(true);
        paint.setColor(-15658735);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(fLIZ);
        paint3.setAntiAlias(true);
        paint3.setColor(135331857);
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setTextSize(12.0f);
        tuxTextView.setTextColor(-16777216);
        tuxTextView.setGravity(8388627);
        tuxTextView.setSingleLine();
        this.LLJILLL = tuxTextView;
        addView(tuxTextView);
        tuxTextView.setText(c20576815fS.LIZLLL.name());
        int i = C20577015fU.LIZ[c20576815fS.LIZLLL.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            paint.setColor(-24395);
                        }
                    } else {
                        paint.setColor(-9382747);
                    }
                } else {
                    paint.setColor(-4989040);
                }
            } else {
                paint.setColor(-595333);
            }
        } else {
            paint.setColor(-18530);
        }
        this.LLJJ = C0T83.LIZ(50.0f, getContext());
        this.LLJJI = C0T83.LIZ(5.0f, getContext());
        this.LLJJIII = new RectF();
        this.LLJJIJI = new RectF();
        this.LLJJIJIIJIL = new ArrayList();
        this.LLJJIJIL = new Runnable() { // from class: X.19jH
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("SlotView$LongClickRunnable@f873.run");
                try {
                    C21619219jC c21619219jC = this.LL;
                    InterfaceC21620219jM interfaceC21620219jM = c21619219jC.LLJJJ;
                    if (interfaceC21620219jM != null) {
                        c21619219jC.getBean();
                        interfaceC21620219jM.LIZ();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("SlotView$LongClickRunnable@f873.run");
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.LLJILLL.layout(20, 0, (int) (getHopeWidth() - 20), (int) getHopeHeight());
    }
}
