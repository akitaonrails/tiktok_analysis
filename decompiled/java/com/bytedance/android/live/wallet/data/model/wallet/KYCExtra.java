package com.bytedance.android.live.wallet.data.model.wallet;

import X.C09CT;
import X.C19748512Ol;
import X.C501470JlZ;
import com.bytedance.android.livesdk.model.Extra;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.s;

/* JADX INFO: loaded from: classes28.dex */
public class KYCExtra extends Extra {

    @C09CT("amount_limit")
    public String amountLimit;

    @C09CT("is_within_period")
    public boolean isWithinPeriod;

    @C09CT("user_type")
    public String userType = "";

    public String getAmountLimit() {
        return this.amountLimit;
    }

    public String getUserType() {
        return this.userType;
    }

    public boolean isWithinPeriod() {
        return this.isWithinPeriod;
    }

    public static KYCExtra getKYCExtra(Exception exc) {
        if (exc instanceof C501470JlZ) {
            try {
                return (KYCExtra) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, ((C501470JlZ) exc).getExtra(), KYCExtra.class);
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return null;
    }

    public void setUserType(String str) {
        this.userType = str;
    }
}
