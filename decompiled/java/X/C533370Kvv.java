package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Kvv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.LokiResourceHandler$fetchEffectWithDownloadFlow$1", f = "LokiResourceHandler.kt", l = {604}, m = "invokeSuspend")
public final class C533370Kvv extends C09AX implements Function2<C094D<? super Effect>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EffectManager LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ Map<String, String> LLILZIL;
    public final /* synthetic */ C533220Kvg LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533370Kvv(EffectManager effectManager, String str, Map<String, String> map, C533220Kvg c533220Kvg, InterfaceC1364105Vn<? super C533370Kvv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = effectManager;
        this.LLILZ = str;
        this.LLILZIL = map;
        this.LLILZLL = c533220Kvg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533370Kvv c533370Kvv = new C533370Kvv(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c533370Kvv.LLILLJJLI = obj;
        return c533370Kvv;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LokiResourceHandler@5b6a.fetchEffectWithDownloadFlow$1");
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
            final C094D c094d = (C094D) this.LLILLJJLI;
            EffectManager effectManager = this.LLILLL;
            final String str = this.LLILZ;
            Map<String, String> map = this.LLILZIL;
            final C533220Kvg c533220Kvg = this.LLILZLL;
            effectManager.fetchEffectWithDownload(str, map, new IFetchEffectListener() { // from class: X.0Kvu
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect) {
                    C533220Kvg c533220Kvg2 = c533220Kvg;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("fetchEffect start: ");
                    sbLIZ.append(str);
                    c533220Kvg2.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect) {
                    c094d.LJIIIIZZ(effect);
                    c094d.LJIIJJI(null);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                    C094D<Effect> c094d2 = c094d;
                    String msg = exceptionResult.getMsg();
                    if (msg == null) {
                        msg = "fetchEffectWithDownload failed";
                    }
                    c094d2.LJIIJJI(new RuntimeException(msg));
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(426);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("LokiResourceHandler@5b6a.fetchEffectWithDownloadFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LokiResourceHandler@5b6a.fetchEffectWithDownloadFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Effect> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
