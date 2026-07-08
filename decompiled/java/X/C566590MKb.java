package X;

import com.ss.android.ugc.aweme.creative.model.music.MusicBuzCompatModel;
import com.ss.android.ugc.aweme.creative.model.music.MusicBuzModel;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;

/* JADX INFO: renamed from: X.0MKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C566590MKb {
    public boolean LIZ;
    public final MusicBuzModel LIZIZ;
    public boolean LIZJ;

    public C566590MKb() {
        this(3, null);
    }

    public final boolean LIZ() {
        return (this.LIZJ || C0MRM.LIZ(this.LIZIZ)) ? false : true;
    }

    public C566590MKb(int i, MusicBuzModel musicBuzModel) {
        boolean z;
        MusicBuzModel musicBuzModel2 = musicBuzModel;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        musicBuzModel2 = (i & 2) != 0 ? new MusicBuzModel(false, null, null, null, 1.0f, false, null, null, false, null, null, 0, MusicModel.FromSection.OTHER.ordinal(), false, false, 0L, 0, null, null, null, 0, 0, false, null, null, 0, 0, null, null, null, false, null, null, false, false, null, null, null, false, null, false, false, false, Boolean.FALSE, false, null, 0, null, 0, 0, 0, null, null, null, false, false, 0, 0, 0, Boolean.FALSE, 0, 0, null, "", null, false, null, null, null, 0L, false, false, "", null, null, false, 0.0f, "", 0, null, null, null, null, null, null, 0, false, false, null, null, null, null, null, null, null, 0, false, false, false, null, null, true, false, 0, 0, 0, 0, new MusicBuzCompatModel(null, null)) : musicBuzModel2;
        this.LIZ = z;
        this.LIZIZ = musicBuzModel2;
    }
}
