package com.bytedance.android.live.wallet.model.recharge;

import X.C09CT;
import X.C1802730x0p;
import com.bytedance.android.livesdk.wallet.Diamond;
import java.util.List;

/* JADX INFO: loaded from: classes28.dex */
public class RechargeRequestParams {
    public C1802730x0p LIZ;

    @C09CT("campaignType")
    public int campaignType;

    @C09CT("rechargeReason")
    public String chargeReason;

    @C09CT("chargeSource")
    public int chargeSource;

    @C09CT("diamond")
    public Diamond diamond;

    @C09CT("diamondCount")
    public int diamondCount;

    @C09CT("diamondId")
    public int diamondId;

    @C09CT("firstRecharge")
    public Boolean firstRecharge;

    @C09CT("givingCount")
    public String givingCount;

    @C09CT("iapId")
    public String iapId;

    @C09CT("penaltyWarningSkip")
    public String penaltyWarningSkip;

    @C09CT("requestPage")
    public String requestPage;

    @C09CT("subSource")
    public Integer subSource;

    @C09CT("vault_gift_id")
    public Integer vaultGiftId;

    @C09CT("voucherList")
    public List<String> voucherList;

    public final void LIZ(Diamond diamond) {
        this.diamondId = diamond.id;
        this.diamondCount = diamond.count;
        this.iapId = diamond.iapId;
        this.givingCount = String.valueOf(diamond.givingCount);
        this.diamond = diamond;
    }
}
