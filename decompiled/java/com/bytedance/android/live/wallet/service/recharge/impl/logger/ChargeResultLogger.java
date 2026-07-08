package com.bytedance.android.live.wallet.service.recharge.impl.logger;

import X.C09CT;
import X.C1161920gLG;
import X.C19748512Ol;
import X.InterfaceC1796820wrI;
import com.bytedance.android.livesdkapi.host.IHostUser;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;

/* JADX INFO: loaded from: classes28.dex */
public final class ChargeResultLogger implements InterfaceC1796820wrI {
    public static final ChargeResultLogger LIZ = new ChargeResultLogger();

    public static final class ChargeFailEntity {

        @C09CT("detail_code")
        public final int detailCode;

        @C09CT("error_code")
        public final int errorCode;

        @C09CT("mapped_error_code")
        public final String mappedErrorCode;

        @C09CT("mapped_error_message")
        public final String mappedErrorMsg;

        @C09CT("error_message")
        public final String msg;

        @C09CT("order_id")
        public final String orderId;

        public ChargeFailEntity() {
            this(-1, -1, "", "-1", "", "");
        }

        public ChargeFailEntity(int i, int i2, String str, String str2, String str3, String str4) {
            this.errorCode = i;
            this.detailCode = i2;
            this.msg = str;
            this.mappedErrorCode = str2;
            this.mappedErrorMsg = str3;
            this.orderId = str4;
        }
    }

    @Override // X.InterfaceC1796820wrI
    public final void LIZIZ(String str) {
    }

    @Override // X.InterfaceC1796820wrI
    public final void LIZ(String str, int i, int i2, String str2, String str3, String str4, String str5) {
        String str6 = str2;
        String str7 = str;
        String str8 = "";
        if (str7 == null) {
            str7 = "";
        }
        if (str6 == null) {
            str6 = "-1";
        }
        if (str3 != null) {
            str8 = str3;
        }
        ((IHostUser) C1161920gLG.LIZJ(IHostUser.class)).event("recharge_fail", GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, new ChargeFailEntity(i, i2, str7, str6, str8, str4)));
    }
}
