package X;

import Y.AgS77S1200000_12;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.voiceeffect.VoiceEffectViewModel;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tsx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectDataProvider$fetchTargetVoiceEffect$1$1", f = "LiveEffectDataProvider.kt", l = {128}, m = "invokeSuspend")
public final class C760850Tsx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VoiceEffectViewModel LLILLL;
    public final /* synthetic */ WeakReference<InterfaceC760840Tsw> LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760850Tsx(VoiceEffectViewModel voiceEffectViewModel, WeakReference<InterfaceC760840Tsw> weakReference, String str, InterfaceC1364105Vn<? super C760850Tsx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = voiceEffectViewModel;
        this.LLILZ = weakReference;
        this.LLILZIL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C760850Tsx c760850Tsx = new C760850Tsx(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c760850Tsx.LLILLJJLI = obj;
        return c760850Tsx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectDataProvider@97e.fetchTargetVoiceEffect$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            VoiceEffectViewModel voiceEffectViewModel = this.LLILLL;
            voiceEffectViewModel.getClass();
            C23250099c.LIZLLL(ViewModelKt.getViewModelScope(voiceEffectViewModel), C0PEM.LIZJ, null, new C761020TtE(voiceEffectViewModel, null), 2);
            C2252331DDr c2252331DDr = this.LLILLL.LLILLL;
            AgS77S1200000_12 agS77S1200000_12 = new AgS77S1200000_12(this.LLILZ, interfaceC497601wk, this.LLILZIL, 1);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS77S1200000_12, this) == objLJFF) {
                C1C7U.LIZIZ("LiveEffectDataProvider@97e.fetchTargetVoiceEffect$1$1");
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
