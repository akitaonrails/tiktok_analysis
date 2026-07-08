package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Kvm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.LokiResourceHandler$downloadByPanelResourceBranch$1$3$1", f = "LokiResourceHandler.kt", l = {}, m = "invokeSuspend")
public final class C533280Kvm extends C09AX implements Function2<Effect, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Pair<? extends Effect, ? extends Effect>>>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C533220Kvg LLILLJJLI;
    public final /* synthetic */ EffectManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533280Kvm(C533220Kvg c533220Kvg, EffectManager effectManager, InterfaceC1364105Vn<? super C533280Kvm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c533220Kvg;
        this.LLILLL = effectManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533280Kvm c533280Kvm = new C533280Kvm(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c533280Kvm.LL = obj;
        return c533280Kvm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LokiResourceHandler@5b6a.downloadByPanelResourceBranch$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Effect effect = (Effect) this.LL;
        C533220Kvg c533220Kvg = this.LLILLJJLI;
        EffectManager effectManager = this.LLILLL;
        c533220Kvg.getClass();
        C581150Mqn c581150Mqn = new C581150Mqn(C09IC.LJ(new C533390Kvx(effectManager, effect, c533220Kvg, null)), effect, 5);
        C1C7U.LIZIZ("LokiResourceHandler@5b6a.downloadByPanelResourceBranch$1$3$1");
        return c581150Mqn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Effect effect, InterfaceC1364105Vn<? super InterfaceC346201Wa<? extends Pair<? extends Effect, ? extends Effect>>> interfaceC1364105Vn) {
        return ((a) create(effect, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
