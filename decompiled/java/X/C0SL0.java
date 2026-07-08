package X;

import android.graphics.Rect;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SL0, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SL0 extends C09AY implements Function1<C0SL3, C0SL3> {
    public final /* synthetic */ C259800zU<ImageView.ScaleType> LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C259800zU<Rect> LLILZ;
    public final /* synthetic */ C259800zU<Rect> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0SL0(C259800zU<ImageView.ScaleType> c259800zU, int i, int i2, C259800zU<Rect> c259800zU2, C259800zU<Rect> c259800zU3) {
        super(1);
        this.LL = c259800zU;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = c259800zU2;
        this.LLILZIL = c259800zU3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final C0SL3 invoke(C0SL3 c0sl3) {
        C0SL3 c0sl32 = c0sl3;
        ImageView.ScaleType scaleType = this.LL.element;
        if (scaleType == null) {
            C0SL3 c0sl33 = c0sl32.LJIIL;
            if (c0sl33 == null) {
                c0sl33 = c0sl32;
            }
            scaleType = c0sl33.LIZ;
        }
        int i = this.LLILLJJLI;
        float f = i / this.LLILLL;
        if (c0sl32.LIZJ == i && c0sl32.LIZIZ == f && scaleType == c0sl32.LIZ && Intrinsics.LJFF(c0sl32.LJ, this.LLILZ.element) && Intrinsics.LJFF(c0sl32.LJI, this.LLILZIL.element)) {
            return null;
        }
        C0SL3 c0sl34 = c0sl32.LJIIL;
        if (c0sl34 == null) {
            c0sl34 = c0sl32;
        }
        return C0SL3.LIZ(c0sl32, scaleType, f, this.LLILLJJLI, this.LLILZ.element, this.LLILZIL.element, c0sl34, 12200);
    }
}
