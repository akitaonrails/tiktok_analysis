package com.bytedance.android.live.wallet.model;

import X.C09CT;
import com.bytedance.android.live.base.model.user.SubscribeBadge;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: loaded from: classes8.dex */
public class CheckSubOrderResultStruct {
    public String orderID = "";
    public int retryCount;

    @C09CT(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS)
    public int status;

    @C09CT("sub_info")
    public SubChargeInfo subChargeInfo;

    @C09CT("toast")
    public String toast;

    public class SubChargeInfo {

        @C09CT("sub_level")
        public SubLevel subLevel;

        public SubChargeInfo(CheckSubOrderResultStruct checkSubOrderResultStruct) {
        }
    }

    public class SubLevel {

        @C09CT("badge")
        public SubscribeBadge subscribeBadge;

        public SubLevel(CheckSubOrderResultStruct checkSubOrderResultStruct) {
        }
    }
}
