package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS21S0210000_20;
import Y.ARunnableS39S0110000_20;
import Y.ARunnableS89S0200000_20;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper;
import com.ss.bytertc.engine.BitRateTable;
import com.ss.bytertc.engine.RTCVideoInterface;
import com.ss.bytertc.engine.VideoDegradeConfig;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.VideoResolutionConfig;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.type.LinkMicType;
import com.ss.bytertc.engine.type.RemoteAudioStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteVideoStats;
import com.ss.lyrax.LyraxErrorCode;
import com.ss.lyrax.engine.LyraxLiveType;
import com.ss.lyrax.stream.LyraxForwardStreamInfo;
import com.ss.lyrax.stream.LyraxStreamIndex;
import com.ss.lyrax.stream.LyraxStreamKey;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxBitRateTable;
import com.ss.lyrax.video.LyraxVideoDegradeConfig;
import com.ss.lyrax.video.LyraxVideoEncoderConfig;
import com.ss.lyrax.video.LyraxVideoEncoderMode;
import com.ss.lyrax.video.LyraxVideoEncoderPreference;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.lyrax.video.LyraxVideoResolutionConfig;
import com.ss.pusher.core.params.ASRWordMuting;
import com.ss.solution.interact.AuxStreamInfo;
import com.ss.solution.interact.ChannelBaseApplyResult;
import com.ss.solution.interact.InteractImpl;
import com.ss.ttlivestreamer.core.buffer.SurfaceTextureHelper;
import com.ss.ttlivestreamer.core.buffer.VideoFrame;
import com.ss.ttlivestreamer.core.buffer.k;
import com.ss.ttlivestreamer.core.effect.EffectWrapper;
import com.ss.ttlivestreamer.core.engine.VideoSink;
import com.ss.ttlivestreamer.core.render.ANativeWindowRenderDrawer;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Matcher;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jHO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274840jHO implements InterfaceC1276380jJs, InterfaceC1268200j6g, InterfaceC1272020jCq {
    public static final AtomicInteger LJJIZ = new AtomicInteger(0);
    public final InteractImpl LIZ;
    public final C1275030jHh LIZIZ;
    public final C1275140jHs LIZJ;
    public final C1276560jKA LIZLLL;
    public final C1269160j8E LJ;
    public final C1267500j5Y LJFF;
    public final AbstractC1273900jFs LJI;
    public List<LyraxTranscoderFeature> LJIIIZ;
    public C1273190jEj LJIIL;
    public SurfaceView LJIILIIL;
    public final Map<String, SurfaceView> LJIILL;
    public final Map<String, LyraxVideoRendererWrapper> LJIILLIIL;
    public final Map<String, String> LJIIZILJ;
    public final Map<String, Boolean> LJIJ;
    public final Map<String, Float> LJIJI;
    public ByteBuffer LJIJJ;
    public C1274950jHZ LJIJJLI;
    public final Map<String, C1276670jKL> LJIL;
    public EnumC1275390jIH LJJ;
    public boolean LJJI;
    public int LJJIFFI;
    public final InterfaceC1274800jHK LJJII;
    public InterfaceC1274710jHB LJJIII;
    public final C1274720jHC LJJIIJ;
    public final C1274750jHF LJJIIJZLJL;
    public final Map<String, RemoteStreamStats> LJJIIZ;
    public final ConcurrentHashMap<String, C1275100jHo> LJJIIZI;
    public final ConcurrentHashMap<String, int[]> LJJIJ;
    public final List<String> LJJIJIIJI;
    public final List<String> LJJIJIIJIL;
    public volatile boolean LJJIJIL;
    public final Map<String, C1275750jIr> LJJIJL;
    public C1268130j6Z LJJIJLIJ;
    public final C1274870jHR LJJIL;
    public final C1269240j8M LJII = new C1269240j8M();
    public final C1274780jHI LJIIIIZZ = new C1274780jHI();
    public final AtomicLong LJIIJ = new AtomicLong(0);
    public final Map<String, Integer> LJIIJJI = new HashMap();
    public boolean LJIILJJIL = false;

    @Override // X.InterfaceC1276380jJs
    public final void LIZIZ() {
        LLFF(true, false);
    }

    @Override // X.InterfaceC1272020jCq
    public final void LIZJ(List<C1269610j8x> list) {
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJI() {
        LLF(null, true, false, true, null);
    }

    @Override // X.InterfaceC1272020jCq
    public final void LJII() {
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJLZIJ() {
        this.LJJI = true;
    }

    public final void LJLLLLLL() {
        if (this.LJJIII == null) {
            return;
        }
        synchronized (this.LJJIJIIJIL) {
            try {
                for (String str : this.LJJIJIIJIL) {
                    if (!TextUtils.isEmpty(str) && !TextUtils.equals(str, this.LIZJ.LJFF)) {
                        this.LJJIII.LIZ(this, 33, 0L, 0L, str, LJLJLJ(LJJIJIIJIL(LyraxStreamIndex.kMain.value(), str)));
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void dispose() {
        C1269340j8W c1269340j8WLLD;
        C1269910j9R c1269910j9RLJIJJ;
        this.LJJIJIL = false;
        LJLILLLLZI();
        synchronized (this.LJJIJIIJIL) {
            try {
                ((ArrayList) this.LJJIJIIJIL).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJJZZIII();
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null && (c1269910j9RLJIJJ = c1269340j8WLLD.LJIJJ()) != null) {
            c1269910j9RLJIJJ.LIZJ(this.LJJIIJZLJL);
        }
        LJLIIIL();
        this.LIZ.destroy();
    }

    @Override // X.InterfaceC1276380jJs
    public final void stop() {
        C1269340j8W c1269340j8WLLD;
        C1269910j9R c1269910j9RLJIJJ;
        this.LJJIJIL = false;
        LLFF(true, false);
        LJLILLLLZI();
        synchronized (this.LJJIJIIJIL) {
            try {
                ((ArrayList) this.LJJIJIIJIL).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LJJZZIII();
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null && (c1269910j9RLJIJJ = c1269340j8WLLD.LJIJJ()) != null) {
            c1269910j9RLJIJJ.LIZJ(this.LJJIIJZLJL);
        }
        LJLIIIL();
        this.LIZ.destroy();
    }

    @Override // X.InterfaceC1276380jJs
    public final void LIZ() {
        this.LJI.startAudioCapture();
        this.LIZ.publishVideoStream(true);
        this.LJJIJIL = true;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJIILIIL() {
        ((ConcurrentHashMap) this.LJIL).clear();
    }

    @Override // X.InterfaceC1276380jJs
    public final List<C1276580jKC> LJIILL() {
        C1269160j8E c1269160j8E;
        InterfaceC1266360j3i interfaceC1266360j3i;
        ASRWordMuting aSRWordMutingLJIJI;
        ArrayList arrayList = new ArrayList();
        for (C1275750jIr c1275750jIr : this.LJJIJL.values()) {
            C1276580jKC c1276580jKC = new C1276580jKC();
            c1276580jKC.LIZIZ = c1275750jIr.LIZ;
            boolean z = c1275750jIr.LIZLLL;
            c1276580jKC.LJIILLIIL = z;
            c1276580jKC.LJIIZILJ = c1275750jIr.LIZIZ;
            c1276580jKC.LJIJ = c1275750jIr.LIZJ;
            if (!z && (c1269160j8E = this.LJ) != null && (interfaceC1266360j3i = c1269160j8E.LJI) != null && (aSRWordMutingLJIJI = interfaceC1266360j3i.LJIJI()) != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("enable_word_muting", aSRWordMutingLJIJI.enableWordMuting);
                    jSONObject.put("enable_segment_store", aSRWordMutingLJIJI.enableSegmentStore);
                    jSONObject.put("enable_sdk_callback", aSRWordMutingLJIJI.enableSdkCallback);
                    jSONObject.put("enable", aSRWordMutingLJIJI.enable);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("effectType", 2);
                    jSONObject2.put("effectParam", jSONObject);
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(jSONObject2);
                    c1276580jKC.LJIJI = new C1276160jJW(arrayList2);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                    AVLog.logKibana(4, "ClientImplNative", "asrWordsMuting effectDesc error", e);
                }
            }
            arrayList.add(c1276580jKC);
        }
        synchronized (this.LJJIJIIJIL) {
            try {
                for (String str : this.LJJIJIIJIL) {
                    C1276580jKC c1276580jKC2 = new C1276580jKC();
                    c1276580jKC2.LIZIZ = str;
                    arrayList.add(c1276580jKC2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (C1267520j5a.LIZ()) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                it2.next();
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC1276380jJs
    public final View LJJIJLIJ() {
        SurfaceView surfaceView = this.LJIILIIL;
        if (surfaceView != null) {
            return surfaceView;
        }
        SurfaceView surfaceView2 = new SurfaceView(this.LJ.LJLJI.LJIIZILJ);
        this.LJIILIIL = surfaceView2;
        C1273190jEj c1273190jEj = this.LJIIL;
        c1273190jEj.getClass();
        SurfaceHolder holder = surfaceView2.getHolder();
        if (holder != null) {
            holder.addCallback(new SurfaceHolderCallbackC1273170jEh(c1273190jEj));
        }
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1276380jJs
    public final JSONArray LJJJJJL() {
        return new JSONArray();
    }

    @Override // X.InterfaceC1276380jJs
    public final JSONArray LJJLIL() {
        return new JSONArray();
    }

    public final void LJJZZIII() {
        C1275100jHo c1275100jHoRemove;
        for (String str : new ArrayList(this.LJJIIZI.keySet())) {
            if (!TextUtils.isEmpty(str) && (c1275100jHoRemove = this.LJJIIZI.remove(str)) != null) {
                c1275100jHoRemove.LIZ();
            }
        }
        this.LJJIJ.clear();
        ((ConcurrentHashMap) this.LJIJI).clear();
        LJLI();
        synchronized (this.LJJIJL) {
            try {
                Iterator it2 = ((LinkedHashMap) this.LJJIJL).entrySet().iterator();
                while (it2.hasNext()) {
                    C1275750jIr c1275750jIr = (C1275750jIr) ((Map.Entry) it2.next()).getValue();
                    if (c1275750jIr != null && c1275750jIr.LIZLLL) {
                        it2.remove();
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJLI() {
        synchronized (this.LJJIJIIJI) {
            try {
                this.LJJIJIIJI.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJLIIIL() {
        for (Map.Entry<String, LyraxVideoRendererWrapper> entry : this.LJIILLIIL.entrySet()) {
            String key = entry.getKey();
            if (this.LIZ != null && !TextUtils.isEmpty(key)) {
                this.LIZ.removeVideoRenderer(key);
            }
            LyraxVideoRendererWrapper value = entry.getValue();
            if (value != null) {
                value.release();
            }
        }
        this.LJIILLIIL.clear();
        this.LJIIZILJ.clear();
        this.LJIILL.clear();
        this.LJIJ.clear();
    }

    public final void LJLILLLLZI() {
        ARunnableS120S0100000_20 aRunnableS120S0100000_20 = new ARunnableS120S0100000_20(this, 281);
        Handler handlerLIZJ = C1274690jH9.LIZJ();
        if (handlerLIZJ == null || C786410Ut5.u3() == handlerLIZJ.getLooper().getThread()) {
            aRunnableS120S0100000_20.run();
        } else {
            C786410Ut5.LJJZZIII(handlerLIZJ, aRunnableS120S0100000_20);
        }
    }

    public final C1269300j8S LJLJJL() {
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs == null || abstractC1273900jFs.LJJIIJZLJL() == null || abstractC1273900jFs.LJJIIJZLJL().LIZJ == null) {
            return null;
        }
        return (C1269300j8S) abstractC1273900jFs.LJJIIJZLJL().LIZJ.getService(C1269300j8S.class);
    }

    @Override // X.InterfaceC1276380jJs
    public final void disableDownlinkAudioSelection() {
        this.LIZ.disableDownlinkAudioSelection();
    }

    @Override // X.InterfaceC1276380jJs
    public final void joinChannel() {
        String str = this.LIZJ.LJFF;
        StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
        LJLJI(str, "interactId");
        LJLJI(streamIndex, "streamIndex");
        LJLJI(Boolean.FALSE, "isAuxStream");
        String strLJZ = LJZ(streamIndex.value(), str);
        synchronized (this.LJJIJL) {
            try {
                if (!this.LJJIJL.containsKey(strLJZ)) {
                    this.LJJIJL.put(strLJZ, new C1275750jIr(streamIndex.value(), str, strLJZ, false));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        this.LIZ.joinChannel();
        this.LJJIJIL = true;
        if (this.LIZIZ.LJIIL == EnumC1274430jGj.GUEST) {
            setLinkmicStateForAnchorNet();
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void pause() {
        this.LIZ.muteLocalAudioStream(true);
        this.LIZ.muteLocalVideoStream(true);
    }

    @Override // X.InterfaceC1276380jJs
    public final void resume() {
        this.LIZ.muteLocalAudioStream(false);
        this.LIZ.muteLocalVideoStream(false);
    }

    @Override // X.InterfaceC1276380jJs
    public final void setLinkmicStateForAnchorNet() {
        this.LIZ.setLinkmicStateForAnchorNet();
    }

    @Override // X.InterfaceC1276380jJs
    public final void stopForwardStreamToRooms() {
        this.LIZ.stopForwardStreamToRooms();
    }

    @Override // X.InterfaceC1276380jJs
    public final List<String> LJJJZ() {
        return Collections.emptyList();
    }

    @Override // X.InterfaceC1276380jJs
    public final boolean LJJJJLL() {
        return true;
    }

    @Override // X.InterfaceC1276380jJs
    public final RTCVideoInterface LJJJJZ() {
        return null;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJL() {
    }

    @Override // X.InterfaceC1276380jJs
    public final boolean LJJLIIIJLLLLLLLZ() {
        return this.LJJI;
    }

    @Override // X.InterfaceC1276380jJs
    public final boolean Z4() {
        return this.LJJIJIL;
    }

    @Override // X.InterfaceC1276380jJs
    public final C1275030jHh getConfig() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC1276380jJs
    public final List<LyraxTranscoderFeature> getFeatures() {
        return this.LJIIIZ;
    }

    public static List<LyraxForwardStreamInfo> LJLIIL(List<C1275450jIN> list) {
        ArrayList arrayList = new ArrayList();
        for (C1275450jIN c1275450jIN : (ArrayList) list) {
            LyraxForwardStreamInfo lyraxForwardStreamInfo = new LyraxForwardStreamInfo();
            lyraxForwardStreamInfo.roomId = c1275450jIN.LIZ;
            String str = c1275450jIN.LIZIZ;
            String strOptString = "";
            if (!TextUtils.isEmpty(str)) {
                try {
                    JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("live_rtc_engine_config");
                    if (jSONObjectOptJSONObject != null) {
                        strOptString = jSONObjectOptJSONObject.optString("rtc_token", "");
                    }
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
            lyraxForwardStreamInfo.token = strOptString;
            arrayList.add(lyraxForwardStreamInfo);
        }
        return arrayList;
    }

    public static VideoEncoderConfig LJLL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new VideoEncoderConfig(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("fps"), jSONObject.optInt("bitrate_kbps"), 0);
    }

    public static LyraxLiveType LJZL(EnumC1267980j6K enumC1267980j6K) {
        LJLJI(enumC1267980j6K, "liveScene");
        LJLJI(enumC1267980j6K, "liveScene");
        if (enumC1267980j6K != EnumC1267980j6K.GAME_LIVE && enumC1267980j6K != EnumC1267980j6K.GAME_DUAL_DEVICE) {
            return LyraxLiveType.VIDEO;
        }
        return LyraxLiveType.GAME;
    }

    @Override // X.InterfaceC1268200j6g
    public final void LIZLLL(List<VideoEncoderConfig> list) {
        LyraxVideoEncoderMode lyraxVideoEncoderMode;
        LJLJI(list, "encodeConfigs");
        if (list != null) {
            ArrayList arrayList = (ArrayList) list;
            if (!arrayList.isEmpty()) {
                if (arrayList.size() == 2) {
                    lyraxVideoEncoderMode = LyraxVideoEncoderMode.SIMULCAST;
                } else {
                    lyraxVideoEncoderMode = LyraxVideoEncoderMode.SINGLE;
                }
                LyraxVideoEncoderConfig lyraxVideoEncoderConfig = new LyraxVideoEncoderConfig(lyraxVideoEncoderMode, new ArrayList(arrayList.size()));
                for (int i = 0; i < arrayList.size(); i++) {
                    VideoEncoderConfig videoEncoderConfig = (VideoEncoderConfig) ListProtector.get(list, i);
                    if (videoEncoderConfig != null) {
                        LyraxVideoEncoderProfile lyraxVideoEncoderProfile = new LyraxVideoEncoderProfile();
                        lyraxVideoEncoderProfile.width = videoEncoderConfig.width;
                        lyraxVideoEncoderProfile.height = videoEncoderConfig.height;
                        lyraxVideoEncoderProfile.frameRate = videoEncoderConfig.frameRate;
                        lyraxVideoEncoderProfile.maxBitrate = videoEncoderConfig.maxBitrate;
                        lyraxVideoEncoderProfile.minBitrate = videoEncoderConfig.minBitrate;
                        VideoEncoderConfig.EncoderPreference encoderPreference = videoEncoderConfig.encodePreference;
                        if (encoderPreference != null) {
                            lyraxVideoEncoderProfile.encodePreference = LyraxVideoEncoderPreference.fromId(encoderPreference.getValue());
                        }
                        if (videoEncoderConfig.minBitrateTables != null) {
                            lyraxVideoEncoderProfile.minBitrateTables = new ArrayList(videoEncoderConfig.minBitrateTables.size());
                            for (BitRateTable bitRateTable : videoEncoderConfig.minBitrateTables) {
                                if (bitRateTable != null) {
                                    LyraxBitRateTable lyraxBitRateTable = new LyraxBitRateTable();
                                    lyraxBitRateTable.pixels = bitRateTable.pixels;
                                    lyraxBitRateTable.minKbps = bitRateTable.minKbps;
                                    lyraxVideoEncoderProfile.minBitrateTables.add(lyraxBitRateTable);
                                }
                            }
                        }
                        if (videoEncoderConfig.degradeLevels != null) {
                            lyraxVideoEncoderProfile.degradeLevels = new LyraxVideoEncoderProfile.VideoDegradeLevels();
                            List<VideoDegradeConfig> list2 = videoEncoderConfig.degradeLevels.perf;
                            if (list2 != null) {
                                for (VideoDegradeConfig videoDegradeConfig : list2) {
                                    if (videoDegradeConfig != null) {
                                        LyraxVideoDegradeConfig lyraxVideoDegradeConfig = new LyraxVideoDegradeConfig();
                                        lyraxVideoDegradeConfig.width = videoDegradeConfig.width;
                                        lyraxVideoDegradeConfig.height = videoDegradeConfig.height;
                                        lyraxVideoDegradeConfig.framerate = videoDegradeConfig.framerate;
                                        lyraxVideoDegradeConfig.upThresholdKbps = videoDegradeConfig.upThresholdKbps;
                                        lyraxVideoDegradeConfig.downThresholdKbps = videoDegradeConfig.downThresholdKbps;
                                        lyraxVideoEncoderProfile.degradeLevels.perf.add(lyraxVideoDegradeConfig);
                                    }
                                }
                            }
                            List<VideoDegradeConfig> list3 = videoEncoderConfig.degradeLevels.f440net;
                            if (list3 != null) {
                                for (VideoDegradeConfig videoDegradeConfig2 : list3) {
                                    if (videoDegradeConfig2 != null) {
                                        LyraxVideoDegradeConfig lyraxVideoDegradeConfig2 = new LyraxVideoDegradeConfig();
                                        lyraxVideoDegradeConfig2.width = videoDegradeConfig2.width;
                                        lyraxVideoDegradeConfig2.height = videoDegradeConfig2.height;
                                        lyraxVideoDegradeConfig2.framerate = videoDegradeConfig2.framerate;
                                        lyraxVideoDegradeConfig2.upThresholdKbps = videoDegradeConfig2.upThresholdKbps;
                                        lyraxVideoDegradeConfig2.downThresholdKbps = videoDegradeConfig2.downThresholdKbps;
                                        lyraxVideoEncoderProfile.degradeLevels.f441net.add(lyraxVideoDegradeConfig2);
                                    }
                                }
                            }
                        }
                        if (videoEncoderConfig.resolutionBase != null) {
                            lyraxVideoEncoderProfile.resolutionBase = new ArrayList(videoEncoderConfig.resolutionBase.size());
                            for (VideoResolutionConfig videoResolutionConfig : videoEncoderConfig.resolutionBase) {
                                if (videoResolutionConfig != null) {
                                    LyraxVideoResolutionConfig lyraxVideoResolutionConfig = new LyraxVideoResolutionConfig();
                                    lyraxVideoResolutionConfig.width = videoResolutionConfig.width;
                                    lyraxVideoResolutionConfig.height = videoResolutionConfig.height;
                                    lyraxVideoResolutionConfig.framerate = videoResolutionConfig.framerate;
                                    lyraxVideoResolutionConfig.maxKbps = videoResolutionConfig.maxKbps;
                                    lyraxVideoResolutionConfig.minKbps = videoResolutionConfig.minKbps;
                                    lyraxVideoResolutionConfig.defaultKbps = videoResolutionConfig.defaultKbps;
                                    lyraxVideoEncoderProfile.resolutionBase.add(lyraxVideoResolutionConfig);
                                }
                            }
                        }
                        lyraxVideoEncoderConfig.encoderProfiles.add(lyraxVideoEncoderProfile);
                    }
                }
                if (lyraxVideoEncoderConfig.encoderProfiles.isEmpty()) {
                    return;
                }
                this.LIZ.setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN.value(), lyraxVideoEncoderConfig);
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJFF(String str) {
        LJLJI(str, "streamId");
        int iUnsubscribeAuxStream = this.LIZ.unsubscribeAuxStream(str);
        LJL(str);
        return iUnsubscribeAuxStream;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJIIIIZZ(List<LyraxTranscoderFeature> list) {
        C1269160j8E c1269160j8E = this.LJ;
        if (c1269160j8E != null && c1269160j8E.LIZ.mVPassInteractCfg != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                if (list != null) {
                    for (LyraxTranscoderFeature lyraxTranscoderFeature : list) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("featureName", lyraxTranscoderFeature.getFeatureName());
                        jSONObject2.put("projectKey", lyraxTranscoderFeature.getProjectKey());
                        jSONObject2.put("options", lyraxTranscoderFeature.getOptions());
                        jSONArray.put(jSONObject2);
                    }
                }
                jSONObject.put("features", jSONArray);
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
            AVLog.logApiCall("RTCInteractAPI", "setFeatures", jSONObject);
        }
        if (this.LIZIZ.LJIIL != EnumC1274430jGj.ANCHOR) {
            return;
        }
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, list, 177));
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJIIIZ(C969430bKn c969430bKn) {
        LJLJI(c969430bKn, "mixStreamParams");
        this.LIZLLL.LJIIL(c969430bKn, this.LJJ);
    }

    @Override // X.InterfaceC1268200j6g
    public final void LJIIJJI(C1268130j6Z c1268130j6Z) {
        LJLJI(c1268130j6Z, "linkMicVideoParamsManager");
        this.LJJIJLIJ = c1268130j6Z;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJIIL(int i) {
        LJLJI(Integer.valueOf(i), "audioScene");
        this.LIZ.setAudioScene(i);
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJIILLIIL(String str) {
        LJLJI(str, "streamId");
        int iStopAuxStream = this.LIZ.stopAuxStream(str);
        LJL(str);
        return iStopAuxStream;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJIIZILJ(String str) {
        LJLJI(str, "sdkParamsNew");
        this.LIZ.parseSDKParams(str);
    }

    public final void LJIJJLI(JSONObject jSONObject) {
        int i;
        int i2;
        C1269160j8E c1269160j8E = this.LJ;
        if (c1269160j8E == null) {
            return;
        }
        LJLLL(jSONObject, "initial_camera_width", Integer.valueOf(c1269160j8E.LJLJI.LJJJIL));
        LJLLL(jSONObject, "initial_camera_height", Integer.valueOf(c1269160j8E.LJLJI.LJJJJ));
        C1269140j8C c1269140j8C = c1269160j8E.LJLJI;
        int i3 = c1269140j8C.LJJJJJ;
        int i4 = c1269140j8C.LJJJJJL;
        C1271250jBb c1271250jBb = C1271270jBd.LIZ;
        LJLLL(jSONObject, "initial_encode_width", Integer.valueOf(c1271250jBb.LIZ.LJ(i3, i4, 0)));
        C1269140j8C c1269140j8C2 = c1269160j8E.LJLJI;
        int i5 = c1269140j8C2.LJJJJJ;
        int i6 = c1269140j8C2.LJJJJJL;
        C1271260jBc c1271260jBc = c1271250jBb.LIZ;
        if (i6 > 0) {
            if (c1271260jBc.LJFF(0) && (i5 * 1.0f) / i6 >= c1271260jBc.LIZLLL() && (i2 = c1271260jBc.LJJI) > 0) {
                i6 = (((i6 + i2) - 1) / i2) * i2;
            }
        } else {
            c1271260jBc.getClass();
        }
        LJLLL(jSONObject, "initial_encode_height", Integer.valueOf(i6));
        C1269140j8C c1269140j8C3 = c1269160j8E.LJLJI;
        LJLLL(jSONObject, "initial_effect_width", Integer.valueOf(c1271250jBb.LIZ.LJ(c1269140j8C3.LJJJJI, c1269140j8C3.LJJJJIZL, 0)));
        C1269140j8C c1269140j8C4 = c1269160j8E.LJLJI;
        int i7 = c1269140j8C4.LJJJJI;
        int i8 = c1269140j8C4.LJJJJIZL;
        C1271260jBc c1271260jBc2 = c1271250jBb.LIZ;
        if (i8 > 0) {
            if (c1271260jBc2.LJFF(0) && (i7 * 1.0f) / i8 >= c1271260jBc2.LIZLLL() && (i = c1271260jBc2.LJJI) > 0) {
                i8 = (((i8 + i) - 1) / i) * i;
            }
        } else {
            c1271260jBc2.getClass();
        }
        LJLLL(jSONObject, "initial_effect_height", Integer.valueOf(i8));
        LJLLL(jSONObject, "thermal_score", Integer.valueOf(c1269160j8E.LJJJZ));
        LJLLL(jSONObject, "perf_score", Integer.valueOf(c1269160j8E.LJJL));
        LJLLLL(jSONObject, "pusher_type", c1269160j8E.LJIL());
        LJLLL(jSONObject, "is_pusher_fallback", Integer.valueOf(c1269160j8E.LJLJI.LJJIL.LJFF ? 1 : 0));
        if (c1269160j8E.LJIIL() != null) {
            LJLLL(jSONObject, "probe_engine", c1269160j8E.LJIIL().value());
        }
        if (!TextUtils.isEmpty(c1269160j8E.LJJIJLIJ())) {
            LJLLL(jSONObject, "ttlh_video_quality_strategy_version", c1269160j8E.LJJIJLIJ());
        }
        if (c1269160j8E.LJJJJIZL) {
            LJLLL(jSONObject, "video_capture_fps", Integer.valueOf(c1269160j8E.LJJIII()));
        }
    }

    public final void LJJ(JSONObject jSONObject) {
        String str;
        String str2;
        LJLLLL(jSONObject, "version", BuildConfig.VERSION_NAME);
        LJLLLL(jSONObject, "event_key", "rtc_push_stream");
        LJLLLL(jSONObject, "mode", "rtc");
        LJLLLL(jSONObject, "timestamp", Long.valueOf(System.currentTimeMillis()));
        LJLLLL(jSONObject, "project_key", this.LIZIZ.LJFF);
        LJLLLL(jSONObject, "report_version", 5);
        LJLLLL(jSONObject, "product_line", "live");
        LJLLLL(jSONObject, "sdkParams", this.LIZIZ.LIZLLL);
        LJLLLL(jSONObject, "rtc_channel_id", this.LIZJ.LIZLLL);
        LJLLLL(jSONObject, "rtc_user_id", this.LIZJ.LJFF);
        LJLLLL(jSONObject, "rtc_type", this.LIZIZ.LJIILL.toString());
        EnumC1275310jI9 enumC1275310jI9 = this.LIZIZ.LJIIJJI;
        String str3 = "unknown";
        if (enumC1275310jI9 == EnumC1275310jI9.VIDEO) {
            str = "video";
        } else if (enumC1275310jI9 != EnumC1275310jI9.AUDIO) {
            str = "unknown";
        } else {
            str = "audio";
        }
        LJLLLL(jSONObject, "rtc_interact_type", str);
        LJLLLL(jSONObject, "rtc_vendor", this.LIZJ.LJI);
        EnumC1274430jGj enumC1274430jGj = this.LIZIZ.LJIIL;
        if (enumC1274430jGj == EnumC1274430jGj.ANCHOR) {
            str3 = "host";
        } else if (enumC1274430jGj == EnumC1274430jGj.GUEST) {
            str3 = "guest";
        }
        LJLLLL(jSONObject, "rtc_role", str3);
        String strNativeGetSDKVersion = InteractImpl.nativeGetSDKVersion();
        LJLLLL(jSONObject, "rtc_version", strNativeGetSDKVersion);
        LJLLLL(jSONObject, "rtc_sdk_version", strNativeGetSDKVersion);
        LJLLLL(jSONObject, "live_sdk_version", "7.22.0.93900");
        LJLLLL(jSONObject, "rtc_app_channel", this.LIZIZ.LJII);
        LJLLLL(jSONObject, "rtc_report_id", Long.valueOf(this.LJIIJ.incrementAndGet()));
        LJLLLL(jSONObject, "mix_type", this.LIZIZ.LJJIFFI.toString());
        LJLLLL(jSONObject, "stream_name", this.LIZIZ.LIZ().LJIILLIIL);
        EnumC1275320jIA enumC1275320jIA = this.LIZIZ.LIZ().LJII;
        if (enumC1275320jIA == EnumC1275320jIA.H264) {
            str2 = "h264";
        } else if (enumC1275320jIA == EnumC1275320jIA.BYTEVC1) {
            str2 = "bytevc1";
        } else {
            str2 = "";
        }
        LJLLLL(jSONObject, "video_codec", str2);
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            LJLLLL(jSONObject, "live_stream_session_id", abstractC1273900jFs.LLIIJLIL());
        }
    }

    public final void LJJIIJ(JSONObject jSONObject) {
        float fLJLJL;
        LiveSdkSetting liveSdkSetting;
        C1273620jFQ c1273620jFQLLII;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs == null) {
            return;
        }
        try {
            synchronized (this.LJII) {
                try {
                    abstractC1273900jFs.LLFFF(this.LJII);
                    if (!abstractC1273900jFs.LLIZLLLIL()) {
                        if (abstractC1273900jFs.LLJJ()) {
                            fLJLJL = abstractC1273900jFs.LLFZ();
                        } else {
                            fLJLJL = (float) C1274640jH4.LIZ(this.LJII.getVideoSourceDeliverFps());
                        }
                    } else if (abstractC1273900jFs.LLJ()) {
                        fLJLJL = LJLJL(abstractC1273900jFs, "key_effect_out_fps");
                    } else {
                        fLJLJL = LJLJL(abstractC1273900jFs, "key_effect_out_fps");
                    }
                    LJLLL(jSONObject, "out_cap_fps", Float.valueOf(fLJLJL));
                    if (abstractC1273900jFs.LLD() != null && abstractC1273900jFs.LLD().LIZ != null && abstractC1273900jFs.LLD().LIZ.LJIL()) {
                        fLJLJL = abstractC1273900jFs.LJLLLLLL();
                    }
                    LJLLL(jSONObject, "preview_fps", Float.valueOf(fLJLJL));
                    LJLLL(jSONObject, "camera_average_exposure_time", Long.valueOf(this.LJII.getLong("camera_average_exposure_time")));
                    LJLLL(jSONObject, "camera_average_fps", Long.valueOf(this.LJII.getLong("camera_average_fps")));
                    LJLLL(jSONObject, "camera_iso_info", Long.valueOf(this.LJII.getLong("camera_iso_info")));
                    LJLLL(jSONObject, "camera_capture_width", Integer.valueOf(this.LJII.getInt("camera_capture_width")));
                    LJLLL(jSONObject, "camera_capture_height", Integer.valueOf(this.LJII.getInt("camera_capture_height")));
                    LJLLL(jSONObject, "camera_type", Integer.valueOf(this.LJII.getInt("camera_type")));
                    LJLLL(jSONObject, "current_capture_device", Integer.valueOf(this.LJII.getInt("current_capture_device")));
                    LJLLL(jSONObject, "camera_avg_result_fps", Double.valueOf(this.LJII.getDouble("camera_avg_result_fps")));
                    LJLLL(jSONObject, "camera_real_fps", Double.valueOf(this.LJII.getDouble("camera_avg_result_fps")));
                    LJLLL(jSONObject, "camera_fps_range", this.LJII.getString("camera_fps_range"));
                    LJLLL(jSONObject, "camera_real_fps_range", this.LJII.getString("camera_fps_range"));
                    LJLLL(jSONObject, "capture_device", Integer.valueOf(this.LJII.getInt("current_capture_device")));
                    LJLLL(jSONObject, "nobuffercnt", Long.valueOf(this.LJII.getLong("nobuffercnt")));
                    LJLLL(jSONObject, "skip_effect", Boolean.valueOf(this.LJII.getBool("skip_effect")));
                    LJLLL(jSONObject, "camera_target_fps", Integer.valueOf(this.LJII.getInt("camera_target_fps")));
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            if (abstractC1273900jFs.LLJ()) {
                LJLLL(jSONObject, "in_cap_fps", Float.valueOf(LJLJL(abstractC1273900jFs, "key_in_cap_fps")));
            } else {
                InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI = abstractC1273900jFs.LJIJJLI();
                if (interfaceC1268690j7TLJIJJLI != null) {
                    LJLLL(jSONObject, "in_cap_fps", Float.valueOf(interfaceC1268690j7TLJIJJLI.LLILL()));
                }
            }
            LJIL(jSONObject, abstractC1273900jFs);
            LJJII(jSONObject, abstractC1273900jFs);
            LJJIFFI(jSONObject, abstractC1273900jFs);
            LJIJJLI(jSONObject);
            LJJI(jSONObject, abstractC1273900jFs);
            C1269160j8E c1269160j8E = this.LJ;
            if (c1269160j8E != null && (liveSdkSetting = c1269160j8E.LIZ) != null && liveSdkSetting.LJIL() && (c1273620jFQLLII = abstractC1273900jFs.LLII()) != null) {
                LJLLL(jSONObject, "effect_real_process_time", Long.valueOf(c1273620jFQLLII.LIZ()));
            }
            LJIJ(jSONObject, abstractC1273900jFs);
            int[] iArr = new int[2];
            this.LJI.LJJLI(iArr);
            LJLLL(jSONObject, "adapted_resolution_width", Integer.valueOf(iArr[0]));
            LJLLL(jSONObject, "adapted_resolution_height", Integer.valueOf(iArr[1]));
        } catch (Throwable th) {
        }
    }

    public final void LJJIIJZLJL(JSONObject jSONObject) {
        C1269910j9R c1269910j9RLJIJJ;
        C1269820j9I c1269820j9I;
        AbstractC1273900jFs abstractC1273900jFs;
        C1269160j8E c1269160j8ELLD = this.LJ;
        if ((c1269160j8ELLD != null || ((abstractC1273900jFs = this.LJI) != null && (c1269160j8ELLD = abstractC1273900jFs.LLD()) != null)) && (c1269910j9RLJIJJ = c1269160j8ELLD.LJIJJ()) != null && (c1269820j9I = c1269910j9RLJIJJ.LIZIZ) != null) {
            LJLLLL(jSONObject, "network_quality_v3", Integer.valueOf(c1269820j9I.LIZ));
            LJLLLL(jSONObject, "stream_quality", Integer.valueOf(c1269820j9I.LIZIZ));
            LJLLLL(jSONObject, "ttnet_network_quality", Integer.valueOf(c1269820j9I.LIZJ));
        }
    }

    public final void LJJIIZ(String str) {
        if (!TextUtils.isEmpty(str) && this.LIZ != null) {
            SurfaceView surfaceViewLJLJLJ = LJLJLJ(str);
            if (surfaceViewLJLJLJ != null) {
                this.LIZ.setRemoteVideoRenderTargetView(str, surfaceViewLJLJLJ);
            }
            this.LIZ.updateSingleViewModeFlag(this.LJIILJJIL);
        }
    }

    public final void LJJIIZI(AbstractC1273900jFs abstractC1273900jFs) {
        if (abstractC1273900jFs == null) {
            return;
        }
        VideoSink videoSink = new VideoSink() { // from class: X.0jGg
            @Override // com.ss.ttlivestreamer.core.engine.VideoSink
            public final void OnDiscardedFrame() {
            }

            @Override // com.ss.ttlivestreamer.core.engine.VideoSink
            public final void onFrame(VideoFrame videoFrame) {
            }
        };
        abstractC1273900jFs.LLLLII(videoSink);
        abstractC1273900jFs.LLLILZLLLI(this);
        if (abstractC1273900jFs.LLJILJIL() && this.LIZ != null) {
            InterfaceC1266410j3n interfaceC1266410j3nLLILII = abstractC1273900jFs.LLILII();
            if (interfaceC1266410j3nLLILII instanceof ILyraxVideoPlatformWrapper) {
                int videoSource = this.LIZ.setVideoSource((ILyraxVideoPlatformWrapper) interfaceC1266410j3nLLILII);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("bindWrapperToRtcPublisher result=");
                sbLIZ.append(videoSource);
                AVLog.logKibana(4, "ClientImplNative", C2188811AlT.LIZIZ(sbLIZ), null);
            }
        }
        abstractC1273900jFs.LLLLII(videoSink);
    }

    @Override // X.InterfaceC1276380jJs
    public final C1275750jIr LJJIJ(C01IN c01in) {
        LJLJI(c01in, "config");
        if (c01in == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            String str = c01in.LIZ;
            if (str != null) {
                jSONObject.put("stream_id", str);
            }
            jSONObject.put("stream_index", -1);
            C01IL c01il = c01in.LIZIZ;
            if (c01il != null) {
                jSONObject.put("width", c01il.LIZ);
                jSONObject.put("height", c01il.LIZIZ);
                jSONObject.put("fps", c01il.LIZJ);
                jSONObject.put("bitrate_kbps", c01il.LIZLLL);
            }
            AuxStreamInfo auxStreamInfoCreateAuxStream = this.LIZ.createAuxStream(C786410Ut5.J3(jSONObject));
            if (auxStreamInfoCreateAuxStream == null) {
                return null;
            }
            C1275750jIr c1275750jIr = new C1275750jIr(auxStreamInfoCreateAuxStream.getStreamIndex().value(), auxStreamInfoCreateAuxStream.getInteractId(), auxStreamInfoCreateAuxStream.getStreamId(), true);
            synchronized (this.LJJIJL) {
                try {
                    this.LJJIJL.put(auxStreamInfoCreateAuxStream.getStreamId(), c1275750jIr);
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            LL(auxStreamInfoCreateAuxStream.getStreamId(), c01il);
            return c1275750jIr;
        } catch (Exception th) {
            return null;
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJIJIIJI(C969430bKn c969430bKn) {
        LJLJI(c969430bKn, "mixStreamParams");
        this.LIZLLL.LJIIL(c969430bKn, this.LJJ);
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJIJL(C1273200jEk c1273200jEk) {
        LJLJI(c1273200jEk, "params");
        C1273190jEj c1273190jEj = this.LJIIL;
        if (c1273190jEj != null) {
            c1273190jEj.LJIILJJIL(c1273200jEk);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJIZ(int i) {
        LJLJI(Integer.valueOf(i), "diff");
        TimeUtils.setLocalTimeGapWithServer(i);
        this.LIZ.setSEICurrentShiftDiffTimeMs(i);
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJ(List<C1276780jKW> list) {
        LJLJI(list, "compositeLayouts");
        C1273190jEj c1273190jEj = this.LJIIL;
        if (c1273190jEj != null) {
            c1273190jEj.LJIILL(new ArrayList(list));
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJI(C1274760jHG c1274760jHG) {
        LJLJI(c1274760jHG, "listener");
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJIL(boolean z) {
        LJLJI(Boolean.valueOf(z), "enable");
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJJJ(boolean z) {
        LJLJI(Boolean.valueOf(z), "enable");
        this.LIZIZ.LJJJJL = z;
    }

    @Override // X.InterfaceC1276380jJs
    public final boolean LJJJJLI(C1274190jGL c1274190jGL) {
        LJLJI(c1274190jGL, "layoutInfo");
        return false;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJLIIL(boolean z) {
        LJLJI(Boolean.valueOf(z), "mute");
        this.LIZ.muteLocalAudioStream(z);
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLI(boolean z) {
        boolean zLJI = MethodIDManager.LJI(71938);
        LJLJI(Boolean.valueOf(z), "mute");
        this.LIZ.muteLocalVideoStream(z);
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIJ(String str) {
        LJLJI(str, "streamId");
        if (!this.LJJIJL.containsKey(str)) {
            this.LJJIJL.put(str, new C1275750jIr(0, this.LIZJ.LJFF, str, true));
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIJILLIZJL(String str) {
        LJLJI(str, "streamId");
        LJLLJ(str);
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIJJI(Cert cert) {
        int i;
        int i2;
        String str;
        LJLJI(cert, "privacyCert");
        EnumC1275210jHz enumC1275210jHz = EnumC1275210jHz.SERVER_MIX;
        LJZI(enumC1275210jHz);
        C1276560jKA c1276560jKA = this.LIZLLL;
        c1276560jKA.LJFF.getClass();
        MixedStreamConfig mixedStreamConfigLIZLLL = c1276560jKA.LIZLLL(true);
        if (mixedStreamConfigLIZLLL == null) {
            C1275030jHh c1275030jHh = c1276560jKA.LIZ;
            if (c1275030jHh.LJIIL == EnumC1274430jGj.ANCHOR && c1275030jHh.LJJIFFI == enumC1275210jHz) {
                if (c1275030jHh.LIZ() == null) {
                    AVLog.ioe("StreamMixManager", "Fail to init LiveTranscoding: MixStreamConfig is null");
                    return;
                }
                if (TextUtils.isEmpty(c1276560jKA.LIZ.LIZ().LIZJ())) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Fail to init LiveTranscoding: stream url is ");
                    sbLIZ.append(c1276560jKA.LIZ.LIZ().LIZJ());
                    AVLog.ioe("StreamMixManager", C2188811AlT.LIZIZ(sbLIZ));
                    return;
                }
                AVLog.ioe("StreamMixManager", "Fail to init LiveTranscoding: unknown reason");
                return;
            }
            return;
        }
        C1275030jHh c1275030jHh2 = c1276560jKA.LIZ;
        InterfaceC1276590jKD interfaceC1276590jKD = c1275030jHh2.LJJIJLIJ;
        if (interfaceC1276590jKD == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("InteractConfig.getStreamMixer is null: interact mode ");
            sbLIZ2.append(c1276560jKA.LIZ.LJIILL);
            sbLIZ2.append(", character ");
            sbLIZ2.append(c1276560jKA.LIZ.LJIIL);
            sbLIZ2.append(", mix type ");
            sbLIZ2.append(c1276560jKA.LIZ.LJJIFFI);
            sbLIZ2.append(". Create client stack: ");
            c1276560jKA.LIZ.getClass();
            sbLIZ2.append((String) null);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            AVLog.ioe("StreamMixManager", strLIZIZ);
            AVLog.logKibana(6, "StreamMixManager", strLIZIZ, null);
            AndroidRuntimeException androidRuntimeException = new AndroidRuntimeException(strLIZIZ);
            C1274080jGA.LIZ.LIZ("StreamMixManager.configMixTranscoding", androidRuntimeException);
            if (!C1274040jG6.LIZ()) {
                return;
            } else {
                throw androidRuntimeException;
            }
        }
        C1274930jHX c1274930jHXLIZ = c1275030jHh2.LIZ();
        if (c1276560jKA.LIZ.LJJJJJ) {
            synchronized (c1274930jHXLIZ) {
                try {
                    i = c1274930jHXLIZ.LIZ;
                    i2 = c1274930jHXLIZ.LIZIZ;
                } finally {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } else {
            i = c1274930jHXLIZ.LIZ;
            i2 = c1274930jHXLIZ.LIZIZ;
        }
        List<C1276580jKC> listLJIILL = c1276560jKA.LJII.LJIILL();
        C1275140jHs c1275140jHs = c1276560jKA.LJI;
        if (c1275140jHs != null && (str = c1275140jHs.LIZLLL) != null) {
            c1276560jKA.LJIIIZ = str;
            if (TextUtils.isEmpty(str)) {
                C1267520j5a.LIZIZ("createMixTranscoding null roomId");
            }
            mixedStreamConfigLIZLLL.setRoomID(c1276560jKA.LJIIIZ);
        }
        String strMixStream = interfaceC1276590jKD.mixStream(i, i2, listLJIILL);
        if (listLJIILL == null || listLJIILL.isEmpty()) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("startMixStream with empty regions, sei: ");
            sbLIZ3.append(strMixStream);
            sbLIZ3.append(", region is invalid");
            AVLog.iow("StreamMixManager", C2188811AlT.LIZIZ(sbLIZ3));
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("startMixStream mixStream result: sei");
        sbLIZ4.append(strMixStream);
        sbLIZ4.append(", region:");
        sbLIZ4.append(C1276560jKA.LJIIIIZZ(listLJIILL));
        AVLog.iow("StreamMixManager", C2188811AlT.LIZIZ(sbLIZ4));
        c1276560jKA.LIZ(listLJIILL, mixedStreamConfigLIZLLL);
        mixedStreamConfigLIZLLL.getLayout().setUserConfigExtraInfo(strMixStream);
        if (c1276560jKA.LIZJ != null && !TextUtils.isEmpty(c1276560jKA.LIZ.LIZ().LIZJ())) {
            Matcher matcher = PatternProtector.compile("stream-[0-9]+([0-9]{5})").matcher(c1276560jKA.LIZ.LIZ().LIZJ());
            if (matcher.find()) {
                try {
                    c1276560jKA.LIZJ.put("streamName", matcher.group());
                    mixedStreamConfigLIZLLL.setAuthInfo(c1276560jKA.LIZJ);
                } catch (Exception e) {
                }
            }
            c1276560jKA.LIZJ = null;
        }
        boolean zLJIIJJI = c1276560jKA.LJIIJJI();
        if (zLJIIJJI) {
            C1274980jHc.LIZ(mixedStreamConfigLIZLLL);
        } else if (c1274930jHXLIZ.LIZJ) {
            C1274980jHc.LIZIZ(mixedStreamConfigLIZLLL, c1274930jHXLIZ.LJFF, zLJIIJJI);
        } else if (c1276560jKA.LIZIZ.LIZ.mVPassInteractCfg.LJIIJJI()) {
            mixedStreamConfigLIZLLL.getVideoConfig().setUpgradeRes(1080, 1920);
        }
        c1276560jKA.LIZIZ.getClass();
        mixedStreamConfigLIZLLL.setOrientation(c1276560jKA.LIZIZ.LJLJJI.getValue());
        c1276560jKA.LJ = true;
        C1275970jJD c1275970jJD = c1276560jKA.LJIIIIZZ;
        if (c1275970jJD != null) {
            c1275970jJD.LIZ(mixedStreamConfigLIZLLL);
        }
        mixedStreamConfigLIZLLL.setAuthInfo(null);
        C1274830jHN c1274830jHN = c1276560jKA.LIZLLL;
        if (c1274830jHN == null) {
            return;
        }
        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
        sbLIZ5.append("");
        sbLIZ5.append(c1276560jKA);
        sbLIZ5.append(mixedStreamConfigLIZLLL.toString());
        c1274830jHN.LJIIIIZZ("enableLiveTranscoding", C2188811AlT.LIZIZ(sbLIZ5));
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIJJIZ(EnumC1277210jLD enumC1277210jLD) {
        LJLJI(enumC1277210jLD, "viewMode");
        if (enumC1277210jLD == null) {
            return;
        }
        LLD(enumC1277210jLD);
        if (enumC1277210jLD == EnumC1277210jLD.MULTI_VIEW) {
            LJLLLLLL();
            for (int i = 0; i < ((ArrayList) this.LJJIJIIJI).size(); i++) {
                LJLJLJ((String) ListProtector.get(this.LJJIJIIJI, i));
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIJL(List<C1276780jKW> list) {
        LJLJI(list, "compositeLayouts");
        C1273190jEj c1273190jEj = this.LJIIL;
        if (c1273190jEj != null && list != null) {
            ArrayList arrayList = new ArrayList(list);
            Handler handler = c1273190jEj.LLILLL.LIZIZ;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS89S0200000_20(arrayList, c1273190jEj, 201));
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJLIIIJLJLI(EnumC1276480jK2 enumC1276480jK2) {
        LJLJI(enumC1276480jK2, "priority");
        return this.LIZ.setDownLinkAudioSelectionPriority(EnumC1007150cJd.STREAM_INDEX_MAIN.value(), enumC1276480jK2.value());
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIJ(String str) {
        C1273190jEj c1273190jEj;
        LJLJI(str, "streamId");
        if (str != null && str.endsWith("_game") && (c1273190jEj = this.LJIIL) != null) {
            c1273190jEj.LJIILIIL(this.LJI.LLIIIZ());
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJLJ(String str) {
        LJLJI(str, "streamId");
        return this.LIZ.subscribeAuxStream(str);
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJZ(InterfaceC1274710jHB interfaceC1274710jHB) {
        LJLJI(interfaceC1274710jHB, "listener");
        this.LJJIII = interfaceC1274710jHB;
    }

    public final void LJL(String str) {
        C1275100jHo c1275100jHoRemove;
        if (!TextUtils.isEmpty(str) && (c1275100jHoRemove = this.LJJIIZI.remove(str)) != null) {
            c1275100jHoRemove.LIZ();
        }
        this.LJJIJ.remove(str);
        ((ConcurrentHashMap) this.LJIJI).remove(str);
        if (!TextUtils.isEmpty(str)) {
            synchronized (this.LJJIJIIJI) {
                try {
                    ((ArrayList) this.LJJIJIIJI).remove(str);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        LJLLJ(str);
    }

    public final String LJLJJI(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.LJJIJL) {
            try {
                C1275750jIr c1275750jIr = (C1275750jIr) ((LinkedHashMap) this.LJJIJL).get(str);
                if (c1275750jIr != null) {
                    return c1275750jIr.LIZ;
                }
                int iLastIndexOf = str.lastIndexOf(95);
                if (iLastIndexOf > 0) {
                    return str.substring(0, iLastIndexOf);
                }
                return str;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final RemoteStreamStats LJLJJLL(LyraxStreamKey lyraxStreamKey) {
        String strLIZIZ;
        boolean z;
        LJLJI(lyraxStreamKey, "streamKey");
        LJLJI(lyraxStreamKey, "streamKey");
        String str = "";
        if (lyraxStreamKey == null) {
            strLIZIZ = "";
        } else if (!TextUtils.isEmpty(lyraxStreamKey.streamID)) {
            strLIZIZ = lyraxStreamKey.streamID;
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(lyraxStreamKey.roomID);
            sbLIZ.append("_");
            sbLIZ.append(lyraxStreamKey.userID);
            sbLIZ.append("_");
            sbLIZ.append(lyraxStreamKey.streamIndex.value());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        RemoteStreamStats remoteStreamStats = (RemoteStreamStats) ((ConcurrentHashMap) this.LJJIIZ).get(strLIZIZ);
        if (remoteStreamStats != null) {
            return remoteStreamStats;
        }
        RemoteStreamStats remoteStreamStats2 = new RemoteStreamStats();
        if (lyraxStreamKey != null) {
            str = lyraxStreamKey.userID;
        }
        remoteStreamStats2.uid = str;
        remoteStreamStats2.audioStats = new RemoteAudioStats();
        remoteStreamStats2.videoStats = new RemoteVideoStats();
        if (lyraxStreamKey != null && lyraxStreamKey.streamIndex == LyraxStreamIndex.k2nd) {
            z = true;
        } else {
            z = false;
        }
        remoteStreamStats2.isScreen = z;
        RemoteStreamStats remoteStreamStats3 = (RemoteStreamStats) ((ConcurrentHashMap) this.LJJIIZ).putIfAbsent(strLIZIZ, remoteStreamStats2);
        if (remoteStreamStats3 != null) {
            return remoteStreamStats3;
        }
        return remoteStreamStats2;
    }

    public final SurfaceView LJLJLJ(String str) {
        SurfaceView surfaceViewPutIfAbsent;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        SurfaceView surfaceView = this.LJIILL.get(str);
        if (surfaceView == null && (surfaceViewPutIfAbsent = this.LJIILL.putIfAbsent(str, (surfaceView = new SurfaceView(this.LJ.LJLJI.LJIIZILJ)))) != null) {
            return surfaceViewPutIfAbsent;
        }
        return surfaceView;
    }

    public final void LJLJLLL(JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("rtc_video_param_mode");
        if (iOptInt != 0) {
            if (iOptInt != 1) {
                if (iOptInt == 3) {
                    LJLL(jSONObject.optJSONObject("rtc_video_param_1v1_client"));
                    LJLL(jSONObject.optJSONObject("rtc_video_param_1v1_server"));
                    C1275030jHh c1275030jHh = this.LIZIZ;
                    if (c1275030jHh != null) {
                        EnumC1275210jHz enumC1275210jHz = c1275030jHh.LJJIFFI;
                        EnumC1275210jHz enumC1275210jHz2 = EnumC1275210jHz.CLIENT_MIX;
                    }
                }
            } else {
                LJLL(jSONObject.optJSONObject("rtc_video_param_server_define"));
            }
        }
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("rtc_performance_profiles");
        if (jSONObjectOptJSONObject != null) {
            LJLL(jSONObjectOptJSONObject.optJSONObject("rtc_performance_low"));
        }
    }

    public final int LJLLI(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        synchronized (this.LJIIJJI) {
            try {
                Integer num = (Integer) ((HashMap) this.LJIIJJI).get(str);
                if (num != null) {
                    return num.intValue();
                }
                int iIncrementAndGet = LJJIZ.incrementAndGet();
                ((HashMap) this.LJIIJJI).put(str, Integer.valueOf(iIncrementAndGet));
                return iIncrementAndGet;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJLLJ(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.LJJIJL) {
            try {
                this.LJJIJL.remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJZI(EnumC1275210jHz enumC1275210jHz) {
        LJLJI(enumC1275210jHz, "serverMode");
        this.LIZIZ.LJJIFFI = EnumC1275210jHz.SERVER_MIX;
    }

    public final void LLD(EnumC1277210jLD enumC1277210jLD) {
        boolean z;
        Handler handler;
        if (enumC1277210jLD == EnumC1277210jLD.SINGLE_VIEW) {
            z = true;
        } else {
            z = false;
        }
        this.LJIILJJIL = z;
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null) {
            abstractC1273900jFs.LJLJLLL(z);
        }
        C1273190jEj c1273190jEj = this.LJIIL;
        if (c1273190jEj != null && (handler = c1273190jEj.LLILLL.LIZIZ) != null) {
            C786410Ut5.LJJZZIII(handler, new ARunnableS39S0110000_20(c1273190jEj, z, 24));
        }
        InteractImpl interactImpl = this.LIZ;
        if (interactImpl != null) {
            interactImpl.updateSingleViewModeFlag(z);
            for (int i = 0; i < ((ArrayList) this.LJJIJIIJI).size(); i++) {
                LJJIIZ((String) ListProtector.get(this.LJJIJIIJI, i));
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void b0(boolean z) {
        int i;
        LJLJI(Boolean.valueOf(z), "enable");
        int value = EnumC1275390jIH.ASR_TASK_MODE_AI_EXPLANATION.getValue();
        int value2 = this.LJJ.getValue();
        if (z) {
            i = value2 | value;
        } else {
            i = value2 & (~value);
        }
        EnumC1275390jIH enumC1275390jIHFromValue = EnumC1275390jIH.fromValue(i);
        this.LJJ = enumC1275390jIHFromValue;
        this.LIZLLL.LJIILIIL(false, null, false, null, null, enumC1275390jIHFromValue);
    }

    @Override // X.InterfaceC1276380jJs
    public final void enableDownlinkAudioSelection(int i) {
        LJLJI(Integer.valueOf(i), "number");
        this.LIZ.enableDownlinkAudioSelection(i);
    }

    @Override // X.InterfaceC1276380jJs
    public final void muteAllRemoteAudioStreams(boolean z) {
        LJLJI(Boolean.valueOf(z), "mute");
        this.LIZ.muteAllRemoteAudioStreams(z);
    }

    @Override // X.InterfaceC1276380jJs
    public final void muteAllRemoteVideoStreams(boolean z) {
        LJLJI(Boolean.valueOf(z), "mute");
        this.LIZ.muteAllRemoteVideoStreams(z);
    }

    @Override // X.InterfaceC1276380jJs
    public final long sendRoomMessage(String str) {
        LJLJI(str, "message");
        return this.LIZ.sendRoomMessage(str);
    }

    @Override // X.InterfaceC1276380jJs
    public final void setBizSessionId(String str) {
        LJLJI(str, "sessionId");
        this.LIZ.setBizSessionId(str);
    }

    @Override // X.InterfaceC1276380jJs
    public final void setBusinessId(String str) {
        LJLJI(str, "businessId");
        this.LIZ.setBusinessId(str);
    }

    @Override // X.InterfaceC1276380jJs
    public final void setGroupChannelId(String str) {
        LJLJI(str, "groupChannelId");
        this.LIZ.setGroupChannelId(str);
    }

    @Override // X.InterfaceC1276380jJs
    public final void setLinkMicType(LinkMicType linkMicType) {
        LJLJI(linkMicType, "linkMicType");
        if (linkMicType == null) {
            return;
        }
        this.LIZ.setLinkMicType(linkMicType.value);
    }

    @Override // X.InterfaceC1276380jJs
    public final void setRemoteRoomAudioPlaybackVolume(int i) {
        LJLJI(Integer.valueOf(i), "volume");
        this.LIZ.setRemoteRoomAudioPlaybackVolume(i);
    }

    @Override // X.InterfaceC1276380jJs
    public final int startAuxStream(String str) {
        LJLJI(str, "streamId");
        return this.LIZ.startAuxStream(str);
    }

    @Override // X.InterfaceC1276380jJs
    public final int startForwardStreamToRooms(List<C1275450jIN> list) {
        LJLJI(list, "infos");
        return this.LIZ.startForwardStreamToRooms(LJLIIL(list));
    }

    @Override // X.InterfaceC1276380jJs
    public final void stop(Cert cert) {
        LJLJI(cert, "privacyCert");
        stop();
    }

    @Override // X.InterfaceC1276380jJs
    public final int stopAuxStream(String str) {
        LJLJI(str, "streamId");
        return this.LIZ.stopAuxStream(str);
    }

    @Override // X.InterfaceC1276380jJs
    public final int updateForwardStreamToRooms(List<C1275450jIN> list) {
        LJLJI(list, "infos");
        return this.LIZ.updateForwardStreamToRooms(LJLIIL(list));
    }

    @Override // X.InterfaceC1276380jJs
    public final void updateRtcExtInfo(String str) {
        LJLJI(str, "config");
        this.LIZ.updateRtcExtInfo(str);
    }

    public static void LJIL(JSONObject jSONObject, AbstractC1273900jFs abstractC1273900jFs) {
        InterfaceC1268690j7T interfaceC1268690j7TLJIJJLI;
        JSONObject jSONObjectLJJLIIIJ;
        if (!abstractC1273900jFs.LLJ() && (interfaceC1268690j7TLJIJJLI = abstractC1273900jFs.LJIJJLI()) != null && (jSONObjectLJJLIIIJ = interfaceC1268690j7TLJIJJLI.LJJLIIIJ()) != null && !jSONObjectLJJLIIIJ.isNull("mipmap")) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                synchronized (jSONObjectLJJLIIIJ) {
                    try {
                        jSONObject2.put("mipmap", jSONObjectLJJLIIIJ.get("mipmap"));
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
                jSONObject.put("camera_status", jSONObject2);
            } catch (Throwable th) {
            }
        }
    }

    public static void LJJI(JSONObject jSONObject, AbstractC1273900jFs abstractC1273900jFs) {
        JSONObject jSONObjectLLIIZ;
        if (abstractC1273900jFs.LLJILJILJ() && (jSONObjectLLIIZ = abstractC1273900jFs.LLIIZ()) != null) {
            LJLLL(jSONObject, "video_buffer_pool_status", jSONObjectLLIIZ);
        }
        InterfaceC1268640j7O interfaceC1268640j7OLJIIL = abstractC1273900jFs.LJIIL();
        if (interfaceC1268640j7OLJIIL == null) {
            return;
        }
        LJLLL(jSONObject, "buffer_block_cnt", Integer.valueOf(interfaceC1268640j7OLJIIL.LJLJL()));
        LJLLL(jSONObject, "super_resolution_effect", Integer.valueOf(interfaceC1268640j7OLJIIL.LLIIIL()));
        LJLLL(jSONObject, "can_enable_effect_downsampling", Boolean.valueOf(interfaceC1268640j7OLJIIL.LJLJJLL()));
        LJLLL(jSONObject, "effect_downsampling_scale", Float.valueOf(interfaceC1268640j7OLJIIL.LLIIZ()));
        LJLLL(jSONObject, "hardware_roi_enable", Boolean.valueOf(interfaceC1268640j7OLJIIL.LLIIIJ()));
        LJLLL(jSONObject, "hardware_roi_switch_reason", Integer.valueOf(interfaceC1268640j7OLJIIL.LJJLJLI()));
        if (abstractC1273900jFs.LLIZLLLIL()) {
            JSONObject jSONObjectLLILIL = abstractC1273900jFs.LLILIL();
            if (jSONObjectLLILIL != null) {
                LJLLL(jSONObject, "bmf_video_filter", jSONObjectLLILIL.optString("bmf_video_filter"));
                return;
            }
            return;
        }
        if (!abstractC1273900jFs.LLJILLL()) {
            boolean z = interfaceC1268640j7OLJIIL instanceof C1272090jCx;
            if (!z) {
                return;
            }
            JSONObject status = ((C1272090jCx) interfaceC1268640j7OLJIIL).getStatus();
            if (status != null) {
                LJLLL(jSONObject, "bmf_video_filter", status);
            }
            if (!z) {
                return;
            } else {
                return;
            }
        }
        abstractC1273900jFs.LLIFFJFJJ();
    }

    public static String LJJIJIIJIL(int i, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static void LJLJI(Object obj, String str) {
        if (obj == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("=[null]");
            C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        if (obj instanceof Object[]) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("=");
            sbLIZ2.append(Arrays.deepToString((Object[]) obj));
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        if (obj instanceof boolean[]) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append("=");
            sbLIZ3.append(Arrays.toString((boolean[]) obj));
            C2188811AlT.LIZIZ(sbLIZ3);
            return;
        }
        if (obj instanceof byte[]) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(str);
            sbLIZ4.append("=");
            sbLIZ4.append(Arrays.toString((byte[]) obj));
            C2188811AlT.LIZIZ(sbLIZ4);
            return;
        }
        if (obj instanceof char[]) {
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append(str);
            sbLIZ5.append("=");
            sbLIZ5.append(Arrays.toString((char[]) obj));
            C2188811AlT.LIZIZ(sbLIZ5);
            return;
        }
        if (obj instanceof double[]) {
            StringBuilder sbLIZ6 = C2188811AlT.LIZ();
            sbLIZ6.append(str);
            sbLIZ6.append("=");
            sbLIZ6.append(Arrays.toString((double[]) obj));
            C2188811AlT.LIZIZ(sbLIZ6);
            return;
        }
        if (obj instanceof float[]) {
            StringBuilder sbLIZ7 = C2188811AlT.LIZ();
            sbLIZ7.append(str);
            sbLIZ7.append("=");
            sbLIZ7.append(Arrays.toString((float[]) obj));
            C2188811AlT.LIZIZ(sbLIZ7);
            return;
        }
        if (obj instanceof int[]) {
            StringBuilder sbLIZ8 = C2188811AlT.LIZ();
            sbLIZ8.append(str);
            sbLIZ8.append("=");
            sbLIZ8.append(Arrays.toString((int[]) obj));
            C2188811AlT.LIZIZ(sbLIZ8);
            return;
        }
        if (obj instanceof long[]) {
            StringBuilder sbLIZ9 = C2188811AlT.LIZ();
            sbLIZ9.append(str);
            sbLIZ9.append("=");
            sbLIZ9.append(Arrays.toString((long[]) obj));
            C2188811AlT.LIZIZ(sbLIZ9);
            return;
        }
        if (obj instanceof short[]) {
            StringBuilder sbLIZ10 = C2188811AlT.LIZ();
            sbLIZ10.append(str);
            sbLIZ10.append("=");
            sbLIZ10.append(Arrays.toString((short[]) obj));
            C2188811AlT.LIZIZ(sbLIZ10);
            return;
        }
        StringBuilder sbLIZ11 = C2188811AlT.LIZ();
        sbLIZ11.append(str);
        sbLIZ11.append("=[");
        sbLIZ11.append(obj);
        sbLIZ11.append(e3.f);
        C2188811AlT.LIZIZ(sbLIZ11);
    }

    public static float LJLJL(AbstractC1273900jFs abstractC1273900jFs, String str) {
        try {
            Bundle bundleLLJJJJJIL = abstractC1273900jFs.LLJJJJJIL(str);
            if (bundleLLJJJJJIL == null) {
                return 0.0f;
            }
            return bundleLLJJJJJIL.getFloat(str, 0.0f);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return 0.0f;
        }
    }

    public static String LJZ(int i, String str) {
        LJLJI(str, "interactId");
        LJLJI(Integer.valueOf(i), "streamIndex");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append("_");
        sbLIZ.append(i);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1272020jCq
    public final void LJIIJ(VideoFrame videoFrame, LyraxErrorCode lyraxErrorCode) {
        int i = this.LJJIFFI + 1;
        this.LJJIFFI = i;
        if (i < 100) {
            return;
        }
        this.LJJIFFI = 0;
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJIILJJIL(String str, C1276750jKT c1276750jKT) {
        LJLJI(str, "waterMarkId");
        LJLJI(c1276750jKT, "region");
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        ((ConcurrentHashMap) this.LJIL).put(str, c1276750jKT);
        return 0;
    }

    public final void LJIJ(JSONObject jSONObject, AbstractC1273900jFs abstractC1273900jFs) {
        LiveSdkSetting liveSdkSetting;
        C1269160j8E c1269160j8E = this.LJ;
        if (c1269160j8E != null && (liveSdkSetting = c1269160j8E.LIZ) != null && liveSdkSetting.LJIIJJI) {
            LJLLL(jSONObject, "battery_value", Integer.valueOf(abstractC1273900jFs.LJZ()));
            LJLLL(jSONObject, "is_charging", Boolean.valueOf(abstractC1273900jFs.LLILZ()));
            LJLLL(jSONObject, "device_motion_status", Integer.valueOf(abstractC1273900jFs.LL()));
            LJLLL(jSONObject, "is_ecom_for_anchor", Boolean.valueOf(abstractC1273900jFs.LLILZIL()));
        }
    }

    @Override // X.InterfaceC1272020jCq
    public final void LJIJI(int i, int i2) {
        this.LJJIL.onPushExternalVideoFrameSizeChanged(i, i2);
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJIJJ(String str, C01IM c01im) {
        LJLJI(str, "streamId");
        LJLJI(c01im, "sourceConfig");
        if (c01im.LIZIZ == null) {
            return this.LIZ.updateAuxStreamSourceConfig(str, null);
        }
        int[] iArr = this.LJJIJ.get(str);
        if (iArr == null || iArr[0] <= 0 || iArr[1] <= 0) {
            iArr = new int[]{256, 256};
        }
        int iUpdateAuxStreamSourceConfig = this.LIZ.updateAuxStreamSourceConfig(str, new C1273600jFO(c01im, iArr[0], iArr[1]));
        C1275100jHo c1275100jHo = this.LJJIIZI.get(str);
        if (c1275100jHo != null) {
            Bitmap bitmap = c01im.LIZIZ;
            c1275100jHo.LIZIZ = bitmap;
            if (bitmap != null && !bitmap.isRecycled()) {
                int width = c1275100jHo.LIZIZ.getWidth();
                int height = c1275100jHo.LIZIZ.getHeight();
                int[] iArr2 = new int[1];
                C1283100jUi.LIZIZ(c1275100jHo.LJFF, new ARunnableS89S0200000_20(c1275100jHo, iArr2, 179));
                c1275100jHo.LIZJ = iArr2[0];
                k kVar = c1275100jHo.LIZLLL;
                if (kVar != null) {
                    kVar.release();
                }
                k kVar2 = new k(width, height, EnumC1273550jFJ.RGB, c1275100jHo.LIZJ, (Matrix) null, (SurfaceTextureHelper) null, (Runnable) null);
                c1275100jHo.LIZLLL = kVar2;
                kVar2.setTransformMatrix(c1275100jHo.LJ);
            }
        }
        return iUpdateAuxStreamSourceConfig;
    }

    public final void LJJIFFI(JSONObject jSONObject, AbstractC1273900jFs abstractC1273900jFs) {
        if (!this.LIZIZ.LJJIJIIJI) {
            return;
        }
        LJLLL(jSONObject, "enableAdaptiveLinkMicLayoutParamsFeature", Boolean.valueOf(abstractC1273900jFs.LLIZ()));
        LJLLL(jSONObject, "enable_event_driven_phase1", Boolean.valueOf(abstractC1273900jFs.LLJI()));
        LJLLL(jSONObject, "enable_video_pipeline_opt", Boolean.valueOf(abstractC1273900jFs.LLJJ()));
        LJLLL(jSONObject, "enable_pre_effect_process_node", Boolean.valueOf(abstractC1273900jFs.LLJILLL()));
        LJLLL(jSONObject, "is_single_view", Boolean.valueOf(abstractC1273900jFs.LJJII()));
        if (abstractC1273900jFs.LLJ()) {
            LJLLL(jSONObject, "videoParamsCenterParams", abstractC1273900jFs.LLILL());
        }
    }

    public final void LJJII(JSONObject jSONObject, AbstractC1273900jFs abstractC1273900jFs) {
        if (this.LJJIJLIJ != null && abstractC1273900jFs.LLILZLL()) {
            try {
                String strOptString = jSONObject.optString("sim_enc_info");
                if (TextUtils.isEmpty(strOptString)) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                for (String str : strOptString.split("\\+")) {
                    String[] strArrSplit = str.trim().split("x");
                    if (strArrSplit.length >= 3) {
                        arrayList.add(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[0])));
                        arrayList2.add(Integer.valueOf(CastIntegerProtector.parseInt(strArrSplit[1])));
                        int i = CastIntegerProtector.parseInt(strArrSplit[2]);
                        arrayList3.add(Integer.valueOf(i));
                        arrayList4.add(Integer.valueOf(i));
                    }
                }
                JSONObject jSONObjectLIZJ = this.LJJIJLIJ.LIZJ(jSONObject.optInt("width"), jSONObject.optInt("height"), arrayList, arrayList2, arrayList3, arrayList4);
                if (jSONObjectLIZJ.length() > 0) {
                    C190800oM.LIZIZ(jSONObject, jSONObjectLIZJ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJIII(String str, List list) {
        LJLJI(str, "sei");
        LJLJI(list, "regions");
        LLF(str, true, false, true, list);
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJIJIL(String str, SurfaceView surfaceView) {
        Handler handlerLJJLIIIJJI;
        LJLJI(str, "streamId");
        LJLJI(surfaceView, "view");
        int auxStreamRenderView = this.LIZ.setAuxStreamRenderView(str, surfaceView);
        C1275100jHo c1275100jHoRemove = this.LJJIIZI.remove(str);
        if (c1275100jHoRemove != null) {
            c1275100jHoRemove.LIZ();
        }
        C1275100jHo c1275100jHo = new C1275100jHo();
        C1268800j7e c1268800j7e = new C1268800j7e();
        c1268800j7e.LIZJ = true;
        C1272880jEE c1272880jEE = new C1272880jEE(surfaceView, c1268800j7e);
        c1275100jHo.LIZ = c1272880jEE;
        c1272880jEE.LLLIILIL = true;
        C1269180j8G c1269180j8G = c1272880jEE.LLJJJ;
        if (c1269180j8G != null && c1269180j8G.LJIIJ) {
            if (c1272880jEE.LLLLLLZZ != null && (handlerLJJLIIIJJI = c1272880jEE.LJJLIIIJJI()) != null) {
                C786410Ut5.LJJZZIII(handlerLJJLIIIJJI, new ARunnableS120S0100000_20(c1272880jEE, 357));
            }
        } else {
            ANativeWindowRenderDrawer aNativeWindowRenderDrawer = c1272880jEE.LLLLLLZZ;
            if (aNativeWindowRenderDrawer != null) {
                aNativeWindowRenderDrawer.setRoundCornerToWidthRadius(c1272880jEE.LLLIL);
            }
        }
        Float f = (Float) ((ConcurrentHashMap) this.LJIJI).get(str);
        if (f != null && f.floatValue() > 0.0f) {
            c1275100jHo.LIZ.setCornerRadius(f.floatValue());
        }
        this.LJJIIZI.put(str, c1275100jHo);
        return auxStreamRenderView;
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJIL(String str, C01IL c01il) {
        LJLJI(str, "streamId");
        LJLJI(c01il, "encodeConfig");
        InteractImpl interactImpl = this.LIZ;
        int i = c01il.LIZ;
        int i2 = c01il.LIZIZ;
        int i3 = c01il.LIZJ;
        int i4 = c01il.LIZLLL;
        int iUpdateAuxStreamEncodeConfig = interactImpl.updateAuxStreamEncodeConfig(str, i, i2, i3, i4, i4 / 4, i4);
        if (iUpdateAuxStreamEncodeConfig >= 0) {
            LL(str, c01il);
        }
        return iUpdateAuxStreamEncodeConfig;
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJJ(String str, JSONObject jSONObject) {
        ChannelBaseApplyResult channelBaseApplyResultUpdateChannelBaseConfiguration;
        int i;
        C1268130j6Z c1268130j6Z;
        boolean z;
        LJLJI(str, "channelId");
        LJLJI(jSONObject, "channelBaseConfig");
        if (jSONObject != null && (channelBaseApplyResultUpdateChannelBaseConfiguration = this.LIZ.updateChannelBaseConfiguration(str, C786410Ut5.J3(jSONObject))) != null && (i = channelBaseApplyResultUpdateChannelBaseConfiguration.enableSimulcast) >= 0 && (c1268130j6Z = this.LJJIJLIJ) != null && c1268130j6Z.LJJIJLIJ) {
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            c1268130j6Z.LIZIZ(z);
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJJI(Object obj, String str) {
        ByteBuffer byteBufferSlice;
        LJLJI(str, "key");
        LJLJI(obj, "value");
        if (obj != null && obj.toString() != null && !obj.toString().isEmpty()) {
            if (!(obj instanceof ByteBuffer)) {
                if (obj instanceof JSONObject) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(str, obj);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                    obj = C786410Ut5.J3(jSONObject);
                } else {
                    obj = obj.toString();
                }
            }
            if (obj instanceof ByteBuffer) {
                byteBufferSlice = (ByteBuffer) obj;
            } else if (obj instanceof String) {
                String str2 = (String) obj;
                int length = str2.length();
                ByteBuffer byteBuffer = this.LJIJJ;
                if (byteBuffer == null || byteBuffer.capacity() < length + 64) {
                    this.LJIJJ = ByteBuffer.allocateDirect(length + 64);
                }
                int i = 3;
                while (true) {
                    int i2 = i - 1;
                    if (i > 0) {
                        int iNativeBuildBufferFromString = EffectWrapper.nativeBuildBufferFromString(0, str2, this.LJIJJ);
                        if (iNativeBuildBufferFromString != 0) {
                            if (iNativeBuildBufferFromString > 0) {
                                this.LJIJJ.position(0);
                                this.LJIJJ.limit(iNativeBuildBufferFromString);
                                byteBufferSlice = this.LJIJJ.slice();
                            } else {
                                return;
                            }
                        } else {
                            this.LJIJJ = ByteBuffer.allocateDirect(this.LJIJJ.capacity() * 2);
                            i = i2;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
            if (byteBufferSlice != null && byteBufferSlice.hasRemaining()) {
                byte[] bArr = new byte[byteBufferSlice.remaining()];
                byteBufferSlice.get(bArr);
                if (bArr.length > 0) {
                    this.LIZ.publishBlackFrameIfNeeded();
                    this.LIZ.sendSEIV1(bArr, 0, false);
                }
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJJIZL(EnumC1277210jLD enumC1277210jLD, C1273200jEk c1273200jEk) {
        C1273190jEj c1273190jEj;
        boolean z;
        LJLJI(enumC1277210jLD, "viewMode");
        LJLJI(c1273200jEk, "params");
        if (enumC1277210jLD != null && (c1273190jEj = this.LJIIL) != null) {
            if (enumC1277210jLD == EnumC1277210jLD.SINGLE_VIEW) {
                z = true;
            } else {
                z = false;
            }
            Handler handler = c1273190jEj.LLILLL.LIZIZ;
            if (handler != null) {
                C786410Ut5.LJJZZIII(handler, new ARunnableS21S0210000_20(c1273200jEk, c1273190jEj, z, 9));
            }
            LLD(enumC1277210jLD);
            if (enumC1277210jLD == EnumC1277210jLD.MULTI_VIEW) {
                LJLLLLLL();
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJJJL(JSONObject jSONObject, EnumC1275330jIB enumC1275330jIB) {
        LJLJI(jSONObject, "authInfo");
        LJLJI(enumC1275330jIB, "frameType");
        if (jSONObject != null && enumC1275330jIB != null && enumC1275330jIB.ordinal() != 0) {
            try {
                JSONObject jSONObject2 = new JSONObject(C786410Ut5.J3(jSONObject));
                try {
                    jSONObject2.put("dynamicLabel", "TTLive");
                    jSONObject2.put("frameType", enumC1275330jIB.ordinal());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                C1276560jKA c1276560jKA = this.LIZLLL;
                c1276560jKA.LIZJ = jSONObject2;
                if (c1276560jKA.LJ) {
                    LLFF(false, false);
                }
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
                throw new RuntimeException(e2);
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJJJZI(String str, boolean z) {
        LJLJI(str, "streamId");
        LJLJI(Boolean.valueOf(z), "mute");
        return this.LIZ.muteAuxStreamAudio(str, z);
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLIIIIJ(float f, String str) {
        C1269340j8W c1269340j8WLLD;
        LiveSdkSetting liveSdkSetting;
        C1272880jEE c1272880jEE;
        LJLJI(str, "streamId");
        LJLJI(Float.valueOf(f), "cornerRadius");
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null && (liveSdkSetting = c1269340j8WLLD.LIZ) != null) {
            boolean zLJIILLIIL = liveSdkSetting.LJIILLIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setAuxStreamCornerRadius streamId:");
            sbLIZ.append(str);
            sbLIZ.append(" radius:");
            sbLIZ.append(f);
            sbLIZ.append(" enableRoundedCorner:");
            sbLIZ.append(zLJIILLIIL);
            AVLog.logKibana(4, "ClientImplNative", C2188811AlT.LIZIZ(sbLIZ), null);
            if (zLJIILLIIL && str != null) {
                ((ConcurrentHashMap) this.LJIJI).put(str, Float.valueOf(f));
                C1275100jHo c1275100jHo = this.LJJIIZI.get(str);
                if (c1275100jHo != null && (c1272880jEE = c1275100jHo.LIZ) != null) {
                    c1272880jEE.setCornerRadius(f);
                }
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLJLI(float f, String str) {
        C1269340j8W c1269340j8WLLD;
        LiveSdkSetting liveSdkSetting;
        InterfaceC1275190jHx interfaceC1275190jHx;
        LJLJI(str, "linkMicId");
        LJLJI(Float.valueOf(f), "cornerRadius");
        AbstractC1273900jFs abstractC1273900jFs = this.LJI;
        if (abstractC1273900jFs != null && (c1269340j8WLLD = abstractC1273900jFs.LLD()) != null && (liveSdkSetting = c1269340j8WLLD.LIZ) != null) {
            boolean zLJIILLIIL = liveSdkSetting.LJIILLIIL();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setConorRadius linkMicId:");
            sbLIZ.append(str);
            sbLIZ.append(" radius:");
            sbLIZ.append(f);
            sbLIZ.append(" enableRoundedCorner:");
            sbLIZ.append(zLJIILLIIL);
            AVLog.logKibana(4, "ClientImplNative", C2188811AlT.LIZIZ(sbLIZ), null);
            if (zLJIILLIIL && str != null) {
                if (TextUtils.equals(this.LIZJ.LJFF, str)) {
                    abstractC1273900jFs.LLLIIII(f);
                    return;
                }
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                LyraxVideoRendererWrapper lyraxVideoRendererWrapper = (LyraxVideoRendererWrapper) ((ConcurrentHashMap) this.LJIILLIIL).get(LJJIJIIJIL(LyraxStreamIndex.kMain.value(), str));
                if (lyraxVideoRendererWrapper == null && (lyraxVideoRendererWrapper = (LyraxVideoRendererWrapper) ((ConcurrentHashMap) this.LJIILLIIL).get(str)) == null) {
                    return;
                }
                lyraxVideoRendererWrapper.LJIIIZ = f;
                synchronized (lyraxVideoRendererWrapper) {
                    interfaceC1275190jHx = lyraxVideoRendererWrapper.LJIJ;
                }
                if (interfaceC1275190jHx == null) {
                    return;
                }
                interfaceC1275190jHx.setCornerRadius(f);
            }
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJLL(long j, String str) {
        C1273190jEj c1273190jEj;
        LJLJI(str, "streamId");
        LJLJI(Long.valueOf(j), "offset");
        if (str != null && str.endsWith("_game") && (c1273190jEj = this.LJIIL) != null) {
            c1273190jEj.LJIILIIL(this.LJI.LLF());
        }
    }

    @Override // X.InterfaceC1276380jJs
    public final void LJJZZI(float f, boolean z) {
        LJLJI(Boolean.valueOf(z), "enable");
        LJLJI(Float.valueOf(f), "highBitrateRatio");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0043 A[PHI: r9
      0x0043: PHI (r9v2 boolean) = (r9v1 boolean), (r9v4 boolean) binds: [B:29:0x0040, B:24:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC1275190jHx LJLIL(java.lang.String r13, boolean r14) {
        /*
            r12 = this;
            r4 = 0
            r7 = r13
            if (r7 != 0) goto L5
            return r4
        L5:
            X.0j8E r0 = r12.LJ
            if (r0 == 0) goto L18
            com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting r0 = r0.LIZ
            com.ss.ttlivestreamer.livestreamv2.sdkparams.VPassInteractCfg r1 = r0.mVPassInteractCfg
        Ld:
            android.os.Handler r5 = com.ss.ttlivestreamer.core.opengl.GLThreadManager.getMainGlHandle()
            if (r14 == 0) goto L47
            X.0jEj r6 = r12.LJIIL
            if (r6 != 0) goto L1a
            return r4
        L18:
            r1 = r4
            goto Ld
        L1a:
            X.0jGw r4 = new X.0jGw
            X.0jFs r0 = r12.LJI
            if (r0 == 0) goto L45
            boolean r0 = r0.LLJ()
            if (r0 == 0) goto L45
            r8 = 1
        L27:
            if (r1 == 0) goto L3f
            boolean r0 = com.ss.ttlivestreamer.core.opengl.GlUtil.isGLES3Support()
            if (r0 == 0) goto L3f
            r9 = 1
        L30:
            boolean r0 = r1.LJFF()
            if (r0 == 0) goto L43
            r10 = 1
        L37:
            X.0j8S r11 = r12.LJLJJL()
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        L3f:
            r9 = 0
            if (r1 == 0) goto L43
            goto L30
        L43:
            r10 = 0
            goto L37
        L45:
            r8 = 0
            goto L27
        L47:
            X.0jGx r2 = new X.0jGx
            X.0jFs r3 = r12.LJI
            if (r1 == 0) goto L4e
            r4 = r5
        L4e:
            r6 = 1
            r8 = 640(0x280, float:8.97E-43)
            r9 = 360(0x168, float:5.04E-43)
            if (r1 == 0) goto L61
            boolean r0 = com.ss.ttlivestreamer.core.opengl.GlUtil.isGLES3Support()
            if (r0 == 0) goto L61
            r10 = 1
        L5c:
            r7 = r6
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            return r2
        L61:
            r10 = 0
            goto L5c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274840jHO.LJLIL(java.lang.String, boolean):X.0jHx");
    }

    public final void LJLLILLLL(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.LJJIJIIJIL) {
            try {
                Iterator it2 = ((ArrayList) this.LJJIJIIJIL).iterator();
                while (it2.hasNext()) {
                    if (str.equals((String) it2.next())) {
                        it2.remove();
                    }
                }
                if (z && !str.equals(this.LIZJ.LJFF)) {
                    ((ArrayList) this.LJJIJIIJIL).add(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        LLFF(true, false);
    }

    public final boolean LJLZ(String str, String str2) {
        Boolean bool;
        Boolean bool2;
        if (!TextUtils.isEmpty(str2) && (bool2 = (Boolean) ((ConcurrentHashMap) this.LJIJ).get(str2)) != null) {
            return bool2.booleanValue();
        }
        if (!TextUtils.isEmpty(str) && (bool = (Boolean) ((ConcurrentHashMap) this.LJIJ).get(str)) != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final void LL(String str, C01IL c01il) {
        if (!TextUtils.isEmpty(str) && c01il != null) {
            int i = c01il.LIZ;
            int i2 = c01il.LIZIZ;
            if (i > 0 && i2 > 0) {
                this.LJJIJ.put(str, new int[]{i, i2});
            }
        }
    }

    public final boolean LLFF(boolean z, boolean z2) {
        LJLJI(Boolean.valueOf(z), "updateLayout");
        LJLJI(Boolean.FALSE, "updateImage");
        return LLF(null, z, false, false, null);
    }

    @Override // X.InterfaceC1276380jJs
    public final void muteRemoteAudioStream(String str, boolean z) {
        LJLJI(str, "interactId");
        LJLJI(Boolean.valueOf(z), "mute");
        this.LIZ.muteRemoteAudioStream(str, z);
    }

    @Override // X.InterfaceC1276380jJs
    public final long sendUserMessage(String str, String str2) {
        LJLJI(str, "interactId");
        LJLJI(str2, "message");
        return this.LIZ.sendUserMessage(str, str2);
    }

    @Override // X.InterfaceC1276380jJs
    public final void setRemoteAudioPlaybackVolume(String str, int i) {
        LJLJI(str, "interactId");
        LJLJI(Integer.valueOf(i), "volume");
        this.LIZ.setRemoteAudioPlaybackVolume(str, i);
    }

    public static void LJLLL(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJLLLL(JSONObject jSONObject, String str, Object obj) {
        if (obj == null) {
            return;
        }
        if (jSONObject.has(str) && !jSONObject.isNull(str)) {
            String strOptString = jSONObject.optString(str, null);
            if (!(obj instanceof String) || !TextUtils.isEmpty(strOptString)) {
                return;
            }
        }
        LJLLL(jSONObject, str, obj);
    }

    @Override // X.InterfaceC1268200j6g
    public final void LJ(int i, int i2, int i3) {
        LJLJI(Integer.valueOf(i), "width");
        LJLJI(Integer.valueOf(i2), "height");
        LJLJI(Integer.valueOf(i3), "fps");
        this.LIZ.setVideoPerformanceConfig(StreamIndex.STREAM_INDEX_MAIN.value(), i, i2, i3);
    }

    @Override // X.InterfaceC1276380jJs
    public final int LJJJLL(String str, boolean z, boolean z2) {
        LJLJI(str, "streamId");
        LJLJI(Boolean.valueOf(z), "subAudio");
        LJLJI(Boolean.valueOf(z2), "subVideo");
        return this.LIZ.subscribeAuxStreamWithMediaType(str, z2, z);
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0332  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0335 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0278  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02ca  */
    /* JADX WARN: Type inference failed for: r0v13, types: [X.0jHF] */
    /* JADX WARN: Type inference failed for: r0v146, types: [X.0jHZ] */
    /* JADX WARN: Type inference failed for: r3v4, types: [X.0jKK] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1274840jHO(X.AbstractC1273900jFs r19, X.C1275030jHh r20, X.C1269340j8W r21, X.C1274850jHP r22) {
        /*
            Method dump skipped, instruction units count: 1052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274840jHO.<init>(X.0jFs, X.0jHh, X.0j8W, X.0jHP):void");
    }

    public final boolean LLF(String str, boolean z, boolean z2, boolean z3, List list) {
        HashMap map;
        List listLJIILL = list;
        LJLJI(Boolean.valueOf(z), "updateLayout");
        LJLJI(Boolean.FALSE, "updateImage");
        LJLJI(Boolean.valueOf(z3), "updateAlternate");
        LJLJI(str, "sei");
        LJLJI(listLJIILL, "regionsFromOut");
        if (listLJIILL == null) {
            listLJIILL = LJIILL();
        }
        if (this.LJIL != null) {
            map = new HashMap(this.LJIL);
        } else {
            map = null;
        }
        return this.LIZLLL.LJIILIIL(z, listLJIILL, z3, map, str, this.LJJ);
    }
}
