package X;

import android.app.ActivityManager;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import com.ss.lyrax.video.EffectSequenceCacheConfig;

/* JADX INFO: renamed from: X.0j5r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1267690j5r {
    public final Handler LIZ;
    public final EffectSequenceCacheConfig LIZIZ;
    public int LIZJ;
    public final Context LIZLLL;
    public final ActivityManager LJ;
    public boolean LJFF;
    public final boolean LJI;
    public final ComponentCallbacks2C1266670j4D LJII;
    public final RunnableC1267700j5s LJIIIIZZ;

    public final void LIZ() {
        long j;
        int i;
        boolean z;
        if (this.LIZJ == -1 || !this.LJI) {
            return;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        C2204961BRm.LJFF(this.LJ, memoryInfo, new C0WZX("dzBzEhEpEd7IWV43QAGQdGXVEhh91RAp2lK4EDHBvFmo/rwKKvpwW1/HTptt6fMnnQ5pLMpoIST/aYr2NfHTP0dWvZCjFP8=", null));
        long j2 = memoryInfo.availMem;
        EffectSequenceCacheConfig effectSequenceCacheConfig = this.LIZIZ;
        if (j2 > effectSequenceCacheConfig.deviceNormalMemorySize) {
            i = effectSequenceCacheConfig.cacheMaxSize;
        } else if (j2 > effectSequenceCacheConfig.deviceLowMemorySize) {
            i = effectSequenceCacheConfig.cacheNormalSize;
        } else {
            if (j2 <= effectSequenceCacheConfig.deviceCriticalMemorySize) {
                j = 0;
                if (this.LJFF == z || this.LJIIIIZZ.LLILLL != j) {
                    this.LIZ.removeCallbacks(this.LJIIIIZZ);
                    this.LJIIIIZZ.LLILLJJLI = z;
                    this.LJIIIIZZ.LLILLL = j;
                    C786410Ut5.LJLIIL(300L, this.LIZ, this.LJIIIIZZ);
                    this.LJFF = z;
                }
                return;
            }
            i = effectSequenceCacheConfig.cacheMinSize;
        }
        j = i;
        z = j > 0 && this.LIZJ == 0;
        if (this.LJFF == z) {
        }
        this.LIZ.removeCallbacks(this.LJIIIIZZ);
        this.LJIIIIZZ.LLILLJJLI = z;
        this.LJIIIIZZ.LLILLL = j;
        C786410Ut5.LJLIIL(300L, this.LIZ, this.LJIIIIZZ);
        this.LJFF = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [X.0j4D, android.content.ComponentCallbacks] */
    public C1267690j5r(Context context, Handler handler, InterfaceC1268640j7O interfaceC1268640j7O, EffectSequenceCacheConfig effectSequenceCacheConfig) {
        this.LIZ = handler;
        this.LIZIZ = effectSequenceCacheConfig;
        boolean z = effectSequenceCacheConfig.enable;
        this.LJI = z;
        ?? r2 = new ComponentCallbacks2() { // from class: X.0j4D
            @Override // android.content.ComponentCallbacks
            public final void onConfigurationChanged(Configuration configuration) {
            }

            @Override // android.content.ComponentCallbacks
            public final void onLowMemory() {
            }

            @Override // android.content.ComponentCallbacks2
            public final void onTrimMemory(int i) {
                C1267690j5r c1267690j5r = this.LL;
                if (c1267690j5r.LJI && c1267690j5r.LIZJ != -1) {
                    c1267690j5r.LIZ();
                }
            }
        };
        this.LJII = r2;
        this.LJIIIIZZ = new RunnableC1267700j5s(interfaceC1268640j7O);
        Context contextN3 = C786410Ut5.N3(context);
        this.LIZLLL = contextN3;
        this.LJ = (ActivityManager) C786410Ut5.H2(contextN3, "activity");
        if (z) {
            contextN3.registerComponentCallbacks(r2);
            LIZ();
        }
    }
}
