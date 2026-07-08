package X;

import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchIcyClashLynxDelayFinishDuration;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0gRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
@C09DV(c = "com.bytedance.android.live.liveinteract.matchv2.component.effect.LiveMatchEffectComponent$dismiss$1", f = "LiveMatchEffectComponent.kt", l = {325}, m = "invokeSuspend")
public final class C1165970gRn extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C158N LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1165970gRn(C158N c158n, InterfaceC1364105Vn<? super C1165970gRn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c158n;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1165970gRn(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveMatchEffectComponent@580d.dismiss$1");
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
            long jValue = LiveMatchIcyClashLynxDelayFinishDuration.INSTANCE.value();
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(jValue, this) == objLJFF) {
                C1C7U.LIZIZ("LiveMatchEffectComponent@580d.dismiss$1");
                return objLJFF;
            }
        }
        C20441214yg.LIZIZ("LiveMatchEffectComponent", "sparkView destroyWithBack");
        C158M c158m = this.LLILLJJLI.LLILLL;
        if (c158m != null) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = c158m.LIZJ;
            if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
                boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
                sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
            }
            c158m.LIZJ = null;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LiveMatchEffectComponent@580d.dismiss$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
