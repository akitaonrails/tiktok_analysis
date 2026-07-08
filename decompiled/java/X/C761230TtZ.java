package X;

import Y.AgS293S0100000_12;
import com.bytedance.android.live.effect.soundeffect.SoundEffectMiniWidget;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectMiniWidget$observeViewModel$1", f = "SoundEffectMiniWidget.kt", l = {122}, m = "invokeSuspend")
public final class C761230TtZ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SoundEffectMiniWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761230TtZ(SoundEffectMiniWidget soundEffectMiniWidget, InterfaceC1364105Vn<? super C761230TtZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = soundEffectMiniWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761230TtZ(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252331DDr c2252331DDr;
        C1C7U.LIZ("SoundEffectMiniWidget@7086.observeViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            SoundEffectMiniWidget soundEffectMiniWidget = this.LLILLJJLI;
            SoundEffectViewModel soundEffectViewModel = soundEffectMiniWidget.LLILZIL;
            if (soundEffectViewModel != null && (c2252331DDr = soundEffectViewModel.LLILLL) != null) {
                AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(soundEffectMiniWidget, 57);
                this.LL = 1;
                if (C2252331DDr.LJIIJ(c2252331DDr, agS293S0100000_12, this) == objLJFF) {
                    C1C7U.LIZIZ("SoundEffectMiniWidget@7086.observeViewModel$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("SoundEffectMiniWidget@7086.observeViewModel$1");
                return unit;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
