package X;

import com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01yp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.bytedance.android.live.effect.beauty.data.LiveSmallItemBeautyViewModel$clearAndRetry$1", f = "LiveSmallItemBeautyViewModel.kt", l = {}, m = "invokeSuspend")
public final class C510501yp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LiveEffect LL;
    public final /* synthetic */ LiveSmallItemBeautyViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C510501yp(LiveEffect liveEffect, LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel, InterfaceC1364105Vn<? super C510501yp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = liveEffect;
        this.LLILLJJLI = liveSmallItemBeautyViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C510501yp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveSmallItemBeautyViewModel@ff2.clearAndRetry$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        LiveEffect liveEffect = this.LL;
        if (liveEffect != null) {
            LiveSmallItemBeautyViewModel liveSmallItemBeautyViewModel = this.LLILLJJLI;
            C0UA1.LIZ().LJIILLIIL(liveEffect);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(liveEffect.getEffectId());
            sbLIZ.append(", ");
            sbLIZ.append(liveEffect.getFilePath());
            C20441214yg.LIZIZ("EffectMonitor#loadfail", C2188811AlT.LIZIZ(sbLIZ));
            C0VSJ c0vsj = new C0VSJ(liveEffect.getFilePath());
            liveSmallItemBeautyViewModel.getClass();
            LiveSmallItemBeautyViewModel.GQ2(c0vsj);
            liveSmallItemBeautyViewModel.LLILZ.LJIIJJI(liveEffect);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveSmallItemBeautyViewModel@ff2.clearAndRetry$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
