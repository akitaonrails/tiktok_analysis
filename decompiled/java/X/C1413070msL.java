package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.effectmanager.effect.model.Effect;

/* JADX INFO: renamed from: X.0msL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413070msL extends AbstractC1412880ms2 {
    public final Effect LIZIZ;
    public final AVMusic LIZJ;
    public AVMusic LIZLLL;

    @Override // X.AbstractC1412880ms2
    public final String LIZ() {
        AVMusic aVMusic = this.LIZJ;
        if (aVMusic != null) {
            return aVMusic.path;
        }
        return null;
    }

    @Override // X.AbstractC1412880ms2
    public final long LIZIZ() {
        return this.LIZIZ.getPackage_size() + C1413080msM.LIZ(this.LIZJ);
    }

    public C1413070msL(Effect effect, AVMusic aVMusic) {
        this.LIZIZ = effect;
        this.LIZJ = aVMusic;
    }
}
