package X;

import android.graphics.Canvas;
import android.graphics.RectF;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0f5s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final /* synthetic */ class C1113940f5s extends C2217421BqW implements Function2<Canvas, RectF, Unit> {
    public C1113940f5s(Object obj) {
        super(2, obj, C1113930f5r.class, "onPreDrawIcon", "onPreDrawIcon(Landroid/graphics/Canvas;Landroid/graphics/RectF;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Canvas canvas, RectF rectF) {
        ((C1113930f5r) this.receiver).LJIILLIIL(canvas, rectF);
        return Unit.LIZ;
    }
}
