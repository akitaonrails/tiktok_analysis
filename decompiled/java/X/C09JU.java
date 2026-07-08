package X;

import android.graphics.drawable.GradientDrawable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09JU, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.ProTemplateEffectViewHolderV2$trySetupGradientBg$2$1", f = "ProTemplateEffectViewHolderV2.kt", l = {}, m = "invokeSuspend")
public final class C09JU extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1636710sh3 LL;
    public final /* synthetic */ int LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09JU(C1636710sh3 c1636710sh3, int i, InterfaceC1364105Vn<? super C09JU> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1636710sh3;
        this.LLILLJJLI = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09JU(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProTemplateEffectViewHolderV2@2f9.trySetupGradientBg$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1662850tND c1662850tND = this.LL.LLILZIL;
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColors(new int[]{this.LLILLJJLI, 0});
        gradientDrawable.setOrientation(GradientDrawable.Orientation.BOTTOM_TOP);
        c1662850tND.setGradientBgDrawable(gradientDrawable);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProTemplateEffectViewHolderV2@2f9.trySetupGradientBg$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
