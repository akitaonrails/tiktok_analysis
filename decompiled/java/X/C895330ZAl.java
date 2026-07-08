package X;

import com.ss.android.ugc.aweme.inbox.widget.multi.RedPoint;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0ZAl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C895330ZAl extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ int LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ long LLILZ;
    public final /* synthetic */ RedPoint LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C895330ZAl(String str, int i, String str2, long j, RedPoint redPoint, String str3) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = i;
        this.LLILLL = str2;
        this.LLILZ = j;
        this.LLILZIL = redPoint;
        this.LLILZLL = str3;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        String str;
        HashMap map = new HashMap();
        String str2 = this.LL;
        int i = this.LLILLJJLI;
        String str3 = this.LLILLL;
        long j = this.LLILZ;
        RedPoint redPoint = this.LLILZIL;
        String str4 = this.LLILZLL;
        map.put("EVENT_ORIGIN_FEATURE", "TEMAI");
        map.put("enter_from", "notification_page");
        map.put("action_type", str2);
        map.put("client_order", String.valueOf(i));
        map.put("message_type", str3);
        map.put("message_time", String.valueOf(j));
        int i2 = C895320ZAk.LIZ[redPoint.type.ordinal()];
        if (i2 == 1) {
            str = "yellow_dot";
        } else if (i2 == 2) {
            str = "number_dot";
        } else {
            if (i2 != 3) {
                throw new C1954807lC();
            }
            str = "report_null";
        }
        map.put("notice_type", str);
        map.put("show_cnt", String.valueOf(redPoint.type != EnumC895310ZAj.NONE ? redPoint.unreadCount : 0));
        String str5 = C0NBD.LIZ;
        if (str5 == null) {
            str5 = "";
        }
        map.put("inbox_session_id", str5);
        map.put("is_first_screen", String.valueOf(C1599780rjU.LIZ.LIZJ(str4)));
        C20684815ws.LJIILLIIL("inbox_shop_notice", map);
        return Unit.LIZ;
    }
}
