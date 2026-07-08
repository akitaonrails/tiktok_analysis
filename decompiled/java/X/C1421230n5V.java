package X;

import com.ss.android.ugc.aweme.shortvideo.model.ShortVideoCommonParams;

/* JADX INFO: renamed from: X.0n5V, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1421230n5V {
    public final boolean LIZ;
    public final C375830EoP<C1421200n5S> LIZIZ;
    public final AbstractC1409800mn4 LIZJ;
    public final ShortVideoCommonParams LIZLLL;

    public C1421230n5V() {
        this(0);
    }

    public /* synthetic */ C1421230n5V(int i) {
        this(true, new C375830EoP(new C1421200n5S(0)), new C1409780mn2(System.currentTimeMillis()), null);
    }

    public C1421230n5V(boolean z, C375830EoP<C1421200n5S> c375830EoP, AbstractC1409800mn4 abstractC1409800mn4, ShortVideoCommonParams shortVideoCommonParams) {
        this.LIZ = z;
        this.LIZIZ = c375830EoP;
        this.LIZJ = abstractC1409800mn4;
        this.LIZLLL = shortVideoCommonParams;
    }

    public static C1421230n5V LIZ(C1421230n5V c1421230n5V, boolean z, C375830EoP c375830EoP, AbstractC1409800mn4 abstractC1409800mn4, ShortVideoCommonParams shortVideoCommonParams, int i) {
        if ((i & 1) != 0) {
            z = c1421230n5V.LIZ;
        }
        if ((i & 2) != 0) {
            c375830EoP = c1421230n5V.LIZIZ;
        }
        if ((i & 4) != 0) {
            abstractC1409800mn4 = c1421230n5V.LIZJ;
        }
        if ((i & 8) != 0) {
            shortVideoCommonParams = c1421230n5V.LIZLLL;
        }
        c1421230n5V.getClass();
        return new C1421230n5V(z, c375830EoP, abstractC1409800mn4, shortVideoCommonParams);
    }
}
