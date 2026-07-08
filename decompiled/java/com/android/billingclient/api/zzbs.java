package com.android.billingclient.api;

import X.C19885612rG;
import X.C19889112rp;
import X.C1BAX;
import X.C2200451BAd;
import X.C2200521BAk;
import X.C2200541BAm;
import X.EnumC2200651BAx;
import android.os.Bundle;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes35.dex */
public final class zzbs extends ResultReceiver {
    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i, Bundle bundle) {
        C1BAX c1baxZzb;
        C19889112rp c19889112rpLIZ = C19885612rG.LIZ();
        c19889112rpLIZ.LIZ = i;
        if (i != 0) {
            if (bundle != null) {
                c19889112rpLIZ.LIZJ = C2200451BAd.LJFF(bundle, "BillingClient");
                int i2 = bundle.getInt("INTERNAL_LOG_ERROR_REASON");
                if (i2 != 0) {
                    c1baxZzb = C1BAX.zzb(i2);
                } else {
                    c1baxZzb = C1BAX.BILLING_RESULT_RECEIVED_FROM_PHONESKY;
                }
                C19885612rG c19885612rGLIZ = c19889112rpLIZ.LIZ();
                String string = bundle.getString("INTERNAL_LOG_ERROR_ADDITIONAL_DETAILS");
                int i3 = C2200521BAk.LIZ;
                C2200521BAk.LIZIZ(c1baxZzb, 25, c19885612rGLIZ, string, EnumC2200651BAx.BROADCAST_ACTION_UNSPECIFIED);
                throw null;
            }
            C19885612rG c19885612rG = C2200541BAm.LIZ;
            throw null;
        }
        c19889112rpLIZ.LIZ();
        throw null;
    }
}
