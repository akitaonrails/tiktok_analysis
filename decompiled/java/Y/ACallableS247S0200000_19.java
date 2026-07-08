package Y;

import X.C1255780ime;
import X.C19EG;
import X.C1C7U;
import com.ss.android.ugc.aweme.IForceBindingAccountService;
import com.ss.android.ugc.aweme.feed.model.FeedItemList;
import com.ss.android.ugc.aweme.inbox.v2.InboxFragmentV2;
import java.util.concurrent.Callable;
import kotlin.Unit;

/* JADX INFO: loaded from: classes20.dex */
public class ACallableS247S0200000_19 implements Callable {
    public final int $t;
    public Object l0;
    public Object l1;

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.$t) {
            case 0:
                return call$0(this);
            case 1:
                return call$1(this);
            default:
                return null;
        }
    }

    public static final Object call$0(ACallableS247S0200000_19 aCallableS247S0200000_19) {
        C1C7U.LIZ("InboxFragmentV2@d7b5.showEmailVerificationPopUp$1");
        C19EG activity = ((InboxFragmentV2) aCallableS247S0200000_19.l0).getActivity();
        if (activity != null) {
            IForceBindingAccountService iForceBindingAccountService = (IForceBindingAccountService) aCallableS247S0200000_19.l1;
            InboxFragmentV2 inboxFragmentV2 = (InboxFragmentV2) aCallableS247S0200000_19.l0;
            if (iForceBindingAccountService.shouldShow3PDialog(activity, "message", "3p_bind_inbox", null, true) && inboxFragmentV2.isVisible()) {
                iForceBindingAccountService.showDialogAsPopupTask(activity, "message", "3p_bind_inbox", null);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("InboxFragmentV2@d7b5.showEmailVerificationPopUp$1");
        return unit;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object call$1(ACallableS247S0200000_19 aCallableS247S0200000_19) {
        long j;
        C1255780ime c1255780ime = (C1255780ime) aCallableS247S0200000_19.l0;
        Object[] objArr = (Object[]) aCallableS247S0200000_19.l1;
        String str = c1255780ime.LLILLL;
        int i = c1255780ime.LL;
        T t = c1255780ime.mData;
        if (t == 0) {
            j = 0;
        } else {
            j = ((FeedItemList) t).maxCursor;
        }
        return c1255780ime.LJIJJLI(false, str, i, -1L, j, 0, (String) objArr[5], c1255780ime.LLJ, c1255780ime.LLJI, true, c1255780ime.LLJJIJI, null, 0, false, false);
    }

    public ACallableS247S0200000_19(Object obj, Object obj2, int i) {
        this.$t = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
