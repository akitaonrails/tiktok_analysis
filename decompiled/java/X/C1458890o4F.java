package X;

import com.ss.android.ugc.aweme.services.audio.DetectionPathResult;
import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0o4F, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService$startDetectVoiceActivity$4$result$1$asyncPathResult$1", f = "VoiceDetectorService.kt", l = {203}, m = "invokeSuspend")
public final class C1458890o4F extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super DetectionPathResult>, Object> {
    public int LL;
    public final /* synthetic */ IVoiceDetectorConfig LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458890o4F(IVoiceDetectorConfig iVoiceDetectorConfig, InterfaceC1364105Vn<? super C1458890o4F> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iVoiceDetectorConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1458890o4F(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("VoiceDetectorService@fce2.startDetectVoiceActivity$4$result$1$asyncPathResult$1");
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
            IVoiceDetectorConfig iVoiceDetectorConfig = this.LLILLJJLI;
            this.LL = 1;
            obj = iVoiceDetectorConfig.getVoiceDetectPath(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VoiceDetectorService@fce2.startDetectVoiceActivity$4$result$1$asyncPathResult$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("VoiceDetectorService@fce2.startDetectVoiceActivity$4$result$1$asyncPathResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super DetectionPathResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
