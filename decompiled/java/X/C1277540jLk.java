package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS1S0203000_20;
import Y.ARunnableS1S2101000_20;
import Y.ARunnableS21S0210000_20;
import Y.ARunnableS25S1100000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS5S1110000_20;
import Y.ARunnableS89S0200000_20;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.pusher.core.params.ASRWordMuting;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jLk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277540jLk implements InterfaceC1266360j3i {
    public static final String[] LJIJI = {"width", "height", "cap_adapted_width", "cap_adapted_height", "fps", "defaultBitrate", "minBitrate", "maxBitrate", "videoCaptureFps", "audioBitrate", "videoCaptureWidth", "videoCaptureHeight", "cap_adapted_quirks", "maxFps"};
    public static final String[] LJIJJ = {"bitrateRatio", "capWidthRate", "capHeightRate"};
    public static final String[] LJIJJLI = {"from"};
    public static final String[] LJIL = {"enable_siti", "useHardware"};
    public volatile AbstractC1277570jLn LIZ;
    public C1277590jLp LIZIZ;
    public final Context LIZJ;
    public C1278640jNW LIZLLL;
    public final C1269160j8E LJ;
    public boolean LJFF;
    public String LJI;
    public InterfaceC1277660jLw LJIIIIZZ;
    public InterfaceC1278600jNS LJIIIZ;
    public C1277690jLz LJIIJ;
    public boolean LJIIJJI;
    public final InterfaceC1266990j4j LJIIL;
    public C1269300j8S LJIILIIL;
    public C1267500j5Y LJIILJJIL;
    public Handler LJIILL;
    public IVideoStrategyRunner LJIILLIIL;
    public ILyraxVideoPlatformWrapper LJIIZILJ;
    public EnumC1276080jJO LJII = EnumC1276080jJO.None;
    public String LJIJ = "";

    @Override // X.InterfaceC1266360j3i
    public final /* synthetic */ void LJJII(InterfaceC1274510jGr interfaceC1274510jGr) {
    }

    @Override // X.InterfaceC1266360j3i
    public final /* synthetic */ void LJJIII(boolean z, EnumC1269700j96 enumC1269700j96) {
    }

    @Override // X.InterfaceC1266360j3i
    public final void cacheJoinRoomState() {
    }

    @Override // X.InterfaceC1266360j3i
    public final void reportFinalLog(String str) {
    }

    public final boolean LIZJ() {
        C1267500j5Y c1267500j5Y;
        return (this.LJIILL == null || (c1267500j5Y = this.LJIILJJIL) == null || c1267500j5Y.LIZIZ.LJJL) ? false : true;
    }

    public final int LIZLLL() {
        EnumC1277950jMP enumC1277950jMPResetLiveVideoPerformanceConfig = EnumC1277950jMP.OtherError;
        if (this.LIZ != null) {
            enumC1277950jMPResetLiveVideoPerformanceConfig = this.LIZ.resetLiveVideoPerformanceConfig();
        }
        if (C1277940jMO.LIZ[enumC1277950jMPResetLiveVideoPerformanceConfig.ordinal()] != 1) {
            return enumC1277950jMPResetLiveVideoPerformanceConfig.ordinal();
        }
        return 0;
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIILJJIL() {
        LJ(new ARunnableS120S0100000_20(this, 13));
    }

    @Override // X.InterfaceC1266360j3i
    public final ASRWordMuting LJIJI() {
        if (this.LIZ == null) {
            return null;
        }
        return this.LIZ.getAsrWordsMuting();
    }

    @Override // X.InterfaceC1266360j3i
    public final String LJIJJ() {
        if (this.LIZ == null) {
            return "";
        }
        if (!LIZJ()) {
            return this.LIZ.getRtcTaskId();
        }
        String[] strArr = new String[1];
        C1283100jUi.LIZIZ(this.LJIILL, new ARunnableS89S0200000_20(strArr, this, 14));
        return strArr[0];
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJI() {
        LJ(new ARunnableS120S0100000_20(this, 19));
    }

    @Override // X.InterfaceC1266360j3i
    public final Object LJJIIJ() {
        if (this.LIZ == null) {
            return null;
        }
        if (!LIZJ()) {
            return this.LIZ.getRTCVideo();
        }
        Object[] objArr = new Object[1];
        C1283100jUi.LIZIZ(this.LJIILL, new ARunnableS89S0200000_20(objArr, this, 15));
        return objArr[0];
    }

    @Override // X.InterfaceC1266360j3i
    public final JSONObject LJJIIZI() {
        JSONObject jSONObject = new JSONObject();
        try {
            InterfaceC1278630jNV interfaceC1278630jNV = this.LIZLLL.LIZ;
            String strLIZIZ = interfaceC1278630jNV.LIZIZ("https://rtc-sg.tiktokv.com/");
            String str = TextUtils.isEmpty(strLIZIZ) ? "https://rtc-sg.tiktokv.com/" : strLIZIZ;
            String strLIZIZ2 = interfaceC1278630jNV.LIZIZ("https://rtcpc-access-sg.tiktokv.com/");
            String str2 = TextUtils.isEmpty(strLIZIZ2) ? "https://rtcpc-access-sg.tiktokv.com/" : strLIZIZ2;
            String strLIZIZ3 = interfaceC1278630jNV.LIZIZ("https://rtc-access-sg.tiktokv.com/");
            String str3 = TextUtils.isEmpty(strLIZIZ3) ? "https://rtc-access-sg.tiktokv.com/" : strLIZIZ3;
            String strLIZIZ4 = interfaceC1278630jNV.LIZIZ("https://rtc-logger-va.tiktokv.com/");
            String strReplace = TextUtils.isEmpty(strLIZIZ4) ? "https://rtc-logger-va.tiktokv.com/" : strLIZIZ4;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            if (!TextUtils.isEmpty(strReplace)) {
                if (strReplace.contains("http://")) {
                    strReplace = strReplace.replace("http", "wss");
                } else if (strReplace.contains("https://")) {
                    strReplace = strReplace.replace("https", "wss");
                }
            }
            sbLIZ.append(strReplace);
            sbLIZ.append("report");
            String strLIZIZ5 = C2188811AlT.LIZIZ(sbLIZ);
            JSONArray jSONArray = new JSONArray();
            jSONArray.put(str);
            jSONObject.put("config_hosts", jSONArray);
            JSONArray jSONArray2 = new JSONArray();
            jSONArray2.put(str2);
            jSONArray2.put(str3);
            jSONObject.put("access_hosts", jSONArray2);
            jSONObject.put("rtc.log_sdk_websocket_url", strLIZIZ5);
            jSONObject.put("rtc.enable_remove_scene_none", this.LJ.LIZ.ttlhABSettingsConfigs.LJIIIIZZ());
            jSONObject.put("rtc.video_strategy_active_scene", this.LJ.LIZ.ttlhABSettingsConfigs.LJIJI());
            jSONObject.put("rtc.enable_down_native_render", this.LJ.LIZ.ttlhABSettingsConfigs.LJ());
            jSONObject.put("rtc.enable_pre_get_config", C1276090jJP.LIZJ);
            jSONObject.put("rtc.enable_aoc_local_configs", this.LJ.LIZ.ttlhABSettingsConfigs.LIZJ());
            jSONObject.put("rtc.user_region", interfaceC1278630jNV.LIZ());
            jSONObject.put("rtc.access_group_id", this.LJ.LJJJJZ);
            jSONObject.put("rtc.live_role", this.LJ.LJLJI.LJJIII ? "host" : "guest");
            jSONObject.put("rtc.env", 0);
            if (!TextUtils.isEmpty(this.LJ.LJII())) {
                C190800oM.LIZIZ(jSONObject, new JSONObject(this.LJ.LJII()));
            }
            jSONObject.put("rtc.live_type", this.LJ.LJJII() == 3 || this.LJ.LJJIIZI ? 1 : 0);
            return jSONObject;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return jSONObject;
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final EnumC1277890jMJ LJJIJIIJIL() {
        return this.LIZ == null ? EnumC1277890jMJ.LiveStreamSession_V1 : this.LIZ.getSessionVersion();
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIJLIJ() {
        LJ(new ARunnableS120S0100000_20(this, 18));
    }

    @Override // X.InterfaceC1266360j3i
    public final LyraxVideoEncoderProfile.VideoDegradeLevels getDegradeLevels() {
        if (this.LIZ == null) {
            return null;
        }
        return this.LIZ.getDegradeLevels();
    }

    @Override // X.InterfaceC1266360j3i
    public final List<LyraxVideoBitrateGearTableItem> getVideoBitrateGearTable() {
        if (this.LIZ == null) {
            return null;
        }
        return this.LIZ.getVideoBitrateGearTable();
    }

    @Override // X.InterfaceC1266360j3i
    public final boolean LJIIJJI() {
        if (!LIZJ()) {
            AbstractC1277570jLn abstractC1277570jLn = this.LIZ;
            return abstractC1277570jLn == null ? this.LJIIJJI : abstractC1277570jLn.getSessionVersion() == EnumC1277890jMJ.LiveStreamSession_V3 || abstractC1277570jLn.getSessionVersion() == EnumC1277890jMJ.LiveStreamSession_V4;
        }
        boolean[] zArr = new boolean[1];
        C1283100jUi.LIZIZ(this.LJIILL, new ARunnableS89S0200000_20(zArr, this, 8));
        return zArr[0];
    }

    @Override // X.InterfaceC1266360j3i
    public final int LJJ() {
        if (!LIZJ()) {
            return LIZLLL();
        }
        int[] iArr = new int[1];
        C1283100jUi.LIZIZ(this.LJIILL, new ARunnableS89S0200000_20(iArr, this, 16));
        return iArr[0];
    }

    @Override // X.InterfaceC1266360j3i
    public final EnumC1276080jJO LJJIJ() {
        return this.LJII;
    }

    @Override // X.InterfaceC1266360j3i
    public final C1277690jLz getPusherState() {
        return this.LJIIJ;
    }

    public final void LIZIZ(boolean z) throws JSONException {
        if (this.LIZ != null) {
            AbstractC1277570jLn abstractC1277570jLn = this.LIZ;
            this.LIZ = null;
            C1269300j8S c1269300j8S = this.LJIILIIL;
            if (c1269300j8S != null) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("pusher.onDestroy start, pusher-->");
                sbLIZ.append(abstractC1277570jLn);
                c1269300j8S.LIZ("pusher_api_call", "onDestroy", "", C2188811AlT.LIZIZ(sbLIZ));
            }
            abstractC1277570jLn.stopPush(z);
            abstractC1277570jLn.release();
            C1269300j8S c1269300j8S2 = this.LJIILIIL;
            if (c1269300j8S2 != null) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("pusher.onDestroy end, pusher-->");
                sbLIZ2.append(abstractC1277570jLn);
                c1269300j8S2.LIZ("pusher_api_call", "onDestroy", "", C2188811AlT.LIZIZ(sbLIZ2));
            }
        }
    }

    public final void LJ(Runnable runnable) {
        if (LIZJ()) {
            Handler handler = this.LJIILL;
            if (C786410Ut5.u3() == handler.getLooper().getThread()) {
                runnable.run();
                return;
            } else {
                C786410Ut5.LJJZZIII(handler, runnable);
                return;
            }
        }
        runnable.run();
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIIIZ(boolean z) {
        LJ(new ARunnableS39S0110000_20(this, z, 4));
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIIL(C1267500j5Y c1267500j5Y) {
        this.LJIILJJIL = c1267500j5Y;
        this.LJIILIIL = (C1269300j8S) c1267500j5Y.LIZJ.getService(C1269300j8S.class);
        if (C1269260j8O.LIZIZ(this.LJIILJJIL)) {
            this.LJIILL = this.LJIILJJIL.LIZIZ.LJJJZ;
        }
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIILIIL(InterfaceC1277660jLw interfaceC1277660jLw) {
        LJ(new ARunnableS89S0200000_20(interfaceC1277660jLw, this, 13));
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIILL(boolean z) {
        this.LJFF = z;
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIIZILJ(C1278180jMm c1278180jMm) {
        LJ(new ARunnableS89S0200000_20(c1278180jMm, this, 17));
    }

    @Override // X.InterfaceC1266360j3i
    public final int LJIJJLI(InterfaceC1277930jMN interfaceC1277930jMN) {
        if (LIZJ()) {
            int[] iArr = new int[1];
            C1283100jUi.LIZIZ(this.LJIILL, new ARunnableS53S0300000_20(this, iArr, interfaceC1277930jMN, 0));
            return iArr[0];
        }
        AbstractC1277570jLn abstractC1277570jLn = this.LIZ;
        if (abstractC1277570jLn == null) {
            return 0;
        }
        return abstractC1277570jLn.setProperty(interfaceC1277930jMN);
    }

    @Override // X.InterfaceC1266360j3i
    public final int LJIL(View view) {
        return LyraxErrorCode.NOT_SUPPORT.value();
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIFFI(TEBundle tEBundle) {
        LJ(new ARunnableS89S0200000_20(new TEBundle(tEBundle), this, 11));
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIIJZLJL(InterfaceC1278600jNS interfaceC1278600jNS) {
        LJ(new ARunnableS89S0200000_20(interfaceC1278600jNS, this, 20));
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIIZ(String str) {
        LJ(new ARunnableS25S1100000_20(this, str, 6));
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIJL(List<LyraxTranscoderFeature> list) {
        LJ(new ARunnableS89S0200000_20(list, this, 18));
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJJIL(C1277560jLm c1277560jLm) {
        c1277560jLm.LIZLLL();
        LJ(new ARunnableS89S0200000_20(c1277560jLm, this, 19));
    }

    @Override // X.InterfaceC1266360j3i
    public final void bindToRoom(String str) {
        LJ(new ARunnableS25S1100000_20(this, str, 4));
    }

    @Override // X.InterfaceC1266360j3i
    public final int enableCalculateAudioLoudness(boolean z) {
        if (LIZJ()) {
            int[] iArr = new int[1];
            C1283100jUi.LIZIZ(this.LJIILL, new ARunnableS21S0210000_20(this, iArr, z, 0));
            return iArr[0];
        }
        if (this.LIZ == null) {
            return 0;
        }
        return this.LIZ.enableCalculateAudioLoudness(z);
    }

    @Override // X.InterfaceC1266360j3i
    public final void setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper) {
        LJ(new ARunnableS89S0200000_20(iLyraxVideoPlatformWrapper, this, 9));
    }

    @Override // X.InterfaceC1266360j3i
    public final void setVideoStrategyRunner(IVideoStrategyRunner iVideoStrategyRunner) {
        if (this.LIZ == null) {
            return;
        }
        this.LJIILLIIL = iVideoStrategyRunner;
        this.LIZ.setVideoStrategyRunner(this.LJIILLIIL);
    }

    @Override // X.InterfaceC1266360j3i
    public final void stopPush(boolean z) {
        LJ(new ARunnableS39S0110000_20(this, z, 2));
    }

    @Override // X.InterfaceC1266360j3i
    public final void unbindFromRoom(String str) {
        LJ(new ARunnableS25S1100000_20(this, str, 5));
    }

    @Override // X.InterfaceC1266360j3i
    public final void updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        LJ(new ARunnableS89S0200000_20(lyraxPreProcessVideoNodeStats, this, 12));
    }

    public C1277540jLk(C1269160j8E c1269160j8E, InterfaceC1266990j4j interfaceC1266990j4j) {
        this.LJ = c1269160j8E;
        this.LIZJ = c1269160j8E.LJLJI.LJIIZILJ;
        this.LJIIL = interfaceC1266990j4j;
    }

    public final void LJII(boolean z, String[] strArr) {
        RTCVideo rTCVideo;
        if (this.LIZ != null) {
            this.LIZ.startPush(strArr, z);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("startPush final urlList:");
            sbLIZ.append(Arrays.toString(strArr));
            AVLog.logKibana(6, "LiveStream-VeLivePusher", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        if (strArr != null && !TextUtils.isEmpty(strArr[0])) {
            this.LJI = strArr[0];
        }
        if (this.LJ.LJJIZ()) {
            if (!this.LJFF) {
                LJJIJIIJI("source", "TTLiveSDK_Android", -1, true, false, 0);
            }
            LJIILJJIL();
            if (!TextUtils.isEmpty(this.LJ.LJLJI.LJJIL.LIZIZ)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("tryInitAnchorNetRtcChannelId abort:");
                sbLIZ2.append(this.LJ.LJLJI.LJJIL.LIZIZ);
                AVLog.logKibana(4, "LiveStream-VeLivePusher", C2188811AlT.LIZIZ(sbLIZ2), null);
            } else {
                try {
                    String rtcRoomId = this.LIZ.getRtcRoomId();
                    this.LJ.LJLJI.LJJIL.LIZIZ = rtcRoomId;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("initAnchorNetRtcChannelId:");
                    sbLIZ3.append(rtcRoomId);
                    AVLog.logKibana(4, "LiveStream-VeLivePusher", C2188811AlT.LIZIZ(sbLIZ3), null);
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            if (this.LJIILLIIL != null) {
                if (this.LJIIJJI) {
                    this.LIZ.setVideoStrategyRunner(this.LJIILLIIL);
                    return;
                }
                Object rTCVideo2 = this.LIZ.getRTCVideo();
                if (rTCVideo2 == null || !(rTCVideo2 instanceof RTCVideo) || (rTCVideo = (RTCVideo) rTCVideo2) == null) {
                    return;
                }
                rTCVideo.setVideoStrategyRunner(this.LJIILLIIL);
                return;
            }
            return;
        }
        this.LJ.LJLJI.LJJIZ = true;
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIIJ(C1277690jLz c1277690jLz, boolean z) {
        LJ(new ARunnableS21S0210000_20(this, c1277690jLz, z, 1));
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIILLIIL(String[] strArr, boolean z) {
        LJ(new ARunnableS21S0210000_20(this, strArr, z, 2));
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIJ(String str, boolean z) {
        LJ(new ARunnableS5S1110000_20(this, str, z, 1));
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x028b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.AbstractC1277570jLn LIZ(X.C1269160j8E r14, X.C1277690jLz r15, boolean r16) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 654
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1277540jLk.LIZ(X.0j8E, X.0jLz, boolean):X.0jLn");
    }

    public final int LJI(int i, int i2, int i3) {
        EnumC1277950jMP videoPerformanceConfig = EnumC1277950jMP.OtherError;
        if (this.LIZ != null) {
            videoPerformanceConfig = this.LIZ.setVideoPerformanceConfig(i, i2, i3);
        }
        if (C1277940jMO.LIZ[videoPerformanceConfig.ordinal()] != 1) {
            return videoPerformanceConfig.ordinal();
        }
        return 0;
    }

    @Override // X.InterfaceC1266360j3i
    public final void LJIIIIZZ(String str, String str2, int i) {
        LJ(new ARunnableS1S2101000_20(this, str, str2, i, 1));
    }

    @Override // X.InterfaceC1266360j3i
    public final int LJJIJIL(int i, int i2, int i3) {
        if (LIZJ()) {
            int[] iArr = new int[1];
            C1283100jUi.LIZIZ(this.LJIILL, new ARunnableS1S0203000_20(this, i, i2, i3, iArr, 0));
            return iArr[0];
        }
        return LJI(i, i2, i3);
    }

    @Override // X.InterfaceC1266360j3i
    public final void insertStandardLevel(final int i, final int i2, final int i3, final int i4) {
        LJ(new Runnable() { // from class: X.0jMj
            @Override // java.lang.Runnable
            public final void run() {
                C1277540jLk c1277540jLk = this.LL;
                int i5 = i;
                int i6 = i2;
                int i7 = i3;
                int i8 = i4;
                c1277540jLk.getClass();
                C1C7U.LIZ("VeLivePusherWrapper@9eaa.insertStandardLevel$1L");
                if (c1277540jLk.LIZ != null) {
                    c1277540jLk.LIZ.insertStandardLevel(i5, i6, i7, i8);
                }
                C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.insertStandardLevel$1L");
            }
        });
    }

    public final int LJFF(String str, Object obj, int i, boolean z, boolean z2, int i2) {
        if (this.LIZ != null) {
            if (obj instanceof ByteBuffer) {
                ByteBuffer byteBuffer = (ByteBuffer) obj;
                if (!byteBuffer.isDirect() || byteBuffer.remaining() != byteBuffer.capacity()) {
                    AVLog.ioe("LiveStream-VeLivePusher", "A DirectByteBuffer is needed and its remaining size should equals to its capacity.");
                    return -1;
                }
            } else {
                if (TextUtils.isEmpty(str)) {
                    AVLog.logToIODeviceCheckRedundancy(6, "LiveStream-VeLivePusher", "When value is not a ByteBuffer, a valid key should be specified.", null, "LibRTMPTransport.java::addSeiField", 10000);
                    return -2;
                }
                if (obj != null) {
                    if (!(obj instanceof Boolean) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Float) && !(obj instanceof Double) && !(obj instanceof String) && !(obj instanceof JSONObject) && !(obj instanceof JSONArray)) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Unsupported value type: ");
                        sbLIZ.append(obj.getClass().getName());
                        AVLog.ioe("LiveStream-VeLivePusher", C2188811AlT.LIZIZ(sbLIZ));
                        return -3;
                    }
                } else {
                    AVLog.ioe("LiveStream-VeLivePusher", "value is null");
                }
            }
            return this.LIZ.sendSeiMessage(str, obj, i, z, z2, i2);
        }
        return 0;
    }

    @Override // X.InterfaceC1266360j3i
    public final int LJJIJIIJI(final String str, final Object obj, final int i, final boolean z, final boolean z2, final int i2) {
        if (LIZJ()) {
            final int[] iArr = new int[1];
            C1283100jUi.LIZIZ(this.LJIILL, new Runnable() { // from class: X.0jMn
                @Override // java.lang.Runnable
                public final void run() {
                    C1277540jLk c1277540jLk = this.LL;
                    int[] iArr2 = iArr;
                    String str2 = str;
                    Object obj2 = obj;
                    int i3 = i;
                    boolean z3 = z;
                    boolean z4 = z2;
                    int i4 = i2;
                    c1277540jLk.getClass();
                    C1C7U.LIZ("VeLivePusherWrapper@9eaa.sendSeiMessage$1L");
                    iArr2[0] = c1277540jLk.LJFF(str2, obj2, i3, z3, z4, i4);
                    C1C7U.LIZIZ("VeLivePusherWrapper@9eaa.sendSeiMessage$1L");
                }
            });
            return iArr[0];
        }
        return LJFF(str, obj, i, z, z2, i2);
    }
}
