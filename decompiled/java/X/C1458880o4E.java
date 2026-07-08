package X;

import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0o4E, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService$startDetectVoiceActivity$4$result$1$asyncModelResult$1", f = "VoiceDetectorService.kt", l = {207}, m = "invokeSuspend")
public final class C1458880o4E extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1461140o7s>, Object> {
    public long LL;
    public int LLILLJJLI;
    public final /* synthetic */ VoiceDetectionParam LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458880o4E(VoiceDetectionParam voiceDetectionParam, InterfaceC1364105Vn<? super C1458880o4E> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = voiceDetectionParam;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1458880o4E(this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        long jCurrentTimeMillis;
        C1C7U.LIZ("VoiceDetectorService@fce2.startDetectVoiceActivity$4$result$1$asyncModelResult$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                jCurrentTimeMillis = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            jCurrentTimeMillis = System.currentTimeMillis();
            this.LL = jCurrentTimeMillis;
            this.LLILLJJLI = 1;
            obj = C1461160o7u.LIZ(this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("VoiceDetectorService@fce2.startDetectVoiceActivity$4$result$1$asyncModelResult$1");
                return objLJFF;
            }
        }
        this.LLILLL.setDownloadModelDuration(System.currentTimeMillis() - jCurrentTimeMillis);
        C1C7U.LIZIZ("VoiceDetectorService@fce2.startDetectVoiceActivity$4$result$1$asyncModelResult$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1461140o7s> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
