package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* JADX INFO: renamed from: X.0OpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631100OpA {
    public List<? extends MusicModel> LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;
    public final String LJ;
    public final LogPbBean LJFF;

    public C631100OpA() {
        throw null;
    }

    public C631100OpA(List list, int i, int i2, boolean z, String str, LogPbBean logPbBean, int i3) {
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        z = (i3 & 16) != 0 ? false : z;
        str = (i3 & 32) != 0 ? "" : str;
        logPbBean = (i3 & 128) != 0 ? null : logPbBean;
        this.LIZ = list;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = z;
        this.LJ = str;
        this.LJFF = logPbBean;
    }
}
