package X;

import com.ss.android.ugc.aweme.effect.EffectPanelViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NNp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.effect.EffectPanelViewModel$fireCachedEffectsForTab$1", f = "EffectPanelViewModel.kt", l = {}, m = "invokeSuspend")
public final class C592990NNp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ EffectPanelViewModel LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592990NNp(EffectPanelViewModel effectPanelViewModel, String str, InterfaceC1364105Vn<? super C592990NNp> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = effectPanelViewModel;
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592990NNp(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectPanelViewModel@7757.fireCachedEffectsForTab$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<C1427090nEx> list = this.LL.LLILLJJLI.get(this.LLILLJJLI);
        this.LL.LLILLJJLI.put(this.LLILLJJLI, new ArrayList());
        if (list != null) {
            EffectPanelViewModel effectPanelViewModel = this.LL;
            Iterator<C1427090nEx> it2 = list.iterator();
            while (it2.hasNext()) {
                effectPanelViewModel.vQ2(it2.next());
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectPanelViewModel@7757.fireCachedEffectsForTab$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
