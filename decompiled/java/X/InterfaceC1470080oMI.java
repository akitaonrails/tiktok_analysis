package X;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import com.ss.ttm.player.s;

/* JADX INFO: renamed from: X.0oMI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1470080oMI {
    void LIZ(int i, String str);

    long LIZIZ(int i, long j);

    void LIZJ(int i, int i2);

    void LIZLLL(s sVar);

    void LJ(boolean z);

    boolean LJFF();

    int LJI(int i, int i2);

    void LJII();

    void LJIIIIZZ(Context context, Uri uri);

    String LJIIIZ(int i);

    long LJIIJ(int i, long j);

    void LJIILLIIL(float f, float f2);

    int getCurrentPosition();

    int getDuration();

    int getPlayerType();

    int getVideoHeight();

    int getVideoWidth();

    boolean isPlaying();

    void pause();

    void prepareAsync();

    void release();

    void reset();

    void seekTo(int i);

    void setLooping(boolean z);

    void setOnCompletionListener(InterfaceC1470900oNc interfaceC1470900oNc);

    void setOnErrorListener(InterfaceC1470910oNd interfaceC1470910oNd);

    void setOnInfoListener(InterfaceC1470920oNe interfaceC1470920oNe);

    void setOnPreparedListener(InterfaceC1470930oNf interfaceC1470930oNf);

    void setSurface(Surface surface);

    void start();

    void stop();
}
