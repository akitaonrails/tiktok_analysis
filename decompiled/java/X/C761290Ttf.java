package X;

import com.bytedance.android.live.effect.singleselector.SingleVoiceEffectSelectorDialog;
import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ttf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.singleselector.SingleVoiceEffectSelectorDialog$initData$2", f = "SingleVoiceEffectSelectorDialog.kt", l = {149}, m = "invokeSuspend")
public final class C761290Ttf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ SingleVoiceEffectSelectorDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C761290Ttf(SingleVoiceEffectSelectorDialog singleVoiceEffectSelectorDialog, InterfaceC1364105Vn<? super C761290Ttf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = singleVoiceEffectSelectorDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C761290Ttf(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1DEK c1dek;
        C1C7U.LIZ("SingleVoiceEffectSelectorDialog@b852.initData$2");
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
            VoiceEffectViewModel voiceEffectViewModel = this.LLILLJJLI.LLIZLLLIL;
            if (voiceEffectViewModel != null && (c1dek = voiceEffectViewModel.LLILLJJLI) != null) {
                C403101hV c403101hV = C403101hV.LIZ;
                this.LL = 1;
                if (c1dek.LJIJI(c403101hV, this) == objLJFF) {
                    C1C7U.LIZIZ("SingleVoiceEffectSelectorDialog@b852.initData$2");
                    return objLJFF;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleVoiceEffectSelectorDialog@b852.initData$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
