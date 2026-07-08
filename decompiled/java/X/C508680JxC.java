package X;

import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.fragment.SubscriptionPrivilegeDetailFragment;
import com.bytedance.android.livesdk.comp.impl.subscription.business.foundation.privilegepage.viewmodel.PrivilegeDetailViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0JxC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C508680JxC extends C09AY implements Function1<C512060K6i, Unit> {
    public final /* synthetic */ SubscriptionPrivilegeDetailFragment LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C508680JxC(SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment) {
        super(1);
        this.LL = subscriptionPrivilegeDetailFragment;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(C512060K6i c512060K6i) {
        int i;
        C512060K6i c512060K6i2 = c512060K6i;
        C512220K6y c512220K6y = c512060K6i2.LIZJ;
        int i2 = 2;
        if (c512220K6y != null) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment = this.LL;
            subscriptionPrivilegeDetailFragment.LLILZ.invoke();
            if (c512220K6y.LIZLLL) {
                i = 2;
            } else {
                i = 1;
            }
            subscriptionPrivilegeDetailFragment.PR(Boolean.TRUE, Integer.valueOf(i));
            PrivilegeDetailViewModel privilegeDetailViewModelFS = subscriptionPrivilegeDetailFragment.FS();
            if (privilegeDetailViewModelFS != null) {
                privilegeDetailViewModelFS.LLJI.LIZ(privilegeDetailViewModelFS.LL, true, privilegeDetailViewModelFS.LLILLL, true, privilegeDetailViewModelFS.LLJZ, C2097608Jq.LJ(), privilegeDetailViewModelFS.LLILZ);
                privilegeDetailViewModelFS.DQ2(false, true);
            }
        }
        C0KAH c0kah = c512060K6i2.LJ;
        if (c0kah != null) {
            SubscriptionPrivilegeDetailFragment subscriptionPrivilegeDetailFragment2 = this.LL;
            subscriptionPrivilegeDetailFragment2.getClass();
            if (!c0kah.LIZLLL) {
                i2 = 1;
            }
            subscriptionPrivilegeDetailFragment2.PR(Boolean.TRUE, Integer.valueOf(i2));
            C16FZ c16fzES = subscriptionPrivilegeDetailFragment2.ES();
            if (c16fzES != null) {
                C786410Ut5.LLLIZZ(c16fzES, 0);
            }
            PrivilegeDetailViewModel privilegeDetailViewModelFS2 = subscriptionPrivilegeDetailFragment2.FS();
            if (privilegeDetailViewModelFS2 != null) {
                privilegeDetailViewModelFS2.LLJI.LIZ(privilegeDetailViewModelFS2.LL, true, privilegeDetailViewModelFS2.LLILLL, true, privilegeDetailViewModelFS2.LLJZ, C2097608Jq.LJ(), privilegeDetailViewModelFS2.LLILZ);
                privilegeDetailViewModelFS2.DQ2(false, true);
            }
            return Unit.LIZ;
        }
        return null;
    }
}
