package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS214S0300000_5;
import njp.a;

/* JADX INFO: renamed from: X.0FMD, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.textemplate.TextTemplateComponent$preLoad$job$1", f = "TextTemplateComponent.kt", l = {}, m = "invokeSuspend")
public final class C0FMD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C194431114z LL;
    public final /* synthetic */ Effect LLILLJJLI;
    public final /* synthetic */ C0FMR LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FMD(C194431114z c194431114z, Effect effect, C0FMR c0fmr, InterfaceC1364105Vn<? super C0FMD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c194431114z;
        this.LLILLJJLI = effect;
        this.LLILLL = c0fmr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FMD(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TextTemplateComponent@b18.preLoad$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FJA c0fja = C0FJA.LIZ;
        final VideoPublishEditModel videoPublishEditModelD5 = this.LL.D5();
        final Effect effect = this.LLILLJJLI;
        final AwS214S0300000_5 awS214S0300000_5 = new AwS214S0300000_5(this.LL, this.LLILLL, effect, 3);
        c0fja.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C0FJA.LIZIZ.LIZJ(effect, new IFetchEffectListener() { // from class: X.0FJD
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect2) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect2) {
                Effect effect3 = effect2;
                if (TextTemplateTools.LJIIJ(effect3)) {
                    C0FJA c0fja2 = C0FJA.LIZ;
                    VideoPublishEditModel videoPublishEditModel = videoPublishEditModelD5;
                    Function1<C0FMO, Unit> function1 = awS214S0300000_5;
                    c0fja2.getClass();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0FJ9(effect3, function1, videoPublishEditModel, null), 3);
                } else {
                    C0FJA c0fja3 = C0FJA.LIZ;
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModelD5;
                    Function1<C0FMO, Unit> function12 = awS214S0300000_5;
                    c0fja3.getClass();
                    C0FJA.LIZ(videoPublishEditModel2, effect3, function12);
                }
                C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModelD5;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String effectId = effect.getEffectId();
                boolean zLJIIJ = TextTemplateTools.LJIIJ(effect3);
                c1402910mbx.getClass();
                C1402910mbx.LJIIIIZZ(jCurrentTimeMillis2, videoPublishEditModel3, effectId, "", true, true, zLJIIJ);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect2, ExceptionResult exceptionResult) {
                C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                VideoPublishEditModel videoPublishEditModel = videoPublishEditModelD5;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String effectId = effect.getEffectId();
                boolean zLJIIJ = TextTemplateTools.LJIIJ(effect);
                c1402910mbx.getClass();
                C1402910mbx.LJIIIIZZ(jCurrentTimeMillis2, videoPublishEditModel, effectId, "", false, true, zLJIIJ);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TextTemplateComponent@b18.preLoad$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
