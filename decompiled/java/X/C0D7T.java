package X;

import android.content.Context;
import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.checkout.model.CheckoutSession;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.checkout.CheckoutActivity;

/* JADX INFO: renamed from: X.0D7T, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D7T {
    public static void LIZ(Context context, CheckoutIntent checkoutIntent, CheckoutSession checkoutSession, C332710D2n c332710D2n, int i) {
        C0D7U c0d7u;
        if ((i & 4) != 0) {
            checkoutSession = null;
        }
        if ((i & 8) != 0) {
            c0d7u = C0D7U.FullPageModel;
        } else {
            c0d7u = null;
        }
        if ((i & 16) != 0) {
            c332710D2n = new C332710D2n(C0DHO.STANDARD, null, null, null);
        }
        Intent intent = new Intent(context, (Class<?>) CheckoutActivity.class);
        intent.putExtra("extra_checkout_intent", checkoutIntent);
        intent.putExtra("extra_initial_checkout_session", checkoutSession);
        intent.putExtra("extra_page_mode", c0d7u);
        intent.putExtra("ucp_entry_context", c332710D2n);
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrWLo3j6NAclw75HWpmBl25Q6aAgW6u1xBqR/wJXDhRLWam39AKB63B6Ltg==", null));
    }
}
