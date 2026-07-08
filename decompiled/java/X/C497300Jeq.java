package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Jeq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C497300Jeq extends C09AY implements Function0<JSONObject> {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C497300Jeq(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        super(0);
        this.LL = subscriptionPrivilegeDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final JSONObject invoke() {
        try {
            return new JSONObject(C19748512Ol.LIZIZ.LJIILL(this.LL.LLILLJJLI));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }
}
