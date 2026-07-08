package X;

import com.ss.android.ugc.aweme.ecommerce.core.strategy.BizIdentity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.033P, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C033P {
    public static final /* synthetic */ int LIZ = 0;

    public static C03CR LIZ(BizIdentity bizIdentity, String str) {
        boolean zLJFF = Intrinsics.LJFF(bizIdentity.LIZJ, "us");
        if (Intrinsics.LJFF(str, "one_step_checkout")) {
            if (zLJFF) {
                return C03CR.US_COMBINED_SKU;
            }
            return C03CR.SEA_COMBINED_SKU;
        }
        if (zLJFF) {
            return C03CR.US_FULL_SCREEN;
        }
        return C03CR.SEA_FULL_SCREEN;
    }
}
