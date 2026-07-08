package X;

import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0yI2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aiuikit.impl.voicebox.speech.VoiceBoxASRSpeechProcessor$initEngine$1", f = "VoiceBoxASRSpeechProcessor.kt", l = {}, m = "invokeSuspend")
public final class C1851840yI2 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1767320w5i LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1851840yI2(C1767320w5i c1767320w5i, boolean z, InterfaceC1364105Vn<? super C1851840yI2> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1767320w5i;
        this.LLILLJJLI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1851840yI2(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.0w5k] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AccountUserService accountUserServiceLJIIJ;
        String curUserId;
        C1C7U.LIZ("VoiceBoxASRSpeechProcessor@378b.initEngine$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1851890yI7 c1851890yI7 = new Object() { // from class: X.0yI7
        };
        final C1767320w5i c1767320w5i = this.LL;
        C1851870yI5 c1851870yI5 = c1767320w5i.LIZ;
        final boolean z = this.LLILLJJLI;
        ?? r3 = new Object() { // from class: X.0w5k
            public final void LIZ(SpeechEngine speechEngine) {
                C1767320w5i c1767320w5i2 = c1767320w5i;
                c1767320w5i2.LIZJ = speechEngine;
                speechEngine.setListener(c1767320w5i2);
                if (z) {
                    c1767320w5i.LIZ();
                }
            }
        };
        c1851890yI7.getClass();
        try {
            SpeechEngine speechEngineGenerator = SpeechEngineGenerator.getInstance();
            if (!SpeechEngineGenerator.isEngineSupported("asr")) {
                speechEngineGenerator.destroyEngine();
                new RuntimeException("not support ASR");
            }
            speechEngineGenerator.createEngine();
            IAccountService iAccountService = (IAccountService) PluggableExtentionKt.pluggableSpi$default(IAccountService.class, false, false, false, 14, null);
            if (iAccountService != null) {
                accountUserServiceLJIIJ = iAccountService.LJIIJ();
            } else {
                accountUserServiceLJIIJ = null;
            }
            if (accountUserServiceLJIIJ != null && accountUserServiceLJIIJ.isLogin()) {
                curUserId = accountUserServiceLJIIJ.getCurUserId();
            } else {
                curUserId = "DEFAULT_USER";
            }
            speechEngineGenerator.setOptionString("engine_name", "asr");
            speechEngineGenerator.setOptionString("log_level", "TRACE");
            speechEngineGenerator.setOptionString("uid", curUserId);
            speechEngineGenerator.setOptionBoolean("recorder_disable_reuse", false);
            speechEngineGenerator.setOptionString("recorder_data_source_type", "Recorder");
            speechEngineGenerator.setOptionBoolean("asr_auto_stop", false);
            speechEngineGenerator.setOptionBoolean("asr_show_punctuation", true);
            speechEngineGenerator.setOptionString("asr_rec_path", "");
            speechEngineGenerator.setOptionBoolean("asr_show_utterances", true);
            speechEngineGenerator.setOptionBoolean("enable_get_volume", true);
            speechEngineGenerator.setOptionInt("asr_conn_timeout", c1851870yI5.getAsrConnectionTimeoutIntervalMs$tools_ai_uikit_df_release());
            speechEngineGenerator.setOptionInt("asr_recv_timeout", c1851870yI5.getAsrReceivingTimeoutIntervalMs$tools_ai_uikit_df_release());
            speechEngineGenerator.setOptionString("appid", c1851870yI5.getAppId$tools_ai_uikit_df_release());
            speechEngineGenerator.setOptionString("asr_address", c1851870yI5.getAsrAddress$tools_ai_uikit_df_release());
            speechEngineGenerator.setOptionString("asr_uri", c1851870yI5.getAsrUri$tools_ai_uikit_df_release());
            speechEngineGenerator.setOptionString("asr_cluster", c1851870yI5.getAsrCluster$tools_ai_uikit_df_release());
            speechEngineGenerator.setOptionString("asr_language", c1851870yI5.getAsrLanguage$tools_ai_uikit_df_release());
            speechEngineGenerator.setOptionInt("fulllink_max_valid_speech_duration", c1851870yI5.getAsrMaxSpeechDurationLimitMs$tools_ai_uikit_df_release());
            speechEngineGenerator.setOptionBoolean("asr_enable_itn", true);
            speechEngineGenerator.setOptionString("asr_vad_mode", "");
            speechEngineGenerator.setOptionInt("recorder_preset", 1);
            speechEngineGenerator.setOptionBoolean("enable_filter_head_silence", true);
            if (speechEngineGenerator.initEngine() != 0) {
                new RuntimeException("init engine failed");
            }
            r3.LIZ(speechEngineGenerator);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ("asr_engine_loadso_failed_2");
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("VoiceBoxASRSpeechProcessor@378b.initEngine$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
