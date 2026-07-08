package X;

import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.playerkit.radar.SimRadar;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0N1c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C587140N1c implements Handler.Callback {
    public final int LL = ((Number) C1474810oTv.LJLILLLLZI.getValue()).intValue();
    public final long LLILLJJLI = ((Number) C1474810oTv.LJLIL.getValue()).longValue();
    public final BPEAHandler LLILLL = new BPEAHandler(Looper.getMainLooper(), this);
    public final ConcurrentHashMap<SurfaceTexture, Long> LLILZ = new ConcurrentHashMap<>();

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 0) {
            try {
                new Function0() { // from class: X.0N1b
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        C587140N1c c587140N1c = this.LL;
                        c587140N1c.getClass();
                        long jElapsedRealtime = SystemClock.elapsedRealtime();
                        int size = c587140N1c.LLILZ.size();
                        ConcurrentHashMap<SurfaceTexture, Long> concurrentHashMap = c587140N1c.LLILZ;
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Map.Entry<SurfaceTexture, Long> entry : concurrentHashMap.entrySet()) {
                            if (jElapsedRealtime - entry.getValue().longValue() > c587140N1c.LLILLJJLI) {
                                linkedHashMap.put(entry.getKey(), entry.getValue());
                            }
                        }
                        Iterator it2 = linkedHashMap.keySet().iterator();
                        while (it2.hasNext()) {
                            c587140N1c.LLILZ.remove(it2.next());
                        }
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("DTextureView: trimStore, store.size: ");
                        sbLIZ.append(size);
                        sbLIZ.append(" -> ");
                        sbLIZ.append(c587140N1c.LLILZ.size());
                        SimRadar.keyScan("TextureView", C2188811AlT.LIZIZ(sbLIZ), new Object[0]);
                        return Unit.LIZ;
                    }
                }.invoke();
                return true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                return true;
            }
        }
        return true;
    }
}
