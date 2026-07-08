package X;

import Y.AgS202S0200000_12;
import androidx.lifecycle.ViewModelKt;
import com.bytedance.android.live.effect.bgeffect.BgEffectViewModel;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tt1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.live.effect.LiveEffectDataProvider$fetchBackgroundEffect$1$1", f = "LiveEffectDataProvider.kt", l = {1020}, m = "invokeSuspend")
public final class C760890Tt1 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ BgEffectViewModel LLILZ;
    public final /* synthetic */ IEffectPlatformBaseListener<List<LiveEffect>> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C760890Tt1(boolean z, BgEffectViewModel bgEffectViewModel, IEffectPlatformBaseListener<List<LiveEffect>> iEffectPlatformBaseListener, InterfaceC1364105Vn<? super C760890Tt1> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = bgEffectViewModel;
        this.LLILZIL = iEffectPlatformBaseListener;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C760890Tt1 c760890Tt1 = new C760890Tt1(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c760890Tt1.LLILLJJLI = obj;
        return c760890Tt1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveEffectDataProvider@97e.fetchBackgroundEffect$1$1");
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
            if (this.LLILLL) {
                BgEffectViewModel bgEffectViewModel = this.LLILZ;
                bgEffectViewModel.getClass();
                C20441214yg.LIZIZ("shared_bg", "BgEffectViewModel fetchLatestMultiEffect start");
                C23250099c.LIZLLL(ViewModelKt.getViewModelScope(bgEffectViewModel), C0PEM.LIZJ, null, new C760970Tt9(bgEffectViewModel, true, null), 2);
            } else {
                this.LLILZ.ZQ2("multi", null);
            }
            C2252331DDr c2252331DDr = this.LLILZ.LLILLL;
            AgS202S0200000_12 agS202S0200000_12 = new AgS202S0200000_12(this.LLILZIL, interfaceC497601wk, 2);
            this.LL = 1;
            c2252331DDr.getClass();
            if (C2252331DDr.LJIIJ(c2252331DDr, agS202S0200000_12, this) == objLJFF) {
                C1C7U.LIZIZ("LiveEffectDataProvider@97e.fetchBackgroundEffect$1$1");
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
