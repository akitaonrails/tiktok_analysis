package X;

import com.ss.android.ugc.gamora.recorder.sticker.l0;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LbB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerLogicComponent$addEffectMessageExchangeHandler$2$1", f = "RecordStickerLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C545990LbB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ l0 LL;
    public final /* synthetic */ InterfaceC1623780sMC LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C545990LbB(l0 l0Var, InterfaceC1623780sMC interfaceC1623780sMC, InterfaceC1364105Vn<? super C545990LbB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = l0Var;
        this.LLILLJJLI = interfaceC1623780sMC;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C545990LbB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordStickerLogicComponent@6428.addEffectMessageExchangeHandler$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLZZZIL.LJIIIZ(this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordStickerLogicComponent@6428.addEffectMessageExchangeHandler$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
