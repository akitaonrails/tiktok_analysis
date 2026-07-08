package X;

import android.os.SystemClock;
import com.bytedance.android.livesdk.gift.model.GiftPanelBeaconBubble;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0fOh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1125610fOh extends C09AY implements InterfaceC1631620sYq<Long, Integer, String, Unit> {
    public final /* synthetic */ C1125580fOe LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ C1125640fOk LLILLL;
    public final /* synthetic */ GiftPanelBeaconBubble LLILZ;
    public final /* synthetic */ long LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1125610fOh(C1125580fOe c1125580fOe, long j, C1125640fOk c1125640fOk, GiftPanelBeaconBubble giftPanelBeaconBubble, long j2) {
        super(3);
        this.LL = c1125580fOe;
        this.LLILLJJLI = j;
        this.LLILLL = c1125640fOk;
        this.LLILZ = giftPanelBeaconBubble;
        this.LLILZIL = j2;
    }

    @Override // X.InterfaceC1631620sYq
    public final Unit invoke(Long l, Integer num, String str) throws JSONException {
        long jLongValue = l.longValue();
        Integer num2 = num;
        C1125580fOe c1125580fOe = this.LL;
        long j = this.LLILLJJLI;
        C1125640fOk c1125640fOk = this.LLILLL;
        GiftPanelBeaconBubble giftPanelBeaconBubble = this.LLILZ;
        if (j == c1125580fOe.LLJJJ && C1125580fOe.LJJJIL(c1125640fOk, giftPanelBeaconBubble)) {
            this.LLILLL.setTag(null);
            this.LL.LJJJJLL(null, "lynxViewLoadFailed");
            long j2 = this.LLILZIL;
            long jUptimeMillis = SystemClock.uptimeMillis() - jLongValue;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gift_id", j2);
            jSONObject.put("load_time", jUptimeMillis);
            if (num2 != null) {
                jSONObject.put("error_code", num2.intValue());
            }
            if (str != null) {
                jSONObject.put("error_message", str);
            }
            C1CC2.LJ("ttlive_sdk_panel_lynx_bubble_load_error", new JSONObject(), jSONObject, new JSONObject());
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ignore stale lynx bubble load failed, giftId = ");
            sbLIZ.append(this.LLILZIL);
            sbLIZ.append(" errorCode = ");
            sbLIZ.append(num2);
            C20441214yg.LIZIZ("GiftBeaconBubbleLeaf", C2188811AlT.LIZIZ(sbLIZ));
        }
        return Unit.LIZ;
    }
}
