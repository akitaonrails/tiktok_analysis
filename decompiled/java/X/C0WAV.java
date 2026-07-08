package X;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: renamed from: X.0WAV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WAV {
    public final long LIZ;
    public final double LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;
    public final double LJ;
    public final double LJFF;
    public final double LJI;
    public final double LJII;
    public final double LJIIIIZZ;
    public final Map<C0WAR, C0WAY> LJIIIZ;
    public final List<C0WAW> LJIIJ;
    public final boolean LJIIJJI;
    public final C0WAX LJIIL;
    public final List<String> LJIILIIL;

    public final void LIZ() {
        PrintStream printStream = System.out;
        StringBuilder sb = new StringBuilder(1024);
        Locale locale = Locale.US;
        sb.append(C786410Ut5.k4(locale, "durationMs=%d%n", new Object[]{Long.valueOf(this.LIZ)}));
        sb.append(C786410Ut5.k4(locale, "schedAvailable=%s%n", new Object[]{Boolean.valueOf(this.LJIIJJI)}));
        sb.append(C786410Ut5.k4(locale, "schedMetricsQuality=%s%n", new Object[]{this.LJIIL}));
        Object[] objArr = new Object[1];
        objArr[0] = Boolean.valueOf(this.LJIIL == C0WAX.FULL);
        sb.append(C786410Ut5.k4(locale, "schedFileBreakdownUsable=%s%n", objArr));
        if (this.LJIIL == C0WAX.CPU_TIME_ONLY) {
            sb.append("\n--- note ---\nCPU time from schedstat only; per-thread sched unavailable on this device — iowait/sleep/ready breakdown is not shown (see schedMetricsQuality).\n");
        }
        sb.append("\n--- sched deltas (ms) ---\n");
        sb.append(C786410Ut5.k4(locale, "cpuRunMs=%.3f ioWaitMs=%.3f sleepMs=%.3f readyMs=%.3f%n", new Object[]{Double.valueOf(this.LIZIZ), Double.valueOf(this.LIZJ), Double.valueOf(this.LIZLLL), Double.valueOf(this.LJ)}));
        sb.append(C786410Ut5.k4(locale, "schedTotalMs=%.3f%n", new Object[]{Double.valueOf(this.LIZIZ + this.LIZJ + this.LIZLLL + this.LJ)}));
        sb.append("\n--- time share ---\n");
        sb.append(C786410Ut5.k4(locale, "pctCpu=%.3f pctIoWait=%.3f pctSleepNonIo=%.3f pctReady=%.3f%n", new Object[]{Double.valueOf(this.LJFF), Double.valueOf(this.LJI), Double.valueOf(this.LJII), Double.valueOf(this.LJIIIIZZ)}));
        if (!this.LJIIIZ.isEmpty()) {
            sb.append("\n--- wchan (approx) ---\n");
            for (Map.Entry<C0WAR, C0WAY> entry : this.LJIIIZ.entrySet()) {
                sb.append(C786410Ut5.k4(locale, "%s: estMs=%d samples=%d%n", new Object[]{entry.getKey().name(), Long.valueOf(entry.getValue().LIZ), Integer.valueOf(entry.getValue().LIZIZ)}));
            }
        }
        if (!this.LJIIJ.isEmpty()) {
            sb.append("\n--- blocking Java stacks (rate-limited captures) ---\n");
            for (C0WAW c0waw : this.LJIIJ) {
                sb.append(C786410Ut5.k4(locale, "category=%s timesObserved=%d%n", new Object[]{c0waw.LIZJ, Integer.valueOf(c0waw.LIZIZ)}));
                sb.append(c0waw.LIZ);
            }
        }
        if (!this.LJIILIIL.isEmpty()) {
            sb.append("\n--- errors ---\n");
            Iterator<String> it2 = this.LJIILIIL.iterator();
            while (it2.hasNext()) {
                sb.append(it2.next());
                sb.append('\n');
            }
        }
        printStream.println(sb.toString());
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.LIZ), Double.valueOf(this.LIZIZ), Double.valueOf(this.LIZJ), Double.valueOf(this.LIZLLL), Double.valueOf(this.LJ), Double.valueOf(this.LJFF), Double.valueOf(this.LJI), Double.valueOf(this.LJII), Double.valueOf(this.LJIIIIZZ), this.LJIIIZ, this.LJIIJ, Boolean.valueOf(this.LJIIJJI), this.LJIIL, this.LJIILIIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ThreadIoStats[durationMillis=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", cpuRunMs=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", ioWaitMs=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", sleepMs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", readyMs=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", pctCpuRun=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", pctIoWait=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", pctSleepNonIo=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", pctReady=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", wchanCategoryStats=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(", blockingWaitJavaStacks=");
        sbLIZ.append(this.LJIIJ);
        sbLIZ.append(", schedAvailable=");
        sbLIZ.append(this.LJIIJJI);
        sbLIZ.append(", schedMetricsQuality=");
        sbLIZ.append(this.LJIIL);
        sbLIZ.append(", errors=");
        sbLIZ.append(this.LJIILIIL);
        sbLIZ.append(']');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0WAV.class != obj.getClass()) {
            return false;
        }
        C0WAV c0wav = (C0WAV) obj;
        if (this.LIZ == c0wav.LIZ && Double.compare(c0wav.LIZIZ, this.LIZIZ) == 0 && Double.compare(c0wav.LIZJ, this.LIZJ) == 0 && Double.compare(c0wav.LIZLLL, this.LIZLLL) == 0 && Double.compare(c0wav.LJ, this.LJ) == 0 && Double.compare(c0wav.LJFF, this.LJFF) == 0 && Double.compare(c0wav.LJI, this.LJI) == 0 && Double.compare(c0wav.LJII, this.LJII) == 0 && Double.compare(c0wav.LJIIIIZZ, this.LJIIIIZZ) == 0 && this.LJIIJJI == c0wav.LJIIJJI && this.LJIIL == c0wav.LJIIL && Objects.equals(this.LJIIIZ, c0wav.LJIIIZ) && Objects.equals(this.LJIIJ, c0wav.LJIIJ) && Objects.equals(this.LJIILIIL, c0wav.LJIILIIL)) {
            return true;
        }
        return false;
    }

    public C0WAV(long j, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, Map<C0WAR, C0WAY> map, List<C0WAW> list, boolean z, C0WAX c0wax, List<String> list2) {
        this.LIZ = j;
        this.LIZIZ = d;
        this.LIZJ = d2;
        this.LIZLLL = d3;
        this.LJ = d4;
        this.LJFF = d5;
        this.LJI = d6;
        this.LJII = d7;
        this.LJIIIIZZ = d8;
        this.LJIIIZ = Collections.unmodifiableMap(new HashMap(map));
        ArrayList arrayList = new ArrayList(list.size());
        for (C0WAW c0waw : list) {
            Objects.requireNonNull(c0waw);
            arrayList.add(c0waw);
        }
        this.LJIIJ = Collections.unmodifiableList(arrayList);
        this.LJIIJJI = z;
        this.LJIIL = c0wax;
        ArrayList arrayList2 = (ArrayList) list2;
        ArrayList arrayList3 = new ArrayList(arrayList2.size());
        for (Object obj : arrayList2) {
            Objects.requireNonNull(obj);
            arrayList3.add(obj);
        }
        this.LJIILIIL = Collections.unmodifiableList(arrayList3);
    }
}
