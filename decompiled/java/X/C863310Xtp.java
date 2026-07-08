package X;

import android.content.Context;
import android.view.Choreographer;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Xtp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C863310Xtp implements InterfaceC21173617tW {
    public final Context LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public volatile float LJ;
    public long LJI;
    public volatile long LJII;
    public volatile long LJIIIIZZ;
    public volatile long LJIIIZ;
    public volatile long LJIIJ;
    public volatile long LJIIJJI;
    public volatile long LJIIL;
    public volatile long LJIILIIL;
    public volatile long LJIILJJIL;
    public volatile long LJIILL;
    public volatile long LJIILLIIL;
    public volatile long LJIIZILJ;
    public volatile long LJIJ;
    public volatile long LJIJI;
    public long LJFF = 16666667;
    public final ChoreographerFrameCallbackC863330Xtr LJIJJ = new Choreographer.FrameCallback() { // from class: X.0Xtr
        @Override // android.view.Choreographer.FrameCallback
        public final void doFrame(long j) {
            try {
                this.LL.LIZIZ(j);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            try {
                C786410Ut5.v2().postFrameCallback(this);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
            }
        }
    };

    @Override // X.InterfaceC21173617tW
    public final Map<String, Object> LIZ() {
        return C2097608Jq.LJII(new Pair("register_attempted", Boolean.valueOf(this.LIZIZ)), new Pair("registered", Boolean.valueOf(this.LIZJ)), new Pair("first_frame_seen", Boolean.valueOf(this.LIZLLL)), new Pair("total_frames", Long.valueOf(this.LJII)), new Pair("jank_count", Long.valueOf(this.LJIIIZ)), new Pair("refresh_rate_hz", Float.valueOf(this.LJ)), new Pair("expected_frame_ns", Long.valueOf(this.LJFF)));
    }

    @Override // X.InterfaceC21173617tW
    public final String getName() {
        return "fps";
    }

    @Override // X.InterfaceC21173617tW
    public final Map<String, Object> LJJLIIIJLJLI() {
        if (!this.LIZLLL) {
            return C2097608Jq.LJ();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(14);
        linkedHashMap.put("total_frames", Long.valueOf(this.LJII));
        linkedHashMap.put("dropped_frames_sum", Long.valueOf(this.LJIIIIZZ));
        linkedHashMap.put("jank_count", Long.valueOf(this.LJIIIZ));
        if (this.LJIIJ > 0) {
            linkedHashMap.put("level_1", Long.valueOf(this.LJIIJ));
        }
        if (this.LJIIJJI > 0) {
            linkedHashMap.put("level_2", Long.valueOf(this.LJIIJJI));
        }
        if (this.LJIIL > 0) {
            linkedHashMap.put("level_3", Long.valueOf(this.LJIIL));
        }
        if (this.LJIILIIL > 0) {
            linkedHashMap.put("level_4", Long.valueOf(this.LJIILIIL));
        }
        if (this.LJIILJJIL > 0) {
            linkedHashMap.put("block_count", Long.valueOf(this.LJIILJJIL));
        }
        if (this.LJIILL > 0) {
            linkedHashMap.put("block_duration_ms", Long.valueOf(this.LJIILL));
        }
        if (this.LJIILLIIL > 0) {
            linkedHashMap.put("drop_max", Long.valueOf(this.LJIILLIIL));
        }
        if (this.LJIJI > 0) {
            linkedHashMap.put("last_drop_frames", Long.valueOf(this.LJIIZILJ));
            linkedHashMap.put("last_drop_total_ms", Long.valueOf(this.LJIJ));
            long jCurrentTimeMillis = System.currentTimeMillis() - this.LJIJI;
            linkedHashMap.put("last_drop_ago_ms", Long.valueOf(jCurrentTimeMillis >= 0 ? jCurrentTimeMillis : 0L));
        }
        return linkedHashMap;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.0Xtr] */
    public C863310Xtp(Context context) {
        this.LIZ = context;
    }

    public final void LIZIZ(long j) {
        long j2 = this.LJI;
        this.LJI = j;
        if (j2 <= 0) {
            this.LIZLLL = true;
            return;
        }
        long j3 = j - j2;
        if (j3 <= 0) {
            return;
        }
        long j4 = this.LJFF;
        long j5 = 1;
        long j6 = (j3 / j4) - 1;
        if (j6 < 0) {
            j6 = 0;
        }
        this.LJII++;
        this.LIZLLL = true;
        if (j6 <= 0) {
            return;
        }
        this.LJIIIIZZ += j6;
        this.LJIIIZ++;
        if (j6 > this.LJIILLIIL) {
            this.LJIILLIIL = j6;
        }
        if (j6 <= 2) {
            this.LJIIJ++;
        } else if (j6 <= 6) {
            this.LJIIJJI++;
        } else if (j6 <= 13) {
            this.LJIIL++;
        } else {
            this.LJIILIIL++;
        }
        if (j6 >= 3) {
            this.LJIILJJIL++;
            this.LJIILL += (j4 / 1000000) * j6;
        }
        this.LJIIZILJ = j6;
        long j7 = j3 / 1000000;
        if (j7 >= 1) {
            j5 = j7;
        }
        this.LJIJ = j5;
        this.LJIJI = System.currentTimeMillis();
    }
}
