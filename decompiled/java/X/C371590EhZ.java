package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0EhZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371590EhZ extends C09AY implements Function2<Canvas, Paint, Unit> {
    public final /* synthetic */ RectF LL;
    public final /* synthetic */ float LLILLJJLI;
    public final /* synthetic */ Bitmap LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C371590EhZ(float f, Bitmap bitmap, RectF rectF) {
        super(2);
        this.LL = rectF;
        this.LLILLJJLI = f;
        this.LLILLL = bitmap;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Canvas canvas, Paint paint) {
        this.LL.set(0.0f, r6.getHeight() * this.LLILLJJLI, r6.getWidth(), (r6.getHeight() * this.LLILLJJLI) + r6.getWidth());
        canvas.drawBitmap(this.LLILLL, (Rect) null, this.LL, paint);
        return Unit.LIZ;
    }
}
