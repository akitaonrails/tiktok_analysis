package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mlV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel$1", f = "EffectInfoViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1408830mlV extends C09AX implements Function2<AbstractC1638990skj, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ EffectInfoViewModel LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408830mlV(EffectInfoViewModel effectInfoViewModel, InterfaceC1364105Vn<? super C1408830mlV> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectInfoViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1408830mlV c1408830mlV = new C1408830mlV(this.LLILLJJLI, interfaceC1364105Vn);
        c1408830mlV.LL = obj;
        return c1408830mlV;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectInfoViewModel@79fd.<init>$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LLILLJJLI.BR2((AbstractC1638990skj) this.LL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectInfoViewModel@79fd.<init>$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(AbstractC1638990skj abstractC1638990skj, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(abstractC1638990skj, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
