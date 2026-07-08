package X;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Eha, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C371600Eha extends C09AY implements Function2<Canvas, Paint, Unit> {
    public final /* synthetic */ C118300cf LL;
    public final /* synthetic */ C118300cf LLILLJJLI;
    public final /* synthetic */ C259800zU<Path> LLILLL;
    public final /* synthetic */ InterfaceC1631620sYq<Integer, Integer, Float, Path> LLILZ;
    public final /* synthetic */ C0F4H LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C371600Eha(C118300cf c118300cf, C118300cf c118300cf2, C259800zU<Path> c259800zU, InterfaceC1631620sYq<? super Integer, ? super Integer, ? super Float, ? extends Path> interfaceC1631620sYq, C0F4H c0f4h) {
        super(2);
        this.LL = c118300cf;
        this.LLILLJJLI = c118300cf2;
        this.LLILLL = c259800zU;
        this.LLILZ = interfaceC1631620sYq;
        this.LLILZIL = c0f4h;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [T, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(Canvas canvas, Paint paint) {
        Canvas canvas2 = canvas;
        Paint paint2 = paint;
        if (canvas2.getWidth() != this.LL.element || canvas2.getHeight() != this.LLILLJJLI.element) {
            this.LLILLL.element = this.LLILZ.invoke(Integer.valueOf(canvas2.getWidth()), Integer.valueOf(canvas2.getHeight()), Float.valueOf(this.LLILZIL.getResources().getDisplayMetrics().density));
            this.LL.element = canvas2.getWidth();
            this.LLILLJJLI.element = canvas2.getHeight();
        }
        Path path = this.LLILLL.element;
        if (path != null) {
            canvas2.drawPath(path, paint2);
        }
        return Unit.LIZ;
    }
}
