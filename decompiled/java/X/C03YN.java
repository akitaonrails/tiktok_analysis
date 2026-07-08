package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.module.extrafee.ExtraFeeStatement;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03YN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03YN {
    public final ExtraFeeStatement LIZ;

    public C03YN() {
        this((ExtraFeeStatement) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C03YN) && Intrinsics.LJFF(this.LIZ, ((C03YN) obj).LIZ);
    }

    public C03YN(ExtraFeeStatement extraFeeStatement) {
        this.LIZ = extraFeeStatement;
    }

    public /* synthetic */ C03YN(int i) {
        this((ExtraFeeStatement) null);
    }
}
