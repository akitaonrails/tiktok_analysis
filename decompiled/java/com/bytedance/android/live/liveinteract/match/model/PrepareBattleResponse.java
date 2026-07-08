package com.bytedance.android.live.liveinteract.match.model;

import X.C09CT;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleABTestList;
import com.bytedance.android.livesdkapi.depend.model.live.match.GiftMode;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class PrepareBattleResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("abtest_setting")
        public Map<Long, BattleABTestList> abtestSetting;

        @C09CT("gift_event_desc")
        public Text giftEventDesc;

        @C09CT("gift_mode")
        public List<GiftMode> giftMode;

        @C09CT("punish_end_timestamp")
        public long punishEndTimestamp;

        @C09CT("punished_anchor")
        public long punishedAnchor;

        @C09CT("rule_guide_url")
        public String ruleGuideUrl = "";
    }
}
