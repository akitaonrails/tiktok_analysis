package X;

import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionResult;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0o4D, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService$startDetectVoiceActivity$4$result$1", f = "VoiceDetectorService.kt", l = {211, 212, 215, 223}, m = "invokeSuspend")
public final class C1458870o4D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super VoiceDetectionResult>, Object> {
    public Object LL;
    public long LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ VoiceDetectionParam LLILZLL;
    public final /* synthetic */ IVoiceDetectorConfig LLIZ;
    public final /* synthetic */ VoiceDetectorService LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1458870o4D(long j, VoiceDetectionParam voiceDetectionParam, IVoiceDetectorConfig iVoiceDetectorConfig, VoiceDetectorService voiceDetectorService, InterfaceC1364105Vn<? super C1458870o4D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = j;
        this.LLILZLL = voiceDetectionParam;
        this.LLIZ = iVoiceDetectorConfig;
        this.LLIZLLLIL = voiceDetectorService;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1458870o4D c1458870o4D = new C1458870o4D(this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1458870o4D.LLILZ = obj;
        return c1458870o4D;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x011e A[LOOP:0: B:54:0x0118->B:56:0x011e, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r44) {
        /*
            Method dump skipped, instruction units count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1458870o4D.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super VoiceDetectionResult> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
