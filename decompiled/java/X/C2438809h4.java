package X;

import android.graphics.Bitmap;
import com.bytedance.fly_main_color.FlyMainColor;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09h4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.adapter.widget.survey.LiveSurveyWidgetV2$fillBackgroundColor$2$dynamicColor$1", f = "LiveSurveyWidgetV2.kt", l = {}, m = "invokeSuspend")
public final class C2438809h4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public final /* synthetic */ Bitmap LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2438809h4(Bitmap bitmap, int i, int i2, int i3, int i4, InterfaceC1364105Vn<? super C2438809h4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = bitmap;
        this.LLILLJJLI = i;
        this.LLILLL = i2;
        this.LLILZ = i3;
        this.LLILZIL = i4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2438809h4(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSurveyWidgetV2@ad00.fillBackgroundColor$2$dynamicColor$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Integer numLIZIZ = null;
        if (this.LL != null) {
            C2439109h7 c2439109h7 = new C2439109h7(this.LL, null);
            c2439109h7.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL);
            C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(c2439109h7);
            c204674156yLIZ.LJFF(4.0f);
            c204674156yLIZ.LJ(0.0f, 0.4f, 0.0f, 0.5f, 0.0f);
            numLIZIZ = c204674156yLIZ.LIZIZ();
        }
        C1C7U.LIZIZ("LiveSurveyWidgetV2@ad00.fillBackgroundColor$2$dynamicColor$1");
        return numLIZIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
