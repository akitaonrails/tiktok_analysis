package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03aZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C869703aZ {
    public static final boolean LIZ(InstallmentPlan installmentPlan, InstallmentPlan installmentPlan2) {
        if (installmentPlan == null && installmentPlan2 == null) {
            return true;
        }
        if (installmentPlan != null && installmentPlan2 != null && Intrinsics.LJFF(installmentPlan.tenure, installmentPlan2.tenure) && Intrinsics.LJFF(installmentPlan.installmentOptionId, installmentPlan2.installmentOptionId)) {
            return true;
        }
        return false;
    }
}
