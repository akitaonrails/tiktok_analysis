package com.bytedance.android.live.wallet.base.subscribe;

import X.C09CT;
import webcast.api.sub.GiftSubEducation;
import webcast.api.sub.GiftSubInfoData;

/* JADX INFO: loaded from: classes.dex */
public final class SendSubscriptionPanelData {

    @C09CT("aml_limit_usd_micros")
    public long amlLimitUsdMicros;

    @C09CT("education_info")
    public GiftSubEducation educationInfo;

    @C09CT("info")
    public GiftSubInfoData info;

    @C09CT("random_panel_data")
    public RandomPanelData randomPanelData;

    @C09CT("specific_panel_data")
    public SpecificPanelData specificPanelData;
}
