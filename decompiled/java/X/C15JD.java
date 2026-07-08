package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean;
import java.util.List;

/* JADX INFO: renamed from: X.15JD, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15JD {
    public final MusicWaveBean LIZ;
    public final List<MusicWaveBean> LIZIZ;
    public final MusicModel LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final boolean LJFF;
    public final String LJI;
    public final String LJII;
    public final List<String> LJIIIIZZ;
    public final int LJIIIZ;
    public final int LJIIJ;
    public boolean LJIIJJI;
    public final int LJIIL;

    public C15JD(MusicWaveBean musicWaveBean, List list, MusicModel musicModel, int i, int i2, String str, List list2, int i3, int i4, int i5, int i6) {
        this((i6 & 1) != 0 ? null : musicWaveBean, (i6 & 2) != 0 ? C13BV.INSTANCE : list, musicModel, i, i2, false, (i6 & 64) != 0 ? "" : null, (i6 & 128) == 0 ? str : "", (i6 & 256) != 0 ? C13BV.INSTANCE : list2, i3, (i6 & 1024) != 0 ? 0 : i4, false, (i6 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0 ? 0 : i5);
    }

    public C15JD(MusicWaveBean musicWaveBean, List<MusicWaveBean> list, MusicModel musicModel, int i, int i2, boolean z, String str, String str2, List<String> list2, int i3, int i4, boolean z2, int i5) {
        this.LIZ = musicWaveBean;
        this.LIZIZ = list;
        this.LIZJ = musicModel;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = z;
        this.LJI = str;
        this.LJII = str2;
        this.LJIIIIZZ = list2;
        this.LJIIIZ = i3;
        this.LJIIJ = i4;
        this.LJIIJJI = z2;
        this.LJIIL = i5;
    }
}
