package X;

import com.bytedance.android.livesdk.impl.revenue.strategy.bubble.TouchPointBubbleWidget;
import com.bytedance.android.livesdk.model.message.GiftGuideMessage;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.ugc.live.sdk.message.data.IMessage;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.01zN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class RunnableC513901zN implements Runnable {
    public final int $t;
    public Object l0;
    public Object l1;
    public Object l2;
    public boolean z3;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        if (this.z3) {
            TouchPointBubbleWidget touchPointBubbleWidget = (TouchPointBubbleWidget) this.l0;
            GiftGuideMessage giftGuideMessage = (GiftGuideMessage) ((IMessage) this.l1);
            touchPointBubbleWidget.getClass();
            TouchPointBubbleWidget.x1(giftGuideMessage);
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("async validation failed: ");
        sbLIZ.append(((C252600yK) ((AbstractC253300yR) this.l2)).LIZ);
        C20441214yg.LIZIZ("TouchPointBubbleWidget", C2188811AlT.LIZIZ(sbLIZ));
    }

    public final void LIZ$1() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        Long l = (Long) this.l0;
        boolean z = this.z3;
        Integer num = (Integer) this.l1;
        Integer num2 = (Integer) this.l2;
        jSONObject.put("duration", l);
        jSONObject.put("result", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        jSONObject.put("is_coldlaunch", num);
        jSONObject.put("is_first_feed_show", num2);
        C20684815ws.LJIJ("sidebar_load_time", jSONObject);
    }

    public static final void run$0(RunnableC513901zN runnableC513901zN) {
        boolean zLIZ;
        C1C7U.LIZ("TouchPointBubbleWidget@6cad.onMessage$1$1");
        try {
            runnableC513901zN.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TouchPointBubbleWidget@6cad.onMessage$1$1");
    }

    public static final void run$1(RunnableC513901zN runnableC513901zN) {
        boolean zLIZ;
        C1C7U.LIZ("SidebarTrackHelper@aa6a.sidebarLoadTime$1");
        try {
            runnableC513901zN.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SidebarTrackHelper@aa6a.sidebarLoadTime$1");
    }

    public RunnableC513901zN(Integer num, Integer num2, Long l, int i) {
        this.$t = i;
        this.l0 = l;
        this.z3 = true;
        this.l1 = num;
        this.l2 = num2;
    }

    public RunnableC513901zN(boolean z, TouchPointBubbleWidget touchPointBubbleWidget, IMessage iMessage, AbstractC253300yR abstractC253300yR, int i) {
        this.$t = i;
        this.z3 = z;
        this.l0 = touchPointBubbleWidget;
        this.l1 = iMessage;
        this.l2 = abstractC253300yR;
    }
}
