package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.performance.memory.MemoryTriggerSetting;

/* JADX INFO: renamed from: X.1AKm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2177661AKm implements InterfaceC20124913ol {
    public final C2177651AKl LIZ;
    public final C2177571AKd LIZIZ;
    public final long LIZJ;
    public long LIZLLL;
    public long LJ = MemoryTriggerSetting.INSTANCE.getGcNormalIntervalMs();

    @Override // X.InterfaceC20124913ol
    public final void LIZ() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - this.LIZLLL < this.LJ) {
            return;
        }
        this.LIZ.getClass();
        Runtime runtime = Runtime.getRuntime();
        long jFreeMemory = runtime.totalMemory() - runtime.freeMemory();
        long jMaxMemory = runtime.maxMemory();
        EnumC2177591AKf enumC2177591AKfLJ = C2177651AKl.LJ(jMaxMemory - jFreeMemory, jMaxMemory);
        C1776970wLH c1776970wLH = new C1776970wLH(enumC2177591AKfLJ, jFreeMemory, jMaxMemory);
        if (jMaxMemory > 0) {
            this.LJ = C2177621AKi.LIZ[enumC2177591AKfLJ.ordinal()] == 1 ? MemoryTriggerSetting.INSTANCE.getGcNormalIntervalMs() * ((long) 2) : MemoryTriggerSetting.INSTANCE.getGcNormalIntervalMs();
            if (enumC2177591AKfLJ.compareTo(EnumC2177591AKf.NORMAL) <= 0) {
                return;
            }
            this.LIZLLL = jElapsedRealtime;
            C2177651AKl c2177651AKl = this.LIZ;
            C1776980wLI c1776980wLI = new C1776980wLI(EnumC2177591AKf.NONE, -1L, -1L);
            c2177651AKl.getClass();
            this.LIZIZ.LIZ(EnumC1783030wV3.GC, C2177651AKl.LIZ(c1776970wLH, c1776980wLI), this.LIZJ, EnumC1153480g7e.LIVEHOST);
        }
    }

    public C2177661AKm(C2177651AKl c2177651AKl, C2177571AKd c2177571AKd, long j) {
        this.LIZ = c2177651AKl;
        this.LIZIZ = c2177571AKd;
        this.LIZJ = j;
    }
}
