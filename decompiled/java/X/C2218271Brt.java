package X;

import Y.ARunnableS103S0200000_34;
import android.os.Process;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.SAMICoreCallBackListener;
import com.mammon.audiosdk.enums.SAMICoreCallBackEventType;
import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.enums.SAMICoreIdentify;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.enums.SAMICoreTokenType;
import com.mammon.audiosdk.structures.SAMICoreAudioConfig;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreProperty;
import com.mammon.audiosdk.structures.SAMICoreServerEvent;
import com.mammon.audiosdk.structures.SAMICoreVcContextCreateParameter;
import com.mammon.audiosdk.structures.SAMICoreVcResult;
import com.mammon.audiosdk.structures.SAMICoreVcSpeakerParameter;
import com.mammon.audiosdk.structures.SAMICoreWebSocketConnectionEvent;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS281S0000000_34;
import kotlin.jvm.internal.AwS613S0100000_34;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1Brt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2218271Brt implements InterfaceC379610EuV {
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LLJJJJLIIL;
    public final C1DRG LL;
    public final C1664750tQH LLILLJJLI;
    public boolean LLILZ;
    public boolean LLILZIL;
    public volatile boolean LLIZ;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public final C2217131Bq3 LLJJIII;
    public final C2217131Bq3 LLJJIJI;
    public final C2217131Bq3 LLJJIJIIJIL;
    public boolean LLJJIJIL;
    public final int LLJJJ;
    public int LLJJJIL;
    public boolean LLJJJJ;
    public final C2218261Brs LLJJJJJIL;
    public final ReentrantLock LLILLL = new ReentrantLock();
    public SAMICore LLILZLL = new SAMICore();
    public String LLIZLLLIL = "";
    public String LLJ = "";
    public Effect LLJI = new Effect(null, null, null, null, null, null, null, null, null, null, 0, null, null, null, null, null, null, null, 0, 0, 0, null, null, null, null, null, null, null, null, null, null, false, null, false, null, null, 0, null, null, 0, null, null, null, null, null, false, null, null, null, null, null, null, null, null, null, 0, null, null, null, 0, 0, null, null, null, null, null, false, false, -1, -1, 15, null);
    public C1461250o83 LLJIJIL = new C1461250o83(null, null, null, null, 511);
    public Function1<? super C1663870tOr, Unit> LLJILJIL = AFwS281S0000000_34.get$arr$(67);

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C2218271Brt.class, "shortVideoContext", "getShortVideoContext()Lcom/ss/android/ugc/aweme/shortvideo/ShortVideoContext;", 0);
        C13LE.LIZ.getClass();
        LLJJJJLIIL = new InterfaceC2217461Bqa[]{c2217381BqS};
    }

    public final synchronized void LJII() {
        try {
            this.LLILLL.lock();
            if (!this.LLIZ) {
                this.LLILLL.unlock();
                return;
            }
            if (this.LLILZ) {
                this.LLILLL.unlock();
                return;
            }
            this.LLILZ = true;
            System.currentTimeMillis();
            SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
            sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Stop_Server;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("zxzzz_SamiSVC: Stop_Server START ... , isShootingScene = ");
            sbLIZ.append(this.LLJJ);
            sbLIZ.append(", isPreviewScene = ");
            sbLIZ.append(this.LLJILLL);
            sbLIZ.append(", thread_id = ");
            sbLIZ.append(Process.myTid());
            sbLIZ.append(", thread_name = ");
            sbLIZ.append(C786410Ut5.u3().getName());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
            int iSAMICoreSetProperty = this.LLILZLL.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_VC_Online, sAMICoreProperty);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("zxzzz_SamiSVC: ... Stop_Server STOP , isShootingScene = ");
            sbLIZ2.append(this.LLJJ);
            sbLIZ2.append(", isPreviewScene = ");
            sbLIZ2.append(this.LLJILLL);
            sbLIZ2.append(", thread_id = ");
            sbLIZ2.append(Process.myTid());
            sbLIZ2.append(", thread_name = ");
            sbLIZ2.append(C786410Ut5.u3().getName());
            C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
            if (iSAMICoreSetProperty != 0) {
                LJIIIIZZ(new C1663870tOr("EVENT_SDK_FAILED"));
            }
            LIZIZ(new AwS613S0100000_34(this, 153));
            this.LLILLL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.unlock();
            throw th;
        }
    }

    public final ShortVideoContext LIZ() {
        return (ShortVideoContext) this.LLILLJJLI.getValue(this, LLJJJJLIIL[0]);
    }

    public final void LIZJ() {
        try {
            this.LLILLL.lock();
            if (this.LLIZ) {
                this.LLIZ = false;
            } else {
                this.LLIZ = true;
                System.currentTimeMillis();
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("zxzzz_SamiSVC: new SAMICore START ... , isShootingScene = ");
                sbLIZ.append(this.LLJJ);
                sbLIZ.append(", isPreviewScene = ");
                sbLIZ.append(this.LLJILLL);
                sbLIZ.append(", thread_id = ");
                sbLIZ.append(Process.myTid());
                sbLIZ.append(", thread_name = ");
                sbLIZ.append(C786410Ut5.u3().getName());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                SAMICore sAMICore = new SAMICore();
                this.LLILZLL = sAMICore;
                sAMICore.setListener(this.LLJJJJJIL);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("zxzzz_SamiSVC: ... new SAMICore STOP , isShootingScene = ");
                sbLIZ2.append(this.LLJJ);
                sbLIZ2.append(", isPreviewScene = ");
                sbLIZ2.append(this.LLJILLL);
                sbLIZ2.append(", thread_id = ");
                sbLIZ2.append(Process.myTid());
                sbLIZ2.append(", thread_name = ");
                sbLIZ2.append(C786410Ut5.u3().getName());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                SAMICoreVcContextCreateParameter sAMICoreVcContextCreateParameter = new SAMICoreVcContextCreateParameter();
                sAMICoreVcContextCreateParameter.url = "wss://sami.tiktokv.com/internal/api/v1/ws";
                sAMICoreVcContextCreateParameter.appKey = "vtSCUDJCnW";
                sAMICoreVcContextCreateParameter.tokenType = SAMICoreTokenType.TOKEN_TO_C_D;
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("{\n    \"passport-auth\":\"session\",\n    \"x-tt-token\":\"");
                sbLIZ3.append(C0CHQ.LIZ().getAccountService().getUserTTToken());
                sbLIZ3.append("\",\n    \"sdk-version\":\"");
                C0CHQ.LIZ().getAccountService().getSDKVersion();
                sbLIZ3.append("2");
                sbLIZ3.append("\",\n    \"cookie\":\"sessionid=");
                sbLIZ3.append(((AbstractC848400XPy) C0XQ7.LJFF()).LJIIZILJ());
                sbLIZ3.append("\"\n}");
                sAMICoreVcContextCreateParameter.token = C2188811AlT.LIZIZ(sbLIZ3);
                BPEAHandler bPEAHandler = C1462900oAi.LIZ;
                sAMICoreVcContextCreateParameter.saveFileDir = C1462900oAi.LIZ(LIZ().creativeInfo);
                sAMICoreVcContextCreateParameter.enableAudioCache = true;
                sAMICoreVcContextCreateParameter.audioCacheSize = 882000;
                sAMICoreVcContextCreateParameter.connectTimeout = 8000;
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("zxzzz_SamiSVC: createHandle START ... , isShootingScene = ");
                sbLIZ4.append(this.LLJJ);
                sbLIZ4.append(", isPreviewScene = ");
                sbLIZ4.append(this.LLJILLL);
                sbLIZ4.append(", thread_id = ");
                sbLIZ4.append(Process.myTid());
                sbLIZ4.append(", thread_name = ");
                sbLIZ4.append(C786410Ut5.u3().getName());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                int iSAMICoreCreateHandleByIdentify = this.LLILZLL.SAMICoreCreateHandleByIdentify(SAMICoreIdentify.SAMICoreIdentify_Streaming_VC_Online, sAMICoreVcContextCreateParameter);
                StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                sbLIZ5.append("zxzzz_SamiSVC: ... createHandle STOP , isShootingScene = ");
                sbLIZ5.append(this.LLJJ);
                sbLIZ5.append(", isPreviewScene = ");
                sbLIZ5.append(this.LLJILLL);
                sbLIZ5.append(", thread_id = ");
                sbLIZ5.append(Process.myTid());
                sbLIZ5.append(", thread_name = ");
                sbLIZ5.append(C786410Ut5.u3().getName());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ5));
                if (iSAMICoreCreateHandleByIdentify == 0) {
                    System.currentTimeMillis();
                    SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                    sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Open_Loudspeaker;
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("zxzzz_SamiSVC: Open_Loudspeaker START ... , isShootingScene = ");
                    sbLIZ6.append(this.LLJJ);
                    sbLIZ6.append(", isPreviewScene = ");
                    sbLIZ6.append(this.LLJILLL);
                    sbLIZ6.append(", thread_id = ");
                    sbLIZ6.append(Process.myTid());
                    sbLIZ6.append(", thread_name = ");
                    sbLIZ6.append(C786410Ut5.u3().getName());
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ6));
                    int iSAMICoreSetProperty = this.LLILZLL.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_VC_Online, sAMICoreProperty);
                    StringBuilder sbLIZ7 = C2188811AlT.LIZ();
                    sbLIZ7.append("zxzzz_SamiSVC: ... Open_Loudspeaker STOP , isShootingScene = ");
                    sbLIZ7.append(this.LLJJ);
                    sbLIZ7.append(", isPreviewScene = ");
                    sbLIZ7.append(this.LLJILLL);
                    sbLIZ7.append(", thread_id = ");
                    sbLIZ7.append(Process.myTid());
                    sbLIZ7.append(", thread_name = ");
                    sbLIZ7.append(C786410Ut5.u3().getName());
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ7));
                    if (iSAMICoreSetProperty != 0) {
                        C1663870tOr c1663870tOr = new C1663870tOr("EVENT_SDK_FAILED");
                        c1663870tOr.LIZIZ = 2001;
                        LJIIIIZZ(c1663870tOr);
                        if (this.LLJILLL) {
                            this.LLJJIII.LJII("2001", "open_loudspeaker failed", false);
                            this.LLJJIJI.LJII("2001", "open_loudspeaker failed", false);
                        }
                        if (this.LLJJ) {
                            this.LLJJIJIIJIL.LJII("2001", "open_loudspeaker failed", false);
                        }
                    }
                }
            }
            this.LLILLL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.unlock();
            throw th;
        }
    }

    public final void LJ() {
        try {
            this.LLILLL.lock();
            if (this.LLIZ) {
                C1663660tOW c1663660tOW = C1663660tOW.LIZ;
                ShortVideoContext shortVideoContextLIZ = LIZ();
                Effect effect = this.LLJI;
                c1663660tOW.getClass();
                C1663660tOW.LJ(shortVideoContextLIZ, effect);
                this.LLJJIII.LIZIZ();
                this.LLJJIJI.LIZIZ();
                this.LLJJIJIIJIL.LIZIZ();
                System.currentTimeMillis();
                SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Audio_Start_Play;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("zxzzz_SamiSVC: Start_Play START ... , isShootingScene = ");
                sbLIZ.append(this.LLJJ);
                sbLIZ.append(", isPreviewScene = ");
                sbLIZ.append(this.LLJILLL);
                sbLIZ.append(", thread_id = ");
                sbLIZ.append(Process.myTid());
                sbLIZ.append(", thread_name = ");
                sbLIZ.append(C786410Ut5.u3().getName());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                int iSAMICoreSetProperty = this.LLILZLL.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_VC_Online, sAMICoreProperty);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("zxzzz_SamiSVC: ... Start_Play STOP , isShootingScene = ");
                sbLIZ2.append(this.LLJJ);
                sbLIZ2.append(", isPreviewScene = ");
                sbLIZ2.append(this.LLJILLL);
                sbLIZ2.append(", thread_id = ");
                sbLIZ2.append(Process.myTid());
                sbLIZ2.append(", thread_name = ");
                sbLIZ2.append(C786410Ut5.u3().getName());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                if (iSAMICoreSetProperty != 0) {
                    LJIIIIZZ(new C1663870tOr("EVENT_SDK_FAILED"));
                }
            }
            this.LLILLL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.unlock();
            throw th;
        }
    }

    public final void LJI() {
        try {
            this.LLILLL.lock();
            if (this.LLIZ) {
                System.currentTimeMillis();
                SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Audio_Stop_Play;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("zxzzz_SamiSVC: Stop_Play START ... , isShootingScene = ");
                sbLIZ.append(this.LLJJ);
                sbLIZ.append(", isPreviewScene = ");
                sbLIZ.append(this.LLJILLL);
                sbLIZ.append(", thread_id = ");
                sbLIZ.append(Process.myTid());
                sbLIZ.append(", thread_name = ");
                sbLIZ.append(C786410Ut5.u3().getName());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                int iSAMICoreSetProperty = this.LLILZLL.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyId_VC_Online, sAMICoreProperty);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("zxzzz_SamiSVC: ... Stop_Play STOP , isShootingScene = ");
                sbLIZ2.append(this.LLJJ);
                sbLIZ2.append(", isPreviewScene = ");
                sbLIZ2.append(this.LLJILLL);
                sbLIZ2.append(", thread_id = ");
                sbLIZ2.append(Process.myTid());
                sbLIZ2.append(", thread_name = ");
                sbLIZ2.append(C786410Ut5.u3().getName());
                C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                if (iSAMICoreSetProperty != 0) {
                    LJIIIIZZ(new C1663870tOr("EVENT_SDK_FAILED"));
                }
                LIZIZ(new AwS613S0100000_34(this, 152));
                if (this.LLJILLL && this.LLJJIJIL) {
                    this.LLJJIJI.LJII(CardStruct.IStatusCode.DEFAULT, "success", true);
                }
            }
            this.LLILLL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.unlock();
            throw th;
        }
    }

    @Override // X.InterfaceC379610EuV
    public final C1DRG getDiContainer() {
        return this.LL;
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [X.1Brs] */
    public C2218271Brt(C1DRG c1drg) {
        this.LL = c1drg;
        this.LLILLJJLI = C1664770tQJ.LIZ(c1drg, ShortVideoContext.class, null);
        C2217131Bq3 c2217131Bq3 = new C2217131Bq3(LIZ());
        c2217131Bq3.LIZ(2);
        this.LLJJIII = c2217131Bq3;
        C2217131Bq3 c2217131Bq32 = new C2217131Bq3(LIZ());
        c2217131Bq32.LIZ(1);
        this.LLJJIJI = c2217131Bq32;
        C2217131Bq3 c2217131Bq33 = new C2217131Bq3(LIZ());
        c2217131Bq33.LIZ(3);
        this.LLJJIJIIJIL = c2217131Bq33;
        this.LLJJJ = 60;
        this.LLJJJJ = true;
        this.LLJJJJJIL = new SAMICoreCallBackListener() { // from class: X.1Brs
            @Override // com.mammon.audiosdk.SAMICoreCallBackListener
            public final void onMessageReceived(SAMICoreCallBackEventType sAMICoreCallBackEventType, SAMICoreBlock sAMICoreBlock) {
                String strOptString;
                String strOptString2 = "";
                if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.VC_Started) {
                    if (sAMICoreBlock.dataType == SAMICoreDataType.SAMICoreDataType_WebSocket_Server_Event) {
                        this.LIZ.LJIIIIZZ(new C1663870tOr("EVENT_VC_STARTED"));
                        SAMICoreServerEvent sAMICoreServerEvent = (SAMICoreServerEvent) sAMICoreBlock.audioData[0];
                        this.LIZ.LLJJIII.LIZJ(sAMICoreServerEvent.taskId);
                        this.LIZ.LLJJIJI.LIZJ(sAMICoreServerEvent.taskId);
                        this.LIZ.LLJJIJIIJIL.LIZJ(sAMICoreServerEvent.taskId);
                        C2218271Brt c2218271Brt = this.LIZ;
                        c2218271Brt.LIZIZ(new AwS613S0100000_34(c2218271Brt, 147));
                        this.LIZ.LLJJIII.LJ();
                        this.LIZ.LLJJIJI.LJ();
                        this.LIZ.LLJJIJIIJIL.LJ();
                        int i = sAMICoreServerEvent.statusCode;
                        if (i != 20000000) {
                            String strValueOf = String.valueOf(i);
                            if (!C123100dR.LIZ(strValueOf)) {
                                strValueOf = "5003";
                            }
                            String str = sAMICoreServerEvent.statusText;
                            if (!C123100dR.LIZ(str)) {
                                str = "vc start failed";
                            }
                            C2218271Brt c2218271Brt2 = this.LIZ;
                            if (c2218271Brt2.LLJILLL) {
                                c2218271Brt2.LLJJIII.LJII(strValueOf, str, false);
                                this.LIZ.LLJJIJI.LJII(strValueOf, str, false);
                            }
                            C2218271Brt c2218271Brt3 = this.LIZ;
                            if (c2218271Brt3.LLJJ) {
                                c2218271Brt3.LLJJIJIIJIL.LJII(strValueOf, str, false);
                            }
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("type = VC_Started    , event:");
                        sbLIZ.append(sAMICoreServerEvent.event);
                        sbLIZ.append(", statusCode:");
                        sbLIZ.append(sAMICoreServerEvent.statusCode);
                        sbLIZ.append(", statusText:");
                        sbLIZ.append(sAMICoreServerEvent.statusText);
                        sbLIZ.append(", taskId:");
                        sbLIZ.append(sAMICoreServerEvent.taskId);
                        sbLIZ.append(", messageId:");
                        sbLIZ.append(sAMICoreServerEvent.messageId);
                        C2188811AlT.LIZIZ(sbLIZ);
                        return;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("VC_Started, data type not support: ");
                    sbLIZ2.append(sAMICoreBlock.dataType);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    return;
                }
                if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.VC_GetResulted) {
                    if (sAMICoreBlock.dataType != SAMICoreDataType.SAMICoreDataType_AudioBin) {
                        return;
                    }
                    SAMICoreVcResult sAMICoreVcResult = (SAMICoreVcResult) sAMICoreBlock.audioData[0];
                    C2218271Brt c2218271Brt4 = this.LIZ;
                    if (c2218271Brt4.LLJJJJ) {
                        c2218271Brt4.LLJJJJ = false;
                        c2218271Brt4.LJIIIIZZ(new C1663870tOr("EVENT_VC_GET_RESULT_RECEIVE_FIRST_PACKET"));
                        this.LIZ.LLJJIII.LIZLLL();
                        this.LIZ.LLJJIJI.LIZLLL();
                        this.LIZ.LLJJIJIIJIL.LIZLLL();
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("type=VC_GetResulted, First Packet ：audio len ");
                        sbLIZ3.append(sAMICoreVcResult.data.length);
                        C2188811AlT.LIZIZ(sbLIZ3);
                        return;
                    }
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("type=VC_GetResulted, Continuing Packets：audio len ");
                    sbLIZ4.append(sAMICoreVcResult.data.length);
                    C2188811AlT.LIZIZ(sbLIZ4);
                    return;
                }
                if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.VC_Finished) {
                    if (sAMICoreBlock.dataType != SAMICoreDataType.SAMICoreDataType_WebSocket_Server_Event) {
                        return;
                    }
                    SAMICoreServerEvent sAMICoreServerEvent2 = (SAMICoreServerEvent) sAMICoreBlock.audioData[0];
                    this.LIZ.LLJJIII.LJFF();
                    this.LIZ.LLJJIJI.LJFF();
                    this.LIZ.LLJJIJIIJIL.LJFF();
                    C2218271Brt c2218271Brt5 = this.LIZ;
                    c2218271Brt5.LIZIZ(new AwS613S0100000_34(c2218271Brt5, 148));
                    try {
                        strOptString = new JSONObject(sAMICoreServerEvent2.textMsg).optString("output_audio_file", "");
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        strOptString = "";
                    }
                    try {
                        strOptString2 = new JSONObject(sAMICoreServerEvent2.textMsg).optString("input_audio_file", "");
                    } catch (Exception e2) {
                        TryCatchGuardChecker.doCheck(e2);
                    }
                    StringBuilder sb = new StringBuilder();
                    BPEAHandler bPEAHandler = C1462900oAi.LIZ;
                    sb.append(C1462900oAi.LIZ(this.LIZ.LIZ().creativeInfo));
                    sb.append('/');
                    sb.append(this.LIZ.LLIZLLLIL);
                    sb.append("_vc_input_audio.pcm");
                    String string = sb.toString();
                    C2286708xd.LJFF(strOptString2, string);
                    Effect effect = this.LIZ.LLJI;
                    this.LIZ.LLJIJIL = new C1461250o83(strOptString, string, effect, effect.getEffect_id(), 400);
                    long length = new C0VSJ(strOptString).length();
                    C2217131Bq3 c2217131Bq34 = this.LIZ.LLJJIII;
                    if (!c2217131Bq34.LIZLLL) {
                        c2217131Bq34.LIZ.LIZIZ(length, "vc_file_size");
                    }
                    C2217131Bq3 c2217131Bq35 = this.LIZ.LLJJIJI;
                    if (!c2217131Bq35.LIZLLL) {
                        c2217131Bq35.LIZ.LIZIZ(length, "vc_file_size");
                    }
                    C2217131Bq3 c2217131Bq36 = this.LIZ.LLJJIJIIJIL;
                    if (!c2217131Bq36.LIZLLL) {
                        c2217131Bq36.LIZ.LIZIZ(length, "vc_file_size");
                    }
                    long length2 = new C0VSJ(strOptString2).length();
                    C2217131Bq3 c2217131Bq37 = this.LIZ.LLJJIII;
                    if (!c2217131Bq37.LIZLLL) {
                        c2217131Bq37.LIZ.LIZIZ(length2, "origin_file_size");
                    }
                    C2217131Bq3 c2217131Bq38 = this.LIZ.LLJJIJI;
                    if (!c2217131Bq38.LIZLLL) {
                        c2217131Bq38.LIZ.LIZIZ(length2, "origin_file_size");
                    }
                    C2217131Bq3 c2217131Bq39 = this.LIZ.LLJJIJIIJIL;
                    if (!c2217131Bq39.LIZLLL) {
                        c2217131Bq39.LIZ.LIZIZ(length2, "origin_file_size");
                    }
                    C2218271Brt c2218271Brt6 = this.LIZ;
                    if (c2218271Brt6.LLJILLL) {
                        c2218271Brt6.LLJJIII.LJII(CardStruct.IStatusCode.DEFAULT, "success", true);
                    }
                    C2218271Brt c2218271Brt7 = this.LIZ;
                    if (c2218271Brt7.LLJJ) {
                        c2218271Brt7.LLJJIJIIJIL.LJII(CardStruct.IStatusCode.DEFAULT, "success", true);
                    }
                    if (sAMICoreServerEvent2.statusCode == 20000000) {
                        C2218271Brt c2218271Brt8 = this.LIZ;
                        if (c2218271Brt8.LLJILLL) {
                            C1663660tOW c1663660tOW = C1663660tOW.LIZ;
                            ShortVideoContext shortVideoContextLIZ = c2218271Brt8.LIZ();
                            Effect effect2 = this.LIZ.LLJI;
                            long j = (length2 * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) / ((long) 88200);
                            c1663660tOW.getClass();
                            C0LAB c0labLJII = C1663660tOW.LJII(shortVideoContextLIZ);
                            c0labLJII.LJ("effect_id", effect2.getEffect_id());
                            c0labLJII.LJ("effect_name", effect2.getName());
                            c0labLJII.LIZIZ(j, "duration");
                            C20684815ws.LJIILLIIL("voice_effect_preview_record_vc_end", c0labLJII.LIZ);
                        }
                    }
                    C2218271Brt c2218271Brt9 = this.LIZ;
                    C1663870tOr c1663870tOr = new C1663870tOr("EVENT_VC_FINISHED");
                    c1663870tOr.LIZIZ = sAMICoreServerEvent2.statusCode;
                    c2218271Brt9.LJIIIIZZ(c1663870tOr);
                    return;
                }
                if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.VC_Failed) {
                    if (sAMICoreBlock.dataType == SAMICoreDataType.SAMICoreDataType_WebSocket_Server_Event) {
                        this.LIZ.LLJJIII.LJFF();
                        this.LIZ.LLJJIJI.LJFF();
                        this.LIZ.LLJJIJIIJIL.LJFF();
                        C2218271Brt c2218271Brt10 = this.LIZ;
                        c2218271Brt10.LIZIZ(new AwS613S0100000_34(c2218271Brt10, 149));
                        SAMICoreServerEvent sAMICoreServerEvent3 = (SAMICoreServerEvent) sAMICoreBlock.audioData[0];
                        String strValueOf2 = String.valueOf(sAMICoreServerEvent3.statusCode);
                        if (!C123100dR.LIZ(strValueOf2)) {
                            strValueOf2 = "5004";
                        }
                        String str2 = sAMICoreServerEvent3.statusText;
                        if (!C123100dR.LIZ(str2)) {
                            str2 = "vc failed";
                        }
                        C2218271Brt c2218271Brt11 = this.LIZ;
                        if (c2218271Brt11.LLJILLL) {
                            c2218271Brt11.LLJJIII.LJII(strValueOf2, str2, false);
                        }
                        C2218271Brt c2218271Brt12 = this.LIZ;
                        if (c2218271Brt12.LLJJ) {
                            c2218271Brt12.LLJJIJIIJIL.LJII(strValueOf2, str2, false);
                        }
                        C2218271Brt c2218271Brt13 = this.LIZ;
                        C1663870tOr c1663870tOr2 = new C1663870tOr("EVENT_VC_FAILED");
                        c1663870tOr2.LIZIZ = sAMICoreServerEvent3.statusCode;
                        c2218271Brt13.LJIIIIZZ(c1663870tOr2);
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("type = VC_Failed    , event:");
                        sbLIZ5.append(sAMICoreServerEvent3.event);
                        sbLIZ5.append(", statusCode:");
                        sbLIZ5.append(sAMICoreServerEvent3.statusCode);
                        sbLIZ5.append(", statusText:");
                        sbLIZ5.append(sAMICoreServerEvent3.statusText);
                        sbLIZ5.append(", taskId:");
                        sbLIZ5.append(sAMICoreServerEvent3.taskId);
                        sbLIZ5.append(", messageId:");
                        sbLIZ5.append(sAMICoreServerEvent3.messageId);
                        C2188811AlT.LIZIZ(sbLIZ5);
                        return;
                    }
                    StringBuilder sbLIZ6 = C2188811AlT.LIZ();
                    sbLIZ6.append("VC_Failed, data type not support: ");
                    sbLIZ6.append(sAMICoreBlock.dataType);
                    C2188811AlT.LIZIZ(sbLIZ6);
                    return;
                }
                if (sAMICoreCallBackEventType == SAMICoreCallBackEventType.VC_WebSocketStateChanged) {
                    if (sAMICoreBlock.dataType != SAMICoreDataType.SAMICoreDataType_WebSocket_Connection_Event) {
                        return;
                    }
                    SAMICoreWebSocketConnectionEvent sAMICoreWebSocketConnectionEvent = (SAMICoreWebSocketConnectionEvent) sAMICoreBlock.audioData[0];
                    C2218271Brt c2218271Brt14 = this.LIZ;
                    c2218271Brt14.LIZIZ(new AwS613S0100000_34(c2218271Brt14, 150));
                    int i2 = sAMICoreWebSocketConnectionEvent.state;
                    if (i2 == 2) {
                        C2218271Brt c2218271Brt15 = this.LIZ;
                        c2218271Brt15.LLJILJILJ = true;
                        c2218271Brt15.LLJJIII.LJFF();
                        this.LIZ.LLJJIJI.LJFF();
                        this.LIZ.LLJJIJIIJIL.LJFF();
                        this.LIZ.LJIIIIZZ(new C1663870tOr("EVENT_VC_WEBSOCKET_CONNECT_FAILED"));
                        return;
                    }
                    if (i2 == 0) {
                        this.LIZ.LJIIIIZZ(new C1663870tOr("EVENT_VC_WEBSOCKET_CONNECTING"));
                        return;
                    } else {
                        if (i2 != 4) {
                            return;
                        }
                        this.LIZ.LLJJIII.LJI();
                        this.LIZ.LLJJIJI.LJI();
                        this.LIZ.LLJJIJIIJIL.LJI();
                        this.LIZ.LJIIIIZZ(new C1663870tOr("EVENT_VC_WEBSOCKET_CONNECTED"));
                        return;
                    }
                }
                if (sAMICoreCallBackEventType != SAMICoreCallBackEventType.VC_Player_Finished) {
                    return;
                }
                this.LIZ.LJIIIIZZ(new C1663870tOr("EVENT_VC_PLAY_FINISHED"));
                this.LIZ.LLJJIJIL = true;
            }
        };
    }

    public final void LIZIZ(Function1<? super JSONObject, Unit> function1) {
        C09UZ.LIZ(new ARunnableS103S0200000_34(this, function1, 39));
    }

    public final void LJFF(Effect effect) {
        boolean z;
        try {
            this.LLILLL.lock();
            String strLJIIIIZZ = C1664460tPo.LJIIIIZZ(effect);
            String strLIZIZ = C1664460tPo.LIZIZ(effect);
            if (this.LLIZ) {
                if (strLJIIIIZZ.length() != 0) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C1663870tOr c1663870tOr = new C1663870tOr("EVENT_SDK_FAILED");
                    c1663870tOr.LIZIZ = 5001;
                    LJIIIIZZ(c1663870tOr);
                    if (this.LLJILLL) {
                        this.LLJJIII.LJII("5001", "empty speaker_id", false);
                        this.LLJJIJI.LJII("5001", "empty speaker_id", false);
                    }
                    if (this.LLJJ) {
                        this.LLJJIJIIJIL.LJII("5001", "empty speaker_id", false);
                    }
                } else {
                    if (this.LLJILLL) {
                        C1663660tOW c1663660tOW = C1663660tOW.LIZ;
                        ShortVideoContext shortVideoContextLIZ = LIZ();
                        Effect effect2 = this.LLJI;
                        c1663660tOW.getClass();
                        C0LAB c0labLJII = C1663660tOW.LJII(shortVideoContextLIZ);
                        c0labLJII.LJ("effect_id", effect2.getEffect_id());
                        c0labLJII.LJ("effect_name", effect2.getName());
                        C20684815ws.LJIILLIIL("voice_effect_preview_record_vc_start", c0labLJII.LIZ);
                    }
                    this.LLIZLLLIL = strLJIIIIZZ;
                    this.LLJI = effect;
                    this.LLJ = strLIZIZ;
                    C2217131Bq3 c2217131Bq3 = this.LLJJIII;
                    c2217131Bq3.LIZJ = effect;
                    c2217131Bq3.LIZIZ();
                    C2217131Bq3 c2217131Bq32 = this.LLJJIJI;
                    c2217131Bq32.LIZJ = effect;
                    c2217131Bq32.LIZIZ();
                    C2217131Bq3 c2217131Bq33 = this.LLJJIJIIJIL;
                    c2217131Bq33.LIZJ = effect;
                    c2217131Bq33.LIZIZ();
                    System.currentTimeMillis();
                    SAMICoreVcSpeakerParameter sAMICoreVcSpeakerParameter = new SAMICoreVcSpeakerParameter();
                    sAMICoreVcSpeakerParameter.speaker = strLJIIIIZZ;
                    sAMICoreVcSpeakerParameter.enableSaveInputAudioData = true;
                    sAMICoreVcSpeakerParameter.enableSaveOutputAudioData = true;
                    sAMICoreVcSpeakerParameter.enableBackground = true;
                    sAMICoreVcSpeakerParameter.enablePlaying = true;
                    sAMICoreVcSpeakerParameter.playerCacheTime = 500;
                    SAMICoreAudioConfig sAMICoreAudioConfig = new SAMICoreAudioConfig();
                    sAMICoreVcSpeakerParameter.inputAudioConfig = sAMICoreAudioConfig;
                    sAMICoreAudioConfig.sampleRate = 44100;
                    sAMICoreAudioConfig.channel = 1;
                    sAMICoreAudioConfig.format = "s16le";
                    SAMICoreAudioConfig sAMICoreAudioConfig2 = new SAMICoreAudioConfig();
                    sAMICoreVcSpeakerParameter.outputAudioConfig = sAMICoreAudioConfig2;
                    sAMICoreAudioConfig2.sampleRate = 24000;
                    sAMICoreAudioConfig2.channel = 1;
                    sAMICoreAudioConfig2.format = "s16le";
                    SAMICoreProperty sAMICoreProperty = new SAMICoreProperty();
                    sAMICoreProperty.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Set_Speaker;
                    sAMICoreProperty.type = SAMICoreDataType.SAMICoreDataType_WebSocket_Vc_Speaker;
                    sAMICoreProperty.dataObjectArray = new Object[]{sAMICoreVcSpeakerParameter};
                    sAMICoreProperty.dataArrayLen = 1;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("zxzzz_SamiSVC: WebSocket_Vc_Speaker START ... , isShootingScene = ");
                    sbLIZ.append(this.LLJJ);
                    sbLIZ.append(", isPreviewScene = ");
                    sbLIZ.append(this.LLJILLL);
                    sbLIZ.append(", thread_id = ");
                    sbLIZ.append(Process.myTid());
                    sbLIZ.append(", thread_name = ");
                    sbLIZ.append(C786410Ut5.u3().getName());
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ));
                    SAMICore sAMICore = this.LLILZLL;
                    SAMICorePropertyId sAMICorePropertyId = SAMICorePropertyId.SAMICorePropertyId_VC_Online;
                    sAMICore.SAMICoreSetProperty(sAMICorePropertyId, sAMICoreProperty);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("zxzzz_SamiSVC: ... WebSocket_Vc_Speaker STOP , isShootingScene = ");
                    sbLIZ2.append(this.LLJJ);
                    sbLIZ2.append(", isPreviewScene = ");
                    sbLIZ2.append(this.LLJILLL);
                    sbLIZ2.append(", thread_id = ");
                    sbLIZ2.append(Process.myTid());
                    sbLIZ2.append(", thread_name = ");
                    sbLIZ2.append(C786410Ut5.u3().getName());
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ2));
                    System.currentTimeMillis();
                    SAMICoreProperty sAMICoreProperty2 = new SAMICoreProperty();
                    sAMICoreProperty2.id = SAMICorePropertyId.SAMICorePropertyId_VC_Online_Start_Server;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("zxzzz_SamiSVC: Start_Server START ... , isShootingScene = ");
                    sbLIZ3.append(this.LLJJ);
                    sbLIZ3.append(", isPreviewScene = ");
                    sbLIZ3.append(this.LLJILLL);
                    sbLIZ3.append(", thread_id = ");
                    sbLIZ3.append(Process.myTid());
                    sbLIZ3.append(", thread_name = ");
                    sbLIZ3.append(C786410Ut5.u3().getName());
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ3));
                    int iSAMICoreSetProperty = this.LLILZLL.SAMICoreSetProperty(sAMICorePropertyId, sAMICoreProperty2);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("zxzzz_SamiSVC: ... Start_Server STOP , isShootingScene = ");
                    sbLIZ4.append(this.LLJJ);
                    sbLIZ4.append(", isPreviewScene = ");
                    sbLIZ4.append(this.LLJILLL);
                    sbLIZ4.append(", thread_id = ");
                    sbLIZ4.append(Process.myTid());
                    sbLIZ4.append(", thread_name = ");
                    sbLIZ4.append(C786410Ut5.u3().getName());
                    C201955140j.LJ(C2188811AlT.LIZIZ(sbLIZ4));
                    if (iSAMICoreSetProperty != 0) {
                        LJIIIIZZ(new C1663870tOr("EVENT_SDK_FAILED"));
                    }
                }
            }
            this.LLILLL.unlock();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.unlock();
            throw th;
        }
    }

    public final void LJIIIIZZ(C1663870tOr c1663870tOr) {
        this.LLJILJIL.invoke(c1663870tOr);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003c A[Catch: all -> 0x0114, TRY_LEAVE, TryCatch #0 {all -> 0x0114, blocks: (B:2:0x0000, B:4:0x0009, B:6:0x000f, B:8:0x0018, B:12:0x002d, B:13:0x0032, B:15:0x003c, B:16:0x0055, B:18:0x005e, B:19:0x0064, B:21:0x006b, B:22:0x0071, B:24:0x0078, B:25:0x007e, B:28:0x008b, B:29:0x00c0, B:31:0x00cd, B:33:0x0104), top: B:42:0x0000, inners: #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LIZLLL(boolean r8, byte[] r9) {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2218271Brt.LIZLLL(boolean, byte[]):int");
    }
}
