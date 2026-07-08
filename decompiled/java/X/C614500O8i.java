package X;

import Y.AgS200S0200000_9;
import com.ss.android.ugc.aweme.services.external.ability.IAVEffectService;
import com.ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.Collections;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0O8i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.presenter.StickerPropDetailHelperKt$collectSticker$1", f = "StickerPropDetailHelper.kt", l = {44}, m = "invokeSuspend")
public final class C614500O8i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IAVEffectService.EffectPlatformLoader LLILLJJLI;
    public final /* synthetic */ NewFaceStickerBean LLILLL;
    public final /* synthetic */ InterfaceC614550O8n LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C614500O8i(IAVEffectService.EffectPlatformLoader effectPlatformLoader, NewFaceStickerBean newFaceStickerBean, InterfaceC614550O8n interfaceC614550O8n, InterfaceC1364105Vn<? super C614500O8i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectPlatformLoader;
        this.LLILLL = newFaceStickerBean;
        this.LLILZ = interfaceC614550O8n;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C614500O8i(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerPropDetailHelperKt@9b29.collectSticker$1");
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
            C613950O6f c613950O6fLIZ = C613940O6e.LIZ();
            IAVEffectService.EffectPlatformLoader effectPlatformLoader = this.LLILLJJLI;
            NewFaceStickerBean newFaceStickerBean = this.LLILLL;
            C613960O6g c613960O6gLIZ = c613950O6fLIZ.LIZ(new C614530O8l(effectPlatformLoader, newFaceStickerBean.id, newFaceStickerBean.isFavorite));
            Collections.singletonList(this.LLILLL.id);
            C0O7F.LJFF(c613960O6gLIZ, new C614520O8k());
            InterfaceC346201Wa interfaceC346201WaLIZIZ = c613960O6gLIZ.LIZIZ();
            AgS200S0200000_9 agS200S0200000_9 = new AgS200S0200000_9(this.LLILZ, this.LLILLL, 13);
            this.LL = 1;
            if (interfaceC346201WaLIZIZ.collect(agS200S0200000_9, this) == objLJFF) {
                C1C7U.LIZIZ("StickerPropDetailHelperKt@9b29.collectSticker$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerPropDetailHelperKt@9b29.collectSticker$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
