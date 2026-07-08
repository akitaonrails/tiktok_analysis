package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.LogisticLinkRichText;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03F6, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03F6 {
    public final List<LogisticDTO> LIZ;
    public final List<LogisticLinkRichText> LIZIZ;
    public final List<LogisticExpressionArea> LIZJ;

    public C03F6() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03F6)) {
            return false;
        }
        C03F6 c03f6 = (C03F6) obj;
        return Intrinsics.LJFF(this.LIZ, c03f6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03f6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c03f6.LIZJ);
    }

    public C03F6(List list, List list2, int i) {
        list2 = (i & 4) != 0 ? null : list2;
        this.LIZ = list;
        this.LIZIZ = null;
        this.LIZJ = list2;
    }
}
