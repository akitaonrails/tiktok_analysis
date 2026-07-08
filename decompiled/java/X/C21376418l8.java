package X;

import com.ss.android.ugc.aweme.ecommerce.richtext.dto.CustomColor;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18l8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21376418l8 {
    public final List<C21375618l0> LIZ;
    public final CustomColor LIZIZ;

    public C21376418l8() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21376418l8)) {
            return false;
        }
        C21376418l8 c21376418l8 = (C21376418l8) obj;
        return Intrinsics.LJFF(this.LIZ, c21376418l8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c21376418l8.LIZIZ);
    }

    public C21376418l8(List list) {
        this.LIZ = list;
        this.LIZIZ = null;
    }
}
