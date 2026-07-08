package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PromotionLabel;
import java.util.List;

/* JADX INFO: renamed from: X.184c, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212244184c {
    public final List<PromotionLabel> LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;
    public final boolean LJ;

    public C212244184c(List list, long j, long j2, int i) {
        int i2;
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        boolean z = (i & 16) != 0;
        this.LIZ = list;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = i2;
        this.LJ = z;
    }
}
