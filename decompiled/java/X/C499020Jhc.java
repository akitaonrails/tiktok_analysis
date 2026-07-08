package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Jhc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C499020Jhc extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C507650JvX LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C499020Jhc(C507650JvX c507650JvX, String str) {
        super(0);
        this.LL = c507650JvX;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment;
        C507650JvX c507650JvX = this.LL;
        if (c507650JvX != null && (subscriptionPrivilegeDetailFragment = c507650JvX.LLILZIL) != null) {
            subscriptionPrivilegeDetailFragment.hS(this.LLILLJJLI, C2097908Jt.LIZJ(new Pair("is_perks_rare", "1")));
        }
        return Unit.LIZ;
    }
}
