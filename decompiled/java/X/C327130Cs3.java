package X;

import com.ss.android.ugc.aweme.services.audio.IVoiceHandler;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cs3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService$startDetectVoiceActivity$4$handlerAsync$1$1", f = "VoiceDetectorService.kt", l = {239}, m = "invokeSuspend")
public final class C327130Cs3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IVoiceHandler LLILLJJLI;
    public final /* synthetic */ VoiceDetectionResult LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327130Cs3(IVoiceHandler iVoiceHandler, VoiceDetectionResult voiceDetectionResult, InterfaceC1364105Vn<? super C327130Cs3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iVoiceHandler;
        this.LLILLL = voiceDetectionResult;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327130Cs3(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceDetectorService@fce2.startDetectVoiceActivity$4$handlerAsync$1$1");
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
            IVoiceHandler iVoiceHandler = this.LLILLJJLI;
            VoiceDetectionResult voiceDetectionResult = this.LLILLL;
            this.LL = 1;
            if (iVoiceHandler.onUpdateResult(voiceDetectionResult, this) == objLJFF) {
                C1C7U.LIZIZ("VoiceDetectorService@fce2.startDetectVoiceActivity$4$handlerAsync$1$1");
                return objLJFF;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceDetectorService@fce2.startDetectVoiceActivity$4$handlerAsync$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
