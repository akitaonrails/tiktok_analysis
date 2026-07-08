package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0U8D, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.sticker.data.StickerEffectDynamicAdaptiveManager$updateEffectLevel$2", f = "StickerEffectDynamicAdaptiveManager.kt", l = {}, m = "invokeSuspend")
public final class C0U8D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveEffect LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0U8D(LiveEffect liveEffect, InterfaceC1364105Vn<? super C0U8D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0U8D(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerEffectDynamicAdaptiveManager@df67.updateEffectLevel$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0U8F c0u8f = C0U8F.LIZ;
        C0U8F.LIZIZ(this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerEffectDynamicAdaptiveManager@df67.updateEffectLevel$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
