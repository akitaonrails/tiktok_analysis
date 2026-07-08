package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreTtsResult;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import com.ss.android.ugc.aweme.services.audio.ITTSService;
import com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TtsReuseServiceImpl;
import java.io.File;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05WS, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editor.audioservice.service.texttospeach.TtsReuseServiceImpl$fetchTtsAudioFile$2", f = "TtsReuseServiceImpl.kt", l = {57}, m = "invokeSuspend")
public final class C05WS extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ TtsReuseServiceImpl LLILZIL;
    public final /* synthetic */ boolean LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05WS(TtsReuseServiceImpl ttsReuseServiceImpl, String str, String str2, String str3, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = ttsReuseServiceImpl;
        this.LLILZLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05WS(this.LLILZIL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn, this.LLILZLL);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        Unit unit;
        boolean z;
        C1C7U.LIZ("TtsReuseServiceImpl@25ea.fetchTtsAudioFile$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            final String str2 = this.LLILLJJLI;
            final String str3 = this.LLILLL;
            final String str4 = this.LLILZ;
            TtsReuseServiceImpl ttsReuseServiceImpl = this.LLILZIL;
            boolean z2 = this.LLILZLL;
            if (C123100dR.LIZ(str2)) {
                str = str2;
            } else {
                str = str3;
            }
            String strLIZIZ = C05WW.LIZ.LIZIZ(str4, str);
            if (C123100dR.LIZ(strLIZIZ) && C2354709Kn.LIZIZ(strLIZIZ)) {
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("TtsReuseServiceImpl@25ea.fetchTtsAudioFile$2");
                return unit2;
            }
            ITTSService iTTSService = (ITTSService) ttsReuseServiceImpl.LIZIZ.getValue();
            if (iTTSService != null) {
                String strLIZ = C2279608wU.LIZ();
                if (z2) {
                    z = true;
                } else {
                    z = false;
                }
                ITTSCallback iTTSCallback = new ITTSCallback() { // from class: X.05WT
                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onCancel(int i2) {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onConnectToServerSuc() {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onFailure(int i2, int i3, String str5, String str6, SAMICoreServerEvent sAMICoreServerEvent) {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onFirstAudioReceived(SAMICoreTtsResult sAMICoreTtsResult) {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onStreamTTSPlayFinish() {
                    }

                    @Override // com.ss.android.ugc.aweme.services.audio.ITTSCallback
                    public final void onSuccess(int i2, File file, String str5, SAMICoreServerEvent sAMICoreServerEvent) {
                        String str6;
                        if (file.exists()) {
                            if (C123100dR.LIZ(str2)) {
                                str6 = str2;
                            } else {
                                str6 = str3;
                            }
                            C05WW c05ww = C05WW.LIZ;
                            String str7 = str4;
                            String absolutePath = file.getAbsolutePath();
                            synchronized (c05ww) {
                                if (str7 != null) {
                                    if (str7.length() != 0 && str6 != null && str6.length() != 0 && absolutePath != null && absolutePath.length() != 0) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(str7);
                                        sbLIZ.append(str6);
                                        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                                        ConcurrentHashMap<String, String> concurrentHashMap = C05WW.LIZIZ;
                                        if (absolutePath != null) {
                                            concurrentHashMap.put(strLIZIZ2, absolutePath);
                                        } else {
                                            "Required value was null.".toString();
                                            throw new IllegalArgumentException("Required value was null.");
                                        }
                                    }
                                }
                            }
                        }
                    }
                };
                this.LL = 1;
                if (iTTSService.fetchTTSAudioFile(str3, str2, str4, strLIZ, z, false, iTTSCallback, (InterfaceC1364105Vn<? super Unit>) this) == objLJFF) {
                    C1C7U.LIZIZ("TtsReuseServiceImpl@25ea.fetchTtsAudioFile$2");
                    return objLJFF;
                }
            } else {
                unit = null;
                C189200o6.m2constructorimpl(unit);
                Unit unit3 = Unit.LIZ;
                C1C7U.LIZIZ("TtsReuseServiceImpl@25ea.fetchTtsAudioFile$2");
                return unit3;
            }
        }
        unit = Unit.LIZ;
        C189200o6.m2constructorimpl(unit);
        Unit unit32 = Unit.LIZ;
        C1C7U.LIZIZ("TtsReuseServiceImpl@25ea.fetchTtsAudioFile$2");
        return unit32;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
