package X;

import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SysStats;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.LocalAudioStreamError;
import com.ss.bytertc.engine.data.LocalAudioStreamState;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteAudioState;
import com.ss.bytertc.engine.data.RemoteAudioStateChangeReason;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandler;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter;
import com.ss.bytertc.engine.type.AudioDeviceType;
import com.ss.bytertc.engine.type.FirstFramePlayState;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStreamError;
import com.ss.bytertc.engine.type.LocalVideoStreamState;
import com.ss.bytertc.engine.type.NetworkDetectionLinkType;
import com.ss.bytertc.engine.type.PerformanceAlarmMode;
import com.ss.bytertc.engine.type.PerformanceAlarmReason;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteStreamSwitch;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RtcUser;
import com.ss.bytertc.engine.type.SEIStreamUpdateEvent;
import com.ss.bytertc.engine.type.SourceWantedData;
import com.ss.bytertc.engine.type.VideoDeviceType;
import com.ss.bytertc.engine.utils.LogUtil;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jOw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1279520jOw extends IRTCVideoEventHandlerAdapter {
    public final WeakReference<IRTCVideoEventHandler> LIZ;

    public final IRTCVideoEventHandler LIZ() {
        WeakReference<IRTCVideoEventHandler> weakReference = this.LIZ;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onNetworkTimeSynchronized() {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onNetworkTimeSynchronized();
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onAudioRouteChanged(AudioRoute audioRoute) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onAudioRouteChanged(audioRoute);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onError(int i) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onError(i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onFirstLocalAudioFrame(streamIndex);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onFirstRemoteAudioFrame(StreamKey streamKey) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onFirstRemoteAudioFrame(streamKey);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onHardwareROISupportStateUpdated(boolean z) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onHardwareROISupportStateUpdated(z);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onLocalAudioPropertiesReport(localAudioPropertiesInfoArr);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onNetworkTypeChanged(int i) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onNetworkTypeChanged(i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onSimulcastSubscribeFallback(remoteStreamSwitch);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onSysStats(SysStats sysStats) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onSysStats(sysStats);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onWarning(int i) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onWarning(i);
        }
    }

    public C1279520jOw(IRTCVideoEventHandler iRTCVideoEventHandler, InterfaceC1275910jJ7 interfaceC1275910jJ7) {
        this.LIZ = new WeakReference<>(iRTCVideoEventHandler);
        new WeakReference(interfaceC1275910jJ7);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onConnectionStateChanged(int i, int i2) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onConnectionStateChanged(i, i2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onFirstLocalVideoFrameCaptured(streamIndex, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onFirstRemoteVideoFrameDecoded(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onFirstRemoteVideoFrameDecoded(streamKey, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onFirstRemoteVideoFrameRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onFirstRemoteVideoFrameRendered(streamKey, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLocalAudioStateChanged(LocalAudioStreamState localAudioStreamState, LocalAudioStreamError localAudioStreamError) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onLocalAudioStateChanged(localAudioStreamState, localAudioStreamError);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLocalStreamStats(StreamIndex streamIndex, LocalStreamStats localStreamStats) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onLocalStreamStats(streamIndex, localStreamStats);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLocalVideoSizeChanged(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onLocalVideoSizeChanged(streamIndex, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLogReport(String str, JSONObject jSONObject) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onLogReport(str, jSONObject);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onRemoteAudioPropertiesReport(remoteAudioPropertiesInfoArr, i);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteStreamStats(StreamKey streamKey, RemoteStreamStats remoteStreamStats) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onRemoteStreamStats(streamKey, remoteStreamStats);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteVideoFrameRelRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onRemoteVideoFrameRelRendered(streamKey, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteVideoFrameRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onRemoteVideoFrameRendered(streamKey, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteVideoInfoChanged(StreamKey streamKey, RTCStream rTCStream) {
        super.onRemoteVideoInfoChanged(streamKey, rTCStream);
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onRemoteVideoInfoChanged(streamKey, rTCStream);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteVideoSizeChanged(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onRemoteVideoSizeChanged(streamKey, videoFrameInfo);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onSEIStreamUpdate(StreamKey streamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onSEIStreamUpdate(streamKey, sEIStreamUpdateEvent);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onUserStartAudioCapture(String str, String str2) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onUserStartAudioCapture(str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onUserStartVideoCapture(String str, String str2) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onUserStartVideoCapture(str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onUserStopAudioCapture(String str, String str2) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onUserStopAudioCapture(str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onUserStopVideoCapture(String str, String str2) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onUserStopVideoCapture(str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onLocalVideoStateChanged(streamIndex, localVideoStreamState, localVideoStreamError);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onLoggerMessage(logLevel, str, th);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteAudioStateChanged(StreamKey streamKey, RemoteAudioState remoteAudioState, RemoteAudioStateChangeReason remoteAudioStateChangeReason) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onRemoteAudioStateChanged(streamKey, remoteAudioState, remoteAudioStateChangeReason);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteVideoStateChanged(StreamKey streamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onRemoteVideoStateChanged(streamKey, remoteVideoState, remoteVideoStateChangeReason);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onVideoFramePlayStateChanged(StreamKey streamKey, String str, FirstFramePlayState firstFramePlayState) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onVideoFramePlayStateChanged(streamKey, str, firstFramePlayState);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
        super.onVideoFrameSendStateChanged(str, rtcUser, firstFrameSendState);
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onVideoFrameSendStateChanged(str, rtcUser, firstFrameSendState);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onAudioDeviceStateChanged(String str, AudioDeviceType audioDeviceType, int i, int i2) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onAudioDeviceStateChanged(str, audioDeviceType, i, i2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onPerformanceAlarms(performanceAlarmMode, str, performanceAlarmReason, sourceWantedData);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onVideoDeviceStateChanged(String str, VideoDeviceType videoDeviceType, int i, int i2) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onVideoDeviceStateChanged(str, videoDeviceType, i, i2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onNetworkDetectionResult(NetworkDetectionLinkType networkDetectionLinkType, int i, int i2, double d, int i3, int i4) {
        IRTCVideoEventHandler iRTCVideoEventHandlerLIZ = LIZ();
        if (iRTCVideoEventHandlerLIZ != null) {
            iRTCVideoEventHandlerLIZ.onNetworkDetectionResult(networkDetectionLinkType, i, i2, d, i3, i4);
        }
    }
}
