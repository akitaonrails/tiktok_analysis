package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import com.ss.android.ugc.aweme.feed.util.LivePreviewCTASmartDisplayManager;
import com.ss.android.ugc.aweme.shortvideo.model.MultiChoose;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0nxo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1454900nxo {
    public static final /* synthetic */ int LJIIJ = 0;
    public final boolean LIZ;
    public final String LIZIZ;
    public final AVMusic LIZJ;
    public final String LIZLLL;
    public final MultiChoose LJ;
    public final boolean LJFF;
    public final HashMap<String, String> LJI;
    public final long LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;

    static {
        new C1421090n5H();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1454900nxo(boolean z, String str, AVMusic aVMusic, String str2, boolean z2, long j, int i) {
        String str3;
        long j2 = j;
        boolean z3 = (i & 32) != 0 ? true : z2;
        j2 = (i & 128) != 0 ? -1L : j2;
        if ((i & 256) != 0) {
            str3 = LivePreviewCTASmartDisplayManager.DEFAULT;
        } else {
            str3 = null;
        }
        this(z, str, aVMusic, str2, null, z3, null, j2, str3, false);
    }

    public C1454900nxo(boolean z, String str, AVMusic aVMusic, String str2, MultiChoose multiChoose, boolean z2, HashMap<String, String> map, long j, String str3, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = aVMusic;
        this.LIZLLL = str2;
        this.LJ = multiChoose;
        this.LJFF = z2;
        this.LJI = map;
        this.LJII = j;
        this.LJIIIIZZ = str3;
        this.LJIIIZ = z3;
    }
}
