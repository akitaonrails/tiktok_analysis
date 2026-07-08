package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.b;
import njp.a;

/* JADX INFO: renamed from: X.0Kvh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.LokiResourceHandler$launchPanelEffectDownload$1", f = "LokiResourceHandler.kt", l = {538}, m = "invokeSuspend")
public final class C533230Kvh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C533220Kvg LL;
    public Effect LLILLJJLI;
    public InterfaceC531800KtO LLILLL;
    public Object LLILZ;
    public Object LLILZIL;
    public Object LLILZLL;
    public int LLIZ;
    public /* synthetic */ Object LLIZLLLIL;
    public final /* synthetic */ Map<String, String> LLJ;
    public final /* synthetic */ Effect LLJI;
    public final /* synthetic */ C533220Kvg LLJIJIL;
    public final /* synthetic */ EffectManager LLJILJIL;
    public final /* synthetic */ InterfaceC531800KtO LLJILJILJ;
    public final /* synthetic */ AtomicLong LLJILLL;
    public final /* synthetic */ String LLJJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533230Kvh(Map<String, String> map, Effect effect, C533220Kvg c533220Kvg, EffectManager effectManager, InterfaceC531800KtO interfaceC531800KtO, AtomicLong atomicLong, String str, InterfaceC1364105Vn<? super C533230Kvh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLJ = map;
        this.LLJI = effect;
        this.LLJIJIL = c533220Kvg;
        this.LLJILJIL = effectManager;
        this.LLJILJILJ = interfaceC531800KtO;
        this.LLJILLL = atomicLong;
        this.LLJJ = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533230Kvh c533230Kvh = new C533230Kvh(this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, this.LLJILLL, this.LLJJ, interfaceC1364105Vn);
        c533230Kvh.LLIZLLLIL = obj;
        return c533230Kvh;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        String str;
        boolean z;
        C533220Kvg c533220Kvg;
        Effect effect;
        InterfaceC531800KtO interfaceC531800KtO;
        Map<String, String> map;
        AtomicLong atomicLong;
        String str2;
        Object objLJIIZILJ = obj;
        C1C7U.LIZ("LokiResourceHandler@5b6a.launchPanelEffectDownload$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLIZ;
        String str3 = "";
        try {
            if (i != 0) {
                if (i == 1) {
                    str2 = (String) this.LLILZLL;
                    atomicLong = (AtomicLong) this.LLILZIL;
                    map = (Map) this.LLILZ;
                    interfaceC531800KtO = this.LLILLL;
                    effect = this.LLILLJJLI;
                    c533220Kvg = this.LL;
                    str = (String) this.LLIZLLLIL;
                    C155000ia.LIZIZ(objLJIIZILJ);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(objLJIIZILJ);
                str = this.LLJ.get(this.LLJI.getResourceId());
                if (str == null) {
                    str = "";
                }
                if (str.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("LokiResourceHandler@5b6a.launchPanelEffectDownload$1");
                    return unit;
                }
                c533220Kvg = this.LLJIJIL;
                EffectManager effectManager = this.LLJILJIL;
                effect = this.LLJI;
                interfaceC531800KtO = this.LLJILJILJ;
                map = this.LLJ;
                atomicLong = this.LLJILLL;
                str2 = this.LLJJ;
                c533220Kvg.getClass();
                b bVarLJ = C09IC.LJ(new C533390Kvx(effectManager, effect, c533220Kvg, null));
                this.LLIZLLLIL = str;
                this.LL = c533220Kvg;
                this.LLILLJJLI = effect;
                this.LLILLL = interfaceC531800KtO;
                this.LLILZ = map;
                this.LLILZIL = atomicLong;
                this.LLILZLL = str2;
                this.LLIZ = 1;
                objLJIIZILJ = C09IC.LJIIZILJ(bVarLJ, this);
                if (objLJIIZILJ == objLJFF) {
                    C1C7U.LIZIZ("LokiResourceHandler@5b6a.launchPanelEffectDownload$1");
                    return objLJFF;
                }
            }
            Effect effect2 = (Effect) objLJIIZILJ;
            c533220Kvg.LIZLLL(str, effect.getUnzipPath());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("downloadEffect by resourceID onSuccess: urs= ");
            sbLIZ.append(str);
            sbLIZ.append(' ');
            c533220Kvg.LJFF(C2188811AlT.LIZIZ(sbLIZ));
            String unzipPath = effect.getUnzipPath();
            if (unzipPath == null) {
                unzipPath = "";
            }
            interfaceC531800KtO.LJJI(str, unzipPath);
            map.remove(effect.getResourceId());
            long jDecrementAndGet = atomicLong.decrementAndGet();
            if (effect2 != null) {
                C389400FOo c389400FOo = c533220Kvg.LJ;
                String resourceId = effect.getResourceId();
                if (resourceId == null) {
                    resourceId = "";
                }
                c389400FOo.LIZJ(effect2, str2, resourceId);
            }
            C533220Kvg.LJIIJJI(map, jDecrementAndGet, interfaceC531800KtO);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C533220Kvg c533220Kvg2 = this.LLJIJIL;
        InterfaceC531800KtO interfaceC531800KtO2 = this.LLJILJILJ;
        Map<String, String> map2 = this.LLJ;
        Effect effect3 = this.LLJI;
        AtomicLong atomicLong2 = this.LLJILLL;
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            c533220Kvg2.LJII("onFail: " + str + ' ' + thM5exceptionOrNullimpl.getMessage());
            String message = thM5exceptionOrNullimpl.getMessage();
            if (message != null) {
                str3 = message;
            }
            interfaceC531800KtO2.onError(str, -2003, str3);
            map2.remove(effect3.getResourceId());
            C533220Kvg.LJIIJJI(map2, atomicLong2.decrementAndGet(), interfaceC531800KtO2);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("LokiResourceHandler@5b6a.launchPanelEffectDownload$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
