package X;

import android.content.Context;
import android.util.AttributeSet;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GTW, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0GTW extends C0GTX {
    public int LLIZ;
    public int LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public float LLJILJILJ;

    @Override // X.C0GTX
    public final int LIZIZ() {
        return Math.max(this.LLJILJIL, this.LLJIJIL);
    }

    @Override // X.C0GTX
    public final int LIZJ() {
        int totalCount = getTotalCount();
        int i = totalCount - 1;
        return (this.LLJIJIL * i) + this.LLJILJIL + ((int) (i * this.LLJILJILJ)) + (0 * totalCount);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00bf  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r11) {
        /*
            Method dump skipped, instruction units count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0GTW.onDraw(android.graphics.Canvas):void");
    }

    public final void setPointColor(int i) {
        this.LLIZ = i;
    }

    public final void setPointRadius(float f) {
        this.LLJ = f;
        this.LLJIJIL = (int) (f * 2);
    }

    public final void setPointSpacing(float f) {
        this.LLJILJILJ = f;
    }

    public final void setSelectedPointColor(int i) {
        this.LLIZLLLIL = i;
    }

    public final void setSelectedPointRadius(float f) {
        this.LLJI = f;
        this.LLJILJIL = (int) (f * 2);
    }

    public C0GTW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LLIZ = R.attr.a01;
        this.LLIZLLLIL = R.attr.a00;
        this.LLJILJILJ = C418440Gaw.LIZIZ(Float.valueOf(6.0f));
        float densityDpi = (int) ((3 * getDensityDpi()) + 0.5f);
        this.LLJ = densityDpi;
        float f = 2;
        this.LLJIJIL = (int) (densityDpi * f);
        this.LLJI = densityDpi;
        this.LLJILJIL = (int) (densityDpi * f);
    }
}
