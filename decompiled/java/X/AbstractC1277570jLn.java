package X;

import android.opengl.EGLContext;
import android.util.Log;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.pusher.core.engine.MediaEngineFactory;
import com.ss.pusher.core.opengl.GLThreadManager;
import com.ss.pusher.core.params.ASRWordMuting;
import com.ss.pusher.core.utils.AVLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jLn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public abstract class AbstractC1277570jLn {
    public static final C1279180jOO Companion = new Object() { // from class: X.0jOO
    };
    public final C1277590jLp config;
    public boolean duringConnectInAdvance;
    public boolean enableNTPTiming;
    public final boolean inheritOldState;
    public boolean needEndLive;
    public String orientationMetadata;
    public int performanceMaxVideoBitrate;
    public boolean pushStarted;
    public final C1277690jLz pushState;
    public String[] pushUrlsWithSessionId;
    public boolean startPushReported;
    public InterfaceC1278600jNS statsObserver;
    public boolean stopPushReported;
    public boolean switchingToLinkMic;
    public boolean switchingToLive;

    public static final String getVersion() {
        Companion.getClass();
        return "7.22.0.93900";
    }

    public void bindToRoom(String str) {
    }

    public abstract int doPushExternalAudioFrame(C1278180jMm c1278180jMm);

    public abstract int doPushExternalVideoFrame(C1277560jLm c1277560jLm);

    public abstract void doStartPush(String[] strArr, boolean z);

    public abstract void doStopPush();

    public abstract void doSwitchScene(EnumC1277920jMM enumC1277920jMM, long j);

    public int enableCalculateAudioLoudness(boolean z) {
        return -1;
    }

    public ASRWordMuting getAsrWordsMuting() {
        return null;
    }

    public LyraxVideoEncoderProfile.VideoDegradeLevels getDegradeLevels() {
        return null;
    }

    public Object getRTCVideo() {
        return null;
    }

    public String getRtcRoomId() {
        return null;
    }

    public String getRtcTaskId() {
        return null;
    }

    public abstract EnumC1277890jMJ getSessionVersion();

    public abstract void insertStandardLevel(int i, int i2, int i3, int i4);

    public boolean isAnchorNet() {
        return false;
    }

    public abstract boolean isPushing();

    public abstract EnumC1277950jMP resetLiveVideoPerformanceConfig();

    public abstract int sendSeiMessage(String str, Object obj, int i, boolean z, boolean z2);

    public abstract int sendSeiMessage(String str, Object obj, int i, boolean z, boolean z2, int i2);

    public void setFeaturesConfig(List<? extends LyraxTranscoderFeature> list) {
    }

    public abstract void setObserver(InterfaceC1277660jLw interfaceC1277660jLw);

    public abstract int setProperty(InterfaceC1277930jMN interfaceC1277930jMN);

    public abstract EnumC1277950jMP setVideoPerformanceConfig(int i, int i2, int i3);

    public void setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper) {
    }

    public void setVideoStrategyRunner(Object obj) {
    }

    public void startAudioCapture() {
    }

    public void startVideoCapture() {
    }

    public void stopAudioCapture() {
    }

    public void stopVideoCapture() {
    }

    public void unbindFromRoom(String str) {
    }

    public abstract int updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats);

    public static final EGLContext getEGLContext() {
        Companion.getClass();
        return GLThreadManager.LJFF();
    }

    public void release() {
        JSONObject jSONObjectPut = new JSONObject().put("event_key", "LivePusherAPI").put("api", "release");
        InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
        if (interfaceC1278600jNS != null) {
            interfaceC1278600jNS.LIZIZ(jSONObjectPut);
        }
        if (this.needEndLive) {
            tryReportStopPush(System.currentTimeMillis());
        }
    }

    public final void reportAudioFirstFramePreEncode() {
        C1277690jLz c1277690jLz = this.pushState;
        if (c1277690jLz.LJIIIZ) {
            return;
        }
        c1277690jLz.LJIIIZ = true;
        JSONObject jSONObjectPut = new JSONObject().put("event_key", "first_frame_pre_encode").put("media_type", "audio");
        InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
        if (interfaceC1278600jNS != null) {
            interfaceC1278600jNS.LIZIZ(jSONObjectPut);
        }
    }

    public final C1277580jLo statsObserverForTest$RtcEngine_release() {
        return (C1277580jLo) this.statsObserver;
    }

    public final C1277590jLp getConfig() {
        return this.config;
    }

    public final boolean getEnableNTPTiming() {
        return this.enableNTPTiming;
    }

    public final boolean getPushStarted() {
        return this.pushStarted;
    }

    public final String[] getPushUrlsWithSessionId() {
        return this.pushUrlsWithSessionId;
    }

    public final InterfaceC1278600jNS getStatsObserver() {
        return this.statsObserver;
    }

    public final boolean getSwitchingToLinkMic() {
        return this.switchingToLinkMic;
    }

    public final boolean getSwitchingToLive() {
        return this.switchingToLive;
    }

    public List<LyraxVideoBitrateGearTableItem> getVideoBitrateGearTable() {
        return C13BV.INSTANCE;
    }

    public final C1277690jLz pushState() {
        return this.pushState;
    }

    public AbstractC1277570jLn(C1277590jLp c1277590jLp) {
        boolean z;
        this.config = c1277590jLp;
        this.statsObserver = c1277590jLp.LJ;
        C1277690jLz c1277690jLz = c1277590jLp.LJIILLIIL;
        if (c1277690jLz != null) {
            z = true;
        } else {
            z = false;
        }
        this.inheritOldState = z;
        this.pushUrlsWithSessionId = new String[0];
        this.needEndLive = true;
        if (c1277690jLz == null) {
            String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.getDefault());
            c1277690jLz = new C1277690jLz(lowerCase, lowerCase, 0L, 0L, 0L, 0, true, 0L, -1, false, false, false, false, false, false);
        }
        this.pushState = c1277690jLz;
        this.performanceMaxVideoBitrate = c1277590jLp.LJI.mPushBase.maxBitrate / LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public static final void setEGLContext(EGLContext eGLContext) {
        Companion.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setSharedEGLContext ");
        sbLIZ.append(eGLContext);
        sbLIZ.append(", call stack:\n");
        sbLIZ.append(Log.getStackTraceString(new Throwable()));
        AVLog.iow("GLThreadManager", C2188811AlT.LIZIZ(sbLIZ));
        GLThreadManager.LJI = eGLContext;
    }

    public static final void setEGLVersion(int i) {
        Companion.getClass();
        GLThreadManager.LJFF = i;
    }

    public static final void setLogLevel(EnumC1280060jPo enumC1280060jPo) {
        Companion.getClass();
        int level = enumC1280060jPo.getLevel();
        int i = MediaEngineFactory.LIZIZ;
        AVLog.setLevel(level);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void tryReportStopPush(long r10) throws org.json.JSONException {
        /*
            r9 = this;
            boolean r0 = r9.stopPushReported
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r9.stopPushReported = r0
            X.0jLz r8 = r9.pushState
            boolean r7 = r8.LJI
            r0 = 0
            if (r7 == 0) goto L62
            long r4 = r8.LJII
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 <= 0) goto L62
            long r2 = r10 - r4
        L18:
            long r5 = r8.LIZLLL
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L20
            long r0 = r10 - r5
        L20:
            if (r7 == 0) goto L5f
            int r5 = r8.LJIIIIZZ
        L24:
            org.json.JSONObject r7 = new org.json.JSONObject
            r7.<init>()
            java.lang.String r6 = "event_key"
            java.lang.String r4 = "stop_push"
            org.json.JSONObject r6 = r7.put(r6, r4)
            java.lang.String r4 = "push_duration"
            org.json.JSONObject r4 = r6.put(r4, r0)
            X.0jLz r0 = r9.pushState
            int r1 = r0.LJFF
            java.lang.String r0 = "disconnect_count"
            org.json.JSONObject r4 = r4.put(r0, r1)
            X.0jLz r0 = r9.pushState
            boolean r1 = r0.LJI
            java.lang.String r0 = "is_connecting"
            org.json.JSONObject r1 = r4.put(r0, r1)
            java.lang.String r0 = "disconnect_elapse"
            org.json.JSONObject r1 = r1.put(r0, r2)
            java.lang.String r0 = "error_code"
            org.json.JSONObject r1 = r1.put(r0, r5)
            X.0jNS r0 = r9.statsObserver
            if (r0 == 0) goto L5e
            r0.LIZIZ(r1)
        L5e:
            return
        L5f:
            r5 = 200(0xc8, float:2.8E-43)
            goto L24
        L62:
            r2 = 0
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1277570jLn.tryReportStopPush(long):void");
    }

    public final JSONObject appendStatus(JSONObject jSONObject) {
        String str;
        if (this.duringConnectInAdvance) {
            str = "pre_push";
        } else {
            str = "push";
        }
        return jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
    }

    public final void handleUserMetadata(C1278210jMp c1278210jMp) {
        if (Intrinsics.LJFF(c1278210jMp.LIZ, "orientation")) {
            this.orientationMetadata = c1278210jMp.LIZIZ;
        }
    }

    public final void onConnected$RtcEngine_release(long j) {
        C1277690jLz c1277690jLz = this.pushState;
        c1277690jLz.LJI = false;
        if (c1277690jLz.LIZLLL == 0) {
            c1277690jLz.LIZLLL = j;
        }
        c1277690jLz.LJ = j;
    }

    public final int pushExternalAudioFrame(C1278180jMm c1278180jMm) {
        reportAudioFirstFramePreEncode();
        return doPushExternalAudioFrame(c1278180jMm);
    }

    public final int pushExternalVideoFrame(C1277560jLm c1277560jLm) throws JSONException {
        C1277690jLz c1277690jLz = this.pushState;
        if (!c1277690jLz.LJIIL) {
            c1277690jLz.LJIIL = true;
            JSONObject jSONObjectPut = new JSONObject().put("event_key", "first_frame_pre_encode").put("media_type", "video");
            InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
            if (interfaceC1278600jNS != null) {
                interfaceC1278600jNS.LIZIZ(jSONObjectPut);
            }
        }
        return doPushExternalVideoFrame(c1277560jLm);
    }

    public final void reportFirstFrameEvents(C1278510jNJ c1278510jNJ) {
        reportFirstFrameEventsInternal$RtcEngine_release(c1278510jNJ);
    }

    public final void reportFirstFrameEventsInternal$RtcEngine_release(C1278510jNJ c1278510jNJ) throws JSONException {
        boolean z;
        String str;
        boolean z2;
        int i = C1277860jMG.LIZ[c1278510jNJ.LIZIZ.ordinal()];
        String str2 = "video";
        if (i != 1) {
            if (i != 2) {
                str = "";
                str2 = "";
            } else {
                boolean z3 = c1278510jNJ.LIZ;
                if (z3) {
                    z2 = this.pushState.LJIILJJIL;
                } else {
                    z2 = this.pushState.LJIIJJI;
                }
                if (z2) {
                    return;
                }
                if (z3) {
                    this.pushState.LJIILJJIL = true;
                } else {
                    this.pushState.LJIIJJI = true;
                    str2 = "audio";
                }
                str = "first_frame_send";
            }
        } else {
            boolean z4 = c1278510jNJ.LIZ;
            if (z4) {
                z = this.pushState.LJIILIIL;
            } else {
                z = this.pushState.LJIIJ;
            }
            if (z) {
                return;
            }
            if (z4) {
                this.pushState.LJIILIIL = true;
            } else {
                this.pushState.LJIIJ = true;
                str2 = "audio";
            }
            str = "first_frame_encode";
        }
        JSONObject jSONObjectPut = new JSONObject().put("event_key", str).put("media_type", str2);
        InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
        if (interfaceC1278600jNS != null) {
            interfaceC1278600jNS.LIZIZ(jSONObjectPut);
        }
    }

    public final void setEnableNTPTiming(boolean z) {
        this.enableNTPTiming = z;
    }

    public final void setPushStarted(boolean z) {
        this.pushStarted = z;
    }

    public final void setPushUrlsWithSessionId(String[] strArr) {
        this.pushUrlsWithSessionId = strArr;
    }

    public final void setStatsObserver(InterfaceC1278600jNS interfaceC1278600jNS) {
        this.statsObserver = interfaceC1278600jNS;
    }

    public final void setSwitchingToLinkMic(boolean z) {
        this.switchingToLinkMic = z;
    }

    public final void setSwitchingToLive(boolean z) {
        this.switchingToLive = z;
    }

    public final void stopPush(boolean z) throws JSONException {
        JSONObject jSONObjectPut = new JSONObject().put("event_key", "LivePusherAPI").put("api", "stopPush").put("endLive", z);
        InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
        if (interfaceC1278600jNS != null) {
            interfaceC1278600jNS.LIZIZ(jSONObjectPut);
        }
        this.needEndLive = z;
        stopPushInternal$RtcEngine_release(z, System.currentTimeMillis());
    }

    public final void switchScene(EnumC1277920jMM enumC1277920jMM) {
        switchSceneInternal$RtcEngine_release(enumC1277920jMM, System.currentTimeMillis());
    }

    public final void updatePerformanceMaxVideoBitrate(int i) {
        this.performanceMaxVideoBitrate = i / LSPassThroughRecordSizeConfig.DEFAULT;
    }

    public final void onDisconnected$RtcEngine_release(long j, int i) {
        if (this.switchingToLinkMic) {
            return;
        }
        C1277690jLz c1277690jLz = this.pushState;
        c1277690jLz.LJI = true;
        c1277690jLz.LJFF++;
        c1277690jLz.LJIIIIZZ = i;
        c1277690jLz.LJII = j;
        c1277690jLz.LIZJ = j;
    }

    public void setStatisticsObserver(final InterfaceC1278600jNS interfaceC1278600jNS, int i) {
        if (interfaceC1278600jNS != null) {
            this.statsObserver = new InterfaceC1278600jNS(interfaceC1278600jNS) { // from class: X.0jLo
                public final InterfaceC1278600jNS LIZ;

                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:39:0x015a A[Catch: Exception -> 0x01b7, TryCatch #0 {Exception -> 0x01b7, blocks: (B:3:0x0006, B:7:0x0083, B:9:0x00a6, B:10:0x00ab, B:13:0x00bb, B:15:0x00d4, B:16:0x00d6, B:20:0x00f3, B:21:0x00f6, B:23:0x0113, B:27:0x011e, B:39:0x015a, B:30:0x0128, B:32:0x0130, B:35:0x013c, B:36:0x0151, B:40:0x0160, B:42:0x0168, B:44:0x0178, B:46:0x017e, B:47:0x019d, B:50:0x01a4), top: B:55:0x0006 }] */
                @Override // X.InterfaceC1278600jNS
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void LIZIZ(org.json.JSONObject r13) {
                    /*
                        Method dump skipped, instruction units count: 468
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C1277580jLo.LIZIZ(org.json.JSONObject):void");
                }

                @Override // X.InterfaceC1278600jNS
                public final void LIZJ(C1279020jO8 c1279020jO8) {
                    this.LIZ.LIZJ(c1279020jO8);
                }

                {
                    this.LIZ = interfaceC1278600jNS;
                }
            };
        }
    }

    public final void startPush(String[] strArr, boolean z) {
        startPushInternal$RtcEngine_release(strArr, z, System.currentTimeMillis());
    }

    public final void stopPushInternal$RtcEngine_release(boolean z, long j) throws JSONException {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("stopPush endLive ");
        sbLIZ.append(z);
        AVLog.logKibana(4, "VeLivePusher", C2188811AlT.LIZIZ(sbLIZ), null);
        if (z) {
            tryReportStopPush(j);
        }
        if (this.pushStarted) {
            this.pushStarted = false;
            doStopPush();
        }
    }

    public final void switchSceneInternal$RtcEngine_release(EnumC1277920jMM enumC1277920jMM, long j) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("switchScene scene ");
        sbLIZ.append(enumC1277920jMM);
        AVLog.logKibana(4, "VeLivePusher", C2188811AlT.LIZIZ(sbLIZ), null);
        doSwitchScene(enumC1277920jMM, j);
    }

    public final void startPushInternal$RtcEngine_release(String[] strArr, boolean z, long j) {
        String strLIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("startPush, urls: ");
        sbLIZ.append(Arrays.toString(strArr));
        sbLIZ.append(", immediate: ");
        sbLIZ.append(z);
        AVLog.logKibana(4, "VeLivePusher", C2188811AlT.LIZIZ(sbLIZ), null);
        if (strArr == null) {
            return;
        }
        if (!this.pushStarted) {
            List listLJIJI = C13LQ.LJIJI(strArr);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIJI, 10));
            for (String str : (ArrayList) listLJIJI) {
                if (a0.LJJJJ(str, '?', 0, 6) >= 0) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append(str);
                    sbLIZ2.append("&push_session_id=");
                    sbLIZ2.append(this.pushState.LIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                } else {
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append(str);
                    sbLIZ3.append("?push_session_id=");
                    sbLIZ3.append(this.pushState.LIZ);
                    strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
                }
                arrayList.add(strLIZIZ);
            }
            this.pushUrlsWithSessionId = (String[]) arrayList.toArray(new String[0]);
        }
        if (!this.startPushReported) {
            if (!this.pushStarted && !this.inheritOldState) {
                this.pushState.LIZJ = j;
            }
            if (z) {
                this.startPushReported = true;
                this.duringConnectInAdvance = false;
            } else {
                this.duringConnectInAdvance = true;
            }
            if (!this.inheritOldState) {
                JSONObject jSONObjectAppendStatus = appendStatus(new JSONObject().put("event_key", "start_push"));
                InterfaceC1278600jNS interfaceC1278600jNS = this.statsObserver;
                if (interfaceC1278600jNS != null) {
                    interfaceC1278600jNS.LIZIZ(jSONObjectAppendStatus);
                }
            }
        }
        if (!this.pushStarted) {
            this.pushStarted = true;
            doStartPush(this.pushUrlsWithSessionId, z);
        }
    }
}
