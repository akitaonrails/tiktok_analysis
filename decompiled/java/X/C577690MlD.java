package X;

import com.ss.android.ugc.aweme.music.model.MusicBeanUtilKt;
import com.ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContext;
import com.ss.android.ugc.aweme.shortvideo.beauty.BeautifySegmentInfo;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import com.ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0MlD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C577690MlD {
    public final C19EG LIZ;
    public final ShortVideoContext LIZIZ;
    public final boolean LIZJ;
    public final FaceStickerBean LIZLLL;
    public final BeautifySegmentInfo LJ;
    public final long LJFF;
    public final int LJI;
    public final List<AVChallenge> LJII = new ArrayList();
    public MusicModel LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public List<String> LJIIJJI;

    public final void LIZ() {
        MusicModel musicModelLJII = C0CHQ.LIZ().LJJJJL().LJII(MusicBeanUtilKt.extractAVMusic(this.LIZIZ.creativeModel.musicBuzModel));
        if (musicModelLJII == null || !C2286708xd.LIZJ(this.LIZIZ.getMusicPath())) {
            return;
        }
        String musicPath = this.LIZIZ.getMusicPath();
        boolean z = !this.LIZIZ.mIsPhotoMvModeMusic;
        this.LJIIIIZZ = musicModelLJII;
        this.LJIIIZ = musicPath;
        this.LJIIJ = z;
    }

    public C577690MlD(C19EG c19eg, ShortVideoContext shortVideoContext, boolean z, FaceStickerBean faceStickerBean, BeautifySegmentInfo beautifySegmentInfo, long j, int i) {
        this.LIZ = c19eg;
        this.LIZIZ = shortVideoContext;
        this.LIZJ = z;
        this.LIZLLL = faceStickerBean;
        this.LJ = beautifySegmentInfo;
        this.LJFF = j;
        this.LJI = i;
    }
}
