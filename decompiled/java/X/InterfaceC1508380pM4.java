package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;

/* JADX INFO: renamed from: X.0pM4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1508380pM4 {
    void LIZ();

    void LIZIZ(Aweme aweme);

    void LIZJ(Aweme aweme);

    int LIZLLL();

    InterfaceC1484080ois LJ();

    void LJFF();

    void LJI(C583670Mur c583670Mur);

    @InterfaceC1294060jmO
    String LJII(Video video);

    void LJIIIIZZ(C583670Mur c583670Mur);

    @InterfaceC1294060jmO
    String LJIILIIL(Video video, OnUIPlayListener onUIPlayListener);

    void LJIILLIIL();

    void LJIJJ();

    @InterfaceC1294060jmO
    String LJIJJLI(Video video, int i);

    String LJJIFFI(C584150Mvd c584150Mvd, OnUIPlayListener onUIPlayListener);

    String LJJII(C584150Mvd c584150Mvd);

    void LJJIIJZLJL();

    void LJJIIZ();

    void LJJIIZI();

    void LJJIJ(OnUIPlayListener onUIPlayListener);

    void LJJIL(Surface surface);

    void LJJL();

    float getBitrate();

    long getCurrentPosition();

    long getDuration();

    int getLoopCount();

    C1471500oOa getVideoInfo();

    boolean isMute();

    boolean isPlaying();

    void release();

    void seek(float f);

    void setSurface(Surface surface);
}
