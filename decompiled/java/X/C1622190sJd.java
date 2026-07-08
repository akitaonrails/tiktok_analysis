package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;

/* JADX INFO: renamed from: X.0sJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1622190sJd implements InterfaceC1416880myU {
    public final /* synthetic */ InterfaceC1622210sJf LIZ;
    public final /* synthetic */ C1623940sMS LIZIZ;
    public final /* synthetic */ AVMusic LIZJ;

    @Override // X.InterfaceC1416880myU
    public final void LIZJ(boolean z) {
    }

    @Override // X.InterfaceC1416880myU
    public final void onStart() {
    }

    @Override // X.InterfaceC1416880myU
    public final void onProgress(int i) {
        this.LIZIZ.LJIILLIIL("music", i);
    }

    @Override // X.InterfaceC1416880myU
    public final void LIZ(Integer num, String str) {
        this.LIZ.LIZJ();
    }

    @Override // X.InterfaceC1416880myU
    public final void LIZIZ(String str, MusicWaveBean musicWaveBean) {
        this.LIZ.LJI(this.LIZJ, str);
    }

    public C1622190sJd(InterfaceC1622210sJf interfaceC1622210sJf, C1623940sMS c1623940sMS, AVMusic aVMusic) {
        this.LIZ = interfaceC1622210sJf;
        this.LIZIZ = c1623940sMS;
        this.LIZJ = aVMusic;
    }
}
