package X;

import Y.ARunnableS0S0002000_20;
import Y.ARunnableS4S0101100_20;
import Y.ARunnableS4S1101100_20;
import Y.ARunnableS53S0300000_20;
import Y.ARunnableS5S1100100_20;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.avframework.livestreamv2.core.interact.video.render.LyraxVideoRendererWrapper;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.VideoStreamDescription;
import com.ss.bytertc.engine.data.AudioRoute;
import com.ss.bytertc.engine.data.LocalAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.RemoteVideoConfig;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.data.VideoFrameInfo;
import com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter;
import com.ss.bytertc.engine.type.FirstFramePlayState;
import com.ss.bytertc.engine.type.FirstFrameSendState;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStats;
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
import com.ss.bytertc.engine.utils.LogUtil;
import com.ss.ttlivestreamer.core.utils.AVLog;
import com.ss.ttlivestreamer.livestreamv2.sdkparams.PushBase;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jHS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1274880jHS extends IRTCVideoEventHandlerAdapter {
    public final /* synthetic */ C1274810jHL LIZ;

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onNetworkTimeSynchronized() {
        C1274810jHL c1274810jHL = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274810jHL.LJJLI;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274810jHL, 26, 0L, 0L, new Object[0]);
        }
        AVLog.ioi("ClientImpl", "onNetworkTimeSynchronized");
    }

    public C1274880jHS(C1274810jHL c1274810jHL) {
        this.LIZ = c1274810jHL;
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onAudioProfanityDetectedCallback(String str) {
        C1274810jHL c1274810jHL = this.LIZ;
        C1274700jHA c1274700jHA = c1274810jHL.LJZL;
        if (c1274700jHA != null) {
            c1274700jHA.LIZ(c1274810jHL, 50, 0L, 0L, str);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onAudioRouteChanged(AudioRoute audioRoute) {
        if (audioRoute != null) {
            AVLog.debugTrace(audioRoute.toString());
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onError(int i) {
        AVLog.debugTrace(Integer.valueOf(i));
        C1274810jHL c1274810jHL = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onError, code: ");
        sbLIZ.append(i);
        c1274810jHL.LJZL.LIZIZ(c1274810jHL, -3, i, 0L, new Exception(C2188811AlT.LIZIZ(sbLIZ)));
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onFirstLocalAudioFrame(StreamIndex streamIndex) {
        AVLog.debugTrace(0);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onFirstRemoteAudioFrame(StreamKey streamKey) {
        AVLog.debugTrace(streamKey.getUserId(), streamKey.getRoomId());
        if (streamKey.getUserId().equals(this.LIZ.LJJJLZIJ)) {
            AVLog.iow("ClientImpl", "Received my onFirstRemoteAudioFrame");
            return;
        }
        this.LIZ.LJIIIIZZ.LJIIL(streamKey.getUserId(), true);
        String str = InterfaceC1269080j86.LIZ;
        C1274810jHL c1274810jHL = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274810jHL.LJJLI;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274810jHL, 10, 0L, 0L, streamKey.getUserId(), str);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onHardwareROISupportStateUpdated(boolean z) {
        C1274890jHT c1274890jHT;
        boolean z2;
        C1275120jHq c1275120jHq;
        C1272000jCo c1272000jCo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHardwareROISupportStateUpdated, isSupported:");
        sbLIZ.append(z);
        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        if (z) {
            C1274810jHL c1274810jHL = this.LIZ;
            if (c1274810jHL.LJJIL) {
                c1274810jHL.LJLJL.LLIIJLIL(z, EnumC1272290jDH.ROI_SWITCH_REASON_HARDWARE_SUPPORT);
                C1274810jHL c1274810jHL2 = this.LIZ;
                PushBase.HardwareRoi hardwareRoi = c1274810jHL2.LJLJJL;
                if (hardwareRoi != null && (c1274890jHT = c1274810jHL2.LJI) != null) {
                    boolean z3 = hardwareRoi.enable;
                    double d = hardwareRoi.roiBitrateRatio;
                    boolean z4 = false;
                    if (c1274890jHT.LJIL == z3 && c1274890jHT.LJJ == d) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("updateRoiStatus enable:");
                    sbLIZ2.append(z3);
                    sbLIZ2.append(", roiBitrateRatio: ");
                    sbLIZ2.append(d);
                    sbLIZ2.append(", hasStatusChanged: ");
                    sbLIZ2.append(z2);
                    AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ2), null);
                    c1274890jHT.LJIL = z3;
                    c1274890jHT.LJJ = d;
                    if (z2 && (c1275120jHq = c1274890jHT.LJJII) != null && c1275120jHq.LIZLLL != null) {
                        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                        sbLIZ3.append("replayLatestVideoEncoderSettingPath mCurrentPath:");
                        sbLIZ3.append(c1275120jHq.LIZ.getPathName());
                        sbLIZ3.append(",lastTs: ");
                        sbLIZ3.append(c1275120jHq.LJ);
                        AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ3), null);
                        int i = C1275300jI8.LIZ[c1275120jHq.LIZ.ordinal()];
                        if (i != 1) {
                            if (i == 2 && ((ArrayList) c1275120jHq.LIZIZ).size() >= 1 && (ListProtector.get(c1275120jHq.LIZIZ, 0) instanceof C1271990jCn[])) {
                                c1275120jHq.LJI = true;
                                ((C1275790jIv) c1275120jHq.LIZLLL).LIZ.LJJI((C1271990jCn[]) ListProtector.get(c1275120jHq.LIZIZ, 0));
                                c1275120jHq.LJI = false;
                            } else {
                                return;
                            }
                        } else {
                            c1275120jHq.LJI = true;
                            ((C1275790jIv) c1275120jHq.LIZLLL).LIZ.LJ();
                            c1275120jHq.LJI = false;
                        }
                        if (c1275120jHq.LJFF > c1275120jHq.LJ && (c1272000jCo = c1275120jHq.LIZJ) != null) {
                            c1275120jHq.LJII = true;
                            ((C1275790jIv) c1275120jHq.LIZLLL).LIZ.LJJIFFI(c1272000jCo);
                            c1275120jHq.LJII = false;
                            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                            sbLIZ4.append("replayLatestVideoEncoderSettingPath mPerfConfig:");
                            sbLIZ4.append(c1275120jHq.LIZJ.toString());
                            AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ4), null);
                            return;
                        }
                        StringBuilder sbLIZ5 = C2188811AlT.LIZ();
                        sbLIZ5.append("not replayLatestVideoEncoderSettingPath perfConfig valid:");
                        if (c1275120jHq.LIZJ != null) {
                            z4 = true;
                        }
                        sbLIZ5.append(z4);
                        sbLIZ5.append(",lastPerfTs: ");
                        sbLIZ5.append(c1275120jHq.LJFF);
                        sbLIZ5.append(",lastEncSetTs: ");
                        sbLIZ5.append(c1275120jHq.LJ);
                        AVLog.logKibana(4, "RTCEngineWrapper", C2188811AlT.LIZIZ(sbLIZ5), null);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        StringBuilder sbLIZ6 = C2188811AlT.LIZ();
        sbLIZ6.append("onHardwareROISupportStateUpdated, isSupported:");
        sbLIZ6.append(z);
        sbLIZ6.append(", mClientStarted:");
        sbLIZ6.append(this.LIZ.LJJIL);
        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ6), null);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLocalAudioPropertiesReport(LocalAudioPropertiesInfo[] localAudioPropertiesInfoArr) {
        boolean z;
        boolean z2;
        int i;
        for (int i2 = 0; i2 < localAudioPropertiesInfoArr.length; i2++) {
            LocalAudioPropertiesInfo localAudioPropertiesInfo = localAudioPropertiesInfoArr[i2];
            if (localAudioPropertiesInfo.streamIndex == StreamIndex.STREAM_INDEX_MAIN) {
                C1274810jHL c1274810jHL = this.LIZ;
                int i3 = c1274810jHL.LJIILJJIL.LJIL;
                if (i3 <= 0) {
                    i3 = 30;
                }
                String[] strArr = new String[1];
                boolean[] zArr = new boolean[1];
                int[] iArr = new int[1];
                int i4 = localAudioPropertiesInfo.audioPropertiesInfo.linearVolume;
                c1274810jHL.getClass();
                if (i4 > i3) {
                    z = true;
                } else {
                    z = false;
                }
                c1274810jHL.LJJLIIIJJIZ = z;
                String str = c1274810jHL.LJJJLZIJ;
                strArr[0] = str;
                zArr[0] = z;
                iArr[0] = i4;
                boolean zLJLLL = c1274810jHL.LJLLL(str);
                C1274810jHL c1274810jHL2 = this.LIZ;
                boolean z3 = c1274810jHL2.LJJLIIIJJIZ;
                if (zLJLLL != z3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                ((ConcurrentHashMap) c1274810jHL2.LJJIJL).put(c1274810jHL2.LJJJLZIJ, Boolean.valueOf(z3));
                C1274810jHL c1274810jHL3 = this.LIZ;
                C1275090jHn c1275090jHn = c1274810jHL3.LJJLL;
                if (c1275090jHn != null && c1274810jHL3.LJJLJLI.enable && (i = localAudioPropertiesInfoArr[i2].audioPropertiesInfo.vad) >= 0) {
                    C786410Ut5.LJJZZIII(c1275090jHn.LLILLJJLI, new ARunnableS4S0101100_20(c1275090jHn, i, 2));
                }
                if (!this.LIZ.LJI.LJJIIZI() && !this.LIZ.LJIJJLI.LIZLLL()) {
                    this.LIZ.LJIILJJIL.getClass();
                    if (z2) {
                        this.LIZ.LLIIJI(false, false);
                    }
                }
                C1274810jHL c1274810jHL4 = this.LIZ;
                InterfaceC1274710jHB interfaceC1274710jHB = c1274810jHL4.LJJLI;
                if (interfaceC1274710jHB != null) {
                    interfaceC1274710jHB.LIZ(c1274810jHL4, 9, 0L, 0L, strArr, zArr, iArr);
                }
            }
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onNetworkTypeChanged(int i) {
        AVLog.debugTrace(Integer.valueOf(i));
        C1274810jHL c1274810jHL = this.LIZ;
        C1274290jGV c1274290jGV = c1274810jHL.LJIIIZ.LIZ;
        if (c1274290jGV != null) {
            c1274290jGV.LJIILJJIL = i;
        }
        C1274830jHN c1274830jHN = c1274810jHL.LJIIIIZZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c1274830jHN.getClass();
        C1274690jH9.LJ(new ARunnableS5S1100100_20(strLIZIZ, System.currentTimeMillis(), c1274830jHN, 4));
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onSimulcastSubscribeFallback(RemoteStreamSwitch remoteStreamSwitch) {
        AVLog.debugTrace(new Object[0]);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onWarning(int i) {
        AVLog.debugTrace(Integer.valueOf(i));
        C1274830jHN c1274830jHN = this.LIZ.LJIIIIZZ;
        c1274830jHN.getClass();
        C1274690jH9.LJ(new ARunnableS4S1101100_20(c1274830jHN, System.currentTimeMillis(), i, 3));
        C1274810jHL c1274810jHL = this.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onWarning, code: ");
        sbLIZ.append(i);
        c1274810jHL.LJZL.LIZ(c1274810jHL, 6, i, 0L, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onConnectionStateChanged(int i, int i2) {
        AVLog.debugTrace(Integer.valueOf(i), Integer.valueOf(i2));
        C1274810jHL c1274810jHL = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274810jHL.LJJLI;
        c1274810jHL.LJIILIIL = i;
        C1274690jH9.LJ(new ARunnableS0S0002000_20(i, i2, 1));
        if (interfaceC1274710jHB != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onConnectionStateChanged: state ");
            sbLIZ.append(i);
            sbLIZ.append(", reason ");
            sbLIZ.append(i2);
            interfaceC1274710jHB.LIZ(this.LIZ, 37, i, 0L, C2188811AlT.LIZIZ(sbLIZ));
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onFirstLocalVideoFrameCaptured(StreamIndex streamIndex, VideoFrameInfo videoFrameInfo) {
        AVLog.debugTrace(Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onFirstRemoteVideoFrameDecoded(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        AVLog.debugTrace(streamKey.getUserId(), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()), 0);
        AVLog.ioi("ClientImpl", "onFirstRemoteVideoFrame");
        if (streamKey.getUserId().equals(this.LIZ.LJJJLZIJ)) {
            AVLog.iow("ClientImpl", "Received my onFirstRemoteVideoFrame");
            return;
        }
        if (streamKey.getStreamIndex().value() >= StreamIndex.STREAM_INDEX_2ND.value()) {
            this.LIZ.LJJZZIII(streamKey.getUserId(), streamKey.getStreamIndex());
            this.LIZ.LJIJJLI(streamKey.getStreamIndex(), streamKey.getUserId(), true);
        }
        this.LIZ.LJIIIIZZ.LJIIL(streamKey.getUserId(), false);
        this.LIZ.LJIIIIZZ.LJIILIIL(streamKey.getUserId());
        if (!((ConcurrentHashMap) this.LIZ.LJJIJIIJI).containsKey(streamKey.getUserId())) {
            ((ConcurrentHashMap) this.LIZ.LJJIJIIJI).put(streamKey.getUserId(), Long.valueOf(System.currentTimeMillis()));
        }
        C1274810jHL c1274810jHL = this.LIZ;
        if (!c1274810jHL.LLIIL() && c1274810jHL.LJJ == null) {
            ARunnableS53S0300000_20 aRunnableS53S0300000_20 = new ARunnableS53S0300000_20(this, streamKey, videoFrameInfo, 55);
            C1267500j5Y c1267500j5Y = this.LIZ.LJLIIL;
            if (c1267500j5Y != null && c1267500j5Y.LIZ.LJIILJJIL()) {
                C1274690jH9.LJFF(aRunnableS53S0300000_20);
                return;
            } else {
                aRunnableS53S0300000_20.run();
                return;
            }
        }
        C1274690jH9.LJFF(new ARunnableS53S0300000_20(this, streamKey, videoFrameInfo, 52));
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onFirstRemoteVideoFrameRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        C1274810jHL c1274810jHL = this.LIZ;
        C1274890jHT c1274890jHT = c1274810jHL.LJI;
        if ((c1274890jHT == null || !c1274890jHT.isLyraxFrameEnabled()) && !c1274810jHL.LLIIL()) {
            return;
        }
        String userId = streamKey.getUserId();
        this.LIZ.LJIIIIZZ.LJIILJJIL(userId);
        if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN) {
            this.LIZ.LLFF.LIZ(videoFrameInfo.getWidth(), videoFrameInfo.getHeight(), userId);
        } else {
            if (this.LIZ.LJJIIJZLJL == null) {
                return;
            }
            this.LIZ.LLFF.LIZIZ(videoFrameInfo.getWidth(), videoFrameInfo.getHeight(), userId, C1274940jHY.LJ(streamKey.getStreamIndex().value(), userId));
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLocalStreamStats(StreamIndex streamIndex, LocalStreamStats localStreamStats) {
        C1274940jHY c1274940jHY;
        C1275340jIC c1275340jIC;
        if (streamIndex.value() > StreamIndex.STREAM_INDEX_2ND.value() && (c1274940jHY = this.LIZ.LJJIIJZLJL) != null) {
            String strLJ = C1274940jHY.LJ(streamIndex.value(), c1274940jHY.LIZIZ);
            InterfaceC1275920jJ8 interfaceC1275920jJ8 = c1274940jHY.LIZLLL;
            LocalVideoStats localVideoStats = localStreamStats.videoStats;
            C1275550jIX c1275550jIX = ((C1274990jHd) interfaceC1275920jJ8).LIZIZ;
            if (c1275550jIX != null && (c1275340jIC = (C1275340jIC) ((ConcurrentHashMap) c1275550jIX.LIZ).get(strLJ)) != null) {
                c1275340jIC.LIZ = localVideoStats.sentKBitrate;
                c1275340jIC.LIZIZ = localVideoStats.sentFrameRate;
                c1275340jIC.LIZJ = localVideoStats.encodedFrameWidth;
                c1275340jIC.LIZLLL = localVideoStats.encodedFrameHeight;
                c1275340jIC.LJ = localVideoStats.isHardwareCodec;
                c1275340jIC.LJFF = localVideoStats.codecType;
            }
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLogReport(String str, JSONObject jSONObject) {
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZ.LIZLLL.LIZIZ.LIZ();
        if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LLD().LJJJJI) {
            abstractC1273900jFsLIZ.LLJJIJI(jSONObject);
        }
        this.LIZ.LIZLLL.LJIILJJIL(str, jSONObject);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteAudioPropertiesReport(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
        boolean z;
        String str;
        C1274990jHd c1274990jHd = this.LIZ.LJIIIZ;
        if (c1274990jHd == null) {
            return;
        }
        C1274910jHV c1274910jHV = c1274990jHd.LIZJ;
        if (c1274910jHV != null) {
            c1274910jHV.onAudioVolumeIndication(remoteAudioPropertiesInfoArr, i);
        }
        int length = remoteAudioPropertiesInfoArr.length;
        String[] strArr = new String[length];
        boolean[] zArr = new boolean[length];
        int[] iArr = new int[length];
        int i2 = this.LIZ.LJIILJJIL.LJIL;
        if (i2 <= 0) {
            i2 = 30;
        }
        boolean z2 = false;
        for (int i3 = 0; i3 < length; i3++) {
            RemoteAudioPropertiesInfo remoteAudioPropertiesInfo = remoteAudioPropertiesInfoArr[i3];
            String userId = remoteAudioPropertiesInfo.streamKey.getUserId();
            if (remoteAudioPropertiesInfo.streamKey.getStreamIndex().value() > StreamIndex.STREAM_INDEX_MAIN.value() && this.LIZ.LJJIIJZLJL != null) {
                userId = C1274940jHY.LJ(remoteAudioPropertiesInfo.streamKey.getStreamIndex().value(), remoteAudioPropertiesInfo.streamKey.getUserId());
            }
            int i4 = remoteAudioPropertiesInfo.audioPropertiesInfo.linearVolume;
            if (i4 >= i2) {
                z = true;
            } else {
                z = false;
            }
            strArr[i3] = userId;
            zArr[i3] = z;
            iArr[i3] = i4;
            if (this.LIZ.LJLLL(userId) != z) {
                z2 = true;
            }
            ((ConcurrentHashMap) this.LIZ.LJJIJL).put(userId, Boolean.valueOf(z));
            if (z2) {
                Object[] objArr = new Object[1];
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(userId);
                sbLIZ.append(" is ");
                if (z) {
                    str = "talking";
                } else {
                    str = "not talking";
                }
                sbLIZ.append(str);
                objArr[0] = C2188811AlT.LIZIZ(sbLIZ);
                AVLog.debugTrace(objArr);
            }
        }
        if (!this.LIZ.LJI.LJJIIZI() && !this.LIZ.LJIJJLI.LIZLLL()) {
            this.LIZ.LJIILJJIL.getClass();
            if (z2) {
                this.LIZ.LLIIJI(false, false);
            }
        }
        C1274810jHL c1274810jHL = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274810jHL.LJJLI;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274810jHL, 9, 0L, 0L, strArr, zArr, iArr);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteStreamStats(StreamKey streamKey, RemoteStreamStats remoteStreamStats) {
        C1274910jHV c1274910jHV;
        if (streamKey.getStreamIndex().value() >= StreamIndex.STREAM_INDEX_2ND.value() && (c1274910jHV = this.LIZ.LJIIIZ.LIZJ) != null) {
            c1274910jHV.onRemoteAuxStreamVideoStats(streamKey, remoteStreamStats);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteVideoFrameRelRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN) {
            C1274810jHL c1274810jHL = this.LIZ;
            C1274890jHT c1274890jHT = c1274810jHL.LJI;
            if ((c1274890jHT == null || !c1274890jHT.isLyraxFrameEnabled()) && !c1274810jHL.LLIIL()) {
                this.LIZ.LLIIII(videoFrameInfo.getWidth(), videoFrameInfo.getHeight(), streamKey.getUserId());
            } else {
                C1274900jHU c1274900jHU = this.LIZ.LLFF;
                String userId = streamKey.getUserId();
                c1274900jHU.LIZ.LLIIII(videoFrameInfo.getWidth(), videoFrameInfo.getHeight(), userId);
            }
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteVideoFrameRendered(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        C1274990jHd c1274990jHd = this.LIZ.LJIIIZ;
        String userId = streamKey.getUserId();
        C1274910jHV c1274910jHV = c1274990jHd.LIZJ;
        if (c1274910jHV != null) {
            c1274910jHV.onRemoteVideoRendered(userId);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteVideoInfoChanged(StreamKey streamKey, RTCStream rTCStream) {
        super.onRemoteVideoInfoChanged(streamKey, rTCStream);
        this.LIZ.getClass();
        for (int i = 0; i < rTCStream.videoStreamDescriptions.size(); i++) {
            ListProtector.get(rTCStream.videoStreamDescriptions, i);
        }
        VideoStreamDescription videoStreamDescription = (VideoStreamDescription) ListProtector.get(rTCStream.videoStreamDescriptions, r1.size() - 1);
        RemoteVideoConfig remoteVideoConfig = new RemoteVideoConfig(((Integer) videoStreamDescription.videoSize.first).intValue(), ((Integer) videoStreamDescription.videoSize.second).intValue(), videoStreamDescription.frameRate);
        C1274890jHT c1274890jHT = this.LIZ.LJI;
        if (c1274890jHT != null) {
            c1274890jHT.setRemoteVideoConfig(streamKey.getUserId(), remoteVideoConfig);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteVideoSizeChanged(StreamKey streamKey, VideoFrameInfo videoFrameInfo) {
        AVLog.debugTrace(streamKey.getUserId(), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
        C1274810jHL c1274810jHL = this.LIZ;
        c1274810jHL.LJZL.LIZ(c1274810jHL, 19, 0L, 0L, streamKey.getUserId(), Integer.valueOf(videoFrameInfo.getWidth()), Integer.valueOf(videoFrameInfo.getHeight()));
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onSEIStreamUpdate(StreamKey streamKey, SEIStreamUpdateEvent sEIStreamUpdateEvent) {
        boolean z;
        if (this.LIZ.LIZLLL.LIZIZ.LIZ() != null) {
            String userId = streamKey.getUserId();
            if (sEIStreamUpdateEvent == SEIStreamUpdateEvent.STREAM_ADD) {
                z = true;
            } else {
                z = false;
            }
            if (this.LIZ.LLIIL()) {
                C1274810jHL c1274810jHL = this.LIZ;
                c1274810jHL.getClass();
                if (streamKey.getStreamIndex() == StreamIndex.STREAM_INDEX_MAIN) {
                    String strLJJII = c1274810jHL.LJJII(streamKey);
                    if (!TextUtils.isEmpty(strLJJII)) {
                        if (z) {
                            ((ConcurrentHashMap) c1274810jHL.LJJJLIIL).put(strLJJII, Boolean.TRUE);
                        } else {
                            ((ConcurrentHashMap) c1274810jHL.LJJJLIIL).remove(strLJJII);
                        }
                        LyraxVideoRendererWrapper lyraxVideoRendererWrapperLLII = c1274810jHL.LLII(streamKey);
                        if (lyraxVideoRendererWrapperLLII != null) {
                            lyraxVideoRendererWrapperLLII.LJJIJIIJIL = z;
                        }
                    }
                }
            }
            C1274810jHL c1274810jHL2 = this.LIZ;
            if (c1274810jHL2.LJJ != null) {
                C1274860jHQ c1274860jHQ = (C1274860jHQ) ((ConcurrentHashMap) c1274810jHL2.LJJIFFI).get(userId);
                if (c1274860jHQ != null) {
                    c1274860jHQ.LJFF = z;
                }
                C1274830jHN c1274830jHN = this.LIZ.LJIIIIZZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("");
                sbLIZ.append(this);
                sbLIZ.append("onlyConsumeSei");
                sbLIZ.append(z);
                c1274830jHN.LJIIIIZZ("onSEIStreamUpdate", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onUserStartAudioCapture(String str, String str2) {
        AVLog.debugTrace(str2, Boolean.TRUE);
        this.LIZ.LJIIIIZZ.LJIILLIIL(1, "onUserStartAudioCapture", str2);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onUserStartVideoCapture(String str, String str2) {
        AVLog.debugTrace(str2, Boolean.TRUE);
        this.LIZ.LJIIIIZZ.LJIILLIIL(1, "onUserStartVideoCapture", str2);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onUserStopAudioCapture(String str, String str2) {
        AVLog.debugTrace(str2, Boolean.FALSE);
        this.LIZ.LJIIIIZZ.LJIILLIIL(0, "onUserStopAudioCapture", str2);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onUserStopVideoCapture(String str, String str2) {
        AVLog.debugTrace(str2, Boolean.FALSE);
        this.LIZ.LJIIIIZZ.LJIILLIIL(0, "onUserStopVideoCapture", str2);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLocalVideoStateChanged(StreamIndex streamIndex, LocalVideoStreamState localVideoStreamState, LocalVideoStreamError localVideoStreamError) {
        AVLog.debugTrace(localVideoStreamState, localVideoStreamError);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onLoggerMessage(LogUtil.LogLevel logLevel, String str, Throwable th) {
        int i = C1276390jJt.LIZJ[logLevel.ordinal()];
        int i2 = 2;
        if (i != 1) {
            if (i != 2) {
                i2 = 4;
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return;
                        } else {
                            i2 = 6;
                        }
                    } else {
                        i2 = 5;
                    }
                }
            } else {
                i2 = 3;
            }
        }
        InterfaceC1269880j9O logIODevice = AVLog.getLogIODevice();
        if (logIODevice != null && i2 >= 6) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(e3.e);
            sbLIZ.append(i2);
            sbLIZ.append("] ");
            sbLIZ.append(str);
            logIODevice.LIZ(5, "BYTE_RTC", C2188811AlT.LIZIZ(sbLIZ), th);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onRemoteVideoStateChanged(StreamKey streamKey, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        AVLog.debugTrace(streamKey.getUserId(), remoteVideoState);
        C1274990jHd c1274990jHd = this.LIZ.LJIIIZ;
        String userId = streamKey.getUserId();
        C1274910jHV c1274910jHV = c1274990jHd.LIZJ;
        if (c1274910jHV != null) {
            c1274910jHV.onRemoteVideoStateChanged(userId, remoteVideoState, remoteVideoStateChangeReason);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onVideoFramePlayStateChanged(StreamKey streamKey, String str, FirstFramePlayState firstFramePlayState) {
        StreamIndex streamIndex = streamKey.getStreamIndex();
        if (streamIndex.value() > StreamIndex.STREAM_INDEX_MAIN.value() && streamIndex.value() < StreamIndex.STREAM_INDEX_MAX.value()) {
            this.LIZ.LJJZZIII(streamKey.getUserId(), streamKey.getStreamIndex());
            this.LIZ.LJIJJLI(streamKey.getStreamIndex(), streamKey.getUserId(), true);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onVideoFrameSendStateChanged(String str, RtcUser rtcUser, FirstFrameSendState firstFrameSendState) {
        super.onVideoFrameSendStateChanged(str, rtcUser, firstFrameSendState);
        this.LIZ.LJIJJLI.getClass();
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onPerformanceAlarms(PerformanceAlarmMode performanceAlarmMode, String str, PerformanceAlarmReason performanceAlarmReason, SourceWantedData sourceWantedData) {
        PerformanceAlarmReason performanceAlarmReason2;
        boolean z;
        C1268130j6Z c1268130j6Z;
        boolean z2;
        AVLog.debugTrace(new Object[0]);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onPerformanceAlarms() called with: mode = [");
        sbLIZ.append(performanceAlarmMode);
        sbLIZ.append("], roomId = [");
        sbLIZ.append(str);
        sbLIZ.append("], reason = [");
        sbLIZ.append(performanceAlarmReason);
        sbLIZ.append("], data = [");
        sbLIZ.append(sourceWantedData);
        sbLIZ.append(e3.f);
        AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        AbstractC1273900jFs abstractC1273900jFsLIZ = this.LIZ.LIZLLL.LIZIZ.LIZ();
        if (abstractC1273900jFsLIZ != null && abstractC1273900jFsLIZ.LLILZLL() && (c1268130j6Z = this.LIZ.LLFFF) != null) {
            PerformanceAlarmReason performanceAlarmReason3 = PerformanceAlarmReason.BANDWIDTH_FALLBACKED;
            if (performanceAlarmReason == performanceAlarmReason3 || performanceAlarmReason == PerformanceAlarmReason.BANDWIDTH_RESUMED) {
                if (performanceAlarmReason == performanceAlarmReason3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                int i = sourceWantedData.width;
                int i2 = sourceWantedData.height;
                int i3 = sourceWantedData.frameRate;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("onRTCBandwidthAlarm isDowngrade:");
                sbLIZ2.append(z2);
                sbLIZ2.append(" width:");
                sbLIZ2.append(i);
                sbLIZ2.append(" height:");
                sbLIZ2.append(i2);
                sbLIZ2.append(" fps:");
                sbLIZ2.append(i3);
                AVLog.logKibana(4, "LinkMicVideoParamsManagerLog", C2188811AlT.LIZIZ(sbLIZ2), null);
                c1268130j6Z.LJJII = c1268130j6Z.LIZLLL(i, i2);
            }
        } else {
            InterfaceC1274230jGP interfaceC1274230jGPLJLLI = this.LIZ.LJLLI();
            if (interfaceC1274230jGPLJLLI != null && performanceAlarmReason != PerformanceAlarmReason.PERFORMANCE_FALLBACKED && performanceAlarmReason != PerformanceAlarmReason.PERFORMANCE_RESUMED && (performanceAlarmReason == (performanceAlarmReason2 = PerformanceAlarmReason.BANDWIDTH_FALLBACKED) || performanceAlarmReason == PerformanceAlarmReason.BANDWIDTH_RESUMED)) {
                if (performanceAlarmReason == performanceAlarmReason2) {
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1274230jGPLJLLI.LJIIL(sourceWantedData.width, sourceWantedData.height, sourceWantedData.frameRate, z);
            }
        }
        C1274810jHL c1274810jHL = this.LIZ;
        InterfaceC1274770jHH interfaceC1274770jHH = c1274810jHL.LJJIJLIJ;
        if (interfaceC1274770jHH != null) {
            ((C1274760jHG) interfaceC1274770jHH).LIZIZ(c1274810jHL, 12, Integer.valueOf(sourceWantedData.width), Integer.valueOf(sourceWantedData.height), Integer.valueOf(sourceWantedData.frameRate));
        }
        C1274810jHL c1274810jHL2 = this.LIZ;
        C1274700jHA c1274700jHA = c1274810jHL2.LJZL;
        if (c1274700jHA != null) {
            c1274700jHA.LIZ(c1274810jHL2, 13, 0L, 0L, Integer.valueOf(sourceWantedData.width), Integer.valueOf(sourceWantedData.height), Integer.valueOf(sourceWantedData.frameRate));
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCVideoEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCVideoEventHandler
    public final void onNetworkDetectionResult(NetworkDetectionLinkType networkDetectionLinkType, int i, int i2, double d, int i3, int i4) {
        C1274810jHL c1274810jHL = this.LIZ;
        InterfaceC1274710jHB interfaceC1274710jHB = c1274810jHL.LJJLI;
        if (interfaceC1274710jHB != null) {
            interfaceC1274710jHB.LIZ(c1274810jHL, 25, 0L, 0L, networkDetectionLinkType, Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d), Integer.valueOf(i3), Integer.valueOf(i4));
        }
    }
}
