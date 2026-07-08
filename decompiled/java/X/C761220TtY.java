package X;

import com.bytedance.android.live.effect.soundeffect.SoundEffectMiniWidget;
import com.bytedance.android.live.effect.soundeffect.SoundEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TtY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.soundeffect.SoundEffectMiniWidget$fetchData$1", f = "SoundEffectMiniWidget.kt", l = {183}, m = "invokeSuspend")
public final class C761220TtY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SoundEffectMiniWidget LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761220TtY(SoundEffectMiniWidget soundEffectMiniWidget, InterfaceC1364105Vn<? super C761220TtY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = soundEffectMiniWidget;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761220TtY(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEK c1dek;
        C1C7U.LIZ("SoundEffectMiniWidget@7086.fetchData$1");
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
            SoundEffectViewModel soundEffectViewModel = this.LLILLJJLI.LLILZIL;
            if (soundEffectViewModel != null && (c1dek = soundEffectViewModel.LLILLJJLI) != null) {
                C403101hV c403101hV = C403101hV.LIZ;
                this.LL = 1;
                if (c1dek.LJIJI(c403101hV, this) == objLJFF) {
                    C1C7U.LIZIZ("SoundEffectMiniWidget@7086.fetchData$1");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SoundEffectMiniWidget@7086.fetchData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
