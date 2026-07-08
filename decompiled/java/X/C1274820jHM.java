package X;

import Y.ARunnableS17S0200100_20;
import Y.ARunnableS1S2100100_20;
import Y.ARunnableS2S0100200_20;
import Y.ARunnableS4S1101000_20;
import Y.ARunnableS89S0200000_20;
import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.bytertc.engine.RTCStream;
import com.ss.bytertc.engine.SubscribeConfig;
import com.ss.bytertc.engine.UserInfo;
import com.ss.bytertc.engine.VideoEncoderConfig;
import com.ss.bytertc.engine.data.AVSyncState;
import com.ss.bytertc.engine.data.ForwardStreamEventInfo;
import com.ss.bytertc.engine.data.ForwardStreamStateInfo;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter;
import com.ss.bytertc.engine.type.LocalStreamStats;
import com.ss.bytertc.engine.type.LocalVideoStats;
import com.ss.bytertc.engine.type.MediaStreamType;
import com.ss.bytertc.engine.type.NetworkQualityStats;
import com.ss.bytertc.engine.type.RTCRoomStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.StreamRemoveReason;
import com.ss.lyrax.transcoder.LyraxTranscoderFeatureEvent;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jHM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1274820jHM extends IRTCRoomEventHandlerAdapter {
    public final /* synthetic */ C1274810jHL LIZ;

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onAVSyncStateChange(AVSyncState aVSyncState) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onAudioStreamBanned(String str, boolean z) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onRoomBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onRoomError(int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onRoomWarning(int i) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onStreamAdd(RTCStream rTCStream) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onStreamRemove(RTCStream rTCStream, StreamRemoveReason streamRemoveReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onStreamStateChanged(String str, String str2, int i, String str3) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onStreamSubscribed(int i, String str, SubscribeConfig subscribeConfig) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onTokenWillExpire() {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserPublishScreen(String str, MediaStreamType mediaStreamType) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserUnpublishScreen(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onVideoStreamBanned(String str, boolean z) {
    }

    public C1274820jHM(C1274810jHL c1274810jHL) {
        this.LIZ = c1274810jHL;
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onFeatureEvent(LyraxTranscoderFeatureEvent lyraxTranscoderFeatureEvent) {
        AVLog.debugTrace(new Object[0]);
        C1274810jHL c1274810jHL = this.LIZ;
        C1274700jHA c1274700jHA = c1274810jHL.LJZL;
        if (c1274700jHA != null && lyraxTranscoderFeatureEvent != null && lyraxTranscoderFeatureEvent.eventType != null) {
            if (c1274810jHL.LJIJJLI != null) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("eventType", lyraxTranscoderFeatureEvent.eventType.value());
                    jSONObject.put("featureName", lyraxTranscoderFeatureEvent.featureName);
                    jSONObject.put("errorCode", lyraxTranscoderFeatureEvent.errorCode);
                    jSONObject.put("message", lyraxTranscoderFeatureEvent.message);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                AVLog.logApiCall("rtc_engine_api_callback", "onFeatureEvent", jSONObject);
            }
            c1274700jHA.LIZJ(this.LIZ, lyraxTranscoderFeatureEvent);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onForwardStreamEvent(ForwardStreamEventInfo[] forwardStreamEventInfoArr) {
        AVLog.debugTrace(new Object[0]);
        C1274700jHA c1274700jHA = this.LIZ.LJZL;
        if (c1274700jHA != null) {
            for (ForwardStreamEventInfo forwardStreamEventInfo : forwardStreamEventInfoArr) {
                c1274700jHA.LIZ(this.LIZ, 304, 0L, 0L, forwardStreamEventInfo.event, forwardStreamEventInfo.roomId);
            }
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onForwardStreamStateChanged(ForwardStreamStateInfo[] forwardStreamStateInfoArr) {
        AVLog.debugTrace(new Object[0]);
        C1274700jHA c1274700jHA = this.LIZ.LJZL;
        if (c1274700jHA != null) {
            for (ForwardStreamStateInfo forwardStreamStateInfo : forwardStreamStateInfoArr) {
                int i = C1276390jJt.LIZIZ[forwardStreamStateInfo.state.ordinal()];
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            c1274700jHA.LIZ(this.LIZ, 303, 0L, 0L, forwardStreamStateInfo.error, forwardStreamStateInfo.roomId);
                        }
                    } else {
                        c1274700jHA.LIZ(this.LIZ, 302, 0L, 0L, forwardStreamStateInfo.error, forwardStreamStateInfo.roomId);
                    }
                } else {
                    c1274700jHA.LIZ(this.LIZ, 301, 0L, 0L, forwardStreamStateInfo.error, forwardStreamStateInfo.roomId);
                }
            }
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onLeaveRoom(RTCRoomStats rTCRoomStats) {
        long jCurrentTimeMillis;
        AVLog.debugTrace(new Object[0]);
        C1274830jHN c1274830jHN = this.LIZ.LJIIIIZZ;
        c1274830jHN.LJIIJJI = true;
        if (c1274830jHN.LJFF != 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - c1274830jHN.LJFF;
            c1274830jHN.LJFF = 0L;
        } else {
            jCurrentTimeMillis = 0;
        }
        C1274690jH9.LJ(new ARunnableS2S0100200_20(c1274830jHN, System.currentTimeMillis(), jCurrentTimeMillis, 0));
        C1275630jIf c1275630jIfLIZIZ = this.LIZ.LJIIIZ.LIZIZ();
        if (c1275630jIfLIZIZ != null && c1275630jIfLIZIZ.LJ == 0) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            c1275630jIfLIZIZ.LJ = jCurrentTimeMillis2;
            long j = c1275630jIfLIZIZ.LIZLLL;
            if (j != 0) {
                c1275630jIfLIZIZ.LJFF = jCurrentTimeMillis2 - j;
            }
        }
        long[] jArr = new long[2];
        C1275630jIf c1275630jIfLIZIZ2 = this.LIZ.LJIIIZ.LIZIZ();
        if (c1275630jIfLIZIZ2 != null) {
            jArr[0] = c1275630jIfLIZIZ2.LIZJ;
            jArr[1] = c1275630jIfLIZIZ2.LJFF;
        }
        C1274830jHN c1274830jHN2 = this.LIZ.LJIIIIZZ;
        c1274830jHN2.getClass();
        C1274690jH9.LJ(new ARunnableS17S0200100_20(System.currentTimeMillis(), jArr, c1274830jHN2, 9));
        C1274810jHL c1274810jHL = this.LIZ;
        if (c1274810jHL.LJLLJ) {
            c1274810jHL.LJZL.LIZ(c1274810jHL, 5, 0L, 0L, new Object[0]);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onLocalStreamStats(LocalStreamStats localStreamStats) {
        C1274990jHd c1274990jHd = this.LIZ.LJIIIZ;
        int i = localStreamStats.txQuality;
        C1274290jGV c1274290jGV = c1274990jHd.LIZ;
        if (c1274290jGV != null) {
            synchronized (c1274290jGV) {
                c1274290jGV.LJJIII = i;
            }
        }
        this.LIZ.LJIIIZ.LJFF(localStreamStats.videoStats);
        this.LIZ.LJIIIZ.LIZLLL();
        C1269850j9L c1269850j9L = this.LIZ.LJLLL;
        if (c1269850j9L != null) {
            EnumC1269840j9K enumC1269840j9K = EnumC1269840j9K.DURATION_TYPE_LINKMIC;
            LocalVideoStats localVideoStats = localStreamStats.videoStats;
            c1269850j9L.LIZJ(enumC1269840j9K, localVideoStats.encodedFrameWidth, localVideoStats.encodedFrameHeight);
        }
        C1274810jHL c1274810jHL = this.LIZ;
        InterfaceC1274770jHH interfaceC1274770jHH = c1274810jHL.LJJIJLIJ;
        if (interfaceC1274770jHH != null) {
            ((C1274760jHG) interfaceC1274770jHH).LIZIZ(c1274810jHL, 12, c1274810jHL.LJJJLZIJ, Integer.valueOf(localStreamStats.txQuality), Integer.valueOf(localStreamStats.rxQuality));
        }
        C1274810jHL c1274810jHL2 = this.LIZ;
        c1274810jHL2.LJZL.LIZ(c1274810jHL2, 12, 0L, 0L, c1274810jHL2.LJJJLZIJ, Integer.valueOf(localStreamStats.txQuality), Integer.valueOf(localStreamStats.rxQuality));
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onRemoteStreamStats(RemoteStreamStats remoteStreamStats) {
        if (TextUtils.isEmpty(remoteStreamStats.uid)) {
            remoteStreamStats.uid = "";
        }
        C1274910jHV c1274910jHV = this.LIZ.LJIIIZ.LIZJ;
        if (c1274910jHV != null) {
            c1274910jHV.onRemoteVideoStats(remoteStreamStats);
        }
        C1274990jHd c1274990jHd = this.LIZ.LJIIIZ;
        if (c1274990jHd.LIZIZ != null) {
            c1274990jHd.LIZJ.onRemoteAudioStats(remoteStreamStats);
        }
        C1274810jHL c1274810jHL = this.LIZ;
        InterfaceC1274770jHH interfaceC1274770jHH = c1274810jHL.LJJIJLIJ;
        if (interfaceC1274770jHH != null) {
            ((C1274760jHG) interfaceC1274770jHH).LIZIZ(c1274810jHL, 12, remoteStreamStats.uid, Integer.valueOf(remoteStreamStats.txQuality), Integer.valueOf(remoteStreamStats.rxQuality));
        }
        C1274810jHL c1274810jHL2 = this.LIZ;
        c1274810jHL2.LJZL.LIZ(c1274810jHL2, 12, 0L, 0L, remoteStreamStats.uid, Integer.valueOf(remoteStreamStats.txQuality), Integer.valueOf(remoteStreamStats.rxQuality));
        C1274810jHL c1274810jHL3 = this.LIZ;
        c1274810jHL3.LJZL.LIZ(c1274810jHL3, 1, remoteStreamStats.audioStats.jitterBufferDelay, 0L, new Object[0]);
        C1274810jHL c1274810jHL4 = this.LIZ;
        c1274810jHL4.LJZL.LIZ(c1274810jHL4, 24, 0L, 0L, 0, remoteStreamStats);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onRoomStats(RTCRoomStats rTCRoomStats) {
        AVLog.debugTrace(new Object[0]);
        C1274290jGV c1274290jGV = this.LIZ.LJIIIZ.LIZ;
        if (c1274290jGV != null) {
            synchronized (c1274290jGV) {
                float f = rTCRoomStats.txAudioKBitRate;
                float f2 = c1274290jGV.LIZJ;
                int i = c1274290jGV.LIZIZ;
                float f3 = i;
                int i2 = i + 1;
                float f4 = i2;
                c1274290jGV.LIZJ = (f + (f2 * f3)) / f4;
                c1274290jGV.LIZLLL = (rTCRoomStats.rxAudioKBitRate + (c1274290jGV.LIZLLL * f3)) / f4;
                c1274290jGV.LJ = (rTCRoomStats.txVideoKBitRate + (c1274290jGV.LJ * f3)) / f4;
                c1274290jGV.LJFF = (rTCRoomStats.rxVideoKBitRate + (c1274290jGV.LJFF * f3)) / f4;
                c1274290jGV.LJII = rTCRoomStats.txKBitRate;
                c1274290jGV.LJIIIIZZ = rTCRoomStats.rxKBitRate;
                c1274290jGV.LJIIIZ = rTCRoomStats.txLostrate;
                c1274290jGV.LJIIJ = rTCRoomStats.rxLostrate;
                c1274290jGV.LJIIJJI = rTCRoomStats.txJitter;
                c1274290jGV.LJIIL = rTCRoomStats.rxJitter;
                c1274290jGV.LJIILIIL = rTCRoomStats.rtt;
                c1274290jGV.LJI = rTCRoomStats.users;
                c1274290jGV.LIZIZ = i2;
            }
        }
        C1274810jHL c1274810jHL = this.LIZ;
        c1274810jHL.LJZL.LIZ(c1274810jHL, 2, rTCRoomStats.txVideoKBitRate, 0L, Integer.valueOf(rTCRoomStats.txAudioKBitRate));
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onNetworkQuality(NetworkQualityStats networkQualityStats, NetworkQualityStats[] networkQualityStatsArr) {
        C1269910j9R c1269910j9RLJIJJ = this.LIZ.LIZJ.LIZ().LLD().LJIJJ();
        if (c1269910j9RLJIJJ != null) {
            c1269910j9RLJIJJ.LJ(networkQualityStats.txQuality, c1269910j9RLJIJJ.LIZIZ.LIZJ);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onRoomMessageReceived(String str, String str2) {
        AVLog.debugTrace(new Object[0]);
        C1274810jHL c1274810jHL = this.LIZ;
        C1274700jHA c1274700jHA = c1274810jHL.LJZL;
        if (c1274700jHA != null) {
            c1274700jHA.LIZ(c1274810jHL, 204, 0L, 0L, str, str2, 0);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onRoomMessageSendResult(long j, int i) {
        AVLog.debugTrace(new Object[0]);
        C1274810jHL c1274810jHL = this.LIZ;
        C1274700jHA c1274700jHA = c1274810jHL.LJZL;
        if (c1274700jHA != null) {
            c1274700jHA.LIZ(c1274810jHL, 203, 0L, 0L, Long.valueOf(j), Integer.valueOf(i), 0);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onStreamPublishSuccess(String str, boolean z) {
        AVLog.debugTrace(new Object[0]);
        C1274810jHL c1274810jHL = this.LIZ;
        C1274700jHA c1274700jHA = c1274810jHL.LJZL;
        if (c1274700jHA != null) {
            c1274700jHA.LIZ(c1274810jHL, 105, 0L, 0L, str, 0, 0);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserBinaryMessageReceived(String str, ByteBuffer byteBuffer) {
        C1274810jHL c1274810jHL = this.LIZ;
        c1274810jHL.LJZL.LIZ(c1274810jHL, 21, 0L, 0L, str, byteBuffer);
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserBizSessionId(String str, String str2) {
        AVLog.debugTrace(str, str2);
        C1274830jHN c1274830jHN = this.LIZ.LJIIIIZZ;
        c1274830jHN.getClass();
        C1274690jH9.LJ(new ARunnableS1S2100100_20(c1274830jHN, str, System.currentTimeMillis(), str2, 4));
        C1274810jHL c1274810jHL = this.LIZ;
        C1274700jHA c1274700jHA = c1274810jHL.LJZL;
        if (c1274700jHA != null) {
            c1274700jHA.LIZ(c1274810jHL, 27, 0L, 0L, str, str2);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserJoined(UserInfo userInfo, int i) {
        String uid;
        String roomId;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onUserJoined:");
        if (userInfo == null) {
            uid = null;
        } else {
            uid = userInfo.getUid();
        }
        sbLIZ.append(uid);
        C2188811AlT.LIZIZ(sbLIZ);
        AVLog.debugTrace(userInfo.getUid(), Integer.valueOf(i));
        C1275280jI6 c1275280jI6 = this.LIZ.LJL;
        String str = userInfo.uid;
        synchronized (c1275280jI6.LIZ) {
            try {
                if (!((ArrayList) c1275280jI6.LIZ).contains(str)) {
                    ((ArrayList) c1275280jI6.LIZ).add(str);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        if (userInfo.getUid().equals(this.LIZ.LJJJLZIJ)) {
            AVLog.iow("ClientImpl", "Received my onUserJoined");
            return;
        }
        if (this.LIZ.LJIIJ) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("client has been disposed,should not handle callback. uid:");
            sbLIZ2.append(userInfo.getUid());
            sbLIZ2.append(" config:");
            C1274810jHL c1274810jHL = this.LIZ;
            C1274890jHT c1274890jHT = c1274810jHL.LJI;
            if (c1274890jHT != null) {
                roomId = c1274890jHT.getRoomId();
            } else {
                roomId = c1274810jHL.LJJLIIIJJI;
            }
            sbLIZ2.append(roomId);
            sbLIZ2.append(" ext info:");
            sbLIZ2.append(userInfo.extraInfo);
            sbLIZ2.append(" client:");
            sbLIZ2.append(this.LIZ);
            AVLog.logKibana(6, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ2), null);
        }
        this.LIZ.LJIIIIZZ.LJIJI(userInfo.getUid(), true);
        C1274990jHd c1274990jHd = this.LIZ.LJIIIZ;
        String uid2 = userInfo.getUid();
        C1274910jHV c1274910jHV = c1274990jHd.LIZJ;
        if (c1274910jHV != null) {
            c1274910jHV.addUser(uid2);
        }
        this.LIZ.LLF(userInfo.getUid(), true);
        C1274690jH9.LJFF(new ARunnableS89S0200000_20(this, userInfo, 169));
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserLeave(String str, int i) {
        AVLog.debugTrace(str, Integer.valueOf(i));
        C1275280jI6 c1275280jI6 = this.LIZ.LJL;
        synchronized (c1275280jI6.LIZ) {
            try {
                ((ArrayList) c1275280jI6.LIZ).remove(str);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        C1274810jHL c1274810jHL = this.LIZ;
        C1275030jHh c1275030jHh = c1274810jHL.LJIILJJIL;
        if (c1275030jHh.LJIIL == EnumC1274430jGj.ANCHOR && c1275030jHh.LJIILL == EnumC1277290jLL.PK && c1274810jHL.LJLZ()) {
            C1274810jHL c1274810jHL2 = this.LIZ;
            if (c1274810jHL2.LJJIJLIJ != null) {
                VideoEncoderConfig videoEncoderConfigLJLL = c1274810jHL2.LJLL();
                InterfaceC1274770jHH interfaceC1274770jHH = this.LIZ.LJJIJLIJ;
                if (interfaceC1274770jHH != null) {
                    ((C1274760jHG) interfaceC1274770jHH).LIZ(true, videoEncoderConfigLJLL.width, videoEncoderConfigLJLL.height);
                }
            }
        }
        if (str.equals(this.LIZ.LJJJLZIJ)) {
            AVLog.iow("ClientImpl", "Received my onUserOffline");
            return;
        }
        this.LIZ.LJIIIIZZ.LJIJI(str, false);
        C1274910jHV c1274910jHV = this.LIZ.LJIIIZ.LIZJ;
        if (c1274910jHV != null) {
            c1274910jHV.removeUser(str);
        }
        this.LIZ.LLF(str, false);
        ((ConcurrentHashMap) this.LIZ.LJJIJL).remove(str);
        if (((ConcurrentHashMap) this.LIZ.LJJIJIIJI).containsKey(str)) {
            Long l = (Long) ((ConcurrentHashMap) this.LIZ.LJJIJIIJI).get(str);
            if (l != null) {
                long jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
                if (jCurrentTimeMillis > 0) {
                    this.LIZ.LJJIJIIJIL.addAndGet(jCurrentTimeMillis);
                }
            }
            ((ConcurrentHashMap) this.LIZ.LJJIJIIJI).remove(str);
        }
        C1274690jH9.LJFF(new ARunnableS4S1101000_20(i, str, this, 7));
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserMessageReceived(String str, String str2) {
        AVLog.debugTrace(new Object[0]);
        C1274810jHL c1274810jHL = this.LIZ;
        C1274700jHA c1274700jHA = c1274810jHL.LJZL;
        if (c1274700jHA != null) {
            c1274700jHA.LIZ(c1274810jHL, 202, 0L, 0L, str, str2, 0);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserMessageSendResult(long j, int i) {
        AVLog.debugTrace(new Object[0]);
        C1274810jHL c1274810jHL = this.LIZ;
        C1274700jHA c1274700jHA = c1274810jHL.LJZL;
        if (c1274700jHA != null) {
            c1274700jHA.LIZ(c1274810jHL, 201, 0L, 0L, Long.valueOf(j), Integer.valueOf(i), 0);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserPublishStream(String str, MediaStreamType mediaStreamType) {
        if (C1267520j5a.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUserPublishStream() called with: uid = [");
            sbLIZ.append(str);
            sbLIZ.append("], type = [");
            sbLIZ.append(mediaStreamType);
            sbLIZ.append(e3.f);
            AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        AVLog.debugTrace(str, mediaStreamType);
        if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) {
            C1274810jHL c1274810jHL = this.LIZ;
            c1274810jHL.LJZL.LIZ(c1274810jHL, 16, 0L, 0L, str, Boolean.FALSE);
            this.LIZ.LJIIIIZZ.LJIILLIIL(0, "onUserPublishStreamAudio", str);
        }
        MediaStreamType mediaStreamType2 = MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO;
        if (mediaStreamType == mediaStreamType2) {
            C1274810jHL c1274810jHL2 = this.LIZ;
            c1274810jHL2.LJZL.LIZ(c1274810jHL2, 15, 0L, 0L, str, Boolean.FALSE);
            this.LIZ.LJIIIIZZ.LJIILLIIL(0, "onUserPublishStreamVideo", str);
            this.LIZ.LLIIJI(true, false);
        }
        MediaStreamType mediaStreamType3 = MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH;
        if (mediaStreamType == mediaStreamType3) {
            C1274810jHL c1274810jHL3 = this.LIZ;
            C1274700jHA c1274700jHA = c1274810jHL3.LJZL;
            Boolean bool = Boolean.FALSE;
            c1274700jHA.LIZ(c1274810jHL3, 16, 0L, 0L, str, bool);
            this.LIZ.LJIIIIZZ.LJIILLIIL(0, "onUserPublishStreamAudio", str);
            C1274810jHL c1274810jHL4 = this.LIZ;
            c1274810jHL4.LJZL.LIZ(c1274810jHL4, 15, 0L, 0L, str, bool);
            this.LIZ.LJIIIIZZ.LJIILLIIL(0, "onUserPublishStreamVideo", str);
            this.LIZ.LLIIJI(true, false);
        }
        if (mediaStreamType == mediaStreamType2 || mediaStreamType == mediaStreamType3) {
            C1275280jI6 c1275280jI6 = this.LIZ.LJL;
            synchronized (c1275280jI6.LIZJ) {
                try {
                    c1275280jI6.LIZJ.put(str, Boolean.TRUE);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserPublishStream(StreamKey streamKey, boolean z, MediaStreamType mediaStreamType) {
        if (streamKey.getStreamIndex().value() >= StreamIndex.STREAM_INDEX_2ND.value()) {
            C1274810jHL c1274810jHL = this.LIZ;
            C1274940jHY c1274940jHY = c1274810jHL.LJJIIJZLJL;
            String userId = streamKey.getUserId();
            int iValue = streamKey.getStreamIndex().value();
            c1274940jHY.getClass();
            c1274810jHL.LIZIZ = C1274940jHY.LJ(iValue, userId);
            C1274810jHL c1274810jHL2 = this.LIZ;
            c1274810jHL2.LJZL.LIZ(c1274810jHL2, 29, 0L, 0L, streamKey.getUserId(), this.LIZ.LIZIZ);
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserUnpublishStream(String str, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
        AVLog.debugTrace(str, mediaStreamType);
        if (C1267520j5a.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onUserUnpublishStream() called with: uid = [");
            sbLIZ.append(str);
            sbLIZ.append("], type = [");
            sbLIZ.append(mediaStreamType);
            sbLIZ.append("], reason = [");
            sbLIZ.append(streamRemoveReason);
            sbLIZ.append(e3.f);
            AVLog.logKibana(4, "ClientImpl", C2188811AlT.LIZIZ(sbLIZ), null);
        }
        if (mediaStreamType == MediaStreamType.RTC_MEDIA_STREAM_TYPE_AUDIO) {
            C1274810jHL c1274810jHL = this.LIZ;
            c1274810jHL.LJZL.LIZ(c1274810jHL, 16, 0L, 0L, str, Boolean.TRUE);
            this.LIZ.LJIIIIZZ.LJIILLIIL(1, "onUserUnPublishStreamAudio", str);
        }
        MediaStreamType mediaStreamType2 = MediaStreamType.RTC_MEDIA_STREAM_TYPE_VIDEO;
        if (mediaStreamType == mediaStreamType2) {
            C1274810jHL c1274810jHL2 = this.LIZ;
            c1274810jHL2.LJZL.LIZ(c1274810jHL2, 15, 0L, 0L, str, Boolean.TRUE);
            this.LIZ.LJIIIIZZ.LJIILLIIL(1, "onUserUnPublishStreamVideo", str);
            if (!this.LIZ.LJI.LJJIIZI()) {
                this.LIZ.LLIIJI(true, false);
            }
        }
        MediaStreamType mediaStreamType3 = MediaStreamType.RTC_MEDIA_STREAM_TYPE_BOTH;
        if (mediaStreamType == mediaStreamType3) {
            C1274810jHL c1274810jHL3 = this.LIZ;
            C1274700jHA c1274700jHA = c1274810jHL3.LJZL;
            Boolean bool = Boolean.TRUE;
            c1274700jHA.LIZ(c1274810jHL3, 16, 0L, 0L, str, bool);
            this.LIZ.LJIIIIZZ.LJIILLIIL(1, "onUserUnPublishStreamAudio", str);
            C1274810jHL c1274810jHL4 = this.LIZ;
            c1274810jHL4.LJZL.LIZ(c1274810jHL4, 15, 0L, 0L, str, bool);
            this.LIZ.LJIIIIZZ.LJIILLIIL(1, "onUserUnPublishStreamVideo", str);
            if (!this.LIZ.LJI.LJJIIZI()) {
                this.LIZ.LLIIJI(true, false);
            }
        }
        if (mediaStreamType == mediaStreamType2 || mediaStreamType == mediaStreamType3) {
            C1275280jI6 c1275280jI6 = this.LIZ.LJL;
            synchronized (c1275280jI6.LIZJ) {
                try {
                    c1275280jI6.LIZJ.put(str, Boolean.FALSE);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
    }

    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    public final void onUserUnpublishStream(StreamKey streamKey, MediaStreamType mediaStreamType, StreamRemoveReason streamRemoveReason) {
        if (streamKey.getStreamIndex().value() >= StreamIndex.STREAM_INDEX_2ND.value()) {
            C1274940jHY c1274940jHY = this.LIZ.LJJIIJZLJL;
            String userId = streamKey.getUserId();
            int iValue = streamKey.getStreamIndex().value();
            c1274940jHY.getClass();
            String strLJ = C1274940jHY.LJ(iValue, userId);
            C1274810jHL c1274810jHL = this.LIZ;
            c1274810jHL.LJZL.LIZ(c1274810jHL, 30, 0L, 0L, streamKey.getUserId(), strLJ);
            this.LIZ.LJLIIIL(strLJ);
            C1274810jHL c1274810jHL2 = this.LIZ;
            if (c1274810jHL2.LJJIIJ.containsKey(strLJ)) {
                c1274810jHL2.LJJIIJ.remove(strLJ);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    @Override // com.ss.bytertc.engine.handler.IRTCRoomEventHandlerAdapter, com.ss.bytertc.engine.handler.IRTCRoomEventHandler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRoomStateChanged(java.lang.String r22, java.lang.String r23, int r24, java.lang.String r25) {
        /*
            Method dump skipped, instruction units count: 445
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1274820jHM.onRoomStateChanged(java.lang.String, java.lang.String, int, java.lang.String):void");
    }
}
