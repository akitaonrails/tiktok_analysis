package X;

import com.ss.android.ugc.aweme.ecommerce.arch.EComSearchBffResp;
import com.ss.android.ugc.aweme.ecommerce.arch.LogPbBean;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.05hW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1422405hW {
    public final EComSearchBffResp LIZ;
    public final List<? extends AbstractC677840QiM> LIZIZ;
    public final List<C1397705dX> LIZJ;
    public final int LIZLLL;
    public final long LJ;
    public final int LJFF;
    public final C675270QeD LJI;
    public final LogPbBean LJII;

    /* JADX WARN: Illegal instructions before constructor call */
    public C1422405hW() {
        C13BV c13bv = null;
        this(c13bv, c13bv, 255);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1422405hW(C13BV c13bv, C13BV c13bv2, int i) {
        int i2;
        long j;
        List arrayList = c13bv2;
        List arrayList2 = (i & 2) != 0 ? new ArrayList() : c13bv;
        arrayList = (i & 4) != 0 ? new ArrayList() : arrayList;
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        if ((i & 16) != 0) {
            j = -1;
        } else {
            j = 0;
        }
        this(null, arrayList2, arrayList, i2, j, 0, null, null);
    }

    public C1422405hW(EComSearchBffResp eComSearchBffResp, List<? extends AbstractC677840QiM> list, List<C1397705dX> list2, int i, long j, int i2, C675270QeD c675270QeD, LogPbBean logPbBean) {
        this.LIZ = eComSearchBffResp;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = i;
        this.LJ = j;
        this.LJFF = i2;
        this.LJI = c675270QeD;
        this.LJII = logPbBean;
    }
}
