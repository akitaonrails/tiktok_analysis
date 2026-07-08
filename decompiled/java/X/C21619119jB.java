package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.bytedance.tux.input.TuxTextView;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.19jB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21619119jB extends AbstractC21619419jE {
    public final C20576715fR LLJ;
    public LinkedList<C20576815fS> LLJI;
    public HashMap<C20576815fS, C21619219jC> LLJIJIL;
    public LinkedList<C20576615fQ> LLJILJIL;
    public HashMap<C20576615fQ, C21619319jD> LLJILJILJ;
    public final float LLJILLL;
    public final float LLJJ;
    public final Paint LLJJI;
    public final Paint LLJJIII;
    public final TuxTextView LLJJIJI;
    public final TuxTextView LLJJIJIIJIL;
    public final RectF LLJJIJIL;
    public RunnableC21619519jF LLJJJ;
    public InterfaceC21619819jI LLJJJIL;

    public final int getXOffset() {
        return 0;
    }

    @Override // X.AbstractC21619419jE
    public final float LIZIZ() {
        return (getRequest().LIZIZ() / getScaleRuler()) + getParentWidth();
    }

    @Override // X.AbstractC21619419jE
    public final void LIZJ() {
        super.LIZJ();
        RectF rectF = this.LLJJIJIL;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getHopeWidth();
        this.LLJJIJIL.bottom = this.LLJJ;
    }

    @Override // X.AbstractC21619419jE
    public final float LIZ() {
        return this.LLJJ;
    }

    public final C20576715fR getBean() {
        return this.LLJ;
    }

    public final LinkedList<C20576615fQ> getFilterBeans() {
        return this.LLJILJIL;
    }

    public final HashMap<C20576615fQ, C21619319jD> getFilterViewMap() {
        return this.LLJILJILJ;
    }

    public final InterfaceC21619819jI getListener() {
        return this.LLJJJIL;
    }

    public final RunnableC21619519jF getLongTimeClickRunnable() {
        return this.LLJJJ;
    }

    public final LinkedList<C20576815fS> getSlotBeans() {
        return this.LLJI;
    }

    public final HashMap<C20576815fS, C21619219jC> getSlotViewMap() {
        return this.LLJIJIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float f = 2;
        canvas.drawLine(0.0f, getHopeHeight() - f, getHopeWidth(), getHopeHeight() - f, this.LLJJI);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        motionEvent.getX();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 3) {
                    getHandler().removeCallbacks(this.LLJJJ);
                }
            } else {
                getHandler().removeCallbacks(this.LLJJJ);
                InterfaceC21619819jI interfaceC21619819jI = this.LLJJJIL;
                if (interfaceC21619819jI != null) {
                    interfaceC21619819jI.LIZLLL(this.LLJ);
                    return true;
                }
            }
            return true;
        }
        getClass();
        motionEvent.getX();
        motionEvent.getY();
        C786410Ut5.LJLIIL(ViewConfiguration.getLongPressTimeout(), getHandler(), this.LLJJJ);
        return true;
    }

    public final void setFilterBeans(LinkedList<C20576615fQ> linkedList) {
        this.LLJILJIL = linkedList;
    }

    public final void setFilterViewMap(HashMap<C20576615fQ, C21619319jD> map) {
        this.LLJILJILJ = map;
    }

    public final void setListener(InterfaceC21619819jI interfaceC21619819jI) {
        this.LLJJJIL = interfaceC21619819jI;
    }

    public final void setLongTimeClickRunnable(RunnableC21619519jF runnableC21619519jF) {
        this.LLJJJ = runnableC21619519jF;
    }

    public final void setSlotBeans(LinkedList<C20576815fS> linkedList) {
        this.LLJI = linkedList;
    }

    public final void setSlotViewMap(HashMap<C20576815fS, C21619219jC> map) {
        this.LLJIJIL = map;
    }

    public final void LIZLLL(float f, long j) {
        this.LLILZ = f;
        this.LLILZIL = j;
        LIZJ();
        Iterator<C20576815fS> it2 = this.LLJI.iterator();
        while (it2.hasNext()) {
            C21619219jC c21619219jC = this.LLJIJIL.get(it2.next());
            if (c21619219jC != null) {
                c21619219jC.LIZLLL(f, j);
            }
        }
        Iterator<C20576615fQ> it3 = this.LLJILJIL.iterator();
        while (it3.hasNext()) {
            C21619319jD c21619319jD = this.LLJILJILJ.get(it3.next());
            if (c21619319jD != null) {
                c21619319jD.LIZLLL(f, j);
            }
        }
        invalidate();
    }

    @Override // X.AbstractC21619419jE, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        Iterator<C20576815fS> it2 = this.LLJI.iterator();
        while (it2.hasNext()) {
            C21619219jC c21619219jC = this.LLJIJIL.get(it2.next());
            if (c21619219jC != null) {
                c21619219jC.measure(i, i2);
            }
        }
        Iterator<C20576615fQ> it3 = this.LLJILJIL.iterator();
        while (it3.hasNext()) {
            C21619319jD c21619319jD = this.LLJILJILJ.get(it3.next());
            if (c21619319jD != null) {
                c21619319jD.measure(i, i2);
            }
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec((int) (getParentWidth() / 2), 1073741824);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec((int) getHopeHeight(), 1073741824);
        this.LLJJIJI.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        this.LLJJIJIIJIL.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
        setMeasuredDimension((int) getHopeWidth(), (int) getHopeHeight());
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [X.19jF] */
    public C21619119jB(Context context, C20576715fR c20576715fR, C21618719j7 c21618719j7) {
        super(context, c21618719j7);
        this.LLJ = c20576715fR;
        this.LLJI = new LinkedList<>();
        this.LLJIJIL = new HashMap<>();
        this.LLJILJIL = new LinkedList<>();
        this.LLJILJILJ = new HashMap<>();
        this.LLJILLL = C0T83.LIZ(4.0f, getContext());
        this.LLJJ = C0T83.LIZ(58.0f, getContext());
        this.LLJJI = new Paint();
        this.LLJJIII = new Paint();
        int i = 0;
        setWillNotDraw(false);
        for (C20576815fS c20576815fS : c20576715fR.LJI) {
            C21619219jC c21619219jC = new C21619219jC(getContext(), c20576815fS, c21618719j7);
            this.LLJI.add(c20576815fS);
            this.LLJIJIL.put(c20576815fS, c21619219jC);
            c21619219jC.LIZLLL(getScaleRuler(), getLevelTime());
            c21619219jC.setListener(new InterfaceC21620219jM() { // from class: X.19jJ
                @Override // X.InterfaceC21620219jM
                public final void LIZ() {
                }

                @Override // X.InterfaceC21620219jM
                public final void LIZIZ(C20576815fS c20576815fS2) {
                    InterfaceC21619819jI listener = this.LIZ.getListener();
                    if (listener != null) {
                        listener.LIZIZ(c20576815fS2);
                    }
                }
            });
            addView(c21619219jC);
        }
        for (C20576615fQ c20576615fQ : this.LLJ.LJII) {
            C21619319jD c21619319jD = new C21619319jD(getContext(), c20576615fQ, c21618719j7);
            this.LLJILJIL.add(c20576615fQ);
            this.LLJILJILJ.put(c20576615fQ, c21619319jD);
            c21619319jD.LIZLLL(getScaleRuler(), getLevelTime());
            c21619319jD.setListener(new InterfaceC21620119jL() { // from class: X.19jK
                @Override // X.InterfaceC21620119jL
                public final void LIZ() {
                }

                @Override // X.InterfaceC21620119jL
                public final void LIZIZ(C20576615fQ c20576615fQ2) {
                    InterfaceC21619819jI listener = this.LIZ.getListener();
                    if (listener != null) {
                        listener.LIZJ(c20576615fQ2);
                    }
                }
            });
            addView(c21619319jD);
        }
        this.LLJJI.setColor(-4540232);
        this.LLJJI.setStyle(Paint.Style.FILL_AND_STROKE);
        this.LLJJI.setStrokeWidth(C0T83.LIZ(1.0f, context));
        this.LLJJI.setPathEffect(new DashPathEffect(new float[]{C0T83.LIZ(10.0f, context), C0T83.LIZ(10.0f, context)}, 0.0f));
        this.LLJJIII.setColor(-14671838);
        this.LLJJIII.setStyle(Paint.Style.FILL_AND_STROKE);
        AttributeSet attributeSet = null;
        int i2 = 6;
        TuxTextView tuxTextView = new TuxTextView(context, attributeSet, i2, i);
        tuxTextView.setTextSize(12.0f);
        tuxTextView.setTextColor(-7829368);
        tuxTextView.setGravity(8388629);
        tuxTextView.setSingleLine();
        this.LLJJIJI = tuxTextView;
        addView(tuxTextView);
        TuxTextView tuxTextView2 = new TuxTextView(context, attributeSet, i2, i);
        tuxTextView2.setTextSize(12.0f);
        tuxTextView2.setTextColor(-7829368);
        tuxTextView2.setGravity(8388627);
        tuxTextView2.setSingleLine();
        this.LLJJIJIIJIL = tuxTextView2;
        addView(tuxTextView2);
        C20576715fR c20576715fR2 = this.LLJ;
        if (c20576715fR2.LIZJ) {
            tuxTextView.setText("MainTrack");
        } else {
            tuxTextView.setText(c20576715fR2.LJFF);
        }
        if (this.LLJ.LIZLLL) {
            tuxTextView2.setText("RewindBase");
        }
        if (this.LLJ.LJ) {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
        } else {
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(0.3f);
        }
        this.LLJJIJIL = new RectF();
        this.LLJJJ = new Runnable() { // from class: X.19jF
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("TrackView$LongClickRunnable@263f.run");
                try {
                    if (this.LL.getListener() != null) {
                        InterfaceC21619819jI listener = this.LL.getListener();
                        this.LL.getBean();
                        listener.LIZ();
                    }
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("TrackView$LongClickRunnable@263f.run");
            }
        };
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        float f = 2;
        float f2 = 50;
        this.LLJJIJI.layout(0, 0, (int) ((getParentWidth() / f) - f2), (int) getHopeHeight());
        this.LLJJIJIIJIL.layout(50, 0, (int) ((getParentWidth() / f) - f2), (int) getHopeHeight());
        Iterator<C20576815fS> it2 = this.LLJI.iterator();
        while (it2.hasNext()) {
            C21619219jC c21619219jC = this.LLJIJIL.get(it2.next());
            if (c21619219jC != null) {
                int parentWidth = (int) ((getParentWidth() / f) + (r1.LIZIZ / getScaleRuler()));
                int hopeWidth = ((int) c21619219jC.getHopeWidth()) + parentWidth;
                int i5 = (int) this.LLJILLL;
                c21619219jC.layout(parentWidth, i5, hopeWidth, (int) (i5 + c21619219jC.getHopeHeight()));
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("track  - slot ");
                sbLIZ.append(parentWidth);
                sbLIZ.append(" / ");
                sbLIZ.append(hopeWidth);
                sbLIZ.append(' ');
                C2188811AlT.LIZIZ(sbLIZ);
            }
        }
        Iterator<C20576615fQ> it3 = this.LLJILJIL.iterator();
        while (it3.hasNext()) {
            C21619319jD c21619319jD = this.LLJILJILJ.get(it3.next());
            if (c21619319jD != null) {
                int parentWidth2 = (int) ((getParentWidth() / f) + (r1.LIZIZ / getScaleRuler()));
                int hopeWidth2 = ((int) c21619319jD.getHopeWidth()) + parentWidth2;
                int i6 = (int) this.LLJILLL;
                c21619319jD.layout(parentWidth2, i6, hopeWidth2, (int) (i6 + c21619319jD.getHopeHeight()));
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("track  - slot ");
                sbLIZ2.append(parentWidth2);
                sbLIZ2.append(" / ");
                sbLIZ2.append(hopeWidth2);
                sbLIZ2.append(' ');
                C2188811AlT.LIZIZ(sbLIZ2);
            }
        }
    }
}
