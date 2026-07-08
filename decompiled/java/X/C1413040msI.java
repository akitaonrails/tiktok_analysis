package X;

import com.bytedance.ies.nle.editor_jni.NLEModel;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;

/* JADX INFO: renamed from: X.0msI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1413040msI extends AbstractC1412880ms2 {
    public final NLEModel LIZIZ;
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
        return C1413080msM.LIZ(this.LIZJ);
    }

    public C1413040msI(NLEModel nLEModel, AVMusic aVMusic) {
        this.LIZIZ = nLEModel;
        this.LIZJ = aVMusic;
    }
}
