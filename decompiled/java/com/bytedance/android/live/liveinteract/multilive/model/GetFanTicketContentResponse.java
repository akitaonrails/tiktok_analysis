package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.LinkMicFanTicketMethod;

/* JADX INFO: loaded from: classes.dex */
public final class GetFanTicketContentResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("fan_ticket_method")
        public LinkMicFanTicketMethod fanTicketMethod;
    }
}
