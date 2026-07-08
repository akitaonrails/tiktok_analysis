package com.bytedance.android.live.gift;

import X.EnumC1120860fH2;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.ies.sdk.datachannel.Event;
import kotlin.Pair;

/* JADX INFO: loaded from: classes18.dex */
public final class RechargeBackpackBubbleEvent extends Event<RechargeBackpackBubbleEvent> {
    public final Integer giftId;
    public final Pair<String, EnumC1120860fH2> guideTypeTooltipTypePair;
    public final Text text;

    public final Integer getGiftId() {
        return this.giftId;
    }

    public final Pair<String, EnumC1120860fH2> getGuideTypeTooltipTypePair() {
        return this.guideTypeTooltipTypePair;
    }

    public final Text getText() {
        return this.text;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public RechargeBackpackBubbleEvent(Integer num, Text text, Pair<String, ? extends EnumC1120860fH2> pair) {
        this.giftId = num;
        this.text = text;
        this.guideTypeTooltipTypePair = pair;
    }
}
