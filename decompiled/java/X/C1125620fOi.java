package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.gift.model.GiftPanelBeaconBubble;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fOi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125620fOi extends C09AY implements Function1<Long, Unit> {
    public final /* synthetic */ C1125580fOe LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1125640fOk LLILLL;
    public final /* synthetic */ GiftPanelBeaconBubble LLILZ;
    public final /* synthetic */ long LLILZIL;
    public final /* synthetic */ C1125670fOn LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1125620fOi(C1125580fOe c1125580fOe, long j, C1125640fOk c1125640fOk, GiftPanelBeaconBubble giftPanelBeaconBubble, long j2, C1125670fOn c1125670fOn) {
        super(1);
        this.LL = c1125580fOe;
        this.LLILLJJLI = j;
        this.LLILLL = c1125640fOk;
        this.LLILZ = giftPanelBeaconBubble;
        this.LLILZIL = j2;
        this.LLILZLL = c1125670fOn;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Long l) throws JSONException {
        long jLongValue = l.longValue();
        C1125580fOe c1125580fOe = this.LL;
        long j = this.LLILLJJLI;
        C1125640fOk c1125640fOk = this.LLILLL;
        GiftPanelBeaconBubble giftPanelBeaconBubble = this.LLILZ;
        if (j == c1125580fOe.LLJJJ && C1125580fOe.LJJJIL(c1125640fOk, giftPanelBeaconBubble)) {
            long j2 = this.LLILZIL;
            int i = this.LLILZLL.LIZLLL;
            long jUptimeMillis = SystemClock.uptimeMillis() - jLongValue;
            long jUptimeMillis2 = SystemClock.uptimeMillis() - this.LL.LLJJIII;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gift_id", j2);
            jSONObject.put("load_time", jUptimeMillis);
            jSONObject.put("load_duration", jUptimeMillis2);
            jSONObject.put("beacon_bubble_type", i);
            C1CC2.LJ("ttlive_sdk_panel_lynx_bubble_load_finished", new JSONObject(), jSONObject, new JSONObject());
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gift_panel_lynx_bubble_load_finished");
            c474500IjALIZ.LJJIIJZLJL(jSONObject);
            c474500IjALIZ.LIZ();
            this.LLILLL.setTag(this.LLILZ);
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ignore stale lynx bubble load success, giftId = ");
            sbLIZ.append(this.LLILZIL);
            C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }
}
