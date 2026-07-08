package X;

import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tsr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.multiguestv3.main.play.common.PlayEffectHelper$fetchSingleEffect$2$2", f = "PlayEffectHelper.kt", l = {}, m = "invokeSuspend")
public final class C760790Tsr extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ List<LiveEffect> LLILLJJLI;
    public final /* synthetic */ InterfaceC760840Tsw LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C760790Tsr(String str, List<? extends LiveEffect> list, InterfaceC760840Tsw interfaceC760840Tsw, InterfaceC1364105Vn<? super C760790Tsr> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = list;
        this.LLILLL = interfaceC760840Tsw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C760790Tsr(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PlayEffectHelper@5c03.fetchSingleEffect$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C01GW c01gw = C762030Tur.LIZ;
        C762030Tur.LIZ((LiveEffect) C13LP.LJJJLL(this.LLILLJJLI), this.LL);
        this.LLILLL.LIZ((LiveEffect) C13LP.LJJJLL(this.LLILLJJLI));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PlayEffectHelper@5c03.fetchSingleEffect$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
