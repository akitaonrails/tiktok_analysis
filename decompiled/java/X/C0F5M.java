package X;

import com.ss.android.ugc.aweme.shortvideo.inlinecaption.experiment.LanguageDetail;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.ui.InlineCaptionFragment;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0F5M, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.capabilities.text.captions.inline.logic.CaptionRecognitionUseCase$fetchDefaultCaptionAnim$2", f = "CaptionRecognitionUseCase.kt", l = {275}, m = "invokeSuspend")
public final class C0F5M extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InlineCaptionFragment LL;
    public int LLILLJJLI;
    public final /* synthetic */ C0F5A LLILLL;
    public final /* synthetic */ LanguageDetail LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0F5M(C0F5A c0f5a, LanguageDetail languageDetail, InterfaceC1364105Vn<? super C0F5M> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c0f5a;
        this.LLILZ = languageDetail;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0F5M(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InlineCaptionFragment inlineCaptionFragment;
        HashMap<String, Effect> map;
        C1C7U.LIZ("CaptionRecognitionUseCase@9d05.fetchDefaultCaptionAnim$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                inlineCaptionFragment = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            inlineCaptionFragment = this.LLILLL.LIZ.LIZ;
            C0FCA c0fca = inlineCaptionFragment.LLLLJI;
            if (c0fca != null) {
                LanguageDetail languageDetail = this.LLILZ;
                this.LL = inlineCaptionFragment;
                this.LLILLJJLI = 1;
                obj = c0fca.LIZIZ(languageDetail, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("CaptionRecognitionUseCase@9d05.fetchDefaultCaptionAnim$2");
                    return objLJFF;
                }
            } else {
                map = null;
                inlineCaptionFragment.LLLLLILLIL = map;
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CaptionRecognitionUseCase@9d05.fetchDefaultCaptionAnim$2");
                return unit;
            }
        }
        map = (HashMap) obj;
        inlineCaptionFragment.LLLLLILLIL = map;
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CaptionRecognitionUseCase@9d05.fetchDefaultCaptionAnim$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
