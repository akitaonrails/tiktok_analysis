package X;

import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.models.DraftEffect;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cdo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.templateeffect.effectpanel.MyEffectsViewModel$fetchNetworkData$2$2", f = "MyEffectsViewModel.kt", l = {}, m = "invokeSuspend")
public final class C318300Cdo extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ MyEffectsViewModel LL;
    public final /* synthetic */ List<DraftEffect> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C318300Cdo(MyEffectsViewModel myEffectsViewModel, List<DraftEffect> list, InterfaceC1364105Vn<? super C318300Cdo> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = myEffectsViewModel;
        this.LLILLJJLI = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C318300Cdo(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MyEffectsViewModel@4e1b.fetchNetworkData$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.GQ2(new C318330Cdr(this.LLILLJJLI), C318310Cdp.LIZ());
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MyEffectsViewModel@4e1b.fetchNetworkData$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
