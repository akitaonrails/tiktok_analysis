package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import kotlin.Pair;

/* JADX INFO: renamed from: X.11Ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19456911Ah {
    public final /* synthetic */ C259800zU<Pair<Integer, Integer>> LIZ;
    public final /* synthetic */ InterfaceC20500415Jq LIZIZ;
    public final /* synthetic */ AVMusic LIZJ;

    public final void LIZ() {
        this.LIZIZ.pause();
    }

    public final void LIZJ() {
        if (this.LIZIZ.isPlaying()) {
            return;
        }
        LIZIZ(this.LIZ.element.getFirst().intValue(), this.LIZ.element.getSecond().intValue());
    }

    public final void LJ() {
        this.LIZIZ.stop();
        this.LIZIZ.Of(null);
    }

    public final void LIZLLL(final C11AQ c11aq) {
        this.LIZIZ.Of(new InterfaceC1485080okU() { // from class: X.0olc
            @Override // X.InterfaceC1485080okU
            public final void LIZ(float f, int i) {
                c11aq.invoke(Integer.valueOf(i), Float.valueOf(f));
            }
        });
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T, kotlin.Pair] */
    public final void LIZIZ(int i, int i2) {
        this.LIZ.element = new Pair(Integer.valueOf(i), Integer.valueOf(i2));
        InterfaceC20500415Jq interfaceC20500415Jq = this.LIZIZ;
        MusicModel musicModelLIZ = C389120FNm.LIZ(this.LIZJ);
        musicModelLIZ.playRepeatFromEndTime = true;
        interfaceC20500415Jq.Zf(musicModelLIZ, 19, false, i, i2);
    }

    public C19456911Ah(C259800zU<Pair<Integer, Integer>> c259800zU, InterfaceC20500415Jq interfaceC20500415Jq, AVMusic aVMusic) {
        this.LIZ = c259800zU;
        this.LIZIZ = interfaceC20500415Jq;
        this.LIZJ = aVMusic;
    }
}
