package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;

/* JADX INFO: renamed from: X.0msJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413050msJ extends AbstractC1412880ms2 {
    public final AVMusic LIZIZ;
    public final String LIZJ;

    @Override // X.AbstractC1412880ms2
    public final String LIZ() {
        return this.LIZIZ.path;
    }

    @Override // X.AbstractC1412880ms2
    public final long LIZIZ() {
        return C1413080msM.LIZ(this.LIZIZ);
    }

    public C1413050msJ(AVMusic aVMusic, String str) {
        this.LIZIZ = aVMusic;
        this.LIZJ = str;
    }
}
