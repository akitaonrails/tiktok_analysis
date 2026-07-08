package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.tako.setting.DMASRSpeechOptions;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yI0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.botpage.bottombox.speech.TakoASRSpeechProcessor$initEngine$1", f = "TakoASRSpeechProcessor.kt", l = {}, m = "invokeSuspend")
public final class C1851820yI0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1801310wyX LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1851820yI0(C1801310wyX c1801310wyX, boolean z, InterfaceC1364105Vn<? super C1851820yI0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1801310wyX;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1851820yI0(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.0wyW] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String curUserId;
        boolean z;
        Object c098200Yq;
        C1C7U.LIZ("TakoASRSpeechProcessor@5f13.initEngine$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJ().LIZLLL.LIZ = System.currentTimeMillis();
        C1851910yI9 c1851910yI9 = new Object() { // from class: X.0yI9
        };
        final C1801310wyX c1801310wyX = this.LL;
        final boolean z2 = this.LLILLJJLI;
        ?? r2 = new Object() { // from class: X.0wyW
            public final void LIZ(Throwable th) {
                Exception exc;
                if (C07IC.LIZ()) {
                    C1930207hE.LIZ();
                }
                c1801310wyX.LJ().LIZLLL.LIZIZ = System.currentTimeMillis();
                C1801280wyU c1801280wyULJ = c1801310wyX.LJ();
                EnumC992330bvj enumC992330bvj = EnumC992330bvj.ASR_ENGINE_INIT_ERROR;
                String message = th.getMessage();
                if (message == null) {
                    message = "";
                }
                C1801290wyV c1801290wyV = c1801280wyULJ.LIZIZ;
                c1801290wyV.LJFF = enumC992330bvj;
                c1801290wyV.LJI = -1;
                c1801290wyV.LJII = message;
                c1801310wyX.LJ().LIZ();
                InterfaceC1801320wyY interfaceC1801320wyY = c1801310wyX.LIZIZ;
                if (interfaceC1801320wyY != null) {
                    if (!(th instanceof Exception) || (exc = (Exception) th) == null) {
                        exc = new Exception(th);
                    }
                    interfaceC1801320wyY.J(-1, exc);
                }
            }

            public final void LIZIZ(SpeechEngine speechEngine) {
                C1801310wyX c1801310wyX2 = c1801310wyX;
                c1801310wyX2.LIZ = speechEngine;
                speechEngine.setListener(c1801310wyX2);
                if (z2) {
                    c1801310wyX.LIZ();
                }
                c1801310wyX.LJ().LIZLLL.LIZIZ = System.currentTimeMillis();
            }
        };
        c1851910yI9.getClass();
        try {
            SpeechEngine speechEngineGenerator = SpeechEngineGenerator.getInstance();
            if (!SpeechEngineGenerator.isEngineSupported("asr")) {
                speechEngineGenerator.destroyEngine();
                r2.LIZ(new RuntimeException("not support ASR"));
            } else {
                speechEngineGenerator.createEngine();
                AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
                if (accountUserServiceLJIIJ.isLogin()) {
                    curUserId = accountUserServiceLJIIJ.getCurUserId();
                } else {
                    curUserId = "DEFAULT_USER";
                }
                DMASRSpeechOptions dMASRSpeechOptions = (DMASRSpeechOptions) C1851880yI6.LIZIZ.getValue();
                speechEngineGenerator.setOptionString("engine_name", "asr");
                speechEngineGenerator.setOptionString("log_level", "TRACE");
                speechEngineGenerator.setOptionString("uid", curUserId);
                speechEngineGenerator.setOptionBoolean("enable_get_volume", false);
                speechEngineGenerator.setOptionBoolean("recorder_disable_reuse", false);
                speechEngineGenerator.setOptionString("recorder_data_source_type", "Recorder");
                speechEngineGenerator.setOptionBoolean("asr_auto_stop", false);
                speechEngineGenerator.setOptionBoolean("asr_show_punctuation", true);
                String str = "";
                speechEngineGenerator.setOptionString("asr_rec_path", "");
                speechEngineGenerator.setOptionBoolean("asr_show_utterances", true);
                speechEngineGenerator.setOptionBoolean("enable_get_volume", true);
                speechEngineGenerator.setOptionInt("asr_conn_timeout", dMASRSpeechOptions.connectTimeOut);
                speechEngineGenerator.setOptionInt("asr_recv_timeout", dMASRSpeechOptions.receiveTimeOut);
                speechEngineGenerator.setOptionString("appid", dMASRSpeechOptions.appId);
                speechEngineGenerator.setOptionString("asr_address", dMASRSpeechOptions.address);
                speechEngineGenerator.setOptionString("asr_uri", dMASRSpeechOptions.uri);
                String str2 = dMASRSpeechOptions.cluster;
                if (str2.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    speechEngineGenerator.setOptionString("asr_cluster", str2);
                }
                String str3 = (String) C13LP.LJJJLL(dMASRSpeechOptions.language);
                if (str3 != null) {
                    str = str3;
                }
                speechEngineGenerator.setOptionString("asr_language", str);
                String str4 = dMASRSpeechOptions.token;
                if (str4.length() > 0) {
                    speechEngineGenerator.setOptionString("token", str4);
                }
                String str5 = dMASRSpeechOptions.resourceId;
                if (str5.length() > 0) {
                    speechEngineGenerator.setOptionString("resource_id", str5);
                }
                Integer numValueOf = Integer.valueOf(dMASRSpeechOptions.protocolType);
                if (numValueOf.intValue() > 0) {
                    speechEngineGenerator.setOptionInt("protocol_type", numValueOf.intValue());
                }
                Map<String, Object> map = dMASRSpeechOptions.reqParams;
                if (map != null) {
                    try {
                        C1227904rF.LIZ.getClass();
                        speechEngineGenerator.setOptionString("asr_req_params", C1227904rF.LIZLLL().LJIILL(map));
                        c098200Yq = Unit.LIZ;
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    C189200o6.m1boximpl(c098200Yq);
                }
                speechEngineGenerator.setOptionInt("fulllink_max_valid_speech_duration", C538540LAe.LLJJJIL);
                speechEngineGenerator.setOptionBoolean("asr_enable_itn", true);
                speechEngineGenerator.setOptionString("asr_vad_mode", "normal_vad");
                speechEngineGenerator.setOptionInt("recorder_preset", 3);
                C1855770yON.LIZ.getClass();
                if (C1855770yON.LJ()) {
                    speechEngineGenerator.setOptionBoolean("enable_rec_audio_callback", true);
                    speechEngineGenerator.setOptionInt("vad_max_speech_duration", 300000);
                }
                if (speechEngineGenerator.initEngine() != 0) {
                    speechEngineGenerator.destroyEngine();
                    r2.LIZ(new RuntimeException("init engine failed"));
                } else {
                    r2.LIZIZ(speechEngineGenerator);
                }
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1AF0.LIZJ("asr_engine_loadso_failed_2");
            r2.LIZ(th2);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("TakoASRSpeechProcessor@5f13.initEngine$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
