package X;

import android.content.Context;
import android.graphics.Paint;
import android.util.TypedValue;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: X.1204, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1204 extends AnonymousClass1205 {
    public long LLJ;
    public final Paint LLJI;
    public float LLJIJIL;
    public final Paint LLJILJIL;
    public final float LLJILJILJ;
    public final float LLJILLL;
    public final LinkedList<Object> LLJJ;
    public final LinkedList<Float> LLJJI;
    public final HashMap<Integer, Float> LLJJIII;
    public boolean LLJJIJI;
    public int LLJJIJIIJIL;
    public final LinkedList<Integer> LLJJIJIL;
    public int LLJJJ;
    public float LLJJJIL;

    @Override // X.AnonymousClass1205
    public final float LIZIZ() {
        return ((this.LLJ * 1.0f) / getScaleRuler()) + (this.LLJILJILJ * 2);
    }

    public final int getXOffset() {
        return (int) (-this.LLJILJILJ);
    }

    @Override // X.AnonymousClass1205
    public final void LIZJ() {
        super.LIZJ();
        this.LLJJJ = (int) Math.ceil((getHopeWidth() - (2 * this.LLJILJILJ)) / getParentWidth());
        LIZLLL(true);
    }

    @Override // X.AnonymousClass1205
    public final float LIZ() {
        return this.LLJILLL;
    }

    public final void LIZLLL(boolean z) {
        int iFloor = (int) Math.floor(((getParentWidth() / 2) - getXOnScreen()) / getParentWidth());
        if (this.LLJJIJIIJIL != iFloor || z) {
            this.LLJJIJIIJIL = iFloor;
            this.LLJJIJIL.clear();
            int i = this.LLJJIJIIJIL;
            if (i - 1 >= 0) {
                this.LLJJIJIL.add(Integer.valueOf(i - 1));
            }
            this.LLJJIJIL.add(Integer.valueOf(this.LLJJIJIIJIL));
            int i2 = this.LLJJIJIIJIL;
            if (i2 + 1 < this.LLJJJ && i2 + 1 >= 0) {
                this.LLJJIJIL.add(Integer.valueOf(i2 + 1));
            }
            invalidate();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x015c  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r21) {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1204.onDraw(android.graphics.Canvas):void");
    }

    public final void setSortAnimF(float f) {
        this.LLJJJIL = f;
        invalidate();
    }

    public final void setTotalProgress(long j) {
        this.LLJ = j;
        invalidate();
    }

    public AnonymousClass1204(Context context, InterfaceC21620319jN interfaceC21620319jN) {
        super(context, interfaceC21620319jN);
        this.LLJ = 300000L;
        Paint paint = new Paint();
        this.LLJI = paint;
        Paint paint2 = new Paint();
        this.LLJILJIL = paint2;
        this.LLJILJILJ = C0T83.LIZ(20.0f, getContext());
        this.LLJILLL = C0T83.LIZ(16.0f, getContext());
        this.LLJJ = new LinkedList<>();
        this.LLJJI = new LinkedList<>();
        this.LLJJIII = new HashMap<>();
        this.LLJJIJI = true;
        this.LLJJIJIIJIL = -9999;
        this.LLJJIJIL = new LinkedList<>();
        paint.setColor(-16777216);
        paint.setAntiAlias(true);
        paint.setTextSize(TypedValue.applyDimension(2, 10.0f, getContext().getResources().getDisplayMetrics()));
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setStrokeWidth(C0T83.LIZ(2.0f, getContext()));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint2.setAlpha(127);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension((int) getHopeWidth(), (int) getHopeHeight());
    }
}
