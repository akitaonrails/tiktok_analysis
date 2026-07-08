package X;

import android.content.Context;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;

/* JADX INFO: renamed from: X.0H7K, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public class C0H7K extends C1860100yVM {
    public int LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public final Paint LLJJI;

    public C0H7K LJJJJ() {
        return this;
    }

    @Override // X.C1860100yVM, X.InterfaceC1860050yVH
    public /* bridge */ /* synthetic */ TextView LJIJI() {
        LJJJJ();
        return this;
    }

    @Override // X.C1860100yVM
    public /* bridge */ /* synthetic */ C1860100yVM LJJJI() {
        LJJJJ();
        return this;
    }

    public boolean getDrawLine() {
        return this.LLJILLL;
    }

    public int getLineColor() {
        return this.LLJILJILJ;
    }

    public boolean getUseSubscribedColor() {
        return this.LLJJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01c7  */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onDraw(android.graphics.Canvas r27) {
        /*
            Method dump skipped, instruction units count: 485
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H7K.onDraw(android.graphics.Canvas):void");
    }

    public void setDrawLine(boolean z) {
        this.LLJILLL = z;
    }

    public void setLineColor(int i) {
        this.LLJILJILJ = i;
    }

    public void setLineWeight(float f) {
        this.LLJJI.setStrokeWidth(f);
    }

    public void setUseSubscribedColor(boolean z) {
        this.LLJJ = z;
    }

    public C0H7K(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C0H7K(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LLJJI = new Paint();
    }
}
