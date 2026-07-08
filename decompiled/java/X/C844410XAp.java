package X;

import com.ss.android.ugc.aweme.tako.botpage.components.easteregg.model.TakoEasterEggConfig;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0XAp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.components.easteregg.TakoEasterEggHelper$playEasterEggAnim$1", f = "TakoEasterEggHelper.kt", l = {}, m = "invokeSuspend")
public final class C844410XAp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1862030yYT LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C844410XAp(C1862030yYT c1862030yYT, InterfaceC1364105Vn<? super C844410XAp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1862030yYT;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C844410XAp(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC844400XAo interfaceC844400XAo;
        C1C7U.LIZ("TakoEasterEggHelper@9d6e.playEasterEggAnim$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<TakoEasterEggConfig> list = C844420XAq.LIZ;
        String str = this.LL.LIZJ;
        if (str != null && str.length() != 0 && (interfaceC844400XAo = C844420XAq.LIZJ) != null) {
            interfaceC844400XAo.V4(this.LL);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoEasterEggHelper@9d6e.playEasterEggAnim$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
