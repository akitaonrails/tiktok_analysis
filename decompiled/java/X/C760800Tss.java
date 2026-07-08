package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tss, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayEffectHelper$fetchSingleEffectByServer$1$1", f = "PlayEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C760800Tss extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ InterfaceC760840Tsw LL;
    public final /* synthetic */ LiveEffect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760800Tss(InterfaceC760840Tsw interfaceC760840Tsw, LiveEffect liveEffect, InterfaceC1364105Vn<? super C760800Tss> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = interfaceC760840Tsw;
        this.LLILLJJLI = liveEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760800Tss(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayEffectHelper@5c03.fetchSingleEffectByServer$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayEffectHelper@5c03.fetchSingleEffectByServer$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
