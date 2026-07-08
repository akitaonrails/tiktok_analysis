package X;

import com.ss.android.ugc.aweme.feed.model.LogPbBean;
import com.ss.android.ugc.aweme.shortvideo.model.MusicModel;
import java.util.List;

/* JADX INFO: renamed from: X.154j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C204607154j {
    public final List<? extends MusicModel> LIZ;
    public long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final boolean LJ;
    public final boolean LJFF;
    public final String LJI;
    public final LogPbBean LJII;

    public C204607154j() {
        throw null;
    }

    public C204607154j(List list, long j, int i, int i2, boolean z, boolean z2, String str, LogPbBean logPbBean, int i3) {
        j = (i3 & 2) != 0 ? 0L : j;
        i = (i3 & 4) != 0 ? 0 : i;
        i2 = (i3 & 8) != 0 ? 0 : i2;
        z = (i3 & 16) != 0 ? false : z;
        z2 = (i3 & 32) != 0 ? false : z2;
        str = (i3 & 64) != 0 ? "" : str;
        logPbBean = (i3 & 256) != 0 ? null : logPbBean;
        this.LIZ = list;
        this.LIZIZ = j;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = z;
        this.LJFF = z2;
        this.LJI = str;
        this.LJII = logPbBean;
    }
}
