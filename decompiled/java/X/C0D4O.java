package X;

import android.content.Intent;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.ss.android.ugc.aweme.commercialize.ucp.api.model.CheckoutIntent;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.pages.thankyou.ThankYouActivity;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0D4O, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D4O {
    public static void LIZ(C19EG c19eg, CheckoutIntent checkoutIntent, C332710D2n c332710D2n, String str) {
        Intent intent = new Intent(c19eg, (Class<?>) ThankYouActivity.class);
        intent.putExtra("extra_checkout_intent", checkoutIntent);
        intent.putExtra("ucp_entry_context", c332710D2n);
        if (str != null && (!a0.LJJJIL(str))) {
            intent.putExtra("extra_ucp_playback_session_id", str);
        }
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(c19eg, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, c19eg);
        C2204961BRm.LJJJJJL(c19eg, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KOmnbpLLzjHP2aI3/COMrWLo3j6NAclw75HWpmBl25Q6fwgS5+1nHL+gpp9XkhdQfQN3EAX2/s1uAA==", null));
    }
}
