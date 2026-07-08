package X;

import Y.ARunnableS110S0100000_10;
import Y.ARunnableS79S0200000_10;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Debug;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Q4f, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C664390Q4f {
    public static Boolean LJII;
    public static final C01GW<C798360VTm> LJIIIIZZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(482));
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public ScheduledFuture<?> LIZIZ;
    public C664380Q4e LIZJ;
    public long LIZLLL;
    public long LJ;
    public int LJFF;
    public long LJI;

    public static C664440Q4k LJFF() throws Exception {
        C01GW<C798360VTm> c01gw = LJIIIIZZ;
        c01gw.getValue().LIZ();
        C664440Q4k c664440Q4k = new C664440Q4k(C687270QxZ.LIZ(c01gw.getValue().LJI.LIZ), 62);
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        c664440Q4k.LIZIZ = memoryInfo.getTotalPss();
        c664440Q4k.LIZJ = memoryInfo.dalvikPss;
        c664440Q4k.LIZLLL = memoryInfo.nativePss;
        C844470XAv.LIZ.getClass();
        Intent intentLJIJJ = C786410Ut5.LJIJJ(C844470XAv.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentLJIJJ != null) {
            c664440Q4k.LJ = ((double) intentLJIJJ.getIntExtra("temperature", 0)) / 10.0d;
            int i = -1;
            int intExtra = intentLJIJJ.getIntExtra("level", -1);
            int intExtra2 = intentLJIJJ.getIntExtra("scale", -1);
            if (intExtra != -1 && intExtra2 != -1) {
                i = (int) ((intExtra * 100.0f) / intExtra2);
            }
            c664440Q4k.LJFF = i;
        }
        return c664440Q4k;
    }

    public final void LIZ(C664380Q4e c664380Q4e) {
        ScheduledFuture<?> scheduledFuture = this.LIZIZ;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.LIZ.set(true);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(c664380Q4e.LJIIIIZZ);
        sbLIZ.append('_');
        sbLIZ.append(c664380Q4e.LIZ);
        C2188811AlT.LIZIZ(sbLIZ);
        c664380Q4e.LIZ(LJFF());
        this.LIZIZ = C823050WQl.LJ().scheduleWithFixedDelay(new ARunnableS110S0100000_10(this, 124), 0L, 30L, TimeUnit.SECONDS);
    }

    public final void LIZIZ(boolean z) {
        long jCurrentTimeMillis;
        C664380Q4e c664380Q4e = this.LIZJ;
        if (c664380Q4e == null) {
            return;
        }
        if (z) {
            this.LJ = System.currentTimeMillis();
            this.LJFF++;
            return;
        }
        if (this.LJ > 0) {
            jCurrentTimeMillis = System.currentTimeMillis() - this.LJ;
        } else {
            jCurrentTimeMillis = 0;
        }
        this.LJ = 0L;
        long j = this.LJI + jCurrentTimeMillis;
        this.LJI = j;
        c664380Q4e.LIZIZ(j, "buffering_duration");
        ((ConcurrentHashMap) c664380Q4e.LJIIIZ).put("buffering_count", Integer.valueOf(this.LJFF));
    }

    public final void LIZLLL(C664380Q4e c664380Q4e) {
        this.LIZJ = c664380Q4e;
        this.LIZLLL = System.currentTimeMillis();
        synchronized (c664380Q4e) {
            try {
                ((ArrayList) c664380Q4e.LJ).clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        c664380Q4e.LJIIJ.set(false);
        this.LJ = 0L;
        this.LJFF = 0;
        this.LJI = 0L;
        c664380Q4e.LIZIZ(0L, "buffering_duration");
        c664380Q4e.LIZIZ(0L, "buffering_count");
        try {
            C844470XAv.LIZ.getClass();
            String strLIZ = C786710UtZ.LIZ(C844470XAv.LIZ());
            if (strLIZ != null) {
                c664380Q4e.LIZJ("access_type", strLIZ);
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
        }
        if (C670910QTh.LIZ()) {
            C823050WQl.LIZJ().execute(new ARunnableS79S0200000_10(this, c664380Q4e, 61));
        }
    }

    public final void LIZJ(String str, String str2) {
        C664380Q4e c664380Q4e = this.LIZJ;
        if (c664380Q4e != null && Intrinsics.LJFF(c664380Q4e.LJIIIIZZ, str2) && Intrinsics.LJFF(c664380Q4e.LIZ, str)) {
            if (this.LIZLLL > 0) {
                long jCurrentTimeMillis = System.currentTimeMillis() - this.LIZLLL;
                if (jCurrentTimeMillis > 0) {
                    c664380Q4e.LIZLLL = jCurrentTimeMillis;
                }
            }
            int size = C650700Pfg.LIZ.size();
            ((ConcurrentHashMap) c664380Q4e.LJIIIZ).put("player_count", Integer.valueOf(size));
            try {
                int iLJII = C1479130oat.LJII();
                if (iLJII > 0) {
                    ((ConcurrentHashMap) c664380Q4e.LJIIIZ).put("internet_speed", Integer.valueOf(iLJII));
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
            C823050WQl.LIZJ().execute(new ARunnableS79S0200000_10(this, c664380Q4e, 60));
        }
    }

    public final void LJ(String str, String str2, long j, C664400Q4g c664400Q4g) {
        C664380Q4e c664380Q4e = this.LIZJ;
        if (c664380Q4e != null && Intrinsics.LJFF(c664380Q4e.LJIIIIZZ, str2) && Intrinsics.LJFF(c664380Q4e.LIZ, str)) {
            this.LIZLLL = System.currentTimeMillis();
            c664380Q4e.LIZJ.incrementAndGet();
            synchronized (c664380Q4e) {
                try {
                    ((ArrayList) c664380Q4e.LJ).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
            c664380Q4e.LJIIJ.set(false);
            if (j > 0) {
                c664380Q4e.LIZIZ = j;
            }
            if (c664400Q4g != null) {
                c664380Q4e.LJFF = c664400Q4g;
            }
            if (C670910QTh.LIZ()) {
                C823050WQl.LIZJ().execute(new ARunnableS79S0200000_10(this, c664380Q4e, 62));
            }
        }
    }
}
