package X;

import com.ss.ttlivestreamer.core.engine.AudioDeviceModule;
import com.ss.ttlivestreamer.core.utils.AVLog;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0j5e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267560j5e {
    public final Map<String, C1271310jBh> LIZ = new ConcurrentHashMap();
    public final InterfaceC1273910jFt LIZIZ;
    public InterfaceC1266890j4Z LIZJ;

    public final void LIZIZ() {
        AVLog.logKibana(4, "MediaPlayerManager", "releaseAllMediaPlayers", null);
        Iterator it2 = ((ConcurrentHashMap) this.LIZ).values().iterator();
        while (it2.hasNext()) {
            ((C1271610jCB) it2.next()).release();
        }
        ((ConcurrentHashMap) this.LIZ).clear();
    }

    public C1267560j5e(InterfaceC1273910jFt interfaceC1273910jFt) {
        this.LIZIZ = interfaceC1273910jFt;
    }

    public final void LIZ(boolean z) {
        AudioDeviceModule.AudioRenderSink audioRenderSink;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("muteAllMediaPlayersAudio mute:");
        sbLIZ.append(z);
        AVLog.logKibana(4, "MediaPlayerManager", C2188811AlT.LIZIZ(sbLIZ), null);
        for (C1271310jBh c1271310jBh : ((ConcurrentHashMap) this.LIZ).values()) {
            c1271310jBh.getClass();
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("muteAudio streamID:");
            sbLIZ2.append(c1271310jBh.LLILZ);
            sbLIZ2.append(" mute:");
            sbLIZ2.append(z);
            AVLog.logKibana(4, "MediaPlayer", C2188811AlT.LIZIZ(sbLIZ2), null);
            C1272390jDR c1272390jDR = c1271310jBh.LLILZIL;
            if (c1272390jDR != null && (audioRenderSink = c1272390jDR.LIZ) != null) {
                RunnableC1267570j5f runnableC1267570j5f = new RunnableC1267570j5f(audioRenderSink, z);
                if (audioRenderSink.LLILZ) {
                    audioRenderSink.LLIZLLLIL(audioRenderSink.LL, runnableC1267570j5f);
                } else {
                    runnableC1267570j5f.run();
                }
            }
        }
    }
}
