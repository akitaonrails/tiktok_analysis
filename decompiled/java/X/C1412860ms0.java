package X;

import com.ss.android.ugc.effectmanager.effect.model.Asset;

/* JADX INFO: renamed from: X.0ms0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1412860ms0 {
    public final Asset LIZ;
    public final AbstractC1412880ms2 LIZIZ;
    public final C00GG LIZJ;
    public final long LIZLLL;
    public final String LJ;

    public static C1412860ms0 LIZ(C1412860ms0 c1412860ms0, AbstractC1412880ms2 abstractC1412880ms2) {
        Asset asset = c1412860ms0.LIZ;
        C00GG c00gg = c1412860ms0.LIZJ;
        long j = c1412860ms0.LIZLLL;
        String str = c1412860ms0.LJ;
        c1412860ms0.getClass();
        return new C1412860ms0(asset, abstractC1412880ms2, c00gg, j, str);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1412860ms0(Asset asset, AbstractC1412880ms2 abstractC1412880ms2, String str, int i) {
        C00GG c00gg;
        long jCurrentTimeMillis;
        AbstractC1412880ms2 abstractC1412880ms22 = (i & 2) != 0 ? null : abstractC1412880ms2;
        if ((i & 4) != 0) {
            c00gg = C00GG.NORMAL;
        } else {
            c00gg = null;
        }
        if ((i & 8) != 0) {
            jCurrentTimeMillis = System.currentTimeMillis();
        } else {
            jCurrentTimeMillis = 0;
        }
        this(asset, abstractC1412880ms22, c00gg, jCurrentTimeMillis, (i & 16) == 0 ? str : null);
    }

    public C1412860ms0(Asset asset, AbstractC1412880ms2 abstractC1412880ms2, C00GG c00gg, long j, String str) {
        this.LIZ = asset;
        this.LIZIZ = abstractC1412880ms2;
        this.LIZJ = c00gg;
        this.LIZLLL = j;
        this.LJ = str;
    }
}
