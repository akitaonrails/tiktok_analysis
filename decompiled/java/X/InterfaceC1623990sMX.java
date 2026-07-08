package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.0sMX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public interface InterfaceC1623990sMX {
    String LIZ(MusicModel musicModel);

    void LIZIZ();

    void LIZLLL(String str);

    void LJ(String str, Context context, AVMusic aVMusic, int i, boolean z, InterfaceC1416880myU interfaceC1416880myU, boolean z2);

    boolean LJFF(AVMusic aVMusic, Context context);

    String LJI(AVMusic aVMusic);

    MusicModel LJII(AVMusic aVMusic);

    void LJIIIIZZ();

    String LJIIIZ(AVMusic aVMusic);

    String getCacheDir();

    String getDownloadDir();

    String getRhythmMusicFilePath(String str);

    void requestMusic(String str, InterfaceC1416890myV interfaceC1416890myV);

    AVMusic transformFromAVMusic(String str);

    AVMusic transformNewAVMusic(String str);
}
