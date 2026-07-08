package com.bytedance.android.live.wallet.base.subscribe;

import X.C09CT;

/* JADX INFO: loaded from: classes8.dex */
public final class CreateContractResponse {

    @C09CT("data")
    public CreateContractResult data;

    @C09CT("extra")
    public ResponseExtra extra;

    public static final class ResponseExtra {

        @C09CT("now")
        public long now;
    }
}
