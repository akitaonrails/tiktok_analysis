package X;

import com.ss.android.ugc.aweme.services.audio.IVoiceDetectorConfig;
import com.ss.android.ugc.aweme.services.audio.VoiceDetectionParam;
import com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0o7h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.voicedetection.VoiceDetectorService$startDetectVoiceActivity$4", f = "VoiceDetectorService.kt", l = {196, 241}, m = "invokeSuspend")
public final class C1461030o7h extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ VoiceDetectorService LLILLL;
    public final /* synthetic */ IVoiceDetectorConfig LLILZ;
    public final /* synthetic */ C1461130o7r LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ VoiceDetectionParam LLIZ;
    public final /* synthetic */ Function0<Unit> LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1461030o7h(VoiceDetectorService voiceDetectorService, IVoiceDetectorConfig iVoiceDetectorConfig, C1461130o7r c1461130o7r, long j, VoiceDetectionParam voiceDetectionParam, Function0<Unit> function0, InterfaceC1364105Vn<? super C1461030o7h> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = voiceDetectorService;
        this.LLILZ = iVoiceDetectorConfig;
        this.LLILZIL = c1461130o7r;
        this.LLILZLL = j;
        this.LLIZ = voiceDetectionParam;
        this.LLIZLLLIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1461030o7h c1461030o7h = new C1461030o7h(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, interfaceC1364105Vn);
        c1461030o7h.LLILLJJLI = obj;
        return c1461030o7h;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d A[LOOP:0: B:11:0x0067->B:13:0x006d, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1461030o7h.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
