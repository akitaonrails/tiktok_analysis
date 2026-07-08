package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08eF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.prop.EffectPreloadManager$preloadEffect$1", f = "EffectPreloadManager.kt", l = {118, 120}, m = "invokeSuspend")
public final class C2166508eF extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1632250sZr LLILLL;
    public final /* synthetic */ Context LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Map<String, String> LLILZLL;
    public final /* synthetic */ Function1<Effect, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2166508eF(C1632250sZr c1632250sZr, Context context, String str, Map<String, String> map, Function1<? super Effect, Unit> function1, InterfaceC1364105Vn<? super C2166508eF> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1632250sZr;
        this.LLILZ = context;
        this.LLILZIL = str;
        this.LLILZLL = map;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2166508eF c2166508eF = new C2166508eF(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
        c2166508eF.LLILLJJLI = obj;
        return c2166508eF;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1632250sZr c1632250sZr;
        C1C7U.LIZ("EffectPreloadManager@9d7.preloadEffect$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("EffectPreloadManager@9d7.preloadEffect$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c1632250sZr = (C1632250sZr) this.LLILLJJLI;
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            c1632250sZr = this.LLILLL;
            Context context = this.LLILZ;
            String str = this.LLILZIL;
            Map<String, String> map = this.LLILZLL;
            this.LLILLJJLI = c1632250sZr;
            this.LL = 1;
            c1632250sZr.getClass();
            obj = C1632250sZr.LIZ(context, str, map, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("EffectPreloadManager@9d7.preloadEffect$1");
                return objLJFF;
            }
        }
        c098200Yq = (Effect) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        c1632250sZr.LIZJ = (Effect) c098200Yq;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C2166608eG c2166608eG = new C2166608eG(this.LLIZ, this.LLILLL, null);
        this.LLILLJJLI = null;
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c2166608eG) == objLJFF) {
            C1C7U.LIZIZ("EffectPreloadManager@9d7.preloadEffect$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("EffectPreloadManager@9d7.preloadEffect$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
