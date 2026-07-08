package X;

import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.recorder.sticker.templateeffect.DiyPropParser;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0sYZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.gamora.recorder.sticker.childeffectpanel.ChildEffectButtonComponent$onCreate$2$1$3", f = "ChildEffectButtonComponent.kt", l = {}, m = "invokeSuspend")
public final class C1631450sYZ extends C09AX implements Function2<Pair<? extends Effect, ? extends Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1631480sYc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1631450sYZ(C1631480sYc c1631480sYc, InterfaceC1364105Vn<? super C1631450sYZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1631480sYc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1631450sYZ c1631450sYZ = new C1631450sYZ(this.LLILLJJLI, interfaceC1364105Vn);
        c1631450sYZ.LL = obj;
        return c1631450sYZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String effectId;
        C1C7U.LIZ("ChildEffectButtonComponent@45ab.onCreate$2$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Pair pair = (Pair) this.LL;
        Effect effect = (Effect) pair.getFirst();
        boolean zBooleanValue = ((Boolean) pair.getSecond()).booleanValue();
        C20012313Rx c20012313Rx = C20012313Rx.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("currentSticker: ");
        if (effect != null) {
            effectId = effect.getEffectId();
        } else {
            effectId = null;
        }
        sbLIZ.append(effectId);
        sbLIZ.append(", isHcOpen: ");
        sbLIZ.append(zBooleanValue);
        C201955140j.LJIILL(c20012313Rx, "ChildEffectButtonUI", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC1623190sLF interfaceC1623190sLFU = this.LLILLJJLI.nq().U();
        if (interfaceC1623190sLFU != null && interfaceC1623190sLFU.isShowing() && !zBooleanValue && effect != null && DiyPropParser.LJIIJJI(effect) && DiyPropParser.LJ(effect).length() > 0) {
            this.LLILLJJLI.LLJI.show();
        } else {
            this.LLILLJJLI.LLJI.hide();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChildEffectButtonComponent@45ab.onCreate$2$1$3");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Pair<? extends Effect, ? extends Boolean> pair, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(pair, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
