package X;

import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseParamModel;
import com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseResultModel;
import com.bytedance.speech.speechengine.SpeechEngine;
import com.bytedance.speech.speechengine.SpeechEngineGenerator;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.AccountUserService;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pgc.hybrid.xbridge.impl.speech.DMASRSpeechOptions;
import java.util.List;

/* JADX INFO: renamed from: X.0yI1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1851830yI1 extends AbstractC1851860yI4 {
    @Override // X.AbstractC1549150qPp, X.InterfaceC1063710dmr
    public final void release() {
        C1801350wyb c1801350wyb;
        super.release();
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        String containerID = interfaceC634840OvC != null ? interfaceC634840OvC.getContainerID() : null;
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ == null || (c1801350wyb = (C1801350wyb) c1537480q70LIZIZ.LJFF(C1801350wyb.class)) == null) {
            return;
        }
        SpeechEngine speechEngine = c1801350wyb.LIZ;
        if (speechEngine != null) {
            speechEngine.setListener(null);
        }
        SpeechEngine speechEngine2 = c1801350wyb.LIZ;
        if (speechEngine2 != null) {
            speechEngine2.destroyEngine();
        }
        c1801350wyb.LIZ = null;
    }

    /* JADX WARN: Type inference failed for: r5v2, types: [X.0wy0] */
    @Override // X.AbstractC1549150qPp
    public final void handle(XBaseParamModel xBaseParamModel, final CompletionBlock completionBlock, EnumC1063300dmC enumC1063300dmC) {
        String containerID;
        Object objLJFF;
        String curUserId;
        InterfaceC1851850yI3 interfaceC1851850yI3 = (InterfaceC1851850yI3) xBaseParamModel;
        C1529880puk c1529880puk = SparkContext.Companion;
        InterfaceC634840OvC interfaceC634840OvC = this.IBridgeSdkContext;
        if (interfaceC634840OvC != null) {
            containerID = interfaceC634840OvC.getContainerID();
        } else {
            containerID = null;
        }
        c1529880puk.getClass();
        C1537480q70 c1537480q70LIZIZ = C1529880puk.LIZIZ(containerID);
        if (c1537480q70LIZIZ != null) {
            objLJFF = c1537480q70LIZIZ.LJFF(C1801350wyb.class);
        } else {
            objLJFF = null;
        }
        String str = "";
        if (objLJFF != null) {
            XBaseModel xBaseModelLIZJ = C1909107dp.LIZJ(InterfaceC1797690wsh.class, null);
            ((InterfaceC1797690wsh) xBaseModelLIZJ).setCode(1);
            completionBlock.onSuccess((XBaseResultModel) xBaseModelLIZJ, "");
        }
        final C1801350wyb c1801350wyb = new C1801350wyb();
        String address = interfaceC1851850yI3.getAddress();
        String uri = interfaceC1851850yI3.getUri();
        String cluster = interfaceC1851850yI3.getCluster();
        String appId = interfaceC1851850yI3.getAppId();
        List<String> lang = interfaceC1851850yI3.getLang();
        if (lang == null) {
            lang = C13BV.INSTANCE;
        }
        DMASRSpeechOptions dMASRSpeechOptions = new DMASRSpeechOptions(address, uri, cluster, appId, lang, interfaceC1851850yI3.getTotalTimeOut().intValue(), interfaceC1851850yI3.getConnectTimeOut().intValue(), interfaceC1851850yI3.getReceiveTimeOut().intValue(), interfaceC1851850yI3.getAsrShowLang(), interfaceC1851850yI3.getAutoStop());
        final ?? r5 = new InterfaceC1801210wyN() { // from class: X.0wy0
            @Override // X.InterfaceC1801210wyN
            public final void LIZ(SpeechEngine speechEngine) {
                String containerID2;
                C1529880puk c1529880puk2 = SparkContext.Companion;
                InterfaceC634840OvC interfaceC634840OvC2 = this.IBridgeSdkContext;
                if (interfaceC634840OvC2 != null) {
                    containerID2 = interfaceC634840OvC2.getContainerID();
                } else {
                    containerID2 = null;
                }
                c1529880puk2.getClass();
                C1537480q70 c1537480q70LIZIZ2 = C1529880puk.LIZIZ(containerID2);
                if (c1537480q70LIZIZ2 != null) {
                    c1537480q70LIZIZ2.LJJ(C1801350wyb.class, c1801350wyb);
                }
                CompletionBlock<InterfaceC1797690wsh> completionBlock2 = completionBlock;
                XBaseModel xBaseModelLIZJ2 = C1909107dp.LIZJ(InterfaceC1797690wsh.class, null);
                ((InterfaceC1797690wsh) xBaseModelLIZJ2).setCode(1);
                completionBlock2.onSuccess((XBaseResultModel) xBaseModelLIZJ2, "");
            }

            @Override // X.InterfaceC1801210wyN
            public final void onFailure(Throwable th) {
                CompletionBlock<InterfaceC1797690wsh> completionBlock2 = completionBlock;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("speech engine init failed, reason: ");
                String message = th.getMessage();
                if (message == null) {
                    message = "Unknown error";
                }
                sbLIZ.append(message);
                C2382909Vj.LIZ(completionBlock2, 0, C2188811AlT.LIZIZ(sbLIZ), null, 4);
            }
        };
        C1851900yI8 c1851900yI8 = new Object() { // from class: X.0yI8
        };
        InterfaceC1801210wyN interfaceC1801210wyN = new InterfaceC1801210wyN() { // from class: X.0wyO
            @Override // X.InterfaceC1801210wyN
            public final void LIZ(SpeechEngine speechEngine) {
                C1801350wyb c1801350wyb2 = c1801350wyb;
                c1801350wyb2.LIZ = speechEngine;
                speechEngine.setListener(c1801350wyb2);
                r5.LIZ(speechEngine);
            }

            @Override // X.InterfaceC1801210wyN
            public final void onFailure(Throwable th) {
                r5.onFailure(th);
            }
        };
        c1851900yI8.getClass();
        try {
            SpeechEngine speechEngineGenerator = SpeechEngineGenerator.getInstance();
            if (!speechEngineGenerator.isEngineSupported("asr")) {
                speechEngineGenerator.destroyEngine();
                interfaceC1801210wyN.onFailure(new RuntimeException("not support ASR"));
            }
            speechEngineGenerator.createEngine();
            AccountUserService accountUserServiceLJIIJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ();
            if (accountUserServiceLJIIJ.isLogin()) {
                curUserId = accountUserServiceLJIIJ.getCurUserId();
            } else {
                curUserId = "DEFAULT_USER";
            }
            speechEngineGenerator.setOptionString("engine_name", "asr");
            speechEngineGenerator.setOptionString("log_level", "TRACE");
            speechEngineGenerator.setOptionString("uid", curUserId);
            speechEngineGenerator.setOptionBoolean("enable_get_volume", false);
            speechEngineGenerator.setOptionBoolean("recorder_disable_reuse", false);
            speechEngineGenerator.setOptionString("recorder_data_source_type", "Recorder");
            speechEngineGenerator.setOptionBoolean("asr_show_punctuation", true);
            speechEngineGenerator.setOptionString("asr_rec_path", "");
            speechEngineGenerator.setOptionBoolean("asr_show_utterances", true);
            speechEngineGenerator.setOptionBoolean("enable_get_volume", true);
            speechEngineGenerator.setOptionBoolean("asr_auto_stop", dMASRSpeechOptions.autoStop);
            speechEngineGenerator.setOptionInt("asr_conn_timeout", dMASRSpeechOptions.connectTimeOut);
            speechEngineGenerator.setOptionInt("asr_recv_timeout", dMASRSpeechOptions.receiveTimeOut);
            speechEngineGenerator.setOptionInt("vad_max_speech_duration", dMASRSpeechOptions.totalTimeOut);
            speechEngineGenerator.setOptionString("appid", dMASRSpeechOptions.appId);
            speechEngineGenerator.setOptionString("asr_address", dMASRSpeechOptions.address);
            speechEngineGenerator.setOptionString("asr_uri", dMASRSpeechOptions.uri);
            speechEngineGenerator.setOptionString("asr_cluster", dMASRSpeechOptions.cluster);
            String str2 = (String) C13LP.LJJJLL(dMASRSpeechOptions.language);
            if (str2 != null) {
                str = str2;
            }
            speechEngineGenerator.setOptionString("asr_language", str);
            speechEngineGenerator.setOptionInt("fulllink_max_valid_speech_duration", C538540LAe.LLJJJIL);
            speechEngineGenerator.setOptionBoolean("asr_enable_itn", true);
            speechEngineGenerator.setOptionString("asr_vad_mode", "normal_vad");
            if (speechEngineGenerator.initEngine() != 0) {
                interfaceC1801210wyN.onFailure(new RuntimeException("init engine failed"));
            }
            interfaceC1801210wyN.LIZ(speechEngineGenerator);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LIZJ("asr_engine_loadso_failed_2");
            interfaceC1801210wyN.onFailure(th);
        }
    }
}
