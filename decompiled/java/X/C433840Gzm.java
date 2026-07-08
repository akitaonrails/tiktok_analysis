package X;

import android.graphics.drawable.ShapeDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gzm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nimblecard.tako.element.image.NimblePaletteCover$updatePaletteView$1$1", f = "NimblePaletteCover.kt", l = {}, m = "invokeSuspend")
public final class C433840Gzm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C433850Gzn LL;
    public final /* synthetic */ ShapeDrawable LLILLJJLI;
    public final /* synthetic */ int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433840Gzm(C433850Gzn c433850Gzn, ShapeDrawable shapeDrawable, int i, InterfaceC1364105Vn<? super C433840Gzm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c433850Gzn;
        this.LLILLJJLI = shapeDrawable;
        this.LLILLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433840Gzm(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NimblePaletteCover@9f0.updatePaletteView$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.setBackground(null);
        this.LL.getGradientView().setBackground(this.LLILLJJLI);
        this.LL.getPaletteView().setBackgroundColor(this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NimblePaletteCover@9f0.updatePaletteView$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
