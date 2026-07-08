package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Jhp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499150Jhp extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ C507650JvX LL;
    public final /* synthetic */ C499090Jhj LLILLJJLI;
    public final /* synthetic */ C507140Jui LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C499150Jhp(C507650JvX c507650JvX, C499090Jhj c499090Jhj, C507140Jui c507140Jui) {
        super(2);
        this.LL = c507650JvX;
        this.LLILLJJLI = c499090Jhj;
        this.LLILLL = c507140Jui;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LL.LLILZIL;
        if (subscriptionPrivilegeDetailFragment != null) {
            String str2 = this.LLILLJJLI.LIZ;
            this.LLILLL.getClass();
            Map mapLJ = C2097608Jq.LJ();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_privilege_intro_item_show");
            subscriptionPrivilegeDetailFragment.qS(c474500IjALIZ);
            c474500IjALIZ.LJJII(str2, "privilege_page");
            c474500IjALIZ.LJJIIZI(mapLJ);
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }
}
