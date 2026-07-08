package X;

import com.bytedance.android.live.effect.api.soundeffect.SoundEffect;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0TtO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel$unSelectItem$1", f = "SoundEffectViewModel.kt", l = {346}, m = "invokeSuspend")
public final class C761120TtO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SoundEffectViewModel LLILLJJLI;
    public final /* synthetic */ SoundEffect LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761120TtO(SoundEffect soundEffect, SoundEffectViewModel soundEffectViewModel, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = soundEffectViewModel;
        this.LLILLL = soundEffect;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761120TtO(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SoundEffectViewModel@1990.unSelectItem$1");
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
            C761960Tuk c761960Tuk = this.LLILLJJLI.LLILZ;
            if (Intrinsics.LJFF(this.LLILLL, c761960Tuk.LIZJ)) {
                SoundEffect soundEffect = c761960Tuk.LIZJ;
                c761960Tuk.LIZJ = null;
                if (soundEffect != null) {
                    C2252331DDr c2252331DDr = this.LLILLJJLI.LLILLL;
                    C402001hK c402001hK = new C402001hK(soundEffect);
                    this.LL = 1;
                    if (c2252331DDr.emit(c402001hK, this) == objLJFF) {
                        C1C7U.LIZIZ("SoundEffectViewModel@1990.unSelectItem$1");
                        return objLJFF;
                    }
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SoundEffectViewModel@1990.unSelectItem$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
