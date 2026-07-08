package X;

import android.graphics.Bitmap;
import com.bytedance.fly_main_color.FlyMainColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09gr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.survey.viewhelper.BottomMaskSurveyViewHelper$showView$1$dynamicColor$1", f = "BottomMaskSurveyViewHelper.kt", l = {}, m = "invokeSuspend")
public final class C2437509gr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ C20280814Xe LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2437509gr(Bitmap bitmap, C20280814Xe c20280814Xe, InterfaceC1364105Vn<? super C2437509gr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = c20280814Xe;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2437509gr(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BottomMaskSurveyViewHelper@32a9.showView$1$dynamicColor$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Bitmap bitmap = this.LL;
        Integer numLIZIZ = null;
        if (bitmap == null) {
            C1AF0.LIZJ("BottomMaskSurveyViewHelper: bitmap is null");
        } else {
            this.LLILLJJLI.getClass();
            C2439109h7 c2439109h7 = new C2439109h7(bitmap, null);
            c2439109h7.LIZIZ(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)), bitmap.getWidth() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)), bitmap.getHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(50)));
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(c2439109h7);
            c204674156yLIZ.LJ(0.0f, 0.4f, 0.2f, 0.6f, 1.0f);
            numLIZIZ = c204674156yLIZ.LIZIZ();
        }
        C1C7U.LIZIZ("BottomMaskSurveyViewHelper@32a9.showView$1$dynamicColor$1");
        return numLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
