package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.mammon.audiosdk.SAMICore;
import com.mammon.audiosdk.SAMICoreCallBackListener;
import com.mammon.audiosdk.enums.SAMICoreContextType;
import com.mammon.audiosdk.enums.SAMICoreDataType;
import com.mammon.audiosdk.enums.SAMICoreIdentify;
import com.mammon.audiosdk.enums.SAMICorePropertyId;
import com.mammon.audiosdk.enums.SAMICoreTokenType;
import com.mammon.audiosdk.structures.SAMICoreBlock;
import com.mammon.audiosdk.structures.SAMICoreTtsContextCreateParameter;
import com.mammon.audiosdk.structures.SAMICoreTtsProcessParameter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.local_test.LocalTestApi;
import com.ss.android.ugc.aweme.services.audio.ITTSCallback;
import java.util.NoSuchElementException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import kotlin.Unit;
import kotlin.jvm.internal.AwS547S0100000_3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09TR, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09TR implements InterfaceC2374509Sd, SAMICoreCallBackListener {
    public static final String LJIILIIL;
    public String LIZJ;
    public volatile SAMICore LIZLLL;
    public volatile boolean LJFF;
    public boolean LJI;
    public SAMICoreCallBackListener LJII;
    public final ExecutorService LJIIJJI;
    public final C01GW LJIIL;
    public final SAMICoreContextType LIZ = SAMICoreContextType.TokenVerifyMixedContext;
    public final SAMICoreTokenType LIZIZ = SAMICoreTokenType.TOKEN_TO_C_D;
    public final AtomicBoolean LJ = new AtomicBoolean(false);
    public final ReentrantReadWriteLock LJIIIIZZ = new ReentrantReadWriteLock(true);
    public final AtomicBoolean LJIIIZ = new AtomicBoolean(false);
    public final LinkedBlockingQueue<C09TS> LJIIJ = new LinkedBlockingQueue<>();

    public final void LIZIZ() {
        C11YP c11yp = C11YP.LIZIZ;
        String str = LJIILIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("activeThread isRunning = ");
        sbLIZ.append(this.LJIIIZ.get());
        C201955140j.LIZLLL(c11yp, str, C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIIIZ.compareAndSet(false, true)) {
            while (!this.LJIIJ.isEmpty()) {
                try {
                    C23250099c.LIZLLL((InterfaceC497601wk) this.LJIIL.getValue(), null, null, new C09TO(this, this.LJIIJ.remove(), null), 3);
                } catch (NoSuchElementException e) {
                    TryCatchGuardChecker.doCheck(e);
                    C11YP c11yp2 = C11YP.LIZIZ;
                    String str2 = LJIILIIL;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("activeThread throw e : ");
                    sbLIZ2.append(e);
                    C201955140j.LJIIIIZZ(c11yp2, str2, C2188811AlT.LIZIZ(sbLIZ2));
                }
            }
            this.LJIIIZ.set(false);
        }
    }

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TTS_IN_TT_");
        sbLIZ.append("TTSStreamImpl ");
        LJIILIIL = C2188811AlT.LIZIZ(sbLIZ);
        C0CHQ.LIZ().getAccountService().getUserTTToken();
    }

    public C09TR() {
        this.LJIIJJI = C04TS.LIZ() ? new ExecutorServiceC822430WOb(C823050WQl.LIZLLL(), 4) : C786410Ut5.d4(4);
        this.LJIIL = C452501pT.LIZIZ(new AwS547S0100000_3(this, 133));
    }

    public final int LIZLLL(C09TB c09tb) throws JSONException {
        SAMICore sAMICore = this.LIZLLL;
        if (sAMICore != null) {
            C201955140j.LJIIIIZZ(C11YP.LIZIZ, LJIILIIL, "createSamiHandler but samiCore not destroy!");
            if (sAMICore.getHandle() != 0) {
                sAMICore.SAMICoreDestroyHandle();
                sAMICore.setListener(null);
            }
            this.LIZLLL = null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        SAMICoreTtsContextCreateParameter sAMICoreTtsContextCreateParameter = new SAMICoreTtsContextCreateParameter();
        sAMICoreTtsContextCreateParameter.url = "wss://sami.tiktokv.com/internal/api/v1/ws";
        sAMICoreTtsContextCreateParameter.appKey = "wLyPjWaDrF";
        sAMICoreTtsContextCreateParameter.tokenType = this.LIZIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("passport-auth", "session");
        jSONObject.put("sdk-version", "2");
        jSONObject.put("x-tt-token", C0CHQ.LIZ().getAccountService().getUserTTToken());
        LocalTestApi localTestApi = (LocalTestApi) ServiceManager.get().getService(LocalTestApi.class);
        String str = "prod";
        if (localTestApi.enableBoe()) {
            String boeLane = localTestApi.getBoeLane();
            if (boeLane != null) {
                str = boeLane;
            }
            jSONObject.put("X-TT-ENV", str);
            jSONObject.put("X-USE-PPE", "1");
        } else if (localTestApi.enablePpe()) {
            String pPELane = localTestApi.getPPELane();
            if (pPELane != null) {
                str = pPELane;
            }
            jSONObject.put("X-TT-ENV", str);
            jSONObject.put("X-USE-PPE", "1");
        }
        sAMICoreTtsContextCreateParameter.token = C786410Ut5.J3(jSONObject);
        sAMICoreTtsContextCreateParameter.sampleRate = 24000;
        sAMICoreTtsContextCreateParameter.format = "pcm";
        sAMICoreTtsContextCreateParameter.enableNetTransportCompress = true;
        sAMICoreTtsContextCreateParameter.bitRate = 64000;
        sAMICoreTtsContextCreateParameter.saveFileDir = this.LIZJ;
        sAMICoreTtsContextCreateParameter.enableTimestamp = this.LJI;
        this.LJII = c09tb;
        SAMICore sAMICore2 = new SAMICore();
        sAMICore2.setListener(this);
        int iSAMICoreCreateHandleByIdentify = sAMICore2.SAMICoreCreateHandleByIdentify(SAMICoreIdentify.SAMICoreIdentify_Streaming_Playing_TTS_Online, sAMICoreTtsContextCreateParameter);
        if (iSAMICoreCreateHandleByIdentify != 0) {
            C11YP c11yp = C11YP.LIZIZ;
            String str2 = LJIILIIL;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("createSamiHandler err ret = ");
            sbLIZ.append(iSAMICoreCreateHandleByIdentify);
            C201955140j.LJIIIIZZ(c11yp, str2, C2188811AlT.LIZIZ(sbLIZ));
        } else {
            this.LJFF = true;
        }
        this.LIZLLL = sAMICore2;
        C11YP c11yp2 = C11YP.LIZIZ;
        String str3 = LJIILIIL;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("createSamiHandler end use ");
        sbLIZ2.append(SystemClock.elapsedRealtime() - jElapsedRealtime);
        sbLIZ2.append("ms");
        C201955140j.LIZLLL(c11yp2, str3, C2188811AlT.LIZIZ(sbLIZ2));
        return iSAMICoreCreateHandleByIdentify;
    }

    public final void LJ(SAMICore sAMICore) {
        if (sAMICore == null) {
            C201955140j.LIZLLL(C11YP.LIZIZ, LJIILIIL, "destroySamiHandler but sCore is null");
            return;
        }
        C11YP c11yp = C11YP.LIZIZ;
        String str = LJIILIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("destroySamiHandler real, equals = ");
        sbLIZ.append(Intrinsics.LJFF(sAMICore, this.LIZLLL));
        C201955140j.LIZLLL(c11yp, str, C2188811AlT.LIZIZ(sbLIZ));
        if (Intrinsics.LJFF(sAMICore, this.LIZLLL)) {
            this.LJIIJ.clear();
            this.LJIIIZ.set(false);
            this.LJFF = false;
            this.LJII = null;
            this.LIZLLL = null;
        }
        if (sAMICore.getHandle() != 0) {
            sAMICore.SAMICoreDestroyHandle();
            sAMICore.setListener(null);
        }
    }

    public final int LJI(SAMICore sAMICore) {
        ReentrantReadWriteLock.ReadLock lock = this.LJIIIIZZ.readLock();
        lock.lock();
        boolean z = false;
        if (sAMICore != null) {
            try {
                if (sAMICore.getHandle() == 0) {
                    z = true;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                lock.unlock();
                throw th;
            }
        }
        int iSAMICoreSetProperty = -1;
        if (!z) {
            C11YP c11yp = C11YP.LIZIZ;
            String str = LJIILIIL;
            C201955140j.LIZLLL(c11yp, str, "real stopProcess start");
            if (sAMICore != null) {
                iSAMICoreSetProperty = sAMICore.SAMICoreSetProperty(SAMICorePropertyId.SAMICorePropertyID_Stream_Play_TTS_Online_Force_Finish, null);
            }
            C201955140j.LIZLLL(c11yp, str, "real stopProcess end");
        } else {
            C201955140j.LJIIIIZZ(C11YP.LIZIZ, LJIILIIL, "real stopProcess but handle is 0");
        }
        lock.unlock();
        return iSAMICoreSetProperty;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C09TS r29, X.InterfaceC1364105Vn<? super kotlin.Unit> r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 593
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09TR.LIZJ(X.09TS, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    @Override // com.mammon.audiosdk.SAMICoreCallBackListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMessageReceived(com.mammon.audiosdk.enums.SAMICoreCallBackEventType r8, com.mammon.audiosdk.structures.SAMICoreBlock r9) {
        /*
            Method dump skipped, instruction units count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C09TR.onMessageReceived(com.mammon.audiosdk.enums.SAMICoreCallBackEventType, com.mammon.audiosdk.structures.SAMICoreBlock):void");
    }

    @Override // X.InterfaceC2374509Sd
    public final Object LIZ(String str, String str2, String str3, String str4, boolean z, boolean z2, ITTSCallback iTTSCallback, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return Unit.LIZ;
    }

    public final int LJFF(String str, String str2, int i, boolean z, boolean z2, int i2, long j, boolean z3) {
        boolean z4;
        Long lValueOf;
        SAMICoreTtsProcessParameter sAMICoreTtsProcessParameter = new SAMICoreTtsProcessParameter();
        sAMICoreTtsProcessParameter.speaker = str;
        sAMICoreTtsProcessParameter.text = str2;
        sAMICoreTtsProcessParameter.enableConcurrency = z;
        sAMICoreTtsProcessParameter.sampleRate = i;
        sAMICoreTtsProcessParameter.enablePlaying = z2;
        boolean z5 = true;
        sAMICoreTtsProcessParameter.enableSaveAudioToFile = true;
        sAMICoreTtsProcessParameter.timestamp = j;
        sAMICoreTtsProcessParameter.enableSentenceSeg = z3;
        SAMICoreBlock sAMICoreBlock = new SAMICoreBlock();
        sAMICoreBlock.dataType = SAMICoreDataType.SAMICoreDataType_WebSocket_Tts;
        sAMICoreBlock.audioData = new SAMICoreTtsProcessParameter[]{sAMICoreTtsProcessParameter};
        sAMICoreBlock.numberAudioData = i2;
        C11YP c11yp = C11YP.LIZIZ;
        String str3 = LJIILIIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(" realProcess samiCore is not null:");
        if (this.LIZLLL != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        sbLIZ.append(z4);
        sbLIZ.append("  samicore handle:");
        SAMICore sAMICore = this.LIZLLL;
        if (sAMICore != null) {
            lValueOf = Long.valueOf(sAMICore.getHandle());
        } else {
            lValueOf = null;
        }
        sbLIZ.append(lValueOf);
        C201955140j.LIZLLL(c11yp, str3, C2188811AlT.LIZIZ(sbLIZ));
        SAMICore sAMICore2 = this.LIZLLL;
        if (sAMICore2 == null || sAMICore2.getHandle() != 0) {
            z5 = false;
        }
        if (!z5) {
            SAMICore sAMICore3 = this.LIZLLL;
            if (sAMICore3 == null) {
                return -1;
            }
            return sAMICore3.SAMICoreProcess(sAMICoreBlock, null);
        }
        C2376309Sv c2376309Sv = C2376309Sv.LIZ;
        int length = str2.length();
        c2376309Sv.getClass();
        C2376309Sv.LIZIZ(1, str, 0, 0L, 0L, 0L, 2, length, 0, 0, null, -2);
        return -1;
    }
}
