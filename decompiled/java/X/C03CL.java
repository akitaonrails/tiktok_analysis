package X;

import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPromotion;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03CL, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03CL {
    public final LogisticPromotion LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C03CL)) {
            return false;
        }
        C03CL c03cl = (C03CL) obj;
        return Intrinsics.LJFF(this.LIZ, c03cl.LIZ) && Intrinsics.LJFF(this.LIZIZ, c03cl.LIZIZ);
    }

    public C03CL(LogisticPromotion logisticPromotion, String str) {
        this.LIZ = logisticPromotion;
        this.LIZIZ = str;
    }
}
