package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLESegment;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposerFilter;
import com.bytedance.ies.nle.editor_jni.NLESegmentEffect;
import com.bytedance.ies.nle.editor_jni.NLESegmentVideoAnimation;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.zhiliaoapp.musically.R;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.AFwS191S0000000_5;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eb4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367560Eb4 extends AbstractC368090Ebv implements InterfaceC497601wk {
    public static final int LLJL;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public RectF LLJILLL;
    public float LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final Paint LLJJIJI;
    public final TextPaint LLJJIJIIJIL;
    public final C01GW LLJJIJIL;
    public InterfaceC367590Eb7 LLJJJ;
    public InterfaceC367810EbT LLJJJIL;
    public final Rect LLJJJJ;
    public final Path LLJJJJJIL;
    public int LLJJJJLIIL;
    public final C1DFB LLJJL;
    public String LLJJLIIIJLLLLLLLZ;

    static {
        ColorProtector.parseColor("#5E76EE");
        ColorProtector.parseColor("#ECC66B");
        ColorProtector.parseColor("#AB6D36");
        ColorProtector.parseColor("#C4425B");
        LLJL = ColorProtector.parseColor("#EBAED8");
        ColorProtector.parseColor("#9f76c6");
        ColorProtector.parseColor("#6b7cca");
    }

    private final C367540Eb2 getOldTrackViewModel() {
        return (C367540Eb2) this.LLJJIJIL.getValue();
    }

    private final InterfaceC367590Eb7 getTrackViewModel() {
        InterfaceC367590Eb7 interfaceC367590Eb7 = this.LLJJJ;
        return interfaceC367590Eb7 == null ? getOldTrackViewModel() : interfaceC367590Eb7;
    }

    @Override // X.InterfaceC368560Ecg
    public final boolean LJII() {
        return this.LLJILJIL;
    }

    public final int getApplyType$editor_trackpanel_release() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public int getBgColor() {
        return this.LLJJI;
    }

    @Override // X.AbstractC368090Ebv
    public int getBgRadius() {
        return this.LLJJIII;
    }

    @Override // X.AbstractC368090Ebv
    public float getClipLength() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public RectF getClipRectF() {
        return this.LLJILLL;
    }

    @Override // X.InterfaceC497601wk
    public CoroutineContext getCoroutineContext() {
        return this.LLJJL;
    }

    @Override // X.AbstractC368090Ebv
    public boolean getDrawDivider() {
        return this.LLJIJIL;
    }

    public final InterfaceC367810EbT getLabelPainter$editor_trackpanel_release() {
        return this.LLJJJIL;
    }

    public final String getText() {
        return this.LLJJLIIIJLLLLLLLZ;
    }

    @Override // X.AbstractC368090Ebv
    public float getTimelineScale() {
        return this.LLJJ;
    }

    public final InterfaceC367590Eb7 getTrackViewModelCompat() {
        return this.LLJJJ;
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    public C367560Eb4(C19EG c19eg) {
        super(c19eg, null, 0);
        this.LLJIJIL = true;
        this.LLJILLL = new RectF();
        this.LLJJ = C360610EBv.LIZJ();
        this.LLJJI = LLJL;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LLJJIJI = paint;
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(C367580Eb6.LIZ);
        textPaint.setStrokeWidth(C0FU0.LIZ(1.0f));
        textPaint.setStyle(Paint.Style.FILL);
        this.LLJJIJIIJIL = textPaint;
        this.LLJJIJIL = C452501pT.LIZIZ(AFwS191S0000000_5.get$arr$(309));
        final Context context = getContext();
        this.LLJJJIL = new InterfaceC367810EbT(this, context) { // from class: X.0Eb5
            public final C367560Eb4 LIZ;
            public final Context LIZIZ;
            public final C367840EbW LIZJ;
            public final Rect LIZLLL = new Rect();
            public final TextPaint LJ;

            @Override // X.InterfaceC367810EbT
            public final void LIZ(C367200EaU c367200EaU) {
            }

            {
                this.LIZ = this;
                this.LIZIZ = context;
                this.LIZJ = new C367840EbW(this);
                TextPaint textPaint2 = new TextPaint();
                textPaint2.setColor(-1);
                textPaint2.setAntiAlias(true);
                textPaint2.setTextSize(C0FU0.LIZ(12.0f));
                textPaint2.setStrokeWidth(C0FU0.LIZ(1.0f));
                textPaint2.setStyle(Paint.Style.FILL);
                this.LJ = textPaint2;
            }

            @Override // X.InterfaceC367810EbT
            public final void LIZIZ(InterfaceC368560Ecg interfaceC368560Ecg, NLETrackSlot nLETrackSlot, RectF rectF, Canvas canvas, int i, long j) {
                int applyType$editor_trackpanel_release = this.LIZ.getApplyType$editor_trackpanel_release();
                if (applyType$editor_trackpanel_release != 0) {
                    if (applyType$editor_trackpanel_release != 1) {
                        if (applyType$editor_trackpanel_release == 2) {
                            this.LIZJ.LIZ(canvas, this.LIZ.getResources().getString(2131826398), this.LIZ.getBgColor());
                        }
                    } else {
                        this.LIZJ.LIZ(canvas, this.LIZ.getResources().getString(2131840059), this.LIZ.getBgColor());
                    }
                } else {
                    this.LIZJ.LIZ(canvas, this.LIZ.getResources().getString(2131837005), this.LIZ.getBgColor());
                }
                this.LJ.setTextSize(C367650EbD.LLJILJIL);
                this.LJ.setColor(C446980Hfs.LIZ(this.LIZIZ, R.color.m8));
                this.LJ.getTextBounds(this.LIZ.getText(), 0, this.LIZ.getText().length(), this.LIZLLL);
                canvas.drawText(this.LIZ.getText(), this.LIZJ.LJII + C367650EbD.LLJI + C367650EbD.LLIZ, (this.LIZ.getMeasuredHeight() / 2) + ((Math.abs(this.LJ.ascent()) - this.LJ.descent()) / 2) + C0FU0.LIZ(1.0f), this.LJ);
            }
        };
        new Path();
        C0FU0.LIZ(2.0f);
        this.LLJJJJ = new Rect();
        this.LLJJJJJIL = new Path();
        this.LLJJJJLIIL = -1;
        this.LLJJL = C0PEM.LIZJ;
        this.LLJJLIIIJLLLLLLLZ = "";
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public final void LJI(Canvas canvas) {
        int bgColor;
        int scrollX;
        View view;
        canvas.getClipBounds(this.LLJJJJ);
        Paint paint = this.LLJJIJI;
        Typeface typeface = C368130Ebz.LIZ;
        Integer numLIZIZ = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.e2));
        if (numLIZIZ != null) {
            bgColor = numLIZIZ.intValue();
        } else {
            bgColor = getBgColor();
        }
        paint.setColor(bgColor);
        setBgRadius(LJIIJ(getTrackViewModel().LIZIZ()));
        canvas.drawRoundRect(new RectF(this.LLJJJJ), getBgRadius(), getBgRadius(), this.LLJJIJI);
        if (!this.LLJILJIL) {
            Rect rect = this.LLJJJJ;
            int i = rect.left;
            int i2 = rect.right - C367650EbD.LLILZLL;
            Rect rect2 = this.LLJJJJ;
            RectF rectF = new RectF(i + r0, rect2.top, i2, rect2.bottom);
            this.LLJJJJJIL.reset();
            this.LLJJJJJIL.addRoundRect(rectF, getBgRadius(), getBgRadius(), Path.Direction.CCW);
            canvas.clipPath(this.LLJJJJJIL);
        }
        this.LLJJIJI.setColor(getBgColor());
        if (getBgRadius() > 0) {
            canvas.drawRoundRect(new RectF(this.LLJJJJ), getBgRadius(), getBgRadius(), this.LLJJIJI);
        } else {
            canvas.drawRect(this.LLJJJJ, this.LLJJIJI);
        }
        NLETrackSlot nleTrackSlot$editor_trackpanel_release = getNleTrackSlot$editor_trackpanel_release();
        if (nleTrackSlot$editor_trackpanel_release != null) {
            Object parent = getParent();
            if ((parent instanceof C368630Ecn) && (view = (View) parent) != null) {
                scrollX = view.getScrollX();
            } else {
                scrollX = 0;
            }
            this.LLJJJIL.LIZIZ(this, nleTrackSlot$editor_trackpanel_release, new RectF(this.LLJJJJ), canvas, scrollX, 0L);
        }
        super.LJI(canvas);
    }

    @Override // X.AbstractC368090Ebv, android.view.View
    public final void onDraw(Canvas canvas) {
        if (!this.LLJILJIL) {
            LJI(canvas);
        }
    }

    public final void setApplyType$editor_trackpanel_release(int i) {
        this.LLJJJJLIIL = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setBgColor(int i) {
        this.LLJJI = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setBgRadius(int i) {
        this.LLJJIII = i;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setClipLength(float f) {
        this.LLJILJILJ = f;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setClipRectF(RectF rectF) {
        this.LLJILLL = rectF;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setDrawDivider(boolean z) {
        if (this.LLJIJIL != z) {
            this.LLJIJIL = z;
            invalidate();
        }
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setItemSelected(boolean z) {
        this.LLJILJIL = z;
    }

    public final void setLabelPainter$editor_trackpanel_release(InterfaceC367810EbT interfaceC367810EbT) {
        this.LLJJJIL = interfaceC367810EbT;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setSegment(NLETrackSlot nLETrackSlot) {
        boolean z;
        boolean z2;
        setNleTrackSlot$editor_trackpanel_release(nLETrackSlot);
        Typeface typeface = C368130Ebz.LIZ;
        Integer numLIZIZ = C368130Ebz.LIZIZ(getContext(), Integer.valueOf(R.attr.bq8));
        if (numLIZIZ != null) {
            setBgColor(numLIZIZ.intValue());
        }
        NLESegment mainSegment = nLETrackSlot.getMainSegment();
        boolean z3 = true;
        if (NLESegmentEffect.dynamicCast(mainSegment) != null) {
            z = true;
        } else {
            z = false;
        }
        if (NLESegmentComposerFilter.dynamicCast((NLENode) mainSegment) != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (NLESegmentVideoAnimation.dynamicCast(mainSegment) == null) {
            z3 = false;
        }
        if (z || z2 || z3) {
            setText(mainSegment.getResource().getResourceName());
        }
    }

    public final void setText(String str) {
        if (!Intrinsics.LJFF(str, this.LLJJLIIIJLLLLLLLZ)) {
            this.LLJJLIIIJLLLLLLLZ = str;
            invalidate();
        }
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setTimelineScale(float f) {
        this.LLJJ = f;
    }

    public final void setTrackViewModelCompat(InterfaceC367590Eb7 interfaceC367590Eb7) {
        this.LLJJJ = interfaceC367590Eb7;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJJIJIIJIL.setTextSize(C0FU0.LIZ(10.0f));
        int iLIZ = C0FU0.LIZ(8.0f);
        C369030EdR.LIZJ(this, iLIZ, 0, iLIZ, 0);
    }
}
