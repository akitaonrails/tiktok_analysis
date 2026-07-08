package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.serviceplus.industry.PcsIndustrySelectActivity;

/* JADX INFO: renamed from: X.0Jev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497350Jev {
    public static Intent LIZ(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4, int i) {
        boolean z5;
        if ((i & 8) != 0) {
            z5 = true;
        } else {
            z5 = false;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            z2 = false;
        }
        if ((i & 64) != 0) {
            z3 = false;
        }
        if ((i & 128) != 0) {
            z4 = false;
        }
        Intent intent = new Intent(context, (Class<?>) PcsIndustrySelectActivity.class);
        intent.putExtra("enter_from", str);
        intent.putExtra("verification_status", 0);
        intent.putExtra("can_reselect", z5);
        intent.putExtra("is_from_opt_in", z);
        intent.putExtra("guide_industry_verify", z2);
        intent.putExtra("guide_industry_status_check", z3);
        intent.putExtra("is_from_smb_management_redirect", z4);
        return intent;
    }
}
