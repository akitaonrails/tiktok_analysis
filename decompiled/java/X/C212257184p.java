package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.List;

/* JADX INFO: renamed from: X.184p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212257184p {
    public final List<PromotionLabel> LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;
    public final int LJ;
    public final boolean LJFF;

    public C212257184p(List list, long j, long j2, boolean z, int i) {
        int i2;
        z = (i & 16) != 0 ? false : z;
        if ((i & 32) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        boolean z2 = (i & 64) != 0;
        this.LIZ = list;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = z;
        this.LJ = i2;
        this.LJFF = z2;
    }
}
