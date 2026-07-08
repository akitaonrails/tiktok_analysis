package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;

/* JADX INFO: loaded from: classes16.dex */
public final class GetMultiGuestBonusResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("multi_guest_bonus_value")
        public long multiGuestBonusValue;

        @C09CT("multi_guest_bonus_value_string")
        public String multiGuestBonusValueString = "";
    }
}
