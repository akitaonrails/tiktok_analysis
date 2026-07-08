package X;

import com.ss.android.ugc.effectmanager.EffectManager;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS194S0000000_8;
import njp.a;

/* JADX INFO: renamed from: X.0Kvx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.cktemplate.resource.handlers.LokiResourceHandler$downloadEffectFlow$1", f = "LokiResourceHandler.kt", l = {673}, m = "invokeSuspend")
public final class C533390Kvx extends C09AX implements Function2<C094D<? super Effect>, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ EffectManager LLILLL;
    public final /* synthetic */ Effect LLILZ;
    public final /* synthetic */ C533220Kvg LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C533390Kvx(EffectManager effectManager, Effect effect, C533220Kvg c533220Kvg, InterfaceC1364105Vn<? super C533390Kvx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = effectManager;
        this.LLILZ = effect;
        this.LLILZIL = c533220Kvg;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C533390Kvx c533390Kvx = new C533390Kvx(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c533390Kvx.LLILLJJLI = obj;
        return c533390Kvx;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LokiResourceHandler@5b6a.downloadEffectFlow$1");
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
            final Effect effect = this.LLILZ;
            final C533220Kvg c533220Kvg = this.LLILZIL;
            effectManager.fetchEffect(effect, new IFetchEffectListener() { // from class: X.0Kvw
                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onStart(Effect effect2) {
                    C533220Kvg c533220Kvg2 = c533220Kvg;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("onStart: ");
                    sbLIZ.append(effect.getEffectId());
                    c533220Kvg2.LJII(C2188811AlT.LIZIZ(sbLIZ));
                }

                @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
                public final void onSuccess(Effect effect2) {
                    c094d.LJIIIIZZ(effect2);
                    c094d.LJIIJJI(null);
                }

                @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
                public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                    C094D<Effect> c094d2 = c094d;
                    String msg = exceptionResult.getMsg();
                    if (msg == null) {
                        msg = "fetchEffect failed";
                    }
                    c094d2.LJIIJJI(new RuntimeException(msg));
                }
            });
            AFwS194S0000000_8 aFwS194S0000000_8 = AFwS194S0000000_8.get$arr$(424);
            this.LL = 1;
            if (C23128094k.LIZ(c094d, aFwS194S0000000_8, this) == objLJFF) {
                C1C7U.LIZIZ("LokiResourceHandler@5b6a.downloadEffectFlow$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LokiResourceHandler@5b6a.downloadEffectFlow$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C094D<? super Effect> c094d, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c094d, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
