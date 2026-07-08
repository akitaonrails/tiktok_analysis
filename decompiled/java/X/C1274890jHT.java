package X;

import Y.ARunnableS113S0100000_13;
import Y.ARunnableS120S0100000_20;
import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import com.ss.avframework.livestreamv2.core.interact.livertc.RTCPhoneStateListener;
import com.ss.bytertc.engine.GLESVersion;
import com.ss.bytertc.engine.IAudioFrameObserver;
import com.ss.bytertc.engine.IAudioFrameProcessor;
import com.ss.bytertc.engine.InternalVideoSourceConfig;
import com.ss.bytertc.engine.NetworkTimeInfo;
import com.ss.bytertc.engine.PostProcessParameter;
import com.ss.bytertc.engine.RTCRoom;
import com.ss.bytertc.engine.RTCRoomConfig;
import com.ss.bytertc.engine.RTCRoomInterface;
import com.ss.bytertc.engine.RTCVideo;
import com.ss.bytertc.engine.RTCVideoInterface;
import com.ss.bytertc.engine.SubscribeVideoConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoCanvas;
import com.ss.bytertc.engine.VideoCodecDescription;
import com.ss.bytertc.engine.VideoDegradeConfig;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.VideoResolutionConfig;
import com.ss.bytertc.engine.data.AudioContentTypeConfig;
import com.ss.bytertc.engine.data.AudioEncodeConfig;
import com.ss.bytertc.engine.data.AudioFormat;
import com.ss.bytertc.engine.data.AudioFrameCallbackMethod;
import com.ss.bytertc.engine.data.AudioProcessorMethod;
import com.ss.bytertc.engine.data.AudioPropertiesConfig;
import com.ss.bytertc.engine.data.AudioRenderType;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.AudioSourceType;
import com.ss.bytertc.engine.data.ColorSpace;
import com.ss.bytertc.engine.data.ForwardStreamInfo;
import com.ss.bytertc.engine.data.MuteState;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.ReturnStatus;
import com.ss.bytertc.engine.data.RtcScene;
import com.ss.bytertc.engine.data.SEICountPerFrame;
import com.ss.bytertc.engine.data.StrategyGrade;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.StreamPriority;
import com.ss.bytertc.engine.data.VideoPixelFormat;
import com.ss.bytertc.engine.data.VideoRotation;
import com.ss.bytertc.engine.data.VideoSolutionMode;
import com.ss.bytertc.engine.data.VideoSourceType;
import com.ss.bytertc.engine.data.VideoSuperResolutionMode;
import com.ss.bytertc.engine.handler.IExternalVideoEncoderEventHandler;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.live.ChorusCacheSyncConfig;
import com.ss.bytertc.engine.live.IChorusCacheSyncObserver;
import com.ss.bytertc.engine.live.IMixedStreamObserver;
import com.ss.bytertc.engine.live.MixedStreamConfig;
import com.ss.bytertc.engine.loader.RTCNativeLibraryLoaderImpl;
import com.ss.bytertc.engine.mediaio.ILocalEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.IRemoteEncodedVideoFrameObserver;
import com.ss.bytertc.engine.mediaio.RTCEncodedVideoFrame;
import com.ss.bytertc.engine.type.AudioSceneType;
import com.ss.bytertc.engine.type.BackgroundMode;
import com.ss.bytertc.engine.type.DivideModel;
import com.ss.bytertc.engine.type.DownLinkAudioSelectionPriority;
import com.ss.bytertc.engine.type.LinkMicType;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.MediaTypeEnhancementConfig;
import com.ss.bytertc.engine.type.MessageConfig;
import com.ss.bytertc.engine.type.PauseResumeControlMediaType;
import com.ss.bytertc.engine.type.PublishFallbackOption;
import com.ss.bytertc.engine.type.RemoteUserPriority;
import com.ss.bytertc.engine.type.SubscribeFallbackOptions;
import com.ss.bytertc.engine.type.SubscribeMediaType;
import com.ss.bytertc.engine.utils.AudioFrame;
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.bytertc.engine.video.IVideoSink;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.bytertc.engine.video.VideoCaptureConfig;
import com.ss.bytertc.engine.video.VideoDecoderConfig;
import com.ss.bytertc.engine.video.VideoExternalData;
import com.ss.bytertc.engine.video.VideoFrame;
import com.ss.bytertc.engine.video.impl.LyraxVideoFrame;
import com.ss.lyrax.audio.ILyraxAudioPlayer;
import com.ss.lyrax.subscriber.LyraxVideoRenderConfig;
import com.ss.lyrax.video.ILyraxVideoRenderer;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoDegradeConfig;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.ttlivestreamer.core.opengl.GLThreadManager;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.core.utils.TimeUtils;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.LiveSdkSetting;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jHT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274890jHT implements InterfaceC1275910jJ7, RTCVideoInterface, RTCRoomInterface, InterfaceC1276010jJH {
    public static boolean LJJIII;
    public int LIZ;
    public VideoEncoderConfig LIZIZ;
    public VideoEncoderConfig LIZJ;
    public VideoEncoderConfig LIZLLL;
    public C1275140jHs LJ;
    public final ScheduledExecutorService LJFF;
    public BPEAThread LJI;
    public final C1275520jIU LJII;
    public MuteState LJIIIIZZ;
    public MuteState LJIIIZ;
    public final RTCPhoneStateListener LJIIJ;
    public C1279520jOw LJIIJJI;
    public final Context LJIIL;
    public C1275010jHf LJIILIIL;
    public final String LJIILJJIL;
    public final RTCVideoInterface LJIILL;
    public RTCRoom LJIILLIIL;
    public ByteBuffer LJIIZILJ;
    public C1274810jHL LJIJ;
    public final C1269160j8E LJIJI;
    public final AbstractC1273900jFs LJIJJ;
    public boolean LJIJJLI;
    public boolean LJIL;
    public double LJJ;
    public boolean LJJI;
    public float LJJIFFI;
    public final C1275120jHq LJJII;

    public final void LJIJJLI() {
        this.LIZ = 0;
        VideoEncoderConfig videoEncoderConfig = C1275720jIo.LIZ;
        this.LIZJ = videoEncoderConfig;
        this.LIZLLL = videoEncoderConfig;
        this.LIZIZ = videoEncoderConfig;
        this.LJ.LIZ();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final RTCRoom createRTCRoom(String str) {
        return null;
    }

    public static VideoEncoderConfig LIZIZ() {
        VideoEncoderConfig videoEncoderConfig = new VideoEncoderConfig();
        videoEncoderConfig.width = 1440;
        videoEncoderConfig.height = 2560;
        videoEncoderConfig.frameRate = 15;
        videoEncoderConfig.maxBitrate = 0;
        return videoEncoderConfig;
    }

    public final void LJ() {
        C1269160j8E c1269160j8E;
        InterfaceC1266360j3i interfaceC1266360j3i;
        EnumC1267980j6K enumC1267980j6K;
        VideoEncoderConfig.VideoDegradeLevels videoDegradeLevels;
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ;
        ArrayList arrayList = new ArrayList();
        C1275120jHq c1275120jHq = this.LJJII;
        if (c1275120jHq != null) {
            c1275120jHq.LIZ(EnumC1275230jI1.Pathway_ConfigVideoParam, new Object[0]);
        }
        int i = this.LIZ;
        ArrayList arrayList2 = null;
        if (i != 0 && i != 1 && i != 3) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("live vieo mode is error, live mode: ");
            sbLIZ.append(this.LIZ);
            LogUtil.e("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ));
            C1279520jOw c1279520jOw = this.LJIIJJI;
            if (c1279520jOw != null && (iRTCVideoEventHandlerLIZ = c1279520jOw.LIZ()) != null) {
                iRTCVideoEventHandlerLIZ.onError(8001);
            }
            arrayList.add(this.LIZIZ);
            if (this.LJIJI.LIZ.mVPassInteractCfg.LJIIIIZZ() == 2) {
                this.LJIILL.setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, VideoSolutionMode.VIDEO_SOLUTION_MODE_SIMULCAST, new VideoEncoderConfig[]{LIZIZ(), this.LIZIZ}, 2);
            } else {
                this.LJIILL.setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, VideoSolutionMode.VIDEO_SOLUTION_MODE_SINGLE, new VideoEncoderConfig[]{this.LIZIZ}, 1);
            }
            RTCVideoInterface rTCVideoInterface = this.LJIILL;
            StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
            VideoEncoderConfig videoEncoderConfig = this.LIZIZ;
            rTCVideoInterface.setVideoPerformanceConfig(streamIndex, videoEncoderConfig.width, videoEncoderConfig.height, videoEncoderConfig.frameRate);
            return;
        }
        if (this.LIZIZ != null) {
            if (this.LJIJI.LIZ.mVPassInteractCfg.LJIIIIZZ() == 2) {
                VideoEncoderConfig videoEncoderConfigLIZIZ = LIZIZ();
                VideoEncoderConfig videoEncoderConfig2 = this.LIZIZ;
                VideoEncoderConfig[] videoEncoderConfigArr = {videoEncoderConfigLIZIZ, videoEncoderConfig2};
                if (this.LJJI) {
                    float f = videoEncoderConfigLIZIZ.maxBitrate;
                    float f2 = this.LJJIFFI;
                    videoEncoderConfigLIZIZ.maxBitrate = (int) (f * f2);
                    videoEncoderConfig2.maxBitrate = (int) (videoEncoderConfig2.maxBitrate * f2);
                }
                if (this.LJIL) {
                    VideoEncoderConfig videoEncoderConfig3 = new VideoEncoderConfig(videoEncoderConfig2.width, videoEncoderConfig2.height, videoEncoderConfig2.frameRate, Math.max((int) (((double) videoEncoderConfig2.maxBitrate) * this.LJJ), videoEncoderConfig2.minBitrate), videoEncoderConfig2.minBitrate);
                    videoEncoderConfigArr[1] = videoEncoderConfig3;
                    videoEncoderConfig3.encodePreference = videoEncoderConfig2.encodePreference;
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Roi Enabled, bitrate multiplied ratio: ");
                    sbLIZ2.append(this.LJJ);
                    sbLIZ2.append(",codec_param: ");
                    sbLIZ2.append(videoEncoderConfigArr[1]);
                    AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ2), null);
                }
                this.LJIILL.setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, VideoSolutionMode.VIDEO_SOLUTION_MODE_SIMULCAST, videoEncoderConfigArr, 2);
            } else {
                VideoEncoderConfig videoEncoderConfig4 = this.LIZIZ;
                VideoEncoderConfig[] videoEncoderConfigArr2 = {videoEncoderConfig4};
                if (this.LJJI) {
                    videoEncoderConfig4.maxBitrate = (int) (videoEncoderConfig4.maxBitrate * this.LJJIFFI);
                }
                if (this.LJIL) {
                    VideoEncoderConfig videoEncoderConfig5 = new VideoEncoderConfig(videoEncoderConfig4.width, videoEncoderConfig4.height, videoEncoderConfig4.frameRate, Math.max((int) (((double) videoEncoderConfig4.maxBitrate) * this.LJJ), videoEncoderConfig4.minBitrate), videoEncoderConfig4.minBitrate);
                    videoEncoderConfigArr2[0] = videoEncoderConfig5;
                    videoEncoderConfig5.encodePreference = videoEncoderConfig4.encodePreference;
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Roi Enabled, bitrate multiplied ratio: ");
                    sbLIZ3.append(this.LJJ);
                    sbLIZ3.append(",codec_param: ");
                    sbLIZ3.append(videoEncoderConfigArr2[0]);
                    AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ3), null);
                }
                if (this.LJIJI.LIZ.mPushBase.LJIJJ() && (interfaceC1266360j3i = (c1269160j8E = this.LJIJI).LJI) != null && ((enumC1267980j6K = c1269160j8E.LJLJI.LJJLI) == EnumC1267980j6K.GAME_LIVE || enumC1267980j6K == EnumC1267980j6K.GAME_DUAL_DEVICE)) {
                    LyraxVideoEncoderProfile.VideoDegradeLevels degradeLevels = interfaceC1266360j3i.getDegradeLevels();
                    VideoEncoderConfig videoEncoderConfig6 = videoEncoderConfigArr2[0];
                    if (degradeLevels == null) {
                        videoDegradeLevels = null;
                    } else {
                        videoDegradeLevels = new VideoEncoderConfig.VideoDegradeLevels();
                        List<LyraxVideoDegradeConfig> list = degradeLevels.perf;
                        if (list != null) {
                            for (LyraxVideoDegradeConfig lyraxVideoDegradeConfig : list) {
                                VideoDegradeConfig videoDegradeConfig = new VideoDegradeConfig();
                                videoDegradeConfig.width = lyraxVideoDegradeConfig.width;
                                videoDegradeConfig.height = lyraxVideoDegradeConfig.height;
                                videoDegradeConfig.framerate = lyraxVideoDegradeConfig.framerate;
                                videoDegradeConfig.upThresholdKbps = lyraxVideoDegradeConfig.upThresholdKbps;
                                videoDegradeConfig.downThresholdKbps = lyraxVideoDegradeConfig.downThresholdKbps;
                                videoDegradeLevels.perf.add(videoDegradeConfig);
                            }
                        }
                        List<LyraxVideoDegradeConfig> list2 = degradeLevels.f441net;
                        if (list2 != null) {
                            for (LyraxVideoDegradeConfig lyraxVideoDegradeConfig2 : list2) {
                                VideoDegradeConfig videoDegradeConfig2 = new VideoDegradeConfig();
                                videoDegradeConfig2.width = lyraxVideoDegradeConfig2.width;
                                videoDegradeConfig2.height = lyraxVideoDegradeConfig2.height;
                                videoDegradeConfig2.framerate = lyraxVideoDegradeConfig2.framerate;
                                videoDegradeConfig2.upThresholdKbps = lyraxVideoDegradeConfig2.upThresholdKbps;
                                videoDegradeConfig2.downThresholdKbps = lyraxVideoDegradeConfig2.downThresholdKbps;
                                videoDegradeLevels.f440net.add(videoDegradeConfig2);
                            }
                        }
                    }
                    videoEncoderConfig6.degradeLevels = videoDegradeLevels;
                    List<LyraxVideoBitrateGearTableItem> videoBitrateGearTable = this.LJIJI.LJI.getVideoBitrateGearTable();
                    VideoEncoderConfig videoEncoderConfig7 = videoEncoderConfigArr2[0];
                    if (videoBitrateGearTable != null && !videoBitrateGearTable.isEmpty()) {
                        arrayList2 = new ArrayList(videoBitrateGearTable.size());
                        for (LyraxVideoBitrateGearTableItem lyraxVideoBitrateGearTableItem : videoBitrateGearTable) {
                            VideoResolutionConfig videoResolutionConfig = new VideoResolutionConfig();
                            videoResolutionConfig.width = lyraxVideoBitrateGearTableItem.width;
                            videoResolutionConfig.height = lyraxVideoBitrateGearTableItem.height;
                            videoResolutionConfig.framerate = lyraxVideoBitrateGearTableItem.frameRate;
                            videoResolutionConfig.maxKbps = lyraxVideoBitrateGearTableItem.maxBitrate;
                            videoResolutionConfig.minKbps = lyraxVideoBitrateGearTableItem.minBitrate;
                            arrayList2.add(videoResolutionConfig);
                        }
                    }
                    videoEncoderConfig7.resolutionBase = arrayList2;
                }
                this.LJIILL.setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, VideoSolutionMode.VIDEO_SOLUTION_MODE_SINGLE, videoEncoderConfigArr2, 1);
            }
            RTCVideoInterface rTCVideoInterface2 = this.LJIILL;
            StreamIndex streamIndex2 = StreamIndex.STREAM_INDEX_MAIN;
            VideoEncoderConfig videoEncoderConfig8 = this.LIZIZ;
            rTCVideoInterface2.setVideoPerformanceConfig(streamIndex2, videoEncoderConfig8.width, videoEncoderConfig8.height, videoEncoderConfig8.frameRate);
        }
    }

    public final void LJIIIIZZ() {
        AVLog.iod("RTCEngineWrapper", "RTCEngineWrapper() doDestroy() -->");
        this.LJ.LIZ();
        LJIJJLI();
        ScheduledExecutorService scheduledExecutorService = this.LJFF;
        if (scheduledExecutorService != null && !scheduledExecutorService.isShutdown()) {
            this.LJFF.execute(new ARunnableS113S0100000_13(this, 248));
        }
        ScheduledExecutorService scheduledExecutorService2 = this.LJFF;
        if (scheduledExecutorService2 != null) {
            scheduledExecutorService2.shutdown();
        }
        C1275010jHf c1275010jHf = this.LJIILIIL;
        if (c1275010jHf != null) {
            c1275010jHf.LIZ();
        }
        if (LIZ()) {
            AVLog.iod("RTCEngineWrapper", "anchorNetNoRoomJoinRoomOnce not destroy RtcRoom & RtcVideo -->");
            return;
        }
        if (!LJIILLIIL() || LJJIIZ()) {
            AVLog.iod("RTCEngineWrapper", "RTCEngineWrapper destroy RtcRoom & RtcVideo -->");
            LJII();
            AVLog.logKibana(4, "RTCEngineWrapper", "RTCEngineWrapper.destroyRTCVideo", null);
            RTCVideo.destroyRTCVideo();
            RTCVideo.setRtcNativeLibraryLoader(new RTCNativeLibraryLoaderImpl());
        }
    }

    public final String LJIIIZ() {
        JSONObject jSONObjectOptJSONObject;
        String strOptString = "";
        try {
            if (!TextUtils.isEmpty(this.LJIILJJIL) && (jSONObjectOptJSONObject = new JSONObject(this.LJIILJJIL).optJSONObject("live_rtc_engine_config")) != null) {
                strOptString = jSONObjectOptJSONObject.optString("rtc_app_id");
                return strOptString;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RTCEngineWrapper", "get app id exception", e);
        }
        return strOptString;
    }

    public final void LJIIJJI() {
        RTCRoom livePusherRoom = this.LJIILL.getLivePusherRoom(this.LJ.LIZLLL);
        this.LJIILLIIL = livePusherRoom;
        if (livePusherRoom == null) {
            AVLog.logKibana(5, "RTCEngineWrapper", "getRtcRoomAnchorNet failed ->", null);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getRtcRoomAnchorNet success && roomId:");
        sbLIZ.append(this.LJIILLIIL.getRoomId());
        AVLog.ioi("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final C1275140jHs LJIIL() {
        C1275010jHf c1275010jHf = this.LJIILIIL;
        if (c1275010jHf != null) {
            return c1275010jHf.LJIIIZ;
        }
        return null;
    }

    public final boolean LJIILIIL() {
        boolean z;
        synchronized (this.LJIIIZ) {
            try {
                z = this.LJIIIZ == MuteState.MUTE_STATE_ON;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final boolean LJIILL() {
        return this.LJIJI.LJLJI.LJJIL.LJI;
    }

    public final boolean LJIILLIIL() {
        C1269160j8E c1269160j8E = this.LJIJI;
        return c1269160j8E != null && c1269160j8E.LJJIZ();
    }

    public final boolean LJIIZILJ() {
        boolean z;
        synchronized (this.LJIIIIZZ) {
            try {
                z = this.LJIIIIZZ == MuteState.MUTE_STATE_ON;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return z;
    }

    public final boolean LJIJ() {
        if (this.LJIJI.LJJIZ()) {
            return (LJIILLIIL() ? this.LJIJI.LJI.LJJIJ() : EnumC1276080jJO.None) == EnumC1276080jJO.LinkMic;
        }
        return true;
    }

    public final boolean LJJIIZ() {
        InterfaceC1266360j3i interfaceC1266360j3i = this.LJIJI.LJI;
        return interfaceC1266360j3i != null && interfaceC1266360j3i.LJIIJJI();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final void destroy() {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            rTCRoom.destroy();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int disableDownlinkAudioSelection() {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface == null) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        rTCVideoInterface.disableDownlinkAudioSelection();
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final RTCRoom getLivePusherRoom() {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.getLivePusherRoom();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final String getLivePusherTaskId() {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        return rTCVideoInterface != null ? rTCVideoInterface.getLivePusherTaskId() : "";
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final long getNativeHandle() {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.getNativeHandle();
        }
        return 0L;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final NetworkTimeInfo getNetworkTimeInfo() {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.getNetworkTimeInfo();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final String getRoomId() {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.getRoomId();
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final boolean isLyraxFrameEnabled() {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.isLyraxFrameEnabled();
        }
        return false;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int leaveRoom() {
        EnumC1275530jIV enumC1275530jIV;
        C1275520jIU c1275520jIU = this.LJII;
        synchronized (c1275520jIU) {
            enumC1275530jIV = c1275520jIU.LIZ;
        }
        EnumC1275530jIV enumC1275530jIV2 = EnumC1275530jIV.CHANNEL_STATE_LEAVE_CHANNEL;
        if (enumC1275530jIV == enumC1275530jIV2) {
            return 0;
        }
        RTCRoom rTCRoom = this.LJIILLIIL;
        int iLeaveRoom = rTCRoom != null ? rTCRoom.leaveRoom() : 0;
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setBusinessId("");
        }
        C1275520jIU c1275520jIU2 = this.LJII;
        c1275520jIU2.getClass();
        c1275520jIU2.LIZ(enumC1275530jIV2);
        LJIJJLI();
        return iLeaveRoom;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int pauseForwardStreamToAllRooms() {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.pauseForwardStreamToAllRooms();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int replayLivePusherNeedEvent() {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.replayLivePusherNeedEvent();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int resumeForwardStreamToAllRooms() {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.resumeForwardStreamToAllRooms();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int startAudioCapture() {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface == null) {
            return 0;
        }
        rTCVideoInterface.startAudioCapture();
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int stopAudioCapture() {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface == null) {
            return 0;
        }
        rTCVideoInterface.stopAudioCapture();
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int stopChorusCacheSync() {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface == null) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        rTCVideoInterface.stopChorusCacheSync();
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int stopForwardStreamToRooms() {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.stopForwardStreamToRooms();
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int stopNetworkDetection() {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface == null) {
            return ReturnStatus.RETURN_STATUS_FAILURE.value();
        }
        rTCVideoInterface.stopNetworkDetection();
        return 0;
    }

    public final boolean LIZ() {
        return LJJIIZ() && !LJIILL() && this.LJIJI.LIZ.LIZ();
    }

    public final void LIZJ() {
        if (C1274690jH9.LIZJ() == null) {
            return;
        }
        if (C786410Ut5.u3() != C1274690jH9.LIZJ().getLooper().getThread()) {
            C1274690jH9.LJFF(new ARunnableS113S0100000_13(this, 247));
        }
        if (this.LJIILL == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("phone state: call end, isLocalAudioMute:");
        sbLIZ.append(LJIIZILJ());
        sbLIZ.append(", isAllRemoteAudioMute:");
        sbLIZ.append(LJIILIIL());
        AVLog.ioi("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIILLIIL == null) {
            return;
        }
        if (LJIIZILJ()) {
            this.LJIILLIIL.unpublishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
        } else {
            this.LJIILLIIL.publishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
        }
        if (LJIILIIL()) {
            this.LJIILLIIL.pauseAllSubscribedStream(PauseResumeControlMediaType.AUDIO);
        } else {
            this.LJIILLIIL.resumeAllSubscribedStream(PauseResumeControlMediaType.AUDIO);
        }
    }

    public final void LIZLLL() {
        if (C1274690jH9.LIZJ() == null) {
            return;
        }
        if (C786410Ut5.u3() != C1274690jH9.LIZJ().getLooper().getThread()) {
            C1274690jH9.LJFF(new ARunnableS113S0100000_13(this, 246));
        }
        if (this.LJIILL == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("phone state: call start, isLocalAudioMute:");
        sbLIZ.append(LJIIZILJ());
        sbLIZ.append(", isAllRemoteAudioMute:");
        sbLIZ.append(LJIILIIL());
        AVLog.ioi("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ));
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            rTCRoom.unpublishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
            this.LJIILLIIL.pauseAllSubscribedStream(PauseResumeControlMediaType.AUDIO);
        }
    }

    public final void LJI() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("createRtcRoom:");
        sbLIZ.append(this.LJ);
        sbLIZ.append(";rtcEngine:");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(";rtcRoom=");
        sbLIZ.append(this.LJIILLIIL);
        AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        C1275140jHs c1275140jHs = this.LJ;
        if (c1275140jHs == null || TextUtils.isEmpty(c1275140jHs.LIZLLL) || this.LJIILL == null) {
            return;
        }
        if (this.LJIILLIIL != null) {
            LJII();
        }
        RTCRoom rTCRoomCreateRTCRoom = this.LJIILL.createRTCRoom(this.LJ.LIZLLL);
        this.LJIILLIIL = rTCRoomCreateRTCRoom;
        if (rTCRoomCreateRTCRoom == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("create rtcRoom failed && roomId:");
            sbLIZ2.append(this.LJ.LIZLLL);
            AVLog.ioi("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("create rtcRoom success && roomId:");
        sbLIZ3.append(this.LJ.LIZLLL);
        AVLog.ioi("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public final void LJII() {
        RTCVideoInterface rTCVideoInterface;
        if (LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("destroyRtcRoom:");
            sbLIZ.append(this.LJIILLIIL);
            sbLIZ.append(";isEnableAnchorNet():");
            sbLIZ.append(LJIILLIIL());
            sbLIZ.append("; anchorNetNoRoomJoinRoomOnce: ");
            sbLIZ.append(LIZ());
            sbLIZ.append(" ");
            sbLIZ.append(this.LJIILL);
            AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
            return;
        }
        if (this.LJIILLIIL != null) {
            if ((!LJIILLIIL() && (rTCVideoInterface = this.LJIILL) != null && this.LJIILLIIL != rTCVideoInterface.getLivePusherRoom()) || LJJIIZ() || LJIILL()) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("destroyRtcRoom:");
                sbLIZ2.append(this.LJIILLIIL);
                sbLIZ2.append(";isEnableAnchorNet():");
                sbLIZ2.append(LJIILLIIL());
                sbLIZ2.append(";");
                sbLIZ2.append(this.LJIILL);
                AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ2), null);
                this.LJIILLIIL.destroy();
                this.LJIILLIIL = null;
            }
        }
    }

    public final boolean LJIILJJIL() {
        if (!LJJIIZ()) {
            return LJIILLIIL() && !TextUtils.equals(this.LJ.LIZLLL, this.LJIJI.LJLJI.LJJIL.LIZIZ);
        }
        this.LJIJI.LIZ.mPushBase.getClass();
        return false;
    }

    public final void LJJII() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RTCEngineWrapper() stopInteractRelease:");
        sbLIZ.append(this.LJIJI.LJJLIL);
        sbLIZ.append(this.LJIILLIIL);
        AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        if (this.LJIJI.LJJLIL) {
            if (!LJIILLIIL() || LJJIIZ()) {
                this.LJ.LIZ();
                LJIJJLI();
                C1275010jHf c1275010jHf = this.LJIILIIL;
                if (c1275010jHf != null) {
                    c1275010jHf.LIZ();
                }
                AVLog.iod("RTCEngineWrapper", "RTCEngineWrapper destroy RtcRoom-->");
                LJII();
            }
        }
    }

    public final boolean LJJIIZI() {
        return LJIILLIIL() && !LJIILJJIL();
    }

    public static VideoEncoderConfig LJFF(C1271990jCn c1271990jCn) {
        VideoEncoderConfig videoEncoderConfig = new VideoEncoderConfig();
        videoEncoderConfig.width = c1271990jCn.LIZ;
        videoEncoderConfig.height = c1271990jCn.LIZIZ;
        videoEncoderConfig.frameRate = c1271990jCn.LIZJ;
        videoEncoderConfig.maxBitrate = c1271990jCn.LIZLLL;
        return videoEncoderConfig;
    }

    public static String LJIIJ(String str) {
        String strOptString = null;
        try {
            JSONObject jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("live_rtc_engine_config");
            if (jSONObjectOptJSONObject != null) {
                strOptString = jSONObjectOptJSONObject.optString("rtc_app_id");
                return strOptString;
            }
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            LogUtil.e("RTCEngineWrapper", "get app id exception", e);
        }
        return strOptString;
    }

    public final void LJIJI(MuteState muteState) {
        if (this.LJIILL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("muteAllRemoteAudio, MuteState:");
            sbLIZ.append(muteState.toString());
            AVLog.ioi("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ));
            synchronized (this.LJIIIZ) {
                try {
                    this.LJIIIZ = muteState;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            RTCRoom rTCRoom = this.LJIILLIIL;
            if (rTCRoom != null) {
                if (muteState == MuteState.MUTE_STATE_ON) {
                    rTCRoom.pauseAllSubscribedStream(PauseResumeControlMediaType.AUDIO);
                } else {
                    rTCRoom.resumeAllSubscribedStream(PauseResumeControlMediaType.AUDIO);
                }
            }
        }
    }

    public final void LJIJJ(MuteState muteState) {
        if (this.LJIILL != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("muteLocalAudio, MuteState:");
            sbLIZ.append(muteState.toString());
            AVLog.ioi("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ));
            synchronized (this.LJIIIIZZ) {
                try {
                    this.LJIIIIZZ = muteState;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            RTCRoom rTCRoom = this.LJIILLIIL;
            if (rTCRoom != null) {
                if (muteState == MuteState.MUTE_STATE_ON) {
                    rTCRoom.unpublishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
                } else {
                    rTCRoom.publishStream(MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO);
                }
            }
        }
    }

    public final synchronized void LJJI(C1271990jCn[] c1271990jCnArr) {
        int videoEncoderConfig;
        if (this.LJIILL != null) {
            C1275120jHq c1275120jHq = this.LJJII;
            if (c1275120jHq != null) {
                c1275120jHq.LIZ(EnumC1275230jI1.Pathway_Sync_SetVideoEncoderConfig, c1271990jCnArr);
            }
            String strLIZIZ = "";
            for (C1271990jCn c1271990jCn : c1271990jCnArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ);
                sbLIZ.append(c1271990jCn);
                String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ2);
                sbLIZ2.append(", ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (this.LJIL) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("Roi Enabled, setting VideoEncoder with bitrate multiplied ratio: ");
                sbLIZ3.append(this.LJJ);
                AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ3), null);
            }
            if (c1271990jCnArr.length == 1) {
                VideoEncoderConfig videoEncoderConfigLJFF = LJFF(c1271990jCnArr[0]);
                videoEncoderConfigLJFF.encodePreference = VideoEncoderConfig.EncoderPreference.MAINTAIN_FRAMERATE;
                VideoEncoderConfig[] videoEncoderConfigArr = {videoEncoderConfigLJFF};
                if (this.LJIL) {
                    videoEncoderConfigArr[0].maxBitrate = Math.max((int) (((double) videoEncoderConfigLJFF.maxBitrate) * this.LJJ), videoEncoderConfigLJFF.minBitrate);
                }
                videoEncoderConfig = this.LJIILL.setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, VideoSolutionMode.VIDEO_SOLUTION_MODE_SINGLE, videoEncoderConfigArr, 1);
            } else {
                int length = c1271990jCnArr.length;
                VideoEncoderConfig[] videoEncoderConfigArr2 = new VideoEncoderConfig[length];
                for (int i = 0; i < c1271990jCnArr.length; i++) {
                    VideoEncoderConfig videoEncoderConfigLJFF2 = LJFF(c1271990jCnArr[i]);
                    videoEncoderConfigArr2[i] = videoEncoderConfigLJFF2;
                    if (this.LJIL) {
                        videoEncoderConfigArr2[i].maxBitrate = Math.max((int) (((double) videoEncoderConfigLJFF2.maxBitrate) * this.LJJ), videoEncoderConfigLJFF2.minBitrate);
                    }
                    VideoEncoderConfig videoEncoderConfig2 = videoEncoderConfigArr2[i];
                    videoEncoderConfig2.encodePreference = VideoEncoderConfig.EncoderPreference.DISABLED;
                    if (i == 1) {
                        videoEncoderConfig2.encodePreference = VideoEncoderConfig.EncoderPreference.MAINTAIN_FRAMERATE;
                    }
                }
                videoEncoderConfig = this.LJIILL.setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, VideoSolutionMode.VIDEO_SOLUTION_MODE_SIMULCAST, videoEncoderConfigArr2, length);
            }
            this.LJIJJLI = true;
            AVLog.logKibana(4, "RTCEngineWrapper", "setVideoEncodeConfig() called with: rtcVideoEncodeConfig[] = [" + strLIZIZ + " configResult:" + videoEncoderConfig, null);
        }
    }

    public final void LJJIFFI(C1272000jCo c1272000jCo) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            int videoPerformanceConfig = rTCVideoInterface.setVideoPerformanceConfig(StreamIndex.STREAM_INDEX_MAIN, c1272000jCo.LIZ, c1272000jCo.LIZIZ, c1272000jCo.LIZJ);
            C1275120jHq c1275120jHq = this.LJJII;
            if (c1275120jHq != null && !c1275120jHq.LJII) {
                c1275120jHq.LIZJ = c1272000jCo;
                c1275120jHq.LJFF = TimeUtils.nativeTimeUTCMicros();
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setVideoPerformanceConfig() called with: performanceConfig:");
            sbLIZ.append(c1272000jCo);
            sbLIZ.append(" configResult:");
            sbLIZ.append(videoPerformanceConfig);
            AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        }
    }

    public final void LJJIII(C1271990jCn[] c1271990jCnArr) {
        VideoEncoderConfig[] videoEncoderConfigArr;
        int videoEncoderConfig;
        if (this.LJIILL != null) {
            String strLIZIZ = "";
            String strLIZIZ2 = "";
            for (C1271990jCn c1271990jCn : c1271990jCnArr) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLIZIZ2);
                sbLIZ.append(c1271990jCn);
                String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLIZIZ3);
                sbLIZ2.append(", ");
                strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            }
            if (c1271990jCnArr.length == 1) {
                VideoEncoderConfig videoEncoderConfigLJFF = LJFF(c1271990jCnArr[0]);
                videoEncoderConfigLJFF.encodePreference = VideoEncoderConfig.EncoderPreference.MAINTAIN_FRAMERATE;
                videoEncoderConfigArr = new VideoEncoderConfig[]{videoEncoderConfigLJFF};
                this.LJIJJLI = true;
            } else {
                videoEncoderConfigArr = new VideoEncoderConfig[c1271990jCnArr.length];
                for (int i = 0; i < c1271990jCnArr.length; i++) {
                    VideoEncoderConfig videoEncoderConfigLJFF2 = LJFF(c1271990jCnArr[i]);
                    videoEncoderConfigArr[i] = videoEncoderConfigLJFF2;
                    videoEncoderConfigLJFF2.encodePreference = VideoEncoderConfig.EncoderPreference.DISABLED;
                    if (i == 1) {
                        videoEncoderConfigLJFF2.encodePreference = VideoEncoderConfig.EncoderPreference.MAINTAIN_FRAMERATE;
                    }
                }
                this.LJIJJLI = true;
            }
            for (VideoEncoderConfig videoEncoderConfig2 : videoEncoderConfigArr) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append(strLIZIZ);
                sbLIZ3.append(videoEncoderConfig2.toString());
                String strLIZIZ4 = C2188811AlT.LIZIZ(sbLIZ3);
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append(strLIZIZ4);
                sbLIZ4.append(", ");
                strLIZIZ = C2188811AlT.LIZIZ(sbLIZ4);
            }
            if (!LJJIIZ() && !LJIILL()) {
                videoEncoderConfig = this.LJIILL.switchToLinkmicWithConfig(StreamIndex.STREAM_INDEX_MAIN, VideoSolutionMode.VIDEO_SOLUTION_MODE_SIMULCAST, videoEncoderConfigArr, videoEncoderConfigArr.length);
            } else {
                videoEncoderConfig = this.LJIILL.setVideoEncoderConfig(StreamIndex.STREAM_INDEX_MAIN, VideoSolutionMode.VIDEO_SOLUTION_MODE_SIMULCAST, videoEncoderConfigArr, videoEncoderConfigArr.length);
            }
            StringBuilder sbLIZ5 = C2188811AlT.LIZ();
            sbLIZ5.append("[lzc] switchToLinkmicWithConfig() called with: rtcVideoEncodeConfig[] = [");
            sbLIZ5.append(strLIZIZ2);
            sbLIZ5.append("] channelSolutionsStr[] = [");
            sbLIZ5.append(strLIZIZ);
            sbLIZ5.append("] configResult:");
            sbLIZ5.append(videoEncoderConfig);
            AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ5), null);
        }
    }

    public final void LJJIIJ(String str) {
        if (str == null) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String strOptString = jSONObject.optString("rtc_business_id");
            if (strOptString != null && !strOptString.isEmpty()) {
                this.LJ.LJIIIZ = strOptString;
                this.LJIILL.setBusinessId(strOptString);
            }
            AbstractC1273900jFs abstractC1273900jFs = this.LJIJJ;
            if (abstractC1273900jFs != null && abstractC1273900jFs.LLILZLL()) {
                return;
            }
            LJJIIJZLJL(jSONObject.optJSONObject("live_rtc_video_param"));
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("update rtc info happen exception rtcExtInfo:");
            sbLIZ.append(str);
            LogUtil.e("RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ), e);
        }
    }

    public final void LJJIIJZLJL(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        C1275010jHf c1275010jHf = this.LJIILIIL;
        if (c1275010jHf != null) {
            c1275010jHf.LIZIZ(jSONObject);
            C1275010jHf c1275010jHf2 = this.LJIILIIL;
            this.LIZ = c1275010jHf2.LIZLLL;
            this.LIZIZ = c1275010jHf2.LJ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateRtcVideoParam() called with: mLiveVideoMode = [");
            sbLIZ.append(this.LIZ);
            sbLIZ.append(" mLiveVideoPreset:");
            sbLIZ.append(this.LIZIZ);
            AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        LJ();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final String buildRemoteVideoRenderId(StreamKey streamKey) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.buildRemoteVideoRenderId(streamKey);
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final void detachRemoteVideoRenderer(StreamKey streamKey) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.detachRemoteVideoRenderer(streamKey);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int disableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.disableAudioFrameCallback(audioFrameCallbackMethod);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int disableAudioProcessor(AudioProcessorMethod audioProcessorMethod) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.disableAudioProcessor(audioProcessorMethod);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int enableAudioPropertiesReport(AudioPropertiesConfig audioPropertiesConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.enableAudioPropertiesReport(audioPropertiesConfig);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int enableDownlinkAudioSelection(int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.enableDownlinkAudioSelection(i);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int enableSimulcastMode(boolean z) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.enableSimulcastMode(z);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final RTCRoom getLivePusherRoom(String str) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.getLivePusherRoom(str);
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final ILyraxAudioPlayer getLyraxAudioPlayer(int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.getLyraxAudioPlayer(i);
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final View getRemoteVideoRenderTargetView(StreamKey streamKey) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.getRemoteVideoRenderTargetView(streamKey);
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final ILyraxVideoRenderer getRemoteVideoRenderer(StreamKey streamKey) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.getRemoteVideoRenderer(streamKey);
        }
        return null;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final VideoCodecDescription[] getVideoTargetDecoderDescriptions(StreamIndex streamIndex) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.getVideoTargetDecoderDescriptions(streamIndex);
        }
        return new VideoCodecDescription[0];
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int pauseAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.pauseAllSubscribedStream(pauseResumeControlMediaType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int publishScreen(MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.publishScreen(mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int publishStream(MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.publishStream(mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int pullExternalAudioFrame(AudioFrame audioFrame) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.pullExternalAudioFrame(audioFrame);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int pushExternalAudioFrame(AudioFrame audioFrame) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.pushExternalAudioFrame(audioFrame);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int pushExternalVideoFrame(VideoFrame videoFrame) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.pushExternalVideoFrame(videoFrame);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int pushScreenAudioFrame(AudioFrame audioFrame) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.pushScreenAudioFrame(audioFrame);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int registerAudioFrameObserver(IAudioFrameObserver iAudioFrameObserver) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.registerAudioFrameObserver(iAudioFrameObserver);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int registerAudioProcessor(IAudioFrameProcessor iAudioFrameProcessor) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.registerAudioProcessor(iAudioFrameProcessor);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int registerLocalEncodedVideoFrameObserver(ILocalEncodedVideoFrameObserver iLocalEncodedVideoFrameObserver) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.registerLocalEncodedVideoFrameObserver(iLocalEncodedVideoFrameObserver);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int registerRemoteEncodedVideoFrameObserver(IRemoteEncodedVideoFrameObserver iRemoteEncodedVideoFrameObserver) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.registerRemoteEncodedVideoFrameObserver(iRemoteEncodedVideoFrameObserver);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int requestRemoteVideoKeyFrame(StreamKey streamKey) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.requestRemoteVideoKeyFrame(streamKey);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int resumeAllSubscribedStream(PauseResumeControlMediaType pauseResumeControlMediaType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.resumeAllSubscribedStream(pauseResumeControlMediaType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final long sendRoomBinaryMessage(byte[] bArr) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.sendRoomBinaryMessage(bArr);
        }
        return 0L;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final long sendRoomMessage(String str) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.sendRoomMessage(str);
        }
        return 0L;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setAudioRenderType(AudioRenderType audioRenderType) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setAudioRenderType(audioRenderType);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setAudioScene(AudioSceneType audioSceneType) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setAudioScene(audioSceneType);
            return 0;
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setAudioSourceType(AudioSourceType audioSourceType) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setAudioSourceType(audioSourceType);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setBizSessionId(String str) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setBizSessionId(str);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setBusinessId(String str) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setBusinessId(str);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setBusinessLabel(String str) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setBusinessLabel(str);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setCellularEnhancement(MediaTypeEnhancementConfig mediaTypeEnhancementConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setCellularEnhancement(mediaTypeEnhancementConfig);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setDefaultAudioRoute(AudioRoute audioRoute) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setDefaultAudioRoute(audioRoute);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setDefaultRemoteVideoConfig(RemoteVideoConfig remoteVideoConfig) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setDefaultRemoteVideoConfig(remoteVideoConfig);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setExternalVideoEncoderEventHandler(IExternalVideoEncoderEventHandler iExternalVideoEncoderEventHandler) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setExternalVideoEncoderEventHandler(iExternalVideoEncoderEventHandler);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setGroupChannelId(String str) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setGroupChannelId(str);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setLinkMicType(LinkMicType linkMicType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setLinkMicType(linkMicType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setOnDestroyCompletedCallback(Runnable runnable) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setOnDestroyCompletedCallback(runnable);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setPerformanceGrade(StrategyGrade strategyGrade) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.setPerformanceGrade(strategyGrade);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setPlaybackVolume(int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setPlaybackVolume(i);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setPostProcessParameter(PostProcessParameter postProcessParameter) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setPostProcessParameter(postProcessParameter);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setPublishFallbackOption(PublishFallbackOption publishFallbackOption) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setPublishFallbackOption(publishFallbackOption);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setRTCRoomEventHandler(IRTCRoomEventHandler iRTCRoomEventHandler) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setRTCRoomEventHandler(iRTCRoomEventHandler);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setRemoteRoomAudioPlaybackVolume(int i) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setRemoteRoomAudioPlaybackVolume(i);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final void setRtcScene(RtcScene rtcScene) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setRtcScene(rtcScene);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setRtcVideoEventHandler(IRTCVideoEventHandler iRTCVideoEventHandler) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setRtcVideoEventHandler(iRTCVideoEventHandler);
            return 0;
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setRuntimeParameters(JSONObject jSONObject) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setRuntimeParameters(jSONObject);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setSEICurrentShiftDiffTime(long j) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setSEICurrentShiftDiffTime(j);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setScreenAudioSourceType(AudioSourceType audioSourceType) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setScreenAudioSourceType(audioSourceType);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setScreenAudioStreamIndex(StreamIndex streamIndex) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setScreenAudioStreamIndex(streamIndex);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final void setStrategyInfo(String str) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setStrategyInfo(str);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setSubscribeFallbackOption(SubscribeFallbackOptions subscribeFallbackOptions) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setSubscribeFallbackOption(subscribeFallbackOptions);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setUserVisibility(boolean z) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setUserVisibility(z);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setVideoCaptureConfig(VideoCaptureConfig videoCaptureConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setVideoCaptureConfig(videoCaptureConfig);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setVideoEncoderConfig(VideoEncoderConfig[] videoEncoderConfigArr) {
        if (this.LIZ == 0) {
            if (this.LJIJI.LIZ.mVPassInteractCfg.LJIIIIZZ() == 2) {
                VideoEncoderConfig[] videoEncoderConfigArr2 = {LIZIZ(), this.LIZIZ};
                RTCVideoInterface rTCVideoInterface = this.LJIILL;
                StreamIndex streamIndex = StreamIndex.STREAM_INDEX_MAIN;
                rTCVideoInterface.setVideoEncoderConfig(streamIndex, VideoSolutionMode.VIDEO_SOLUTION_MODE_SIMULCAST, videoEncoderConfigArr2, 2);
                RTCVideoInterface rTCVideoInterface2 = this.LJIILL;
                VideoEncoderConfig videoEncoderConfig = this.LIZIZ;
                rTCVideoInterface2.setVideoPerformanceConfig(streamIndex, videoEncoderConfig.width, videoEncoderConfig.height, videoEncoderConfig.frameRate);
            } else {
                VideoEncoderConfig videoEncoderConfig2 = videoEncoderConfigArr[0];
                RTCVideoInterface rTCVideoInterface3 = this.LJIILL;
                StreamIndex streamIndex2 = StreamIndex.STREAM_INDEX_MAIN;
                int videoEncoderConfig3 = rTCVideoInterface3.setVideoEncoderConfig(streamIndex2, VideoSolutionMode.VIDEO_SOLUTION_MODE_SINGLE, videoEncoderConfigArr, videoEncoderConfigArr.length);
                this.LJIILL.setVideoPerformanceConfig(streamIndex2, videoEncoderConfig2.width, videoEncoderConfig2.height, videoEncoderConfig2.frameRate);
                return videoEncoderConfig3;
            }
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final void setVideoStrategyRunner(IVideoStrategyRunner iVideoStrategyRunner) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setVideoStrategyRunner(iVideoStrategyRunner);
        }
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int startForwardStreamToRooms(List<ForwardStreamInfo> list) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.startForwardStreamToRooms(list);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public final int stopPushStreamToCDN(String str) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.stopPushStreamToCDN(str);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int stopPushVideoFile(StreamIndex streamIndex) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.stopPushVideoFile(streamIndex);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int unpublishScreen(MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.unpublishScreen(mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int unpublishStream(MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.unpublishStream(mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int updateForwardStreamToRooms(List<ForwardStreamInfo> list) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.updateForwardStreamToRooms(list);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int updateToken(String str) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.updateToken(str);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setVideoEncoderConfig(VideoEncoderConfig videoEncoderConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setVideoEncoderConfig(videoEncoderConfig);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    public final void LJIL(EnumC1276080jJO enumC1276080jJO, String str) {
        InterfaceC1266360j3i interfaceC1266360j3i;
        if (LJIILLIIL() && (interfaceC1266360j3i = this.LJIJI.LJI) != null) {
            if (enumC1276080jJO == EnumC1276080jJO.LinkMic) {
                interfaceC1266360j3i.LJJIIZ(str);
            } else {
                if (enumC1276080jJO != EnumC1276080jJO.Live) {
                    return;
                }
                interfaceC1266360j3i.LJIILJJIL();
                if (!LJJIIZ()) {
                    return;
                }
                interfaceC1266360j3i.unbindFromRoom(str);
            }
        }
    }

    public final void LJJ(String str, String str2) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ;
        C1279520jOw c1279520jOw;
        ScheduledExecutorService scheduledExecutorService;
        if (this.LJIILIIL == null && (c1279520jOw = this.LJIIJJI) != null && (scheduledExecutorService = this.LJFF) != null) {
            this.LJIILIIL = new C1275010jHf(c1279520jOw, scheduledExecutorService);
        }
        C1275010jHf c1275010jHf = this.LJIILIIL;
        c1275010jHf.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("rtcExtInfo:");
        sbLIZ.append(str);
        LogUtil.i("LiveRtcEngine", C2188811AlT.LIZIZ(sbLIZ));
        if (str != null && !"".equals(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("live_rtc_engine_config");
                if (jSONObjectOptJSONObject != null) {
                    String str3 = c1275010jHf.LIZJ;
                    if (str3 == null) {
                        c1275010jHf.LIZJ = jSONObjectOptJSONObject.optString("rtc_app_id");
                    } else if (!str3.equals(jSONObjectOptJSONObject.optString("rtc_app_id"))) {
                        c1275010jHf.LIZIZ.execute(new ARunnableS120S0100000_20(c1275010jHf, 311));
                    }
                    c1275010jHf.LJIIIZ.LIZ = jSONObjectOptJSONObject.optString("rtc_token");
                    c1275010jHf.LJIIIZ.LIZIZ = jSONObjectOptJSONObject.optInt("rtc_vendor");
                    c1275010jHf.LJIIIZ.LIZJ = Base64.decode(jSONObjectOptJSONObject.optString("rtc_app_sign"), 0);
                    c1275010jHf.LJIIIZ.LIZLLL = jSONObjectOptJSONObject.optString("rtc_channel_id");
                    c1275010jHf.LJIIIZ.LJFF = jSONObjectOptJSONObject.optString("rtc_user_id");
                    c1275010jHf.LJIIIZ.LJIIIIZZ = jSONObjectOptJSONObject.optInt("rtc_user_id_mode");
                    C1275140jHs c1275140jHs = c1275010jHf.LJIIIZ;
                    c1275140jHs.LJI = "byte";
                    c1275140jHs.LJ = jSONObjectOptJSONObject.optString("user_id");
                }
                c1275010jHf.LIZIZ(jSONObject.optJSONObject("live_rtc_video_param"));
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("rtc_other");
                if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.has("max_transcoding_cb_interval_second")) {
                    jSONObjectOptJSONObject2.optInt("max_transcoding_cb_interval_second");
                }
                c1275010jHf.LJIIIZ.LJIIIZ = jSONObject.optString("rtc_business_id");
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("rtcExtInfo:");
                sbLIZ2.append(str);
                sbLIZ2.append(" sAppID:");
                sbLIZ2.append(c1275010jHf.LIZJ);
                sbLIZ2.append(" sToken:");
                sbLIZ2.append(c1275010jHf.LJIIIZ.LIZ);
                sbLIZ2.append(" rtc_vendor");
                sbLIZ2.append(c1275010jHf.LJIIIZ.LIZIZ);
                sbLIZ2.append(" rtc_app_sign:");
                sbLIZ2.append(c1275010jHf.LJIIIZ.LIZJ);
                sbLIZ2.append(" mChannelId:");
                sbLIZ2.append(c1275010jHf.LJIIIZ.LIZLLL);
                sbLIZ2.append(" mUserId");
                sbLIZ2.append(c1275010jHf.LJIIIZ.LJFF);
                sbLIZ2.append(" mEnableInteractIdIntMode");
                sbLIZ2.append(c1275010jHf.LJIIIZ.LJIIIIZZ);
                sbLIZ2.append(" mTraceId");
                sbLIZ2.append(c1275010jHf.LJIIIZ.LJ);
                LogUtil.i("LiveRtcEngine", C2188811AlT.LIZIZ(sbLIZ2));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("parseRTCExtInfo happen exception");
                sbLIZ3.append(e.getStackTrace().toString());
                LogUtil.w("LiveRtcEngine", C2188811AlT.LIZIZ(sbLIZ3));
            }
        } else {
            C1279520jOw c1279520jOw2 = c1275010jHf.LIZ;
            if (c1279520jOw2 != null && (iRTCVideoEventHandlerLIZ = c1279520jOw2.LIZ()) != null) {
                c1275010jHf.LIZIZ.execute(new ARunnableS120S0100000_20(iRTCVideoEventHandlerLIZ, 310));
            }
        }
        C1275010jHf c1275010jHf2 = this.LJIILIIL;
        this.LJ = c1275010jHf2.LJIIIZ;
        this.LIZ = c1275010jHf2.LIZLLL;
        this.LIZIZ = c1275010jHf2.LJ;
        this.LIZJ = c1275010jHf2.LJFF;
        this.LIZLLL = c1275010jHf2.LJI;
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("setRtcExtInfo:");
        sbLIZ4.append(str);
        sbLIZ4.append("; source = ");
        sbLIZ4.append(str2);
        sbLIZ4.append(";useAnchorNetRtcEngine=");
        sbLIZ4.append(LJJIIZI());
        sbLIZ4.append(";getChannelId()=");
        sbLIZ4.append(this.LJ.LIZLLL);
        sbLIZ4.append(";builder.channelId=");
        sbLIZ4.append(this.LJIJI.LJLJI.LJJIL.LIZIZ);
        AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ4), null);
        if (this.LJIILLIIL == null) {
            if (LJJIIZI()) {
                if (this.LJIILL != null) {
                    if (LIZ()) {
                        LJIIJJI();
                        return;
                    } else if (LJJIIZ()) {
                        LJI();
                        return;
                    } else {
                        LJIIJJI();
                        return;
                    }
                }
                return;
            }
            LJI();
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int enableAudioFrameCallback(AudioFrameCallbackMethod audioFrameCallbackMethod, AudioFormat audioFormat) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.enableAudioFrameCallback(audioFrameCallbackMethod, audioFormat);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int enableAudioProcessor(AudioProcessorMethod audioProcessorMethod, AudioFormat audioFormat) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.enableAudioProcessor(audioProcessorMethod, audioFormat);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int enableAudioToAvatarMode(StreamIndex streamIndex, boolean z) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.enableAudioToAvatarMode(streamIndex, z);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int enableSEISendE2EInfo(boolean z, int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.enableSEISendE2EInfo(z, i);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int publishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.publishStream(streamIndex, mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int pushExternalVideoFrame(StreamIndex streamIndex, VideoFrame videoFrame) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.pushExternalVideoFrame(streamIndex, videoFrame);
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int replaceBackground(BackgroundMode backgroundMode, DivideModel divideModel) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.replaceBackground(backgroundMode, divideModel);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setAudioContentType(StreamIndex streamIndex, AudioContentTypeConfig audioContentTypeConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.setAudioContentType(streamIndex, audioContentTypeConfig);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setAudioEncodeConfig(StreamIndex streamIndex, AudioEncodeConfig audioEncodeConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.setAudioEncodeConfig(streamIndex, audioEncodeConfig);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setCaptureVolume(StreamIndex streamIndex, int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setCaptureVolume(streamIndex, i);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setDownLinkAudioSelectionPriority(StreamIndex streamIndex, DownLinkAudioSelectionPriority downLinkAudioSelectionPriority) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setDownLinkAudioSelectionPriority(streamIndex, downLinkAudioSelectionPriority);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setLiveBitrateGearTable(VideoEncoderConfig[] videoEncoderConfigArr, int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setLiveBitrateGearTable(videoEncoderConfigArr, i);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setLocalStreamPriority(StreamIndex streamIndex, StreamPriority streamPriority) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.setLocalStreamPriority(streamIndex, streamPriority);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setLocalVideoCanvas(StreamIndex streamIndex, VideoCanvas videoCanvas) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setLocalVideoCanvas(streamIndex, videoCanvas);
            return 0;
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final void setMixedStreamToCDNObserver(String str, IMixedStreamObserver iMixedStreamObserver) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setMixedStreamToCDNObserver(str, iMixedStreamObserver);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setRemoteAudioPlaybackVolume(StreamKey streamKey, int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.setRemoteAudioPlaybackVolume(streamKey, i);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setRemoteVideoCanvas(StreamKey streamKey, VideoCanvas videoCanvas) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setRemoteVideoCanvas(streamKey, videoCanvas);
            return 0;
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setRemoteVideoConfig(String str, RemoteVideoConfig remoteVideoConfig) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setRemoteVideoConfig(str, remoteVideoConfig);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setRemoteVideoRenderConfig(StreamKey streamKey, LyraxVideoRenderConfig lyraxVideoRenderConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.setRemoteVideoRenderConfig(streamKey, lyraxVideoRenderConfig);
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final void setRemoteVideoRenderTargetView(String str, View view) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setRemoteVideoRenderTargetView(str, view);
        }
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setRemoteVideoSuperResolution(StreamKey streamKey, VideoSuperResolutionMode videoSuperResolutionMode) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setRemoteVideoSuperResolution(streamKey, videoSuperResolutionMode);
            return 0;
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setVideoCaptureConfig(StreamIndex streamIndex, VideoCaptureConfig videoCaptureConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.setVideoCaptureConfig(streamIndex, videoCaptureConfig);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setVideoDecoderConfig(StreamKey streamKey, VideoDecoderConfig videoDecoderConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setVideoDecoderConfig(streamKey, videoDecoderConfig);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setVideoSource(StreamIndex streamIndex, InternalVideoSourceConfig internalVideoSourceConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.setVideoSource(streamIndex, internalVideoSourceConfig);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setVideoSourceType(StreamIndex streamIndex, VideoSourceType videoSourceType) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setVideoSourceType(streamIndex, videoSourceType);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int startChorusCacheSync(ChorusCacheSyncConfig chorusCacheSyncConfig, IChorusCacheSyncObserver iChorusCacheSyncObserver) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.startChorusCacheSync(chorusCacheSyncConfig, iChorusCacheSyncObserver);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int subscribeAllStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.subscribeAllStreams(streamIndex, mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int subscribeScreen(String str, MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.subscribeScreen(str, mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int subscribeStream(String str, MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.subscribeStream(str, mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int unpublishStream(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.unpublishStream(streamIndex, mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int unsubscribeAllStreams(StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.unsubscribeAllStreams(streamIndex, mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int unsubscribeScreen(String str, MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.unsubscribeScreen(str, mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int unsubscribeStream(String str, MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.unsubscribeStream(str, mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int updateExternalStats(StreamIndex streamIndex, LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.updateExternalStats(streamIndex, lyraxPreProcessVideoNodeStats);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public final int updatePushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.updatePushMixedStreamToCDN(str, mixedStreamConfig);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int pushExternalVideoFrame(VideoFrame videoFrame, boolean z) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.pushExternalVideoFrame(videoFrame, z);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int joinRoom(String str, UserInfo userInfo, RTCRoomConfig rTCRoomConfig) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.joinRoom(str, userInfo, rTCRoomConfig);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int pushExternalEncodedVideoFrame(StreamIndex streamIndex, int i, RTCEncodedVideoFrame rTCEncodedVideoFrame) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.pushExternalEncodedVideoFrame(streamIndex, i, rTCEncodedVideoFrame);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final long sendUserBinaryMessage(String str, byte[] bArr, MessageConfig messageConfig) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.sendUserBinaryMessage(str, bArr, messageConfig);
        }
        return 0L;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final long sendUserMessage(String str, String str2, MessageConfig messageConfig) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.sendUserMessage(str, str2, messageConfig);
        }
        return 0L;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setLocalVideoSink(StreamIndex streamIndex, IVideoSink iVideoSink, int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setLocalVideoSink(streamIndex, iVideoSink, i);
            return 0;
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setRemoteAudioPlaybackVolume(String str, String str2, int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setRemoteAudioPlaybackVolume(str, str2, i);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setRemoteUserPriority(String str, String str2, RemoteUserPriority remoteUserPriority) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setRemoteUserPriority(str, str2, remoteUserPriority);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setRemoteVideoConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setRemoteVideoConfig(str, streamIndex, remoteVideoConfig);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int setRemoteVideoPerformanceConfig(String str, StreamIndex streamIndex, RemoteVideoConfig remoteVideoConfig) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.setRemoteVideoPerformanceConfig(str, streamIndex, remoteVideoConfig);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setRemoteVideoSink(StreamKey streamKey, IVideoSink iVideoSink, int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setRemoteVideoSink(streamKey, iVideoSink, i);
            return 0;
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface, X.InterfaceC1276010jJH
    public final int startPushMixedStreamToCDN(String str, MixedStreamConfig mixedStreamConfig, IMixedStreamObserver iMixedStreamObserver) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.startPushMixedStreamToCDN(str, mixedStreamConfig, iMixedStreamObserver);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int startPushVideoFile(StreamIndex streamIndex, String str, boolean z) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.startPushVideoFile(streamIndex, str, z);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int subscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.subscribeStream(str, streamIndex, mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int unsubscribeStream(String str, StreamIndex streamIndex, MediaStreamType mediaStreamType) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.unsubscribeStream(str, streamIndex, mediaStreamType);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int sendSEIMessage(StreamIndex streamIndex, VideoExternalData videoExternalData, int i, SEICountPerFrame sEICountPerFrame) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.sendSEIMessage(streamIndex, videoExternalData, i, sEICountPerFrame);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setVideoEncoderConfig(StreamIndex streamIndex, VideoSolutionMode videoSolutionMode, VideoEncoderConfig[] videoEncoderConfigArr, int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setVideoEncoderConfig(streamIndex, videoSolutionMode, videoEncoderConfigArr, i);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int setVideoPerformanceConfig(StreamIndex streamIndex, int i, int i2, int i3) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.setVideoPerformanceConfig(streamIndex, i, i2, i3);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int startNetworkDetection(boolean z, int i, boolean z2, int i2) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.startNetworkDetection(z, i, z2, i2);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCRoomInterface
    public final int subscribeUserStream(String str, StreamIndex streamIndex, SubscribeMediaType subscribeMediaType, SubscribeVideoConfig subscribeVideoConfig) {
        RTCRoom rTCRoom = this.LJIILLIIL;
        if (rTCRoom != null) {
            return rTCRoom.subscribeUserStream(str, streamIndex, subscribeMediaType, subscribeVideoConfig);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int switchToLinkmicWithConfig(StreamIndex streamIndex, VideoSolutionMode videoSolutionMode, VideoEncoderConfig[] videoEncoderConfigArr, int i) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.switchToLinkmicWithConfig(streamIndex, videoSolutionMode, videoEncoderConfigArr, i);
        }
        return 0;
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int sendSEIMessage(StreamIndex streamIndex, byte[] bArr, int i, SEICountPerFrame sEICountPerFrame) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.sendSEIMessage(streamIndex, bArr, i, sEICountPerFrame);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final int bindToStandardDowngradeTier(StreamIndex streamIndex, int i, int i2, int i3, int i4) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            rTCVideoInterface.bindToStandardDowngradeTier(streamIndex, i, i2, i3, i4);
            return 0;
        }
        return ReturnStatus.RETURN_STATUS_FAILURE.value();
    }

    @Override // com.ss.bytertc.engine.RTCVideoInterface
    public final LyraxVideoFrame getPooledFrame(VideoPixelFormat videoPixelFormat, int i, int i2, int i3, VideoRotation videoRotation, ColorSpace colorSpace) {
        RTCVideoInterface rTCVideoInterface = this.LJIILL;
        if (rTCVideoInterface != null) {
            return rTCVideoInterface.getPooledFrame(videoPixelFormat, i, i2, i3, videoRotation, colorSpace);
        }
        return null;
    }

    public C1274890jHT(Context context, String str, Object obj, JSONObject jSONObject, C1269340j8W c1269340j8W, AbstractC1273900jFs abstractC1273900jFs, List list, C1275030jHh c1275030jHh) {
        GLESVersion gLESVersion;
        String str2;
        boolean z;
        int i;
        Context context2;
        int iLJIJJ;
        VideoEncoderConfig videoEncoderConfig = C1275720jIo.LIZ;
        this.LIZIZ = videoEncoderConfig;
        this.LIZJ = videoEncoderConfig;
        this.LIZLLL = videoEncoderConfig;
        this.LJ = new C1275140jHs();
        this.LJII = new C1275520jIU();
        MuteState muteState = MuteState.MUTE_STATE_OFF;
        this.LJIIIIZZ = muteState;
        this.LJIIIZ = muteState;
        RTCVideoInterface rTCVideoInterface = null;
        this.LJIIJJI = null;
        this.LJIL = false;
        this.LJJ = 1.0d;
        this.LJJIFFI = 2.0f;
        this.LJJII = new C1275120jHq(new C1275790jIv(this));
        this.LJIJI = c1269340j8W;
        this.LJIJJ = abstractC1273900jFs;
        abstractC1273900jFs.LJJIIJZLJL();
        this.LJIILJJIL = str;
        this.LJIIJJI = new C1279520jOw(null, this);
        this.LJIIL = context;
        this.LJFF = C807400Vlq.LJFF(new ThreadFactory() { // from class: X.0jIE
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                this.LL.LJI = new BPEAThread(runnable);
                ThreadMethodProxy.setName(this.LL.LJI, "live-rtc-worker-thread");
                this.LL.LJI.setDaemon(C786410Ut5.u3().isDaemon());
                return this.LL.LJI;
            }
        });
        if (c1269340j8W.LJJIZ() && TextUtils.isEmpty(c1269340j8W.LJLJI.LJJIL.LIZIZ)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("RTCEngineWrapper() initAnchorNetPusher, anchorNetUrls =");
            sbLIZ.append(list);
            AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ), null);
            if (list != null && list.size() > 0) {
                abstractC1273900jFs.LJJLIIIJLJLI(list);
            }
        }
        if (!c1269340j8W.LJJIZ()) {
            c1269340j8W.LIZ.mPushBase.getClass();
            if (!c1269340j8W.LJLJI.LJJIZ) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("RTCEngineWrapper() initRtmpPusher, Urls =");
                sbLIZ2.append(list);
                AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ2), null);
                if (list != null && list.size() > 0) {
                    abstractC1273900jFs.LJJLIIIJLJLI(list);
                }
            }
        }
        LJJ(str, "constructor");
        if (LJJIIZI() && c1269340j8W.LJI != null) {
            if (LIZ()) {
                Object objLJJIIJ = c1269340j8W.LJI.LJJIIJ();
                if (!(objLJJIIJ instanceof RTCVideoInterface) || (rTCVideoInterface = (RTCVideoInterface) objLJJIIJ) == null) {
                    C1267520j5a.LIZIZ("Fatal Error: Get pusherRtcVideo return null");
                }
                this.LJIILL = rTCVideoInterface;
                String strOptString = jSONObject.optString("rtc.ab_label", "");
                if (!TextUtils.isEmpty(strOptString)) {
                    try {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("rtc.ab_label", strOptString);
                        rTCVideoInterface.setRuntimeParameters(jSONObject2);
                    } catch (JSONException e) {
                        TryCatchGuardChecker.doCheck(e);
                    }
                }
            } else if (LJJIIZ()) {
                GLESVersion gLESVersion2 = GLThreadManager.getConfigGLVersion() == 3 ? GLESVersion.GLES_VERSION_3 : GLESVersion.GLES_VERSION_2;
                String strLJIIJ = LJIIJ(str);
                InterfaceC1266360j3i interfaceC1266360j3i = c1269340j8W.LJI;
                JSONObject jSONObject3 = (interfaceC1266360j3i == null || (jSONObject3 = interfaceC1266360j3i.LJJIIZI()) == null) ? new JSONObject() : jSONObject3;
                try {
                    if (!jSONObject3.has("rtc.capture_pipeline_stage")) {
                        LiveSdkSetting liveSdkSetting = c1269340j8W.LIZ;
                        if (liveSdkSetting != null) {
                            iLJIJJ = liveSdkSetting.LJIJJ();
                        } else {
                            iLJIJJ = -1;
                        }
                        jSONObject3.put("rtc.capture_pipeline_stage", iLJIJJ);
                    }
                } catch (Exception e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                this.LJIILL = RTCVideo.createRTCVideoV2(context, strLJIIJ, null, obj, gLESVersion2, jSONObject3);
            } else {
                Object objLJJIIJ2 = c1269340j8W.LJI.LJJIIJ();
                if (!(objLJJIIJ2 instanceof RTCVideoInterface) || (rTCVideoInterface = (RTCVideoInterface) objLJJIIJ2) == null) {
                    C1267520j5a.LIZIZ("Fatal Error: Get pusherRtcVideo return null");
                }
                this.LJIILL = rTCVideoInterface;
                String strOptString2 = jSONObject.optString("rtc.ab_label", "");
                if (!TextUtils.isEmpty(strOptString2)) {
                    try {
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("rtc.ab_label", strOptString2);
                        rTCVideoInterface.setRuntimeParameters(jSONObject4);
                    } catch (JSONException e3) {
                        TryCatchGuardChecker.doCheck(e3);
                    }
                }
            }
        } else {
            try {
                if ((c1275030jHh != null ? c1275030jHh.LJIIL : EnumC1274430jGj.GUEST) == EnumC1274430jGj.ANCHOR) {
                    str2 = "host";
                } else {
                    str2 = "guest";
                }
                jSONObject.put("rtc.access_group_id", this.LJ.LIZLLL);
                jSONObject.put("rtc.live_role", str2);
                jSONObject.put("rtc.in_anchor_net", LJIILLIIL());
                if (c1269340j8W.LJLJI.LJJLI != EnumC1267980j6K.GAME_LIVE && !c1269340j8W.LJJIIZI) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put("rtc.live_type", i);
                if (c1269340j8W.LJJJJI) {
                    jSONObject.put("rtc.enable_log_callback", true);
                }
                c1269340j8W.LIZ.mPushBase.getClass();
                if (c1269340j8W.LIZ.ttlhABSettingsConfigs.LJIIIIZZ()) {
                    jSONObject.put("rtc.enable_remove_scene_none", true);
                }
                if (c1269340j8W.LIZ.ttlhABSettingsConfigs.LJIJI() >= 0) {
                    jSONObject.put("rtc.video_strategy_active_scene", c1269340j8W.LIZ.ttlhABSettingsConfigs.LJIJI());
                }
                if (C1276090jJP.LIZJ) {
                    jSONObject.put("rtc.enable_pre_get_config", true);
                }
                jSONObject.put("rtc.enable_down_native_render", c1269340j8W.LIZ.ttlhABSettingsConfigs.LJ());
            } catch (JSONException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            GLESVersion gLESVersion3 = GLESVersion.GLES_VERSION_UNKNOWN;
            if (GLThreadManager.isDynamicGLVersionEnable()) {
                int configGLVersion = GLThreadManager.getConfigGLVersion();
                gLESVersion = GLESVersion.GLES_VERSION_2;
                if (configGLVersion == 3) {
                    gLESVersion = GLESVersion.GLES_VERSION_3;
                }
            } else {
                gLESVersion = gLESVersion3;
            }
            if (!LJIILL() && !this.LJIJI.LIZ.LJIIJJI()) {
                if (gLESVersion != gLESVersion3) {
                    this.LJIILL = RTCVideo.createRTCVideo(context, LJIIJ(str), null, obj, gLESVersion, jSONObject);
                } else {
                    this.LJIILL = RTCVideo.createRTCVideo(context, LJIIJ(str), null, obj, jSONObject);
                }
            } else {
                this.LJIILL = RTCVideo.createRTCVideoV2(context, LJIIJ(str), null, obj, gLESVersion, jSONObject);
            }
        }
        JSONObject jSONObject5 = new JSONObject();
        try {
            jSONObject5.put("rtcEngine", this.LJIILL);
        } catch (JSONException e5) {
            TryCatchGuardChecker.doCheck(e5);
        }
        AVLog.logApiCall("RTCInteractAPI", "RTCEngineWrapper constructor", jSONObject5);
        RTCVideoInterface rTCVideoInterface2 = this.LJIILL;
        if (rTCVideoInterface2 == null) {
            return;
        }
        rTCVideoInterface2.setRtcVideoEventHandler(this.LJIIJJI);
        String str3 = System.getenv("K_BYTERTC_DEVICE_ID");
        if (str3 != null && (context2 = this.LJIIL) != null) {
            C810670Vr7.LIZJ(context2, 0, "interact").edit().putString("rtc_device_id", str3).apply();
        }
        this.LJIIJ = new RTCPhoneStateListener(context, this);
        IVideoStrategyRunner iVideoStrategyRunnerLLILLJJLI = this.LJIJJ.LLILLJJLI();
        if (iVideoStrategyRunnerLLILLJJLI != null) {
            this.LJIILL.setVideoStrategyRunner(iVideoStrategyRunnerLLILLJJLI);
        }
        LJJIII = true;
    }
}
