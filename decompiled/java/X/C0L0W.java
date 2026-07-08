package X;

import com.ss.android.ugc.aweme.creative.model.music.AVMusic;
import java.util.List;

/* JADX INFO: renamed from: X.0L0W, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L0W {
    public final boolean LIZ;
    public final List<AVMusic> LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public C0L0W() {
        this(0L, false, null, false, 15);
    }

    public C0L0W(long j, boolean z, List list, boolean z2, int i) {
        z = (i & 1) != 0 ? false : z;
        list = (i & 2) != 0 ? null : list;
        j = (i & 4) != 0 ? 0L : j;
        z2 = (i & 8) != 0 ? false : z2;
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = j;
        this.LIZLLL = z2;
    }
}
