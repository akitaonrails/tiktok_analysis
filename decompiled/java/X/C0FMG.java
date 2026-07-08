package X;

import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.textemplate.panel.TextTemplateTools;
import com.ss.android.ugc.effectmanager.common.task.ExceptionResult;
import com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS119S1100000_5;
import njp.a;

/* JADX INFO: renamed from: X.0FMG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.aweme.image.inspiration.ui.ImageInspirationTextStickerPresenter$preLoadNext$job$1", f = "ImageInspirationTextStickerPresenter.kt", l = {}, m = "invokeSuspend")
public final class C0FMG extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C0FMH LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ C0FMR LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0FMG(C0FMH c0fmh, String str, C0FMR c0fmr, InterfaceC1364105Vn<? super C0FMG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c0fmh;
        this.LLILLJJLI = str;
        this.LLILLL = c0fmr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0FMG(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ImageInspirationTextStickerPresenter@ecb3.preLoadNext$job$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0FJA c0fja = C0FJA.LIZ;
        final VideoPublishEditModel videoPublishEditModel = (VideoPublishEditModel) this.LL.LIZLLL.getValue();
        final String str = this.LLILLJJLI;
        final AwS119S1100000_5 awS119S1100000_5 = new AwS119S1100000_5(this.LLILLL, str, 0);
        c0fja.getClass();
        final long jCurrentTimeMillis = System.currentTimeMillis();
        C0FJA.LIZIZ.LIZIZ(str, null, new IFetchEffectListener() { // from class: X.0FJE
            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onStart(Effect effect) {
            }

            @Override // com.ss.android.ugc.effectmanager.common.task.IEffectPlatformBaseListener
            public final void onSuccess(Effect effect) {
                Effect effect2 = effect;
                if (TextTemplateTools.LJIIJ(effect2)) {
                    C0FJA c0fja2 = C0FJA.LIZ;
                    VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                    Function1<C0FMO, Unit> function1 = awS119S1100000_5;
                    c0fja2.getClass();
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C0FJ9(effect2, function1, videoPublishEditModel2, null), 3);
                } else {
                    C0FJA c0fja3 = C0FJA.LIZ;
                    VideoPublishEditModel videoPublishEditModel3 = videoPublishEditModel;
                    Function1<C0FMO, Unit> function12 = awS119S1100000_5;
                    c0fja3.getClass();
                    C0FJA.LIZ(videoPublishEditModel3, effect2, function12);
                }
                C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                VideoPublishEditModel videoPublishEditModel4 = videoPublishEditModel;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String str2 = str;
                boolean zLJIIJ = TextTemplateTools.LJIIJ(effect2);
                c1402910mbx.getClass();
                C1402910mbx.LJIIIIZZ(jCurrentTimeMillis2, videoPublishEditModel4, str2, "", true, true, zLJIIJ);
            }

            @Override // com.ss.android.ugc.effectmanager.effect.listener.IFetchEffectListener
            public final void onFail(Effect effect, ExceptionResult exceptionResult) {
                C1402910mbx c1402910mbx = C1402910mbx.LIZ;
                VideoPublishEditModel videoPublishEditModel2 = videoPublishEditModel;
                long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                String str2 = str;
                c1402910mbx.getClass();
                C1402910mbx.LJIIIIZZ(jCurrentTimeMillis2, videoPublishEditModel2, str2, "", false, true, true);
            }
        });
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ImageInspirationTextStickerPresenter@ecb3.preLoadNext$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
