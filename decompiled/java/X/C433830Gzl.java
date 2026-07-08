package X;

import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import com.bytedance.fly_main_color.FlyMainColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gzl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.nimblecard.tako.element.image.NimblePaletteCover$updatePaletteView$1", f = "NimblePaletteCover.kt", l = {118}, m = "invokeSuspend")
public final class C433830Gzl extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Bitmap LLILLJJLI;
    public final /* synthetic */ C433850Gzn LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433830Gzl(Bitmap bitmap, C433850Gzn c433850Gzn, InterfaceC1364105Vn<? super C433830Gzl> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = bitmap;
        this.LLILLL = c433850Gzn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433830Gzl(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        C1C7U.LIZ("NimblePaletteCover@9f0.updatePaletteView$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(this.LLILLJJLI, null));
            C433850Gzn c433850Gzn = this.LLILLL;
            c204674156yLIZ.LJFF(c433850Gzn.getMergingTolerance());
            c204674156yLIZ.LJI(c433850Gzn.getLightnessAddition());
            c204674156yLIZ.LJ(c433850Gzn.getChromaFrom(), c433850Gzn.getChromaTo(), c433850Gzn.getLightnessFrom(), c433850Gzn.getLightnessTo(), c433850Gzn.getStrategyThreshold());
            Integer numLIZIZ = c204674156yLIZ.LIZIZ();
            if (numLIZIZ != null) {
                iIntValue = numLIZIZ.intValue();
            } else {
                iIntValue = 0;
            }
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, this.LLILLL.getGradientHeight(), new int[]{0, iIntValue}, (float[]) null, Shader.TileMode.CLAMP);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RectShape());
            shapeDrawable.getPaint().setShader(linearGradient);
            C1DFH c1dfh = C0PEM.LIZ;
            AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
            C433840Gzm c433840Gzm = new C433840Gzm(this.LLILLL, shapeDrawable, iIntValue, null);
            this.LL = 1;
            if (C23250099c.LJI(this, abstractC2238408pq, c433840Gzm) == objLJFF) {
                C1C7U.LIZIZ("NimblePaletteCover@9f0.updatePaletteView$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("NimblePaletteCover@9f0.updatePaletteView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
