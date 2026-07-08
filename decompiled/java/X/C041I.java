package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SinglePriceItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.041I, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C041I {
    public final String LIZ;
    public final SinglePriceItem LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C041I)) {
            return false;
        }
        C041I c041i = (C041I) obj;
        return Intrinsics.LJFF(this.LIZ, c041i.LIZ) && Intrinsics.LJFF(this.LIZIZ, c041i.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c041i.LIZJ);
    }

    public C041I(String str, SinglePriceItem singlePriceItem, String str2) {
        this.LIZ = str;
        this.LIZIZ = singlePriceItem;
        this.LIZJ = str2;
    }
}
