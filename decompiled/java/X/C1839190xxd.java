package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.bytedance.android.livesdk.model.SMBBoardColorPreset;

/* JADX INFO: renamed from: X.0xxd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1839190xxd extends View {
    public int LL;
    public boolean LLILLJJLI;
    public SMBBoardColorPreset LLILLL;
    public final int LLILZ;
    public final Paint LLILZIL;
    public final Paint LLILZLL;

    public final int getColor() {
        return this.LL;
    }

    public final SMBBoardColorPreset getSmbBoardColorPreset() {
        return this.LLILLL;
    }

    public C1839190xxd(Context context) {
        super(context, null);
        this.LL = -1;
        this.LLILZ = 6;
        Paint paint = new Paint();
        paint.setColor(this.LL);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        float f = 6;
        paint.setStrokeWidth(f);
        this.LLILZIL = paint;
        Paint paint2 = new Paint();
        paint2.setColor(-1);
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(f);
        this.LLILZLL = paint2;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float width = getWidth() / 2;
        canvas.drawCircle(width, width, (r3 - this.LLILZ) - 4, this.LLILZLL);
        canvas.drawCircle(width, width, r3 - (this.LLILZ * 2), this.LLILZIL);
    }

    public final void setSelection(boolean z) {
        this.LLILLJJLI = z;
    }

    public final void setSmbBoardColorPreset(SMBBoardColorPreset sMBBoardColorPreset) {
        this.LLILLL = sMBBoardColorPreset;
    }
}
