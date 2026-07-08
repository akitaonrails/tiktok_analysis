package com.bytedance.android.live.wallet.data.model.exchange;

import X.C09CT;

/* JADX INFO: loaded from: classes18.dex */
public final class ExchangeUpdateAddressRequest {

    @C09CT("city")
    public String city;

    @C09CT("country_code")
    public String countryCode;

    @C09CT("county")
    public String county;

    @C09CT("state_code")
    public String stateCode;

    public ExchangeUpdateAddressRequest() {
        this(null, null, null, null);
    }

    public ExchangeUpdateAddressRequest(String str, String str2, String str3, String str4) {
        this.countryCode = str;
        this.stateCode = str2;
        this.county = str3;
        this.city = str4;
    }
}
