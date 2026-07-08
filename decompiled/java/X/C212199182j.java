package X;

import com.ss.android.ugc.aweme.ecommercebase.promotion.data.PlacementLabel;
import java.util.List;

/* JADX INFO: renamed from: X.182j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C212199182j {
    public final String LIZ;
    public final List<PlacementLabel> LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public C212199182j(String str, boolean z, List list, int i) {
        int i2;
        list = (i & 2) != 0 ? null : list;
        if ((i & 8) != 0) {
            i2 = -1;
        } else {
            i2 = 0;
        }
        z = (i & 16) != 0 ? false : z;
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = i2;
        this.LIZLLL = z;
    }
}
