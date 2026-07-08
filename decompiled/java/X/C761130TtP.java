package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS378S0200000_12;
import njp.a;

/* JADX INFO: renamed from: X.0TtP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$downloadItem$1", f = "SoundEffectViewModel.kt", l = {354}, m = "invokeSuspend")
public final class C761130TtP extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SoundEffectViewModel LLILLJJLI;
    public final /* synthetic */ SoundEffect LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761130TtP(SoundEffect soundEffect, SoundEffectViewModel soundEffectViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = soundEffectViewModel;
        this.LLILLL = soundEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761130TtP(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SoundEffectViewModel@1990.downloadItem$1");
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
            C761740TuO c761740TuO = this.LLILLJJLI.LLILZIL;
            SoundEffect soundEffect = this.LLILLL;
            c761740TuO.getClass();
            if (C761740TuO.LJIILLIIL(soundEffect)) {
                C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
                C01PO c01po = new C01PO(this.LLILLL);
                this.LL = 1;
                if (c2252331DDr.emit(c01po, this) == objLJFF) {
                    C1C7U.LIZIZ("SoundEffectViewModel@1990.downloadItem$1");
                    return objLJFF;
                }
            } else {
                SoundEffectViewModel soundEffectViewModel = this.LLILLJJLI;
                C761740TuO c761740TuO2 = soundEffectViewModel.LLILZIL;
                SoundEffect soundEffect2 = this.LLILLL;
                c761740TuO2.LJIILL(soundEffect2, new AwS378S0200000_12(soundEffectViewModel, soundEffect2, 110));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SoundEffectViewModel@1990.downloadItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
