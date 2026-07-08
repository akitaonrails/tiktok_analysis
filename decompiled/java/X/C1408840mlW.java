package X;

import com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mlW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.sticker.panel.info.EffectInfoViewModel$emitEvent$1", f = "EffectInfoViewModel.kt", l = {195}, m = "invokeSuspend")
public final class C1408840mlW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ EffectInfoViewModel LLILLJJLI;
    public final /* synthetic */ AbstractC1638990skj LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408840mlW(EffectInfoViewModel effectInfoViewModel, AbstractC1638990skj abstractC1638990skj, InterfaceC1364105Vn<? super C1408840mlW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = effectInfoViewModel;
        this.LLILLL = abstractC1638990skj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408840mlW(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EffectInfoViewModel@79fd.emitEvent$1");
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
            C05YC<AbstractC1638990skj> c05yc = this.LLILLJJLI.LLJILLL;
            AbstractC1638990skj abstractC1638990skj = this.LLILLL;
            this.LL = 1;
            if (c05yc.emit(abstractC1638990skj, this) == objLJFF) {
                C1C7U.LIZIZ("EffectInfoViewModel@79fd.emitEvent$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EffectInfoViewModel@79fd.emitEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
