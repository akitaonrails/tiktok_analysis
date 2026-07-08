package X;

import Y.AgS293S0100000_12;
import com.bytedance.android.live.effect.voiceeffect.LiveVoiceEffectDialogFragment;
import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ttm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.voiceeffect.LiveVoiceEffectDialogFragment$observeViewModel$1", f = "LiveVoiceEffectDialogFragment.kt", l = {137}, m = "invokeSuspend")
public final class C761360Ttm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ LiveVoiceEffectDialogFragment LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761360Ttm(LiveVoiceEffectDialogFragment liveVoiceEffectDialogFragment, InterfaceC1364105Vn<? super C761360Ttm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = liveVoiceEffectDialogFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761360Ttm(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C2252331DDr c2252331DDr;
        C1C7U.LIZ("LiveVoiceEffectDialogFragment@8620.observeViewModel$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            LiveVoiceEffectDialogFragment liveVoiceEffectDialogFragment = this.LLILLJJLI;
            VoiceEffectViewModel voiceEffectViewModel = liveVoiceEffectDialogFragment.LLJI;
            if (voiceEffectViewModel != null && (c2252331DDr = voiceEffectViewModel.LLILLL) != null) {
                AgS293S0100000_12 agS293S0100000_12 = new AgS293S0100000_12(liveVoiceEffectDialogFragment, 30);
                this.LL = 1;
                if (C2252331DDr.LJIIJ(c2252331DDr, agS293S0100000_12, this) == objLJFF) {
                    C1C7U.LIZIZ("LiveVoiceEffectDialogFragment@8620.observeViewModel$1");
                    return objLJFF;
                }
            } else {
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("LiveVoiceEffectDialogFragment@8620.observeViewModel$1");
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
