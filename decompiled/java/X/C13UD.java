package X;

import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.13UD, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13UD {
    public final int LIZ;
    public Pair<Integer, Long> LIZIZ;
    public Pair<Integer, Long> LIZJ;
    public Pair<Integer, Long> LIZLLL;
    public Pair<Integer, Long> LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public HashMap<String, Long> LJIIIIZZ;
    public HashMap<String, Long> LJIIIZ;
    public HashMap<String, Long> LJIIJ;
    public long LJIIJJI;
    public final long LJIIL;

    public final String toString() {
        return "CleanStorageReportData(cleanType=" + this.LIZ + ", removeUnusedData=" + this.LIZIZ + ", trimSizeData=" + this.LIZJ + ", removeDeadFilesData=" + this.LIZLLL + ", removeAllowListData=" + this.LJ + ", mainCacheSizeBefore=" + this.LJFF + ", mainCacheSizeAfter=" + this.LJI + ", customCacheTotalSizeAfter=" + this.LJII + ", customCacheSizeBefore=" + this.LJIIIIZZ + ", customCacheSizeAfter=" + this.LJIIIZ + ", customCacheCleanSize=" + this.LJIIJ + ", costTime=" + this.LJIIJJI + ')';
    }

    public final Pair<Integer, Long> LIZ() {
        return new Pair<>(Integer.valueOf(this.LIZIZ.getFirst().intValue() + this.LIZJ.getFirst().intValue() + this.LIZLLL.getFirst().intValue() + this.LJ.getFirst().intValue()), Long.valueOf(this.LIZIZ.getSecond().longValue() + this.LIZJ.getSecond().longValue() + this.LIZLLL.getSecond().longValue() + this.LJ.getSecond().longValue()));
    }

    public C13UD(int i) {
        Pair<Integer, Long> pair = new Pair<>(-1, -1L);
        Pair<Integer, Long> pair2 = new Pair<>(-1, -1L);
        Pair<Integer, Long> pair3 = new Pair<>(-1, -1L);
        Pair<Integer, Long> pair4 = new Pair<>(-1, -1L);
        HashMap<String, Long> map = new HashMap<>();
        HashMap<String, Long> map2 = new HashMap<>();
        HashMap<String, Long> map3 = new HashMap<>();
        this.LIZ = i;
        this.LIZIZ = pair;
        this.LIZJ = pair2;
        this.LIZLLL = pair3;
        this.LJ = pair4;
        this.LJFF = 0L;
        this.LJI = 0L;
        this.LJII = 0L;
        this.LJIIIIZZ = map;
        this.LJIIIZ = map2;
        this.LJIIJ = map3;
        this.LJIIJJI = 0L;
        this.LJIIL = System.currentTimeMillis();
    }
}
