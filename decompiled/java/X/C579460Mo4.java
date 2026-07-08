package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.l0;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Mo4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.RecordStickerLogicComponent$addEffectMessageExchangeHandler$3$1$1", f = "RecordStickerLogicComponent.kt", l = {}, m = "invokeSuspend")
public final class C579460Mo4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ l0 LL;
    public final /* synthetic */ Effect LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C579460Mo4(l0 l0Var, Effect effect, InterfaceC1364105Vn<? super C579460Mo4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = l0Var;
        this.LLILLJJLI = effect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C579460Mo4(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RecordStickerLogicComponent@6428.addEffectMessageExchangeHandler$3$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        List<String> list = C579450Mo3.LIZ;
        if (C579450Mo3.LIZIZ(this.LL.getShortVideoContext())) {
            C1624010sMZ.LIZ(this.LL);
        } else {
            C1624010sMZ.LJII(this.LL, null);
        }
        this.LL.vT1(true);
        C1624010sMZ.LJII(this.LL, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RecordStickerLogicComponent@6428.addEffectMessageExchangeHandler$3$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
