package X;

import androidx.fragment.app.Fragment;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.prop.activity.EffectMobileTplEditV2Activity;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.MobileEffectData;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0vKv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.fragment.ame.StickerPropEditHelperKt$launchNewEffectEditScreen$1$1", f = "StickerPropEditHelper.kt", l = {}, m = "invokeSuspend")
public final class C1738310vKv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Fragment LL;
    public final /* synthetic */ NewFaceStickerBean LLILLJJLI;
    public final /* synthetic */ Effect LLILLL;
    public final /* synthetic */ Function0<Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1738310vKv(Fragment fragment, NewFaceStickerBean newFaceStickerBean, Effect effect, Function0<Unit> function0, InterfaceC1364105Vn<? super C1738310vKv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = fragment;
        this.LLILLJJLI = newFaceStickerBean;
        this.LLILLL = effect;
        this.LLILZ = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1738310vKv(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerPropEditHelperKt@fc16.launchNewEffectEditScreen$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = EffectMobileTplEditV2Activity._pnsPageId;
        Fragment fragment = this.LL;
        NewFaceStickerBean newFaceStickerBean = this.LLILLJJLI;
        String sdkExtra = this.LLILLL.getSdkExtra();
        C1776030wJl c1776030wJl = new C1776030wJl(this.LLILZ, 1);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(fragment, "//effect-mobile-template/edit_v2");
        smartRouteBuildRoute.withParam("effect_init_data", new MobileEffectData(EnumC1733870vDl.EDIT, null, null, null, newFaceStickerBean, null, null, null, null, false, null, null, 4078));
        smartRouteBuildRoute.withParam("ENTER_FROM", "prop_page");
        smartRouteBuildRoute.withParam("effect_sdk_extra", sdkExtra);
        smartRouteBuildRoute.open(0, c1776030wJl);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerPropEditHelperKt@fc16.launchNewEffectEditScreen$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
