package X;

import X.C510480K0g;
import android.view.View;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.subscription.pgc.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import java.util.Map;
import kotlin.jvm.internal.AwS443S0200000_7;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0K1I, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0K1I<ITEM extends C510480K0g> extends AbstractC339560DSw<ITEM> {
    public boolean LL;

    public C0K1I(View view) {
        super(view);
    }

    public Map<String, String> N5(ITEM item) {
        return C2097608Jq.LJ();
    }

    public final void P5(ITEM item) {
        String str;
        if (!this.LL && (!(this instanceof C0K1G))) {
            View view = this.itemView;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(item.LJJJ());
            sbLIZ.append('_');
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = item.LJ;
            if (subscriptionPrivilegeDetailFragment == null || (str = subscriptionPrivilegeDetailFragment.LLLFFI) == null) {
                str = "";
            }
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            AwS443S0200000_7 awS443S0200000_7 = new AwS443S0200000_7(item, this, (C0K1I<C0K1I<ITEM>>) 20);
            if (view != null) {
                if (a0.LJJJIL(strLIZIZ)) {
                    strLIZIZ = String.valueOf(view.hashCode());
                }
                HandlerHook.viewPost(view, new RunnableC170100l1(view, strLIZIZ, awS443S0200000_7));
            }
            this.LL = true;
        }
    }
}
