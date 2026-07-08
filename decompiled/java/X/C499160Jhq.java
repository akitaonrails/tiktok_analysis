package X;

import android.view.View;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0Jhq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499160Jhq extends C09AY implements Function2<View, String, Unit> {
    public final /* synthetic */ C507580JvQ LL;
    public final /* synthetic */ AbstractC508030Jw9<C507580JvQ> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C499160Jhq(C507580JvQ c507580JvQ, AbstractC508030Jw9<C507580JvQ> abstractC508030Jw9) {
        super(2);
        this.LL = c507580JvQ;
        this.LLILLJJLI = abstractC508030Jw9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(View view, String str) {
        C507580JvQ c507580JvQ = this.LL;
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = c507580JvQ.LLILZIL;
        if (subscriptionPrivilegeDetailFragment != null) {
            String strLIZJ = c507580JvQ.LIZJ();
            Map<String, String> mapP5 = this.LLILLJJLI.P5(this.LL);
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_subscribe_privilege_intro_item_show");
            subscriptionPrivilegeDetailFragment.qS(c474500IjALIZ);
            c474500IjALIZ.LJJII(strLIZJ, "privilege_page");
            c474500IjALIZ.LJJIIZI(mapP5);
            c474500IjALIZ.LIZ();
        }
        return Unit.LIZ;
    }
}
