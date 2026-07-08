package X;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: renamed from: X.19jE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21619419jE extends ViewGroup {
    public InterfaceC21620319jN LL;
    public float LLILLJJLI;
    public float LLILLL;
    public float LLILZ;
    public long LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public long LLIZLLLIL;

    public abstract float LIZ();

    public abstract float LIZIZ();

    public void LIZJ() {
        this.LLILLJJLI = LIZIZ();
        this.LLILLL = LIZ();
    }

    public final long getCurProgress() {
        return this.LLIZLLLIL;
    }

    public final float getHopeHeight() {
        return this.LLILLL;
    }

    public final float getHopeWidth() {
        return this.LLILLJJLI;
    }

    public final long getLevelTime() {
        return this.LLILZIL;
    }

    public final float getParentWidth() {
        return this.LLIZ;
    }

    public final InterfaceC21620319jN getRequest() {
        return this.LL;
    }

    public final float getScaleRuler() {
        return this.LLILZ;
    }

    public final float getXOnScreen() {
        return this.LLILZLL;
    }

    public final void setCurProgress(long j) {
        this.LLIZLLLIL = j;
    }

    public final void setHopeHeight(float f) {
        this.LLILLL = f;
    }

    public final void setHopeWidth(float f) {
        this.LLILLJJLI = f;
    }

    public final void setLevelTime(long j) {
        this.LLILZIL = j;
    }

    public final void setParentWidth(int i) {
        this.LLIZ = i;
        LIZJ();
    }

    public final void setRequest(InterfaceC21620319jN interfaceC21620319jN) {
        this.LL = interfaceC21620319jN;
    }

    public final void setScaleRuler(float f) {
        this.LLILZ = f;
    }

    public final void setXOnScreen(float f) {
        this.LLILZLL = f;
    }

    public final void setParentWidth(float f) {
        this.LLIZ = f;
    }

    public AbstractC21619419jE(Context context, C21618719j7 c21618719j7) {
        super(context);
        this.LL = c21618719j7;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        LIZJ();
    }
}
