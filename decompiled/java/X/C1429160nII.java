package X;

import android.content.Context;
import com.ss.android.ugc.aweme.creative.model.music.AVMusic;

/* JADX INFO: renamed from: X.0nII, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1429160nII {
    public final Context LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public AVMusic LIZLLL;
    public Boolean LJ;
    public String LJFF = null;
    public boolean LJI = false;
    public Integer LJII = null;
    public String LJIIIIZZ = null;
    public Exception LJIIIZ = null;
    public int LJIIJ = 0;
    public final C1418100n0S LJIIJJI;

    public final String toString() {
        return "MusicInfo(context=" + this.LIZ + ", musicId=" + this.LIZIZ + ", musicUrl=" + this.LIZJ + ", avMusic=" + this.LIZLLL + ", musicPostUnavailable=" + this.LJ + ", musicPath=" + this.LJFF + ", useCache=" + this.LJI + ", errCode=" + this.LJII + ", errMsg=" + this.LJIIIIZZ + ", exception=" + this.LJIIIZ + ", progress=" + this.LJIIJ + ", mobParams=" + this.LJIIJJI + ')';
    }

    public C1429160nII(Context context, String str, String str2, AVMusic aVMusic, Boolean bool, C1418100n0S c1418100n0S) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = str2;
        this.LIZLLL = aVMusic;
        this.LJ = bool;
        this.LJIIJJI = c1418100n0S;
    }
}
