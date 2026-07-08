package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.bytedance.ies.nle.editor_jni.NLETimeSpaceNode;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS619S0100000_5;

/* JADX INFO: renamed from: X.0EaN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367130EaN extends View {
    public long LL;
    public List<C350030Dnt> LLILLJJLI;
    public List<? extends List<Integer>> LLILLL;
    public final Paint LLILZ;
    public final Paint LLILZIL;
    public final int LLILZLL;
    public final Rect LLIZ;
    public final Rect LLIZLLLIL;
    public final Rect LLJ;
    public AbstractC368670Ecr LLJI;
    public int LLJIJIL;
    public final int LLJILJIL;
    public final Path LLJILJILJ;
    public final C01GW LLJILLL;

    public final boolean LIZ() {
        return ((Boolean) this.LLJILLL.getValue()).booleanValue();
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        C368740Ecy c368740Ecy;
        super.onAttachedToWindow();
        AbstractC368670Ecr abstractC368670Ecr = (AbstractC368670Ecr) getParent();
        this.LLJI = abstractC368670Ecr;
        abstractC368670Ecr.setScrollChangeListener(new AwS619S0100000_5(this, 40));
        ViewParent parent = getParent();
        if (!(parent instanceof C368740Ecy) || (c368740Ecy = (C368740Ecy) parent) == null) {
            return;
        }
        c368740Ecy.setOnScaleUpdate$editor_trackpanel_release(new AwS549S0100000_5(this, 974));
    }

    public final List<List<Integer>> getAudioBeatPoints() {
        return this.LLILLL;
    }

    public final long getDurationTime() {
        return this.LL;
    }

    public final Paint getPaint() {
        return this.LLILZ;
    }

    public final int getRadiusBeatPoint() {
        return this.LLILZLL;
    }

    public final List<C350030Dnt> getTrackList() {
        return this.LLILLJJLI;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        int scrollX;
        int i;
        float fLIZJ;
        float startTime;
        float endTime;
        int scrollX2;
        super.onDraw(canvas);
        int i2 = this.LLJILJIL / 2;
        if (LIZ()) {
            int measuredWidth = getMeasuredWidth();
            AbstractC368670Ecr abstractC368670Ecr = this.LLJI;
            if (abstractC368670Ecr != null) {
                scrollX2 = abstractC368670Ecr.getScrollX();
            } else {
                scrollX2 = 0;
            }
            scrollX = measuredWidth + scrollX2;
        } else {
            AbstractC368670Ecr abstractC368670Ecr2 = this.LLJI;
            if (abstractC368670Ecr2 != null) {
                scrollX = abstractC368670Ecr2.getScrollX();
            } else {
                scrollX = 0;
            }
        }
        if (LIZ()) {
            i = scrollX - ((int) (((double) this.LLJILJIL) * 1.5d));
        } else {
            i = (int) (((double) scrollX) + (((double) this.LLJILJIL) * 1.5d));
        }
        if (LIZ()) {
            this.LLIZ.set(i, 0, scrollX, 1);
        } else {
            this.LLIZ.set(scrollX, 0, i, 1);
        }
        if (!this.LLILLJJLI.isEmpty()) {
            this.LLJILJILJ.reset();
            List<C350030Dnt> list = this.LLILLJJLI;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            Iterator<C350030Dnt> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next().LIZLLL);
            }
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                for (NLETimeSpaceNode nLETimeSpaceNode : (List) it3.next()) {
                    if (LIZ()) {
                        startTime = getMeasuredWidth() - (((nLETimeSpaceNode.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * C360610EBv.LIZJ()) + i2);
                    } else {
                        startTime = ((nLETimeSpaceNode.getStartTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * C360610EBv.LIZJ()) + i2;
                    }
                    if (LIZ()) {
                        endTime = getMeasuredWidth() - (((nLETimeSpaceNode.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * C360610EBv.LIZJ()) + i2);
                    } else {
                        endTime = ((nLETimeSpaceNode.getEndTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT)) * C360610EBv.LIZJ()) + i2;
                    }
                    if (LIZ()) {
                        this.LLIZLLLIL.set((int) endTime, 0, (int) startTime, 1);
                    } else {
                        this.LLIZLLLIL.set((int) startTime, 0, (int) endTime, 1);
                    }
                    if (this.LLJ.setIntersect(this.LLIZLLLIL, this.LLIZ)) {
                        this.LLJILJILJ.moveTo(this.LLJ.left, getMeasuredHeight() / 2);
                        this.LLJILJILJ.lineTo(this.LLJ.right, getMeasuredHeight() / 2);
                    }
                }
            }
            canvas.drawPath(this.LLJILJILJ, this.LLILZ);
            this.LLJILJILJ.reset();
        }
        if (!this.LLILLL.isEmpty()) {
            Iterator<? extends List<Integer>> it4 = this.LLILLL.iterator();
            while (it4.hasNext()) {
                Iterator<Integer> it5 = it4.next().iterator();
                while (it5.hasNext()) {
                    int iIntValue = it5.next().intValue();
                    if (LIZ()) {
                        fLIZJ = getMeasuredWidth() - ((iIntValue * C360610EBv.LIZJ()) + i2);
                    } else {
                        fLIZJ = i2 + (iIntValue * C360610EBv.LIZJ());
                    }
                    float f = this.LLIZ.left;
                    if (fLIZJ <= r2.right && f <= fLIZJ) {
                        canvas.drawCircle(fLIZJ, getMeasuredHeight() / 2, this.LLILZLL, this.LLILZIL);
                    }
                }
            }
        }
    }

    public final void setAudioBeatPoints(List<? extends List<Integer>> list) {
        this.LLILLL = list;
        requestLayout();
    }

    public final void setColor(int i) {
        this.LLJIJIL = i;
        this.LLILZ.setColor(i);
    }

    public final void setDurationTime(long j) {
        this.LL = j;
    }

    public final void setTrackList(List<C350030Dnt> list) {
        this.LLILLJJLI = list;
        requestLayout();
    }

    public C367130EaN(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C13BV c13bv = C13BV.INSTANCE;
        this.LLILLJJLI = c13bv;
        this.LLILLL = c13bv;
        Paint paint = new Paint(1);
        this.LLILZ = paint;
        Paint paint2 = new Paint(1);
        this.LLILZIL = paint2;
        this.LLILZLL = C0FU0.LIZ(2.0f);
        this.LLIZ = new Rect();
        this.LLIZLLLIL = new Rect();
        this.LLJ = new Rect();
        this.LLJIJIL = ColorProtector.parseColor("#4B5DC2");
        this.LLJILJIL = C0FU0.LIZJ(context);
        this.LLJILJILJ = new Path();
        this.LLJILLL = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1211));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TinySnapView);
        this.LLJIJIL = typedArrayObtainStyledAttributes.getColor(R$styleable.TinySnapView_color, ColorProtector.parseColor("#4B5DC2"));
        typedArrayObtainStyledAttributes.recycle();
        paint.setColor(this.LLJIJIL);
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(C0FU0.LIZ(C368130Ebz.LJII ? 2.0f : 1.0f));
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ny, context);
        if (numLIZJ != null) {
            paint2.setColor(numLIZJ.intValue());
        }
        paint2.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(((int) (this.LL * C360610EBv.LIZJ())) + ((this.LLJILJIL / 2) * 2), View.MeasureSpec.getSize(i2));
    }
}
