package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.ordersv2.OrdersV2OrderDetailsActivity;

/* JADX INFO: renamed from: X.0D4s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333280D4s {
    public static void LIZ(Context context, LocalOrderWrapper localOrderWrapper, C0D55 c0d55) {
        Intent intent = new Intent(context, (Class<?>) OrdersV2OrderDetailsActivity.class);
        intent.putExtra("extra_orders_v2_wrapper", localOrderWrapper);
        intent.putExtra("extra_entry_source", c0d55.name());
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrWLo3j6NAclw75HWpmBl25Q6ZBIX7PRtBavXwIer2x+g2x4zmwNJOIDFgYu6OEq99oXKxrO07A==", null));
    }
}
