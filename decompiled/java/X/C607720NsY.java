package X;

import com.ss.android.ugc.aweme.follow.presenter.FollowFeed;
import java.util.List;

/* JADX INFO: renamed from: X.0NsY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C607720NsY {
    public final List<FollowFeed> LIZ;
    public final C607740Nsa LIZIZ;
    public final boolean LIZJ;
    public final int LIZLLL;

    /* JADX WARN: Multi-variable type inference failed */
    public C607720NsY() {
        this(null, 0 == true ? 1 : 0, false, 0 == true ? 1 : 0, 15);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C607720NsY(List<? extends FollowFeed> list, C607740Nsa c607740Nsa, boolean z, int i) {
        this.LIZ = list;
        this.LIZIZ = c607740Nsa;
        this.LIZJ = z;
        this.LIZLLL = i;
    }

    public /* synthetic */ C607720NsY(List list, C607740Nsa c607740Nsa, boolean z, int i, int i2) {
        this((i2 & 1) != 0 ? null : list, (i2 & 2) != 0 ? new C607740Nsa(0) : c607740Nsa, (i2 & 4) != 0 ? true : z, (i2 & 8) != 0 ? 0 : i);
    }

    public static C607720NsY LIZ(C607720NsY c607720NsY, List list, C607740Nsa c607740Nsa, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            list = c607720NsY.LIZ;
        }
        if ((i2 & 2) != 0) {
            c607740Nsa = c607720NsY.LIZIZ;
        }
        if ((i2 & 4) != 0) {
            z = c607720NsY.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i = c607720NsY.LIZLLL;
        }
        c607720NsY.getClass();
        return new C607720NsY(list, c607740Nsa, z, i);
    }
}
