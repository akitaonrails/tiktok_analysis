package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0UIR, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.sticker.StickerMonitorEffectHelper$applyMonitorEffect$1$2$1", f = "StickerMonitorEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C0UIR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveEffect LL;
    public final /* synthetic */ Runnable LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0UIR(LiveEffect liveEffect, Runnable runnable, InterfaceC1364105Vn<? super C0UIR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveEffect;
        this.LLILLJJLI = runnable;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0UIR(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StickerMonitorEffectHelper@a9e4.applyMonitorEffect$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0UIQ.LIZ().LJIIIIZZ(this.LL, "gift_monitor");
        C0UIT c0uit = C0UIT.LIZ;
        long effectId = this.LL.getEffectId();
        c0uit.getClass();
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_sticker_monitor_effect_apply");
        C0UIT.LIZ(c474500IjALIZ, effectId);
        c474500IjALIZ.LIZ();
        this.LLILLJJLI.run();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("StickerMonitorEffectHelper@a9e4.applyMonitorEffect$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
