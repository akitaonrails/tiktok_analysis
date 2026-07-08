package X;

import com.ss.bytertc.engine.data.RemoteAudioPropertiesInfo;
import com.ss.bytertc.engine.data.StreamIndex;
import com.ss.bytertc.engine.data.StreamKey;
import com.ss.bytertc.engine.type.RemoteAudioStats;
import com.ss.bytertc.engine.type.RemoteStreamStats;
import com.ss.bytertc.engine.type.RemoteVideoState;
import com.ss.bytertc.engine.type.RemoteVideoStateChangeReason;
import com.ss.bytertc.engine.type.RemoteVideoStats;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0jHV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1274910jHV extends HashMap<String, C1275040jHi> {
    public int LL = 200;

    public synchronized Map<String, C1275040jHi> getStatisticResult() {
        HashMap map;
        map = new HashMap();
        long jCurrentTimeMillis = System.currentTimeMillis();
        for (Map.Entry<String, C1275040jHi> entry : entrySet()) {
            String key = entry.getKey();
            C1275040jHi value = entry.getValue();
            long j = value.LJIIJ;
            value.LJ = ((j == 0 || jCurrentTimeMillis <= j) ? 0L : jCurrentTimeMillis - j) > 0 ? (int) ((((double) value.LJIIJJI) * 1000.0d) / r6) : 0.0f;
            map.put(key, value.clone());
            value.LIZJ = 0;
            value.LIZLLL = 0;
            value.LJ = 0.0f;
            value.LJFF = 0;
            value.LJI = 0;
            value.LJII = 0;
            value.LJIIIIZZ = 0;
            value.LJIIIZ = 0;
            value.LJIIJ = jCurrentTimeMillis;
            value.LJIIJJI = 0;
            value.LJIIL = false;
        }
        return map;
    }

    public synchronized Map<String, Integer> getVideoDelayAvgMSec() {
        HashMap map;
        map = new HashMap();
        for (Map.Entry<String, C1275040jHi> entry : entrySet()) {
            String key = entry.getKey();
            C1275040jHi value = entry.getValue();
            Iterator it2 = ((ArrayList) value.LJIIZILJ).iterator();
            int iIntValue = 0;
            while (it2.hasNext()) {
                iIntValue += ((Integer) it2.next()).intValue();
            }
            map.put(key, Integer.valueOf(((ArrayList) value.LJIIZILJ).size() > 0 ? iIntValue / ((ArrayList) value.LJIIZILJ).size() : -1));
            ((ArrayList) value.LJIIZILJ).clear();
        }
        return map;
    }

    public synchronized Map<String, List<C1275730jIp>> getVideoFrozenInfo() {
        HashMap map;
        map = new HashMap();
        for (Map.Entry<String, C1275040jHi> entry : entrySet()) {
            String key = entry.getKey();
            C1275040jHi value = entry.getValue();
            ArrayList arrayList = new ArrayList();
            for (C1275730jIp c1275730jIp : (ArrayList) value.LJIILLIIL) {
                arrayList.add(new C1275730jIp(c1275730jIp.LIZ, c1275730jIp.LIZIZ));
            }
            map.put(key, arrayList);
            ((ArrayList) value.LJIILLIIL).clear();
        }
        return map;
    }

    public synchronized void addUser(String str) {
        put(str, new C1275040jHi(this));
    }

    public synchronized void onRemoteAudioStats(RemoteStreamStats remoteStreamStats) {
        if (remoteStreamStats != null) {
            C1275040jHi c1275040jHi = get(remoteStreamStats.uid);
            if (c1275040jHi != null) {
                RemoteAudioStats remoteAudioStats = remoteStreamStats.audioStats;
                c1275040jHi.LJI = (int) remoteAudioStats.receivedKBitrate;
                c1275040jHi.LJII = (int) remoteAudioStats.e2eDelay;
                c1275040jHi.LJIIIIZZ = (int) (remoteAudioStats.audioLossRate * 100.0f);
            }
        }
    }

    public synchronized void onRemoteVideoRendered(String str) {
        C1275040jHi c1275040jHi = get(str);
        if (c1275040jHi != null) {
            c1275040jHi.LJIIJJI++;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j = c1275040jHi.LJIILIIL;
            int i = (int) (jCurrentTimeMillis - j);
            if (j > 0 && i > this.LL) {
                ((ArrayList) c1275040jHi.LJIILLIIL).add(new C1275730jIp(i, 0));
            }
            if (!c1275040jHi.LJIIL) {
                c1275040jHi.LJIILIIL = jCurrentTimeMillis;
            }
        }
    }

    public synchronized void onRemoteVideoStats(RemoteStreamStats remoteStreamStats) {
        if (remoteStreamStats != null) {
            C1275040jHi c1275040jHi = get(remoteStreamStats.uid);
            if (c1275040jHi != null) {
                RemoteVideoStats remoteVideoStats = remoteStreamStats.videoStats;
                c1275040jHi.LIZ = remoteVideoStats.width;
                c1275040jHi.LIZIZ = remoteVideoStats.height;
                c1275040jHi.LIZJ = (int) remoteVideoStats.receivedKBitrate;
                c1275040jHi.LIZLLL = remoteVideoStats.decoderOutputFrameRate;
                c1275040jHi.LJFF = (int) (remoteVideoStats.videoLossRate * 100.0f);
                c1275040jHi.LJIILJJIL = remoteVideoStats.isHardwareCodec;
                c1275040jHi.LJIILL = remoteVideoStats.codecType;
            }
        }
    }

    public synchronized void removeUser(String str) {
        remove(str);
    }

    public void setVideoFrozenLimitMSec(int i) {
        this.LL = i;
    }

    public synchronized void onAudioVolumeIndication(RemoteAudioPropertiesInfo[] remoteAudioPropertiesInfoArr, int i) {
        if (remoteAudioPropertiesInfoArr != null) {
            for (RemoteAudioPropertiesInfo remoteAudioPropertiesInfo : remoteAudioPropertiesInfoArr) {
                C1275040jHi c1275040jHi = get(remoteAudioPropertiesInfo.streamKey.getUserId());
                if (c1275040jHi != null) {
                    c1275040jHi.LJIIIZ = remoteAudioPropertiesInfo.audioPropertiesInfo.linearVolume;
                }
            }
        }
    }

    public synchronized void onRemoteAuxStreamVideoStats(StreamKey streamKey, RemoteStreamStats remoteStreamStats) {
        if (remoteStreamStats != null) {
            StreamIndex streamIndex = streamKey.getStreamIndex();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(streamKey.getUserId());
            sbLIZ.append("_");
            sbLIZ.append(streamIndex.value());
            C1275040jHi c1275040jHi = get(C2188811AlT.LIZIZ(sbLIZ));
            if (c1275040jHi != null) {
                RemoteVideoStats remoteVideoStats = remoteStreamStats.videoStats;
                c1275040jHi.LIZ = remoteVideoStats.width;
                c1275040jHi.LIZIZ = remoteVideoStats.height;
                c1275040jHi.LIZJ = (int) remoteVideoStats.receivedKBitrate;
                c1275040jHi.LIZLLL = remoteVideoStats.decoderOutputFrameRate;
                c1275040jHi.LJFF = (int) (remoteVideoStats.videoLossRate * 100.0f);
                c1275040jHi.LJIILJJIL = remoteVideoStats.isHardwareCodec;
                c1275040jHi.LJIILL = remoteVideoStats.codecType;
            }
        }
    }

    public synchronized void onVideoDelayInfo(String str, int i) {
        C1275040jHi c1275040jHi = get(str);
        if (c1275040jHi != null) {
            ((ArrayList) c1275040jHi.LJIIZILJ).add(Integer.valueOf(i));
        }
    }

    public synchronized void onRemoteVideoStateChanged(String str, RemoteVideoState remoteVideoState, RemoteVideoStateChangeReason remoteVideoStateChangeReason) {
        C1275040jHi c1275040jHi = get(str);
        if (c1275040jHi != null) {
            if (RemoteVideoState.REMOTE_VIDEO_STATE_STOPPED == remoteVideoState) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                long j = c1275040jHi.LJIILIIL;
                int i = (int) (jCurrentTimeMillis - j);
                if (j > 0 && i > this.LL) {
                    ((ArrayList) c1275040jHi.LJIILLIIL).add(new C1275730jIp(i, 1));
                }
                c1275040jHi.LJIILIIL = -1L;
                c1275040jHi.LJIIL = true;
            } else {
                c1275040jHi.LJIIL = false;
            }
        }
    }

    public synchronized void onRemoteAudioTransportStats(String str, int i, int i2, int i3) {
    }

    public synchronized void onRemoteVideoTransportStats(String str, int i, int i2, int i3) {
    }
}
