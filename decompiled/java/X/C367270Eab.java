package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.text.TextPaint;
import android.view.View;
import com.bytedance.ies.nle.editor_jni.NLENode;
import com.bytedance.ies.nle.editor_jni.NLEResourceComposite;
import com.bytedance.ies.nle.editor_jni.NLESegmentComposite;
import com.bytedance.ies.nle.editor_jni.NLETrackSlot;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Eab, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C367270Eab extends AbstractC368090Ebv {
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public float LLJILJILJ;
    public RectF LLJILLL;
    public float LLJJ;
    public int LLJJI;
    public int LLJJIII;
    public final Paint LLJJIJI;
    public final TextPaint LLJJIJIIJIL;
    public InterfaceC367810EbT LLJJIJIL;
    public final Rect LLJJJ;
    public final RectF LLJJJIL;
    public final RectF LLJJJJ;
    public final Path LLJJJJJIL;
    public String LLJJJJLIIL;

    @Override // X.InterfaceC368560Ecg
    public final boolean LJII() {
        return this.LLJILJIL;
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

    @Override // X.AbstractC368090Ebv
    public boolean getDrawDivider() {
        return this.LLJIJIL;
    }

    public final InterfaceC367810EbT getLabelPainter$editor_trackpanel_release() {
        return this.LLJJIJIL;
    }

    public final String getText() {
        return this.LLJJJJLIIL;
    }

    @Override // X.AbstractC368090Ebv
    public float getTimelineScale() {
        return this.LLJJ;
    }

    public C367270Eab(Context context) {
        super(context, null, 0);
        this.LLJIJIL = true;
        this.LLJILLL = new RectF();
        this.LLJJ = C360610EBv.LIZJ();
        this.LLJJI = -4935681;
        this.LLJJIII = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8));
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        this.LLJJIJI = paint;
        TextPaint textPaint = new TextPaint();
        textPaint.setColor(-1);
        textPaint.setAntiAlias(true);
        textPaint.setTextSize(C418440Gaw.LIZIZ(12));
        textPaint.setStrokeWidth(C0FU0.LIZ(1.0f));
        textPaint.setStyle(Paint.Style.FILL);
        this.LLJJIJIIJIL = textPaint;
        this.LLJJJ = new Rect();
        this.LLJJJIL = new RectF();
        this.LLJJJJ = new RectF();
        this.LLJJJJJIL = new Path();
        this.LLJJJJLIIL = "";
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public final void LJI(Canvas canvas) {
        RectF rectF;
        int scrollX;
        View view;
        canvas.getClipBounds(this.LLJJJ);
        setBgRadius(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        Rect rect = this.LLJJJ;
        int i = rect.left;
        int i2 = C367650EbD.LLILZLL;
        int i3 = (int) (C368640Eco.LJJIL / 2);
        int i4 = (rect.right - i2) + i3;
        float f = (i + i2) - i3;
        Rect rect2 = this.LLJJJ;
        RectF rectF2 = new RectF(f, rect2.top, i4, rect2.bottom);
        this.LLJJJJJIL.reset();
        this.LLJJJJJIL.addRect(rectF2, Path.Direction.CCW);
        canvas.clipPath(this.LLJJJJJIL);
        this.LLJJIJI.setColor(getBgColor());
        RectF rectF3 = this.LLJJJIL;
        Rect rect3 = this.LLJJJ;
        rectF3.set(rect3.left, rect3.top, rect3.right, rect3.bottom);
        this.LLJJJJ.set(0.0f, 0.0f, getClipRectF().right - getClipRectF().left, getClipRectF().bottom - getClipRectF().top);
        if (!this.LLJILJIL) {
            rectF = this.LLJJJIL;
        } else {
            rectF = this.LLJJJJ;
        }
        if (rectF.width() > 0.0f && rectF.height() > 0.0f) {
            canvas.drawRoundRect(rectF, getBgRadius(), getBgRadius(), this.LLJJIJI);
            NLETrackSlot nleTrackSlot$editor_trackpanel_release = getNleTrackSlot$editor_trackpanel_release();
            if (nleTrackSlot$editor_trackpanel_release != null) {
                Object parent = getParent();
                if ((parent instanceof C368630Ecn) && (view = (View) parent) != null) {
                    scrollX = view.getScrollX();
                } else {
                    scrollX = 0;
                }
                InterfaceC367810EbT interfaceC367810EbT = this.LLJJIJIL;
                if (interfaceC367810EbT != null) {
                    interfaceC367810EbT.LIZIZ(this, nleTrackSlot$editor_trackpanel_release, this.LLJJJIL, canvas, scrollX, 0L);
                }
            }
            super.LJI(canvas);
        }
    }

    @Override // X.AbstractC368090Ebv, android.view.View
    public final void onDraw(Canvas canvas) {
        LJI(canvas);
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
        this.LLJJIJIL = interfaceC367810EbT;
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setSegment(NLETrackSlot nLETrackSlot) {
        String name;
        NLEResourceComposite compositeResource;
        NLENode compositeNode;
        setNleTrackSlot$editor_trackpanel_release(nLETrackSlot);
        NLESegmentComposite nLESegmentCompositeDynamicCast = NLESegmentComposite.dynamicCast(nLETrackSlot.getMainSegment());
        if (nLESegmentCompositeDynamicCast != null && (compositeResource = nLESegmentCompositeDynamicCast.getCompositeResource()) != null && (compositeNode = compositeResource.getCompositeNode()) != null) {
            name = compositeNode.getName();
        } else {
            name = null;
        }
        if (!C123100dR.LIZ(name)) {
            name = "Lyric";
        }
        setText(name);
    }

    public final void setText(String str) {
        if (!Intrinsics.LJFF(str, this.LLJJJJLIIL)) {
            this.LLJJJJLIIL = str;
            invalidate();
        }
    }

    @Override // X.AbstractC368090Ebv, X.InterfaceC368560Ecg
    public void setTimelineScale(float f) {
        this.LLJJ = f;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.LLJJIJIIJIL.setTextSize(C0FU0.LIZ(10.0f));
        int iLIZ = C0FU0.LIZ(8.0f);
        C369030EdR.LIZJ(this, iLIZ, 0, iLIZ, 0);
    }
}
