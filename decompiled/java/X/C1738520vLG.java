package X;

import com.ss.android.ugc.aweme.shortvideo.EffectDraftSubmissionListViewModel;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0vLG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1738520vLG {
    public final int LIZ;
    public final boolean LIZIZ;
    public final Pair<EffectDraftSubmissionListViewModel, Map<String, String>> LIZJ;

    public C1738520vLG(int i, Pair pair, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = pair;
    }

    public static C1738520vLG LIZ(C1738520vLG c1738520vLG, int i, boolean z, Pair pair, int i2) {
        if ((i2 & 1) != 0) {
            i = c1738520vLG.LIZ;
        }
        if ((i2 & 2) != 0) {
            z = c1738520vLG.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            pair = c1738520vLG.LIZJ;
        }
        c1738520vLG.getClass();
        return new C1738520vLG(i, pair, z);
    }
}
